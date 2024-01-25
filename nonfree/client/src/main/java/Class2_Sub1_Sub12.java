import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
	private int anInt2578;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub12() {
		this(4096);
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I)V")
	public Class2_Sub1_Sub12(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2578 = 4096;
		this.anInt2578 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			Static459.method3349(local9, 0, Static131.anInt2581, this.anInt2578);
		}
		return local9;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2578 = (arg1.method3737() << 12) / 255;
		}
	}
}
