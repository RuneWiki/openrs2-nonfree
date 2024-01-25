import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class2_Sub3_Sub28 extends Class2_Sub3 {

	static {
		new Class140("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			Static369.method2580(local11, 0, Static263.anInt5504, Static76.anIntArray121[arg0]);
		}
		return local11;
	}
}
