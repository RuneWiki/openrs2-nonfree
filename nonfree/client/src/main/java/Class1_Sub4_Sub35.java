import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class1_Sub4_Sub35 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			Static185.method2278(local14, 0, Static73.anInt1888, Static150.anIntArray383[arg0]);
		}
		return local14;
	}
}
