import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class3_Sub1_Sub12 extends Class3_Sub1 {

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			Static559.method5958(local9, 0, Static307.anInt4846, Static402.anIntArray741[arg0]);
		}
		return local9;
	}
}
