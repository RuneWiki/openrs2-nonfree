import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class82 {

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
	private int anInt1975;

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Lclient!tga;")
	private Class335 aClass335_13;

	@OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
	private int anInt1982;

	@OriginalMember(owner = "client!dp", name = "l", descriptor = "Lclient!tga;")
	public Class335 aClass335_14;

	@OriginalMember(owner = "client!dp", name = "m", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!dp", name = "p", descriptor = "Ljava/lang/String;")
	private String aString15 = "null";

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method1801(@OriginalArg(0) int arg0) {
		if (this.aClass335_14 == null) {
			return this.aString15;
		} else {
			@Pc(22) Class5_Sub44 local22 = (Class5_Sub44) this.aClass335_14.method7766((long) arg0);
			return local22 == null ? this.aString15 : local22.aString83;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	private void method1802() {
		this.aClass335_13 = new Class335(this.aClass335_14.method7775());
		for (@Pc(18) Class5_Sub43 local18 = (Class5_Sub43) this.aClass335_14.method7768(); local18 != null; local18 = (Class5_Sub43) this.aClass335_14.method7777()) {
			@Pc(33) Class5_Sub43 local33 = new Class5_Sub43((int) local18.aLong329);
			this.aClass335_13.method7770((long) local18.anInt7821, local33);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IILclient!rv;)V")
	private void method1803(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static549.method7576(arg1.method3677());
		} else if (arg0 == 2) {
			this.aChar3 = Static549.method7576(arg1.method3677());
		} else if (arg0 == 3) {
			this.aString15 = arg1.method3661();
		} else if (arg0 == 4) {
			this.anInt1982 = arg1.method3671();
		} else if (arg0 == 5 || arg0 == 6) {
			this.anInt1975 = arg1.method3698();
			this.aClass335_14 = new Class335(Static209.method2991(this.anInt1975));
			for (@Pc(47) int local47 = 0; local47 < this.anInt1975; local47++) {
				@Pc(52) int local52 = arg1.method3671();
				@Pc(64) Class5 local64;
				if (arg0 == 5) {
					local64 = new Class5_Sub44(arg1.method3661());
				} else {
					local64 = new Class5_Sub43(arg1.method3671());
				}
				this.aClass335_14.method7770((long) local52, local64);
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)I")
	public int method1805(@OriginalArg(1) int arg0) {
		if (this.aClass335_14 == null) {
			return this.anInt1982;
		} else {
			@Pc(17) Class5_Sub43 local17 = (Class5_Sub43) this.aClass335_14.method7766((long) arg0);
			return local17 == null ? this.anInt1982 : local17.anInt7821;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method1806(@OriginalArg(1) String arg0) {
		if (this.aClass335_14 == null) {
			return false;
		}
		if (this.aClass335_13 == null) {
			this.method1807();
		}
		for (@Pc(29) Class5_Sub13 local29 = (Class5_Sub13) this.aClass335_13.method7766(Static208.method6255(arg0)); local29 != null; local29 = (Class5_Sub13) this.aClass335_13.method7769()) {
			if (local29.aString10.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
	private void method1807() {
		this.aClass335_13 = new Class335(this.aClass335_14.method7775());
		for (@Pc(26) Class5_Sub44 local26 = (Class5_Sub44) this.aClass335_14.method7768(); local26 != null; local26 = (Class5_Sub44) this.aClass335_14.method7777()) {
			@Pc(36) Class5_Sub13 local36 = new Class5_Sub13(local26.aString83, (int) local26.aLong329);
			this.aClass335_13.method7770(Static208.method6255(local26.aString83), local36);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!rv;I)V")
	public void method1809(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3642();
			if (local9 == 0) {
				return;
			}
			this.method1803(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZ)Z")
	public boolean method1811(@OriginalArg(0) int arg0) {
		if (this.aClass335_14 == null) {
			return false;
		}
		if (this.aClass335_13 == null) {
			this.method1802();
		}
		@Pc(22) Class5_Sub43 local22 = (Class5_Sub43) this.aClass335_13.method7766((long) arg0);
		return local22 != null;
	}
}
