import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class158 {

	@OriginalMember(owner = "client!in", name = "b", descriptor = "Lclient!in;")
	public Class158 aClass158_1;

	@OriginalMember(owner = "client!in", name = "f", descriptor = "I")
	public int anInt4244;

	@OriginalMember(owner = "client!in", name = "i", descriptor = "I")
	public int anInt4247;

	@OriginalMember(owner = "client!in", name = "k", descriptor = "Lclient!q;")
	public Class113 aClass113_1;

	@OriginalMember(owner = "client!in", name = "m", descriptor = "I")
	public int anInt4249;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "I")
	public final int anInt4243;

	@OriginalMember(owner = "client!in", name = "l", descriptor = "I")
	public final int anInt4248;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(II)V")
	public Class158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4243 = arg0;
		this.anInt4248 = arg1;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)Lclient!cfa;")
	public Class50 method3423() {
		return Static581.method4965(this.anInt4243);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)Lclient!in;")
	public Class158 method3424(@OriginalArg(0) int arg0) {
		return new Class158(this.anInt4243, arg0);
	}
}
