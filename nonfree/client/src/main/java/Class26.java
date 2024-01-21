import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ODYOEFFK")
public final class Class26 {

	@OriginalMember(owner = "client!ODYOEFFK", name = "d", descriptor = "Lclient!EWMBJETC;")
	private Class6_Sub2 aClass6_Sub2_25;

	@OriginalMember(owner = "client!ODYOEFFK", name = "a", descriptor = "Z")
	private boolean aBoolean143 = false;

	@OriginalMember(owner = "client!ODYOEFFK", name = "b", descriptor = "Z")
	private boolean aBoolean144 = true;

	@OriginalMember(owner = "client!ODYOEFFK", name = "c", descriptor = "Lclient!EWMBJETC;")
	private Class6_Sub2 aClass6_Sub2_24 = new Class6_Sub2();

	@OriginalMember(owner = "client!ODYOEFFK", name = "<init>", descriptor = "(I)V")
	public Class26(@OriginalArg(0) int arg0) {
		try {
			this.aClass6_Sub2_24.aClass6_Sub2_36 = this.aClass6_Sub2_24;
			this.aClass6_Sub2_24.aClass6_Sub2_37 = this.aClass6_Sub2_24;
			@Pc(26) int local26 = 36 / arg0;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("40058, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ODYOEFFK", name = "a", descriptor = "(Lclient!EWMBJETC;)V")
	public void method351(@OriginalArg(0) Class6_Sub2 arg0) {
		if (arg0.aClass6_Sub2_37 != null) {
			arg0.method513();
		}
		arg0.aClass6_Sub2_37 = this.aClass6_Sub2_24.aClass6_Sub2_37;
		arg0.aClass6_Sub2_36 = this.aClass6_Sub2_24;
		arg0.aClass6_Sub2_37.aClass6_Sub2_36 = arg0;
		arg0.aClass6_Sub2_36.aClass6_Sub2_37 = arg0;
	}

	@OriginalMember(owner = "client!ODYOEFFK", name = "a", descriptor = "()Lclient!EWMBJETC;")
	public Class6_Sub2 method352() {
		@Pc(3) Class6_Sub2 local3 = this.aClass6_Sub2_24.aClass6_Sub2_36;
		if (local3 == this.aClass6_Sub2_24) {
			return null;
		} else {
			local3.method513();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ODYOEFFK", name = "b", descriptor = "()Lclient!EWMBJETC;")
	public Class6_Sub2 method353() {
		@Pc(3) Class6_Sub2 local3 = this.aClass6_Sub2_24.aClass6_Sub2_36;
		if (local3 == this.aClass6_Sub2_24) {
			this.aClass6_Sub2_25 = null;
			return null;
		} else {
			this.aClass6_Sub2_25 = local3.aClass6_Sub2_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ODYOEFFK", name = "a", descriptor = "(Z)Lclient!EWMBJETC;")
	public Class6_Sub2 method354() {
		try {
			@Pc(12) Class6_Sub2 local12 = this.aClass6_Sub2_25;
			if (local12 == this.aClass6_Sub2_24) {
				this.aClass6_Sub2_25 = null;
				return null;
			} else {
				this.aClass6_Sub2_25 = local12.aClass6_Sub2_36;
				return local12;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("971, " + false + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ODYOEFFK", name = "c", descriptor = "()I")
	public int method355() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class6_Sub2 local5 = this.aClass6_Sub2_24.aClass6_Sub2_36; local5 != this.aClass6_Sub2_24; local5 = local5.aClass6_Sub2_36) {
			local1++;
		}
		return local1;
	}
}
