import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DMMTBJKZ")
public final class Class6 {

	@OriginalMember(owner = "client!DMMTBJKZ", name = "c", descriptor = "Lclient!DOUWNVSH;")
	private Class1 aClass1_22;

	@OriginalMember(owner = "client!DMMTBJKZ", name = "a", descriptor = "I")
	private int anInt235 = 850;

	@OriginalMember(owner = "client!DMMTBJKZ", name = "b", descriptor = "Lclient!DOUWNVSH;")
	private Class1 aClass1_21 = new Class1();

	@OriginalMember(owner = "client!DMMTBJKZ", name = "<init>", descriptor = "(B)V")
	public Class6(@OriginalArg(0) byte arg0) {
		try {
			this.aClass1_21.aClass1_41 = this.aClass1_21;
			this.aClass1_21.aClass1_42 = this.aClass1_21;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("13565, " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DMMTBJKZ", name = "a", descriptor = "(Lclient!DOUWNVSH;)V")
	public void method94(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method501();
		}
		arg0.aClass1_42 = this.aClass1_21.aClass1_42;
		arg0.aClass1_41 = this.aClass1_21;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!DMMTBJKZ", name = "a", descriptor = "(Lclient!DOUWNVSH;Z)V")
	public void method95(@OriginalArg(0) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method501();
			}
			arg0.aClass1_42 = this.aClass1_21;
			arg0.aClass1_41 = this.aClass1_21.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("29979, " + arg0 + ", " + false + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DMMTBJKZ", name = "a", descriptor = "()Lclient!DOUWNVSH;")
	public Class1 method96() {
		@Pc(3) Class1 local3 = this.aClass1_21.aClass1_41;
		if (local3 == this.aClass1_21) {
			return null;
		} else {
			local3.method501();
			return local3;
		}
	}

	@OriginalMember(owner = "client!DMMTBJKZ", name = "b", descriptor = "()Lclient!DOUWNVSH;")
	public Class1 method97() {
		@Pc(3) Class1 local3 = this.aClass1_21.aClass1_41;
		if (local3 == this.aClass1_21) {
			this.aClass1_22 = null;
			return null;
		} else {
			this.aClass1_22 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!DMMTBJKZ", name = "a", descriptor = "(I)Lclient!DOUWNVSH;")
	public Class1 method98() {
		try {
			@Pc(13) Class1 local13 = this.aClass1_21.aClass1_42;
			if (local13 == this.aClass1_21) {
				this.aClass1_22 = null;
				return null;
			} else {
				this.aClass1_22 = local13.aClass1_42;
				return local13;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("17070, " + 2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DMMTBJKZ", name = "b", descriptor = "(I)Lclient!DOUWNVSH;")
	public Class1 method99(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class1 local2 = this.aClass1_22;
			@Pc(6) boolean local6 = false;
			if (local2 == this.aClass1_21) {
				this.aClass1_22 = null;
				return null;
			} else {
				this.aClass1_22 = local2.aClass1_41;
				return local2;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("6969, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DMMTBJKZ", name = "c", descriptor = "(I)Lclient!DOUWNVSH;")
	public Class1 method100() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_22;
			if (local2 == this.aClass1_21) {
				this.aClass1_22 = null;
				return null;
			} else {
				this.aClass1_22 = local2.aClass1_42;
				return local2;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("39828, " + -431 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DMMTBJKZ", name = "c", descriptor = "()V")
	public void method101() {
		if (this.aClass1_21.aClass1_41 == this.aClass1_21) {
			return;
		}
		while (true) {
			@Pc(10) Class1 local10 = this.aClass1_21.aClass1_41;
			if (local10 == this.aClass1_21) {
				return;
			}
			local10.method501();
		}
	}
}
