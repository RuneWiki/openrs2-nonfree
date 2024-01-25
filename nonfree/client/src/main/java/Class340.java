import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class340 {

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "Lclient!jga;")
	private Class4_Sub6 aClass4_Sub6_60 = new Class4_Sub6();

	@OriginalMember(owner = "client!vca", name = "h", descriptor = "Lclient!gd;")
	private final Class120 aClass120_11 = new Class120();

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "I")
	private final int anInt10033;

	@OriginalMember(owner = "client!vca", name = "g", descriptor = "I")
	private int anInt10034;

	@OriginalMember(owner = "client!vca", name = "i", descriptor = "Lclient!mo;")
	private final Class221 aClass221_35;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(I)V")
	public Class340(@OriginalArg(0) int arg0) {
		this.anInt10033 = arg0;
		this.anInt10034 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass221_35 = new Class221(local19);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
	public void method7721() {
		this.aClass120_11.method2665();
		this.aClass221_35.method5078();
		this.aClass4_Sub6_60 = new Class4_Sub6();
		this.anInt10034 = this.anInt10033;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(JI)Lclient!jga;")
	public Class4_Sub6 method7723(@OriginalArg(0) long arg0) {
		@Pc(15) Class4_Sub6 local15 = (Class4_Sub6) this.aClass221_35.method5075(arg0);
		if (local15 != null) {
			this.aClass120_11.method2669(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(JILclient!jga;)V")
	public void method7724(@OriginalArg(0) long arg0, @OriginalArg(2) Class4_Sub6 arg1) {
		if (this.anInt10034 == 0) {
			@Pc(24) Class4_Sub6 local24 = this.aClass120_11.method2667();
			local24.method8193();
			local24.method7880();
			if (local24 == this.aClass4_Sub6_60) {
				local24 = this.aClass120_11.method2667();
				local24.method8193();
				local24.method7880();
			}
		} else {
			this.anInt10034--;
		}
		this.aClass221_35.method5073(arg1, arg0);
		this.aClass120_11.method2669(arg1);
	}
}
