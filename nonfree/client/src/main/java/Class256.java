import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class256 {

	@OriginalMember(owner = "client!pw", name = "e", descriptor = "Lclient!pea;")
	private Class6_Sub5 aClass6_Sub5_50;

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "Lclient!pea;")
	private final Class6_Sub5 aClass6_Sub5_49 = new Class6_Sub5();

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "()V")
	public Class256() {
		this.aClass6_Sub5_49.aClass6_Sub5_59 = this.aClass6_Sub5_49;
		this.aClass6_Sub5_49.aClass6_Sub5_60 = this.aClass6_Sub5_49;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)Lclient!pea;")
	public Class6_Sub5 method5901() {
		@Pc(6) Class6_Sub5 local6 = this.aClass6_Sub5_50;
		if (this.aClass6_Sub5_49 == local6) {
			this.aClass6_Sub5_50 = null;
			return null;
		} else {
			this.aClass6_Sub5_50 = local6.aClass6_Sub5_59;
			return local6;
		}
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)Lclient!pea;")
	public Class6_Sub5 method5902() {
		@Pc(7) Class6_Sub5 local7 = this.aClass6_Sub5_49.aClass6_Sub5_59;
		if (local7 == this.aClass6_Sub5_49) {
			this.aClass6_Sub5_50 = null;
			return null;
		} else {
			this.aClass6_Sub5_50 = local7.aClass6_Sub5_59;
			return local7;
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)I")
	public int method5903() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class6_Sub5 local11 = this.aClass6_Sub5_49.aClass6_Sub5_59;
		while (local11 != this.aClass6_Sub5_49) {
			local11 = local11.aClass6_Sub5_59;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "(I)Lclient!pea;")
	public Class6_Sub5 method5904() {
		@Pc(12) Class6_Sub5 local12 = this.aClass6_Sub5_49.aClass6_Sub5_59;
		if (local12 == this.aClass6_Sub5_49) {
			return null;
		} else {
			local12.method7814();
			return local12;
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILclient!pea;)V")
	public void method5906(@OriginalArg(1) Class6_Sub5 arg0) {
		if (arg0.aClass6_Sub5_60 != null) {
			arg0.method7814();
		}
		arg0.aClass6_Sub5_59 = this.aClass6_Sub5_49;
		arg0.aClass6_Sub5_60 = this.aClass6_Sub5_49.aClass6_Sub5_60;
		arg0.aClass6_Sub5_60.aClass6_Sub5_59 = arg0;
		arg0.aClass6_Sub5_59.aClass6_Sub5_60 = arg0;
	}

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "(I)V")
	public void method5907() {
		while (true) {
			@Pc(9) Class6_Sub5 local9 = this.aClass6_Sub5_49.aClass6_Sub5_59;
			if (this.aClass6_Sub5_49 == local9) {
				this.aClass6_Sub5_50 = null;
				return;
			}
			local9.method7814();
		}
	}
}
