import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sf", name = "A", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!sf", name = "B", descriptor = "Lclient!ol;")
	public Class117 aClass117_19;

	@OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
	private int anInt5280;

	@OriginalMember(owner = "client!sf", name = "K", descriptor = "Lclient!ol;")
	private Class117 aClass117_20;

	@OriginalMember(owner = "client!sf", name = "O", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!sf", name = "C", descriptor = "Ljava/lang/String;")
	private String aString165 = "null";

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V")
	private void method4143() {
		this.aClass117_20 = new Class117(this.aClass117_19.method3443());
		for (@Pc(22) Class1_Sub26 local22 = (Class1_Sub26) this.aClass117_19.method3441(); local22 != null; local22 = (Class1_Sub26) this.aClass117_19.method3444()) {
			@Pc(34) Class1_Sub23 local34 = new Class1_Sub23(local22.aString139, (int) local22.aLong201);
			this.aClass117_20.method3445(local34, Static114.method1866(local22.aString139));
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)Z")
	public boolean method4146(@OriginalArg(0) int arg0) {
		if (this.aClass117_19 == null) {
			return false;
		}
		if (this.aClass117_20 == null) {
			this.method4149();
		}
		@Pc(28) Class1_Sub10 local28 = (Class1_Sub10) this.aClass117_20.method3438((long) arg0);
		return local28 != null;
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V")
	private void method4149() {
		this.aClass117_20 = new Class117(this.aClass117_19.method3443());
		for (@Pc(20) Class1_Sub10 local20 = (Class1_Sub10) this.aClass117_19.method3441(); local20 != null; local20 = (Class1_Sub10) this.aClass117_19.method3444()) {
			@Pc(30) Class1_Sub10 local30 = new Class1_Sub10((int) local20.aLong201);
			this.aClass117_20.method3445(local30, (long) local20.anInt1508);
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method4150(@OriginalArg(1) int arg0) {
		if (this.aClass117_19 == null) {
			return this.aString165;
		} else {
			@Pc(17) Class1_Sub26 local17 = (Class1_Sub26) this.aClass117_19.method3438((long) arg0);
			return local17 == null ? this.aString165 : local17.aString139;
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method4151(@OriginalArg(0) String arg0) {
		if (this.aClass117_19 == null) {
			return false;
		}
		if (this.aClass117_20 == null) {
			this.method4143();
		}
		for (@Pc(26) Class1_Sub23 local26 = (Class1_Sub23) this.aClass117_20.method3438(Static114.method1866(arg0)); local26 != null; local26 = (Class1_Sub23) this.aClass117_20.method3442()) {
			if (local26.aString123.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!im;I)V")
	private void method4152(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static8.method3513(arg1.method2633());
		} else if (arg0 == 2) {
			this.aChar3 = Static8.method3513(arg1.method2633());
		} else if (arg0 == 3) {
			this.aString165 = arg1.method2611();
		} else if (arg0 == 4) {
			this.anInt5280 = arg1.method2610();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(59) int local59 = arg1.method2652();
			this.aClass117_19 = new Class117(Static227.method3943(local59));
			for (@Pc(69) int local69 = 0; local69 < local59; local69++) {
				@Pc(76) int local76 = arg1.method2610();
				@Pc(88) Class1 local88;
				if (arg0 == 5) {
					local88 = new Class1_Sub26(arg1.method2611());
				} else {
					local88 = new Class1_Sub10(arg1.method2610());
				}
				this.aClass117_19.method3445(local88, (long) local76);
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)I")
	public int method4154(@OriginalArg(1) int arg0) {
		if (this.aClass117_19 == null) {
			return this.anInt5280;
		} else {
			@Pc(23) Class1_Sub10 local23 = (Class1_Sub10) this.aClass117_19.method3438((long) arg0);
			return local23 == null ? this.anInt5280 : local23.anInt1508;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!im;)V")
	public void method4155(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2655();
			if (local5 == 0) {
				return;
			}
			this.method4152(local5, arg0);
		}
	}
}
