import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BGTUCWCI")
public final class Class3 {

	@OriginalMember(owner = "client!BGTUCWCI", name = "c", descriptor = "Lclient!UCIRENXU;")
	private Class6_Sub2 aClass6_Sub2_2;

	@OriginalMember(owner = "client!BGTUCWCI", name = "a", descriptor = "Z")
	private boolean aBoolean5 = false;

	@OriginalMember(owner = "client!BGTUCWCI", name = "b", descriptor = "Lclient!UCIRENXU;")
	private Class6_Sub2 aClass6_Sub2_1 = new Class6_Sub2();

	@OriginalMember(owner = "client!BGTUCWCI", name = "<init>", descriptor = "(I)V")
	public Class3(@OriginalArg(0) int arg0) {
		try {
			this.aClass6_Sub2_1.aClass6_Sub2_36 = this.aClass6_Sub2_1;
			this.aClass6_Sub2_1.aClass6_Sub2_37 = this.aClass6_Sub2_1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("57111, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BGTUCWCI", name = "a", descriptor = "(Lclient!UCIRENXU;)V")
	public void method13(@OriginalArg(0) Class6_Sub2 arg0) {
		if (arg0.aClass6_Sub2_37 != null) {
			arg0.method546();
		}
		arg0.aClass6_Sub2_37 = this.aClass6_Sub2_1.aClass6_Sub2_37;
		arg0.aClass6_Sub2_36 = this.aClass6_Sub2_1;
		arg0.aClass6_Sub2_37.aClass6_Sub2_36 = arg0;
		arg0.aClass6_Sub2_36.aClass6_Sub2_37 = arg0;
	}

	@OriginalMember(owner = "client!BGTUCWCI", name = "a", descriptor = "()Lclient!UCIRENXU;")
	public Class6_Sub2 method14() {
		@Pc(3) Class6_Sub2 local3 = this.aClass6_Sub2_1.aClass6_Sub2_36;
		if (local3 == this.aClass6_Sub2_1) {
			return null;
		} else {
			local3.method546();
			return local3;
		}
	}

	@OriginalMember(owner = "client!BGTUCWCI", name = "b", descriptor = "()Lclient!UCIRENXU;")
	public Class6_Sub2 method15() {
		@Pc(3) Class6_Sub2 local3 = this.aClass6_Sub2_1.aClass6_Sub2_36;
		if (local3 == this.aClass6_Sub2_1) {
			this.aClass6_Sub2_2 = null;
			return null;
		} else {
			this.aClass6_Sub2_2 = local3.aClass6_Sub2_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!BGTUCWCI", name = "a", descriptor = "(I)Lclient!UCIRENXU;")
	public Class6_Sub2 method16() {
		try {
			@Pc(2) Class6_Sub2 local2 = this.aClass6_Sub2_2;
			if (local2 == this.aClass6_Sub2_1) {
				this.aClass6_Sub2_2 = null;
				return null;
			} else {
				this.aClass6_Sub2_2 = local2.aClass6_Sub2_36;
				return local2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("87745, " + 8 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BGTUCWCI", name = "c", descriptor = "()I")
	public int method17() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class6_Sub2 local5 = this.aClass6_Sub2_1.aClass6_Sub2_36; local5 != this.aClass6_Sub2_1; local5 = local5.aClass6_Sub2_36) {
			local1++;
		}
		return local1;
	}
}
