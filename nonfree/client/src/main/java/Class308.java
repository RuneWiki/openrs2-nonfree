import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class308 {

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "Lclient!bo;")
	private Class3_Sub4 aClass3_Sub4_54 = new Class3_Sub4();

	@OriginalMember(owner = "client!tea", name = "m", descriptor = "Lclient!ca;")
	private final Class39 aClass39_9 = new Class39();

	@OriginalMember(owner = "client!tea", name = "l", descriptor = "I")
	private int anInt9283;

	@OriginalMember(owner = "client!tea", name = "k", descriptor = "I")
	private final int anInt9282;

	@OriginalMember(owner = "client!tea", name = "j", descriptor = "Lclient!bc;")
	private final Class25 aClass25_38;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(I)V")
	public Class308(@OriginalArg(0) int arg0) {
		this.anInt9283 = arg0;
		this.anInt9282 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass25_38 = new Class25(local19);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
	public void method7534() {
		this.aClass39_9.method1279();
		this.aClass25_38.method948();
		this.aClass3_Sub4_54 = new Class3_Sub4();
		this.anInt9283 = this.anInt9282;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(JI)Lclient!bo;")
	public Class3_Sub4 method7537(@OriginalArg(0) long arg0) {
		@Pc(15) Class3_Sub4 local15 = (Class3_Sub4) this.aClass25_38.method946(arg0);
		if (local15 != null) {
			this.aClass39_9.method1273(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(JBLclient!bo;)V")
	public void method7538(@OriginalArg(0) long arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (this.anInt9283 == 0) {
			@Pc(11) Class3_Sub4 local11 = this.aClass39_9.method1276();
			local11.method8412();
			local11.method8309();
			if (local11 == this.aClass3_Sub4_54) {
				local11 = this.aClass39_9.method1276();
				local11.method8412();
				local11.method8309();
			}
		} else {
			this.anInt9283--;
		}
		this.aClass25_38.method945(arg1, arg0);
		this.aClass39_9.method1273(arg1);
	}
}
