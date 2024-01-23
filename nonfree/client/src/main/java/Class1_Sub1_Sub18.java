import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
	private int anInt2853;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub18() {
		this(4096);
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub18(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2853 = 4096;
		this.anInt2853 = arg0;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2853 = (arg0.method2655() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			Static302.method1371(local18, 0, Static75.anInt1848, this.anInt2853);
		}
		return local18;
	}
}
