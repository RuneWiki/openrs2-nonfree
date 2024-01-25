import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public abstract class Class6_Sub14 extends Class6 {

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "Z")
	public boolean aBoolean167;

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "Lclient!ge;")
	protected final Class81_Sub1 aClass81_Sub1_19;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class6_Sub14(@OriginalArg(0) Class81_Sub1 arg0) {
		this.aClass81_Sub1_19 = arg0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "()Z")
	public abstract boolean method2050();

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)I")
	public final int method2051() {
		return 1;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)V")
	public abstract void method2052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "()Z")
	public abstract boolean method2053();

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)V")
	public abstract void method2054(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "()V")
	public abstract void method2055();

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)Z")
	public final boolean method2056() {
		return false;
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "()I")
	public int method2057() {
		return 0;
	}

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "(I)Z")
	public final boolean method2058() {
		return this.aBoolean167;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!lb;Lclient!lb;)V")
	public abstract void method2059(@OriginalArg(0) int arg0, @OriginalArg(1) Class28_Sub3 arg1, @OriginalArg(2) Class28_Sub3 arg2);
}
