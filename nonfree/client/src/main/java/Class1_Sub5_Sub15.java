import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class1_Sub5_Sub15 extends Class1_Sub5 {

	@OriginalMember(owner = "client!nk", name = "A", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!nk", name = "B", descriptor = "Lclient!il;")
	public Class86 aClass86_22;

	@OriginalMember(owner = "client!nk", name = "G", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!nk", name = "L", descriptor = "Lclient!il;")
	private Class86 aClass86_23;

	@OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
	private int anInt3600;

	@OriginalMember(owner = "client!nk", name = "P", descriptor = "Ljava/lang/String;")
	private String aString124 = "null";

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!fh;IB)V")
	private void method3172(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static142.method2500(arg0.method1829());
		} else if (arg1 == 2) {
			this.aChar3 = Static142.method2500(arg0.method1829());
		} else if (arg1 == 3) {
			this.aString124 = arg0.method1827();
		} else if (arg1 == 4) {
			this.anInt3600 = arg0.method1860();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(49) int local49 = arg0.method1879();
			this.aClass86_22 = new Class86(Static138.method3842(local49));
			for (@Pc(59) int local59 = 0; local59 < local49; local59++) {
				@Pc(70) int local70 = arg0.method1860();
				@Pc(80) Class1 local80;
				if (arg1 == 5) {
					local80 = new Class1_Sub30(arg0.method1827());
				} else {
					local80 = new Class1_Sub22(arg0.method1860());
				}
				this.aClass86_22.method2144(local80, (long) local70);
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "(I)V")
	private void method3173() {
		this.aClass86_23 = new Class86(this.aClass86_22.method2139());
		for (@Pc(27) Class1_Sub30 local27 = (Class1_Sub30) this.aClass86_22.method2134(); local27 != null; local27 = (Class1_Sub30) this.aClass86_22.method2141()) {
			@Pc(38) Class1_Sub21 local38 = new Class1_Sub21(local27.aString166, (int) local27.aLong210);
			this.aClass86_23.method2144(local38, Static155.method2676(local27.aString166));
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3175(@OriginalArg(1) String arg0) {
		if (this.aClass86_22 == null) {
			return false;
		}
		if (this.aClass86_23 == null) {
			this.method3173();
		}
		for (@Pc(36) Class1_Sub21 local36 = (Class1_Sub21) this.aClass86_23.method2136(Static155.method2676(arg0)); local36 != null; local36 = (Class1_Sub21) this.aClass86_23.method2146()) {
			if (local36.aString122.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Z")
	public boolean method3177(@OriginalArg(1) int arg0) {
		if (this.aClass86_22 == null) {
			return false;
		}
		if (this.aClass86_23 == null) {
			this.method3181();
		}
		@Pc(33) Class1_Sub22 local33 = (Class1_Sub22) this.aClass86_23.method2136((long) arg0);
		return local33 != null;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(ZI)I")
	public int method3179(@OriginalArg(1) int arg0) {
		if (this.aClass86_22 == null) {
			return this.anInt3600;
		} else {
			@Pc(18) Class1_Sub22 local18 = (Class1_Sub22) this.aClass86_22.method2136((long) arg0);
			return local18 == null ? this.anInt3600 : local18.anInt3973;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!fh;Z)V")
	public void method3180(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1853();
			if (local5 == 0) {
				return;
			}
			this.method3172(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V")
	private void method3181() {
		this.aClass86_23 = new Class86(this.aClass86_22.method2139());
		for (@Pc(24) Class1_Sub22 local24 = (Class1_Sub22) this.aClass86_22.method2134(); local24 != null; local24 = (Class1_Sub22) this.aClass86_22.method2141()) {
			@Pc(34) Class1_Sub22 local34 = new Class1_Sub22((int) local24.aLong210);
			this.aClass86_23.method2144(local34, (long) local24.anInt3973);
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method3182(@OriginalArg(0) int arg0) {
		if (this.aClass86_22 == null) {
			return this.aString124;
		} else {
			@Pc(17) Class1_Sub30 local17 = (Class1_Sub30) this.aClass86_22.method2136((long) arg0);
			return local17 == null ? this.aString124 : local17.aString166;
		}
	}
}
