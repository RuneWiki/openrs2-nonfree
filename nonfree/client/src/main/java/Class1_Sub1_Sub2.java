import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2() {
		this(4096);
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub2(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt239 = 4096;
		this.anInt239 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(5) int[] local5 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			Static317.method1052(local5, 0, Static6.anInt4960, this.anInt239);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt239 = (arg0.method1853() << 12) / 255;
		}
	}
}
