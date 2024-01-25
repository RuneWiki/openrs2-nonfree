import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class14_Sub1_Sub31 extends Class14_Sub1 {

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			Static681.method2479(local9, 0, Static371.anInt6835, Static336.anIntArray458[arg0]);
		}
		return local9;
	}
}
