import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class112 implements Interface10 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)I")
	@Override
	public int method8660(@OriginalArg(1) int arg0) {
		@Pc(18) Class3_Sub42 local18 = (Class3_Sub42) Static658.aClass136_48.method3503((long) arg0);
		return local18 == null ? Static577.aClass362_1.method8660(arg0) : local18.anInt8429;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)I")
	@Override
	public int method8659(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub42 local12 = (Class3_Sub42) Static658.aClass136_48.method3503((long) arg0 | 0x100000000L);
		return local12 == null ? Static577.aClass362_1.method8659(arg0) : local12.anInt8429;
	}
}
