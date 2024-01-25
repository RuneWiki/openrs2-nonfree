import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class86 {

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Lclient!ae;")
	public Class9 aClass9_2;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	public int anInt1800 = 0;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	public int anInt1801 = 70;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	private int anInt1795 = -1;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
	public int anInt1809 = -1;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
	private int anInt1810 = -1;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
	public int anInt1812 = -1;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
	public int anInt1813 = 0;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	public int anInt1803 = -1;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
	public int anInt1807 = 0;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	private int anInt1796 = -1;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
	public int anInt1815 = 16777215;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	private int anInt1814 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ee;B)V")
	public void method1660(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method8645();
			if (local15 == 0) {
				return;
			}
			this.method1661(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ee;BI)V")
	private void method1661(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1803 = arg0.method8631();
		} else if (arg1 == 2) {
			this.anInt1815 = arg0.method8657();
		} else if (arg1 == 3) {
			this.anInt1814 = arg0.method8631();
		} else if (arg1 == 4) {
			this.anInt1795 = arg0.method8631();
		} else if (arg1 == 5) {
			this.anInt1810 = arg0.method8631();
		} else if (arg1 == 6) {
			this.anInt1796 = arg0.method8631();
		} else if (arg1 == 7) {
			this.anInt1807 = arg0.method8595();
		} else if (arg1 == 8) {
			this.aString30 = arg0.method8648();
		} else if (arg1 == 9) {
			this.anInt1801 = arg0.method8631();
		} else if (arg1 == 10) {
			this.anInt1800 = arg0.method8595();
		} else if (arg1 == 11) {
			this.anInt1812 = 0;
		} else if (arg1 == 12) {
			this.anInt1809 = arg0.method8645();
		} else if (arg1 == 13) {
			this.anInt1813 = arg0.method8595();
		} else if (arg1 == 14) {
			this.anInt1812 = arg0.method8631();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!ha;)Lclient!hu;")
	public Class44 method1662(@OriginalArg(1) Class126 arg0) {
		if (this.anInt1814 < 0) {
			return null;
		}
		@Pc(21) Class44 local21 = (Class44) this.aClass9_2.aClass293_2.method6921((long) this.anInt1814);
		if (local21 == null) {
			this.method1663(arg0);
			local21 = (Class44) this.aClass9_2.aClass293_2.method6921((long) this.anInt1814);
		}
		return local21;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ha;Z)V")
	private void method1663(@OriginalArg(0) Class126 arg0) {
		@Pc(7) Class384 local7 = this.aClass9_2.aClass384_4;
		@Pc(33) Class176 local33;
		if (this.anInt1814 >= 0 && this.aClass9_2.aClass293_2.method6921((long) this.anInt1814) == null && local7.method8883(this.anInt1814)) {
			local33 = Static654.method4049(local7, this.anInt1814);
			this.aClass9_2.aClass293_2.method6925((long) this.anInt1814, arg0.method6994(local33, true));
		}
		if (this.anInt1810 >= 0 && this.aClass9_2.aClass293_2.method6921((long) this.anInt1810) == null && local7.method8883(this.anInt1810)) {
			local33 = Static654.method4049(local7, this.anInt1810);
			this.aClass9_2.aClass293_2.method6925((long) this.anInt1810, arg0.method6994(local33, true));
		}
		if (this.anInt1795 >= 0 && this.aClass9_2.aClass293_2.method6921((long) this.anInt1795) == null && local7.method8883(this.anInt1795)) {
			local33 = Static654.method4049(local7, this.anInt1795);
			this.aClass9_2.aClass293_2.method6925((long) this.anInt1795, arg0.method6994(local33, true));
		}
		if (this.anInt1796 >= 0 && this.aClass9_2.aClass293_2.method6921((long) this.anInt1796) == null && local7.method8883(this.anInt1796)) {
			local33 = Static654.method4049(local7, this.anInt1796);
			this.aClass9_2.aClass293_2.method6925((long) this.anInt1796, arg0.method6994(local33, true));
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLclient!ha;)Lclient!hu;")
	public Class44 method1664(@OriginalArg(1) Class126 arg0) {
		if (this.anInt1810 < 0) {
			return null;
		}
		@Pc(18) Class44 local18 = (Class44) this.aClass9_2.aClass293_2.method6921((long) this.anInt1810);
		if (local18 == null) {
			this.method1663(arg0);
			local18 = (Class44) this.aClass9_2.aClass293_2.method6921((long) this.anInt1810);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(ILclient!ha;)Lclient!hu;")
	public Class44 method1665(@OriginalArg(1) Class126 arg0) {
		if (this.anInt1795 < 0) {
			return null;
		}
		@Pc(21) Class44 local21 = (Class44) this.aClass9_2.aClass293_2.method6921((long) this.anInt1795);
		if (local21 == null) {
			this.method1663(arg0);
			local21 = (Class44) this.aClass9_2.aClass293_2.method6921((long) this.anInt1795);
		}
		return local21;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method1668(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = this.aString30;
		while (true) {
			@Pc(18) int local18 = local8.indexOf("%1");
			if (local18 < 0) {
				return local8;
			}
			local8 = local8.substring(0, local18) + Static12.method233(arg0, false) + local8.substring(local18 + 2);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ha;I)Lclient!hu;")
	public Class44 method1669(@OriginalArg(0) Class126 arg0) {
		if (this.anInt1796 < 0) {
			return null;
		}
		@Pc(24) Class44 local24 = (Class44) this.aClass9_2.aClass293_2.method6921((long) this.anInt1796);
		if (local24 == null) {
			this.method1663(arg0);
			local24 = (Class44) this.aClass9_2.aClass293_2.method6921((long) this.anInt1796);
		}
		return local24;
	}
}
