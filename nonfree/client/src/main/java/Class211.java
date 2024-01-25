import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class211 {

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "Lclient!on;")
	private Class6 aClass6_238;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "Lclient!on;")
	public final Class6 aClass6_237 = new Class6();

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
	public Class211() {
		this.aClass6_237.aClass6_247 = this.aClass6_237;
		this.aClass6_237.aClass6_248 = this.aClass6_237;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)Lclient!on;")
	public Class6 method5582() {
		@Pc(6) Class6 local6 = this.aClass6_238;
		if (local6 == this.aClass6_237) {
			this.aClass6_238 = null;
			return null;
		} else {
			this.aClass6_238 = local6.aClass6_248;
			return local6;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)I")
	public int method5583() {
		@Pc(7) int local7 = 0;
		for (@Pc(17) Class6 local17 = this.aClass6_237.aClass6_248; local17 != this.aClass6_237; local17 = local17.aClass6_248) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	public void method5584() {
		while (true) {
			@Pc(16) Class6 local16 = this.aClass6_237.aClass6_248;
			if (this.aClass6_237 == local16) {
				this.aClass6_238 = null;
				return;
			}
			local16.method5756();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLclient!on;)V")
	public void method5585(@OriginalArg(1) Class6 arg0) {
		if (arg0.aClass6_247 != null) {
			arg0.method5756();
		}
		arg0.aClass6_248 = this.aClass6_237;
		arg0.aClass6_247 = this.aClass6_237.aClass6_247;
		arg0.aClass6_247.aClass6_248 = arg0;
		arg0.aClass6_248.aClass6_247 = arg0;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!vq;I)V")
	public void method5586(@OriginalArg(0) Class211 arg0) {
		this.method5596(arg0, this.aClass6_237.aClass6_248);
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)Lclient!on;")
	public Class6 method5587() {
		@Pc(7) Class6 local7 = this.aClass6_237.aClass6_248;
		if (local7 == this.aClass6_237) {
			return null;
		} else {
			local7.method5756();
			return local7;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!on;I)V")
	public void method5588(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_247 != null) {
			arg0.method5756();
		}
		arg0.aClass6_247 = this.aClass6_237;
		arg0.aClass6_248 = this.aClass6_237.aClass6_248;
		arg0.aClass6_247.aClass6_248 = arg0;
		arg0.aClass6_248.aClass6_247 = arg0;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)Z")
	public boolean method5589() {
		return this.aClass6_237.aClass6_248 == this.aClass6_237;
	}

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(I)Lclient!on;")
	public Class6 method5590() {
		@Pc(12) Class6 local12 = this.aClass6_237.aClass6_247;
		if (local12 == this.aClass6_237) {
			this.aClass6_238 = null;
			return null;
		} else {
			this.aClass6_238 = local12.aClass6_247;
			return local12;
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)Lclient!on;")
	public Class6 method5593() {
		@Pc(14) Class6 local14 = this.aClass6_238;
		if (local14 == this.aClass6_237) {
			this.aClass6_238 = null;
			return null;
		} else {
			this.aClass6_238 = local14.aClass6_247;
			return local14;
		}
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(B)Lclient!on;")
	public Class6 method5594() {
		@Pc(12) Class6 local12 = this.aClass6_237.aClass6_248;
		if (this.aClass6_237 == local12) {
			this.aClass6_238 = null;
			return null;
		} else {
			this.aClass6_238 = local12.aClass6_248;
			return local12;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLclient!vq;Lclient!on;)V")
	private void method5596(@OriginalArg(1) Class211 arg0, @OriginalArg(2) Class6 arg1) {
		@Pc(7) Class6 local7 = this.aClass6_237.aClass6_247;
		this.aClass6_237.aClass6_247 = arg1.aClass6_247;
		arg1.aClass6_247.aClass6_248 = this.aClass6_237;
		if (arg1 != this.aClass6_237) {
			arg1.aClass6_247 = arg0.aClass6_237.aClass6_247;
			arg1.aClass6_247.aClass6_248 = arg1;
			local7.aClass6_248 = arg0.aClass6_237;
			arg0.aClass6_237.aClass6_247 = local7;
		}
	}
}
