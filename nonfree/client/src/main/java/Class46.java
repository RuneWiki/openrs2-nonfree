import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class46 {

	@OriginalMember(owner = "client!da", name = "b", descriptor = "Lclient!bj;")
	private Class27 aClass27_10;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Lclient!bj;")
	public Class27 aClass27_11;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "I")
	private int anInt1344;

	@OriginalMember(owner = "client!da", name = "m", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Ljava/lang/String;")
	private String aString7 = "null";

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!lh;)V")
	public void method1128(@OriginalArg(1) Class1_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4130();
			if (local5 == 0) {
				return;
			}
			this.method1129(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!lh;)V")
	private void method1129(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static423.method5682(arg1.method4112());
		} else if (arg0 == 2) {
			this.aChar2 = Static423.method5682(arg1.method4112());
		} else if (arg0 == 3) {
			this.aString7 = arg1.method4137();
		} else if (arg0 == 4) {
			this.anInt1344 = arg1.method4087();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(49) int local49 = arg1.method4093();
			this.aClass27_11 = new Class27(Static100.method1552(local49));
			for (@Pc(59) int local59 = 0; local59 < local49; local59++) {
				@Pc(65) int local65 = arg1.method4087();
				@Pc(77) Class1 local77;
				if (arg0 == 5) {
					local77 = new Class1_Sub35(arg1.method4137());
				} else {
					local77 = new Class1_Sub13(arg1.method4087());
				}
				this.aClass27_11.method564((long) local65, local77);
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	private void method1130() {
		this.aClass27_10 = new Class27(this.aClass27_11.method562());
		for (@Pc(28) Class1_Sub35 local28 = (Class1_Sub35) this.aClass27_11.method555(); local28 != null; local28 = (Class1_Sub35) this.aClass27_11.method563()) {
			@Pc(39) Class1_Sub44 local39 = new Class1_Sub44(local28.aString41, (int) local28.aLong227);
			this.aClass27_10.method564(Static322.method4533(local28.aString41), local39);
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	private void method1131() {
		this.aClass27_10 = new Class27(this.aClass27_11.method562());
		for (@Pc(22) Class1_Sub13 local22 = (Class1_Sub13) this.aClass27_11.method555(); local22 != null; local22 = (Class1_Sub13) this.aClass27_11.method563()) {
			@Pc(31) Class1_Sub13 local31 = new Class1_Sub13((int) local22.aLong227);
			this.aClass27_10.method564((long) local22.anInt2277, local31);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method1132(@OriginalArg(0) int arg0) {
		if (this.aClass27_11 == null) {
			return this.aString7;
		} else {
			@Pc(22) Class1_Sub35 local22 = (Class1_Sub35) this.aClass27_11.method553((long) arg0);
			return local22 == null ? this.aString7 : local22.aString41;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)I")
	public int method1133(@OriginalArg(1) int arg0) {
		if (this.aClass27_11 == null) {
			return this.anInt1344;
		} else {
			@Pc(17) Class1_Sub13 local17 = (Class1_Sub13) this.aClass27_11.method553((long) arg0);
			return local17 == null ? this.anInt1344 : local17.anInt2277;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method1134(@OriginalArg(1) String arg0) {
		if (this.aClass27_11 == null) {
			return false;
		}
		if (this.aClass27_10 == null) {
			this.method1130();
		}
		for (@Pc(27) Class1_Sub44 local27 = (Class1_Sub44) this.aClass27_10.method553(Static322.method4533(arg0)); local27 != null; local27 = (Class1_Sub44) this.aClass27_10.method565()) {
			if (local27.aString65.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)Z")
	public boolean method1135(@OriginalArg(0) int arg0) {
		if (this.aClass27_11 == null) {
			return false;
		}
		if (this.aClass27_10 == null) {
			this.method1131();
		}
		@Pc(22) Class1_Sub13 local22 = (Class1_Sub13) this.aClass27_10.method553((long) arg0);
		return local22 != null;
	}
}
