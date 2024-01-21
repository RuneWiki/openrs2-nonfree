import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HIGYXWXY")
public final class Class19 {

	@OriginalMember(owner = "client!HIGYXWXY", name = "b", descriptor = "Lclient!OBKNBIRU;")
	private Class5_Sub1 aClass5_Sub1_12;

	@OriginalMember(owner = "client!HIGYXWXY", name = "a", descriptor = "Lclient!OBKNBIRU;")
	private Class5_Sub1 aClass5_Sub1_11 = new Class5_Sub1();

	@OriginalMember(owner = "client!HIGYXWXY", name = "<init>", descriptor = "(Z)V")
	public Class19(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass5_Sub1_11.aClass5_Sub1_36 = this.aClass5_Sub1_11;
			this.aClass5_Sub1_11.aClass5_Sub1_37 = this.aClass5_Sub1_11;
			if (arg0) {
				for (@Pc(20) int local20 = 1; local20 > 0; local20++) {
				}
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("84047, " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HIGYXWXY", name = "a", descriptor = "(Lclient!OBKNBIRU;)V")
	public void method125(@OriginalArg(0) Class5_Sub1 arg0) {
		if (arg0.aClass5_Sub1_37 != null) {
			arg0.method543();
		}
		arg0.aClass5_Sub1_37 = this.aClass5_Sub1_11.aClass5_Sub1_37;
		arg0.aClass5_Sub1_36 = this.aClass5_Sub1_11;
		arg0.aClass5_Sub1_37.aClass5_Sub1_36 = arg0;
		arg0.aClass5_Sub1_36.aClass5_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!HIGYXWXY", name = "a", descriptor = "()Lclient!OBKNBIRU;")
	public Class5_Sub1 method126() {
		@Pc(3) Class5_Sub1 local3 = this.aClass5_Sub1_11.aClass5_Sub1_36;
		if (local3 == this.aClass5_Sub1_11) {
			return null;
		} else {
			local3.method543();
			return local3;
		}
	}

	@OriginalMember(owner = "client!HIGYXWXY", name = "b", descriptor = "()Lclient!OBKNBIRU;")
	public Class5_Sub1 method127() {
		@Pc(3) Class5_Sub1 local3 = this.aClass5_Sub1_11.aClass5_Sub1_36;
		if (local3 == this.aClass5_Sub1_11) {
			this.aClass5_Sub1_12 = null;
			return null;
		} else {
			this.aClass5_Sub1_12 = local3.aClass5_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!HIGYXWXY", name = "a", descriptor = "(Z)Lclient!OBKNBIRU;")
	public Class5_Sub1 method128() {
		try {
			@Pc(8) Class5_Sub1 local8 = this.aClass5_Sub1_12;
			if (local8 == this.aClass5_Sub1_11) {
				this.aClass5_Sub1_12 = null;
				return null;
			} else {
				this.aClass5_Sub1_12 = local8.aClass5_Sub1_36;
				return local8;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("15856, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HIGYXWXY", name = "c", descriptor = "()I")
	public int method129() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class5_Sub1 local5 = this.aClass5_Sub1_11.aClass5_Sub1_36; local5 != this.aClass5_Sub1_11; local5 = local5.aClass5_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
