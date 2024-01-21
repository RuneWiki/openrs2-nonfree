import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HRSVWDNF")
public final class Class16 {

	@OriginalMember(owner = "client!HRSVWDNF", name = "d", descriptor = "Lclient!YCAZQYJA;")
	private Class1_Sub1 aClass1_Sub1_26;

	@OriginalMember(owner = "client!HRSVWDNF", name = "a", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!HRSVWDNF", name = "b", descriptor = "Z")
	private boolean aBoolean76 = true;

	@OriginalMember(owner = "client!HRSVWDNF", name = "c", descriptor = "Lclient!YCAZQYJA;")
	private Class1_Sub1 aClass1_Sub1_25 = new Class1_Sub1();

	@OriginalMember(owner = "client!HRSVWDNF", name = "<init>", descriptor = "(B)V")
	public Class16(@OriginalArg(0) byte arg0) {
		try {
			this.aClass1_Sub1_25.aClass1_Sub1_36 = this.aClass1_Sub1_25;
			this.aClass1_Sub1_25.aClass1_Sub1_37 = this.aClass1_Sub1_25;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("53399, " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HRSVWDNF", name = "a", descriptor = "(Lclient!YCAZQYJA;)V")
	public void method286(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_37 != null) {
			arg0.method502();
		}
		arg0.aClass1_Sub1_37 = this.aClass1_Sub1_25.aClass1_Sub1_37;
		arg0.aClass1_Sub1_36 = this.aClass1_Sub1_25;
		arg0.aClass1_Sub1_37.aClass1_Sub1_36 = arg0;
		arg0.aClass1_Sub1_36.aClass1_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!HRSVWDNF", name = "a", descriptor = "()Lclient!YCAZQYJA;")
	public Class1_Sub1 method287() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_25.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_25) {
			return null;
		} else {
			local3.method502();
			return local3;
		}
	}

	@OriginalMember(owner = "client!HRSVWDNF", name = "b", descriptor = "()Lclient!YCAZQYJA;")
	public Class1_Sub1 method288() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_25.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_25) {
			this.aClass1_Sub1_26 = null;
			return null;
		} else {
			this.aClass1_Sub1_26 = local3.aClass1_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!HRSVWDNF", name = "a", descriptor = "(I)Lclient!YCAZQYJA;")
	public Class1_Sub1 method289(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class1_Sub1 local2 = this.aClass1_Sub1_26;
			@Pc(6) boolean local6 = false;
			if (local2 == this.aClass1_Sub1_25) {
				this.aClass1_Sub1_26 = null;
				return null;
			} else {
				this.aClass1_Sub1_26 = local2.aClass1_Sub1_36;
				return local2;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("54824, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HRSVWDNF", name = "c", descriptor = "()I")
	public int method290() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_25.aClass1_Sub1_36; local5 != this.aClass1_Sub1_25; local5 = local5.aClass1_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
