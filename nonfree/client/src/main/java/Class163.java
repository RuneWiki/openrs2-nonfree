import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class163 {

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "Lclient!es;")
	private Class10 aClass10_150;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "Lclient!es;")
	public final Class10 aClass10_149 = new Class10();

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class163() {
		this.aClass10_149.aClass10_263 = this.aClass10_149;
		this.aClass10_149.aClass10_264 = this.aClass10_149;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Lclient!es;")
	public Class10 method3612() {
		@Pc(13) Class10 local13 = this.aClass10_149.aClass10_264;
		if (this.aClass10_149 == local13) {
			this.aClass10_150 = null;
			return null;
		} else {
			this.aClass10_150 = local13.aClass10_264;
			return local13;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLclient!es;)V")
	public void method3613(@OriginalArg(1) Class10 arg0) {
		if (arg0.aClass10_264 != null) {
			arg0.method6033();
		}
		arg0.aClass10_264 = this.aClass10_149.aClass10_264;
		arg0.aClass10_263 = this.aClass10_149;
		arg0.aClass10_264.aClass10_263 = arg0;
		arg0.aClass10_263.aClass10_264 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)I")
	public int method3614() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class10 local16 = this.aClass10_149.aClass10_263;
		while (this.aClass10_149 != local16) {
			local16 = local16.aClass10_263;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLclient!es;)V")
	public void method3615(@OriginalArg(1) Class10 arg0) {
		if (arg0.aClass10_264 != null) {
			arg0.method6033();
		}
		arg0.aClass10_264 = this.aClass10_149;
		arg0.aClass10_263 = this.aClass10_149.aClass10_263;
		arg0.aClass10_264.aClass10_263 = arg0;
		arg0.aClass10_263.aClass10_264 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!es;Lclient!mf;I)V")
	private void method3616(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class163 arg1) {
		@Pc(7) Class10 local7 = this.aClass10_149.aClass10_264;
		this.aClass10_149.aClass10_264 = arg0.aClass10_264;
		arg0.aClass10_264.aClass10_263 = this.aClass10_149;
		if (arg0 != this.aClass10_149) {
			arg0.aClass10_264 = arg1.aClass10_149.aClass10_264;
			arg0.aClass10_264.aClass10_263 = arg0;
			local7.aClass10_263 = arg1.aClass10_149;
			arg1.aClass10_149.aClass10_264 = local7;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)Z")
	public boolean method3617() {
		return this.aClass10_149 == this.aClass10_149.aClass10_263;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	public void method3619() {
		while (true) {
			@Pc(13) Class10 local13 = this.aClass10_149.aClass10_263;
			if (local13 == this.aClass10_149) {
				this.aClass10_150 = null;
				return;
			}
			local13.method6033();
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)Lclient!es;")
	public Class10 method3620() {
		@Pc(12) Class10 local12 = this.aClass10_149.aClass10_263;
		if (local12 == this.aClass10_149) {
			this.aClass10_150 = null;
			return null;
		} else {
			this.aClass10_150 = local12.aClass10_263;
			return local12;
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)Lclient!es;")
	public Class10 method3621() {
		@Pc(6) Class10 local6 = this.aClass10_150;
		if (local6 == this.aClass10_149) {
			this.aClass10_150 = null;
			return null;
		} else {
			this.aClass10_150 = local6.aClass10_263;
			return local6;
		}
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)Lclient!es;")
	public Class10 method3622() {
		@Pc(7) Class10 local7 = this.aClass10_149.aClass10_263;
		if (local7 == this.aClass10_149) {
			return null;
		} else {
			local7.method6033();
			return local7;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLclient!mf;)V")
	public void method3623(@OriginalArg(1) Class163 arg0) {
		this.method3616(this.aClass10_149.aClass10_263, arg0);
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)Lclient!es;")
	public Class10 method3624() {
		@Pc(6) Class10 local6 = this.aClass10_150;
		if (local6 == this.aClass10_149) {
			this.aClass10_150 = null;
			return null;
		} else {
			this.aClass10_150 = local6.aClass10_264;
			return local6;
		}
	}
}
