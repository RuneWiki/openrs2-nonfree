import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class236 {

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "Lclient!fi;")
	private Class13_Sub3 aClass13_Sub3_8;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "Lclient!fi;")
	public final Class13_Sub3 aClass13_Sub3_7 = new Class13_Sub3();

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class236() {
		this.aClass13_Sub3_7.aClass13_Sub3_6 = this.aClass13_Sub3_7;
		this.aClass13_Sub3_7.aClass13_Sub3_5 = this.aClass13_Sub3_7;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!fi;I)V")
	public void method5460(@OriginalArg(0) Class13_Sub3 arg0) {
		if (arg0.aClass13_Sub3_6 != null) {
			arg0.method5342();
		}
		arg0.aClass13_Sub3_5 = this.aClass13_Sub3_7;
		arg0.aClass13_Sub3_6 = this.aClass13_Sub3_7.aClass13_Sub3_6;
		arg0.aClass13_Sub3_6.aClass13_Sub3_5 = arg0;
		arg0.aClass13_Sub3_5.aClass13_Sub3_6 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)I")
	public int method5461() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class13_Sub3 local11 = this.aClass13_Sub3_7.aClass13_Sub3_5; local11 != this.aClass13_Sub3_7; local11 = local11.aClass13_Sub3_5) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Lclient!fi;")
	public Class13_Sub3 method5462() {
		@Pc(12) Class13_Sub3 local12 = this.aClass13_Sub3_7.aClass13_Sub3_5;
		if (local12 == this.aClass13_Sub3_7) {
			this.aClass13_Sub3_8 = null;
			return null;
		} else {
			this.aClass13_Sub3_8 = local12.aClass13_Sub3_5;
			return local12;
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V")
	public void method5463() {
		while (true) {
			@Pc(9) Class13_Sub3 local9 = this.aClass13_Sub3_7.aClass13_Sub3_5;
			if (local9 == this.aClass13_Sub3_7) {
				this.aClass13_Sub3_8 = null;
				return;
			}
			local9.method5342();
		}
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)Lclient!fi;")
	public Class13_Sub3 method5465() {
		@Pc(6) Class13_Sub3 local6 = this.aClass13_Sub3_8;
		if (this.aClass13_Sub3_7 == local6) {
			this.aClass13_Sub3_8 = null;
			return null;
		} else {
			this.aClass13_Sub3_8 = local6.aClass13_Sub3_5;
			return local6;
		}
	}
}
