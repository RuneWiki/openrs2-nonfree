import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LOISKKJJ")
public final class Class23 {

	@OriginalMember(owner = "client!LOISKKJJ", name = "h", descriptor = "Lclient!DJXGSHIT;")
	private Class1 aClass1_30;

	@OriginalMember(owner = "client!LOISKKJJ", name = "a", descriptor = "I")
	private int anInt471 = 2;

	@OriginalMember(owner = "client!LOISKKJJ", name = "b", descriptor = "Z")
	private boolean aBoolean128 = true;

	@OriginalMember(owner = "client!LOISKKJJ", name = "c", descriptor = "Z")
	private boolean aBoolean129 = true;

	@OriginalMember(owner = "client!LOISKKJJ", name = "d", descriptor = "B")
	private byte aByte21 = -59;

	@OriginalMember(owner = "client!LOISKKJJ", name = "e", descriptor = "B")
	private byte aByte22 = -27;

	@OriginalMember(owner = "client!LOISKKJJ", name = "f", descriptor = "B")
	private byte aByte23 = 4;

	@OriginalMember(owner = "client!LOISKKJJ", name = "g", descriptor = "Lclient!DJXGSHIT;")
	private Class1 aClass1_29 = new Class1();

	@OriginalMember(owner = "client!LOISKKJJ", name = "<init>", descriptor = "(I)V")
	public Class23(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_29.aClass1_41 = this.aClass1_29;
			this.aClass1_29.aClass1_42 = this.aClass1_29;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("81822, " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOISKKJJ", name = "a", descriptor = "(Lclient!DJXGSHIT;)V")
	public void method419(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method544();
		}
		arg0.aClass1_42 = this.aClass1_29.aClass1_42;
		arg0.aClass1_41 = this.aClass1_29;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!LOISKKJJ", name = "a", descriptor = "(Lclient!DJXGSHIT;Z)V")
	public void method420(@OriginalArg(0) Class1 arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				this.aBoolean128 = !this.aBoolean128;
			}
			if (arg0.aClass1_42 != null) {
				arg0.method544();
			}
			arg0.aClass1_42 = this.aClass1_29;
			arg0.aClass1_41 = this.aClass1_29.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("79220, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOISKKJJ", name = "a", descriptor = "()Lclient!DJXGSHIT;")
	public Class1 method421() {
		@Pc(3) Class1 local3 = this.aClass1_29.aClass1_41;
		if (local3 == this.aClass1_29) {
			return null;
		} else {
			local3.method544();
			return local3;
		}
	}

	@OriginalMember(owner = "client!LOISKKJJ", name = "b", descriptor = "()Lclient!DJXGSHIT;")
	public Class1 method422() {
		@Pc(3) Class1 local3 = this.aClass1_29.aClass1_41;
		if (local3 == this.aClass1_29) {
			this.aClass1_30 = null;
			return null;
		} else {
			this.aClass1_30 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!LOISKKJJ", name = "a", descriptor = "(B)Lclient!DJXGSHIT;")
	public Class1 method423() {
		try {
			@Pc(3) Class1 local3 = this.aClass1_29.aClass1_42;
			if (local3 == this.aClass1_29) {
				this.aClass1_30 = null;
				return null;
			} else {
				this.aClass1_30 = local3.aClass1_42;
				return local3;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("45978, " + -28 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOISKKJJ", name = "b", descriptor = "(B)Lclient!DJXGSHIT;")
	public Class1 method424(@OriginalArg(0) byte arg0) {
		try {
			@Pc(2) Class1 local2 = this.aClass1_30;
			@Pc(7) boolean local7 = false;
			if (local2 == this.aClass1_29) {
				this.aClass1_30 = null;
				return null;
			} else {
				this.aClass1_30 = local2.aClass1_41;
				return local2;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("93577, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOISKKJJ", name = "c", descriptor = "(B)Lclient!DJXGSHIT;")
	public Class1 method425() {
		try {
			if (this.aByte22 != -27) {
				this.anInt471 = -165;
			}
			@Pc(9) Class1 local9 = this.aClass1_30;
			if (local9 == this.aClass1_29) {
				this.aClass1_30 = null;
				return null;
			} else {
				this.aClass1_30 = local9.aClass1_42;
				return local9;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("82039, " + -27 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOISKKJJ", name = "c", descriptor = "()V")
	public void method426() {
		if (this.aClass1_29.aClass1_41 == this.aClass1_29) {
			return;
		}
		while (true) {
			@Pc(10) Class1 local10 = this.aClass1_29.aClass1_41;
			if (local10 == this.aClass1_29) {
				return;
			}
			local10.method544();
		}
	}
}
