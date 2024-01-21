import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!z", name = "rb", descriptor = "Lclient!gc;")
	public Class13 aClass13_2;

	@OriginalMember(owner = "client!z", name = "qb", descriptor = "I")
	private int anInt1029 = 633;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			if (this.aClass13_2 == null) {
				return null;
			}
			@Pc(13) Class1_Sub1_Sub1_Sub5 local13 = this.method682();
			if (local13 == null) {
				return null;
			}
			super.anInt1023 = local13.anInt980;
			if (super.anInt1010 != -1 && super.anInt1011 != -1) {
				@Pc(34) Class33 local34 = Class33.aClass33Array1[super.anInt1010];
				@Pc(37) Class1_Sub1_Sub1_Sub5 local37 = local34.method523();
				if (local37 != null) {
					@Pc(46) int local46 = local34.aClass27_2.anIntArray225[super.anInt1011];
					@Pc(57) Class1_Sub1_Sub1_Sub5 local57 = new Class1_Sub1_Sub1_Sub5(false, local37, true, (byte) 119, Class12.method306(local46, (byte) 7));
					local57.method274(0, 0, -super.anInt1014);
					local57.method268();
					local57.method269(local46);
					local57.anIntArrayArray9 = null;
					local57.anIntArrayArray8 = null;
					if (local34.anInt820 != 128 || local34.anInt821 != 128) {
						local57.method277(local34.anInt820, local34.anInt820, local34.anInt821);
					}
					local57.method278(local34.anInt823 + 64, local34.anInt824 + 850, -30, -50, -30, true);
					@Pc(120) Class1_Sub1_Sub1_Sub5[] local120 = new Class1_Sub1_Sub1_Sub5[] { local13, local57 };
					local13 = new Class1_Sub1_Sub1_Sub5(local120, true, 2, true);
				}
			}
			if (this.aClass13_2.aByte20 == 1) {
				local13.aBoolean128 = true;
			}
			return local13;
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("21179, " + true + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(I)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method682() {
		try {
			@Pc(14) int local14;
			if (super.anInt1005 < 0 || super.anInt1008 != 0) {
				local14 = -1;
				if (super.anInt1002 >= 0) {
					local14 = Class27.aClass27Array1[super.anInt1002].anIntArray225[super.anInt1003];
				}
				return this.aClass13_2.method325((byte) 3, -1, local14, null);
			}
			local14 = Class27.aClass27Array1[super.anInt1005].anIntArray225[super.anInt1006];
			@Pc(16) int local16 = -1;
			if (super.anInt1002 >= 0 && super.anInt1002 != super.anInt986) {
				local16 = Class27.aClass27Array1[super.anInt1002].anIntArray225[super.anInt1003];
			}
			return this.aClass13_2.method325((byte) 3, local16, local14, Class27.aClass27Array1[super.anInt1005].anIntArray228);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("95363, " + 10728 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method680(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				throw new NullPointerException();
			}
			return this.aClass13_2 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("6263, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
