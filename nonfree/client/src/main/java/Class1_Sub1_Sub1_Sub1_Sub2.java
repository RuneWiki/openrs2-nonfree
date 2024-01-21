import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!z", name = "rb", descriptor = "Lclient!gc;")
	public Class13 aClass13_2;

	@OriginalMember(owner = "client!z", name = "qb", descriptor = "Z")
	private boolean aBoolean242 = true;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method670() {
		try {
			if (this.aClass13_2 == null) {
				return null;
			}
			@Pc(17) Class1_Sub1_Sub1_Sub5 local17 = this.method676();
			if (local17 == null) {
				return null;
			}
			super.anInt1031 = local17.anInt989;
			if (super.anInt1018 != -1 && super.anInt1019 != -1) {
				@Pc(38) Class33 local38 = Class33.aClass33Array1[super.anInt1018];
				@Pc(41) Class1_Sub1_Sub1_Sub5 local41 = local38.method516();
				if (local41 != null) {
					@Pc(50) int local50 = local38.aClass27_2.anIntArray222[super.anInt1019];
					@Pc(61) Class1_Sub1_Sub1_Sub5 local61 = new Class1_Sub1_Sub1_Sub5(true, Class12.method304(local50), local41, true, false);
					local61.method273(0, -super.anInt1022, 0);
					local61.method267();
					local61.method268(local50);
					local61.anIntArrayArray9 = null;
					local61.anIntArrayArray8 = null;
					if (local38.anInt829 != 128 || local38.anInt830 != 128) {
						local61.method276(local38.anInt829, local38.anInt829, local38.anInt830);
					}
					local61.method277(local38.anInt832 + 64, local38.anInt833 + 850, -30, -50, -30, true);
					@Pc(124) Class1_Sub1_Sub1_Sub5[] local124 = new Class1_Sub1_Sub1_Sub5[] { local17, local61 };
					local17 = new Class1_Sub1_Sub1_Sub5(true, (byte) 72, local124, 2);
				}
			}
			if (this.aClass13_2.aByte26 == 1) {
				local17.aBoolean116 = true;
			}
			return local17;
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("81887, " + false + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "c", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(14) int local14;
			if (super.anInt1013 < 0 || super.anInt1016 != 0) {
				local14 = -1;
				if (super.anInt1010 >= 0) {
					local14 = Class27.aClass27Array1[super.anInt1010].anIntArray222[super.anInt1011];
				}
				return this.aClass13_2.method323(local14, -1, 811, null);
			}
			local14 = Class27.aClass27Array1[super.anInt1013].anIntArray222[super.anInt1014];
			@Pc(16) int local16 = -1;
			if (super.anInt1010 >= 0 && super.anInt1010 != super.anInt994) {
				local16 = Class27.aClass27Array1[super.anInt1010].anIntArray222[super.anInt1011];
			}
			return this.aClass13_2.method323(local14, local16, 811, Class27.aClass27Array1[super.anInt1013].anIntArray225);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("43362, " + true + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method674() {
		try {
			return this.aClass13_2 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("92002, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
