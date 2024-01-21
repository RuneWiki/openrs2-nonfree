import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NYZQPNXB")
public final class Class26 {

	@OriginalMember(owner = "client!NYZQPNXB", name = "f", descriptor = "Lclient!BEBSUZBY;")
	private Class3 aClass3_22;

	@OriginalMember(owner = "client!NYZQPNXB", name = "a", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!NYZQPNXB", name = "b", descriptor = "B")
	private byte aByte20 = -78;

	@OriginalMember(owner = "client!NYZQPNXB", name = "c", descriptor = "I")
	private int anInt394 = 23345;

	@OriginalMember(owner = "client!NYZQPNXB", name = "d", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!NYZQPNXB", name = "e", descriptor = "Lclient!BEBSUZBY;")
	private Class3 aClass3_21 = new Class3();

	@OriginalMember(owner = "client!NYZQPNXB", name = "<init>", descriptor = "(I)V")
	public Class26(@OriginalArg(0) int arg0) {
		try {
			this.aClass3_21.aClass3_41 = this.aClass3_21;
			this.aClass3_21.aClass3_42 = this.aClass3_21;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("78431, " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NYZQPNXB", name = "a", descriptor = "(Lclient!BEBSUZBY;)V")
	public void method221(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_42 != null) {
			arg0.method545();
		}
		arg0.aClass3_42 = this.aClass3_21.aClass3_42;
		arg0.aClass3_41 = this.aClass3_21;
		arg0.aClass3_42.aClass3_41 = arg0;
		arg0.aClass3_41.aClass3_42 = arg0;
	}

	@OriginalMember(owner = "client!NYZQPNXB", name = "a", descriptor = "(ILclient!BEBSUZBY;)V")
	public void method222(@OriginalArg(1) Class3 arg0) {
		try {
			if (arg0.aClass3_42 != null) {
				arg0.method545();
			}
			arg0.aClass3_42 = this.aClass3_21;
			arg0.aClass3_41 = this.aClass3_21.aClass3_41;
			arg0.aClass3_42.aClass3_41 = arg0;
			arg0.aClass3_41.aClass3_42 = arg0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("80906, " + 68 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NYZQPNXB", name = "a", descriptor = "()Lclient!BEBSUZBY;")
	public Class3 method223() {
		@Pc(3) Class3 local3 = this.aClass3_21.aClass3_41;
		if (local3 == this.aClass3_21) {
			return null;
		} else {
			local3.method545();
			return local3;
		}
	}

	@OriginalMember(owner = "client!NYZQPNXB", name = "b", descriptor = "()Lclient!BEBSUZBY;")
	public Class3 method224() {
		@Pc(3) Class3 local3 = this.aClass3_21.aClass3_41;
		if (local3 == this.aClass3_21) {
			this.aClass3_22 = null;
			return null;
		} else {
			this.aClass3_22 = local3.aClass3_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!NYZQPNXB", name = "a", descriptor = "(B)Lclient!BEBSUZBY;")
	public Class3 method225() {
		try {
			@Pc(14) Class3 local14 = this.aClass3_21.aClass3_42;
			if (local14 == this.aClass3_21) {
				this.aClass3_22 = null;
				return null;
			} else {
				this.aClass3_22 = local14.aClass3_42;
				return local14;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("68370, " + -60 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NYZQPNXB", name = "a", descriptor = "(I)Lclient!BEBSUZBY;")
	public Class3 method226() {
		try {
			@Pc(2) Class3 local2 = this.aClass3_22;
			if (local2 == this.aClass3_21) {
				this.aClass3_22 = null;
				return null;
			} else {
				this.aClass3_22 = local2.aClass3_41;
				return local2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("17142, " + 954 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NYZQPNXB", name = "b", descriptor = "(I)Lclient!BEBSUZBY;")
	public Class3 method227() {
		try {
			@Pc(2) Class3 local2 = this.aClass3_22;
			if (local2 == this.aClass3_21) {
				this.aClass3_22 = null;
				return null;
			} else {
				this.aClass3_22 = local2.aClass3_42;
				return local2;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("17886, " + -717 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NYZQPNXB", name = "c", descriptor = "()V")
	public void method228() {
		if (this.aClass3_21.aClass3_41 == this.aClass3_21) {
			return;
		}
		while (true) {
			@Pc(10) Class3 local10 = this.aClass3_21.aClass3_41;
			if (local10 == this.aClass3_21) {
				return;
			}
			local10.method545();
		}
	}
}
