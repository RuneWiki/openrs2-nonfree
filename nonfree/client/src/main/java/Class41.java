import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VHKTMNAT")
public final class Class41 {

	@OriginalMember(owner = "client!VHKTMNAT", name = "c", descriptor = "Lclient!WLTWEDNK;")
	private Class3_Sub1 aClass3_Sub1_30;

	@OriginalMember(owner = "client!VHKTMNAT", name = "a", descriptor = "I")
	private int anInt653 = 7;

	@OriginalMember(owner = "client!VHKTMNAT", name = "b", descriptor = "Lclient!WLTWEDNK;")
	private Class3_Sub1 aClass3_Sub1_29 = new Class3_Sub1();

	@OriginalMember(owner = "client!VHKTMNAT", name = "<init>", descriptor = "(Z)V")
	public Class41(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass3_Sub1_29.aClass3_Sub1_36 = this.aClass3_Sub1_29;
			this.aClass3_Sub1_29.aClass3_Sub1_37 = this.aClass3_Sub1_29;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("92101, " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VHKTMNAT", name = "a", descriptor = "(Lclient!WLTWEDNK;)V")
	public void method427(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_37 != null) {
			arg0.method536();
		}
		arg0.aClass3_Sub1_37 = this.aClass3_Sub1_29.aClass3_Sub1_37;
		arg0.aClass3_Sub1_36 = this.aClass3_Sub1_29;
		arg0.aClass3_Sub1_37.aClass3_Sub1_36 = arg0;
		arg0.aClass3_Sub1_36.aClass3_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!VHKTMNAT", name = "a", descriptor = "()Lclient!WLTWEDNK;")
	public Class3_Sub1 method428() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_29.aClass3_Sub1_36;
		if (local3 == this.aClass3_Sub1_29) {
			return null;
		} else {
			local3.method536();
			return local3;
		}
	}

	@OriginalMember(owner = "client!VHKTMNAT", name = "b", descriptor = "()Lclient!WLTWEDNK;")
	public Class3_Sub1 method429() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_29.aClass3_Sub1_36;
		if (local3 == this.aClass3_Sub1_29) {
			this.aClass3_Sub1_30 = null;
			return null;
		} else {
			this.aClass3_Sub1_30 = local3.aClass3_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!VHKTMNAT", name = "a", descriptor = "(B)Lclient!WLTWEDNK;")
	public Class3_Sub1 method430() {
		try {
			@Pc(12) Class3_Sub1 local12 = this.aClass3_Sub1_30;
			if (local12 == this.aClass3_Sub1_29) {
				this.aClass3_Sub1_30 = null;
				return null;
			} else {
				this.aClass3_Sub1_30 = local12.aClass3_Sub1_36;
				return local12;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("41884, " + -96 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VHKTMNAT", name = "c", descriptor = "()I")
	public int method431() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class3_Sub1 local5 = this.aClass3_Sub1_29.aClass3_Sub1_36; local5 != this.aClass3_Sub1_29; local5 = local5.aClass3_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
