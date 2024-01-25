import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
	private int anInt2440;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub18() {
		this(4096);
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub2_Sub18(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2440 = 4096;
		this.anInt2440 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt2440 = (arg1.method5174() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			Static404.method4340(local17, 0, Static158.anInt2658, this.anInt2440);
		}
		return local17;
	}
}
