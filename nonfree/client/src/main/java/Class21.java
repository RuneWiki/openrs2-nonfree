import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LKYWDMZN")
public final class Class21 {

	@OriginalMember(owner = "client!LKYWDMZN", name = "d", descriptor = "Lclient!APQXVAYL;")
	private Class1_Sub1 aClass1_Sub1_19;

	@OriginalMember(owner = "client!LKYWDMZN", name = "a", descriptor = "I")
	private int anInt345 = 357;

	@OriginalMember(owner = "client!LKYWDMZN", name = "b", descriptor = "I")
	private int anInt346 = -653;

	@OriginalMember(owner = "client!LKYWDMZN", name = "c", descriptor = "Lclient!APQXVAYL;")
	private Class1_Sub1 aClass1_Sub1_18 = new Class1_Sub1();

	@OriginalMember(owner = "client!LKYWDMZN", name = "<init>", descriptor = "(I)V")
	public Class21(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_Sub1_18.aClass1_Sub1_36 = this.aClass1_Sub1_18;
			this.aClass1_Sub1_18.aClass1_Sub1_37 = this.aClass1_Sub1_18;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("38710, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LKYWDMZN", name = "a", descriptor = "(Lclient!APQXVAYL;)V")
	public void method216(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_37 != null) {
			arg0.method552();
		}
		arg0.aClass1_Sub1_37 = this.aClass1_Sub1_18.aClass1_Sub1_37;
		arg0.aClass1_Sub1_36 = this.aClass1_Sub1_18;
		arg0.aClass1_Sub1_37.aClass1_Sub1_36 = arg0;
		arg0.aClass1_Sub1_36.aClass1_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!LKYWDMZN", name = "a", descriptor = "()Lclient!APQXVAYL;")
	public Class1_Sub1 method217() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_18.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_18) {
			return null;
		} else {
			local3.method552();
			return local3;
		}
	}

	@OriginalMember(owner = "client!LKYWDMZN", name = "b", descriptor = "()Lclient!APQXVAYL;")
	public Class1_Sub1 method218() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_18.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_18) {
			this.aClass1_Sub1_19 = null;
			return null;
		} else {
			this.aClass1_Sub1_19 = local3.aClass1_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!LKYWDMZN", name = "a", descriptor = "(B)Lclient!APQXVAYL;")
	public Class1_Sub1 method219() {
		try {
			@Pc(2) Class1_Sub1 local2 = this.aClass1_Sub1_19;
			if (local2 == this.aClass1_Sub1_18) {
				this.aClass1_Sub1_19 = null;
				return null;
			} else {
				this.aClass1_Sub1_19 = local2.aClass1_Sub1_36;
				return local2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("49597, " + 6 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LKYWDMZN", name = "c", descriptor = "()I")
	public int method220() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_18.aClass1_Sub1_36; local5 != this.aClass1_Sub1_18; local5 = local5.aClass1_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
