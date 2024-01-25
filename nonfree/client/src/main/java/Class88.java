import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class88 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "Lclient!ds;")
	private Class1_Sub2 aClass1_Sub2_12 = new Class1_Sub2();

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "Lclient!ql;")
	private final Class169 aClass169_5 = new Class169();

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
	private int anInt2001;

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
	private final int anInt2000;

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "Lclient!vk;")
	private final Class207 aClass207_14;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(I)V")
	public Class88(@OriginalArg(0) int arg0) {
		this.anInt2001 = arg0;
		this.anInt2000 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass207_14 = new Class207(local19);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
	public void method1650() {
		this.aClass169_5.method4481();
		this.aClass207_14.method5562();
		this.aClass1_Sub2_12 = new Class1_Sub2();
		this.anInt2001 = this.anInt2000;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(JLclient!ds;I)V")
	public void method1651(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub2 arg1) {
		if (this.anInt2001 == 0) {
			@Pc(7) Class1_Sub2 local7 = this.aClass169_5.method4476();
			local7.method5796();
			local7.method5784();
			if (this.aClass1_Sub2_12 == local7) {
				local7 = this.aClass169_5.method4476();
				local7.method5796();
				local7.method5784();
			}
		} else {
			this.anInt2001--;
		}
		this.aClass207_14.method5552(arg1, arg0);
		this.aClass169_5.method4475(arg1);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(JI)Lclient!ds;")
	public Class1_Sub2 method1652(@OriginalArg(0) long arg0) {
		@Pc(17) Class1_Sub2 local17 = (Class1_Sub2) this.aClass207_14.method5555(arg0);
		if (local17 != null) {
			this.aClass169_5.method4475(local17);
		}
		return local17;
	}
}
