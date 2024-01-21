import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ob")
public final class Class28 {

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!u;")
	private Class1 aClass1_34;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Z")
	private boolean aBoolean156 = false;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	private int anInt647 = 742;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "B")
	private byte aByte53 = -47;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
	private int anInt648 = 972;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!u;")
	private Class1 aClass1_33 = new Class1();

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(B)V")
	public Class28(@OriginalArg(0) byte arg0) {
		try {
			this.aClass1_33.aClass1_41 = this.aClass1_33;
			this.aClass1_33.aClass1_42 = this.aClass1_33;
			if (arg0 != this.aByte53) {
				this.aBoolean156 = !this.aBoolean156;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("13225, " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!u;)V")
	public void method445(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method559();
		}
		arg0.aClass1_42 = this.aClass1_33.aClass1_42;
		arg0.aClass1_41 = this.aClass1_33;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!u;I)V")
	public void method446(@OriginalArg(0) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method559();
			}
			arg0.aClass1_42 = this.aClass1_33;
			arg0.aClass1_41 = this.aClass1_33.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("17656, " + arg0 + ", " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()Lclient!u;")
	public Class1 method447() {
		@Pc(3) Class1 local3 = this.aClass1_33.aClass1_41;
		if (local3 == this.aClass1_33) {
			return null;
		} else {
			local3.method559();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "()Lclient!u;")
	public Class1 method448() {
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
	public Class1 method449() {
		try {
			@Pc(3) Class1 local3 = this.aClass1_33.aClass1_42;
			if (local3 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			} else {
				this.aClass1_34 = local3.aClass1_42;
				return local3;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("94007, " + 0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Lclient!u;")
	public Class1 method450(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class1 local2 = this.aClass1_34;
			if (local2 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			}
			this.aClass1_34 = local2.aClass1_41;
			if (arg0 != -29953) {
				for (@Pc(20) int local20 = 1; local20 > 0; local20++) {
				}
			}
			return local2;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("72049, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)Lclient!u;")
	public Class1 method451() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_34;
			if (local2 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			} else {
				this.aClass1_34 = local2.aClass1_42;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("67543, " + -616 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "()V")
	public void method452() {
		while (true) {
			@Pc(3) Class1 local3 = this.aClass1_33.aClass1_41;
			if (local3 == this.aClass1_33) {
				return;
			}
			local3.method559();
		}
	}
}
