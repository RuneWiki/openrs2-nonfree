import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JTFJPMGL")
public final class Class19 {

	@OriginalMember(owner = "client!JTFJPMGL", name = "c", descriptor = "Lclient!HZZJZIMV;")
	private Class2_Sub1 aClass2_Sub1_23;

	@OriginalMember(owner = "client!JTFJPMGL", name = "a", descriptor = "Z")
	private boolean aBoolean87 = true;

	@OriginalMember(owner = "client!JTFJPMGL", name = "b", descriptor = "Lclient!HZZJZIMV;")
	private Class2_Sub1 aClass2_Sub1_22 = new Class2_Sub1();

	@OriginalMember(owner = "client!JTFJPMGL", name = "<init>", descriptor = "(I)V")
	public Class19(@OriginalArg(0) int arg0) {
		try {
			this.aClass2_Sub1_22.aClass2_Sub1_36 = this.aClass2_Sub1_22;
			this.aClass2_Sub1_22.aClass2_Sub1_37 = this.aClass2_Sub1_22;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("89627, " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JTFJPMGL", name = "a", descriptor = "(Lclient!HZZJZIMV;)V")
	public void method196(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_37 != null) {
			arg0.method508();
		}
		arg0.aClass2_Sub1_37 = this.aClass2_Sub1_22.aClass2_Sub1_37;
		arg0.aClass2_Sub1_36 = this.aClass2_Sub1_22;
		arg0.aClass2_Sub1_37.aClass2_Sub1_36 = arg0;
		arg0.aClass2_Sub1_36.aClass2_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!JTFJPMGL", name = "a", descriptor = "()Lclient!HZZJZIMV;")
	public Class2_Sub1 method197() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_22.aClass2_Sub1_36;
		if (local3 == this.aClass2_Sub1_22) {
			return null;
		} else {
			local3.method508();
			return local3;
		}
	}

	@OriginalMember(owner = "client!JTFJPMGL", name = "b", descriptor = "()Lclient!HZZJZIMV;")
	public Class2_Sub1 method198() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_22.aClass2_Sub1_36;
		if (local3 == this.aClass2_Sub1_22) {
			this.aClass2_Sub1_23 = null;
			return null;
		} else {
			this.aClass2_Sub1_23 = local3.aClass2_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!JTFJPMGL", name = "a", descriptor = "(I)Lclient!HZZJZIMV;")
	public Class2_Sub1 method199(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) Class2_Sub1 local6 = this.aClass2_Sub1_23;
			if (local6 == this.aClass2_Sub1_22) {
				this.aClass2_Sub1_23 = null;
				return null;
			} else {
				this.aClass2_Sub1_23 = local6.aClass2_Sub1_36;
				return local6;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("67105, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JTFJPMGL", name = "c", descriptor = "()I")
	public int method200() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class2_Sub1 local5 = this.aClass2_Sub1_22.aClass2_Sub1_36; local5 != this.aClass2_Sub1_22; local5 = local5.aClass2_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
