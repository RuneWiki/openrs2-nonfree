import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class7_Sub3_Sub9 extends Class7_Sub3 {

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			Static464.method3634(local14, 0, Static58.anInt1052, Static203.anIntArray322[arg0]);
		}
		return local14;
	}
}
