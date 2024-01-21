import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FEPBPONH")
public final class Class11 {

	@OriginalMember(owner = "client!FEPBPONH", name = "d", descriptor = "Lclient!CSUKQTYW;")
	private Class4 aClass4_18;

	@OriginalMember(owner = "client!FEPBPONH", name = "a", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!FEPBPONH", name = "b", descriptor = "I")
	private int anInt185 = 145;

	@OriginalMember(owner = "client!FEPBPONH", name = "c", descriptor = "Lclient!CSUKQTYW;")
	private Class4 aClass4_17 = new Class4();

	@OriginalMember(owner = "client!FEPBPONH", name = "<init>", descriptor = "(I)V")
	public Class11(@OriginalArg(0) int arg0) {
		try {
			this.aClass4_17.aClass4_41 = this.aClass4_17;
			this.aClass4_17.aClass4_42 = this.aClass4_17;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("33225, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FEPBPONH", name = "a", descriptor = "(Lclient!CSUKQTYW;)V")
	public void method163(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_42 != null) {
			arg0.method556();
		}
		arg0.aClass4_42 = this.aClass4_17.aClass4_42;
		arg0.aClass4_41 = this.aClass4_17;
		arg0.aClass4_42.aClass4_41 = arg0;
		arg0.aClass4_41.aClass4_42 = arg0;
	}

	@OriginalMember(owner = "client!FEPBPONH", name = "a", descriptor = "(Lclient!CSUKQTYW;Z)V")
	public void method164(@OriginalArg(0) Class4 arg0) {
		try {
			if (arg0.aClass4_42 != null) {
				arg0.method556();
			}
			arg0.aClass4_42 = this.aClass4_17;
			arg0.aClass4_41 = this.aClass4_17.aClass4_41;
			arg0.aClass4_42.aClass4_41 = arg0;
			arg0.aClass4_41.aClass4_42 = arg0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("47153, " + arg0 + ", " + true + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FEPBPONH", name = "a", descriptor = "()Lclient!CSUKQTYW;")
	public Class4 method165() {
		@Pc(3) Class4 local3 = this.aClass4_17.aClass4_41;
		if (local3 == this.aClass4_17) {
			return null;
		} else {
			local3.method556();
			return local3;
		}
	}

	@OriginalMember(owner = "client!FEPBPONH", name = "b", descriptor = "()Lclient!CSUKQTYW;")
	public Class4 method166() {
		@Pc(3) Class4 local3 = this.aClass4_17.aClass4_41;
		if (local3 == this.aClass4_17) {
			this.aClass4_18 = null;
			return null;
		} else {
			this.aClass4_18 = local3.aClass4_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!FEPBPONH", name = "a", descriptor = "(I)Lclient!CSUKQTYW;")
	public Class4 method167() {
		try {
			@Pc(9) Class4 local9 = this.aClass4_17.aClass4_42;
			if (local9 == this.aClass4_17) {
				this.aClass4_18 = null;
				return null;
			} else {
				this.aClass4_18 = local9.aClass4_42;
				return local9;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("61934, " + 0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FEPBPONH", name = "b", descriptor = "(I)Lclient!CSUKQTYW;")
	public Class4 method168() {
		try {
			@Pc(2) Class4 local2 = this.aClass4_18;
			if (local2 == this.aClass4_17) {
				this.aClass4_18 = null;
				return null;
			} else {
				this.aClass4_18 = local2.aClass4_41;
				return local2;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("84570, " + 15175 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FEPBPONH", name = "a", descriptor = "(B)Lclient!CSUKQTYW;")
	public Class4 method169() {
		try {
			@Pc(2) Class4 local2 = this.aClass4_18;
			if (local2 == this.aClass4_17) {
				this.aClass4_18 = null;
				return null;
			} else {
				this.aClass4_18 = local2.aClass4_42;
				return local2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("37634, " + -48 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FEPBPONH", name = "c", descriptor = "()V")
	public void method170() {
		if (this.aClass4_17.aClass4_41 == this.aClass4_17) {
			return;
		}
		while (true) {
			@Pc(10) Class4 local10 = this.aClass4_17.aClass4_41;
			if (local10 == this.aClass4_17) {
				return;
			}
			local10.method556();
		}
	}
}
