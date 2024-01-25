import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public abstract class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!oq", name = "q", descriptor = "Z")
	public boolean aBoolean42;

	@OriginalMember(owner = "client!oq", name = "m", descriptor = "Lclient!vj;")
	protected final Class45_Sub3 aClass45_Sub3_3;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class3_Sub5(@OriginalArg(0) Class45_Sub3 arg0) {
		this.aClass45_Sub3_3 = arg0;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)Z")
	public abstract boolean method376();

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)Z")
	public final boolean method378() {
		return this.aBoolean42;
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
	public abstract void method379();

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)I")
	public int method381() {
		return 0;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IILclient!g;Lclient!g;)V")
	public abstract void method382(@OriginalArg(0) int arg0, @OriginalArg(2) Class24_Sub1 arg1, @OriginalArg(3) Class24_Sub1 arg2);

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)Z")
	public final boolean method383() {
		return false;
	}

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "(I)Z")
	public abstract boolean method384();

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZII)V")
	public abstract void method385(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)I")
	public final int method386() {
		return 1;
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(II)V")
	public abstract void method387(@OriginalArg(0) int arg0);
}
