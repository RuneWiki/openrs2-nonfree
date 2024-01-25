import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.em;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class262_Sub2 extends Class262 implements Interface20 {

	@OriginalMember(owner = "client!tfa", name = "h", descriptor = "I")
	private final int anInt9080;

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
	private final int anInt9078;

	@OriginalMember(owner = "client!tfa", name = "g", descriptor = "I")
	private final int anInt9079;

	@OriginalMember(owner = "client!tfa", name = "i", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lclient!kfa;Lclient!iv;III[B)V")
	public Class262_Sub2(@OriginalArg(0) Class82_Sub3_Sub2 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static280.aClass182_8, false, arg4 * arg3 * arg2);
		this.anInt9080 = arg3;
		this.anInt9078 = arg4;
		this.anInt9079 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass82_Sub3_Sub2_7.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static293.method5042(this.aClass182_18, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass82_Sub3_Sub2_7.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (em.a(local53, (int) -1)) {
			@Pc(64) int local64 = this.anInt9079 * this.aClass168_13.anInt4957;
			@Pc(69) int local69 = this.anInt9080 * local64;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local72 == local69) {
				local40.a((byte[]) arg5, 0, 0, local64 * this.anInt9080 * this.anInt9078);
			} else {
				@Pc(91) int local91 = local40.getRowPitch();
				@Pc(96) int local96;
				if (local91 == local64) {
					for (local96 = 0; local96 < this.anInt9078; local96++) {
						local40.a(arg5, local96 * local69, local96 * local72, local69);
					}
				} else {
					for (local96 = 0; local96 < this.anInt9078; local96++) {
						for (@Pc(125) int local125 = 0; local125 < this.anInt9080; local125++) {
							local40.a(arg5, local64 * local125 + local69 * local96, local72 * local96 - -(local91 * local125), local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8008() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!tha;B)V")
	@Override
	public void method8487(@OriginalArg(0) Class324 arg0) {
		super.method8487(arg0);
	}

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "(I)V")
	@Override
	public void method8488() {
		this.aClass82_Sub3_Sub2_7.method5054(this);
	}
}
