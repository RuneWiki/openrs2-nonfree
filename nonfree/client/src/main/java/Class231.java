import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class231 {

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "Lclient!tm;")
	private Class6_Sub5 aClass6_Sub5_61;

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "Lclient!tm;")
	public final Class6_Sub5 aClass6_Sub5_60 = new Class6_Sub5();

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
	public Class231() {
		this.aClass6_Sub5_60.aClass6_Sub5_67 = this.aClass6_Sub5_60;
		this.aClass6_Sub5_60.aClass6_Sub5_66 = this.aClass6_Sub5_60;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!tm;I)V")
	public void method6048(@OriginalArg(0) Class6_Sub5 arg0) {
		if (arg0.aClass6_Sub5_67 != null) {
			arg0.method7748();
		}
		arg0.aClass6_Sub5_66 = this.aClass6_Sub5_60;
		arg0.aClass6_Sub5_67 = this.aClass6_Sub5_60.aClass6_Sub5_67;
		arg0.aClass6_Sub5_67.aClass6_Sub5_66 = arg0;
		arg0.aClass6_Sub5_66.aClass6_Sub5_67 = arg0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
	public void method6049() {
		while (true) {
			@Pc(15) Class6_Sub5 local15 = this.aClass6_Sub5_60.aClass6_Sub5_66;
			if (this.aClass6_Sub5_60 == local15) {
				this.aClass6_Sub5_61 = null;
				return;
			}
			local15.method7748();
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)Lclient!tm;")
	public Class6_Sub5 method6050() {
		@Pc(10) Class6_Sub5 local10 = this.aClass6_Sub5_61;
		if (this.aClass6_Sub5_60 == local10) {
			this.aClass6_Sub5_61 = null;
			return null;
		} else {
			this.aClass6_Sub5_61 = local10.aClass6_Sub5_66;
			return local10;
		}
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)I")
	public int method6051() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class6_Sub5 local16 = this.aClass6_Sub5_60.aClass6_Sub5_66; local16 != this.aClass6_Sub5_60; local16 = local16.aClass6_Sub5_66) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)Lclient!tm;")
	public Class6_Sub5 method6052() {
		@Pc(12) Class6_Sub5 local12 = this.aClass6_Sub5_60.aClass6_Sub5_66;
		if (this.aClass6_Sub5_60 == local12) {
			return null;
		} else {
			local12.method7748();
			return local12;
		}
	}

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)Lclient!tm;")
	public Class6_Sub5 method6055() {
		@Pc(7) Class6_Sub5 local7 = this.aClass6_Sub5_60.aClass6_Sub5_66;
		if (local7 == this.aClass6_Sub5_60) {
			this.aClass6_Sub5_61 = null;
			return null;
		} else {
			this.aClass6_Sub5_61 = local7.aClass6_Sub5_66;
			return local7;
		}
	}
}
