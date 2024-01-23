import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class2_Sub1_Sub28 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pi", name = "eb", descriptor = "I")
	private int anInt3620;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub28(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3620 = 4096;
		this.anInt3620 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub28() {
		this(4096);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			Static225.method1840(local9, 0, Static62.anInt1675, this.anInt3620);
		}
		return local9;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3620 = (arg0.method209() << 12) / 255;
		}
	}
}
