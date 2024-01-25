import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class220 {

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Lclient!fp;")
	private Class13_Sub3 aClass13_Sub3_6;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!fp;")
	public final Class13_Sub3 aClass13_Sub3_5 = new Class13_Sub3();

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	public Class220() {
		this.aClass13_Sub3_5.aClass13_Sub3_9 = this.aClass13_Sub3_5;
		this.aClass13_Sub3_5.aClass13_Sub3_10 = this.aClass13_Sub3_5;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Lclient!fp;")
	public Class13_Sub3 method4635() {
		@Pc(14) Class13_Sub3 local14 = this.aClass13_Sub3_6;
		if (local14 == this.aClass13_Sub3_5) {
			this.aClass13_Sub3_6 = null;
			return null;
		} else {
			this.aClass13_Sub3_6 = local14.aClass13_Sub3_9;
			return local14;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!fp;)V")
	public void method4636(@OriginalArg(1) Class13_Sub3 arg0) {
		if (arg0.aClass13_Sub3_10 != null) {
			arg0.method5088();
		}
		arg0.aClass13_Sub3_10 = this.aClass13_Sub3_5.aClass13_Sub3_10;
		arg0.aClass13_Sub3_9 = this.aClass13_Sub3_5;
		arg0.aClass13_Sub3_10.aClass13_Sub3_9 = arg0;
		arg0.aClass13_Sub3_9.aClass13_Sub3_10 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)I")
	public int method4637() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class13_Sub3 local11 = this.aClass13_Sub3_5.aClass13_Sub3_9;
		while (this.aClass13_Sub3_5 != local11) {
			local11 = local11.aClass13_Sub3_9;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
	public void method4639() {
		while (true) {
			@Pc(9) Class13_Sub3 local9 = this.aClass13_Sub3_5.aClass13_Sub3_9;
			if (this.aClass13_Sub3_5 == local9) {
				this.aClass13_Sub3_6 = null;
				return;
			}
			local9.method5088();
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)Lclient!fp;")
	public Class13_Sub3 method4640() {
		@Pc(7) Class13_Sub3 local7 = this.aClass13_Sub3_5.aClass13_Sub3_9;
		if (this.aClass13_Sub3_5 == local7) {
			this.aClass13_Sub3_6 = null;
			return null;
		} else {
			this.aClass13_Sub3_6 = local7.aClass13_Sub3_9;
			return local7;
		}
	}
}
