import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QUHNUHWS")
public final class Class35 {

	@OriginalMember(owner = "client!QUHNUHWS", name = "c", descriptor = "Lclient!NFNHZJTP;")
	private Class2_Sub1 aClass2_Sub1_30;

	@OriginalMember(owner = "client!QUHNUHWS", name = "a", descriptor = "Z")
	private boolean aBoolean150 = true;

	@OriginalMember(owner = "client!QUHNUHWS", name = "b", descriptor = "Lclient!NFNHZJTP;")
	private Class2_Sub1 aClass2_Sub1_29 = new Class2_Sub1();

	@OriginalMember(owner = "client!QUHNUHWS", name = "<init>", descriptor = "(I)V")
	public Class35(@OriginalArg(0) int arg0) {
		try {
			this.aClass2_Sub1_29.aClass2_Sub1_36 = this.aClass2_Sub1_29;
			this.aClass2_Sub1_29.aClass2_Sub1_37 = this.aClass2_Sub1_29;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("13528, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUHNUHWS", name = "a", descriptor = "(Lclient!NFNHZJTP;)V")
	public void method355(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_37 != null) {
			arg0.method559();
		}
		arg0.aClass2_Sub1_37 = this.aClass2_Sub1_29.aClass2_Sub1_37;
		arg0.aClass2_Sub1_36 = this.aClass2_Sub1_29;
		arg0.aClass2_Sub1_37.aClass2_Sub1_36 = arg0;
		arg0.aClass2_Sub1_36.aClass2_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!QUHNUHWS", name = "a", descriptor = "()Lclient!NFNHZJTP;")
	public Class2_Sub1 method356() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_29.aClass2_Sub1_36;
		if (local3 == this.aClass2_Sub1_29) {
			return null;
		} else {
			local3.method559();
			return local3;
		}
	}

	@OriginalMember(owner = "client!QUHNUHWS", name = "b", descriptor = "()Lclient!NFNHZJTP;")
	public Class2_Sub1 method357() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_29.aClass2_Sub1_36;
		if (local3 == this.aClass2_Sub1_29) {
			this.aClass2_Sub1_30 = null;
			return null;
		} else {
			this.aClass2_Sub1_30 = local3.aClass2_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!QUHNUHWS", name = "a", descriptor = "(I)Lclient!NFNHZJTP;")
	public Class2_Sub1 method358() {
		try {
			@Pc(2) Class2_Sub1 local2 = this.aClass2_Sub1_30;
			if (local2 == this.aClass2_Sub1_29) {
				this.aClass2_Sub1_30 = null;
				return null;
			} else {
				this.aClass2_Sub1_30 = local2.aClass2_Sub1_36;
				return local2;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("40767, " + -314 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUHNUHWS", name = "c", descriptor = "()I")
	public int method359() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class2_Sub1 local5 = this.aClass2_Sub1_29.aClass2_Sub1_36; local5 != this.aClass2_Sub1_29; local5 = local5.aClass2_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
