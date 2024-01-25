import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.vq;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public final class Class48_Sub2 extends Class48 implements Interface12 {

	@OriginalMember(owner = "client!lea", name = "i", descriptor = "I")
	private final int anInt5944;

	@OriginalMember(owner = "client!lea", name = "g", descriptor = "I")
	private final int anInt5942;

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "I")
	private final int anInt5943;

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lclient!ad;Lclient!kca;III[B)V")
	public Class48_Sub2(@OriginalArg(0) Class5_Sub1_Sub1 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static637.aClass376_16, false, arg2 * arg3 * arg4);
		this.anInt5944 = arg4;
		this.anInt5942 = arg3;
		this.anInt5943 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass5_Sub1_Sub1_8.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static6.method647(arg1, this.aClass376_10), 1);
		@Pc(40) PixelBuffer local40 = this.aClass5_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (vq.b(-2005530516, local53)) {
			@Pc(65) int local65 = this.anInt5943 * this.aClass182_15.anInt5127;
			@Pc(70) int local70 = this.anInt5942 * local65;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, this.anInt5944 * this.anInt5942 * local65);
			} else {
				@Pc(96) int local96 = local40.getRowPitch();
				@Pc(105) int local105;
				if (local65 == local96) {
					for (local105 = 0; local105 < this.anInt5944; local105++) {
						local40.a(arg5, local70 * local105, local73 * local105, local70);
					}
				} else {
					for (local105 = 0; local105 < this.anInt5944; local105++) {
						for (@Pc(115) int local115 = 0; local115 < this.anInt5942; local115++) {
							local40.a(arg5, local115 * local65 + local70 * local105, local96 * local115 + local73 * local105, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7473() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZLclient!ui;)V")
	@Override
	public void method7472(@OriginalArg(1) Class339 arg0) {
		super.method7472(arg0);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)V")
	@Override
	public void method7474() {
		this.aClass5_Sub1_Sub1_8.method655(this);
	}
}
