import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lja")
public final class Class217 {

	@OriginalMember(owner = "client!lja", name = "e", descriptor = "Lclient!cp;")
	public final Class60 aClass60_7 = new Class60();

	@OriginalMember(owner = "client!lja", name = "i", descriptor = "Z")
	public boolean aBoolean504 = false;

	@OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(Z)V")
	public Class217(@OriginalArg(0) boolean arg0) {
		this.aBoolean504 = arg0;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(B)V")
	public void method5978() {
		while (true) {
			@Pc(19) Class15_Sub9 local19 = (Class15_Sub9) this.aClass60_7.method1552();
			if (local19 == null) {
				return;
			}
			local19.method9741();
			Static137.method2402(local19);
		}
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(Lclient!uh;B)V")
	public void method5980(@OriginalArg(0) Class15_Sub9 arg0) {
		@Pc(8) Class15_Sub3 local8 = arg0.aClass15_Sub3_22;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class15_Sub6[] local13 = arg0.aClass15_Sub6Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean200) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(52) Class15_Sub9 local52;
		if (this.aBoolean504) {
			for (local52 = (Class15_Sub9) this.aClass60_7.method1547(); local52 != null; local52 = (Class15_Sub9) this.aClass60_7.method1546()) {
				if (local52.aClass15_Sub3_22 == local8) {
					local52.method9741();
					Static137.method2402(local52);
				}
			}
		}
		for (local52 = (Class15_Sub9) this.aClass60_7.method1547(); local52 != null; local52 = (Class15_Sub9) this.aClass60_7.method1546()) {
			if (local8.anInt11023 >= local52.aClass15_Sub3_22.anInt11023) {
				Static541.method8308(arg0, local52);
				return;
			}
		}
		this.aClass60_7.method1551(arg0);
	}
}
