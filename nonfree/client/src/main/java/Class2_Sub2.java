import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.js;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class2_Sub2 extends Class2 implements Interface19 {

	@OriginalMember(owner = "client!gda", name = "i", descriptor = "I")
	private final int anInt3719;

	@OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
	private final int anInt3718;

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "I")
	private final int anInt3717;

	@OriginalMember(owner = "client!gda", name = "g", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!to;Lclient!os;III[B)V")
	public Class2_Sub2(@OriginalArg(0) Class31_Sub1_Sub2 arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static331.aClass204_13, false, arg2 * arg3 * arg4);
		this.anInt3719 = arg4;
		this.anInt3718 = arg3;
		this.anInt3717 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass31_Sub1_Sub2_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static518.method7194(this.aClass204_20, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass31_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (js.b(local53, 141953135)) {
			@Pc(64) int local64 = this.aClass245_15.anInt6985 * this.anInt3717;
			@Pc(69) int local69 = local64 * this.anInt3718;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local69 == local72) {
				local40.a((byte[]) arg5, 0, 0, this.anInt3719 * this.anInt3718 * local64);
			} else {
				@Pc(91) int local91 = local40.getRowPitch();
				@Pc(96) int local96;
				if (local64 == local91) {
					for (local96 = 0; local96 < this.anInt3719; local96++) {
						local40.a(arg5, local69 * local96, local96 * local72, local69);
					}
				} else {
					for (local96 = 0; local96 < this.anInt3719; local96++) {
						for (@Pc(121) int local121 = 0; local121 < this.anInt3718; local121++) {
							local40.a(arg5, local64 * local121 + local96 * local69, local91 * local121 + local96 * local72, local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!dca;B)V")
	@Override
	public void method7711(@OriginalArg(0) Class65 arg0) {
		super.method7711(arg0);
	}

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "(I)V")
	@Override
	public void method7712() {
		this.aClass31_Sub1_Sub2_9.method7190(this);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7710() {
		return this.anIDirect3DVolumeTexture1;
	}
}
