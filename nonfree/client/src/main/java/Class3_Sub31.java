import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class Class3_Sub31 extends Class3 {

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "Z")
	public boolean aBoolean244;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "Lclient!se;")
	protected final Class122_Sub2 aClass122_Sub2_29;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!se;)V")
	public Class3_Sub31(@OriginalArg(0) Class122_Sub2 arg0) {
		this.aClass122_Sub2_29 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!oa;Lclient!oa;)V")
	public abstract void method3709(@OriginalArg(0) int arg0, @OriginalArg(1) Class66_Sub1 arg1, @OriginalArg(2) Class66_Sub1 arg2);

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Z")
	public final boolean method3710() {
		return false;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)I")
	public final int method3711() {
		return 1;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "()I")
	public int method3712() {
		return 0;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "()Z")
	public abstract boolean method3713();

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V")
	public abstract void method3714(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)Z")
	public final boolean method3715() {
		return this.aBoolean244;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "()Z")
	public abstract boolean method3716();

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "()V")
	public abstract void method3717();

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)V")
	public abstract void method3718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
