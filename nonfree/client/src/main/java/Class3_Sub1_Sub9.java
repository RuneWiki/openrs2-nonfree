import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class3_Sub1_Sub9 extends Class3_Sub1 {

	@OriginalMember(owner = "client!fba", name = "D", descriptor = "I")
	private int anInt2920;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub9() {
		this(4096);
	}

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(I)V")
	public Class3_Sub1_Sub9(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2920 = 4096;
		this.anInt2920 = arg0;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			Static732.method6314(local16, 0, Static379.anInt5859, this.anInt2920);
		}
		return local16;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt2920 = (arg1.method2048(255) << 12) / 255;
		}
	}
}
