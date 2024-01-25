import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class33 {

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "Lclient!eb;")
	private Class77 aClass77_1;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "Lclient!ae;")
	private final Class8 aClass8_9;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Lclient!ae;")
	private final Class8 aClass8_10;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!ae;Lclient!ae;)V")
	public Class33(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1) {
		this.aClass8_9 = arg1;
		this.aClass8_10 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!is;I)Lclient!rd;")
	public Interface24 method854(@OriginalArg(0) Interface13 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class251 local11 = arg0.method8737();
		if (local11 == Static499.aClass251_5) {
			return new Class371((Class84) arg0);
		} else if (Static658.aClass251_9 == local11) {
			return new Class57(this.method858(), (Class259) arg0);
		} else if (local11 == Static202.aClass251_2) {
			return new Class108(this.aClass8_10, (Class47) arg0);
		} else if (Static395.aClass251_4 == local11) {
			return new Class108_Sub1(this.aClass8_10, (Class47_Sub1) arg0);
		} else if (Static568.aClass251_6 == local11) {
			return new Class27_Sub3(this.aClass8_10, this.aClass8_9, (Class63_Sub2) arg0);
		} else if (local11 == Static257.aClass251_3) {
			return new Class27_Sub2(this.aClass8_10, this.aClass8_9, (Class63_Sub3) arg0);
		} else if (local11 == Static200.aClass251_1) {
			return new Class27_Sub1(this.aClass8_10, this.aClass8_9, (Class63_Sub1) arg0);
		} else if (Static656.aClass251_8 == local11) {
			return new Class253(this.aClass8_10, this.aClass8_9, (Class205) arg0);
		} else if (local11 == Static662.aClass251_10) {
			return new Class138(this.aClass8_10, (Class149) arg0);
		} else if (Static610.aClass251_7 == local11) {
			return new Class27_Sub1_Sub1(this.aClass8_10, this.aClass8_9, (Class63_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)Lclient!eb;")
	private Class77 method858() {
		if (this.aClass77_1 == null) {
			this.aClass77_1 = new Class77();
		}
		return this.aClass77_1;
	}
}
