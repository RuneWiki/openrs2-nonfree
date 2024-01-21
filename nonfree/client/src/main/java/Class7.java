import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CLCMCMIN")
public final class Class7 {

	@OriginalMember(owner = "client!CLCMCMIN", name = "e", descriptor = "Lclient!XNCSKJMM;")
	private Class1 aClass1_16;

	@OriginalMember(owner = "client!CLCMCMIN", name = "a", descriptor = "I")
	private int anInt158 = 344;

	@OriginalMember(owner = "client!CLCMCMIN", name = "b", descriptor = "I")
	private int anInt159 = 958;

	@OriginalMember(owner = "client!CLCMCMIN", name = "c", descriptor = "B")
	private byte aByte8 = 0;

	@OriginalMember(owner = "client!CLCMCMIN", name = "d", descriptor = "Lclient!XNCSKJMM;")
	private Class1 aClass1_15 = new Class1();

	@OriginalMember(owner = "client!CLCMCMIN", name = "<init>", descriptor = "(I)V")
	public Class7(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				for (@Pc(19) int local19 = 1; local19 > 0; local19++) {
				}
			}
			this.aClass1_15.aClass1_41 = this.aClass1_15;
			this.aClass1_15.aClass1_42 = this.aClass1_15;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("28178, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CLCMCMIN", name = "a", descriptor = "(Lclient!XNCSKJMM;)V")
	public void method97(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method507();
		}
		arg0.aClass1_42 = this.aClass1_15.aClass1_42;
		arg0.aClass1_41 = this.aClass1_15;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!CLCMCMIN", name = "a", descriptor = "(ILclient!XNCSKJMM;)V")
	public void method98(@OriginalArg(1) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method507();
			}
			arg0.aClass1_42 = this.aClass1_15;
			arg0.aClass1_41 = this.aClass1_15.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("55360, " + -33985 + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CLCMCMIN", name = "a", descriptor = "()Lclient!XNCSKJMM;")
	public Class1 method99() {
		@Pc(3) Class1 local3 = this.aClass1_15.aClass1_41;
		if (local3 == this.aClass1_15) {
			return null;
		} else {
			local3.method507();
			return local3;
		}
	}

	@OriginalMember(owner = "client!CLCMCMIN", name = "b", descriptor = "()Lclient!XNCSKJMM;")
	public Class1 method100() {
		@Pc(3) Class1 local3 = this.aClass1_15.aClass1_41;
		if (local3 == this.aClass1_15) {
			this.aClass1_16 = null;
			return null;
		} else {
			this.aClass1_16 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!CLCMCMIN", name = "a", descriptor = "(B)Lclient!XNCSKJMM;")
	public Class1 method101() {
		try {
			@Pc(3) Class1 local3 = this.aClass1_15.aClass1_42;
			if (this.aByte8 != 0) {
				throw new NullPointerException();
			} else if (local3 == this.aClass1_15) {
				this.aClass1_16 = null;
				return null;
			} else {
				this.aClass1_16 = local3.aClass1_42;
				return local3;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("47704, " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CLCMCMIN", name = "a", descriptor = "(I)Lclient!XNCSKJMM;")
	public Class1 method102() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_16;
			if (local2 == this.aClass1_15) {
				this.aClass1_16 = null;
				return null;
			} else {
				this.aClass1_16 = local2.aClass1_41;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("56659, " + 67 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CLCMCMIN", name = "b", descriptor = "(I)Lclient!XNCSKJMM;")
	public Class1 method103() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_16;
			if (local2 == this.aClass1_15) {
				this.aClass1_16 = null;
				return null;
			} else {
				this.aClass1_16 = local2.aClass1_42;
				return local2;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("99119, " + -529 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CLCMCMIN", name = "c", descriptor = "()V")
	public void method104() {
		if (this.aClass1_15.aClass1_41 == this.aClass1_15) {
			return;
		}
		while (true) {
			@Pc(10) Class1 local10 = this.aClass1_15.aClass1_41;
			if (local10 == this.aClass1_15) {
				return;
			}
			local10.method507();
		}
	}
}
