import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class1_Sub1_Sub38 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub38() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(27) int[][] local27 = this.method4457(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			for (@Pc(41) int local41 = 0; local41 < Static131.anInt2513; local41++) {
				local16[local41] = (local35[local41] + local31[local41] + local39[local41]) / 3;
			}
		}
		return local16;
	}
}
