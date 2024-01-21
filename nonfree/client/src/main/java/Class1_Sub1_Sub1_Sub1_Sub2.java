import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!z", name = "rb", descriptor = "Lclient!gc;")
	public Class13 aClass13_2;

	@OriginalMember(owner = "client!z", name = "qb", descriptor = "Z")
	private boolean aBoolean267 = true;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Z)Lclient!eb;")
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
			super.anInt1003 = local8.anInt961;
			if (super.anInt990 != -1 && super.anInt991 != -1) {
				@Pc(35) Class33 local35 = Class33.aClass33Array1[super.anInt990];
				@Pc(38) Class1_Sub1_Sub1_Sub5 local38 = local35.method523();
				if (local38 != null) {
					@Pc(47) int local47 = local35.aClass27_2.anIntArray225[super.anInt991];
					@Pc(58) Class1_Sub1_Sub1_Sub5 local58 = new Class1_Sub1_Sub1_Sub5(false, 201, local38, Class12.method306(local47), true);
					local58.method274(0, -super.anInt994, 0);
					local58.method268();
					local58.method269(local47);
					local58.anIntArrayArray9 = null;
					local58.anIntArrayArray8 = null;
					if (local35.anInt806 != 128 || local35.anInt807 != 128) {
						local58.method277(local35.anInt806, local35.anInt807, local35.anInt806);
					}
					local58.method278(local35.anInt809 + 64, local35.anInt810 + 850, -30, -50, -30, true);
					@Pc(121) Class1_Sub1_Sub1_Sub5[] local121 = new Class1_Sub1_Sub1_Sub5[] { local8, local58 };
					local8 = new Class1_Sub1_Sub1_Sub5((byte) 60, local121, true, 2);
				}
			}
			if (this.aClass13_2.aByte18 == 1) {
				local8.aBoolean123 = true;
			}
			return local8;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("73481, " + true + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "c", descriptor = "(I)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method682() {
		try {
			@Pc(14) int local14;
			if (super.anInt985 < 0 || super.anInt988 != 0) {
				local14 = -1;
				if (super.anInt982 >= 0) {
					local14 = Class27.aClass27Array1[super.anInt982].anIntArray225[super.anInt983];
				}
				return this.aClass13_2.method325(-1, local14, null);
			}
			local14 = Class27.aClass27Array1[super.anInt985].anIntArray225[super.anInt986];
			@Pc(16) int local16 = -1;
			if (super.anInt982 >= 0 && super.anInt982 != super.anInt966) {
				local16 = Class27.aClass27Array1[super.anInt982].anIntArray225[super.anInt983];
			}
			return this.aClass13_2.method325(local16, local14, Class27.aClass27Array1[super.anInt985].anIntArray228);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("40590, " + -314 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method680() {
		try {
			return this.aClass13_2 != null;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("80445, " + 8 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}
}
