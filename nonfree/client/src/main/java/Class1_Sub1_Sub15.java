import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			Static374.method2829(local9, 0, Static85.anInt1910, Static60.anIntArray122[arg0]);
		}
		return local9;
	}
}
