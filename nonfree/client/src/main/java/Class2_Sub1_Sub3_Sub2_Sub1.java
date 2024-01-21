import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ITIWVLHR")
public final class Class2_Sub1_Sub3_Sub2_Sub1 extends Class2_Sub1_Sub3_Sub2 {

	@OriginalMember(owner = "client!ITIWVLHR", name = "qb", descriptor = "Lclient!EKQCVRVG;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!ITIWVLHR", name = "ob", descriptor = "Z")
	private boolean aBoolean74 = true;

	@OriginalMember(owner = "client!ITIWVLHR", name = "pb", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!ITIWVLHR", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method249() {
		try {
			return this.aClass10_1 != null;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("66900, " + 43 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ITIWVLHR", name = "a", descriptor = "(Z)Lclient!WRJMHIDY;")
	@Override
	protected Class2_Sub1_Sub3_Sub5 method510() {
		try {
			if (this.aClass10_1 == null) {
				return null;
			}
			@Pc(8) Class2_Sub1_Sub3_Sub5 local8 = this.method151();
			if (local8 == null) {
				return null;
			}
			super.anInt406 = local8.anInt730;
			if (super.anInt411 != -1 && super.anInt412 != -1) {
				@Pc(38) Class37 local38 = Class37.aClass37Array1[super.anInt411];
				@Pc(41) Class2_Sub1_Sub3_Sub5 local41 = local38.method397();
				if (local41 != null) {
					@Pc(50) int local50 = local38.aClass23_2.anIntArray82[super.anInt412];
					@Pc(61) Class2_Sub1_Sub3_Sub5 local61 = new Class2_Sub1_Sub3_Sub5(local41, true, false, Class31.method295(local50, (byte) 6), (byte) 0);
					local61.method436(0, 0, -super.anInt415);
					local61.method430();
					local61.method431(local50);
					local61.anIntArrayArray12 = null;
					local61.anIntArrayArray11 = null;
					if (local38.anInt620 != 128 || local38.anInt621 != 128) {
						local61.method439(this.aBoolean74, local38.anInt620, local38.anInt620, local38.anInt621);
					}
					local61.method440(local38.anInt623 + 64, local38.anInt624 + 850, -30, -50, -30, true);
					@Pc(125) Class2_Sub1_Sub3_Sub5[] local125 = new Class2_Sub1_Sub3_Sub5[] { local8, local61 };
					local8 = new Class2_Sub1_Sub3_Sub5(-8047, true, 2, local125);
				}
			}
			if (this.aClass10_1.aByte9 == 1) {
				local8.aBoolean184 = true;
			}
			return local8;
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("82278, " + false + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ITIWVLHR", name = "b", descriptor = "(Z)Lclient!WRJMHIDY;")
	private Class2_Sub1_Sub3_Sub5 method151() {
		try {
			@Pc(20) int local20;
			if (super.anInt418 < 0 || super.anInt421 != 0) {
				local20 = -1;
				if (super.anInt407 >= 0) {
					local20 = Class23.aClass23Array1[super.anInt407].anIntArray82[super.anInt408];
				}
				return this.aClass10_1.method104(local20, -1, null);
			}
			local20 = Class23.aClass23Array1[super.anInt418].anIntArray82[super.anInt419];
			@Pc(22) int local22 = -1;
			if (super.anInt407 >= 0 && super.anInt407 != super.anInt391) {
				local22 = Class23.aClass23Array1[super.anInt407].anIntArray82[super.anInt408];
			}
			return this.aClass10_1.method104(local20, local22, Class23.aClass23Array1[super.anInt418].anIntArray85);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("6276, " + true + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
