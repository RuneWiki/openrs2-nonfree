import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.rl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class20_Sub1 extends Class20 implements Interface9 {

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
	private final int anInt611;

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
	private final int anInt612;

	@OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
	private final int anInt613;

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!hg;Lclient!fda;III[B)V")
	public Class20_Sub1(@OriginalArg(0) Class43_Sub1_Sub1 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static461.aClass292_14, false, arg3 * arg2 * arg4);
		this.anInt611 = arg4;
		this.anInt612 = arg2;
		this.anInt613 = arg3;
		this.anIDirect3DVolumeTexture1 = this.aClass43_Sub1_Sub1_6.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static195.method3533(arg1, this.aClass292_7), 1);
		@Pc(40) PixelBuffer local40 = this.aClass43_Sub1_Sub1_6.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (rl.a(local53, (int) 3102)) {
			@Pc(65) int local65 = this.aClass93_7.anInt2936 * this.anInt612;
			@Pc(70) int local70 = this.anInt613 * local65;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, local65 * this.anInt613 * this.anInt611);
			} else {
				@Pc(96) int local96 = local40.getRowPitch();
				@Pc(105) int local105;
				if (local65 == local96) {
					for (local105 = 0; local105 < this.anInt611; local105++) {
						local40.a(arg5, local70 * local105, local73 * local105, local70);
					}
				} else {
					for (local105 = 0; local105 < this.anInt611; local105++) {
						for (@Pc(134) int local134 = 0; local134 < this.anInt613; local134++) {
							local40.a(arg5, local70 * local105 + local65 * local134, local105 * local73 - -(local96 * local134), local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method3898() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "(I)V")
	@Override
	public void method7423() {
		this.aClass43_Sub1_Sub1_6.method3536(this);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZLclient!gw;)V")
	@Override
	public void method7422(@OriginalArg(1) Class123 arg0) {
		super.method7422(arg0);
	}
}
