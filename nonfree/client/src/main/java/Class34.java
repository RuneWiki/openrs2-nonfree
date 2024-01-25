import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bfa")
public final class Class34 {

	@OriginalMember(owner = "client!bfa", name = "j", descriptor = "Lclient!qc;")
	private Class11_Sub5 aClass11_Sub5_2;

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "Lclient!qc;")
	public final Class11_Sub5 aClass11_Sub5_1 = new Class11_Sub5();

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "()V")
	public Class34() {
		this.aClass11_Sub5_1.aClass11_Sub5_10 = this.aClass11_Sub5_1;
		this.aClass11_Sub5_1.aClass11_Sub5_9 = this.aClass11_Sub5_1;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)Lclient!qc;")
	public Class11_Sub5 method813() {
		@Pc(13) Class11_Sub5 local13 = this.aClass11_Sub5_1.aClass11_Sub5_10;
		if (this.aClass11_Sub5_1 == local13) {
			this.aClass11_Sub5_2 = null;
			return null;
		} else {
			this.aClass11_Sub5_2 = local13.aClass11_Sub5_10;
			return local13;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Z)V")
	public void method814() {
		while (true) {
			@Pc(7) Class11_Sub5 local7 = this.aClass11_Sub5_1.aClass11_Sub5_10;
			if (local7 == this.aClass11_Sub5_1) {
				this.aClass11_Sub5_2 = null;
				return;
			}
			local7.method4873();
		}
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)I")
	public int method817() {
		@Pc(7) int local7 = 0;
		@Pc(19) Class11_Sub5 local19 = this.aClass11_Sub5_1.aClass11_Sub5_10;
		while (this.aClass11_Sub5_1 != local19) {
			local19 = local19.aClass11_Sub5_10;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!qc;B)V")
	public void method818(@OriginalArg(0) Class11_Sub5 arg0) {
		if (arg0.aClass11_Sub5_9 != null) {
			arg0.method4873();
		}
		arg0.aClass11_Sub5_9 = this.aClass11_Sub5_1.aClass11_Sub5_9;
		arg0.aClass11_Sub5_10 = this.aClass11_Sub5_1;
		arg0.aClass11_Sub5_9.aClass11_Sub5_10 = arg0;
		arg0.aClass11_Sub5_10.aClass11_Sub5_9 = arg0;
	}

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "(I)Lclient!qc;")
	public Class11_Sub5 method819() {
		@Pc(6) Class11_Sub5 local6 = this.aClass11_Sub5_2;
		if (local6 == this.aClass11_Sub5_1) {
			this.aClass11_Sub5_2 = null;
			return null;
		} else {
			this.aClass11_Sub5_2 = local6.aClass11_Sub5_10;
			return local6;
		}
	}
}
