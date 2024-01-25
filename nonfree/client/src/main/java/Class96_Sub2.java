import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.hb;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class96_Sub2 extends Class96 implements Interface19 {

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
	private final int anInt7335;

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
	private final int anInt7336;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
	private final int anInt7334;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!gb;Lclient!vj;III[B)V")
	public Class96_Sub2(@OriginalArg(0) Class9_Sub3_Sub1 arg0, @OriginalArg(1) Class333 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static336.aClass220_12, false, arg4 * arg2 * arg3);
		this.anInt7335 = arg4;
		this.anInt7336 = arg3;
		this.anInt7334 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass9_Sub3_Sub1_6.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static160.method3245(this.aClass220_19, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass9_Sub3_Sub1_6.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (hb.a(local53, (byte) -106)) {
			@Pc(65) int local65 = this.aClass333_13.anInt9344 * this.anInt7334;
			@Pc(70) int local70 = local65 * this.anInt7336;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, local65 * this.anInt7336 * this.anInt7335);
			} else {
				@Pc(96) int local96 = local40.getRowPitch();
				@Pc(101) int local101;
				if (local96 == local65) {
					for (local101 = 0; local101 < this.anInt7335; local101++) {
						local40.a(arg5, local70 * local101, local101 * local73, local70);
					}
				} else {
					for (local101 = 0; local101 < this.anInt7335; local101++) {
						for (@Pc(130) int local130 = 0; local130 < this.anInt7336; local130++) {
							local40.a(arg5, local101 * local70 + local130 * local65, local73 * local101 + local96 * local130, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
	@Override
	public void method7736() {
		this.aClass9_Sub3_Sub1_6.method3243(this);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6280() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!up;)V")
	@Override
	public void method7737(@OriginalArg(1) Class321 arg0) {
		super.method7737(arg0);
	}
}
