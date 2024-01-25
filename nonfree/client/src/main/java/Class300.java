import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class300 implements Interface12 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)I")
	@Override
	public int method6961(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub44 local16 = (Class3_Sub44) Static339.aClass313_24.method7104((long) arg0);
		return local16 == null ? Static380.aClass127_1.method6961(arg0) : local16.anInt7298;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I")
	@Override
	public int method6960(@OriginalArg(1) int arg0) {
		@Pc(18) Class3_Sub44 local18 = (Class3_Sub44) Static339.aClass313_24.method7104((long) arg0 | 0x100000000L);
		return local18 == null ? Static380.aClass127_1.method6960(arg0) : local18.anInt7298;
	}
}
