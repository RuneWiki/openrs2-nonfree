import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class194 {

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "Lclient!taa;")
	private Class3_Sub2 aClass3_Sub2_8;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "Lclient!taa;")
	public final Class3_Sub2 aClass3_Sub2_7 = new Class3_Sub2();

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	public Class194() {
		this.aClass3_Sub2_7.aClass3_Sub2_9 = this.aClass3_Sub2_7;
		this.aClass3_Sub2_7.aClass3_Sub2_10 = this.aClass3_Sub2_7;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)I")
	public int method5592() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class3_Sub2 local11 = this.aClass3_Sub2_7.aClass3_Sub2_10;
		while (this.aClass3_Sub2_7 != local11) {
			local11 = local11.aClass3_Sub2_10;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!taa;Z)V")
	public void method5596(@OriginalArg(0) Class3_Sub2 arg0) {
		if (arg0.aClass3_Sub2_9 != null) {
			arg0.method6948();
		}
		arg0.aClass3_Sub2_10 = this.aClass3_Sub2_7;
		arg0.aClass3_Sub2_9 = this.aClass3_Sub2_7.aClass3_Sub2_9;
		arg0.aClass3_Sub2_9.aClass3_Sub2_10 = arg0;
		arg0.aClass3_Sub2_10.aClass3_Sub2_9 = arg0;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
	public void method5597() {
		while (true) {
			@Pc(5) Class3_Sub2 local5 = this.aClass3_Sub2_7.aClass3_Sub2_10;
			if (local5 == this.aClass3_Sub2_7) {
				this.aClass3_Sub2_8 = null;
				return;
			}
			local5.method6948();
		}
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)Lclient!taa;")
	public Class3_Sub2 method5598() {
		@Pc(6) Class3_Sub2 local6 = this.aClass3_Sub2_8;
		if (local6 == this.aClass3_Sub2_7) {
			this.aClass3_Sub2_8 = null;
			return null;
		} else {
			this.aClass3_Sub2_8 = local6.aClass3_Sub2_10;
			return local6;
		}
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)Lclient!taa;")
	public Class3_Sub2 method5600() {
		@Pc(12) Class3_Sub2 local12 = this.aClass3_Sub2_7.aClass3_Sub2_10;
		if (local12 == this.aClass3_Sub2_7) {
			this.aClass3_Sub2_8 = null;
			return null;
		} else {
			this.aClass3_Sub2_8 = local12.aClass3_Sub2_10;
			return local12;
		}
	}
}
