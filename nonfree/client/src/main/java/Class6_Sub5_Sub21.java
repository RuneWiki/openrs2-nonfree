import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class6_Sub5_Sub21 extends Class6_Sub5 {

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
	private int anInt4106 = 0;

	@OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
	private int anInt4113 = 4096;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(30) int[] local30 = this.method6543(0, arg0);
			for (@Pc(32) int local32 = 0; local32 < Static240.anInt4386; local32++) {
				@Pc(38) int local38 = local30[local32];
				if (this.anInt4106 > local38) {
					local18[local32] = this.anInt4106;
				} else if (this.anInt4113 < local38) {
					local18[local32] = this.anInt4113;
				} else {
					local18[local32] = local38;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt4106 = arg1.method6485();
		} else if (arg0 == 1) {
			this.anInt4113 = arg1.method6485();
		} else if (arg0 == 2) {
			super.aBoolean495 = arg1.method6433() == 1;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(27) int[][] local27 = this.method6544(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static240.anInt4386; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local35[local53];
				@Pc(67) int local67 = local39[local53];
				if (this.anInt4106 > local59) {
					local43[local53] = this.anInt4106;
				} else if (local59 <= this.anInt4113) {
					local43[local53] = local59;
				} else {
					local43[local53] = this.anInt4113;
				}
				if (local63 < this.anInt4106) {
					local47[local53] = this.anInt4106;
				} else if (this.anInt4113 < local63) {
					local47[local53] = this.anInt4113;
				} else {
					local47[local53] = local63;
				}
				if (this.anInt4106 > local67) {
					local51[local53] = this.anInt4106;
				} else if (this.anInt4113 < local67) {
					local51[local53] = this.anInt4113;
				} else {
					local51[local53] = local67;
				}
			}
		}
		return local17;
	}
}
