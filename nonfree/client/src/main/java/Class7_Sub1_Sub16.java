import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class7_Sub1_Sub16 extends Class7_Sub1 {

	@OriginalMember(owner = "client!th", name = "B", descriptor = "I")
	private int anInt5801;

	@OriginalMember(owner = "client!th", name = "D", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!th", name = "H", descriptor = "Lclient!aj;")
	private Class10 aClass10_47;

	@OriginalMember(owner = "client!th", name = "I", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!th", name = "Q", descriptor = "Lclient!aj;")
	public Class10 aClass10_48;

	@OriginalMember(owner = "client!th", name = "G", descriptor = "Ljava/lang/String;")
	private String aString372 = "null";

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4893(@OriginalArg(1) String arg0) {
		if (this.aClass10_48 == null) {
			return false;
		}
		if (this.aClass10_47 == null) {
			this.method4898();
		}
		for (@Pc(31) Class7_Sub21 local31 = (Class7_Sub21) this.aClass10_47.method163(Static132.method2665(arg0)); local31 != null; local31 = (Class7_Sub21) this.aClass10_47.method154()) {
			if (local31.aString239.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IILclient!ap;)V")
	private void method4894(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub3 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static224.method3944(arg1.method2779());
		} else if (arg0 == 2) {
			this.aChar5 = Static224.method3944(arg1.method2779());
		} else if (arg0 == 3) {
			this.aString372 = arg1.method2782();
		} else if (arg0 == 4) {
			this.anInt5801 = arg1.method2767();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(44) int local44 = arg1.method2764();
			this.aClass10_48 = new Class10(Static271.method4522(local44));
			for (@Pc(54) int local54 = 0; local54 < local44; local54++) {
				@Pc(59) int local59 = arg1.method2767();
				@Pc(71) Class7 local71;
				if (arg0 == 5) {
					local71 = new Class7_Sub30(arg1.method2782());
				} else {
					local71 = new Class7_Sub10(arg1.method2767());
				}
				this.aClass10_48.method161((long) local59, local71);
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method4895(@OriginalArg(1) int arg0) {
		if (this.aClass10_48 == null) {
			return this.aString372;
		} else {
			@Pc(22) Class7_Sub30 local22 = (Class7_Sub30) this.aClass10_48.method163((long) arg0);
			return local22 == null ? this.aString372 : local22.aString300;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)I")
	public int method4897(@OriginalArg(1) int arg0) {
		if (this.aClass10_48 == null) {
			return this.anInt5801;
		} else {
			@Pc(24) Class7_Sub10 local24 = (Class7_Sub10) this.aClass10_48.method163((long) arg0);
			return local24 == null ? this.anInt5801 : local24.anInt2111;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)V")
	private void method4898() {
		this.aClass10_47 = new Class10(this.aClass10_48.method164());
		for (@Pc(28) Class7_Sub30 local28 = (Class7_Sub30) this.aClass10_48.method157(); local28 != null; local28 = (Class7_Sub30) this.aClass10_48.method155()) {
			@Pc(38) Class7_Sub21 local38 = new Class7_Sub21(local28.aString300, (int) local28.aLong232);
			this.aClass10_47.method161(Static132.method2665(local28.aString300), local38);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BLclient!ap;)V")
	public void method4899(@OriginalArg(1) Class7_Sub3 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2772();
			if (local3 == 0) {
				return;
			}
			this.method4894(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)Z")
	public boolean method4900(@OriginalArg(1) int arg0) {
		if (this.aClass10_48 == null) {
			return false;
		}
		if (this.aClass10_47 == null) {
			this.method4901();
		}
		@Pc(24) Class7_Sub10 local24 = (Class7_Sub10) this.aClass10_47.method163((long) arg0);
		return local24 != null;
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
	private void method4901() {
		this.aClass10_47 = new Class10(this.aClass10_48.method164());
		for (@Pc(27) Class7_Sub10 local27 = (Class7_Sub10) this.aClass10_48.method157(); local27 != null; local27 = (Class7_Sub10) this.aClass10_48.method155()) {
			@Pc(35) Class7_Sub10 local35 = new Class7_Sub10((int) local27.aLong232);
			this.aClass10_47.method161((long) local27.anInt2111, local35);
		}
	}
}
