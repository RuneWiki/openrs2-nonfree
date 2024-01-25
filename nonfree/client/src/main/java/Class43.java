import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class43 {

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "Lclient!vm;")
	public final Class363 aClass363_2 = new Class363();

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "Z")
	public boolean aBoolean66 = false;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Z)V")
	public Class43(@OriginalArg(0) boolean arg0) {
		this.aBoolean66 = arg0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILclient!ww;)V")
	public void method868(@OriginalArg(1) Class14_Sub10 arg0) {
		@Pc(8) Class14_Sub1 local8 = arg0.aClass14_Sub1_23;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class14_Sub9[] local13 = arg0.aClass14_Sub9Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean809) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(43) Class14_Sub10 local43;
		if (this.aBoolean66) {
			for (local43 = (Class14_Sub10) this.aClass363_2.method8484(); local43 != null; local43 = (Class14_Sub10) this.aClass363_2.method8478()) {
				if (local43.aClass14_Sub1_23 == local8) {
					local43.method8904();
					Static435.method6488(local43);
				}
			}
		}
		for (local43 = (Class14_Sub10) this.aClass363_2.method8484(); local43 != null; local43 = (Class14_Sub10) this.aClass363_2.method8478()) {
			if (local8.anInt9320 >= local43.aClass14_Sub1_23.anInt9320) {
				Static130.method1930(local43, arg0);
				return;
			}
		}
		this.aClass363_2.method8480(arg0);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
	public void method869() {
		while (true) {
			@Pc(7) Class14_Sub10 local7 = (Class14_Sub10) this.aClass363_2.method8483();
			if (local7 == null) {
				return;
			}
			local7.method8904();
			Static435.method6488(local7);
		}
	}
}
