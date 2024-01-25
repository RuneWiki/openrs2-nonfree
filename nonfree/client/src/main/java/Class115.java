import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class115 {

	@OriginalMember(owner = "client!gca", name = "g", descriptor = "Lclient!bt;")
	public final Class43 aClass43_5 = new Class43();

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "Z")
	public boolean aBoolean175 = false;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Z)V")
	public Class115(@OriginalArg(0) boolean arg0) {
		this.aBoolean175 = arg0;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!rk;B)V")
	public void method2464(@OriginalArg(0) Class2_Sub9 arg0) {
		@Pc(8) Class2_Sub1 local8 = arg0.aClass2_Sub1_20;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class2_Sub5[] local13 = arg0.aClass2_Sub5Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean124) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(51) Class2_Sub9 local51;
		if (this.aBoolean175) {
			for (local51 = (Class2_Sub9) this.aClass43_5.method1087(); local51 != null; local51 = (Class2_Sub9) this.aClass43_5.method1088()) {
				if (local51.aClass2_Sub1_20 == local8) {
					local51.method8436();
					Static379.method5357(local51);
				}
			}
		}
		for (local51 = (Class2_Sub9) this.aClass43_5.method1087(); local51 != null; local51 = (Class2_Sub9) this.aClass43_5.method1088()) {
			if (local8.anInt10007 >= local51.aClass2_Sub1_20.anInt10007) {
				Static672.method8758(arg0, local51);
				return;
			}
		}
		this.aClass43_5.method1084(arg0);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
	public void method2465() {
		while (true) {
			@Pc(9) Class2_Sub9 local9 = (Class2_Sub9) this.aClass43_5.method1082();
			if (local9 == null) {
				return;
			}
			local9.method8436();
			Static379.method5357(local9);
		}
	}
}
