import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ETMNPRAF")
public final class Class8 {

	@OriginalMember(owner = "client!ETMNPRAF", name = "f", descriptor = "Lclient!LXNKZOGX;")
	private Class1 aClass1_14;

	@OriginalMember(owner = "client!ETMNPRAF", name = "a", descriptor = "Z")
	private boolean aBoolean21 = true;

	@OriginalMember(owner = "client!ETMNPRAF", name = "b", descriptor = "Z")
	private boolean aBoolean22 = true;

	@OriginalMember(owner = "client!ETMNPRAF", name = "c", descriptor = "I")
	private int anInt84 = -309;

	@OriginalMember(owner = "client!ETMNPRAF", name = "d", descriptor = "I")
	private int anInt85 = -43582;

	@OriginalMember(owner = "client!ETMNPRAF", name = "e", descriptor = "Lclient!LXNKZOGX;")
	private Class1 aClass1_13 = new Class1();

	@OriginalMember(owner = "client!ETMNPRAF", name = "<init>", descriptor = "(I)V")
	public Class8(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_13.aClass1_41 = this.aClass1_13;
			this.aClass1_13.aClass1_42 = this.aClass1_13;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("27541, " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ETMNPRAF", name = "a", descriptor = "(Lclient!LXNKZOGX;)V")
	public void method43(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method551();
		}
		arg0.aClass1_42 = this.aClass1_13.aClass1_42;
		arg0.aClass1_41 = this.aClass1_13;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!ETMNPRAF", name = "a", descriptor = "(Lclient!LXNKZOGX;I)V")
	public void method44(@OriginalArg(0) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method551();
			}
			arg0.aClass1_42 = this.aClass1_13;
			arg0.aClass1_41 = this.aClass1_13.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("16680, " + arg0 + ", " + -6203 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ETMNPRAF", name = "a", descriptor = "()Lclient!LXNKZOGX;")
	public Class1 method45() {
		@Pc(3) Class1 local3 = this.aClass1_13.aClass1_41;
		if (local3 == this.aClass1_13) {
			return null;
		} else {
			local3.method551();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ETMNPRAF", name = "b", descriptor = "()Lclient!LXNKZOGX;")
	public Class1 method46() {
		@Pc(3) Class1 local3 = this.aClass1_13.aClass1_41;
		if (local3 == this.aClass1_13) {
			this.aClass1_14 = null;
			return null;
		} else {
			this.aClass1_14 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ETMNPRAF", name = "a", descriptor = "(I)Lclient!LXNKZOGX;")
	public Class1 method47() {
		try {
			@Pc(3) Class1 local3 = this.aClass1_13.aClass1_42;
			if (local3 == this.aClass1_13) {
				this.aClass1_14 = null;
				return null;
			} else {
				this.aClass1_14 = local3.aClass1_42;
				return local3;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("57146, " + 0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ETMNPRAF", name = "a", descriptor = "(B)Lclient!LXNKZOGX;")
	public Class1 method48() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_14;
			if (local2 == this.aClass1_13) {
				this.aClass1_14 = null;
				return null;
			} else {
				this.aClass1_14 = local2.aClass1_41;
				return local2;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("66311, " + 6 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ETMNPRAF", name = "a", descriptor = "(Z)Lclient!LXNKZOGX;")
	public Class1 method49() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_14;
			if (local2 == this.aClass1_13) {
				this.aClass1_14 = null;
				return null;
			} else {
				this.aClass1_14 = local2.aClass1_42;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("29763, " + true + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ETMNPRAF", name = "c", descriptor = "()V")
	public void method50() {
		if (this.aClass1_13.aClass1_41 == this.aClass1_13) {
			return;
		}
		while (true) {
			@Pc(10) Class1 local10 = this.aClass1_13.aClass1_41;
			if (local10 == this.aClass1_13) {
				return;
			}
			local10.method551();
		}
	}
}
