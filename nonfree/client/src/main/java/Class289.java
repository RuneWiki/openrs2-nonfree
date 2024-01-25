import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class289 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Lclient!si;")
	private Class335 aClass335_31;

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
	private int anInt8418;

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "Lclient!si;")
	public Class335 aClass335_32;

	@OriginalMember(owner = "client!pt", name = "r", descriptor = "I")
	private int anInt8425;

	@OriginalMember(owner = "client!pt", name = "p", descriptor = "Ljava/lang/String;")
	private String aString101 = "null";

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
	private void method7502() {
		this.aClass335_31 = new Class335(this.aClass335_32.method8354());
		for (@Pc(27) Class2_Sub14 local27 = (Class2_Sub14) this.aClass335_32.method8358(); local27 != null; local27 = (Class2_Sub14) this.aClass335_32.method8355()) {
			@Pc(36) Class2_Sub14 local36 = new Class2_Sub14((int) local27.aLong313);
			this.aClass335_31.method8356(local36, (long) local27.anInt1303);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZI)Z")
	public boolean method7503(@OriginalArg(1) int arg0) {
		if (this.aClass335_32 == null) {
			return false;
		}
		if (this.aClass335_31 == null) {
			this.method7502();
		}
		@Pc(22) Class2_Sub14 local22 = (Class2_Sub14) this.aClass335_31.method8357((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method7504(@OriginalArg(1) String arg0) {
		if (this.aClass335_32 == null) {
			return false;
		}
		if (this.aClass335_31 == null) {
			this.method7505();
		}
		for (@Pc(25) Class2_Sub43 local25 = (Class2_Sub43) this.aClass335_31.method8357(Static625.method9291(arg0)); local25 != null; local25 = (Class2_Sub43) this.aClass335_31.method8352()) {
			if (local25.aString90.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V")
	private void method7505() {
		this.aClass335_31 = new Class335(this.aClass335_32.method8354());
		for (@Pc(28) Class2_Sub19 local28 = (Class2_Sub19) this.aClass335_32.method8358(); local28 != null; local28 = (Class2_Sub19) this.aClass335_32.method8355()) {
			@Pc(39) Class2_Sub43 local39 = new Class2_Sub43(local28.aString21, (int) local28.aLong313);
			this.aClass335_31.method8356(local39, Static625.method9291(local28.aString21));
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)I")
	public int method7507(@OriginalArg(0) int arg0) {
		if (this.aClass335_32 == null) {
			return this.anInt8418;
		} else {
			@Pc(25) Class2_Sub14 local25 = (Class2_Sub14) this.aClass335_32.method8357((long) arg0);
			return local25 == null ? this.anInt8418 : local25.anInt1303;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method7508(@OriginalArg(1) int arg0) {
		if (this.aClass335_32 == null) {
			return this.aString101;
		} else {
			@Pc(17) Class2_Sub19 local17 = (Class2_Sub19) this.aClass335_32.method8357((long) arg0);
			return local17 == null ? this.aString101 : local17.aString21;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!ol;BI)V")
	private void method7509(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static386.method6507(arg0.method5175());
		} else if (arg1 == 2) {
			this.aChar5 = Static386.method6507(arg0.method5175());
		} else if (arg1 == 3) {
			this.aString101 = arg0.method5178();
		} else if (arg1 == 4) {
			this.anInt8418 = arg0.method5172();
		} else if (arg1 == 5 || arg1 == 6) {
			this.anInt8425 = arg0.method5211();
			this.aClass335_32 = new Class335(Static432.method7064(this.anInt8425));
			for (@Pc(54) int local54 = 0; local54 < this.anInt8425; local54++) {
				@Pc(60) int local60 = arg0.method5172();
				@Pc(72) Class2 local72;
				if (arg1 == 5) {
					local72 = new Class2_Sub19(arg0.method5178());
				} else {
					local72 = new Class2_Sub14(arg0.method5172());
				}
				this.aClass335_32.method8356(local72, (long) local60);
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!ol;I)V")
	public void method7511(@OriginalArg(0) Class2_Sub8 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5203();
			if (local11 == 0) {
				return;
			}
			this.method7509(arg0, local11);
		}
	}
}
