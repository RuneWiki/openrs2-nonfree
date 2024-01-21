import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class4_Sub3_Sub10 extends Class4_Sub3 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(5) int[] local5 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			Static189.method189(local5, 0, Static134.anInt3188, Static148.anIntArray321[arg0]);
		}
		return local5;
	}
}
