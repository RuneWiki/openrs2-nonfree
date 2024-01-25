import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class66 implements Interface5 {

	@OriginalMember(owner = "client!cga", name = "e", descriptor = "Lclient!da;")
	private Class80 aClass80_3;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "Lclient!uca;")
	private final Class341 aClass341_1;

	@OriginalMember(owner = "client!cga", name = "d", descriptor = "Lclient!la;")
	private final Class208 aClass208_14;

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "Lclient!la;")
	private final Class208 aClass208_13;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!uca;)V")
	public Class66(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class341 arg2) {
		this.aClass341_1 = arg2;
		this.aClass208_14 = arg1;
		this.aClass208_13 = arg0;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)V")
	@Override
	public void method8948() {
		@Pc(16) Class224 local16 = Static439.method6500(this.aClass341_1.anInt9989, this.aClass208_14);
		this.aClass80_3 = Static457.aClass57_11.method7708(local16, Static684.method3657(this.aClass208_13, this.aClass341_1.anInt9989));
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8946() {
		@Pc(19) int local19 = this.aClass341_1.aClass219_13.method5206(this.aClass341_1.anInt9984, Static264.anInt4559) + this.aClass341_1.anInt9981;
		@Pc(33) int local33 = this.aClass341_1.aClass368_12.method8776(this.aClass341_1.anInt9979, Static47.anInt794) + this.aClass341_1.anInt9986;
		this.aClass80_3.method8782(this.aClass341_1.anInt9990, this.aClass341_1.anInt9992, this.aClass341_1.anInt9979, this.aClass341_1.anInt9980, this.aClass341_1.anInt9985, (Class134[]) null, this.aClass341_1.anInt9984, this.aClass341_1.aString126, 0, (int[]) null, local19, 0, (Class1) null, local33, this.aClass341_1.anInt9993);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8947() {
		@Pc(14) boolean local14 = true;
		if (!this.aClass208_13.method4977(this.aClass341_1.anInt9989)) {
			local14 = false;
		}
		if (!this.aClass208_14.method4977(this.aClass341_1.anInt9989)) {
			local14 = false;
		}
		return local14;
	}
}
