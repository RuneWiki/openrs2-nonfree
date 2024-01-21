import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ob")
public final class Class25 {

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!u;")
	private Class1 aClass1_34;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
	private int anInt508 = 962;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Z")
	private boolean aBoolean128 = true;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	private int anInt509 = 947;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!u;")
	private Class1 aClass1_33 = new Class1();

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
	public Class25(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_33.aClass1_41 = this.aClass1_33;
			this.aClass1_33.aClass1_42 = this.aClass1_33;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("13375, " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!u;)V")
	public void method399(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method512();
		}
		arg0.aClass1_42 = this.aClass1_33.aClass1_42;
		arg0.aClass1_41 = this.aClass1_33;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!u;I)V")
	public void method400(@OriginalArg(0) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method512();
			}
			arg0.aClass1_42 = this.aClass1_33;
			arg0.aClass1_41 = this.aClass1_33.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("7753, " + arg0 + ", " + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()Lclient!u;")
	public Class1 method401() {
		@Pc(3) Class1 local3 = this.aClass1_33.aClass1_41;
		if (local3 == this.aClass1_33) {
			return null;
		} else {
			local3.method512();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "()Lclient!u;")
	public Class1 method402() {
		@Pc(3) Class1 local3 = this.aClass1_33.aClass1_41;
		if (local3 == this.aClass1_33) {
			this.aClass1_34 = null;
			return null;
		} else {
			this.aClass1_34 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lclient!u;")
	public Class1 method403() {
		try {
			@Pc(3) Class1 local3 = this.aClass1_33.aClass1_42;
			if (local3 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			} else {
				this.aClass1_34 = local3.aClass1_42;
				return local3;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("69218, " + 8 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Lclient!u;")
	public Class1 method404() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_34;
			if (local2 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			} else {
				this.aClass1_34 = local2.aClass1_41;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("41673, " + 35239 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)Lclient!u;")
	public Class1 method405() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_34;
			if (local2 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			} else {
				this.aClass1_34 = local2.aClass1_42;
				return local2;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("92299, " + true + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "()V")
	public void method406() {
		while (true) {
			@Pc(3) Class1 local3 = this.aClass1_33.aClass1_41;
			if (local3 == this.aClass1_33) {
				return;
			}
			local3.method512();
		}
	}
}
