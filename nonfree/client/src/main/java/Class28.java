import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OZVXYFRH")
public final class Class28 {

	@OriginalMember(owner = "client!OZVXYFRH", name = "c", descriptor = "Lclient!YPOWJZIQ;")
	private Class2_Sub1 aClass2_Sub1_21;

	@OriginalMember(owner = "client!OZVXYFRH", name = "a", descriptor = "Z")
	private boolean aBoolean117 = false;

	@OriginalMember(owner = "client!OZVXYFRH", name = "b", descriptor = "Lclient!YPOWJZIQ;")
	private Class2_Sub1 aClass2_Sub1_20 = new Class2_Sub1();

	@OriginalMember(owner = "client!OZVXYFRH", name = "<init>", descriptor = "(B)V")
	public Class28(@OriginalArg(0) byte arg0) {
		try {
			this.aClass2_Sub1_20.aClass2_Sub1_36 = this.aClass2_Sub1_20;
			if (arg0 != -98) {
				throw new NullPointerException();
			}
			this.aClass2_Sub1_20.aClass2_Sub1_37 = this.aClass2_Sub1_20;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("47426, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OZVXYFRH", name = "a", descriptor = "(Lclient!YPOWJZIQ;)V")
	public void method235(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_37 != null) {
			arg0.method467();
		}
		arg0.aClass2_Sub1_37 = this.aClass2_Sub1_20.aClass2_Sub1_37;
		arg0.aClass2_Sub1_36 = this.aClass2_Sub1_20;
		arg0.aClass2_Sub1_37.aClass2_Sub1_36 = arg0;
		arg0.aClass2_Sub1_36.aClass2_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!OZVXYFRH", name = "a", descriptor = "()Lclient!YPOWJZIQ;")
	public Class2_Sub1 method236() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_20.aClass2_Sub1_36;
		if (local3 == this.aClass2_Sub1_20) {
			return null;
		} else {
			local3.method467();
			return local3;
		}
	}

	@OriginalMember(owner = "client!OZVXYFRH", name = "b", descriptor = "()Lclient!YPOWJZIQ;")
	public Class2_Sub1 method237() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_20.aClass2_Sub1_36;
		if (local3 == this.aClass2_Sub1_20) {
			this.aClass2_Sub1_21 = null;
			return null;
		} else {
			this.aClass2_Sub1_21 = local3.aClass2_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!OZVXYFRH", name = "a", descriptor = "(Z)Lclient!YPOWJZIQ;")
	public Class2_Sub1 method238() {
		try {
			@Pc(2) Class2_Sub1 local2 = this.aClass2_Sub1_21;
			if (local2 == this.aClass2_Sub1_20) {
				this.aClass2_Sub1_21 = null;
				return null;
			} else {
				this.aClass2_Sub1_21 = local2.aClass2_Sub1_36;
				return local2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("94918, " + false + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OZVXYFRH", name = "c", descriptor = "()I")
	public int method239() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class2_Sub1 local5 = this.aClass2_Sub1_20.aClass2_Sub1_36; local5 != this.aClass2_Sub1_20; local5 = local5.aClass2_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
