import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class220 implements Interface26 {

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IB)I")
	@Override
	public int method5145(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub2 local16 = (Class2_Sub2) Static424.aClass218_28.method5095((long) arg0, 0);
		return local16 == null ? Static396.aClass107_1.method5145(arg0) : local16.anInt41;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(BI)I")
	@Override
	public int method5146(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub2 local12 = (Class2_Sub2) Static424.aClass218_28.method5095((long) arg0 | 0x100000000L, 0);
		return local12 == null ? Static396.aClass107_1.method5146(arg0) : local12.anInt41;
	}
}
