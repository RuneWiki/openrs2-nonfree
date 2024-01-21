import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!y")
public final class Class1_Sub1_Sub3_Sub1 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!y", name = "hb", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!y", name = "jb", descriptor = "Lclient!bc;")
	public Class3 aClass3_1;

	@OriginalMember(owner = "client!y", name = "ib", descriptor = "Z")
	private boolean aBoolean181 = true;

	@OriginalMember(owner = "client!y", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method560(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass3_1 == null) {
				return null;
			} else if (super.anInt911 == -1 || super.anInt912 == -1) {
				return this.method552(this.aBoolean181);
			} else {
				@Pc(22) Class1_Sub3_Sub1 local22 = this.method552(this.aBoolean181);
				@Pc(27) Class21 local27 = Class21.aClass21Array1[super.anInt911];
				@Pc(42) Class1_Sub3_Sub1 local42 = new Class1_Sub3_Sub1(364, local27.method401(), !local27.aBoolean143, false, true);
				local42.method235(0, this.anInt873, 0, -super.anInt915);
				local42.method229(797);
				local42.method230(local27.aClass19_1.anIntArray186[super.anInt912]);
				local42.anIntArrayArray7 = null;
				local42.anIntArrayArray6 = null;
				if (local27.anInt557 != 128 || local27.anInt558 != 128) {
					local42.method238(local27.anInt558, local27.anInt557, local27.anInt557);
				}
				local42.method239(local27.anInt560 + 64, local27.anInt561 + 850, -30, -50, -30, true);
				@Pc(111) Class1_Sub3_Sub1[] local111 = new Class1_Sub3_Sub1[] { local22, local42 };
				@Pc(119) Class1_Sub3_Sub1 local119 = new Class1_Sub3_Sub1(2, local111, false, true);
				@Pc(123) int local123 = 67 / arg0;
				if (this.aClass3_1.aByte10 == 1) {
					local119.aBoolean88 = true;
				}
				return local119;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("66378, " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!y", name = "a", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub3_Sub1 method552(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				this.aBoolean181 = !this.aBoolean181;
			}
			@Pc(24) int local24;
			if (super.anInt906 >= 0 && super.anInt909 == 0) {
				local24 = Class19.aClass19Array1[super.anInt906].anIntArray186[super.anInt907];
				@Pc(26) int local26 = -1;
				if (super.anInt903 >= 0 && super.anInt903 != super.anInt885) {
					local26 = Class19.aClass19Array1[super.anInt903].anIntArray186[super.anInt904];
				}
				return this.aClass3_1.method34(local24, local26, Class19.aClass19Array1[super.anInt906].anIntArray189);
			}
			local24 = -1;
			if (super.anInt903 >= 0) {
				local24 = Class19.aClass19Array1[super.anInt903].anIntArray186[super.anInt904];
			}
			@Pc(75) Class1_Sub3_Sub1 local75 = this.aClass3_1.method34(local24, -1, null);
			super.anInt924 = local75.anInt362;
			return local75;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("66619, " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!y", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method563(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
			return this.aClass3_1 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("22236, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
