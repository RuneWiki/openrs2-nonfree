import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class280 {

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "Lclient!al;")
	private Class14_Sub3 aClass14_Sub3_49;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!dha;")
	private Class73 aClass73_9;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class280() {
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!dha;)V")
	public Class280(@OriginalArg(0) Class73 arg0) {
		this.aClass73_9 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Lclient!al;")
	public Class14_Sub3 method6860() {
		@Pc(6) Class14_Sub3 local6 = this.aClass14_Sub3_49;
		if (this.aClass73_9.aClass14_Sub3_20 == local6) {
			this.aClass14_Sub3_49 = null;
			return null;
		} else {
			this.aClass14_Sub3_49 = local6.aClass14_Sub3_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)Lclient!al;")
	public Class14_Sub3 method6863() {
		@Pc(8) Class14_Sub3 local8 = this.aClass73_9.aClass14_Sub3_20.aClass14_Sub3_67;
		if (local8 == this.aClass73_9.aClass14_Sub3_20) {
			this.aClass14_Sub3_49 = null;
			return null;
		} else {
			this.aClass14_Sub3_49 = local8.aClass14_Sub3_67;
			return local8;
		}
	}
}
