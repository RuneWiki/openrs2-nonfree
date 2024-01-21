import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!z", name = "tb", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!z", name = "ub", descriptor = "Lclient!gc;")
	public Class13 aClass13_2;

	@OriginalMember(owner = "client!z", name = "rb", descriptor = "Z")
	private boolean aBoolean248 = true;

	@OriginalMember(owner = "client!z", name = "sb", descriptor = "B")
	private byte aByte35 = -84;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Lclient!eb;")
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
			super.anInt1029 = local8.anInt986;
			if (super.anInt1016 != -1 && super.anInt1017 != -1) {
				@Pc(41) Class33 local41 = Class33.aClass33Array1[super.anInt1016];
				@Pc(44) Class1_Sub1_Sub1_Sub5 local44 = local41.method523();
				if (local44 != null) {
					@Pc(53) int local53 = local41.aClass27_2.anIntArray225[super.anInt1017];
					@Pc(64) Class1_Sub1_Sub1_Sub5 local64 = new Class1_Sub1_Sub1_Sub5(Class12.method306(local53), false, true, local44, 0);
					local64.method274(-super.anInt1020, 0, 0);
					local64.method268();
					local64.method269(local53);
					local64.anIntArrayArray9 = null;
					local64.anIntArrayArray8 = null;
					if (local41.anInt830 != 128 || local41.anInt831 != 128) {
						local64.method277(local41.anInt830, local41.anInt830, local41.anInt831);
					}
					local64.method278(local41.anInt833 + 64, local41.anInt834 + 850, -30, -50, -30, true);
					@Pc(127) Class1_Sub1_Sub1_Sub5[] local127 = new Class1_Sub1_Sub1_Sub5[] { local8, local64 };
					local8 = new Class1_Sub1_Sub1_Sub5(2, local127, (byte) 80, true);
				}
			}
			if (this.aClass13_2.aByte16 == 1) {
				local8.aBoolean114 = true;
			}
			return local8;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("82060, " + -20 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method682() {
		try {
			@Pc(14) int local14;
			if (super.anInt1011 < 0 || super.anInt1014 != 0) {
				local14 = -1;
				if (super.anInt1008 >= 0) {
					local14 = Class27.aClass27Array1[super.anInt1008].anIntArray225[super.anInt1009];
				}
				return this.aClass13_2.method325(-1, null, local14);
			}
			local14 = Class27.aClass27Array1[super.anInt1011].anIntArray225[super.anInt1012];
			@Pc(16) int local16 = -1;
			if (super.anInt1008 >= 0 && super.anInt1008 != super.anInt992) {
				local16 = Class27.aClass27Array1[super.anInt1008].anIntArray225[super.anInt1009];
			}
			return this.aClass13_2.method325(local16, Class27.aClass27Array1[super.anInt1011].anIntArray228, local14);
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("44859, " + false + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method680() {
		try {
			if (this.aByte35 != -84) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			return this.aClass13_2 != null;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("18349, " + -84 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}
}
