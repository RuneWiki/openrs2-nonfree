import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class5_Sub11 extends Class5 {

	@OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
	public int anInt1511;

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
	public int anInt1512;

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
	public int anInt1514;

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
	public int anInt1515;

	@OriginalMember(owner = "client!dt", name = "q", descriptor = "I")
	public int anInt1517;

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
	public int anInt1518;

	@OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
	public int anInt1521;

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
	public int anInt1522;

	@OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
	public int anInt1523;

	@OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
	public int anInt1524;

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "I")
	public int anInt1525;

	@OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
	public int anInt1526;

	@OriginalMember(owner = "client!dt", name = "A", descriptor = "I")
	public int anInt1527;

	@OriginalMember(owner = "client!dt", name = "C", descriptor = "I")
	public int anInt1528;

	@OriginalMember(owner = "client!dt", name = "D", descriptor = "I")
	public int anInt1529;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILclient!za;)Lclient!e;")
	public Class57 method1240(@OriginalArg(0) int arg0, @OriginalArg(2) Class200 arg1) {
		@Pc(8) int local8 = Static30.anIntArray25[this.anInt1529];
		if (local8 == 0) {
			@Pc(117) Class2_Sub4 local117 = Static73.method1080(this.anInt1524, this.anInt1515, this.anInt1523);
			if (local117 instanceof Class2_Sub4_Sub3) {
				@Pc(123) Class2_Sub4_Sub3 local123 = (Class2_Sub4_Sub3) local117;
				if (local123.aClass2_Sub4_1 != null) {
					return ((Interface2) local123.aClass2_Sub4_1).method6038(arg1, arg0);
				}
			}
		} else if (local8 == 1) {
			@Pc(92) Class2_Sub2 local92 = Static173.method2392(this.anInt1524, this.anInt1515, this.anInt1523);
			if (local92 instanceof Class2_Sub2_Sub3) {
				@Pc(98) Class2_Sub2_Sub3 local98 = (Class2_Sub2_Sub3) local92;
				if (local98.aClass2_Sub2_1 != null) {
					return ((Interface2) local98.aClass2_Sub2_1).method6038(arg1, arg0);
				}
			}
		} else if (local8 == 2) {
			@Pc(67) Class2_Sub1 local67 = Static12.method194(this.anInt1524, this.anInt1515, this.anInt1523, bs.class);
			if (local67 instanceof Class2_Sub1_Sub5) {
				@Pc(73) Class2_Sub1_Sub5 local73 = (Class2_Sub1_Sub5) local67;
				if (local73.aClass2_Sub1_2 != null) {
					return ((Interface2) local73.aClass2_Sub1_2).method6038(arg1, arg0);
				}
			}
		} else if (local8 == 3) {
			@Pc(34) Class2_Sub3 local34 = Static285.method3519(this.anInt1524, this.anInt1515, this.anInt1523);
			if (local34 instanceof Class2_Sub3_Sub3) {
				@Pc(40) Class2_Sub3_Sub3 local40 = (Class2_Sub3_Sub3) local34;
				if (local40.aClass2_Sub3_1 != null) {
					return ((Interface2) local40.aClass2_Sub3_1).method6038(arg1, arg0);
				}
			}
		}
		return null;
	}
}
