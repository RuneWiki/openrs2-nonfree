import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class1_Sub1_Sub20 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
	private int anInt3865 = 4;

	@OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
	private int anInt3860 = 4;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(20) int local20 = Static85.anInt1910 / this.anInt3860;
			@Pc(25) int local25 = Static208.anInt4105 / this.anInt3865;
			@Pc(33) int[][] local33;
			if (local25 <= 0) {
				local33 = this.method6006(0, 0);
			} else {
				@Pc(39) int local39 = arg0 % local25;
				local33 = this.method6006(0, Static208.anInt4105 * local39 / local25);
			}
			@Pc(53) int[] local53 = local33[0];
			@Pc(57) int[] local57 = local33[1];
			@Pc(61) int[] local61 = local33[2];
			@Pc(65) int[] local65 = local11[0];
			@Pc(69) int[] local69 = local11[1];
			@Pc(73) int[] local73 = local11[2];
			for (@Pc(75) int local75 = 0; local75 < Static85.anInt1910; local75++) {
				@Pc(89) int local89;
				if (local20 > 0) {
					@Pc(83) int local83 = local75 % local20;
					local89 = Static85.anInt1910 * local83 / local20;
				} else {
					local89 = 0;
				}
				local65[local75] = local53[local89];
				local69[local75] = local57[local89];
				local73[local75] = local61[local89];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3860 = arg1.method2132();
		} else if (arg0 == 1) {
			this.anInt3865 = arg1.method2132();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(26) int local26 = Static85.anInt1910 / this.anInt3860;
			@Pc(31) int local31 = Static208.anInt4105 / this.anInt3865;
			@Pc(42) int[] local42;
			@Pc(48) int local48;
			if (local31 <= 0) {
				local42 = this.method6013(0, 0);
			} else {
				local48 = arg0 % local31;
				local42 = this.method6013(local48 * Static208.anInt4105 / local31, 0);
			}
			for (local48 = 0; local48 < Static85.anInt1910; local48++) {
				if (local26 <= 0) {
					local11[local48] = local42[0];
				} else {
					@Pc(79) int local79 = local48 % local26;
					local11[local48] = local42[local79 * Static85.anInt1910 / local26];
				}
			}
		}
		return local11;
	}
}
