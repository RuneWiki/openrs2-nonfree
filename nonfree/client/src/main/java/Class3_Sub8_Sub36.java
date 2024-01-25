import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class3_Sub8_Sub36 extends Class3_Sub8 {

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			Static681.method4032(local15, 0, Static91.anInt1849, Static510.anIntArray172[arg0]);
		}
		return local15;
	}
}
