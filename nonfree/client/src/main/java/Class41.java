import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WCVCMGLX")
public final class Class41 {

	@OriginalMember(owner = "client!WCVCMGLX", name = "g", descriptor = "Lclient!ABHGPSRU;")
	private Class1 aClass1_40;

	@OriginalMember(owner = "client!WCVCMGLX", name = "a", descriptor = "I")
	private int anInt716 = -34531;

	@OriginalMember(owner = "client!WCVCMGLX", name = "b", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!WCVCMGLX", name = "c", descriptor = "Z")
	private boolean aBoolean170 = true;

	@OriginalMember(owner = "client!WCVCMGLX", name = "d", descriptor = "B")
	private byte aByte18 = -48;

	@OriginalMember(owner = "client!WCVCMGLX", name = "e", descriptor = "I")
	private int anInt717 = -39880;

	@OriginalMember(owner = "client!WCVCMGLX", name = "f", descriptor = "Lclient!ABHGPSRU;")
	private Class1 aClass1_39 = new Class1();

	@OriginalMember(owner = "client!WCVCMGLX", name = "<init>", descriptor = "(I)V")
	public Class41(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_39.aClass1_41 = this.aClass1_39;
			this.aClass1_39.aClass1_42 = this.aClass1_39;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("70034, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WCVCMGLX", name = "a", descriptor = "(Lclient!ABHGPSRU;)V")
	public void method531(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method552();
		}
		arg0.aClass1_42 = this.aClass1_39.aClass1_42;
		arg0.aClass1_41 = this.aClass1_39;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!WCVCMGLX", name = "a", descriptor = "(Lclient!ABHGPSRU;I)V")
	public void method532(@OriginalArg(0) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method552();
			}
			arg0.aClass1_42 = this.aClass1_39;
			arg0.aClass1_41 = this.aClass1_39.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("17371, " + arg0 + ", " + 616 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WCVCMGLX", name = "a", descriptor = "()Lclient!ABHGPSRU;")
	public Class1 method533() {
		@Pc(3) Class1 local3 = this.aClass1_39.aClass1_41;
		if (local3 == this.aClass1_39) {
			return null;
		} else {
			local3.method552();
			return local3;
		}
	}

	@OriginalMember(owner = "client!WCVCMGLX", name = "b", descriptor = "()Lclient!ABHGPSRU;")
	public Class1 method534() {
		@Pc(3) Class1 local3 = this.aClass1_39.aClass1_41;
		if (local3 == this.aClass1_39) {
			this.aClass1_40 = null;
			return null;
		} else {
			this.aClass1_40 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!WCVCMGLX", name = "a", descriptor = "(B)Lclient!ABHGPSRU;")
	public Class1 method535() {
		try {
			@Pc(10) Class1 local10 = this.aClass1_39.aClass1_42;
			if (local10 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local10.aClass1_42;
				return local10;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("76589, " + 6 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WCVCMGLX", name = "a", descriptor = "(Z)Lclient!ABHGPSRU;")
	public Class1 method536() {
		try {
			@Pc(8) Class1 local8 = this.aClass1_40;
			if (local8 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local8.aClass1_41;
				return local8;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("19340, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WCVCMGLX", name = "a", descriptor = "(I)Lclient!ABHGPSRU;")
	public Class1 method537() {
		try {
			@Pc(12) Class1 local12 = this.aClass1_40;
			if (local12 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local12.aClass1_42;
				return local12;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("81402, " + 36701 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WCVCMGLX", name = "c", descriptor = "()V")
	public void method538() {
		if (this.aClass1_39.aClass1_41 == this.aClass1_39) {
			return;
		}
		while (true) {
			@Pc(10) Class1 local10 = this.aClass1_39.aClass1_41;
			if (local10 == this.aClass1_39) {
				return;
			}
			local10.method552();
		}
	}
}
