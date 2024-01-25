import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class234 {

	@OriginalMember(owner = "client!nr", name = "l", descriptor = "Lclient!wb;")
	private Class6_Sub3 aClass6_Sub3_8;

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "Lclient!wb;")
	public final Class6_Sub3 aClass6_Sub3_7 = new Class6_Sub3();

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
	public Class234() {
		this.aClass6_Sub3_7.aClass6_Sub3_9 = this.aClass6_Sub3_7;
		this.aClass6_Sub3_7.aClass6_Sub3_10 = this.aClass6_Sub3_7;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)Lclient!wb;")
	public Class6_Sub3 method5477() {
		@Pc(12) Class6_Sub3 local12 = this.aClass6_Sub3_7.aClass6_Sub3_10;
		if (local12 == this.aClass6_Sub3_7) {
			this.aClass6_Sub3_8 = null;
			return null;
		} else {
			this.aClass6_Sub3_8 = local12.aClass6_Sub3_10;
			return local12;
		}
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)V")
	public void method5479() {
		while (true) {
			@Pc(9) Class6_Sub3 local9 = this.aClass6_Sub3_7.aClass6_Sub3_10;
			if (this.aClass6_Sub3_7 == local9) {
				this.aClass6_Sub3_8 = null;
				return;
			}
			local9.method6553();
		}
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)I")
	public int method5480() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class6_Sub3 local11 = this.aClass6_Sub3_7.aClass6_Sub3_10; local11 != this.aClass6_Sub3_7; local11 = local11.aClass6_Sub3_10) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLclient!wb;)V")
	public void method5481(@OriginalArg(1) Class6_Sub3 arg0) {
		if (arg0.aClass6_Sub3_9 != null) {
			arg0.method6553();
		}
		arg0.aClass6_Sub3_10 = this.aClass6_Sub3_7;
		arg0.aClass6_Sub3_9 = this.aClass6_Sub3_7.aClass6_Sub3_9;
		arg0.aClass6_Sub3_9.aClass6_Sub3_10 = arg0;
		arg0.aClass6_Sub3_10.aClass6_Sub3_9 = arg0;
	}

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)Lclient!wb;")
	public Class6_Sub3 method5483() {
		@Pc(14) Class6_Sub3 local14 = this.aClass6_Sub3_8;
		if (this.aClass6_Sub3_7 == local14) {
			this.aClass6_Sub3_8 = null;
			return null;
		} else {
			this.aClass6_Sub3_8 = local14.aClass6_Sub3_10;
			return local14;
		}
	}
}
