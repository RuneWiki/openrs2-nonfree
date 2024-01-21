import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!y")
public final class Class1_Sub1_Sub3_Sub1 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!y", name = "hb", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!y", name = "ib", descriptor = "Lclient!bc;")
	public Class3 aClass3_1;

	@OriginalMember(owner = "client!y", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method568() {
		try {
			if (this.aClass3_1 == null) {
				return null;
			} else if (super.anInt920 == -1 || super.anInt921 == -1) {
				return this.method560();
			} else {
				@Pc(20) Class1_Sub3_Sub1 local20 = this.method560();
				@Pc(25) Class21 local25 = Class21.aClass21Array1[super.anInt920];
				@Pc(40) Class1_Sub3_Sub1 local40 = new Class1_Sub3_Sub1(!local25.aBoolean132, (byte) 70, true, local25.method409(), false);
				local40.method236(0, -super.anInt924, (byte) 1, 0);
				if (this.anInt882 > 0 || this.anInt882 < 0) {
					for (@Pc(58) int local58 = 1; local58 > 0; local58++) {
					}
				}
				local40.method230();
				local40.method231(local25.aClass19_1.anIntArray186[super.anInt921]);
				local40.anIntArrayArray7 = null;
				local40.anIntArrayArray6 = null;
				if (local25.anInt564 != 128 || local25.anInt565 != 128) {
					local40.method239(local25.anInt565, local25.anInt564, local25.anInt564);
				}
				local40.method240(local25.anInt567 + 64, local25.anInt568 + 850, -30, -50, -30, true);
				@Pc(123) Class1_Sub3_Sub1[] local123 = new Class1_Sub3_Sub1[] { local20, local40 };
				@Pc(131) Class1_Sub3_Sub1 local131 = new Class1_Sub3_Sub1((byte) -80, true, local123, 2);
				if (this.aClass3_1.aByte6 == 1) {
					local131.aBoolean84 = true;
				}
				return local131;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("48505, " + 0 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!y", name = "c", descriptor = "(I)Lclient!eb;")
	private Class1_Sub3_Sub1 method560() {
		try {
			@Pc(14) int local14;
			if (super.anInt915 >= 0 && super.anInt918 == 0) {
				local14 = Class19.aClass19Array1[super.anInt915].anIntArray186[super.anInt916];
				@Pc(16) int local16 = -1;
				if (super.anInt912 >= 0 && super.anInt912 != super.anInt894) {
					local16 = Class19.aClass19Array1[super.anInt912].anIntArray186[super.anInt913];
				}
				return this.aClass3_1.method34(local14, local16, Class19.aClass19Array1[super.anInt915].anIntArray189);
			}
			local14 = -1;
			if (super.anInt912 >= 0) {
				local14 = Class19.aClass19Array1[super.anInt912].anIntArray186[super.anInt913];
			}
			@Pc(71) Class1_Sub3_Sub1 local71 = this.aClass3_1.method34(local14, -1, null);
			super.anInt933 = local71.anInt366;
			return local71;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("26511, " + -300 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!y", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method571() {
		try {
			return this.aClass3_1 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("93241, " + 574 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
