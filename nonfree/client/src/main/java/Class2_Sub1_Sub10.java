import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ee", name = "X", descriptor = "I")
	private int anInt1088;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub10(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1088 = 4096;
		this.anInt1088 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub10() {
		this(4096);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(5) int[] local5 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			Static184.method166(local5, 0, Static120.anInt2812, this.anInt1088);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1088 = (arg0.method1402() << 12) / 255;
		}
	}
}
