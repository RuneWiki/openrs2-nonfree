import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class182 {

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "Lclient!tca;")
	public final Class325 aClass325_4 = new Class325();

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "Z")
	public boolean aBoolean475 = false;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Z)V")
	public Class182(@OriginalArg(0) boolean arg0) {
		this.aBoolean475 = arg0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!jda;I)V")
	public void method5401(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(8) Class3_Sub1 local8 = arg0.aClass3_Sub1_15;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class3_Sub3[] local13 = arg0.aClass3_Sub3Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean411) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(43) Class3_Sub4 local43;
		if (this.aBoolean475) {
			for (local43 = (Class3_Sub4) this.aClass325_4.method8016(); local43 != null; local43 = (Class3_Sub4) this.aClass325_4.method8022()) {
				if (local8 == local43.aClass3_Sub1_15) {
					local43.method8909();
					Static211.method4175(local43);
				}
			}
		}
		for (local43 = (Class3_Sub4) this.aClass325_4.method8016(); local43 != null; local43 = (Class3_Sub4) this.aClass325_4.method8022()) {
			if (local8.anInt10311 >= local43.aClass3_Sub1_15.anInt10311) {
				Static536.method8055(local43, arg0);
				return;
			}
		}
		this.aClass325_4.method8013(arg0);
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)V")
	public void method5402() {
		while (true) {
			@Pc(7) Class3_Sub4 local7 = (Class3_Sub4) this.aClass325_4.method8019();
			if (local7 == null) {
				return;
			}
			local7.method8909();
			Static211.method4175(local7);
		}
	}
}
