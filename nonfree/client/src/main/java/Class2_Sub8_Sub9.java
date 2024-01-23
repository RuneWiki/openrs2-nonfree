import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class2_Sub8_Sub9 extends Class2_Sub8 {

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
	private int anInt2666;

	@OriginalMember(owner = "client!ie", name = "D", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!ie", name = "F", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ie", name = "I", descriptor = "Lclient!l;")
	private Class101 aClass101_6;

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "Lclient!l;")
	public Class101 aClass101_7;

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "Ljava/lang/String;")
	private String aString94 = "null";

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method2023(@OriginalArg(0) String arg0) {
		if (this.aClass101_7 == null) {
			return false;
		}
		if (this.aClass101_6 == null) {
			this.method2024();
		}
		for (@Pc(31) Class2_Sub20 local31 = (Class2_Sub20) this.aClass101_6.method2867(Static146.method2600(arg0)); local31 != null; local31 = (Class2_Sub20) this.aClass101_6.method2858()) {
			if (local31.aString125.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
	private void method2024() {
		this.aClass101_6 = new Class101(this.aClass101_7.method2864());
		for (@Pc(19) Class2_Sub17 local19 = (Class2_Sub17) this.aClass101_7.method2868(); local19 != null; local19 = (Class2_Sub17) this.aClass101_7.method2859()) {
			@Pc(30) Class2_Sub20 local30 = new Class2_Sub20(local19.aString98, (int) local19.aLong214);
			this.aClass101_6.method2860(local30, Static146.method2600(local19.aString98));
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!oe;I)V")
	public void method2025(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2146();
			if (local5 == 0) {
				return;
			}
			this.method2026(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BILclient!oe;)V")
	private void method2026(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static84.method1511(arg1.method2170());
		} else if (arg0 == 2) {
			this.aChar2 = Static84.method1511(arg1.method2170());
		} else if (arg0 == 3) {
			this.aString94 = arg1.method2158();
		} else if (arg0 == 4) {
			this.anInt2666 = arg1.method2145();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(60) int local60 = arg1.method2130();
			this.aClass101_7 = new Class101(Static305.method4628(local60));
			for (@Pc(70) int local70 = 0; local70 < local60; local70++) {
				@Pc(77) int local77 = arg1.method2145();
				@Pc(89) Class2 local89;
				if (arg0 == 5) {
					local89 = new Class2_Sub17(arg1.method2158());
				} else {
					local89 = new Class2_Sub25(arg1.method2145());
				}
				this.aClass101_7.method2860(local89, (long) local77);
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)Z")
	public boolean method2027(@OriginalArg(1) int arg0) {
		if (this.aClass101_7 == null) {
			return false;
		}
		if (this.aClass101_6 == null) {
			this.method2031();
		}
		@Pc(32) Class2_Sub25 local32 = (Class2_Sub25) this.aClass101_6.method2867((long) arg0);
		return local32 != null;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)I")
	public int method2029(@OriginalArg(0) int arg0) {
		if (this.aClass101_7 == null) {
			return this.anInt2666;
		} else {
			@Pc(18) Class2_Sub25 local18 = (Class2_Sub25) this.aClass101_7.method2867((long) arg0);
			return local18 == null ? this.anInt2666 : local18.anInt4838;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method2030(@OriginalArg(0) int arg0) {
		if (this.aClass101_7 == null) {
			return this.aString94;
		} else {
			@Pc(24) Class2_Sub17 local24 = (Class2_Sub17) this.aClass101_7.method2867((long) arg0);
			return local24 == null ? this.aString94 : local24.aString98;
		}
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V")
	private void method2031() {
		this.aClass101_6 = new Class101(this.aClass101_7.method2864());
		for (@Pc(27) Class2_Sub25 local27 = (Class2_Sub25) this.aClass101_7.method2868(); local27 != null; local27 = (Class2_Sub25) this.aClass101_7.method2859()) {
			@Pc(37) Class2_Sub25 local37 = new Class2_Sub25((int) local27.aLong214);
			this.aClass101_6.method2860(local37, (long) local27.anInt4838);
		}
	}
}
