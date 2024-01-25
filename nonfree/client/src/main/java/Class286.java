import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class286 {

	@OriginalMember(owner = "client!rda", name = "o", descriptor = "Lclient!daa;")
	private Class4_Sub7 aClass4_Sub7_46;

	@OriginalMember(owner = "client!rda", name = "n", descriptor = "Lclient!daa;")
	private final Class4_Sub7 aClass4_Sub7_45 = new Class4_Sub7();

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V")
	public Class286() {
		this.aClass4_Sub7_45.aClass4_Sub7_61 = this.aClass4_Sub7_45;
		this.aClass4_Sub7_45.aClass4_Sub7_62 = this.aClass4_Sub7_45;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)Lclient!daa;")
	public Class4_Sub7 method6403() {
		@Pc(12) Class4_Sub7 local12 = this.aClass4_Sub7_45.aClass4_Sub7_62;
		if (this.aClass4_Sub7_45 == local12) {
			this.aClass4_Sub7_46 = null;
			return null;
		} else {
			this.aClass4_Sub7_46 = local12.aClass4_Sub7_62;
			return local12;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!daa;Z)V")
	public void method6404(@OriginalArg(0) Class4_Sub7 arg0) {
		if (arg0.aClass4_Sub7_61 != null) {
			arg0.method7963();
		}
		arg0.aClass4_Sub7_62 = this.aClass4_Sub7_45.aClass4_Sub7_62;
		arg0.aClass4_Sub7_61 = this.aClass4_Sub7_45;
		arg0.aClass4_Sub7_61.aClass4_Sub7_62 = arg0;
		arg0.aClass4_Sub7_62.aClass4_Sub7_61 = arg0;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(B)Lclient!daa;")
	public Class4_Sub7 method6405() {
		@Pc(7) Class4_Sub7 local7 = this.aClass4_Sub7_45.aClass4_Sub7_62;
		if (local7 == this.aClass4_Sub7_45) {
			return null;
		} else {
			local7.method7963();
			return local7;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)I")
	public int method6406() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class4_Sub7 local18 = this.aClass4_Sub7_45.aClass4_Sub7_62; local18 != this.aClass4_Sub7_45; local18 = local18.aClass4_Sub7_62) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!daa;I)V")
	public void method6409(@OriginalArg(0) Class4_Sub7 arg0) {
		if (arg0.aClass4_Sub7_61 != null) {
			arg0.method7963();
		}
		arg0.aClass4_Sub7_62 = this.aClass4_Sub7_45;
		arg0.aClass4_Sub7_61 = this.aClass4_Sub7_45.aClass4_Sub7_61;
		arg0.aClass4_Sub7_61.aClass4_Sub7_62 = arg0;
		arg0.aClass4_Sub7_62.aClass4_Sub7_61 = arg0;
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(Z)V")
	public void method6411() {
		while (true) {
			@Pc(15) Class4_Sub7 local15 = this.aClass4_Sub7_45.aClass4_Sub7_62;
			if (this.aClass4_Sub7_45 == local15) {
				this.aClass4_Sub7_46 = null;
				return;
			}
			local15.method7963();
		}
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(B)Lclient!daa;")
	public Class4_Sub7 method6413() {
		@Pc(15) Class4_Sub7 local15 = this.aClass4_Sub7_45.aClass4_Sub7_61;
		if (local15 == this.aClass4_Sub7_45) {
			return null;
		} else {
			local15.method7963();
			return local15;
		}
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)Lclient!daa;")
	public Class4_Sub7 method6414() {
		@Pc(6) Class4_Sub7 local6 = this.aClass4_Sub7_46;
		if (this.aClass4_Sub7_45 == local6) {
			this.aClass4_Sub7_46 = null;
			return null;
		} else {
			this.aClass4_Sub7_46 = local6.aClass4_Sub7_62;
			return local6;
		}
	}
}
