import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public abstract class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "Z")
	public boolean aBoolean564;

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "Lclient!cg;")
	protected final Class37_Sub1 aClass37_Sub1_39;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class2_Sub6(@OriginalArg(0) Class37_Sub1 arg0) {
		this.aClass37_Sub1_39 = arg0;
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V")
	public abstract void method5320(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "()V")
	public abstract void method5321();

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)Z")
	public final boolean method5322() {
		return false;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "()I")
	public int method5323() {
		return 0;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!pq;Lclient!pq;)V")
	public abstract void method5324(@OriginalArg(0) int arg0, @OriginalArg(1) Class81_Sub4 arg1, @OriginalArg(2) Class81_Sub4 arg2);

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "()Z")
	public abstract boolean method5325();

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V")
	public abstract void method5326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "()Z")
	public abstract boolean method5327();

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)Z")
	public final boolean method5328() {
		return this.aBoolean564;
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)I")
	public final int method5329() {
		return 1;
	}
}
