import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class185 {

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!ge;")
	private Class2_Sub13 aClass2_Sub13_41;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!ge;")
	private final Class2_Sub13 aClass2_Sub13_40 = new Class2_Sub13();

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	public Class185() {
		this.aClass2_Sub13_40.aClass2_Sub13_58 = this.aClass2_Sub13_40;
		this.aClass2_Sub13_40.aClass2_Sub13_59 = this.aClass2_Sub13_40;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Lclient!ge;")
	public Class2_Sub13 method4617() {
		@Pc(6) Class2_Sub13 local6 = this.aClass2_Sub13_41;
		if (this.aClass2_Sub13_40 == local6) {
			this.aClass2_Sub13_41 = null;
			return null;
		} else {
			this.aClass2_Sub13_41 = local6.aClass2_Sub13_59;
			return local6;
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)I")
	public int method4620() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class2_Sub13 local11 = this.aClass2_Sub13_40.aClass2_Sub13_59;
		while (this.aClass2_Sub13_40 != local11) {
			local11 = local11.aClass2_Sub13_59;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!ge;)V")
	public void method4621(@OriginalArg(1) Class2_Sub13 arg0) {
		if (arg0.aClass2_Sub13_58 != null) {
			arg0.method7527();
		}
		arg0.aClass2_Sub13_59 = this.aClass2_Sub13_40;
		arg0.aClass2_Sub13_58 = this.aClass2_Sub13_40.aClass2_Sub13_58;
		arg0.aClass2_Sub13_58.aClass2_Sub13_59 = arg0;
		arg0.aClass2_Sub13_59.aClass2_Sub13_58 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)Lclient!ge;")
	public Class2_Sub13 method4622() {
		@Pc(7) Class2_Sub13 local7 = this.aClass2_Sub13_40.aClass2_Sub13_59;
		if (local7 == this.aClass2_Sub13_40) {
			return null;
		} else {
			local7.method7527();
			return local7;
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)Lclient!ge;")
	public Class2_Sub13 method4623() {
		@Pc(7) Class2_Sub13 local7 = this.aClass2_Sub13_40.aClass2_Sub13_59;
		if (local7 == this.aClass2_Sub13_40) {
			this.aClass2_Sub13_41 = null;
			return null;
		} else {
			this.aClass2_Sub13_41 = local7.aClass2_Sub13_59;
			return local7;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public void method4624() {
		while (true) {
			@Pc(9) Class2_Sub13 local9 = this.aClass2_Sub13_40.aClass2_Sub13_59;
			if (local9 == this.aClass2_Sub13_40) {
				this.aClass2_Sub13_41 = null;
				return;
			}
			local9.method7527();
		}
	}
}
