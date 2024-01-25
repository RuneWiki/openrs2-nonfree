import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class108 {

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
	private int anInt2341;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "Lclient!efa;")
	private Class90 aClass90_5;

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "Lclient!efa;")
	public Class90 aClass90_6;

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "Ljava/lang/String;")
	private String aString34 = "null";

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Z")
	public boolean method1992(@OriginalArg(1) int arg0) {
		if (this.aClass90_6 == null) {
			return false;
		}
		if (this.aClass90_5 == null) {
			this.method1993();
		}
		@Pc(22) Class2_Sub44 local22 = (Class2_Sub44) this.aClass90_5.method1685((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	private void method1993() {
		this.aClass90_5 = new Class90(this.aClass90_6.method1681());
		for (@Pc(26) Class2_Sub44 local26 = (Class2_Sub44) this.aClass90_6.method1676(); local26 != null; local26 = (Class2_Sub44) this.aClass90_6.method1680()) {
			@Pc(35) Class2_Sub44 local35 = new Class2_Sub44((int) local26.aLong268);
			this.aClass90_5.method1684(local35, (long) local26.anInt7748);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method1994(@OriginalArg(0) Class2_Sub7 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4464();
			if (local14 == 0) {
				return;
			}
			this.method1999(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method1996(@OriginalArg(1) String arg0) {
		if (this.aClass90_6 == null) {
			return false;
		}
		if (this.aClass90_5 == null) {
			this.method2003();
		}
		for (@Pc(38) Class2_Sub46 local38 = (Class2_Sub46) this.aClass90_5.method1685(Static234.method3334(arg0)); local38 != null; local38 = (Class2_Sub46) this.aClass90_5.method1682()) {
			if (local38.aString123.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method1997(@OriginalArg(1) int arg0) {
		if (this.aClass90_6 == null) {
			return this.aString34;
		} else {
			@Pc(17) Class2_Sub17 local17 = (Class2_Sub17) this.aClass90_6.method1685((long) arg0);
			return local17 == null ? this.aString34 : local17.aString37;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!gk;II)V")
	private void method1999(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static581.method7528(arg0.method4477());
		} else if (arg1 == 2) {
			this.aChar3 = Static581.method7528(arg0.method4477());
		} else if (arg1 == 3) {
			this.aString34 = arg0.method4494();
		} else if (arg1 == 4) {
			this.anInt2341 = arg0.method4509();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(55) int local55 = arg0.method4518();
			this.aClass90_6 = new Class90(Static355.method5078(local55));
			for (@Pc(65) int local65 = 0; local65 < local55; local65++) {
				@Pc(71) int local71 = arg0.method4509();
				@Pc(81) Class2 local81;
				if (arg1 == 5) {
					local81 = new Class2_Sub17(arg0.method4494());
				} else {
					local81 = new Class2_Sub44(arg0.method4509());
				}
				this.aClass90_6.method1684(local81, (long) local71);
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)I")
	public int method2002(@OriginalArg(1) int arg0) {
		if (this.aClass90_6 == null) {
			return this.anInt2341;
		} else {
			@Pc(23) Class2_Sub44 local23 = (Class2_Sub44) this.aClass90_6.method1685((long) arg0);
			return local23 == null ? this.anInt2341 : local23.anInt7748;
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	private void method2003() {
		this.aClass90_5 = new Class90(this.aClass90_6.method1681());
		for (@Pc(28) Class2_Sub17 local28 = (Class2_Sub17) this.aClass90_6.method1676(); local28 != null; local28 = (Class2_Sub17) this.aClass90_6.method1680()) {
			@Pc(39) Class2_Sub46 local39 = new Class2_Sub46(local28.aString37, (int) local28.aLong268);
			this.aClass90_5.method1684(local39, Static234.method3334(local28.aString37));
		}
	}
}
