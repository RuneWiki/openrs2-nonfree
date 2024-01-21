import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QGWIBVPG")
public final class Class30 {

	@OriginalMember(owner = "client!QGWIBVPG", name = "d", descriptor = "Lclient!QEPVMESX;")
	private Class4 aClass4_26;

	@OriginalMember(owner = "client!QGWIBVPG", name = "a", descriptor = "Z")
	private boolean aBoolean137 = true;

	@OriginalMember(owner = "client!QGWIBVPG", name = "b", descriptor = "I")
	private int anInt405 = -981;

	@OriginalMember(owner = "client!QGWIBVPG", name = "c", descriptor = "Lclient!QEPVMESX;")
	private Class4 aClass4_25 = new Class4();

	@OriginalMember(owner = "client!QGWIBVPG", name = "<init>", descriptor = "(I)V")
	public Class30(@OriginalArg(0) int arg0) {
		try {
			this.aClass4_25.aClass4_41 = this.aClass4_25;
			this.aClass4_25.aClass4_42 = this.aClass4_25;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("62701, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QGWIBVPG", name = "a", descriptor = "(Lclient!QEPVMESX;)V")
	public void method343(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_42 != null) {
			arg0.method572();
		}
		arg0.aClass4_42 = this.aClass4_25.aClass4_42;
		arg0.aClass4_41 = this.aClass4_25;
		arg0.aClass4_42.aClass4_41 = arg0;
		arg0.aClass4_41.aClass4_42 = arg0;
	}

	@OriginalMember(owner = "client!QGWIBVPG", name = "a", descriptor = "(ILclient!QEPVMESX;)V")
	public void method344(@OriginalArg(1) Class4 arg0) {
		try {
			if (arg0.aClass4_42 != null) {
				arg0.method572();
			}
			arg0.aClass4_42 = this.aClass4_25;
			arg0.aClass4_41 = this.aClass4_25.aClass4_41;
			arg0.aClass4_42.aClass4_41 = arg0;
			arg0.aClass4_41.aClass4_42 = arg0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("53436, " + -141 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QGWIBVPG", name = "a", descriptor = "()Lclient!QEPVMESX;")
	public Class4 method345() {
		@Pc(3) Class4 local3 = this.aClass4_25.aClass4_41;
		if (local3 == this.aClass4_25) {
			return null;
		} else {
			local3.method572();
			return local3;
		}
	}

	@OriginalMember(owner = "client!QGWIBVPG", name = "b", descriptor = "()Lclient!QEPVMESX;")
	public Class4 method346() {
		@Pc(3) Class4 local3 = this.aClass4_25.aClass4_41;
		if (local3 == this.aClass4_25) {
			this.aClass4_26 = null;
			return null;
		} else {
			this.aClass4_26 = local3.aClass4_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!QGWIBVPG", name = "a", descriptor = "(Z)Lclient!QEPVMESX;")
	public Class4 method347() {
		try {
			@Pc(3) Class4 local3 = this.aClass4_25.aClass4_42;
			if (local3 == this.aClass4_25) {
				this.aClass4_26 = null;
				return null;
			} else {
				this.aClass4_26 = local3.aClass4_42;
				return local3;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("30375, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QGWIBVPG", name = "b", descriptor = "(Z)Lclient!QEPVMESX;")
	public Class4 method348() {
		try {
			@Pc(2) Class4 local2 = this.aClass4_26;
			if (local2 == this.aClass4_25) {
				this.aClass4_26 = null;
				return null;
			} else {
				this.aClass4_26 = local2.aClass4_41;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("52697, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QGWIBVPG", name = "c", descriptor = "(Z)Lclient!QEPVMESX;")
	public Class4 method349() {
		try {
			@Pc(8) Class4 local8 = this.aClass4_26;
			if (local8 == this.aClass4_25) {
				this.aClass4_26 = null;
				return null;
			} else {
				this.aClass4_26 = local8.aClass4_42;
				return local8;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("90671, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QGWIBVPG", name = "c", descriptor = "()V")
	public void method350() {
		if (this.aClass4_25.aClass4_41 == this.aClass4_25) {
			return;
		}
		while (true) {
			@Pc(10) Class4 local10 = this.aClass4_25.aClass4_41;
			if (local10 == this.aClass4_25) {
				return;
			}
			local10.method572();
		}
	}
}
