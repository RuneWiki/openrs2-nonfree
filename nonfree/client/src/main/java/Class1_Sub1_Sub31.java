import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class1_Sub1_Sub31 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ug", name = "eb", descriptor = "I")
	private int anInt4600;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub31() {
		this(4096);
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub31(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4600 = 4096;
		this.anInt4600 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			Static236.method301(local19, 0, Static11.anInt294, this.anInt4600);
		}
		return local19;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4600 = (arg0.method2945() << 12) / 255;
		}
	}
}
