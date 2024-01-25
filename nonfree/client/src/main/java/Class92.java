import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class92 {

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "Lclient!ra;")
	private Class1_Sub4 aClass1_Sub4_34 = new Class1_Sub4();

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "Lclient!p;")
	private final Class159 aClass159_3 = new Class159();

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
	private int anInt2812;

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
	private final int anInt2813;

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "Lclient!tm;")
	private final Class197 aClass197_11;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V")
	public Class92(@OriginalArg(0) int arg0) {
		this.anInt2812 = arg0;
		this.anInt2813 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass197_11 = new Class197(local19);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(JLclient!ra;B)V")
	public void method2601(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub4 arg1) {
		if (this.anInt2812 == 0) {
			@Pc(25) Class1_Sub4 local25 = this.aClass159_3.method4258();
			local25.method5628();
			local25.method5632();
			if (this.aClass1_Sub4_34 == local25) {
				local25 = this.aClass159_3.method4258();
				local25.method5628();
				local25.method5632();
			}
		} else {
			this.anInt2812--;
		}
		this.aClass197_11.method5166(arg1, arg0);
		this.aClass159_3.method4262(arg1);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IJ)Lclient!ra;")
	public Class1_Sub4 method2606(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub4 local10 = (Class1_Sub4) this.aClass197_11.method5157(arg0);
		if (local10 != null) {
			this.aClass159_3.method4262(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	public void method2607() {
		this.aClass159_3.method4255();
		this.aClass197_11.method5155();
		this.aClass1_Sub4_34 = new Class1_Sub4();
		this.anInt2812 = this.anInt2813;
	}
}
