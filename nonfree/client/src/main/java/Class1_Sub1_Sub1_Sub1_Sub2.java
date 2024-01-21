import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!z", name = "pb", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!z", name = "rb", descriptor = "Lclient!gc;")
	public Class13 aClass13_2;

	@OriginalMember(owner = "client!z", name = "qb", descriptor = "I")
	private int anInt1049 = 888;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(B)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			if (this.aClass13_2 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub1_Sub5 local8 = this.method682();
			if (local8 == null) {
				return null;
			}
			super.anInt1042 = local8.anInt1000;
			if (super.anInt1029 != -1 && super.anInt1030 != -1) {
				@Pc(35) Class33 local35 = Class33.aClass33Array1[super.anInt1029];
				@Pc(38) Class1_Sub1_Sub1_Sub5 local38 = local35.method523();
				if (local38 != null) {
					@Pc(47) int local47 = local35.aClass27_2.anIntArray225[super.anInt1030];
					@Pc(58) Class1_Sub1_Sub1_Sub5 local58 = new Class1_Sub1_Sub1_Sub5(Class12.method306(local47), false, 0, true, local38);
					local58.method274(0, -super.anInt1033, 0);
					local58.method268(this.anInt1048);
					local58.method269(local47);
					local58.anIntArrayArray9 = null;
					local58.anIntArrayArray8 = null;
					if (local35.anInt843 != 128 || local35.anInt844 != 128) {
						local58.method277(local35.anInt844, local35.anInt843, local35.anInt843);
					}
					local58.method278(local35.anInt846 + 64, local35.anInt847 + 850, -30, -50, -30, true);
					@Pc(122) Class1_Sub1_Sub1_Sub5[] local122 = new Class1_Sub1_Sub1_Sub5[] { local8, local58 };
					local8 = new Class1_Sub1_Sub1_Sub5(2, (byte) 6, local122, true);
				}
			}
			if (this.aClass13_2.aByte33 == 1) {
				local8.aBoolean116 = true;
			}
			return local8;
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("30583, " + -59 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "c", descriptor = "(B)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method682() {
		try {
			@Pc(14) int local14;
			if (super.anInt1024 < 0 || super.anInt1027 != 0) {
				local14 = -1;
				if (super.anInt1021 >= 0) {
					local14 = Class27.aClass27Array1[super.anInt1021].anIntArray225[super.anInt1022];
				}
				return this.aClass13_2.method325(-1, null, local14);
			}
			local14 = Class27.aClass27Array1[super.anInt1024].anIntArray225[super.anInt1025];
			@Pc(16) int local16 = -1;
			if (super.anInt1021 >= 0 && super.anInt1021 != super.anInt1005) {
				local16 = Class27.aClass27Array1[super.anInt1021].anIntArray225[super.anInt1022];
			}
			return this.aClass13_2.method325(local16, Class27.aClass27Array1[super.anInt1024].anIntArray228, local14);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("19208, " + -48 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method680() {
		try {
			return this.aClass13_2 != null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("53848, " + -120 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
