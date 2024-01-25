import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class218 {

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
	private int anInt7290;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!eq;")
	public Class99 aClass99_49;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!eq;")
	private Class99 aClass99_50;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Ljava/lang/String;")
	private String aString79 = "null";

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!cea;II)V")
	private void method6190(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static172.method3629(arg0.method8384());
		} else if (arg1 == 2) {
			this.aChar3 = Static172.method3629(arg0.method8384());
		} else if (arg1 == 3) {
			this.aString79 = arg0.method8373();
		} else if (arg1 == 4) {
			this.anInt7290 = arg0.method8381();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(65) int local65 = arg0.method8326();
			this.aClass99_49 = new Class99(Static231.method4407(local65));
			for (@Pc(75) int local75 = 0; local75 < local65; local75++) {
				@Pc(81) int local81 = arg0.method8381();
				@Pc(91) Class2 local91;
				if (arg1 == 5) {
					local91 = new Class2_Sub12(arg0.method8373());
				} else {
					local91 = new Class2_Sub43(arg0.method8381());
				}
				this.aClass99_49.method3059((long) local81, local91);
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method6191(@OriginalArg(1) String arg0) {
		if (this.aClass99_49 == null) {
			return false;
		}
		if (this.aClass99_50 == null) {
			this.method6196();
		}
		for (@Pc(31) Class2_Sub51 local31 = (Class2_Sub51) this.aClass99_50.method3056(Static609.method8919(arg0)); local31 != null; local31 = (Class2_Sub51) this.aClass99_50.method3052()) {
			if (local31.aString118.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)Z")
	public boolean method6192(@OriginalArg(1) int arg0) {
		if (this.aClass99_49 == null) {
			return false;
		}
		if (this.aClass99_50 == null) {
			this.method6193();
		}
		@Pc(27) Class2_Sub43 local27 = (Class2_Sub43) this.aClass99_50.method3056((long) arg0);
		return local27 != null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	private void method6193() {
		this.aClass99_50 = new Class99(this.aClass99_49.method3051());
		for (@Pc(20) Class2_Sub43 local20 = (Class2_Sub43) this.aClass99_49.method3060(); local20 != null; local20 = (Class2_Sub43) this.aClass99_49.method3058()) {
			@Pc(29) Class2_Sub43 local29 = new Class2_Sub43((int) local20.aLong278);
			this.aClass99_50.method3059((long) local20.anInt9046, local29);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!cea;)V")
	public void method6194(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method8383();
			if (local11 == 0) {
				return;
			}
			this.method6190(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	private void method6196() {
		this.aClass99_50 = new Class99(this.aClass99_49.method3051());
		for (@Pc(20) Class2_Sub12 local20 = (Class2_Sub12) this.aClass99_49.method3060(); local20 != null; local20 = (Class2_Sub12) this.aClass99_49.method3058()) {
			@Pc(31) Class2_Sub51 local31 = new Class2_Sub51(local20.aString18, (int) local20.aLong278);
			this.aClass99_50.method3059(Static609.method8919(local20.aString18), local31);
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(ZI)I")
	public int method6198(@OriginalArg(1) int arg0) {
		if (this.aClass99_49 == null) {
			return this.anInt7290;
		} else {
			@Pc(25) Class2_Sub43 local25 = (Class2_Sub43) this.aClass99_49.method3056((long) arg0);
			return local25 == null ? this.anInt7290 : local25.anInt9046;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method6199(@OriginalArg(0) int arg0) {
		if (this.aClass99_49 == null) {
			return this.aString79;
		} else {
			@Pc(22) Class2_Sub12 local22 = (Class2_Sub12) this.aClass99_49.method3056((long) arg0);
			return local22 == null ? this.aString79 : local22.aString18;
		}
	}
}
