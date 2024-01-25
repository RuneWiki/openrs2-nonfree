import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class100 {

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "Lclient!o;")
	public final Class234 aClass234_4 = new Class234();

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Z")
	public boolean aBoolean282 = false;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Z)V")
	public Class100(@OriginalArg(0) boolean arg0) {
		this.aBoolean282 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	public void method3066() {
		while (true) {
			@Pc(7) Class9_Sub2 local7 = (Class9_Sub2) this.aClass234_4.method6094();
			if (local7 == null) {
				return;
			}
			local7.method8408();
			Static72.method2064(local7);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!bd;)V")
	public void method3069(@OriginalArg(1) Class9_Sub2 arg0) {
		@Pc(8) Class9_Sub4 local8 = arg0.aClass9_Sub4_1;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class9_Sub6[] local13 = arg0.aClass9_Sub6Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean490) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(43) Class9_Sub2 local43;
		if (this.aBoolean282) {
			for (local43 = (Class9_Sub2) this.aClass234_4.method6092(); local43 != null; local43 = (Class9_Sub2) this.aClass234_4.method6098()) {
				if (local8 == local43.aClass9_Sub4_1) {
					local43.method8408();
					Static72.method2064(local43);
				}
			}
		}
		for (local43 = (Class9_Sub2) this.aClass234_4.method6092(); local43 != null; local43 = (Class9_Sub2) this.aClass234_4.method6098()) {
			if (local43.aClass9_Sub4_1.anInt10359 <= local8.anInt10359) {
				Static138.method2760(arg0, local43);
				return;
			}
		}
		this.aClass234_4.method6097(arg0);
	}
}
