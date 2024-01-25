import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class2_Sub11_Sub5 extends Class2_Sub11 {

	@OriginalMember(owner = "client!gf", name = "E", descriptor = "Lclient!va;")
	private Class199 aClass199_9;

	@OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
	private int anInt2317;

	@OriginalMember(owner = "client!gf", name = "G", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!gf", name = "I", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!gf", name = "O", descriptor = "Lclient!va;")
	public Class199 aClass199_10;

	@OriginalMember(owner = "client!gf", name = "P", descriptor = "Ljava/lang/String;")
	private String aString21 = "null";

	static {
		new Class93("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)V")
	private void method2271() {
		this.aClass199_9 = new Class199(this.aClass199_10.method5743());
		for (@Pc(20) Class2_Sub24 local20 = (Class2_Sub24) this.aClass199_10.method5747(); local20 != null; local20 = (Class2_Sub24) this.aClass199_10.method5753()) {
			@Pc(31) Class2_Sub27 local31 = new Class2_Sub27(local20.aString24, (int) local20.aLong213);
			this.aClass199_9.method5749(local31, Static243.method846(local20.aString24));
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)I")
	public int method2272(@OriginalArg(1) int arg0) {
		if (this.aClass199_10 == null) {
			return this.anInt2317;
		} else {
			@Pc(22) Class2_Sub42 local22 = (Class2_Sub42) this.aClass199_10.method5751((long) arg0);
			return local22 == null ? this.anInt2317 : local22.anInt6670;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method2273(@OriginalArg(1) String arg0) {
		if (this.aClass199_10 == null) {
			return false;
		}
		if (this.aClass199_9 == null) {
			this.method2271();
		}
		for (@Pc(30) Class2_Sub27 local30 = (Class2_Sub27) this.aClass199_9.method5751(Static243.method846(arg0)); local30 != null; local30 = (Class2_Sub27) this.aClass199_9.method5746()) {
			if (local30.aString30.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!dg;BI)V")
	private void method2274(@OriginalArg(0) Class2_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static194.method3503(arg0.method4436());
		} else if (arg1 == 2) {
			this.aChar1 = Static194.method3503(arg0.method4436());
		} else if (arg1 == 3) {
			this.aString21 = arg0.method4409();
		} else if (arg1 == 4) {
			this.anInt2317 = arg0.method4444();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(53) int local53 = arg0.method4464();
			this.aClass199_10 = new Class199(Static216.method3815(local53));
			for (@Pc(63) int local63 = 0; local63 < local53; local63++) {
				@Pc(69) int local69 = arg0.method4444();
				@Pc(81) Class2 local81;
				if (arg1 == 5) {
					local81 = new Class2_Sub24(arg0.method4409());
				} else {
					local81 = new Class2_Sub42(arg0.method4444());
				}
				this.aClass199_10.method5749(local81, (long) local69);
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Lclient!dg;I)V")
	public void method2275(@OriginalArg(0) Class2_Sub10 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4421();
			if (local14 == 0) {
				return;
			}
			this.method2274(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(BI)Z")
	public boolean method2278(@OriginalArg(1) int arg0) {
		if (this.aClass199_10 == null) {
			return false;
		}
		if (this.aClass199_9 == null) {
			this.method2279();
		}
		@Pc(27) Class2_Sub42 local27 = (Class2_Sub42) this.aClass199_9.method5751((long) arg0);
		return local27 != null;
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
	private void method2279() {
		this.aClass199_9 = new Class199(this.aClass199_10.method5743());
		for (@Pc(28) Class2_Sub42 local28 = (Class2_Sub42) this.aClass199_10.method5747(); local28 != null; local28 = (Class2_Sub42) this.aClass199_10.method5753()) {
			@Pc(37) Class2_Sub42 local37 = new Class2_Sub42((int) local28.aLong213);
			this.aClass199_9.method5749(local37, (long) local28.anInt6670);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method2281(@OriginalArg(0) int arg0) {
		if (this.aClass199_10 == null) {
			return this.aString21;
		} else {
			@Pc(25) Class2_Sub24 local25 = (Class2_Sub24) this.aClass199_10.method5751((long) arg0);
			return local25 == null ? this.aString21 : local25.aString24;
		}
	}
}
