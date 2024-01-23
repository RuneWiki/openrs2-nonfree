import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ig", name = "I", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ig", name = "N", descriptor = "Lclient!cd;")
	public Class22 aClass22_11;

	@OriginalMember(owner = "client!ig", name = "P", descriptor = "Lclient!cd;")
	private Class22 aClass22_12;

	@OriginalMember(owner = "client!ig", name = "T", descriptor = "I")
	private int anInt2112;

	@OriginalMember(owner = "client!ig", name = "X", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!ig", name = "O", descriptor = "Ljava/lang/String;")
	private String aString67 = "null";

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1763(@OriginalArg(0) String arg0) {
		if (this.aClass22_11 == null) {
			return false;
		}
		if (this.aClass22_12 == null) {
			this.method1764();
		}
		for (@Pc(27) Class1_Sub12 local27 = (Class1_Sub12) this.aClass22_12.method633(Static183.method4447(arg0)); local27 != null; local27 = (Class1_Sub12) this.aClass22_12.method641()) {
			if (local27.aString55.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)V")
	private void method1764() {
		this.aClass22_12 = new Class22(this.aClass22_11.method634());
		for (@Pc(27) Class1_Sub27 local27 = (Class1_Sub27) this.aClass22_11.method640(); local27 != null; local27 = (Class1_Sub27) this.aClass22_11.method637()) {
			@Pc(39) Class1_Sub12 local39 = new Class1_Sub12(local27.aString162, (int) local27.aLong202);
			this.aClass22_12.method643(Static183.method4447(local27.aString162), local39);
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method1765(@OriginalArg(0) int arg0) {
		if (this.aClass22_11 == null) {
			return this.aString67;
		} else {
			@Pc(24) Class1_Sub27 local24 = (Class1_Sub27) this.aClass22_11.method633((long) arg0);
			return local24 == null ? this.aString67 : local24.aString162;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!jj;I)V")
	public void method1766(@OriginalArg(0) Class1_Sub18 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3122();
			if (local13 == 0) {
				return;
			}
			this.method1767(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!jj;I)V")
	private void method1767(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub18 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static217.method3483(arg1.method3082());
		} else if (arg0 == 2) {
			this.aChar2 = Static217.method3483(arg1.method3082());
		} else if (arg0 == 3) {
			this.aString67 = arg1.method3101();
		} else if (arg0 == 4) {
			this.anInt2112 = arg1.method3074();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(60) int local60 = arg1.method3107();
			this.aClass22_11 = new Class22(Static182.method2762(local60));
			for (@Pc(70) int local70 = 0; local70 < local60; local70++) {
				@Pc(81) int local81 = arg1.method3074();
				@Pc(91) Class1 local91;
				if (arg0 == 5) {
					local91 = new Class1_Sub27(arg1.method3101());
				} else {
					local91 = new Class1_Sub30(arg1.method3074());
				}
				this.aClass22_11.method643((long) local81, local91);
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)Z")
	public boolean method1769(@OriginalArg(0) int arg0) {
		if (this.aClass22_11 == null) {
			return false;
		}
		if (this.aClass22_12 == null) {
			this.method1771();
		}
		@Pc(31) Class1_Sub30 local31 = (Class1_Sub30) this.aClass22_12.method633((long) arg0);
		return local31 != null;
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)V")
	private void method1771() {
		this.aClass22_12 = new Class22(this.aClass22_11.method634());
		for (@Pc(23) Class1_Sub30 local23 = (Class1_Sub30) this.aClass22_11.method640(); local23 != null; local23 = (Class1_Sub30) this.aClass22_11.method637()) {
			@Pc(32) Class1_Sub30 local32 = new Class1_Sub30((int) local23.aLong202);
			this.aClass22_12.method643((long) local23.anInt5344, local32);
		}
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(II)I")
	public int method1772(@OriginalArg(1) int arg0) {
		if (this.aClass22_11 == null) {
			return this.anInt2112;
		} else {
			@Pc(18) Class1_Sub30 local18 = (Class1_Sub30) this.aClass22_11.method633((long) arg0);
			return local18 == null ? this.anInt2112 : local18.anInt5344;
		}
	}
}
