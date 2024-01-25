import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class185 {

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "Lclient!ef;")
	private Class46_Sub3 aClass46_Sub3_8;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "Lclient!ef;")
	public final Class46_Sub3 aClass46_Sub3_7 = new Class46_Sub3();

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class185() {
		this.aClass46_Sub3_7.aClass46_Sub3_10 = this.aClass46_Sub3_7;
		this.aClass46_Sub3_7.aClass46_Sub3_9 = this.aClass46_Sub3_7;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)I")
	public int method5306() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class46_Sub3 local16 = this.aClass46_Sub3_7.aClass46_Sub3_9;
		while (this.aClass46_Sub3_7 != local16) {
			local16 = local16.aClass46_Sub3_9;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
	public void method5308() {
		while (true) {
			@Pc(5) Class46_Sub3 local5 = this.aClass46_Sub3_7.aClass46_Sub3_9;
			if (local5 == this.aClass46_Sub3_7) {
				this.aClass46_Sub3_8 = null;
				return;
			}
			local5.method8232();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Lclient!ef;")
	public Class46_Sub3 method5309() {
		@Pc(15) Class46_Sub3 local15 = this.aClass46_Sub3_7.aClass46_Sub3_9;
		if (this.aClass46_Sub3_7 == local15) {
			this.aClass46_Sub3_8 = null;
			return null;
		} else {
			this.aClass46_Sub3_8 = local15.aClass46_Sub3_9;
			return local15;
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)Lclient!ef;")
	public Class46_Sub3 method5310() {
		@Pc(12) Class46_Sub3 local12 = this.aClass46_Sub3_8;
		if (this.aClass46_Sub3_7 == local12) {
			this.aClass46_Sub3_8 = null;
			return null;
		} else {
			this.aClass46_Sub3_8 = local12.aClass46_Sub3_9;
			return local12;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ef;Z)V")
	public void method5311(@OriginalArg(0) Class46_Sub3 arg0) {
		if (arg0.aClass46_Sub3_10 != null) {
			arg0.method8232();
		}
		arg0.aClass46_Sub3_10 = this.aClass46_Sub3_7.aClass46_Sub3_10;
		arg0.aClass46_Sub3_9 = this.aClass46_Sub3_7;
		arg0.aClass46_Sub3_10.aClass46_Sub3_9 = arg0;
		arg0.aClass46_Sub3_9.aClass46_Sub3_10 = arg0;
	}
}
