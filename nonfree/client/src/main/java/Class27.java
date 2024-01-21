import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OCPYCLUF")
public final class Class27 {

	@OriginalMember(owner = "client!OCPYCLUF", name = "a", descriptor = "I")
	private int anInt467;

	@OriginalMember(owner = "client!OCPYCLUF", name = "f", descriptor = "Lclient!MRGQMKFG;")
	private Class3 aClass3_26;

	@OriginalMember(owner = "client!OCPYCLUF", name = "b", descriptor = "I")
	private int anInt468 = 6;

	@OriginalMember(owner = "client!OCPYCLUF", name = "d", descriptor = "Z")
	private boolean aBoolean128 = true;

	@OriginalMember(owner = "client!OCPYCLUF", name = "e", descriptor = "Lclient!MRGQMKFG;")
	private Class3 aClass3_25 = new Class3();

	@OriginalMember(owner = "client!OCPYCLUF", name = "c", descriptor = "I")
	private int anInt469;

	@OriginalMember(owner = "client!OCPYCLUF", name = "<init>", descriptor = "(B)V")
	public Class27(@OriginalArg(0) byte arg0) {
		try {
			this.aClass3_25.aClass3_41 = this.aClass3_25;
			this.aClass3_25.aClass3_42 = this.aClass3_25;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("32040, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OCPYCLUF", name = "a", descriptor = "(Lclient!MRGQMKFG;)V")
	public void method324(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_42 != null) {
			arg0.method547();
		}
		arg0.aClass3_42 = this.aClass3_25.aClass3_42;
		arg0.aClass3_41 = this.aClass3_25;
		arg0.aClass3_42.aClass3_41 = arg0;
		arg0.aClass3_41.aClass3_42 = arg0;
	}

	@OriginalMember(owner = "client!OCPYCLUF", name = "a", descriptor = "(Lclient!MRGQMKFG;B)V")
	public void method325(@OriginalArg(0) Class3 arg0) {
		try {
			if (arg0.aClass3_42 != null) {
				arg0.method547();
			}
			arg0.aClass3_42 = this.aClass3_25;
			arg0.aClass3_41 = this.aClass3_25.aClass3_41;
			arg0.aClass3_42.aClass3_41 = arg0;
			arg0.aClass3_41.aClass3_42 = arg0;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("6808, " + arg0 + ", " + -109 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OCPYCLUF", name = "a", descriptor = "()Lclient!MRGQMKFG;")
	public Class3 method326() {
		@Pc(3) Class3 local3 = this.aClass3_25.aClass3_41;
		if (local3 == this.aClass3_25) {
			return null;
		} else {
			local3.method547();
			return local3;
		}
	}

	@OriginalMember(owner = "client!OCPYCLUF", name = "b", descriptor = "()Lclient!MRGQMKFG;")
	public Class3 method327() {
		@Pc(3) Class3 local3 = this.aClass3_25.aClass3_41;
		if (local3 == this.aClass3_25) {
			this.aClass3_26 = null;
			return null;
		} else {
			this.aClass3_26 = local3.aClass3_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!OCPYCLUF", name = "a", descriptor = "(I)Lclient!MRGQMKFG;")
	public Class3 method328() {
		try {
			@Pc(3) Class3 local3 = this.aClass3_25.aClass3_42;
			if (6 < this.anInt468 || 6 > this.anInt468) {
				throw new NullPointerException();
			} else if (local3 == this.aClass3_25) {
				this.aClass3_26 = null;
				return null;
			} else {
				this.aClass3_26 = local3.aClass3_42;
				return local3;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("13376, " + 6 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OCPYCLUF", name = "b", descriptor = "(I)Lclient!MRGQMKFG;")
	public Class3 method329(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class3 local2 = this.aClass3_26;
			if (arg0 != 0) {
				this.aBoolean128 = !this.aBoolean128;
			}
			if (local2 == this.aClass3_25) {
				this.aClass3_26 = null;
				return null;
			} else {
				this.aClass3_26 = local2.aClass3_41;
				return local2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("15894, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OCPYCLUF", name = "a", descriptor = "(Z)Lclient!MRGQMKFG;")
	public Class3 method330() {
		try {
			@Pc(7) Class3 local7 = this.aClass3_26;
			if (local7 == this.aClass3_25) {
				this.aClass3_26 = null;
				return null;
			} else {
				this.aClass3_26 = local7.aClass3_42;
				return local7;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("37997, " + true + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OCPYCLUF", name = "c", descriptor = "()V")
	public void method331() {
		if (this.aClass3_25.aClass3_41 == this.aClass3_25) {
			return;
		}
		while (true) {
			@Pc(10) Class3 local10 = this.aClass3_25.aClass3_41;
			if (local10 == this.aClass3_25) {
				return;
			}
			local10.method547();
		}
	}
}
