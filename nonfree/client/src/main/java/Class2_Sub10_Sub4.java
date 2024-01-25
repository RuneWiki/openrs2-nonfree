import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class2_Sub10_Sub4 extends Class2_Sub10 {

	@OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
	private int anInt1438;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I)V")
	public Class2_Sub10_Sub4(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1438 = 4096;
		this.anInt1438 = arg0;
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub4() {
		this(4096);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1438 = (arg0.method6904() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			Static649.method4858(local9, 0, Static93.anInt1862, this.anInt1438);
		}
		return local9;
	}
}
