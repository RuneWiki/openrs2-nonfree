import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class94 {

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "Lclient!jia;")
	public final Class171 aClass171_3 = new Class171();

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "Z")
	public boolean aBoolean167 = false;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Z)V")
	public Class94(@OriginalArg(0) boolean arg0) {
		this.aBoolean167 = arg0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
	public void method1859() {
		while (true) {
			@Pc(19) Class13_Sub6 local19 = (Class13_Sub6) this.aClass171_3.method3752();
			if (local19 == null) {
				return;
			}
			local19.method8394();
			Static448.method6100(local19);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!jl;)V")
	public void method1861(@OriginalArg(1) Class13_Sub6 arg0) {
		@Pc(8) Class13_Sub1 local8 = arg0.aClass13_Sub1_2;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class13_Sub2[] local13 = arg0.aClass13_Sub2Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean48) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(47) Class13_Sub6 local47;
		if (this.aBoolean167) {
			for (local47 = (Class13_Sub6) this.aClass171_3.method3745(); local47 != null; local47 = (Class13_Sub6) this.aClass171_3.method3744()) {
				if (local8 == local47.aClass13_Sub1_2) {
					local47.method8394();
					Static448.method6100(local47);
				}
			}
		}
		for (local47 = (Class13_Sub6) this.aClass171_3.method3745(); local47 != null; local47 = (Class13_Sub6) this.aClass171_3.method3744()) {
			if (local8.anInt10091 >= local47.aClass13_Sub1_2.anInt10091) {
				Static323.method4323(local47, arg0);
				return;
			}
		}
		this.aClass171_3.method3746(arg0);
	}
}
