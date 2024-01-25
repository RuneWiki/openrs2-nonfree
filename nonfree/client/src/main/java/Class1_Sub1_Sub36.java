import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class1_Sub1_Sub36 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			Static598.method772(local9, 0, Static501.anInt8748, Static583.anIntArray614[arg0]);
		}
		return local9;
	}
}
