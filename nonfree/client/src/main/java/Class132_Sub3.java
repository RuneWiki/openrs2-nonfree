import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.rj;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class132_Sub3 extends Class132 implements Interface23 {

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
	private final int anInt9164;

	@OriginalMember(owner = "client!tfa", name = "i", descriptor = "I")
	private final int anInt9166;

	@OriginalMember(owner = "client!tfa", name = "h", descriptor = "I")
	private final int anInt9165;

	@OriginalMember(owner = "client!tfa", name = "g", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lclient!hb;Lclient!lw;III[B)V")
	public Class132_Sub3(@OriginalArg(0) Class133_Sub1_Sub1 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static20.aClass19_4, false, arg4 * arg3 * arg2);
		this.anInt9164 = arg3;
		this.anInt9166 = arg2;
		this.anInt9165 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass133_Sub1_Sub1_8.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static195.method3493(arg1, this.aClass19_20), 1);
		@Pc(40) PixelBuffer local40 = this.aClass133_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (rj.a(-128, local53)) {
			@Pc(64) int local64 = this.aClass223_15.anInt5604 * this.anInt9166;
			@Pc(69) int local69 = this.anInt9164 * local64;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local69 == local72) {
				local40.a((byte[]) arg5, 0, 0, local64 * this.anInt9164 * this.anInt9165);
			} else {
				@Pc(95) int local95 = local40.getRowPitch();
				@Pc(104) int local104;
				if (local64 == local95) {
					for (local104 = 0; local104 < this.anInt9165; local104++) {
						local40.a(arg5, local69 * local104, local72 * local104, local69);
					}
				} else {
					for (local104 = 0; local104 < this.anInt9165; local104++) {
						for (@Pc(133) int local133 = 0; local133 < this.anInt9164; local133++) {
							local40.a(arg5, local133 * local64 + local69 * local104, local72 * local104 - -(local95 * local133), local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V")
	@Override
	public void method7907() {
		this.aClass133_Sub1_Sub1_8.method3492(this);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!gca;I)V")
	@Override
	public void method7905(@OriginalArg(0) Class116 arg0) {
		super.method7905(arg0);
	}

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7906() {
		return this.anIDirect3DVolumeTexture1;
	}
}
