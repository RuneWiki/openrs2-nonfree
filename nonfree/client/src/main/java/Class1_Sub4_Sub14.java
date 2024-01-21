import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class1_Sub4_Sub14 extends Class1_Sub4 {

	@OriginalMember(owner = "client!l", name = "kb", descriptor = "I")
	private int anInt2534;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub14() {
		this(4096);
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V")
	private Class1_Sub4_Sub14(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2534 = 4096;
		this.anInt2534 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(10) int[] local10 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			Static185.method2278(local10, 0, Static73.anInt1888, this.anInt2534);
		}
		return local10;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2534 = (arg0.method544() << 12) / 255;
		}
	}
}
