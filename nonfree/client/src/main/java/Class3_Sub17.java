import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class Class3_Sub17 extends Class3 {

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "Z")
	public boolean aBoolean438;

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "Lclient!gk;")
	protected final Class75_Sub2 aClass75_Sub2_38;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class3_Sub17(@OriginalArg(0) Class75_Sub2 arg0) {
		this.aClass75_Sub2_38 = arg0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!sr;Lclient!sr;II)V")
	public abstract void method4933(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) Class42_Sub1 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIB)V")
	public abstract void method4935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)Z")
	public abstract boolean method4936();

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
	public abstract void method4937();

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V")
	public abstract void method4939(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(B)I")
	public int method4940() {
		return 0;
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)I")
	public final int method4941() {
		return 1;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)Z")
	public final boolean method4942() {
		return this.aBoolean438;
	}

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)Z")
	public abstract boolean method4943();

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(B)Z")
	public final boolean method4945() {
		return false;
	}
}
