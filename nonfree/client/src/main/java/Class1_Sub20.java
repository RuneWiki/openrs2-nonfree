import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public abstract class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "Z")
	public boolean aBoolean259;

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "Lclient!nm;")
	protected final Class164_Sub1 aClass164_Sub1_19;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!nm;)V")
	public Class1_Sub20(@OriginalArg(0) Class164_Sub1 arg0) {
		this.aClass164_Sub1_19 = arg0;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
	public abstract void method2490(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "()V")
	public abstract void method2491();

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)Z")
	public final boolean method2492() {
		return this.aBoolean259;
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)I")
	public final int method2493() {
		return 1;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "()Z")
	public abstract boolean method2494();

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	public abstract void method2495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)Z")
	public final boolean method2496() {
		return false;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "()Z")
	public abstract boolean method2497();

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "()I")
	public int method2498() {
		return 0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!hi;Lclient!hi;)V")
	public abstract void method2499(@OriginalArg(0) int arg0, @OriginalArg(1) Class15_Sub2 arg1, @OriginalArg(2) Class15_Sub2 arg2);
}
