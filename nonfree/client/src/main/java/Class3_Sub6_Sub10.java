import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class3_Sub6_Sub10 extends Class3_Sub6 {

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			Static604.method6221(local14, 0, Static481.anInt8358, Static231.anIntArray217[arg0]);
		}
		return local14;
	}
}
