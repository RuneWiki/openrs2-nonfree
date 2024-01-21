import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EZRJDJYN")
public final class Class10 {

	@OriginalMember(owner = "client!EZRJDJYN", name = "d", descriptor = "Lclient!OZZFMONJ;")
	private Class3_Sub3 aClass3_Sub3_12;

	@OriginalMember(owner = "client!EZRJDJYN", name = "a", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!EZRJDJYN", name = "b", descriptor = "I")
	private int anInt187 = 615;

	@OriginalMember(owner = "client!EZRJDJYN", name = "c", descriptor = "Lclient!OZZFMONJ;")
	private Class3_Sub3 aClass3_Sub3_11 = new Class3_Sub3();

	@OriginalMember(owner = "client!EZRJDJYN", name = "<init>", descriptor = "(I)V")
	public Class10(@OriginalArg(0) int arg0) {
		try {
			this.aClass3_Sub3_11.aClass3_Sub3_36 = this.aClass3_Sub3_11;
			this.aClass3_Sub3_11.aClass3_Sub3_37 = this.aClass3_Sub3_11;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("59042, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZRJDJYN", name = "a", descriptor = "(Lclient!OZZFMONJ;)V")
	public void method67(@OriginalArg(0) Class3_Sub3 arg0) {
		if (arg0.aClass3_Sub3_37 != null) {
			arg0.method546();
		}
		arg0.aClass3_Sub3_37 = this.aClass3_Sub3_11.aClass3_Sub3_37;
		arg0.aClass3_Sub3_36 = this.aClass3_Sub3_11;
		arg0.aClass3_Sub3_37.aClass3_Sub3_36 = arg0;
		arg0.aClass3_Sub3_36.aClass3_Sub3_37 = arg0;
	}

	@OriginalMember(owner = "client!EZRJDJYN", name = "a", descriptor = "()Lclient!OZZFMONJ;")
	public Class3_Sub3 method68() {
		@Pc(3) Class3_Sub3 local3 = this.aClass3_Sub3_11.aClass3_Sub3_36;
		if (local3 == this.aClass3_Sub3_11) {
			return null;
		} else {
			local3.method546();
			return local3;
		}
	}

	@OriginalMember(owner = "client!EZRJDJYN", name = "b", descriptor = "()Lclient!OZZFMONJ;")
	public Class3_Sub3 method69() {
		@Pc(3) Class3_Sub3 local3 = this.aClass3_Sub3_11.aClass3_Sub3_36;
		if (local3 == this.aClass3_Sub3_11) {
			this.aClass3_Sub3_12 = null;
			return null;
		} else {
			this.aClass3_Sub3_12 = local3.aClass3_Sub3_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!EZRJDJYN", name = "a", descriptor = "(I)Lclient!OZZFMONJ;")
	public Class3_Sub3 method70(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) Class3_Sub3 local6 = this.aClass3_Sub3_12;
			if (local6 == this.aClass3_Sub3_11) {
				this.aClass3_Sub3_12 = null;
				return null;
			} else {
				this.aClass3_Sub3_12 = local6.aClass3_Sub3_36;
				return local6;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("960, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZRJDJYN", name = "c", descriptor = "()I")
	public int method71() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class3_Sub3 local5 = this.aClass3_Sub3_11.aClass3_Sub3_36; local5 != this.aClass3_Sub3_11; local5 = local5.aClass3_Sub3_36) {
			local1++;
		}
		return local1;
	}
}
