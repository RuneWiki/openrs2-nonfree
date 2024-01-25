import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class153 {

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "Lclient!pt;")
	public Class230 aClass230_27;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "Lclient!pt;")
	private Class230 aClass230_28;

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
	private int anInt4487;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "Ljava/lang/String;")
	private String aString100 = "null";

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method4162(@OriginalArg(0) int arg0) {
		if (this.aClass230_27 == null) {
			return this.aString100;
		} else {
			@Pc(22) Class1_Sub36 local22 = (Class1_Sub36) this.aClass230_27.method6144((long) arg0);
			return local22 == null ? this.aString100 : local22.aString138;
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)Z")
	public boolean method4163(@OriginalArg(1) int arg0) {
		if (this.aClass230_27 == null) {
			return false;
		}
		if (this.aClass230_28 == null) {
			this.method4164();
		}
		@Pc(44) Class1_Sub14 local44 = (Class1_Sub14) this.aClass230_28.method6144((long) arg0);
		return local44 != null;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	private void method4164() {
		this.aClass230_28 = new Class230(this.aClass230_27.method6142());
		for (@Pc(20) Class1_Sub14 local20 = (Class1_Sub14) this.aClass230_27.method6137(); local20 != null; local20 = (Class1_Sub14) this.aClass230_27.method6140()) {
			@Pc(29) Class1_Sub14 local29 = new Class1_Sub14((int) local20.aLong251);
			this.aClass230_28.method6139((long) local20.anInt2795, local29);
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
	private void method4165() {
		this.aClass230_28 = new Class230(this.aClass230_27.method6142());
		for (@Pc(24) Class1_Sub36 local24 = (Class1_Sub36) this.aClass230_27.method6137(); local24 != null; local24 = (Class1_Sub36) this.aClass230_27.method6140()) {
			@Pc(35) Class1_Sub24 local35 = new Class1_Sub24(local24.aString138, (int) local24.aLong251);
			this.aClass230_28.method6139(Static225.method4055(local24.aString138), local35);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4166(@OriginalArg(0) String arg0) {
		if (this.aClass230_27 == null) {
			return false;
		}
		if (this.aClass230_28 == null) {
			this.method4165();
		}
		for (@Pc(30) Class1_Sub24 local30 = (Class1_Sub24) this.aClass230_28.method6144(Static225.method4055(arg0)); local30 != null; local30 = (Class1_Sub24) this.aClass230_28.method6145()) {
			if (local30.aString91.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLclient!os;)V")
	public void method4167(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4487();
			if (local5 == 0) {
				return;
			}
			this.method4173(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZI)I")
	public int method4168(@OriginalArg(1) int arg0) {
		if (this.aClass230_27 == null) {
			return this.anInt4487;
		} else {
			@Pc(17) Class1_Sub14 local17 = (Class1_Sub14) this.aClass230_27.method6144((long) arg0);
			return local17 == null ? this.anInt4487 : local17.anInt2795;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILclient!os;)V")
	private void method4173(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static253.method4580(arg1.method4482());
		} else if (arg0 == 2) {
			this.aChar4 = Static253.method4580(arg1.method4482());
		} else if (arg0 == 3) {
			this.aString100 = arg1.method4491();
		} else if (arg0 == 4) {
			this.anInt4487 = arg1.method4481();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(59) int local59 = arg1.method4494();
			this.aClass230_27 = new Class230(Static184.method3549(local59));
			for (@Pc(69) int local69 = 0; local69 < local59; local69++) {
				@Pc(75) int local75 = arg1.method4481();
				@Pc(85) Class1 local85;
				if (arg0 == 5) {
					local85 = new Class1_Sub36(arg1.method4491());
				} else {
					local85 = new Class1_Sub14(arg1.method4481());
				}
				this.aClass230_27.method6139((long) local75, local85);
			}
		}
	}
}
