import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class155 {

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!fa;")
	public final Class99 aClass99_4 = new Class99();

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Z")
	public boolean aBoolean308 = false;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Z)V")
	public Class155(@OriginalArg(0) boolean arg0) {
		this.aBoolean308 = arg0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLclient!gh;)V")
	public void method3771(@OriginalArg(1) Class4_Sub6 arg0) {
		@Pc(14) Class4_Sub2 local14 = arg0.aClass4_Sub2_9;
		@Pc(16) boolean local16 = true;
		@Pc(19) Class4_Sub9[] local19 = arg0.aClass4_Sub9Array1;
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			if (local19[local21].aBoolean558) {
				local16 = false;
				break;
			}
		}
		if (local16) {
			return;
		}
		@Pc(49) Class4_Sub6 local49;
		if (this.aBoolean308) {
			for (local49 = (Class4_Sub6) this.aClass99_4.method2045(); local49 != null; local49 = (Class4_Sub6) this.aClass99_4.method2047()) {
				if (local14 == local49.aClass4_Sub2_9) {
					local49.method8713();
					Static87.method1410(local49);
				}
			}
		}
		for (local49 = (Class4_Sub6) this.aClass99_4.method2045(); local49 != null; local49 = (Class4_Sub6) this.aClass99_4.method2047()) {
			if (local49.aClass4_Sub2_9.anInt10234 <= local14.anInt10234) {
				Static296.method4647(arg0, local49);
				return;
			}
		}
		this.aClass99_4.method2039(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method3773() {
		while (true) {
			@Pc(7) Class4_Sub6 local7 = (Class4_Sub6) this.aClass99_4.method2044();
			if (local7 == null) {
				return;
			}
			local7.method8713();
			Static87.method1410(local7);
		}
	}
}
