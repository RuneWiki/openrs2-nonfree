import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gga")
public final class Class114 {

	@OriginalMember(owner = "client!gga", name = "n", descriptor = "Lclient!gf;")
	private Class25_Sub5 aClass25_Sub5_4;

	@OriginalMember(owner = "client!gga", name = "h", descriptor = "Lclient!gf;")
	public final Class25_Sub5 aClass25_Sub5_3 = new Class25_Sub5();

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "()V")
	public Class114() {
		this.aClass25_Sub5_3.aClass25_Sub5_10 = this.aClass25_Sub5_3;
		this.aClass25_Sub5_3.aClass25_Sub5_9 = this.aClass25_Sub5_3;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)Lclient!gf;")
	public Class25_Sub5 method3057() {
		@Pc(12) Class25_Sub5 local12 = this.aClass25_Sub5_3.aClass25_Sub5_10;
		if (this.aClass25_Sub5_3 == local12) {
			this.aClass25_Sub5_4 = null;
			return null;
		} else {
			this.aClass25_Sub5_4 = local12.aClass25_Sub5_10;
			return local12;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)Lclient!gf;")
	public Class25_Sub5 method3059() {
		@Pc(6) Class25_Sub5 local6 = this.aClass25_Sub5_4;
		if (local6 == this.aClass25_Sub5_3) {
			this.aClass25_Sub5_4 = null;
			return null;
		} else {
			this.aClass25_Sub5_4 = local6.aClass25_Sub5_10;
			return local6;
		}
	}

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "(I)V")
	public void method3063() {
		while (true) {
			@Pc(5) Class25_Sub5 local5 = this.aClass25_Sub5_3.aClass25_Sub5_10;
			if (this.aClass25_Sub5_3 == local5) {
				this.aClass25_Sub5_4 = null;
				return;
			}
			local5.method6962();
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lclient!gf;B)V")
	public void method3064(@OriginalArg(0) Class25_Sub5 arg0) {
		if (arg0.aClass25_Sub5_9 != null) {
			arg0.method6962();
		}
		arg0.aClass25_Sub5_9 = this.aClass25_Sub5_3.aClass25_Sub5_9;
		arg0.aClass25_Sub5_10 = this.aClass25_Sub5_3;
		arg0.aClass25_Sub5_9.aClass25_Sub5_10 = arg0;
		arg0.aClass25_Sub5_10.aClass25_Sub5_9 = arg0;
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(B)I")
	public int method3066() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class25_Sub5 local16 = this.aClass25_Sub5_3.aClass25_Sub5_10;
		while (local16 != this.aClass25_Sub5_3) {
			local16 = local16.aClass25_Sub5_10;
			local7++;
		}
		return local7;
	}
}
