import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "Z")
	public boolean aBoolean258;

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "Lclient!ic;")
	protected final Class48_Sub2 aClass48_Sub2_15;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!ic;)V")
	public Class2_Sub21(@OriginalArg(0) Class48_Sub2 arg0) {
		this.aClass48_Sub2_15 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
	public abstract void method2929();

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "()Z")
	public abstract boolean method2930();

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)I")
	public final int method2931() {
		return 1;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)Z")
	public final boolean method2932() {
		return false;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
	public abstract void method2933(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "()I")
	public int method2934() {
		return 0;
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "()Z")
	public abstract boolean method2935();

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)Z")
	public final boolean method2936() {
		return this.aBoolean258;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!tr;Lclient!tr;)V")
	public abstract void method2937(@OriginalArg(0) int arg0, @OriginalArg(1) Class81_Sub2 arg1, @OriginalArg(2) Class81_Sub2 arg2);

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
	public abstract void method2938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
