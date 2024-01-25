import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class5_Sub2_Sub31 extends Class5_Sub2 {

	@OriginalMember(owner = "client!sq", name = "M", descriptor = "[I")
	public static final int[] anIntArray684 = new int[256];

	@OriginalMember(owner = "client!sq", name = "E", descriptor = "I")
	private int anInt8832 = 2048;

	@OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
	private int anInt8830 = 1024;

	@OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
	private int anInt8836 = 3072;

	static {
		for (@Pc(294) int local294 = 0; local294 < 256; local294++) {
			@Pc(297) int local297 = local294;
			for (@Pc(299) int local299 = 0; local299 < 8; local299++) {
				if ((local297 & 0x1) == 1) {
					local297 = local297 >>> 1 ^ 0xEDB88320;
				} else {
					local297 >>>= 0x1;
				}
			}
			anIntArray684[local294] = local297;
		}
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(27) int[][] local27 = this.method8823(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static314.anInt6320; local53++) {
				local43[local53] = this.anInt8830 + (this.anInt8832 * local31[local53] >> 12);
				local47[local53] = this.anInt8830 + (this.anInt8832 * local35[local53] >> 12);
				local51[local53] = (local39[local53] * this.anInt8832 >> 12) + this.anInt8830;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
	@Override
	public void method8819() {
		this.anInt8832 = this.anInt8836 - this.anInt8830;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8830 = arg0.method8631();
		} else if (arg1 == 1) {
			this.anInt8836 = arg0.method8631();
		} else if (arg1 == 2) {
			super.aBoolean834 = arg0.method8645() == 1;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(25) int[] local25 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(35) int[] local35 = this.method8821(arg0, 0);
			for (@Pc(37) int local37 = 0; local37 < Static314.anInt6320; local37++) {
				local25[local37] = (this.anInt8832 * local35[local37] >> 12) + this.anInt8830;
			}
		}
		return local25;
	}
}
