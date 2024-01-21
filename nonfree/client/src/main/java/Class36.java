import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RGZIHLRP")
public final class Class36 {

	@OriginalMember(owner = "client!RGZIHLRP", name = "f", descriptor = "Lclient!MXUYAYVV;")
	private Class1 aClass1_30;

	@OriginalMember(owner = "client!RGZIHLRP", name = "a", descriptor = "I")
	private int anInt623 = -293;

	@OriginalMember(owner = "client!RGZIHLRP", name = "b", descriptor = "I")
	private int anInt624 = 3;

	@OriginalMember(owner = "client!RGZIHLRP", name = "c", descriptor = "I")
	private int anInt625 = -459;

	@OriginalMember(owner = "client!RGZIHLRP", name = "d", descriptor = "Z")
	private boolean aBoolean147 = false;

	@OriginalMember(owner = "client!RGZIHLRP", name = "e", descriptor = "Lclient!MXUYAYVV;")
	private Class1 aClass1_29 = new Class1();

	@OriginalMember(owner = "client!RGZIHLRP", name = "<init>", descriptor = "(I)V")
	public Class36(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_29.aClass1_41 = this.aClass1_29;
			if (arg0 != 3) {
				throw new NullPointerException();
			}
			this.aClass1_29.aClass1_42 = this.aClass1_29;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("41975, " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGZIHLRP", name = "a", descriptor = "(Lclient!MXUYAYVV;)V")
	public void method397(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method510();
		}
		arg0.aClass1_42 = this.aClass1_29.aClass1_42;
		arg0.aClass1_41 = this.aClass1_29;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!RGZIHLRP", name = "a", descriptor = "(ILclient!MXUYAYVV;)V")
	public void method398(@OriginalArg(1) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method510();
			}
			arg0.aClass1_42 = this.aClass1_29;
			arg0.aClass1_41 = this.aClass1_29.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("57099, " + -459 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGZIHLRP", name = "a", descriptor = "()Lclient!MXUYAYVV;")
	public Class1 method399() {
		@Pc(3) Class1 local3 = this.aClass1_29.aClass1_41;
		if (local3 == this.aClass1_29) {
			return null;
		} else {
			local3.method510();
			return local3;
		}
	}

	@OriginalMember(owner = "client!RGZIHLRP", name = "b", descriptor = "()Lclient!MXUYAYVV;")
	public Class1 method400() {
		@Pc(3) Class1 local3 = this.aClass1_29.aClass1_41;
		if (local3 == this.aClass1_29) {
			this.aClass1_30 = null;
			return null;
		} else {
			this.aClass1_30 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!RGZIHLRP", name = "a", descriptor = "(I)Lclient!MXUYAYVV;")
	public Class1 method401() {
		try {
			@Pc(3) Class1 local3 = this.aClass1_29.aClass1_42;
			if (local3 == this.aClass1_29) {
				this.aClass1_30 = null;
				return null;
			} else {
				this.aClass1_30 = local3.aClass1_42;
				return local3;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("99795, " + -147 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGZIHLRP", name = "a", descriptor = "(B)Lclient!MXUYAYVV;")
	public Class1 method402(@OriginalArg(0) byte arg0) {
		try {
			@Pc(2) Class1 local2 = this.aClass1_30;
			if (local2 == this.aClass1_29) {
				this.aClass1_30 = null;
				return null;
			} else {
				this.aClass1_30 = local2.aClass1_41;
				@Pc(20) boolean local20 = false;
				return local2;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("28073, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGZIHLRP", name = "b", descriptor = "(B)Lclient!MXUYAYVV;")
	public Class1 method403() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_30;
			if (local2 == this.aClass1_29) {
				this.aClass1_30 = null;
				return null;
			} else {
				this.aClass1_30 = local2.aClass1_42;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("84355, " + 7 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGZIHLRP", name = "c", descriptor = "()V")
	public void method404() {
		if (this.aClass1_29.aClass1_41 == this.aClass1_29) {
			return;
		}
		while (true) {
			@Pc(10) Class1 local10 = this.aClass1_29.aClass1_41;
			if (local10 == this.aClass1_29) {
				return;
			}
			local10.method510();
		}
	}
}
