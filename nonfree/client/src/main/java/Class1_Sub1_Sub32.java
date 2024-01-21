import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class1_Sub1_Sub32 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(5) int[] local5 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			Static216.method2202(local5, 0, Static107.anInt2321, Static193.anIntArray277[arg0]);
		}
		return local5;
	}
}
