import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!y")
public final class Class1_Sub1_Sub3_Sub1 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!y", name = "jb", descriptor = "Lclient!bc;")
	public Class3 aClass3_1;

	@OriginalMember(owner = "client!y", name = "ib", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!y", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method548() {
		try {
			if (this.aClass3_1 == null) {
				return null;
			} else if (super.anInt903 == -1 || super.anInt904 == -1) {
				return this.method540(this.aBoolean183);
			} else {
				@Pc(22) Class1_Sub3_Sub1 local22 = this.method540(this.aBoolean183);
				@Pc(27) Class21 local27 = Class21.aClass21Array1[super.anInt903];
				@Pc(42) Class1_Sub3_Sub1 local42 = new Class1_Sub3_Sub1(false, (byte) 8, true, !local27.aBoolean148, local27.method390());
				local42.method224(-super.anInt907, 0, 0);
				local42.method218();
				local42.method219(local27.aClass19_1.anIntArray186[super.anInt904]);
				local42.anIntArrayArray7 = null;
				local42.anIntArrayArray6 = null;
				if (local27.anInt548 != 128 || local27.anInt549 != 128) {
					local42.method227(local27.anInt549, local27.anInt548, local27.anInt548);
				}
				local42.method228(local27.anInt551 + 64, local27.anInt552 + 850, -30, -50, -30, true);
				@Pc(123) Class1_Sub3_Sub1[] local123 = new Class1_Sub3_Sub1[] { local22, local42 };
				@Pc(131) Class1_Sub3_Sub1 local131 = new Class1_Sub3_Sub1(local123, 2, 0, true);
				if (this.aClass3_1.aByte5 == 1) {
					local131.aBoolean90 = true;
				}
				return local131;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("43523, " + 7 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!y", name = "b", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub3_Sub1 method540(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				throw new NullPointerException();
			}
			@Pc(20) int local20;
			if (super.anInt898 >= 0 && super.anInt901 == 0) {
				local20 = Class19.aClass19Array1[super.anInt898].anIntArray186[super.anInt899];
				@Pc(22) int local22 = -1;
				if (super.anInt895 >= 0 && super.anInt895 != super.anInt877) {
					local22 = Class19.aClass19Array1[super.anInt895].anIntArray186[super.anInt896];
				}
				return this.aClass3_1.method34(local20, local22, Class19.aClass19Array1[super.anInt898].anIntArray189);
			}
			local20 = -1;
			if (super.anInt895 >= 0) {
				local20 = Class19.aClass19Array1[super.anInt895].anIntArray186[super.anInt896];
			}
			@Pc(71) Class1_Sub3_Sub1 local71 = this.aClass3_1.method34(local20, -1, null);
			super.anInt916 = local71.anInt348;
			return local71;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("98478, " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!y", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method551() {
		try {
			return this.aClass3_1 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("62398, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
