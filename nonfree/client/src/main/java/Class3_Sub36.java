import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public abstract class Class3_Sub36 extends Class3 {

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "Z")
	public boolean aBoolean459;

	@OriginalMember(owner = "client!ov", name = "q", descriptor = "Lclient!lf;")
	protected final Class95_Sub3 aClass95_Sub3_26;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class3_Sub36(@OriginalArg(0) Class95_Sub3 arg0) {
		this.aClass95_Sub3_26 = arg0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIB)V")
	public abstract void method5559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!rba;Lclient!rba;II)V")
	public abstract void method5560(@OriginalArg(0) Class10_Sub2 arg0, @OriginalArg(1) Class10_Sub2 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)I")
	public int method5561() {
		return 0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
	public abstract void method5562();

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)Z")
	public abstract boolean method5564();

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)Z")
	public final boolean method5566() {
		return false;
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(B)I")
	public final int method5568() {
		return 1;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)V")
	public abstract void method5569(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(Z)Z")
	public abstract boolean method5570();

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "(I)Z")
	public final boolean method5571() {
		return this.aBoolean459;
	}
}
