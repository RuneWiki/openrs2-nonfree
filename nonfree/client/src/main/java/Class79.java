import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class79 {

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "Lclient!fe;")
	private Class74 aClass74_11;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
	private int anInt2441;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "Lclient!fe;")
	public Class74 aClass74_12;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "Ljava/lang/String;")
	private String aString18 = "null";

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)I")
	public int method2008(@OriginalArg(1) int arg0) {
		if (this.aClass74_12 == null) {
			return this.anInt2441;
		} else {
			@Pc(25) Class6_Sub39 local25 = (Class6_Sub39) this.aClass74_12.method1883((long) arg0);
			return local25 == null ? this.anInt2441 : local25.anInt6429;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
	private void method2009() {
		this.aClass74_11 = new Class74(this.aClass74_12.method1884());
		for (@Pc(22) Class6_Sub13 local22 = (Class6_Sub13) this.aClass74_12.method1889(); local22 != null; local22 = (Class6_Sub13) this.aClass74_12.method1881()) {
			@Pc(33) Class6_Sub24 local33 = new Class6_Sub24(local22.aString13, (int) local22.aLong229);
			this.aClass74_11.method1890(Static127.method2263(local22.aString13), local33);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method2010(@OriginalArg(0) String arg0) {
		if (this.aClass74_12 == null) {
			return false;
		}
		if (this.aClass74_11 == null) {
			this.method2009();
		}
		for (@Pc(30) Class6_Sub24 local30 = (Class6_Sub24) this.aClass74_11.method1883(Static127.method2263(arg0)); local30 != null; local30 = (Class6_Sub24) this.aClass74_11.method1882()) {
			if (local30.aString31.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)Z")
	public boolean method2012(@OriginalArg(0) int arg0) {
		if (this.aClass74_12 == null) {
			return false;
		}
		if (this.aClass74_11 == null) {
			this.method2017();
		}
		@Pc(27) Class6_Sub39 local27 = (Class6_Sub39) this.aClass74_11.method1883((long) arg0);
		return local27 != null;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!ae;II)V")
	private void method2013(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static199.method3102(arg0.method6438());
		} else if (arg1 == 2) {
			this.aChar2 = Static199.method3102(arg0.method6438());
		} else if (arg1 == 3) {
			this.aString18 = arg0.method6473();
		} else if (arg1 == 4) {
			this.anInt2441 = arg0.method6442();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(45) int local45 = arg0.method6485();
			this.aClass74_12 = new Class74(Static52.method1203(local45));
			for (@Pc(55) int local55 = 0; local55 < local45; local55++) {
				@Pc(61) int local61 = arg0.method6442();
				@Pc(73) Class6 local73;
				if (arg1 == 5) {
					local73 = new Class6_Sub13(arg0.method6473());
				} else {
					local73 = new Class6_Sub39(arg0.method6442());
				}
				this.aClass74_12.method1890((long) local61, local73);
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method2014(@OriginalArg(0) int arg0) {
		if (this.aClass74_12 == null) {
			return this.aString18;
		} else {
			@Pc(17) Class6_Sub13 local17 = (Class6_Sub13) this.aClass74_12.method1883((long) arg0);
			return local17 == null ? this.aString18 : local17.aString13;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!ae;B)V")
	public void method2015(@OriginalArg(0) Class6_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6433();
			if (local5 == 0) {
				return;
			}
			this.method2013(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
	private void method2017() {
		this.aClass74_11 = new Class74(this.aClass74_12.method1884());
		for (@Pc(24) Class6_Sub39 local24 = (Class6_Sub39) this.aClass74_12.method1889(); local24 != null; local24 = (Class6_Sub39) this.aClass74_12.method1881()) {
			@Pc(33) Class6_Sub39 local33 = new Class6_Sub39((int) local24.aLong229);
			this.aClass74_11.method1890((long) local24.anInt6429, local33);
		}
	}
}
