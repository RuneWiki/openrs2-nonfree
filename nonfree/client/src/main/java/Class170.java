import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class170 {

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "Lclient!mg;")
	private Class6_Sub2 aClass6_Sub2_37;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "Lclient!mg;")
	private final Class6_Sub2 aClass6_Sub2_36 = new Class6_Sub2();

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	public Class170() {
		this.aClass6_Sub2_36.aClass6_Sub2_56 = this.aClass6_Sub2_36;
		this.aClass6_Sub2_36.aClass6_Sub2_55 = this.aClass6_Sub2_36;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)Lclient!mg;")
	public Class6_Sub2 method4000() {
		@Pc(6) Class6_Sub2 local6 = this.aClass6_Sub2_37;
		if (local6 == this.aClass6_Sub2_36) {
			this.aClass6_Sub2_37 = null;
			return null;
		} else {
			this.aClass6_Sub2_37 = local6.aClass6_Sub2_56;
			return local6;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLclient!mg;)V")
	public void method4001(@OriginalArg(1) Class6_Sub2 arg0) {
		if (arg0.aClass6_Sub2_55 != null) {
			arg0.method6373();
		}
		arg0.aClass6_Sub2_55 = this.aClass6_Sub2_36.aClass6_Sub2_55;
		arg0.aClass6_Sub2_56 = this.aClass6_Sub2_36;
		arg0.aClass6_Sub2_55.aClass6_Sub2_56 = arg0;
		arg0.aClass6_Sub2_56.aClass6_Sub2_55 = arg0;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)I")
	public int method4002() {
		@Pc(5) int local5 = 0;
		for (@Pc(9) Class6_Sub2 local9 = this.aClass6_Sub2_36.aClass6_Sub2_56; local9 != this.aClass6_Sub2_36; local9 = local9.aClass6_Sub2_56) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)Lclient!mg;")
	public Class6_Sub2 method4003() {
		@Pc(7) Class6_Sub2 local7 = this.aClass6_Sub2_36.aClass6_Sub2_56;
		if (local7 == this.aClass6_Sub2_36) {
			return null;
		} else {
			local7.method6373();
			return local7;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)Lclient!mg;")
	public Class6_Sub2 method4006() {
		@Pc(7) Class6_Sub2 local7 = this.aClass6_Sub2_36.aClass6_Sub2_56;
		if (this.aClass6_Sub2_36 == local7) {
			this.aClass6_Sub2_37 = null;
			return null;
		} else {
			this.aClass6_Sub2_37 = local7.aClass6_Sub2_56;
			return local7;
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
	public void method4007() {
		while (true) {
			@Pc(13) Class6_Sub2 local13 = this.aClass6_Sub2_36.aClass6_Sub2_56;
			if (this.aClass6_Sub2_36 == local13) {
				this.aClass6_Sub2_37 = null;
				return;
			}
			local13.method6373();
		}
	}
}
