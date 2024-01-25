import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class Class1_Sub34 extends Class1 {

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "Z")
	public boolean aBoolean412;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "Lclient!mh;")
	protected final Class4_Sub3 aClass4_Sub3_28;

	static {
		new Class45(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!mh;)V")
	public Class1_Sub34(@OriginalArg(0) Class4_Sub3 arg0) {
		this.aClass4_Sub3_28 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Z")
	public abstract boolean method5018();

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
	public abstract void method5021();

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)Z")
	public abstract boolean method5022();

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
	public abstract void method5023(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)Z")
	public final boolean method5025() {
		return false;
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)Z")
	public final boolean method5027() {
		return this.aBoolean412;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V")
	public abstract void method5028(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLclient!rr;ILclient!rr;)V")
	public abstract void method5029(@OriginalArg(1) Class164_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class164_Sub3 arg2);

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)I")
	public int method5030() {
		return 0;
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)I")
	public final int method5031() {
		return 1;
	}
}
