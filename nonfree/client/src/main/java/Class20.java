import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KHIOJPOB")
public final class Class20 {

	@OriginalMember(owner = "client!KHIOJPOB", name = "d", descriptor = "Lclient!FFAASUKE;")
	private Class2_Sub1 aClass2_Sub1_22;

	@OriginalMember(owner = "client!KHIOJPOB", name = "a", descriptor = "I")
	private int anInt429 = 959;

	@OriginalMember(owner = "client!KHIOJPOB", name = "b", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!KHIOJPOB", name = "c", descriptor = "Lclient!FFAASUKE;")
	private Class2_Sub1 aClass2_Sub1_21 = new Class2_Sub1();

	@OriginalMember(owner = "client!KHIOJPOB", name = "<init>", descriptor = "(B)V")
	public Class20(@OriginalArg(0) byte arg0) {
		try {
			this.aClass2_Sub1_21.aClass2_Sub1_36 = this.aClass2_Sub1_21;
			this.aClass2_Sub1_21.aClass2_Sub1_37 = this.aClass2_Sub1_21;
			if (arg0 != 8) {
				throw new NullPointerException();
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("2234, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KHIOJPOB", name = "a", descriptor = "(Lclient!FFAASUKE;)V")
	public void method237(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_37 != null) {
			arg0.method505();
		}
		arg0.aClass2_Sub1_37 = this.aClass2_Sub1_21.aClass2_Sub1_37;
		arg0.aClass2_Sub1_36 = this.aClass2_Sub1_21;
		arg0.aClass2_Sub1_37.aClass2_Sub1_36 = arg0;
		arg0.aClass2_Sub1_36.aClass2_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!KHIOJPOB", name = "a", descriptor = "()Lclient!FFAASUKE;")
	public Class2_Sub1 method238() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_21.aClass2_Sub1_36;
		if (local3 == this.aClass2_Sub1_21) {
			return null;
		} else {
			local3.method505();
			return local3;
		}
	}

	@OriginalMember(owner = "client!KHIOJPOB", name = "b", descriptor = "()Lclient!FFAASUKE;")
	public Class2_Sub1 method239() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_21.aClass2_Sub1_36;
		if (local3 == this.aClass2_Sub1_21) {
			this.aClass2_Sub1_22 = null;
			return null;
		} else {
			this.aClass2_Sub1_22 = local3.aClass2_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!KHIOJPOB", name = "a", descriptor = "(I)Lclient!FFAASUKE;")
	public Class2_Sub1 method240() {
		try {
			@Pc(9) Class2_Sub1 local9 = this.aClass2_Sub1_22;
			if (local9 == this.aClass2_Sub1_21) {
				this.aClass2_Sub1_22 = null;
				return null;
			} else {
				this.aClass2_Sub1_22 = local9.aClass2_Sub1_36;
				return local9;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("78295, " + 4 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KHIOJPOB", name = "c", descriptor = "()I")
	public int method241() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class2_Sub1 local5 = this.aClass2_Sub1_21.aClass2_Sub1_36; local5 != this.aClass2_Sub1_21; local5 = local5.aClass2_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
