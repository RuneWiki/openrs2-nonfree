import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class25 {

	@OriginalMember(owner = "client!av", name = "f", descriptor = "Lclient!an;")
	public final Class19 aClass19_1 = new Class19();

	@OriginalMember(owner = "client!av", name = "g", descriptor = "Z")
	public boolean aBoolean57 = false;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Z)V")
	public Class25(@OriginalArg(0) boolean arg0) {
		this.aBoolean57 = arg0;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
	public void method632() {
		while (true) {
			@Pc(5) Class16_Sub5 local5 = (Class16_Sub5) this.aClass19_1.method557();
			if (local5 == null) {
				return;
			}
			local5.method8874();
			Static274.method4473(local5);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ILclient!jk;)V")
	public void method634(@OriginalArg(1) Class16_Sub5 arg0) {
		@Pc(8) Class16_Sub1 local8 = arg0.aClass16_Sub1_16;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class16_Sub10[] local13 = arg0.aClass16_Sub10Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean758) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(43) Class16_Sub5 local43;
		if (this.aBoolean57) {
			for (local43 = (Class16_Sub5) this.aClass19_1.method562(); local43 != null; local43 = (Class16_Sub5) this.aClass19_1.method558()) {
				if (local8 == local43.aClass16_Sub1_16) {
					local43.method8874();
					Static274.method4473(local43);
				}
			}
		}
		for (local43 = (Class16_Sub5) this.aClass19_1.method562(); local43 != null; local43 = (Class16_Sub5) this.aClass19_1.method558()) {
			if (local8.anInt8035 >= local43.aClass16_Sub1_16.anInt8035) {
				Static494.method6914(local43, arg0);
				return;
			}
		}
		this.aClass19_1.method566(arg0);
	}
}
