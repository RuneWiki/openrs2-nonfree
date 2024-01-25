import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.mo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class24_Sub3 extends Class24 implements Interface9 {

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
	private final int anInt4103;

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
	private final int anInt4101;

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
	private final int anInt4102;

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!hv;Lclient!uda;III[B)V")
	public Class24_Sub3(@OriginalArg(0) Class122_Sub2_Sub1 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static431.aClass264_15, false, arg3 * arg2 * arg4);
		this.anInt4103 = arg4;
		this.anInt4101 = arg3;
		this.anInt4102 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass122_Sub2_Sub1_5.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static195.method3407(arg1, this.aClass264_8), 1);
		@Pc(40) PixelBuffer local40 = this.aClass122_Sub2_Sub1_5.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (mo.b(local53, 28658)) {
			@Pc(64) int local64 = this.anInt4102 * this.aClass292_7.anInt8024;
			@Pc(69) int local69 = local64 * this.anInt4101;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local69 == local72) {
				local40.a((byte[]) arg5, 0, 0, this.anInt4103 * this.anInt4101 * local64);
			} else {
				@Pc(91) int local91 = local40.getRowPitch();
				@Pc(96) int local96;
				if (local91 == local64) {
					for (local96 = 0; local96 < this.anInt4103; local96++) {
						local40.a(arg5, local96 * local69, local72 * local96, local69);
					}
				} else {
					for (local96 = 0; local96 < this.anInt4103; local96++) {
						for (@Pc(129) int local129 = 0; local129 < this.anInt4101; local129++) {
							local40.a(arg5, local69 * local96 + local64 * local129, local91 * local129 + local72 * local96, local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method3590() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
	@Override
	public void method7303() {
		this.aClass122_Sub2_Sub1_5.method3410(this);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!gu;I)V")
	@Override
	public void method7302(@OriginalArg(0) Class113 arg0) {
		super.method7302(arg0);
	}
}
