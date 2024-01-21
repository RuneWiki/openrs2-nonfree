import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!y")
public final class Class1_Sub1_Sub3_Sub1 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!y", name = "gb", descriptor = "Lclient!bc;")
	public Class3 aClass3_1;

	@OriginalMember(owner = "client!y", name = "fb", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!y", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method560(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass3_1 == null) {
				return null;
			} else if (super.anInt926 == -1 || super.anInt927 == -1) {
				return this.method552();
			} else {
				@Pc(20) Class1_Sub3_Sub1 local20 = this.method552();
				@Pc(25) Class21 local25 = Class21.aClass21Array1[super.anInt926];
				@Pc(40) Class1_Sub3_Sub1 local40 = new Class1_Sub3_Sub1(!local25.aBoolean133, false, false, local25.method401(), true);
				local40.method235(0, -super.anInt930, 0);
				local40.method229();
				local40.method230(local25.aClass19_1.anIntArray186[super.anInt927]);
				local40.anIntArrayArray7 = null;
				local40.anIntArrayArray6 = null;
				if (local25.anInt576 != 128 || local25.anInt577 != 128) {
					local40.method238(local25.anInt576, local25.anInt576, local25.anInt577);
				}
				local40.method239(local25.anInt579 + 64, local25.anInt580 + 850, -30, -50, -30, true);
				@Pc(108) Class1_Sub3_Sub1[] local108 = new Class1_Sub3_Sub1[] { local20, local40 };
				@Pc(116) Class1_Sub3_Sub1 local116 = new Class1_Sub3_Sub1(982, 2, true, local108);
				if (arg0 != 1) {
					this.aBoolean164 = !this.aBoolean164;
				}
				if (this.aClass3_1.aByte8 == 1) {
					local116.aBoolean81 = true;
				}
				return local116;
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("43722, " + arg0 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!y", name = "b", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub3_Sub1 method552() {
		try {
			@Pc(14) int local14;
			if (super.anInt921 >= 0 && super.anInt924 == 0) {
				local14 = Class19.aClass19Array1[super.anInt921].anIntArray186[super.anInt922];
				@Pc(16) int local16 = -1;
				if (super.anInt918 >= 0 && super.anInt918 != super.anInt900) {
					local16 = Class19.aClass19Array1[super.anInt918].anIntArray186[super.anInt919];
				}
				return this.aClass3_1.method34(local14, local16, Class19.aClass19Array1[super.anInt921].anIntArray189);
			}
			local14 = -1;
			if (super.anInt918 >= 0) {
				local14 = Class19.aClass19Array1[super.anInt918].anIntArray186[super.anInt919];
			}
			@Pc(74) Class1_Sub3_Sub1 local74 = this.aClass3_1.method34(local14, -1, null);
			super.anInt939 = local74.anInt365;
			return local74;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("46904, " + false + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!y", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method563() {
		try {
			return this.aClass3_1 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("13905, " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
