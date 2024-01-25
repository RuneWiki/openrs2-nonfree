import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.ica;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class30_Sub3 extends Class30 implements Interface11 {

	@OriginalMember(owner = "client!te", name = "h", descriptor = "I")
	private final int anInt8351;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "I")
	private final int anInt8349;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "I")
	private final int anInt8350;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!tga;Lclient!nh;III[B)V")
	public Class30_Sub3(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static239.aClass161_12, false, arg3 * arg2 * arg4);
		this.anInt8351 = arg4;
		this.anInt8349 = arg2;
		this.anInt8350 = arg3;
		this.anIDirect3DVolumeTexture1 = this.aClass14_Sub2_Sub2_6.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static506.method7048(this.aClass161_19, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass14_Sub2_Sub2_6.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (ica.b(14528, local53)) {
			@Pc(65) int local65 = this.anInt8349 * this.aClass219_13.anInt6139;
			@Pc(70) int local70 = this.anInt8350 * local65;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, this.anInt8350 * local65 * this.anInt8351);
			} else {
				@Pc(83) int local83 = local40.getRowPitch();
				@Pc(92) int local92;
				if (local65 == local83) {
					for (local92 = 0; local92 < this.anInt8351; local92++) {
						local40.a(arg5, local92 * local70, local92 * local73, local70);
					}
				} else {
					for (local92 = 0; local92 < this.anInt8351; local92++) {
						for (@Pc(98) int local98 = 0; local98 < this.anInt8350; local98++) {
							local40.a(arg5, local98 * local65 + local92 * local70, local83 * local98 + local92 * local73, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6779() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!ju;)V")
	@Override
	public void method7587(@OriginalArg(1) Class164 arg0) {
		super.method7587(arg0);
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
	@Override
	public void method7586() {
		this.aClass14_Sub2_Sub2_6.method7046(this);
	}
}
