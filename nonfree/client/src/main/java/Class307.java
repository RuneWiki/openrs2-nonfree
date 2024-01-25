import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class307 {

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "Lclient!pda;")
	public final Class283 aClass283_13 = new Class283();

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "Z")
	public boolean aBoolean626 = false;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Z)V")
	public Class307(@OriginalArg(0) boolean arg0) {
		this.aBoolean626 = arg0;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!w;I)V")
	public void method7675(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(8) Class4_Sub3 local8 = arg0.aClass4_Sub3_24;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class4_Sub1[] local13 = arg0.aClass4_Sub1Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean3) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(55) Class4_Sub9 local55;
		if (this.aBoolean626) {
			for (local55 = (Class4_Sub9) this.aClass283_13.method6791(); local55 != null; local55 = (Class4_Sub9) this.aClass283_13.method6792()) {
				if (local55.aClass4_Sub3_24 == local8) {
					local55.method9473();
					Static51.method942(local55);
				}
			}
		}
		for (local55 = (Class4_Sub9) this.aClass283_13.method6791(); local55 != null; local55 = (Class4_Sub9) this.aClass283_13.method6792()) {
			if (local8.anInt11177 >= local55.aClass4_Sub3_24.anInt11177) {
				Static687.method9467(arg0, local55);
				return;
			}
		}
		if (28249 != 28249) {
			this.aBoolean626 = true;
		}
		this.aClass283_13.method6802(arg0);
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)V")
	public void method7676() {
		while (true) {
			@Pc(17) Class4_Sub9 local17 = (Class4_Sub9) this.aClass283_13.method6798();
			if (local17 == null) {
				return;
			}
			local17.method9473();
			Static51.method942(local17);
		}
	}
}
