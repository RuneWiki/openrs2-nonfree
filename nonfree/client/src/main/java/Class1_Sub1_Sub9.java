import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
	private int anInt2806;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1_Sub9(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2806 = 4096;
		this.anInt2806 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub9() {
		this(4096);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2806 = (arg0.method5750() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			Static598.method1171(local17, 0, Static279.anInt4906, this.anInt2806);
		}
		return local17;
	}
}
