import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
	private int anInt279 = 4096;

	@OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
	private int anInt282 = 4096;

	@OriginalMember(owner = "client!bb", name = "N", descriptor = "[I")
	private int[] anIntArray18 = new int[3];

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
	private int anInt280 = 4096;

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
	private int anInt287 = 409;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(23) int[][] local23 = this.method4749(0, arg0);
			@Pc(27) int[] local27 = local23[1];
			@Pc(31) int[] local31 = local23[0];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local13[1];
			@Pc(43) int[] local43 = local13[2];
			@Pc(47) int[] local47 = local13[0];
			for (@Pc(49) int local49 = 0; local49 < Static182.anInt3492; local49++) {
				@Pc(56) int local56 = local31[local49];
				@Pc(64) int local64 = local56 - this.anIntArray18[0];
				if (local64 < 0) {
					local64 = -local64;
				}
				if (local64 > this.anInt287) {
					local47[local49] = local56;
					local39[local49] = local27[local49];
					local43[local49] = local35[local49];
				} else {
					@Pc(103) int local103 = local27[local49];
					local64 = local103 - this.anIntArray18[1];
					if (local64 < 0) {
						local64 = -local64;
					}
					if (local64 > this.anInt287) {
						local47[local49] = local56;
						local39[local49] = local103;
						local43[local49] = local35[local49];
					} else {
						@Pc(144) int local144 = local35[local49];
						local64 = local144 - this.anIntArray18[2];
						if (local64 < 0) {
							local64 = -local64;
						}
						if (local64 <= this.anInt287) {
							local47[local49] = local56 * this.anInt282 >> 12;
							local39[local49] = this.anInt279 * local103 >> 12;
							local43[local49] = local144 * this.anInt280 >> 12;
						} else {
							local47[local49] = local56;
							local39[local49] = local103;
							local43[local49] = local144;
						}
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt287 = arg0.method1386();
		} else if (arg1 == 1) {
			this.anInt280 = arg0.method1386();
		} else if (arg1 == 2) {
			this.anInt279 = arg0.method1386();
		} else if (arg1 == 3) {
			this.anInt282 = arg0.method1386();
		} else if (arg1 == 4) {
			@Pc(63) int local63 = arg0.method1352();
			this.anIntArray18[0] = (local63 & 0xFF0000) << 4;
			this.anIntArray18[1] = local63 >> 4 & 0xFF0;
			this.anIntArray18[2] = local63 >> 12 & 0x0;
		}
	}
}
