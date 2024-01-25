import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class223 {

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "Lclient!ml;")
	public final Class236 aClass236_5 = new Class236();

	@OriginalMember(owner = "client!maa", name = "j", descriptor = "Z")
	public boolean aBoolean411 = false;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Z)V")
	public Class223(@OriginalArg(0) boolean arg0) {
		this.aBoolean411 = arg0;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
	public void method4810() {
		while (true) {
			@Pc(16) Class3_Sub6 local16 = (Class3_Sub6) this.aClass236_5.method4951();
			if (local16 == null) {
				return;
			}
			local16.method8898();
			Static405.method5135(local16);
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lclient!rk;I)V")
	public void method4811(@OriginalArg(0) Class3_Sub6 arg0) {
		@Pc(12) Class3_Sub1 local12 = arg0.aClass3_Sub1_21;
		@Pc(14) boolean local14 = true;
		@Pc(17) Class3_Sub4[] local17 = arg0.aClass3_Sub4Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			if (local17[local19].aBoolean234) {
				local14 = false;
				break;
			}
		}
		if (local14) {
			return;
		}
		@Pc(47) Class3_Sub6 local47;
		if (this.aBoolean411) {
			for (local47 = (Class3_Sub6) this.aClass236_5.method4958(); local47 != null; local47 = (Class3_Sub6) this.aClass236_5.method4950()) {
				if (local47.aClass3_Sub1_21 == local12) {
					local47.method8898();
					Static405.method5135(local47);
				}
			}
		}
		for (local47 = (Class3_Sub6) this.aClass236_5.method4958(); local47 != null; local47 = (Class3_Sub6) this.aClass236_5.method4950()) {
			if (local47.aClass3_Sub1_21.anInt9920 <= local12.anInt9920) {
				Static593.method7795(arg0, local47);
				return;
			}
		}
		this.aClass236_5.method4955(arg0);
	}
}
