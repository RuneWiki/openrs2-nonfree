import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class1_Sub3_Sub30 extends Class1_Sub3 {

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			Static361.method1333(local17, 0, Static153.anInt3378, Static266.anIntArray454[arg0]);
		}
		return local17;
	}
}
