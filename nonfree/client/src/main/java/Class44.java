import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WAPMJSJO")
public final class Class44 {

	@OriginalMember(owner = "client!WAPMJSJO", name = "c", descriptor = "I")
	private int anInt651;

	@OriginalMember(owner = "client!WAPMJSJO", name = "g", descriptor = "Lclient!LTTSKENL;")
	private Class3 aClass3_34;

	@OriginalMember(owner = "client!WAPMJSJO", name = "a", descriptor = "I")
	private int anInt650 = 673;

	@OriginalMember(owner = "client!WAPMJSJO", name = "b", descriptor = "B")
	private byte aByte29 = -126;

	@OriginalMember(owner = "client!WAPMJSJO", name = "d", descriptor = "I")
	private int anInt652 = 9;

	@OriginalMember(owner = "client!WAPMJSJO", name = "e", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "client!WAPMJSJO", name = "f", descriptor = "Lclient!LTTSKENL;")
	private Class3 aClass3_33 = new Class3();

	@OriginalMember(owner = "client!WAPMJSJO", name = "<init>", descriptor = "(B)V")
	public Class44(@OriginalArg(0) byte arg0) {
		try {
			this.aClass3_33.aClass3_41 = this.aClass3_33;
			this.aClass3_33.aClass3_42 = this.aClass3_33;
			if (arg0 != this.aByte29) {
				throw new NullPointerException();
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("51780, " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WAPMJSJO", name = "a", descriptor = "(Lclient!LTTSKENL;)V")
	public void method436(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_42 != null) {
			arg0.method514();
		}
		arg0.aClass3_42 = this.aClass3_33.aClass3_42;
		arg0.aClass3_41 = this.aClass3_33;
		arg0.aClass3_42.aClass3_41 = arg0;
		arg0.aClass3_41.aClass3_42 = arg0;
	}

	@OriginalMember(owner = "client!WAPMJSJO", name = "a", descriptor = "(Lclient!LTTSKENL;Z)V")
	public void method437(@OriginalArg(0) Class3 arg0) {
		try {
			if (arg0.aClass3_42 != null) {
				arg0.method514();
			}
			arg0.aClass3_42 = this.aClass3_33;
			arg0.aClass3_41 = this.aClass3_33.aClass3_41;
			arg0.aClass3_42.aClass3_41 = arg0;
			arg0.aClass3_41.aClass3_42 = arg0;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("83018, " + arg0 + ", " + true + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WAPMJSJO", name = "a", descriptor = "()Lclient!LTTSKENL;")
	public Class3 method438() {
		@Pc(3) Class3 local3 = this.aClass3_33.aClass3_41;
		if (local3 == this.aClass3_33) {
			return null;
		} else {
			local3.method514();
			return local3;
		}
	}

	@OriginalMember(owner = "client!WAPMJSJO", name = "b", descriptor = "()Lclient!LTTSKENL;")
	public Class3 method439() {
		@Pc(3) Class3 local3 = this.aClass3_33.aClass3_41;
		if (local3 == this.aClass3_33) {
			this.aClass3_34 = null;
			return null;
		} else {
			this.aClass3_34 = local3.aClass3_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!WAPMJSJO", name = "a", descriptor = "(I)Lclient!LTTSKENL;")
	public Class3 method440() {
		try {
			@Pc(13) Class3 local13 = this.aClass3_33.aClass3_42;
			if (local13 == this.aClass3_33) {
				this.aClass3_34 = null;
				return null;
			} else {
				this.aClass3_34 = local13.aClass3_42;
				return local13;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("68180, " + 7 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WAPMJSJO", name = "b", descriptor = "(I)Lclient!LTTSKENL;")
	public Class3 method441() {
		try {
			@Pc(2) Class3 local2 = this.aClass3_34;
			if (local2 == this.aClass3_33) {
				this.aClass3_34 = null;
				return null;
			} else {
				this.aClass3_34 = local2.aClass3_41;
				return local2;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("2072, " + 6 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WAPMJSJO", name = "c", descriptor = "(I)Lclient!LTTSKENL;")
	public Class3 method442() {
		try {
			@Pc(2) Class3 local2 = this.aClass3_34;
			if (local2 == this.aClass3_33) {
				this.aClass3_34 = null;
				return null;
			} else {
				this.aClass3_34 = local2.aClass3_42;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("14287, " + 836 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WAPMJSJO", name = "c", descriptor = "()V")
	public void method443() {
		if (this.aClass3_33.aClass3_41 == this.aClass3_33) {
			return;
		}
		while (true) {
			@Pc(10) Class3 local10 = this.aClass3_33.aClass3_41;
			if (local10 == this.aClass3_33) {
				return;
			}
			local10.method514();
		}
	}
}
