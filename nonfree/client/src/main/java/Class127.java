import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class127 {

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "Lclient!vf;")
	private Class360 aClass360_1;

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "Lclient!wu;")
	private final Class380 aClass380_46;

	@OriginalMember(owner = "client!gm", name = "j", descriptor = "Lclient!wu;")
	private final Class380 aClass380_48;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;)V")
	public Class127(@OriginalArg(0) Class380 arg0, @OriginalArg(1) Class380 arg1) {
		this.aClass380_46 = arg0;
		this.aClass380_48 = arg1;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!vb;Z)Lclient!kd;")
	public Interface14 method2752(@OriginalArg(0) Interface24 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class8 local11 = arg0.method8040();
		if (local11 == Static498.aClass8_7) {
			return new Class366((Class221) arg0);
		} else if (Static132.aClass8_4 == local11) {
			return new Class353(this.method2753(), (Class148) arg0);
		} else if (local11 == Static559.aClass8_10) {
			return new Class294(this.aClass380_46, (Class102) arg0);
		} else if (local11 == Static67.aClass8_3) {
			return new Class294_Sub1(this.aClass380_46, (Class102_Sub1) arg0);
		} else if (Static512.aClass8_8 == local11) {
			return new Class137_Sub3(this.aClass380_46, this.aClass380_48, (Class69_Sub3) arg0);
		} else if (local11 == Static37.aClass8_2) {
			return new Class137_Sub2(this.aClass380_46, this.aClass380_48, (Class69_Sub2) arg0);
		} else if (local11 == Static31.aClass8_1) {
			return new Class137_Sub1(this.aClass380_46, this.aClass380_48, (Class69_Sub1) arg0);
		} else if (local11 == Static488.aClass8_6) {
			return new Class154(this.aClass380_46, this.aClass380_48, (Class247) arg0);
		} else if (local11 == Static515.aClass8_9) {
			return new Class29(this.aClass380_46, (Class318) arg0);
		} else if (Static139.aClass8_5 == local11) {
			return new Class137_Sub1_Sub1(this.aClass380_46, this.aClass380_48, (Class69_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)Lclient!vf;")
	private Class360 method2753() {
		if (this.aClass360_1 == null) {
			this.aClass360_1 = new Class360();
		}
		return this.aClass360_1;
	}
}
