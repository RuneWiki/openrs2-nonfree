import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.hl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class62_Sub1 extends Class62 implements Interface4 {

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
	private final int anInt2189;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
	private final int anInt2191;

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
	private final int anInt2190;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!kaa;Lclient!fca;III[B)V")
	public Class62_Sub1(@OriginalArg(0) Class44_Sub2_Sub2 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static53.aClass42_4, false, arg4 * arg2 * arg3);
		this.anInt2189 = arg4;
		this.anInt2191 = arg2;
		this.anInt2190 = arg3;
		this.anIDirect3DVolumeTexture1 = this.aClass44_Sub2_Sub2_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static259.method4385(arg1, this.aClass42_19), 1);
		@Pc(40) PixelBuffer local40 = this.aClass44_Sub2_Sub2_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (hl.a((byte) -46, local53)) {
			@Pc(65) int local65 = this.aClass97_53.anInt2836 * this.anInt2191;
			@Pc(70) int local70 = local65 * this.anInt2190;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, this.anInt2189 * this.anInt2190 * local65);
			} else {
				@Pc(83) int local83 = local40.getRowPitch();
				@Pc(92) int local92;
				if (local83 == local65) {
					for (local92 = 0; local92 < this.anInt2189; local92++) {
						local40.a(arg5, local92 * local70, local73 * local92, local70);
					}
				} else {
					for (local92 = 0; local92 < this.anInt2189; local92++) {
						for (@Pc(102) int local102 = 0; local102 < this.anInt2190; local102++) {
							local40.a(arg5, local92 * local70 + local65 * local102, local83 * local102 + local92 * local73, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8082() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!fw;)V")
	@Override
	public void method8268(@OriginalArg(1) Class110 arg0) {
		super.method8268(arg0);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
	@Override
	public void method8267() {
		this.aClass44_Sub2_Sub2_9.method4376(this);
	}
}
