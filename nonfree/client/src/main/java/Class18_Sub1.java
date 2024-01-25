import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
	private Class18_Sub1() {
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLclient!wj;)Lclient!wj;")
	@Override
	public Class5_Sub1_Sub9 method298(@OriginalArg(1) Class5_Sub1_Sub9 arg0) {
		return new Class5_Sub1_Sub9_Sub2(arg0.method5526(), arg0.anInt6251);
	}
}
