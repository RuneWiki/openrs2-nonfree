import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class161 {

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "Lclient!gq;")
	private Class15_Sub4 aClass15_Sub4_8;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Lclient!gq;")
	public final Class15_Sub4 aClass15_Sub4_7 = new Class15_Sub4();

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	public Class161() {
		this.aClass15_Sub4_7.aClass15_Sub4_5 = this.aClass15_Sub4_7;
		this.aClass15_Sub4_7.aClass15_Sub4_6 = this.aClass15_Sub4_7;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!gq;B)V")
	public void method4433(@OriginalArg(0) Class15_Sub4 arg0) {
		if (arg0.aClass15_Sub4_6 != null) {
			arg0.method3711();
		}
		arg0.aClass15_Sub4_5 = this.aClass15_Sub4_7;
		arg0.aClass15_Sub4_6 = this.aClass15_Sub4_7.aClass15_Sub4_6;
		arg0.aClass15_Sub4_6.aClass15_Sub4_5 = arg0;
		arg0.aClass15_Sub4_5.aClass15_Sub4_6 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Lclient!gq;")
	public Class15_Sub4 method4434() {
		@Pc(6) Class15_Sub4 local6 = this.aClass15_Sub4_8;
		if (this.aClass15_Sub4_7 == local6) {
			this.aClass15_Sub4_8 = null;
			return null;
		} else {
			this.aClass15_Sub4_8 = local6.aClass15_Sub4_5;
			return local6;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Lclient!gq;")
	public Class15_Sub4 method4435() {
		@Pc(12) Class15_Sub4 local12 = this.aClass15_Sub4_7.aClass15_Sub4_5;
		if (local12 == this.aClass15_Sub4_7) {
			this.aClass15_Sub4_8 = null;
			return null;
		} else {
			this.aClass15_Sub4_8 = local12.aClass15_Sub4_5;
			return local12;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	public void method4436() {
		while (true) {
			@Pc(5) Class15_Sub4 local5 = this.aClass15_Sub4_7.aClass15_Sub4_5;
			if (local5 == this.aClass15_Sub4_7) {
				this.aClass15_Sub4_8 = null;
				return;
			}
			local5.method3711();
		}
	}
}
