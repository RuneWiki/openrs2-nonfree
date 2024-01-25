import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class1_Sub2_Sub31 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			Static404.method4340(local9, 0, Static158.anInt2658, Static394.anIntArray751[arg0]);
		}
		return local9;
	}
}
