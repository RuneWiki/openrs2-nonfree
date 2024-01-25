import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class47 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!hca;")
	public final Class139 aClass139_1 = new Class139();

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Z")
	public boolean aBoolean83 = false;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Z)V")
	public Class47(@OriginalArg(0) boolean arg0) {
		this.aBoolean83 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
	public void method1162() {
		while (true) {
			@Pc(15) Class9_Sub10 local15 = (Class9_Sub10) this.aClass139_1.method3204();
			if (local15 == null) {
				return;
			}
			local15.method8593();
			Static139.method2379(local15);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLclient!ua;)V")
	public void method1163(@OriginalArg(1) Class9_Sub10 arg0) {
		@Pc(8) Class9_Sub2 local8 = arg0.aClass9_Sub2_22;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class9_Sub5[] local13 = arg0.aClass9_Sub5Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean433) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(43) Class9_Sub10 local43;
		if (this.aBoolean83) {
			for (local43 = (Class9_Sub10) this.aClass139_1.method3198(); local43 != null; local43 = (Class9_Sub10) this.aClass139_1.method3205()) {
				if (local43.aClass9_Sub2_22 == local8) {
					local43.method8593();
					Static139.method2379(local43);
				}
			}
		}
		for (local43 = (Class9_Sub10) this.aClass139_1.method3198(); local43 != null; local43 = (Class9_Sub10) this.aClass139_1.method3205()) {
			if (local43.aClass9_Sub2_22.anInt10151 <= local8.anInt10151) {
				Static145.method3124(local43, arg0);
				return;
			}
		}
		this.aClass139_1.method3203(arg0);
	}
}
