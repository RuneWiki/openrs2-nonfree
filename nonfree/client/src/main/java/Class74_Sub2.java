import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.ec;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sba")
public final class Class74_Sub2 extends Class74 implements Interface1 {

	@OriginalMember(owner = "client!sba", name = "g", descriptor = "I")
	private final int anInt8919;

	@OriginalMember(owner = "client!sba", name = "i", descriptor = "I")
	private final int anInt8921;

	@OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
	private final int anInt8920;

	@OriginalMember(owner = "client!sba", name = "f", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lclient!hl;Lclient!wd;III[B)V")
	public Class74_Sub2(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static258.aClass160_9, false, arg2 * arg3 * arg4);
		this.anInt8919 = arg3;
		this.anInt8921 = arg2;
		this.anInt8920 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass16_Sub1_Sub2_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static208.method4018(arg1, this.aClass160_20), 1);
		@Pc(40) PixelBuffer local40 = this.aClass16_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (ec.a(local53, 2005530520)) {
			@Pc(64) int local64 = this.anInt8921 * this.aClass366_14.anInt10394;
			@Pc(69) int local69 = local64 * this.anInt8919;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local72 == local69) {
				local40.a((byte[]) arg5, 0, 0, this.anInt8920 * local64 * this.anInt8919);
			} else {
				@Pc(95) int local95 = local40.getRowPitch();
				@Pc(104) int local104;
				if (local95 == local64) {
					for (local104 = 0; local104 < this.anInt8920; local104++) {
						local40.a(arg5, local104 * local69, local72 * local104, local69);
					}
				} else {
					for (local104 = 0; local104 < this.anInt8920; local104++) {
						for (@Pc(110) int local110 = 0; local110 < this.anInt8919; local110++) {
							local40.a(arg5, local64 * local110 + local69 * local104, local110 * local95 + local72 * local104, local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lclient!qo;I)V")
	@Override
	public void method8280(@OriginalArg(0) Class277 arg0) {
		super.method8280(arg0);
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)V")
	@Override
	public void method8281() {
		this.aClass16_Sub1_Sub2_9.method4013(this);
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8279() {
		return this.anIDirect3DVolumeTexture1;
	}
}
