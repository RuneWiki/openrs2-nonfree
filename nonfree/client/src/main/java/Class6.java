import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BOHLFXVX")
public final class Class6 {

	@OriginalMember(owner = "client!BOHLFXVX", name = "b", descriptor = "I")
	private int anInt52;

	@OriginalMember(owner = "client!BOHLFXVX", name = "d", descriptor = "Lclient!ZUOIJLRD;")
	private Class10 aClass10_2;

	@OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "I")
	private int anInt51 = -48545;

	@OriginalMember(owner = "client!BOHLFXVX", name = "c", descriptor = "Lclient!ZUOIJLRD;")
	private Class10 aClass10_1 = new Class10();

	@OriginalMember(owner = "client!BOHLFXVX", name = "<init>", descriptor = "(Z)V")
	public Class6(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass10_1.aClass10_41 = this.aClass10_1;
			this.aClass10_1.aClass10_42 = this.aClass10_1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("28867, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "(Lclient!ZUOIJLRD;)V")
	public void method3(@OriginalArg(0) Class10 arg0) {
		if (arg0.aClass10_42 != null) {
			arg0.method534();
		}
		arg0.aClass10_42 = this.aClass10_1.aClass10_42;
		arg0.aClass10_41 = this.aClass10_1;
		arg0.aClass10_42.aClass10_41 = arg0;
		arg0.aClass10_41.aClass10_42 = arg0;
	}

	@OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "(BLclient!ZUOIJLRD;)V")
	public void method4(@OriginalArg(1) Class10 arg0) {
		try {
			if (arg0.aClass10_42 != null) {
				arg0.method534();
			}
			arg0.aClass10_42 = this.aClass10_1;
			arg0.aClass10_41 = this.aClass10_1.aClass10_41;
			arg0.aClass10_42.aClass10_41 = arg0;
			arg0.aClass10_41.aClass10_42 = arg0;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("85719, " + -57 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "()Lclient!ZUOIJLRD;")
	public Class10 method5() {
		@Pc(3) Class10 local3 = this.aClass10_1.aClass10_41;
		if (local3 == this.aClass10_1) {
			return null;
		} else {
			local3.method534();
			return local3;
		}
	}

	@OriginalMember(owner = "client!BOHLFXVX", name = "b", descriptor = "()Lclient!ZUOIJLRD;")
	public Class10 method6() {
		@Pc(3) Class10 local3 = this.aClass10_1.aClass10_41;
		if (local3 == this.aClass10_1) {
			this.aClass10_2 = null;
			return null;
		} else {
			this.aClass10_2 = local3.aClass10_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "(Z)Lclient!ZUOIJLRD;")
	public Class10 method7() {
		try {
			@Pc(3) Class10 local3 = this.aClass10_1.aClass10_42;
			if (local3 == this.aClass10_1) {
				this.aClass10_2 = null;
				return null;
			} else {
				this.aClass10_2 = local3.aClass10_42;
				return local3;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("67224, " + false + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "(I)Lclient!ZUOIJLRD;")
	public Class10 method8() {
		try {
			@Pc(2) Class10 local2 = this.aClass10_2;
			if (local2 == this.aClass10_1) {
				this.aClass10_2 = null;
				return null;
			} else {
				this.aClass10_2 = local2.aClass10_41;
				return local2;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("40388, " + 1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BOHLFXVX", name = "b", descriptor = "(I)Lclient!ZUOIJLRD;")
	public Class10 method9() {
		try {
			@Pc(2) Class10 local2 = this.aClass10_2;
			if (local2 == this.aClass10_1) {
				this.aClass10_2 = null;
				return null;
			} else {
				this.aClass10_2 = local2.aClass10_42;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("26745, " + 173 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BOHLFXVX", name = "c", descriptor = "()V")
	public void method10() {
		if (this.aClass10_1.aClass10_41 == this.aClass10_1) {
			return;
		}
		while (true) {
			@Pc(10) Class10 local10 = this.aClass10_1.aClass10_41;
			if (local10 == this.aClass10_1) {
				return;
			}
			local10.method534();
		}
	}
}
