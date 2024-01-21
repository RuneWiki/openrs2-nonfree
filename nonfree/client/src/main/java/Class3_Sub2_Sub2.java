import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I)V")
	private Class3_Sub2_Sub2(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt269 = 4096;
		this.anInt269 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub2() {
		this(4096);
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(10) int[] local10 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			Static184.method1122(local10, 0, Static86.anInt1942, this.anInt269);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt269 = (arg0.method1354() << 12) / 255;
		}
	}
}
