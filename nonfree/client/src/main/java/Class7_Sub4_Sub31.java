import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class7_Sub4_Sub31 extends Class7_Sub4 {

	@OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
	private int anInt5386;

	static {
		new Class154(64);
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
	public Class7_Sub4_Sub31(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt5386 = 4096;
		this.anInt5386 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub31() {
		this(4096);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5386 = (arg0.method2772() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			Static366.method4203(local17, 0, Static201.anInt4174, this.anInt5386);
		}
		return local17;
	}
}
