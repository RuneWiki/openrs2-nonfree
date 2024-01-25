import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class14_Sub3_Sub25 extends Class14_Sub3 {

	@OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
	private int anInt4277 = 4096;

	@OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
	private int anInt4286 = 0;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4286 = arg0.method2498();
		} else if (arg1 == 1) {
			this.anInt4277 = arg0.method2498();
		} else if (arg1 == 2) {
			super.aBoolean446 = arg0.method2548() == 1;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(27) int[] local27 = this.method6004(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static294.anInt5657; local29++) {
				@Pc(35) int local35 = local27[local29];
				if (this.anInt4286 > local35) {
					local17[local29] = this.anInt4286;
				} else if (local35 > this.anInt4277) {
					local17[local29] = this.anInt4277;
				} else {
					local17[local29] = local35;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(28) int[][] local28 = this.method5997(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			for (@Pc(54) int local54 = 0; local54 < Static294.anInt5657; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(64) int local64 = local36[local54];
				@Pc(68) int local68 = local40[local54];
				if (local60 < this.anInt4286) {
					local44[local54] = this.anInt4286;
				} else if (this.anInt4277 >= local60) {
					local44[local54] = local60;
				} else {
					local44[local54] = this.anInt4277;
				}
				if (local64 < this.anInt4286) {
					local48[local54] = this.anInt4286;
				} else if (this.anInt4277 < local64) {
					local48[local54] = this.anInt4277;
				} else {
					local48[local54] = local64;
				}
				if (local68 < this.anInt4286) {
					local52[local54] = this.anInt4286;
				} else if (local68 <= this.anInt4277) {
					local52[local54] = local68;
				} else {
					local52[local54] = this.anInt4277;
				}
			}
		}
		return local11;
	}
}
