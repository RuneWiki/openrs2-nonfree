import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class4_Sub4_Sub12 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			Static363.method4758(local14, 0, Static124.anInt3576, Static64.anIntArray148[arg0]);
		}
		return local14;
	}
}
