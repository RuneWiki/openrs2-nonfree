import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class3_Sub7_Sub19 extends Class3_Sub7 {

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "Lclient!bo;")
	public Class24 aClass24_24;

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
	private int anInt5288;

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "Lclient!bo;")
	private Class24 aClass24_25;

	@OriginalMember(owner = "client!rb", name = "K", descriptor = "Ljava/lang/String;")
	private String aString188 = "null";

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!fb;I)V")
	public void method4443(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3643();
			if (local9 == 0) {
				return;
			}
			this.method4445(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)V")
	private void method4444() {
		this.aClass24_25 = new Class24(this.aClass24_24.method605());
		for (@Pc(20) Class3_Sub22 local20 = (Class3_Sub22) this.aClass24_24.method595(); local20 != null; local20 = (Class3_Sub22) this.aClass24_24.method602()) {
			@Pc(29) Class3_Sub22 local29 = new Class3_Sub22((int) local20.aLong211);
			this.aClass24_25.method598((long) local20.anInt2181, local29);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILclient!fb;)V")
	private void method4445(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static178.method2913(arg1.method3621());
		} else if (arg0 == 2) {
			this.aChar4 = Static178.method2913(arg1.method3621());
		} else if (arg0 == 3) {
			this.aString188 = arg1.method3671();
		} else if (arg0 == 4) {
			this.anInt5288 = arg1.method3642();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(54) int local54 = arg1.method3649();
			this.aClass24_24 = new Class24(Static83.method1300(local54));
			for (@Pc(64) int local64 = 0; local64 < local54; local64++) {
				@Pc(70) int local70 = arg1.method3642();
				@Pc(82) Class3 local82;
				if (arg0 == 5) {
					local82 = new Class3_Sub24(arg1.method3671());
				} else {
					local82 = new Class3_Sub22(arg1.method3642());
				}
				this.aClass24_24.method598((long) local70, local82);
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method4446(@OriginalArg(1) int arg0) {
		if (this.aClass24_24 == null) {
			return this.aString188;
		} else {
			@Pc(23) Class3_Sub24 local23 = (Class3_Sub24) this.aClass24_24.method609((long) arg0);
			return local23 == null ? this.aString188 : local23.aString96;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4448(@OriginalArg(1) String arg0) {
		if (this.aClass24_24 == null) {
			return false;
		}
		if (this.aClass24_25 == null) {
			this.method4449();
		}
		for (@Pc(30) Class3_Sub34 local30 = (Class3_Sub34) this.aClass24_25.method609(Static346.method5649(arg0)); local30 != null; local30 = (Class3_Sub34) this.aClass24_25.method600()) {
			if (local30.aString176.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
	private void method4449() {
		this.aClass24_25 = new Class24(this.aClass24_24.method605());
		for (@Pc(20) Class3_Sub24 local20 = (Class3_Sub24) this.aClass24_24.method595(); local20 != null; local20 = (Class3_Sub24) this.aClass24_24.method602()) {
			@Pc(37) Class3_Sub34 local37 = new Class3_Sub34(local20.aString96, (int) local20.aLong211);
			this.aClass24_25.method598(Static346.method5649(local20.aString96), local37);
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)I")
	public int method4450(@OriginalArg(0) int arg0) {
		if (this.aClass24_24 == null) {
			return this.anInt5288;
		} else {
			@Pc(24) Class3_Sub22 local24 = (Class3_Sub22) this.aClass24_24.method609((long) arg0);
			return local24 == null ? this.anInt5288 : local24.anInt2181;
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(II)Z")
	public boolean method4451(@OriginalArg(1) int arg0) {
		if (this.aClass24_24 == null) {
			return false;
		}
		if (this.aClass24_25 == null) {
			this.method4444();
		}
		@Pc(22) Class3_Sub22 local22 = (Class3_Sub22) this.aClass24_25.method609((long) arg0);
		return local22 != null;
	}
}
