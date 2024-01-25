import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class1_Sub5_Sub16 extends Class1_Sub5 {

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			Static361.method1852(local13, 0, Static75.anInt1566, Static191.anIntArray379[arg0]);
		}
		return local13;
	}
}
