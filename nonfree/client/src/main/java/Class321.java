import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class321 {

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!wc;")
	public final Class387 aClass387_5 = new Class387();

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Z")
	public boolean aBoolean561 = false;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Z)V")
	public Class321(@OriginalArg(0) boolean arg0) {
		this.aBoolean561 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public void method7352() {
		while (true) {
			@Pc(17) Class4_Sub6 local17 = (Class4_Sub6) this.aClass387_5.method9013();
			if (local17 == null) {
				return;
			}
			local17.method8570();
			Static474.method6691(local17);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!kv;)V")
	public void method7355(@OriginalArg(0) byte arg0, @OriginalArg(1) Class4_Sub6 arg1) {
		@Pc(8) Class4_Sub1 local8 = arg1.aClass4_Sub1_13;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class4_Sub8[] local13 = arg1.aClass4_Sub8Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean558) {
				local10 = false;
				break;
			}
		}
		if (arg0 > -46) {
			Static534.anInt8529 = -127;
		}
		if (local10) {
			return;
		}
		@Pc(63) Class4_Sub6 local63;
		if (this.aBoolean561) {
			for (local63 = (Class4_Sub6) this.aClass387_5.method9018(); local63 != null; local63 = (Class4_Sub6) this.aClass387_5.method9016()) {
				if (local8 == local63.aClass4_Sub1_13) {
					local63.method8570();
					Static474.method6691(local63);
				}
			}
		}
		for (local63 = (Class4_Sub6) this.aClass387_5.method9018(); local63 != null; local63 = (Class4_Sub6) this.aClass387_5.method9016()) {
			if (local8.anInt9798 >= local63.aClass4_Sub1_13.anInt9798) {
				Static468.method6605(local63, arg1);
				return;
			}
		}
		this.aClass387_5.method9017(arg1);
	}
}
