import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gia")
public final class Class6_Sub4_Sub12 extends Class6_Sub4 {

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			Static655.method5835(local9, 0, Static6.anInt111, Static629.anIntArray635[arg0]);
		}
		return local9;
	}
}
