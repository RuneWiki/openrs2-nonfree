import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class1_Sub3_Sub16 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(5) int[] local5 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			Static304.method2610(local5, 0, Static227.anInt4511, Static132.anIntArray265[arg0]);
		}
		return local5;
	}
}
