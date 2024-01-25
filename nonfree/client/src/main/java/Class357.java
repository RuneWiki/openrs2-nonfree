import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class357 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "Lclient!uha;")
	private Class9_Sub2 aClass9_Sub2_10;

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "Lclient!uha;")
	public final Class9_Sub2 aClass9_Sub2_9 = new Class9_Sub2();

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public Class357() {
		this.aClass9_Sub2_9.aClass9_Sub2_8 = this.aClass9_Sub2_9;
		this.aClass9_Sub2_9.aClass9_Sub2_7 = this.aClass9_Sub2_9;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!uha;)V")
	public void method8203(@OriginalArg(1) Class9_Sub2 arg0) {
		if (arg0.aClass9_Sub2_7 != null) {
			arg0.method2168();
		}
		arg0.aClass9_Sub2_8 = this.aClass9_Sub2_9;
		arg0.aClass9_Sub2_7 = this.aClass9_Sub2_9.aClass9_Sub2_7;
		arg0.aClass9_Sub2_7.aClass9_Sub2_8 = arg0;
		arg0.aClass9_Sub2_8.aClass9_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)I")
	public int method8206() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class9_Sub2 local11 = this.aClass9_Sub2_9.aClass9_Sub2_8; local11 != this.aClass9_Sub2_9; local11 = local11.aClass9_Sub2_8) {
			local7++;
		}
		if (false) {
			Static623.anIntArray696 = null;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
	public void method8207() {
		while (true) {
			@Pc(5) Class9_Sub2 local5 = this.aClass9_Sub2_9.aClass9_Sub2_8;
			if (this.aClass9_Sub2_9 == local5) {
				this.aClass9_Sub2_10 = null;
				return;
			}
			local5.method2168();
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)Lclient!uha;")
	public Class9_Sub2 method8208() {
		@Pc(6) Class9_Sub2 local6 = this.aClass9_Sub2_10;
		if (this.aClass9_Sub2_9 == local6) {
			this.aClass9_Sub2_10 = null;
			return null;
		} else {
			this.aClass9_Sub2_10 = local6.aClass9_Sub2_8;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)Lclient!uha;")
	public Class9_Sub2 method8210() {
		@Pc(7) Class9_Sub2 local7 = this.aClass9_Sub2_9.aClass9_Sub2_8;
		if (this.aClass9_Sub2_9 == local7) {
			this.aClass9_Sub2_10 = null;
			return null;
		} else {
			this.aClass9_Sub2_10 = local7.aClass9_Sub2_8;
			return local7;
		}
	}
}
