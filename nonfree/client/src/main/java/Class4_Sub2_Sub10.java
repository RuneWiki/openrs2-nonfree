import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class4_Sub2_Sub10 extends Class4_Sub2 {

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "Lclient!lb;")
	private Class97 aClass97_5;

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
	private int anInt1857;

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "Lclient!lb;")
	public Class97 aClass97_6;

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "Ljava/lang/String;")
	private String aString55 = "null";

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!p;)V")
	public void method1435(@OriginalArg(1) Class4_Sub17 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1874();
			if (local14 == 0) {
				return;
			}
			this.method1442(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method1436(@OriginalArg(1) String arg0) {
		if (this.aClass97_6 == null) {
			return false;
		}
		if (this.aClass97_5 == null) {
			this.method1437();
		}
		for (@Pc(30) Class4_Sub31 local30 = (Class4_Sub31) this.aClass97_5.method2360(Static63.method967(arg0)); local30 != null; local30 = (Class4_Sub31) this.aClass97_5.method2361()) {
			if (local30.aString189.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V")
	private void method1437() {
		this.aClass97_5 = new Class97(this.aClass97_6.method2358());
		for (@Pc(16) Class4_Sub27 local16 = (Class4_Sub27) this.aClass97_6.method2363(); local16 != null; local16 = (Class4_Sub27) this.aClass97_6.method2367()) {
			@Pc(27) Class4_Sub31 local27 = new Class4_Sub31(local16.aString156, (int) local16.aLong200);
			this.aClass97_5.method2364(local27, Static63.method967(local16.aString156));
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)I")
	public int method1438(@OriginalArg(1) int arg0) {
		if (this.aClass97_6 == null) {
			return this.anInt1857;
		} else {
			@Pc(18) Class4_Sub19 local18 = (Class4_Sub19) this.aClass97_6.method2360((long) arg0);
			return local18 == null ? this.anInt1857 : local18.anInt2869;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!p;BI)V")
	private void method1442(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static259.method3916(arg0.method1892());
		} else if (arg1 == 2) {
			this.aChar3 = Static259.method3916(arg0.method1892());
		} else if (arg1 == 3) {
			this.aString55 = arg0.method1841();
		} else if (arg1 == 4) {
			this.anInt1857 = arg0.method1889();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(43) int local43 = arg0.method1837();
			this.aClass97_6 = new Class97(Static74.method1127(local43));
			for (@Pc(53) int local53 = 0; local53 < local43; local53++) {
				@Pc(64) int local64 = arg0.method1889();
				@Pc(76) Class4 local76;
				if (arg1 == 5) {
					local76 = new Class4_Sub27(arg0.method1841());
				} else {
					local76 = new Class4_Sub19(arg0.method1889());
				}
				this.aClass97_6.method2364(local76, (long) local64);
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)Z")
	public boolean method1443(@OriginalArg(0) int arg0) {
		if (this.aClass97_6 == null) {
			return false;
		}
		if (this.aClass97_5 == null) {
			this.method1444();
		}
		@Pc(28) Class4_Sub19 local28 = (Class4_Sub19) this.aClass97_5.method2360((long) arg0);
		return local28 != null;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)V")
	private void method1444() {
		this.aClass97_5 = new Class97(this.aClass97_6.method2358());
		for (@Pc(28) Class4_Sub19 local28 = (Class4_Sub19) this.aClass97_6.method2363(); local28 != null; local28 = (Class4_Sub19) this.aClass97_6.method2367()) {
			@Pc(38) Class4_Sub19 local38 = new Class4_Sub19((int) local28.aLong200);
			this.aClass97_5.method2364(local38, (long) local28.anInt2869);
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(BI)Ljava/lang/String;")
	public String method1445(@OriginalArg(1) int arg0) {
		if (this.aClass97_6 == null) {
			return this.aString55;
		} else {
			@Pc(23) Class4_Sub27 local23 = (Class4_Sub27) this.aClass97_6.method2360((long) arg0);
			return local23 == null ? this.aString55 : local23.aString156;
		}
	}
}
