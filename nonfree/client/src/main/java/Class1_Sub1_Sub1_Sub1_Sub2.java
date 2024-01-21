import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!z", name = "tb", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!z", name = "wb", descriptor = "Lclient!gc;")
	public Class13 aClass13_2;

	@OriginalMember(owner = "client!z", name = "ub", descriptor = "Z")
	private boolean aBoolean262 = true;

	@OriginalMember(owner = "client!z", name = "vb", descriptor = "I")
	private int anInt1034 = 7;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method671() {
		try {
			if (this.aClass13_2 == null) {
				return null;
			}
			@Pc(14) Class1_Sub1_Sub1_Sub5 local14 = this.method677();
			if (local14 == null) {
				return null;
			}
			super.anInt1027 = local14.anInt984;
			if (super.anInt1014 != -1 && super.anInt1015 != -1) {
				@Pc(35) Class33 local35 = Class33.aClass33Array1[super.anInt1014];
				@Pc(38) Class1_Sub1_Sub1_Sub5 local38 = local35.method517();
				if (local38 != null) {
					@Pc(47) int local47 = local35.aClass27_2.anIntArray222[super.anInt1015];
					@Pc(59) Class1_Sub1_Sub1_Sub5 local59 = new Class1_Sub1_Sub1_Sub5(9, false, Class12.method304(this.anInt1033, local47), true, local38);
					local59.method273(0, -super.anInt1018, 0);
					local59.method267();
					local59.method268(local47);
					local59.anIntArrayArray9 = null;
					local59.anIntArrayArray8 = null;
					if (local35.anInt831 != 128 || local35.anInt832 != 128) {
						local59.method276(local35.anInt831, local35.anInt831, local35.anInt832);
					}
					local59.method277(local35.anInt834 + 64, local35.anInt835 + 850, -30, -50, -30, true);
					@Pc(122) Class1_Sub1_Sub1_Sub5[] local122 = new Class1_Sub1_Sub1_Sub5[] { local14, local59 };
					local14 = new Class1_Sub1_Sub1_Sub5(true, local122, true, 2);
				}
			}
			if (this.aClass13_2.aByte14 == 1) {
				local14.aBoolean124 = true;
			}
			return local14;
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("93256, " + true + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method677() {
		try {
			@Pc(24) int local24;
			if (super.anInt1009 < 0 || super.anInt1012 != 0) {
				local24 = -1;
				if (super.anInt1006 >= 0) {
					local24 = Class27.aClass27Array1[super.anInt1006].anIntArray222[super.anInt1007];
				}
				return this.aClass13_2.method323(local24, -1, null);
			}
			local24 = Class27.aClass27Array1[super.anInt1009].anIntArray222[super.anInt1010];
			@Pc(26) int local26 = -1;
			if (super.anInt1006 >= 0 && super.anInt1006 != super.anInt990) {
				local26 = Class27.aClass27Array1[super.anInt1006].anIntArray222[super.anInt1007];
			}
			return this.aClass13_2.method323(local24, local26, Class27.aClass27Array1[super.anInt1009].anIntArray225);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("85599, " + 2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method675() {
		try {
			return this.aClass13_2 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("77498, " + 121 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
