import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lha")
public final class Class3_Sub2_Sub16 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lha", name = "C", descriptor = "I")
	private int anInt6024;

	@OriginalMember(owner = "client!lha", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub16() {
		this(4096);
	}

	@OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(I)V")
	public Class3_Sub2_Sub16(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt6024 = 4096;
		this.anInt6024 = arg0;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6024 = (arg0.method4225() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			Static653.method6860(local9, 0, Static491.anInt8519, this.anInt6024);
		}
		return local9;
	}
}
