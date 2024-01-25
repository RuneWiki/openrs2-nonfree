import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class65 {

	@OriginalMember(owner = "client!di", name = "c", descriptor = "Lclient!eia;")
	public final Class81 aClass81_2 = new Class81();

	@OriginalMember(owner = "client!di", name = "g", descriptor = "Z")
	public boolean aBoolean156 = false;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Z)V")
	public Class65(@OriginalArg(0) boolean arg0) {
		this.aBoolean156 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BLclient!c;)V")
	public void method1715(@OriginalArg(1) Class20_Sub3 arg0) {
		@Pc(8) Class20_Sub2 local8 = arg0.aClass20_Sub2_7;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class20_Sub4[] local13 = arg0.aClass20_Sub4Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean175) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(48) Class20_Sub3 local48;
		if (this.aBoolean156) {
			for (local48 = (Class20_Sub3) this.aClass81_2.method2118(); local48 != null; local48 = (Class20_Sub3) this.aClass81_2.method2128()) {
				if (local48.aClass20_Sub2_7 == local8) {
					local48.method9004();
					Static53.method902(local48);
				}
			}
		}
		for (local48 = (Class20_Sub3) this.aClass81_2.method2118(); local48 != null; local48 = (Class20_Sub3) this.aClass81_2.method2128()) {
			if (local48.aClass20_Sub2_7.anInt10727 <= local8.anInt10727) {
				Static539.method7922(local48, arg0);
				return;
			}
		}
		this.aClass81_2.method2119(arg0);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
	public void method1719() {
		while (true) {
			@Pc(11) Class20_Sub3 local11 = (Class20_Sub3) this.aClass81_2.method2127();
			if (local11 == null) {
				return;
			}
			local11.method9004();
			Static53.method902(local11);
		}
	}
}
