import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class211 {

	@OriginalMember(owner = "client!km", name = "c", descriptor = "Lclient!em;")
	public final Class105 aClass105_7 = new Class105();

	@OriginalMember(owner = "client!km", name = "k", descriptor = "Z")
	public boolean aBoolean459 = false;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Z)V")
	public Class211(@OriginalArg(0) boolean arg0) {
		this.aBoolean459 = arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public void method4939() {
		while (true) {
			@Pc(7) Class23_Sub6 local7 = (Class23_Sub6) this.aClass105_7.method2438();
			if (local7 == null) {
				return;
			}
			local7.method8588();
			Static305.method4702(local7);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!hga;)V")
	public void method4941(@OriginalArg(1) Class23_Sub6 arg0) {
		@Pc(8) Class23_Sub2 local8 = arg0.aClass23_Sub2_10;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class23_Sub4[] local13 = arg0.aClass23_Sub4Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean206) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(47) Class23_Sub6 local47;
		if (this.aBoolean459) {
			for (local47 = (Class23_Sub6) this.aClass105_7.method2444(); local47 != null; local47 = (Class23_Sub6) this.aClass105_7.method2448()) {
				if (local47.aClass23_Sub2_10 == local8) {
					local47.method8588();
					Static305.method4702(local47);
				}
			}
		}
		for (local47 = (Class23_Sub6) this.aClass105_7.method2444(); local47 != null; local47 = (Class23_Sub6) this.aClass105_7.method2448()) {
			if (local8.anInt10106 >= local47.aClass23_Sub2_10.anInt10106) {
				Static588.method7903(local47, arg0);
				return;
			}
		}
		this.aClass105_7.method2447(arg0);
	}
}
