import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.jc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class186_Sub3 extends Class186 implements Interface4 {

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
	private final int anInt9287;

	@OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
	private final int anInt9289;

	@OriginalMember(owner = "client!vw", name = "h", descriptor = "I")
	private final int anInt9288;

	@OriginalMember(owner = "client!vw", name = "f", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lclient!hb;Lclient!sk;III[B)V")
	public Class186_Sub3(@OriginalArg(0) Class12_Sub2_Sub1 arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static554.aClass340_14, false, arg4 * arg2 * arg3);
		this.anInt9287 = arg2;
		this.anInt9289 = arg3;
		this.anInt9288 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass12_Sub2_Sub1_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static182.method3208(arg1, this.aClass340_20), 1);
		@Pc(40) PixelBuffer local40 = this.aClass12_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (jc.a(-1, local53)) {
			@Pc(65) int local65 = this.aClass297_15.anInt8136 * this.anInt9287;
			@Pc(70) int local70 = this.anInt9289 * local65;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, local65 * this.anInt9289 * this.anInt9288);
			} else {
				@Pc(92) int local92 = local40.getRowPitch();
				@Pc(101) int local101;
				if (local65 == local92) {
					for (local101 = 0; local101 < this.anInt9288; local101++) {
						local40.a(arg5, local101 * local70, local73 * local101, local70);
					}
				} else {
					for (local101 = 0; local101 < this.anInt9288; local101++) {
						for (@Pc(134) int local134 = 0; local134 < this.anInt9289; local134++) {
							local40.a(arg5, local70 * local101 + local65 * local134, local92 * local134 + local73 * local101, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILclient!ng;)V")
	@Override
	public void method7669(@OriginalArg(1) Class225 arg0) {
		super.method7669(arg0);
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(Z)V")
	@Override
	public void method7671() {
		this.aClass12_Sub2_Sub1_9.method3210(this);
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7670() {
		return this.anIDirect3DVolumeTexture1;
	}
}
