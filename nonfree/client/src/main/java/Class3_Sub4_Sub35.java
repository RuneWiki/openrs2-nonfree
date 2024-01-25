import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class3_Sub4_Sub35 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			Static466.method206(local16, 0, Static148.anInt2687, Static317.anIntArray337[arg0]);
		}
		return local16;
	}
}
