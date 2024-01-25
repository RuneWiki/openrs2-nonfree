import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class14_Sub3_Sub7 extends Class14_Sub3 {

	@OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
	private int anInt1432 = 4;

	@OriginalMember(owner = "client!dl", name = "R", descriptor = "I")
	private int anInt1438 = 4;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(20) int local20 = Static294.anInt5657 / this.anInt1432;
			@Pc(25) int local25 = Static65.anInt5731 / this.anInt1438;
			@Pc(33) int[] local33;
			@Pc(39) int local39;
			if (local25 <= 0) {
				local33 = this.method6004(0, 0);
			} else {
				local39 = arg0 % local25;
				local33 = this.method6004(0, Static65.anInt5731 * local39 / local25);
			}
			for (local39 = 0; local39 < Static294.anInt5657; local39++) {
				if (local20 > 0) {
					@Pc(59) int local59 = local39 % local20;
					local11[local39] = local33[local59 * Static294.anInt5657 / local20];
				} else {
					local11[local39] = local33[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(26) int local26 = Static294.anInt5657 / this.anInt1432;
			@Pc(31) int local31 = Static65.anInt5731 / this.anInt1438;
			@Pc(39) int[][] local39;
			if (local31 <= 0) {
				local39 = this.method5997(0, 0);
			} else {
				@Pc(45) int local45 = arg0 % local31;
				local39 = this.method5997(Static65.anInt5731 * local45 / local31, 0);
			}
			@Pc(59) int[] local59 = local39[0];
			@Pc(63) int[] local63 = local39[1];
			@Pc(67) int[] local67 = local39[2];
			@Pc(71) int[] local71 = local17[0];
			@Pc(75) int[] local75 = local17[1];
			@Pc(79) int[] local79 = local17[2];
			for (@Pc(81) int local81 = 0; local81 < Static294.anInt5657; local81++) {
				@Pc(87) int local87;
				if (local26 <= 0) {
					local87 = 0;
				} else {
					@Pc(93) int local93 = local81 % local26;
					local87 = local93 * Static294.anInt5657 / local26;
				}
				local71[local81] = local59[local87];
				local75[local81] = local63[local87];
				local79[local81] = local67[local87];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1432 = arg0.method2548();
		} else if (arg1 == 1) {
			this.anInt1438 = arg0.method2548();
		}
	}
}
