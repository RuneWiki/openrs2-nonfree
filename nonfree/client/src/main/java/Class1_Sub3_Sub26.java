import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class1_Sub3_Sub26 extends Class1_Sub3 {

	@OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
	private int anInt4053;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
	private Class1_Sub3_Sub26(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4053 = 4096;
		this.anInt4053 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub26() {
		this(4096);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4053 = (arg0.method2690() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			Static304.method2610(local15, 0, Static227.anInt4511, this.anInt4053);
		}
		return local15;
	}
}
