import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VYBZTNTY")
public final class Class38 {

	@OriginalMember(owner = "client!VYBZTNTY", name = "f", descriptor = "Lclient!CDEGFOQA;")
	private Class3 aClass3_40;

	@OriginalMember(owner = "client!VYBZTNTY", name = "a", descriptor = "B")
	private byte aByte29 = 1;

	@OriginalMember(owner = "client!VYBZTNTY", name = "b", descriptor = "B")
	private byte aByte30 = 19;

	@OriginalMember(owner = "client!VYBZTNTY", name = "c", descriptor = "Z")
	private boolean aBoolean170 = true;

	@OriginalMember(owner = "client!VYBZTNTY", name = "d", descriptor = "I")
	private int anInt721 = -261;

	@OriginalMember(owner = "client!VYBZTNTY", name = "e", descriptor = "Lclient!CDEGFOQA;")
	private Class3 aClass3_39 = new Class3();

	@OriginalMember(owner = "client!VYBZTNTY", name = "<init>", descriptor = "(B)V")
	public Class38(@OriginalArg(0) byte arg0) {
		try {
			this.aClass3_39.aClass3_41 = this.aClass3_39;
			this.aClass3_39.aClass3_42 = this.aClass3_39;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("75863, " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYBZTNTY", name = "a", descriptor = "(Lclient!CDEGFOQA;)V")
	public void method483(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_42 != null) {
			arg0.method503();
		}
		arg0.aClass3_42 = this.aClass3_39.aClass3_42;
		arg0.aClass3_41 = this.aClass3_39;
		arg0.aClass3_42.aClass3_41 = arg0;
		arg0.aClass3_41.aClass3_42 = arg0;
	}

	@OriginalMember(owner = "client!VYBZTNTY", name = "a", descriptor = "(Lclient!CDEGFOQA;B)V")
	public void method484(@OriginalArg(0) Class3 arg0) {
		try {
			if (arg0.aClass3_42 != null) {
				arg0.method503();
			}
			arg0.aClass3_42 = this.aClass3_39;
			arg0.aClass3_41 = this.aClass3_39.aClass3_41;
			arg0.aClass3_42.aClass3_41 = arg0;
			arg0.aClass3_41.aClass3_42 = arg0;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("68923, " + arg0 + ", " + -3 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYBZTNTY", name = "a", descriptor = "()Lclient!CDEGFOQA;")
	public Class3 method485() {
		@Pc(3) Class3 local3 = this.aClass3_39.aClass3_41;
		if (local3 == this.aClass3_39) {
			return null;
		} else {
			local3.method503();
			return local3;
		}
	}

	@OriginalMember(owner = "client!VYBZTNTY", name = "b", descriptor = "()Lclient!CDEGFOQA;")
	public Class3 method486() {
		@Pc(3) Class3 local3 = this.aClass3_39.aClass3_41;
		if (local3 == this.aClass3_39) {
			this.aClass3_40 = null;
			return null;
		} else {
			this.aClass3_40 = local3.aClass3_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!VYBZTNTY", name = "a", descriptor = "(I)Lclient!CDEGFOQA;")
	public Class3 method487() {
		try {
			@Pc(3) Class3 local3 = this.aClass3_39.aClass3_42;
			if (local3 == this.aClass3_39) {
				this.aClass3_40 = null;
				return null;
			} else {
				this.aClass3_40 = local3.aClass3_42;
				return local3;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("71250, " + 5 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYBZTNTY", name = "b", descriptor = "(I)Lclient!CDEGFOQA;")
	public Class3 method488() {
		try {
			@Pc(15) Class3 local15 = this.aClass3_40;
			if (local15 == this.aClass3_39) {
				this.aClass3_40 = null;
				return null;
			} else {
				this.aClass3_40 = local15.aClass3_41;
				return local15;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("68741, " + 5 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYBZTNTY", name = "a", descriptor = "(B)Lclient!CDEGFOQA;")
	public Class3 method489() {
		try {
			@Pc(2) Class3 local2 = this.aClass3_40;
			if (local2 == this.aClass3_39) {
				this.aClass3_40 = null;
				return null;
			} else {
				this.aClass3_40 = local2.aClass3_42;
				return local2;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("48755, " + 109 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYBZTNTY", name = "c", descriptor = "()V")
	public void method490() {
		if (this.aClass3_39.aClass3_41 == this.aClass3_39) {
			return;
		}
		while (true) {
			@Pc(10) Class3 local10 = this.aClass3_39.aClass3_41;
			if (local10 == this.aClass3_39) {
				return;
			}
			local10.method503();
		}
	}
}
