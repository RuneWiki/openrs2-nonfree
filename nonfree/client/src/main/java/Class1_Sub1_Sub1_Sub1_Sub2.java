import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!z", name = "tb", descriptor = "Lclient!gc;")
	public Class13 aClass13_2;

	@OriginalMember(owner = "client!z", name = "qb", descriptor = "Z")
	private boolean aBoolean246 = true;

	@OriginalMember(owner = "client!z", name = "rb", descriptor = "I")
	private int anInt1028 = 6;

	@OriginalMember(owner = "client!z", name = "sb", descriptor = "I")
	private int anInt1029 = -262;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(B)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			if (this.aClass13_2 == null) {
				return null;
			}
			@Pc(9) Class1_Sub1_Sub1_Sub5 local9 = this.method682(this.anInt1029);
			if (local9 == null) {
				return null;
			}
			super.anInt1022 = local9.anInt979;
			if (super.anInt1009 != -1 && super.anInt1010 != -1) {
				@Pc(41) Class33 local41 = Class33.aClass33Array1[super.anInt1009];
				@Pc(44) Class1_Sub1_Sub1_Sub5 local44 = local41.method523();
				if (local44 != null) {
					@Pc(53) int local53 = local41.aClass27_2.anIntArray225[super.anInt1010];
					@Pc(64) Class1_Sub1_Sub1_Sub5 local64 = new Class1_Sub1_Sub1_Sub5(false, true, Class12.method306(local53), local44, 396);
					local64.method274(this.anInt1028, 0, -super.anInt1013, 0);
					local64.method268();
					local64.method269(local53);
					local64.anIntArrayArray9 = null;
					local64.anIntArrayArray8 = null;
					if (local41.anInt825 != 128 || local41.anInt826 != 128) {
						local64.method277(local41.anInt825, local41.anInt825, local41.anInt826);
					}
					local64.method278(local41.anInt828 + 64, local41.anInt829 + 850, -30, -50, -30, true);
					@Pc(128) Class1_Sub1_Sub1_Sub5[] local128 = new Class1_Sub1_Sub1_Sub5[] { local9, local64 };
					local9 = new Class1_Sub1_Sub1_Sub5(2, false, local128, true);
				}
			}
			if (this.aClass13_2.aByte18 == 1) {
				local9.aBoolean119 = true;
			}
			return local9;
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("97584, " + -67 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(I)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method682(@OriginalArg(0) int arg0) {
		try {
			@Pc(14) int local14;
			@Pc(16) int local16;
			if (super.anInt1004 >= 0 && super.anInt1007 == 0) {
				local14 = Class27.aClass27Array1[super.anInt1004].anIntArray225[super.anInt1005];
				local16 = -1;
				if (super.anInt1001 >= 0 && super.anInt1001 != super.anInt985) {
					local16 = Class27.aClass27Array1[super.anInt1001].anIntArray225[super.anInt1002];
				}
				return this.aClass13_2.method325(local14, Class27.aClass27Array1[super.anInt1004].anIntArray228, local16);
			}
			local14 = -1;
			if (arg0 >= 0) {
				for (local16 = 1; local16 > 0; local16++) {
				}
			}
			if (super.anInt1001 >= 0) {
				local14 = Class27.aClass27Array1[super.anInt1001].anIntArray225[super.anInt1002];
			}
			return this.aClass13_2.method325(local14, null, -1);
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("80587, " + arg0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method680() {
		try {
			return this.aClass13_2 != null;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("46423, " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}
}
