import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PACANLMY")
public final class Class29 {

	@OriginalMember(owner = "client!PACANLMY", name = "d", descriptor = "Lclient!PXORWIXO;")
	private Class2 aClass2_28;

	@OriginalMember(owner = "client!PACANLMY", name = "a", descriptor = "I")
	private int anInt398 = 12;

	@OriginalMember(owner = "client!PACANLMY", name = "b", descriptor = "I")
	private int anInt399 = -582;

	@OriginalMember(owner = "client!PACANLMY", name = "c", descriptor = "Lclient!PXORWIXO;")
	private Class2 aClass2_27 = new Class2();

	@OriginalMember(owner = "client!PACANLMY", name = "<init>", descriptor = "(I)V")
	public Class29(@OriginalArg(0) int arg0) {
		try {
			this.aClass2_27.aClass2_41 = this.aClass2_27;
			this.aClass2_27.aClass2_42 = this.aClass2_27;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("3552, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PACANLMY", name = "a", descriptor = "(Lclient!PXORWIXO;)V")
	public void method352(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_42 != null) {
			arg0.method573();
		}
		arg0.aClass2_42 = this.aClass2_27.aClass2_42;
		arg0.aClass2_41 = this.aClass2_27;
		arg0.aClass2_42.aClass2_41 = arg0;
		arg0.aClass2_41.aClass2_42 = arg0;
	}

	@OriginalMember(owner = "client!PACANLMY", name = "a", descriptor = "(ILclient!PXORWIXO;)V")
	public void method353(@OriginalArg(1) Class2 arg0) {
		try {
			if (arg0.aClass2_42 != null) {
				arg0.method573();
			}
			arg0.aClass2_42 = this.aClass2_27;
			arg0.aClass2_41 = this.aClass2_27.aClass2_41;
			arg0.aClass2_42.aClass2_41 = arg0;
			arg0.aClass2_41.aClass2_42 = arg0;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("54042, " + 13081 + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PACANLMY", name = "a", descriptor = "()Lclient!PXORWIXO;")
	public Class2 method354() {
		@Pc(3) Class2 local3 = this.aClass2_27.aClass2_41;
		if (local3 == this.aClass2_27) {
			return null;
		} else {
			local3.method573();
			return local3;
		}
	}

	@OriginalMember(owner = "client!PACANLMY", name = "b", descriptor = "()Lclient!PXORWIXO;")
	public Class2 method355() {
		@Pc(3) Class2 local3 = this.aClass2_27.aClass2_41;
		if (local3 == this.aClass2_27) {
			this.aClass2_28 = null;
			return null;
		} else {
			this.aClass2_28 = local3.aClass2_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!PACANLMY", name = "a", descriptor = "(B)Lclient!PXORWIXO;")
	public Class2 method356() {
		try {
			@Pc(3) Class2 local3 = this.aClass2_27.aClass2_42;
			if (local3 == this.aClass2_27) {
				this.aClass2_28 = null;
				return null;
			} else {
				this.aClass2_28 = local3.aClass2_42;
				return local3;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("10030, " + -110 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PACANLMY", name = "a", descriptor = "(I)Lclient!PXORWIXO;")
	public Class2 method357() {
		try {
			@Pc(8) Class2 local8 = this.aClass2_28;
			if (local8 == this.aClass2_27) {
				this.aClass2_28 = null;
				return null;
			} else {
				this.aClass2_28 = local8.aClass2_41;
				return local8;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("61981, " + -582 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PACANLMY", name = "b", descriptor = "(I)Lclient!PXORWIXO;")
	public Class2 method358() {
		try {
			@Pc(15) Class2 local15 = this.aClass2_28;
			if (local15 == this.aClass2_27) {
				this.aClass2_28 = null;
				return null;
			} else {
				this.aClass2_28 = local15.aClass2_42;
				return local15;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("41779, " + -706 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PACANLMY", name = "c", descriptor = "()V")
	public void method359() {
		if (this.aClass2_27.aClass2_41 == this.aClass2_27) {
			return;
		}
		while (true) {
			@Pc(10) Class2 local10 = this.aClass2_27.aClass2_41;
			if (local10 == this.aClass2_27) {
				return;
			}
			local10.method573();
		}
	}
}
