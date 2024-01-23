import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			Static300.method487(local9, 0, Static131.anInt2513, Static219.anIntArray515[arg0]);
		}
		return local9;
	}
}
