import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!ak", name = "M", descriptor = "Lclient!qb;")
	public Class142 aClass142_1;

	@OriginalMember(owner = "client!ak", name = "N", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!ak", name = "Q", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ak", name = "T", descriptor = "Lclient!qb;")
	private Class142 aClass142_2;

	@OriginalMember(owner = "client!ak", name = "E", descriptor = "Ljava/lang/String;")
	private String aString15 = "null";

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!lf;)V")
	public void method150(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1378();
			if (local13 == 0) {
				return;
			}
			this.method159(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)V")
	private void method151() {
		this.aClass142_2 = new Class142(this.aClass142_1.method3532());
		for (@Pc(25) Class1_Sub1 local25 = (Class1_Sub1) this.aClass142_1.method3534(); local25 != null; local25 = (Class1_Sub1) this.aClass142_1.method3530()) {
			@Pc(35) Class1_Sub1 local35 = new Class1_Sub1((int) local25.aLong214);
			this.aClass142_2.method3537(local35, (long) local25.anInt12);
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)Ljava/lang/String;")
	public String method152(@OriginalArg(0) int arg0) {
		if (this.aClass142_1 == null) {
			return this.aString15;
		} else {
			@Pc(26) Class1_Sub17 local26 = (Class1_Sub17) this.aClass142_1.method3543((long) arg0);
			return local26 == null ? this.aString15 : local26.aString105;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)I")
	public int method153(@OriginalArg(0) int arg0) {
		if (this.aClass142_1 == null) {
			return this.anInt159;
		} else {
			@Pc(18) Class1_Sub1 local18 = (Class1_Sub1) this.aClass142_1.method3543((long) arg0);
			return local18 == null ? this.anInt159 : local18.anInt12;
		}
	}

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(B)V")
	private void method154() {
		this.aClass142_2 = new Class142(this.aClass142_1.method3532());
		for (@Pc(24) Class1_Sub17 local24 = (Class1_Sub17) this.aClass142_1.method3534(); local24 != null; local24 = (Class1_Sub17) this.aClass142_1.method3530()) {
			@Pc(36) Class1_Sub13 local36 = new Class1_Sub13(local24.aString105, (int) local24.aLong214);
			this.aClass142_2.method3537(local36, Static31.method499(local24.aString105));
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method157(@OriginalArg(0) String arg0) {
		if (this.aClass142_1 == null) {
			return false;
		}
		if (this.aClass142_2 == null) {
			this.method154();
		}
		for (@Pc(33) Class1_Sub13 local33 = (Class1_Sub13) this.aClass142_2.method3543(Static31.method499(arg0)); local33 != null; local33 = (Class1_Sub13) this.aClass142_2.method3531()) {
			if (local33.aString74.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(IB)Z")
	public boolean method158(@OriginalArg(0) int arg0) {
		if (this.aClass142_1 == null) {
			return false;
		}
		if (this.aClass142_2 == null) {
			this.method151();
		}
		@Pc(30) Class1_Sub1 local30 = (Class1_Sub1) this.aClass142_2.method3543((long) arg0);
		return local30 != null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILclient!lf;)V")
	private void method159(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static242.method3805(arg1.method1363());
		} else if (arg0 == 2) {
			this.aChar1 = Static242.method3805(arg1.method1363());
		} else if (arg0 == 3) {
			this.aString15 = arg1.method1375();
		} else if (arg0 == 4) {
			this.anInt159 = arg1.method1392();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(45) int local45 = arg1.method1386();
			this.aClass142_1 = new Class142(Static218.method1098(local45));
			for (@Pc(55) int local55 = 0; local55 < local45; local55++) {
				@Pc(68) int local68 = arg1.method1392();
				@Pc(82) Class1 local82;
				if (arg0 == 5) {
					local82 = new Class1_Sub17(arg1.method1375());
				} else {
					local82 = new Class1_Sub1(arg1.method1392());
				}
				this.aClass142_1.method3537(local82, (long) local68);
			}
		}
	}
}
