import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class6_Sub4_Sub29 extends Class6_Sub4 {

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			Static601.method2939(local9, 0, Static408.anInt7209, Static501.anIntArray637[arg0]);
		}
		return local9;
	}
}
