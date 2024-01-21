import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LXCATFEF")
public final class Class24 {

	@OriginalMember(owner = "client!LXCATFEF", name = "d", descriptor = "Lclient!KGLULAMW;")
	private Class2_Sub1 aClass2_Sub1_26;

	@OriginalMember(owner = "client!LXCATFEF", name = "a", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!LXCATFEF", name = "b", descriptor = "I")
	private int anInt445 = -340;

	@OriginalMember(owner = "client!LXCATFEF", name = "c", descriptor = "Lclient!KGLULAMW;")
	private Class2_Sub1 aClass2_Sub1_25 = new Class2_Sub1();

	@OriginalMember(owner = "client!LXCATFEF", name = "<init>", descriptor = "(I)V")
	public Class24(@OriginalArg(0) int arg0) {
		try {
			this.aClass2_Sub1_25.aClass2_Sub1_36 = this.aClass2_Sub1_25;
			@Pc(21) int local21 = 13 / arg0;
			this.aClass2_Sub1_25.aClass2_Sub1_37 = this.aClass2_Sub1_25;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("87275, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LXCATFEF", name = "a", descriptor = "(Lclient!KGLULAMW;)V")
	public void method342(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_37 != null) {
			arg0.method563();
		}
		arg0.aClass2_Sub1_37 = this.aClass2_Sub1_25.aClass2_Sub1_37;
		arg0.aClass2_Sub1_36 = this.aClass2_Sub1_25;
		arg0.aClass2_Sub1_37.aClass2_Sub1_36 = arg0;
		arg0.aClass2_Sub1_36.aClass2_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!LXCATFEF", name = "a", descriptor = "()Lclient!KGLULAMW;")
	public Class2_Sub1 method343() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_25.aClass2_Sub1_36;
		if (local3 == this.aClass2_Sub1_25) {
			return null;
		} else {
			local3.method563();
			return local3;
		}
	}

	@OriginalMember(owner = "client!LXCATFEF", name = "b", descriptor = "()Lclient!KGLULAMW;")
	public Class2_Sub1 method344() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_25.aClass2_Sub1_36;
		if (local3 == this.aClass2_Sub1_25) {
			this.aClass2_Sub1_26 = null;
			return null;
		} else {
			this.aClass2_Sub1_26 = local3.aClass2_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!LXCATFEF", name = "a", descriptor = "(I)Lclient!KGLULAMW;")
	public Class2_Sub1 method345() {
		try {
			@Pc(2) Class2_Sub1 local2 = this.aClass2_Sub1_26;
			if (local2 == this.aClass2_Sub1_25) {
				this.aClass2_Sub1_26 = null;
				return null;
			} else {
				this.aClass2_Sub1_26 = local2.aClass2_Sub1_36;
				return local2;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("99681, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LXCATFEF", name = "c", descriptor = "()I")
	public int method346() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class2_Sub1 local5 = this.aClass2_Sub1_25.aClass2_Sub1_36; local5 != this.aClass2_Sub1_25; local5 = local5.aClass2_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
