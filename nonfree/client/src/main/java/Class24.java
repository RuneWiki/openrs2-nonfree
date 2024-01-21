import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LIHZBJAU")
public final class Class24 {

	@OriginalMember(owner = "client!LIHZBJAU", name = "d", descriptor = "Lclient!PFQOGDTY;")
	private Class6_Sub1 aClass6_Sub1_22;

	@OriginalMember(owner = "client!LIHZBJAU", name = "a", descriptor = "Z")
	private boolean aBoolean95 = true;

	@OriginalMember(owner = "client!LIHZBJAU", name = "b", descriptor = "B")
	private byte aByte9 = 8;

	@OriginalMember(owner = "client!LIHZBJAU", name = "c", descriptor = "Lclient!PFQOGDTY;")
	private Class6_Sub1 aClass6_Sub1_21 = new Class6_Sub1();

	@OriginalMember(owner = "client!LIHZBJAU", name = "<init>", descriptor = "(I)V")
	public Class24(@OriginalArg(0) int arg0) {
		try {
			this.aClass6_Sub1_21.aClass6_Sub1_36 = this.aClass6_Sub1_21;
			this.aClass6_Sub1_21.aClass6_Sub1_37 = this.aClass6_Sub1_21;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("20712, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LIHZBJAU", name = "a", descriptor = "(Lclient!PFQOGDTY;)V")
	public void method185(@OriginalArg(0) Class6_Sub1 arg0) {
		if (arg0.aClass6_Sub1_37 != null) {
			arg0.method549();
		}
		arg0.aClass6_Sub1_37 = this.aClass6_Sub1_21.aClass6_Sub1_37;
		arg0.aClass6_Sub1_36 = this.aClass6_Sub1_21;
		arg0.aClass6_Sub1_37.aClass6_Sub1_36 = arg0;
		arg0.aClass6_Sub1_36.aClass6_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!LIHZBJAU", name = "a", descriptor = "()Lclient!PFQOGDTY;")
	public Class6_Sub1 method186() {
		@Pc(3) Class6_Sub1 local3 = this.aClass6_Sub1_21.aClass6_Sub1_36;
		if (local3 == this.aClass6_Sub1_21) {
			return null;
		} else {
			local3.method549();
			return local3;
		}
	}

	@OriginalMember(owner = "client!LIHZBJAU", name = "b", descriptor = "()Lclient!PFQOGDTY;")
	public Class6_Sub1 method187() {
		@Pc(3) Class6_Sub1 local3 = this.aClass6_Sub1_21.aClass6_Sub1_36;
		if (local3 == this.aClass6_Sub1_21) {
			this.aClass6_Sub1_22 = null;
			return null;
		} else {
			this.aClass6_Sub1_22 = local3.aClass6_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!LIHZBJAU", name = "a", descriptor = "(B)Lclient!PFQOGDTY;")
	public Class6_Sub1 method188() {
		try {
			if (this.aByte9 != 8) {
				throw new NullPointerException();
			}
			@Pc(10) Class6_Sub1 local10 = this.aClass6_Sub1_22;
			if (local10 == this.aClass6_Sub1_21) {
				this.aClass6_Sub1_22 = null;
				return null;
			} else {
				this.aClass6_Sub1_22 = local10.aClass6_Sub1_36;
				return local10;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("24844, " + 8 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LIHZBJAU", name = "c", descriptor = "()I")
	public int method189() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class6_Sub1 local5 = this.aClass6_Sub1_21.aClass6_Sub1_36; local5 != this.aClass6_Sub1_21; local5 = local5.aClass6_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
