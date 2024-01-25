import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "K", descriptor = "I")
	private int anInt43 = 0;

	@OriginalMember(owner = "client!a", name = "J", descriptor = "I")
	private int anInt42 = 4096;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505) {
			@Pc(26) int[][] local26 = this.method7833(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static501.anInt8748; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt43) {
					local42[local52] = this.anInt43;
				} else if (this.anInt42 < local58) {
					local42[local52] = this.anInt42;
				} else {
					local42[local52] = local58;
				}
				if (this.anInt43 > local62) {
					local46[local52] = this.anInt43;
				} else if (local62 > this.anInt42) {
					local46[local52] = this.anInt42;
				} else {
					local46[local52] = local62;
				}
				if (local66 < this.anInt43) {
					local50[local52] = this.anInt43;
				} else if (local66 > this.anInt42) {
					local50[local52] = this.anInt42;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(27) int[] local27 = this.method7836(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static501.anInt8748; local29++) {
				@Pc(35) int local35 = local27[local29];
				if (this.anInt43 > local35) {
					local17[local29] = this.anInt43;
				} else if (local35 > this.anInt42) {
					local17[local29] = this.anInt42;
				} else {
					local17[local29] = local35;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt43 = arg1.method7945();
		} else if (arg0 == 1) {
			this.anInt42 = arg1.method7945();
		} else if (arg0 == 2) {
			super.aBoolean711 = arg1.method7974() == 1;
		}
	}
}
