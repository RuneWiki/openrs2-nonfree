import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class224 {

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "Lclient!tda;")
	private Class1_Sub1 aClass1_Sub1_8;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "Lclient!tda;")
	public final Class1_Sub1 aClass1_Sub1_7 = new Class1_Sub1();

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V")
	public Class224() {
		this.aClass1_Sub1_7.aClass1_Sub1_9 = this.aClass1_Sub1_7;
		this.aClass1_Sub1_7.aClass1_Sub1_10 = this.aClass1_Sub1_7;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)Lclient!tda;")
	public Class1_Sub1 method5402() {
		@Pc(12) Class1_Sub1 local12 = this.aClass1_Sub1_7.aClass1_Sub1_10;
		if (local12 == this.aClass1_Sub1_7) {
			this.aClass1_Sub1_8 = null;
			return null;
		} else {
			this.aClass1_Sub1_8 = local12.aClass1_Sub1_10;
			return local12;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)Lclient!tda;")
	public Class1_Sub1 method5403() {
		@Pc(11) Class1_Sub1 local11 = this.aClass1_Sub1_8;
		if (this.aClass1_Sub1_7 == local11) {
			this.aClass1_Sub1_8 = null;
			return null;
		} else {
			this.aClass1_Sub1_8 = local11.aClass1_Sub1_10;
			return local11;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!tda;B)V")
	public void method5404(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_9 != null) {
			arg0.method5645();
		}
		arg0.aClass1_Sub1_9 = this.aClass1_Sub1_7.aClass1_Sub1_9;
		arg0.aClass1_Sub1_10 = this.aClass1_Sub1_7;
		arg0.aClass1_Sub1_9.aClass1_Sub1_10 = arg0;
		arg0.aClass1_Sub1_10.aClass1_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V")
	public void method5405() {
		while (true) {
			@Pc(9) Class1_Sub1 local9 = this.aClass1_Sub1_7.aClass1_Sub1_10;
			if (this.aClass1_Sub1_7 == local9) {
				this.aClass1_Sub1_8 = null;
				return;
			}
			local9.method5645();
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(Z)I")
	public int method5406() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class1_Sub1 local16 = this.aClass1_Sub1_7.aClass1_Sub1_10;
		while (local16 != this.aClass1_Sub1_7) {
			local16 = local16.aClass1_Sub1_10;
			local12++;
		}
		return local12;
	}
}
