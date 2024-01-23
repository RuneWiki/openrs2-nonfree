import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class1_Sub1_Sub22 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
	private int anInt5357;

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "Lclient!s;")
	public Class156 aClass156_26;

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "Lclient!s;")
	private Class156 aClass156_27;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Ljava/lang/String;")
	private String aString175 = "null";

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	public int method4173(@OriginalArg(0) int arg0) {
		if (this.aClass156_26 == null) {
			return this.anInt5357;
		} else {
			@Pc(25) Class1_Sub13 local25 = (Class1_Sub13) this.aClass156_26.method3821((long) arg0);
			return local25 == null ? this.anInt5357 : local25.anInt2852;
		}
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V")
	private void method4174() {
		this.aClass156_27 = new Class156(this.aClass156_26.method3829());
		for (@Pc(20) Class1_Sub25 local20 = (Class1_Sub25) this.aClass156_26.method3822(); local20 != null; local20 = (Class1_Sub25) this.aClass156_26.method3820()) {
			@Pc(32) Class1_Sub3 local32 = new Class1_Sub3(local20.aString147, (int) local20.aLong223);
			this.aClass156_27.method3816(Static87.method1301(local20.aString147), local32);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method4175(@OriginalArg(1) String arg0) {
		if (this.aClass156_26 == null) {
			return false;
		}
		if (this.aClass156_27 == null) {
			this.method4174();
		}
		for (@Pc(34) Class1_Sub3 local34 = (Class1_Sub3) this.aClass156_27.method3821(Static87.method1301(arg0)); local34 != null; local34 = (Class1_Sub3) this.aClass156_27.method3823()) {
			if (local34.aString9.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IZ)Z")
	public boolean method4176(@OriginalArg(0) int arg0) {
		if (this.aClass156_26 == null) {
			return false;
		}
		if (this.aClass156_27 == null) {
			this.method4180();
		}
		@Pc(31) Class1_Sub13 local31 = (Class1_Sub13) this.aClass156_27.method3821((long) arg0);
		return local31 != null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method4177(@OriginalArg(1) int arg0) {
		if (this.aClass156_26 == null) {
			return this.aString175;
		} else {
			@Pc(24) Class1_Sub25 local24 = (Class1_Sub25) this.aClass156_26.method3821((long) arg0);
			return local24 == null ? this.aString175 : local24.aString147;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!sb;II)V")
	private void method4178(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static16.method215(arg0.method2598());
		} else if (arg1 == 2) {
			this.aChar5 = Static16.method215(arg0.method2598());
		} else if (arg1 == 3) {
			this.aString175 = arg0.method2605();
		} else if (arg1 == 4) {
			this.anInt5357 = arg0.method2647();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(65) int local65 = arg0.method2593();
			this.aClass156_26 = new Class156(Static203.method3254(local65));
			for (@Pc(75) int local75 = 0; local75 < local65; local75++) {
				@Pc(84) int local84 = arg0.method2647();
				@Pc(96) Class1 local96;
				if (arg1 == 5) {
					local96 = new Class1_Sub25(arg0.method2605());
				} else {
					local96 = new Class1_Sub13(arg0.method2647());
				}
				this.aClass156_26.method3816((long) local84, local96);
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!sb;)V")
	public void method4179(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2595();
			if (local12 == 0) {
				return;
			}
			this.method4178(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	private void method4180() {
		this.aClass156_27 = new Class156(this.aClass156_26.method3829());
		for (@Pc(20) Class1_Sub13 local20 = (Class1_Sub13) this.aClass156_26.method3822(); local20 != null; local20 = (Class1_Sub13) this.aClass156_26.method3820()) {
			@Pc(30) Class1_Sub13 local30 = new Class1_Sub13((int) local20.aLong223);
			this.aClass156_27.method3816((long) local20.anInt2852, local30);
		}
	}
}
