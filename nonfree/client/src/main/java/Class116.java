import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class116 {

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!sq;")
	private Class1_Sub1 aClass1_Sub1_28 = new Class1_Sub1();

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "Lclient!uq;")
	private final Class247 aClass247_1 = new Class247();

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
	private final int anInt2873;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
	private int anInt2874;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "Lclient!cv;")
	private final Class51 aClass51_11;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V")
	public Class116(@OriginalArg(0) int arg0) {
		this.anInt2873 = arg0;
		this.anInt2874 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass51_11 = new Class51(local19);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLclient!sq;J)V")
	public void method2526(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt2874 == 0) {
			@Pc(28) Class1_Sub1 local28 = this.aClass247_1.method5585();
			local28.method5965();
			local28.method5893();
			if (local28 == this.aClass1_Sub1_28) {
				local28 = this.aClass247_1.method5585();
				local28.method5965();
				local28.method5893();
			}
		} else {
			this.anInt2874--;
		}
		this.aClass51_11.method931(arg0, arg1);
		this.aClass247_1.method5590(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method2528() {
		this.aClass247_1.method5586();
		this.aClass51_11.method921();
		this.aClass1_Sub1_28 = new Class1_Sub1();
		this.anInt2874 = this.anInt2873;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IJ)Lclient!sq;")
	public Class1_Sub1 method2530(@OriginalArg(1) long arg0) {
		@Pc(17) Class1_Sub1 local17 = (Class1_Sub1) this.aClass51_11.method930(arg0);
		if (local17 != null) {
			this.aClass247_1.method5590(local17);
		}
		return local17;
	}
}
