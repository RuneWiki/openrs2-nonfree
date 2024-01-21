import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EZXKBAZY")
public final class Class12 {

	@OriginalMember(owner = "client!EZXKBAZY", name = "d", descriptor = "Lclient!BRISMNPP;")
	private Class2 aClass2_18;

	@OriginalMember(owner = "client!EZXKBAZY", name = "a", descriptor = "I")
	private int anInt159 = 270;

	@OriginalMember(owner = "client!EZXKBAZY", name = "b", descriptor = "Z")
	private boolean aBoolean46 = true;

	@OriginalMember(owner = "client!EZXKBAZY", name = "c", descriptor = "Lclient!BRISMNPP;")
	private Class2 aClass2_17 = new Class2();

	@OriginalMember(owner = "client!EZXKBAZY", name = "<init>", descriptor = "(Z)V")
	public Class12(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass2_17.aClass2_41 = this.aClass2_17;
			this.aClass2_17.aClass2_42 = this.aClass2_17;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("59704, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZXKBAZY", name = "a", descriptor = "(Lclient!BRISMNPP;)V")
	public void method108(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_42 != null) {
			arg0.method507();
		}
		arg0.aClass2_42 = this.aClass2_17.aClass2_42;
		arg0.aClass2_41 = this.aClass2_17;
		arg0.aClass2_42.aClass2_41 = arg0;
		arg0.aClass2_41.aClass2_42 = arg0;
	}

	@OriginalMember(owner = "client!EZXKBAZY", name = "a", descriptor = "(ILclient!BRISMNPP;)V")
	public void method109(@OriginalArg(0) int arg0, @OriginalArg(1) Class2 arg1) {
		try {
			if (arg1.aClass2_42 != null) {
				arg1.method507();
			}
			arg1.aClass2_42 = this.aClass2_17;
			arg1.aClass2_41 = this.aClass2_17.aClass2_41;
			arg1.aClass2_42.aClass2_41 = arg1;
			if (arg0 != 6) {
				this.anInt159 = 318;
			}
			arg1.aClass2_41.aClass2_42 = arg1;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("20035, " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZXKBAZY", name = "a", descriptor = "()Lclient!BRISMNPP;")
	public Class2 method110() {
		@Pc(3) Class2 local3 = this.aClass2_17.aClass2_41;
		if (local3 == this.aClass2_17) {
			return null;
		} else {
			local3.method507();
			return local3;
		}
	}

	@OriginalMember(owner = "client!EZXKBAZY", name = "b", descriptor = "()Lclient!BRISMNPP;")
	public Class2 method111() {
		@Pc(3) Class2 local3 = this.aClass2_17.aClass2_41;
		if (local3 == this.aClass2_17) {
			this.aClass2_18 = null;
			return null;
		} else {
			this.aClass2_18 = local3.aClass2_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!EZXKBAZY", name = "a", descriptor = "(Z)Lclient!BRISMNPP;")
	public Class2 method112() {
		try {
			@Pc(13) Class2 local13 = this.aClass2_17.aClass2_42;
			if (local13 == this.aClass2_17) {
				this.aClass2_18 = null;
				return null;
			} else {
				this.aClass2_18 = local13.aClass2_42;
				return local13;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("24138, " + false + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZXKBAZY", name = "a", descriptor = "(I)Lclient!BRISMNPP;")
	public Class2 method113() {
		try {
			@Pc(2) Class2 local2 = this.aClass2_18;
			if (local2 == this.aClass2_17) {
				this.aClass2_18 = null;
				return null;
			} else {
				this.aClass2_18 = local2.aClass2_41;
				return local2;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("83936, " + 262 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZXKBAZY", name = "b", descriptor = "(Z)Lclient!BRISMNPP;")
	public Class2 method114() {
		try {
			@Pc(2) Class2 local2 = this.aClass2_18;
			if (local2 == this.aClass2_17) {
				this.aClass2_18 = null;
				return null;
			} else {
				this.aClass2_18 = local2.aClass2_42;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("48669, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZXKBAZY", name = "c", descriptor = "()V")
	public void method115() {
		if (this.aClass2_17.aClass2_41 == this.aClass2_17) {
			return;
		}
		while (true) {
			@Pc(10) Class2 local10 = this.aClass2_17.aClass2_41;
			if (local10 == this.aClass2_17) {
				return;
			}
			local10.method507();
		}
	}
}
