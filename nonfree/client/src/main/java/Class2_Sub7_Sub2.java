import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class2_Sub7_Sub2 extends Class2_Sub7 {

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			Static553.method3371(local17, 0, Static352.anInt6485, Static313.anIntArray521[arg0]);
		}
		return local17;
	}
}
