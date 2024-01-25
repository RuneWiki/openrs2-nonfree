import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!en", name = "n", descriptor = "I")
	public int anInt1709;

	@OriginalMember(owner = "client!en", name = "o", descriptor = "I")
	public int anInt1710;

	@OriginalMember(owner = "client!en", name = "p", descriptor = "I")
	public int anInt1711;

	@OriginalMember(owner = "client!en", name = "q", descriptor = "I")
	public int anInt1712;

	@OriginalMember(owner = "client!en", name = "r", descriptor = "I")
	public int anInt1713;

	@OriginalMember(owner = "client!en", name = "t", descriptor = "I")
	public int anInt1715;

	@OriginalMember(owner = "client!en", name = "u", descriptor = "I")
	public int anInt1716;

	@OriginalMember(owner = "client!en", name = "w", descriptor = "I")
	public int anInt1717;

	@OriginalMember(owner = "client!en", name = "x", descriptor = "I")
	public int anInt1718;

	@OriginalMember(owner = "client!en", name = "y", descriptor = "I")
	public int anInt1719;

	@OriginalMember(owner = "client!en", name = "A", descriptor = "I")
	public int anInt1720;

	@OriginalMember(owner = "client!en", name = "B", descriptor = "I")
	public int anInt1721;

	@OriginalMember(owner = "client!en", name = "C", descriptor = "I")
	public int anInt1722;

	@OriginalMember(owner = "client!en", name = "E", descriptor = "I")
	public int anInt1723;

	@OriginalMember(owner = "client!en", name = "F", descriptor = "I")
	public int anInt1724;

	static {
		new Class119("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	public Class57 method1490(@OriginalArg(1) Class34 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = Static258.anIntArray470[this.anInt1724];
		if (local8 == 0) {
			@Pc(114) Class25_Sub4 local114 = Static337.method4524(this.anInt1723, this.anInt1720, this.anInt1721);
			if (local114 instanceof Class25_Sub4_Sub3) {
				@Pc(120) Class25_Sub4_Sub3 local120 = (Class25_Sub4_Sub3) local114;
				if (local120.aClass25_Sub4_3 != null) {
					return ((Interface8) local120.aClass25_Sub4_3).method4618(arg1, arg0);
				}
			}
		} else if (local8 == 1) {
			@Pc(21) Class25_Sub1 local21 = Static165.method2380(this.anInt1723, this.anInt1720, this.anInt1721);
			if (local21 instanceof Class25_Sub1_Sub1) {
				@Pc(27) Class25_Sub1_Sub1 local27 = (Class25_Sub1_Sub1) local21;
				if (local27.aClass25_Sub1_1 != null) {
					return ((Interface8) local27.aClass25_Sub1_1).method4618(arg1, arg0);
				}
			}
		} else if (local8 == 2) {
			@Pc(89) Class25_Sub5 local89 = Static364.method2862(this.anInt1723, this.anInt1720, this.anInt1721, mh.class);
			if (local89 instanceof Class25_Sub5_Sub6) {
				@Pc(95) Class25_Sub5_Sub6 local95 = (Class25_Sub5_Sub6) local89;
				if (local95.aClass25_Sub5_2 != null) {
					return ((Interface8) local95.aClass25_Sub5_2).method4618(arg1, arg0);
				}
			}
		} else if (local8 == 3) {
			@Pc(56) Class25_Sub2 local56 = Static231.method3312(this.anInt1723, this.anInt1720, this.anInt1721);
			if (local56 instanceof Class25_Sub2_Sub3) {
				@Pc(62) Class25_Sub2_Sub3 local62 = (Class25_Sub2_Sub3) local56;
				if (local62.aClass25_Sub2_1 != null) {
					return ((Interface8) local62.aClass25_Sub2_1).method4618(arg1, arg0);
				}
			}
		}
		return null;
	}
}
