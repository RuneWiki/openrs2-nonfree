import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RKSMLTCN")
public final class Class37 {

	@OriginalMember(owner = "client!RKSMLTCN", name = "c", descriptor = "Lclient!LMGYBGQR;")
	private Class1_Sub1 aClass1_Sub1_29;

	@OriginalMember(owner = "client!RKSMLTCN", name = "a", descriptor = "I")
	private int anInt614 = 303;

	@OriginalMember(owner = "client!RKSMLTCN", name = "b", descriptor = "Lclient!LMGYBGQR;")
	private Class1_Sub1 aClass1_Sub1_28 = new Class1_Sub1();

	@OriginalMember(owner = "client!RKSMLTCN", name = "<init>", descriptor = "(I)V")
	public Class37(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_Sub1_28.aClass1_Sub1_36 = this.aClass1_Sub1_28;
			this.aClass1_Sub1_28.aClass1_Sub1_37 = this.aClass1_Sub1_28;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("91908, " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKSMLTCN", name = "a", descriptor = "(Lclient!LMGYBGQR;)V")
	public void method344(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_37 != null) {
			arg0.method566();
		}
		arg0.aClass1_Sub1_37 = this.aClass1_Sub1_28.aClass1_Sub1_37;
		arg0.aClass1_Sub1_36 = this.aClass1_Sub1_28;
		arg0.aClass1_Sub1_37.aClass1_Sub1_36 = arg0;
		arg0.aClass1_Sub1_36.aClass1_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!RKSMLTCN", name = "a", descriptor = "()Lclient!LMGYBGQR;")
	public Class1_Sub1 method345() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_28.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_28) {
			return null;
		} else {
			local3.method566();
			return local3;
		}
	}

	@OriginalMember(owner = "client!RKSMLTCN", name = "b", descriptor = "()Lclient!LMGYBGQR;")
	public Class1_Sub1 method346() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_28.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_28) {
			this.aClass1_Sub1_29 = null;
			return null;
		} else {
			this.aClass1_Sub1_29 = local3.aClass1_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!RKSMLTCN", name = "a", descriptor = "(B)Lclient!LMGYBGQR;")
	public Class1_Sub1 method347(@OriginalArg(0) byte arg0) {
		try {
			@Pc(2) Class1_Sub1 local2 = this.aClass1_Sub1_29;
			if (local2 == this.aClass1_Sub1_28) {
				this.aClass1_Sub1_29 = null;
				return null;
			} else {
				this.aClass1_Sub1_29 = local2.aClass1_Sub1_36;
				@Pc(20) boolean local20 = false;
				return local2;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("19970, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKSMLTCN", name = "c", descriptor = "()I")
	public int method348() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_28.aClass1_Sub1_36; local5 != this.aClass1_Sub1_28; local5 = local5.aClass1_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
