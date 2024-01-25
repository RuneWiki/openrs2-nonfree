import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.vba;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class57_Sub2 extends Class57 implements Interface11 {

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	private final int anInt2138;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	private final int anInt2139;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
	private final int anInt2140;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!vg;Lclient!kf;III[B)V")
	public Class57_Sub2(@OriginalArg(0) Class90_Sub3_Sub2 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static407.aClass254_14, false, arg4 * arg2 * arg3);
		this.anInt2138 = arg3;
		this.anInt2139 = arg2;
		this.anInt2140 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass90_Sub3_Sub2_6.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static549.method7672(this.aClass254_10, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass90_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (vba.a(-1, (int) local53)) {
			@Pc(65) int local65 = this.anInt2139 * this.aClass171_13.anInt4736;
			@Pc(70) int local70 = this.anInt2138 * local65;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, this.anInt2140 * local65 * this.anInt2138);
			} else {
				@Pc(79) int local79 = local40.getRowPitch();
				@Pc(88) int local88;
				if (local65 == local79) {
					for (local88 = 0; local88 < this.anInt2140; local88++) {
						local40.a(arg5, local88 * local70, local88 * local73, local70);
					}
				} else {
					for (local88 = 0; local88 < this.anInt2140; local88++) {
						for (@Pc(94) int local94 = 0; local94 < this.anInt2138; local94++) {
							local40.a(arg5, local94 * local65 + local70 * local88, local94 * local79 + local73 * local88, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
	@Override
	public void method7033() {
		this.aClass90_Sub3_Sub2_6.method7673(this);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5363() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!qaa;)V")
	@Override
	public void method7034(@OriginalArg(1) Class257 arg0) {
		super.method7034(arg0);
	}
}
