import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.bea;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class65_Sub3 extends Class65 implements Interface11 {

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
	private final int anInt6886;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	private final int anInt6885;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
	private final int anInt6884;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!tb;Lclient!lca;III[B)V")
	public Class65_Sub3(@OriginalArg(0) Class134_Sub1_Sub2 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static215.aClass155_10, false, arg3 * arg2 * arg4);
		this.anInt6886 = arg2;
		this.anInt6885 = arg4;
		this.anInt6884 = arg3;
		this.anIDirect3DVolumeTexture1 = this.aClass134_Sub1_Sub2_7.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static491.method6865(this.aClass155_19, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass134_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (bea.a(-113, local53)) {
			@Pc(64) int local64 = this.anInt6886 * this.aClass203_13.anInt5023;
			@Pc(69) int local69 = local64 * this.anInt6884;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local72 == local69) {
				local40.a((byte[]) arg5, 0, 0, this.anInt6885 * local64 * this.anInt6884);
			} else {
				@Pc(82) int local82 = local40.getRowPitch();
				@Pc(91) int local91;
				if (local82 == local64) {
					for (local91 = 0; local91 < this.anInt6885; local91++) {
						local40.a(arg5, local91 * local69, local91 * local72, local69);
					}
				} else {
					for (local91 = 0; local91 < this.anInt6885; local91++) {
						for (@Pc(120) int local120 = 0; local120 < this.anInt6884; local120++) {
							local40.a(arg5, local64 * local120 + local69 * local91, local82 * local120 + local72 * local91, local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!gaa;I)V")
	@Override
	public void method5452(@OriginalArg(0) Class115 arg0) {
		super.method5452(arg0);
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5453() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	@Override
	public void method5454() {
		this.aClass134_Sub1_Sub2_7.method6861(this);
	}
}
