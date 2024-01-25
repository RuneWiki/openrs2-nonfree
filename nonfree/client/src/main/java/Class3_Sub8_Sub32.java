import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tia")
public final class Class3_Sub8_Sub32 extends Class3_Sub8 {

	@OriginalMember(owner = "client!tia", name = "J", descriptor = "I")
	private int anInt9388;

	@OriginalMember(owner = "client!tia", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub32() {
		this(4096);
	}

	@OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(I)V")
	public Class3_Sub8_Sub32(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt9388 = 4096;
		this.anInt9388 = arg0;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt9388 = (arg1.method7954() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			Static681.method4032(local17, 0, Static91.anInt1849, this.anInt9388);
		}
		return local17;
	}
}
