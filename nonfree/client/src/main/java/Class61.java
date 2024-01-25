import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class61 {

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "Lclient!jo;")
	private Class187 aClass187_13;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "Lclient!jo;")
	public Class187 aClass187_14;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
	private int anInt1753;

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
	private int anInt1757;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "Ljava/lang/String;")
	private String aString16 = "null";

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)Z")
	public boolean method1487(@OriginalArg(1) int arg0) {
		if (this.aClass187_14 == null) {
			return false;
		}
		if (this.aClass187_13 == null) {
			this.method1492();
		}
		@Pc(31) Class14_Sub18 local31 = (Class14_Sub18) this.aClass187_13.method4078((long) arg0);
		return local31 != null;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!so;Z)V")
	public void method1489(@OriginalArg(0) Class14_Sub29 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5866();
			if (local11 == 0) {
				return;
			}
			this.method1497(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)I")
	public int method1490(@OriginalArg(1) int arg0) {
		if (this.aClass187_14 == null) {
			return this.anInt1757;
		} else {
			@Pc(19) Class14_Sub18 local19 = (Class14_Sub18) this.aClass187_14.method4078((long) arg0);
			return local19 == null ? this.anInt1757 : local19.anInt2644;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
	private void method1492() {
		this.aClass187_13 = new Class187(this.aClass187_14.method4088());
		for (@Pc(20) Class14_Sub18 local20 = (Class14_Sub18) this.aClass187_14.method4079(); local20 != null; local20 = (Class14_Sub18) this.aClass187_14.method4084()) {
			@Pc(29) Class14_Sub18 local29 = new Class14_Sub18((int) local20.aLong305);
			this.aClass187_13.method4077((long) local20.anInt2644, local29);
		}
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(II)Ljava/lang/String;")
	public String method1493(@OriginalArg(0) int arg0) {
		if (this.aClass187_14 == null) {
			return this.aString16;
		} else {
			@Pc(25) Class14_Sub17 local25 = (Class14_Sub17) this.aClass187_14.method4078((long) arg0);
			return local25 == null ? this.aString16 : local25.aString26;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1494(@OriginalArg(0) String arg0) {
		if (this.aClass187_14 == null) {
			return false;
		}
		if (this.aClass187_13 == null) {
			this.method1496();
		}
		for (@Pc(25) Class14_Sub34 local25 = (Class14_Sub34) this.aClass187_13.method4078(Static310.method4521(arg0)); local25 != null; local25 = (Class14_Sub34) this.aClass187_13.method4086()) {
			if (local25.aString75.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
	private void method1496() {
		this.aClass187_13 = new Class187(this.aClass187_14.method4088());
		for (@Pc(20) Class14_Sub17 local20 = (Class14_Sub17) this.aClass187_14.method4079(); local20 != null; local20 = (Class14_Sub17) this.aClass187_14.method4084()) {
			@Pc(31) Class14_Sub34 local31 = new Class14_Sub34(local20.aString26, (int) local20.aLong305);
			this.aClass187_13.method4077(Static310.method4521(local20.aString26), local31);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!so;I)V")
	private void method1497(@OriginalArg(1) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static462.method6790(arg0.method5845());
		} else if (arg1 == 2) {
			this.aChar1 = Static462.method6790(arg0.method5845());
		} else if (arg1 == 3) {
			this.aString16 = arg0.method5898();
		} else if (arg1 == 4) {
			this.anInt1757 = arg0.method5878();
		} else if (arg1 == 5 || arg1 == 6) {
			this.anInt1753 = arg0.method5900();
			this.aClass187_14 = new Class187(Static330.method5181(this.anInt1753));
			for (@Pc(77) int local77 = 0; local77 < this.anInt1753; local77++) {
				@Pc(83) int local83 = arg0.method5878();
				@Pc(97) Class14 local97;
				if (arg1 == 5) {
					local97 = new Class14_Sub17(arg0.method5898());
				} else {
					local97 = new Class14_Sub18(arg0.method5878());
				}
				this.aClass187_14.method4077((long) local83, local97);
			}
		}
	}
}
