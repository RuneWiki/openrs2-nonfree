import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ELLPUVEP")
public final class Class11 {

	@OriginalMember(owner = "client!ELLPUVEP", name = "c", descriptor = "Lclient!ICYNFRTV;")
	private Class2_Sub1 aClass2_Sub1_13;

	@OriginalMember(owner = "client!ELLPUVEP", name = "a", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!ELLPUVEP", name = "b", descriptor = "Lclient!ICYNFRTV;")
	private Class2_Sub1 aClass2_Sub1_12 = new Class2_Sub1();

	@OriginalMember(owner = "client!ELLPUVEP", name = "<init>", descriptor = "(B)V")
	public Class11(@OriginalArg(0) byte arg0) {
		try {
			@Pc(14) boolean local14 = false;
			this.aClass2_Sub1_12.aClass2_Sub1_36 = this.aClass2_Sub1_12;
			this.aClass2_Sub1_12.aClass2_Sub1_37 = this.aClass2_Sub1_12;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("87126, " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELLPUVEP", name = "a", descriptor = "(Lclient!ICYNFRTV;)V")
	public void method180(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_37 != null) {
			arg0.method487();
		}
		arg0.aClass2_Sub1_37 = this.aClass2_Sub1_12.aClass2_Sub1_37;
		arg0.aClass2_Sub1_36 = this.aClass2_Sub1_12;
		arg0.aClass2_Sub1_37.aClass2_Sub1_36 = arg0;
		arg0.aClass2_Sub1_36.aClass2_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!ELLPUVEP", name = "a", descriptor = "()Lclient!ICYNFRTV;")
	public Class2_Sub1 method181() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_12.aClass2_Sub1_36;
		if (local3 == this.aClass2_Sub1_12) {
			return null;
		} else {
			local3.method487();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ELLPUVEP", name = "b", descriptor = "()Lclient!ICYNFRTV;")
	public Class2_Sub1 method182() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_12.aClass2_Sub1_36;
		if (local3 == this.aClass2_Sub1_12) {
			this.aClass2_Sub1_13 = null;
			return null;
		} else {
			this.aClass2_Sub1_13 = local3.aClass2_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ELLPUVEP", name = "a", descriptor = "(Z)Lclient!ICYNFRTV;")
	public Class2_Sub1 method183() {
		try {
			@Pc(2) Class2_Sub1 local2 = this.aClass2_Sub1_13;
			if (local2 == this.aClass2_Sub1_12) {
				this.aClass2_Sub1_13 = null;
				return null;
			} else {
				this.aClass2_Sub1_13 = local2.aClass2_Sub1_36;
				return local2;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("5017, " + true + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELLPUVEP", name = "c", descriptor = "()I")
	public int method184() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class2_Sub1 local5 = this.aClass2_Sub1_12.aClass2_Sub1_36; local5 != this.aClass2_Sub1_12; local5 = local5.aClass2_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
