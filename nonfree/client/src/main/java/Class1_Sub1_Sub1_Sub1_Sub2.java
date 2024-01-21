import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!z", name = "vb", descriptor = "Lclient!gc;")
	public Class13 aClass13_2;

	@OriginalMember(owner = "client!z", name = "tb", descriptor = "I")
	private int anInt1052 = 423;

	@OriginalMember(owner = "client!z", name = "ub", descriptor = "I")
	private int anInt1053 = -148;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.anInt1052 = 436;
			}
			if (this.aClass13_2 == null) {
				return null;
			}
			@Pc(14) Class1_Sub1_Sub1_Sub5 local14 = this.method682(this.anInt1053);
			if (local14 == null) {
				return null;
			}
			super.anInt1046 = local14.anInt1003;
			if (super.anInt1033 != -1 && super.anInt1034 != -1) {
				@Pc(35) Class33 local35 = Class33.aClass33Array1[super.anInt1033];
				@Pc(38) Class1_Sub1_Sub1_Sub5 local38 = local35.method523();
				if (local38 != null) {
					@Pc(47) int local47 = local35.aClass27_2.anIntArray225[super.anInt1034];
					@Pc(58) Class1_Sub1_Sub1_Sub5 local58 = new Class1_Sub1_Sub1_Sub5(local38, true, false, Class12.method306(local47), 0);
					local58.method274(-super.anInt1037, 0, 0);
					local58.method268();
					local58.method269(428, local47);
					local58.anIntArrayArray9 = null;
					local58.anIntArrayArray8 = null;
					if (local35.anInt844 != 128 || local35.anInt845 != 128) {
						local58.method277((byte) 4, local35.anInt845, local35.anInt844, local35.anInt844);
					}
					local58.method278(local35.anInt847 + 64, local35.anInt848 + 850, -30, -50, -30, true);
					@Pc(121) Class1_Sub1_Sub1_Sub5[] local121 = new Class1_Sub1_Sub1_Sub5[] { local14, local58 };
					local14 = new Class1_Sub1_Sub1_Sub5(true, local121, (byte) 4, 2);
				}
			}
			if (this.aClass13_2.aByte16 == 1) {
				local14.aBoolean122 = true;
			}
			return local14;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("60321, " + arg0 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "c", descriptor = "(I)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method682(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
			@Pc(20) int local20;
			if (super.anInt1028 < 0 || super.anInt1031 != 0) {
				local20 = -1;
				if (super.anInt1025 >= 0) {
					local20 = Class27.aClass27Array1[super.anInt1025].anIntArray225[super.anInt1026];
				}
				return this.aClass13_2.method325(local20, 175, -1, null);
			}
			local20 = Class27.aClass27Array1[super.anInt1028].anIntArray225[super.anInt1029];
			@Pc(22) int local22 = -1;
			if (super.anInt1025 >= 0 && super.anInt1025 != super.anInt1009) {
				local22 = Class27.aClass27Array1[super.anInt1025].anIntArray225[super.anInt1026];
			}
			return this.aClass13_2.method325(local20, 175, local22, Class27.aClass27Array1[super.anInt1028].anIntArray228);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("27987, " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method680() {
		try {
			return this.aClass13_2 != null;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("94216, " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}
}
