import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			Static233.method869(local14, 0, Static157.anInt3431, Static211.anIntArray334[arg0]);
		}
		return local14;
	}
}
