import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class89 {

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Lclient!eo;")
	public final Class102 aClass102_1 = new Class102();

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "Z")
	public boolean aBoolean147 = false;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Z)V")
	public Class89(@OriginalArg(0) boolean arg0) {
		this.aBoolean147 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public void method1907() {
		while (true) {
			@Pc(5) Class41_Sub3 local5 = (Class41_Sub3) this.aClass102_1.method2058();
			if (local5 == null) {
				return;
			}
			local5.method8644();
			Static492.method5401(local5);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!hq;)V")
	public void method1909(@OriginalArg(1) Class41_Sub3 arg0) {
		@Pc(6) Class41_Sub1 local6 = arg0.aClass41_Sub1_10;
		@Pc(8) boolean local8 = true;
		@Pc(11) Class41_Sub9[] local11 = arg0.aClass41_Sub9Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			if (local11[local13].aBoolean648) {
				local8 = false;
				break;
			}
		}
		if (local8) {
			return;
		}
		@Pc(39) Class41_Sub3 local39;
		if (this.aBoolean147) {
			for (local39 = (Class41_Sub3) this.aClass102_1.method2062(); local39 != null; local39 = (Class41_Sub3) this.aClass102_1.method2054()) {
				if (local39.aClass41_Sub1_10 == local6) {
					local39.method8644();
					Static492.method5401(local39);
				}
			}
		}
		for (local39 = (Class41_Sub3) this.aClass102_1.method2062(); local39 != null; local39 = (Class41_Sub3) this.aClass102_1.method2054()) {
			if (local6.anInt10369 >= local39.aClass41_Sub1_10.anInt10369) {
				Static115.method1837(local39, arg0);
				return;
			}
		}
		this.aClass102_1.method2055(arg0);
	}
}
