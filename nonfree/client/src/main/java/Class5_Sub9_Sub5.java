import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class5_Sub9_Sub5 extends Class5_Sub9 {

	@OriginalMember(owner = "client!f", name = "s", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!f", name = "y", descriptor = "Lclient!cs;")
	private Class42 aClass42_13;

	@OriginalMember(owner = "client!f", name = "B", descriptor = "I")
	private int anInt1902;

	@OriginalMember(owner = "client!f", name = "K", descriptor = "Lclient!cs;")
	public Class42 aClass42_14;

	@OriginalMember(owner = "client!f", name = "E", descriptor = "Ljava/lang/String;")
	private String aString110 = "null";

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)Z")
	public boolean method1759(@OriginalArg(1) int arg0) {
		if (this.aClass42_14 == null) {
			return false;
		}
		if (this.aClass42_13 == null) {
			this.method1766();
		}
		@Pc(28) Class5_Sub37 local28 = (Class5_Sub37) this.aClass42_13.method1052((long) arg0);
		return local28 != null;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(BI)I")
	public int method1761(@OriginalArg(1) int arg0) {
		if (this.aClass42_14 == null) {
			return this.anInt1902;
		} else {
			@Pc(24) Class5_Sub37 local24 = (Class5_Sub37) this.aClass42_14.method1052((long) arg0);
			return local24 == null ? this.anInt1902 : local24.anInt5532;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!bk;IZ)V")
	private void method1762(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static88.method1387(arg0.method1863());
		} else if (arg1 == 2) {
			this.aChar3 = Static88.method1387(arg0.method1863());
		} else if (arg1 == 3) {
			this.aString110 = arg0.method1840();
		} else if (arg1 == 4) {
			this.anInt1902 = arg0.method1826();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(60) int local60 = arg0.method1845();
			this.aClass42_14 = new Class42(Static266.method4535(local60));
			for (@Pc(74) int local74 = 0; local74 < local60; local74++) {
				@Pc(80) int local80 = arg0.method1826();
				@Pc(92) Class5 local92;
				if (arg1 == 5) {
					local92 = new Class5_Sub30(arg0.method1840());
				} else {
					local92 = new Class5_Sub37(arg0.method1826());
				}
				this.aClass42_14.method1050((long) local80, local92);
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!bk;)V")
	public void method1763(@OriginalArg(1) Class5_Sub1 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1832();
			if (local9 == 0) {
				return;
			}
			this.method1762(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(BI)Ljava/lang/String;")
	public String method1764(@OriginalArg(1) int arg0) {
		if (this.aClass42_14 == null) {
			return this.aString110;
		} else {
			@Pc(17) Class5_Sub30 local17 = (Class5_Sub30) this.aClass42_14.method1052((long) arg0);
			return local17 == null ? this.aString110 : local17.aString227;
		}
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
	private void method1766() {
		this.aClass42_13 = new Class42(this.aClass42_14.method1051());
		for (@Pc(26) Class5_Sub37 local26 = (Class5_Sub37) this.aClass42_14.method1060(); local26 != null; local26 = (Class5_Sub37) this.aClass42_14.method1055()) {
			@Pc(35) Class5_Sub37 local35 = new Class5_Sub37((int) local26.aLong218);
			this.aClass42_13.method1050((long) local26.anInt5532, local35);
		}
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
	private void method1767() {
		this.aClass42_13 = new Class42(this.aClass42_14.method1051());
		for (@Pc(26) Class5_Sub30 local26 = (Class5_Sub30) this.aClass42_14.method1060(); local26 != null; local26 = (Class5_Sub30) this.aClass42_14.method1055()) {
			@Pc(37) Class5_Sub42 local37 = new Class5_Sub42(local26.aString227, (int) local26.aLong218);
			this.aClass42_13.method1050(Static193.method3495(local26.aString227), local37);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method1768(@OriginalArg(0) String arg0) {
		if (this.aClass42_14 == null) {
			return false;
		}
		if (this.aClass42_13 == null) {
			this.method1767();
		}
		for (@Pc(25) Class5_Sub42 local25 = (Class5_Sub42) this.aClass42_13.method1052(Static193.method3495(arg0)); local25 != null; local25 = (Class5_Sub42) this.aClass42_13.method1057()) {
			if (local25.aString367.equals(arg0)) {
				return true;
			}
		}
		return false;
	}
}
