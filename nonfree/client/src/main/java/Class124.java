import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class124 {

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "Lclient!rc;")
	private Class4 aClass4_91;

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "Lclient!rc;")
	public final Class4 aClass4_90 = new Class4();

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class124() {
		this.aClass4_90.aClass4_288 = this.aClass4_90;
		this.aClass4_90.aClass4_287 = this.aClass4_90;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)Z")
	public boolean method3264() {
		return this.aClass4_90 == this.aClass4_90.aClass4_287;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
	public void method3265() {
		while (true) {
			@Pc(16) Class4 local16 = this.aClass4_90.aClass4_287;
			if (this.aClass4_90 == local16) {
				this.aClass4_91 = null;
				return;
			}
			local16.method8013();
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Lclient!rc;")
	public Class4 method3266() {
		@Pc(6) Class4 local6 = this.aClass4_91;
		if (this.aClass4_90 == local6) {
			this.aClass4_91 = null;
			return null;
		} else {
			this.aClass4_91 = local6.aClass4_288;
			return local6;
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)Lclient!rc;")
	public Class4 method3267() {
		@Pc(13) Class4 local13 = this.aClass4_90.aClass4_287;
		if (this.aClass4_90 == local13) {
			this.aClass4_91 = null;
			return null;
		} else {
			this.aClass4_91 = local13.aClass4_287;
			return local13;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!rc;I)V")
	public void method3268(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_288 != null) {
			arg0.method8013();
		}
		arg0.aClass4_288 = this.aClass4_90;
		arg0.aClass4_287 = this.aClass4_90.aClass4_287;
		arg0.aClass4_288.aClass4_287 = arg0;
		arg0.aClass4_287.aClass4_288 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!rc;Lclient!gj;B)V")
	private void method3269(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class124 arg1) {
		@Pc(7) Class4 local7 = this.aClass4_90.aClass4_288;
		this.aClass4_90.aClass4_288 = arg0.aClass4_288;
		arg0.aClass4_288.aClass4_287 = this.aClass4_90;
		if (arg0 != this.aClass4_90) {
			arg0.aClass4_288 = arg1.aClass4_90.aClass4_288;
			arg0.aClass4_288.aClass4_287 = arg0;
			arg1.aClass4_90.aClass4_288 = local7;
			local7.aClass4_287 = arg1.aClass4_90;
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)I")
	public int method3271() {
		@Pc(5) int local5 = 0;
		for (@Pc(9) Class4 local9 = this.aClass4_90.aClass4_287; local9 != this.aClass4_90; local9 = local9.aClass4_287) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)Lclient!rc;")
	public Class4 method3272() {
		@Pc(7) Class4 local7 = this.aClass4_90.aClass4_287;
		if (this.aClass4_90 == local7) {
			return null;
		} else {
			local7.method8013();
			return local7;
		}
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)Lclient!rc;")
	public Class4 method3273() {
		@Pc(6) Class4 local6 = this.aClass4_91;
		if (this.aClass4_90 == local6) {
			this.aClass4_91 = null;
			return null;
		} else {
			this.aClass4_91 = local6.aClass4_287;
			return local6;
		}
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(B)Lclient!rc;")
	public Class4 method3274() {
		@Pc(7) Class4 local7 = this.aClass4_90.aClass4_288;
		if (this.aClass4_90 == local7) {
			this.aClass4_91 = null;
			return null;
		} else {
			this.aClass4_91 = local7.aClass4_288;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!rc;B)V")
	public void method3275(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_288 != null) {
			arg0.method8013();
		}
		arg0.aClass4_287 = this.aClass4_90;
		arg0.aClass4_288 = this.aClass4_90.aClass4_288;
		arg0.aClass4_288.aClass4_287 = arg0;
		arg0.aClass4_287.aClass4_288 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLclient!gj;)V")
	public void method3276(@OriginalArg(1) Class124 arg0) {
		this.method3269(this.aClass4_90.aClass4_287, arg0);
	}
}
