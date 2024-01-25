import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class222 implements Interface13 {

	@OriginalMember(owner = "client!li", name = "b", descriptor = "Lclient!da;")
	private Class68 aClass68_5;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "Lclient!rg;")
	private final Class310 aClass310_69;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "Lclient!rg;")
	private final Class310 aClass310_70;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "Lclient!tn;")
	private final Class353 aClass353_1;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!rg;Lclient!rg;Lclient!tn;)V")
	public Class222(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass310_69 = arg0;
		this.aClass310_70 = arg1;
		this.aClass353_1 = arg2;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8820() {
		@Pc(13) boolean local13 = true;
		if (!this.aClass310_69.method7785(this.aClass353_1.anInt9791)) {
			local13 = false;
		}
		if (!this.aClass310_70.method7785(this.aClass353_1.anInt9791)) {
			local13 = false;
		}
		return local13;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8819() {
		@Pc(28) int local28 = this.aClass353_1.aClass258_13.method6293(Static380.anInt6690, this.aClass353_1.anInt9792) + this.aClass353_1.anInt9784;
		@Pc(43) int local43 = this.aClass353_1.aClass205_18.method5049(Static380.anInt6697, this.aClass353_1.anInt9797) + this.aClass353_1.anInt9785;
		this.aClass68_5.method9436(0, this.aClass353_1.anInt9797, this.aClass353_1.anInt9786, local43, this.aClass353_1.anInt9792, local28, this.aClass353_1.aString107, (Class1) null, this.aClass353_1.anInt9790, 0, (int[]) null, this.aClass353_1.anInt9782, this.aClass353_1.anInt9788, (Class45[]) null, this.aClass353_1.anInt9789);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
	@Override
	public void method8821() {
		@Pc(11) Class350 local11 = Static63.method1038(this.aClass353_1.anInt9791, this.aClass310_70);
		this.aClass68_5 = Static103.aClass144_3.method6958(local11, Static697.method6468(this.aClass310_69, this.aClass353_1.anInt9791), true);
	}
}
