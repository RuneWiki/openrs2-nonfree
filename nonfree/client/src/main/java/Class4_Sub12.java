import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class Class4_Sub12 extends Class4 {

	@OriginalMember(owner = "client!mp", name = "q", descriptor = "Z")
	public boolean aBoolean180;

	@OriginalMember(owner = "client!mp", name = "u", descriptor = "Lclient!bv;")
	protected final Class30_Sub1 aClass30_Sub1_16;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!bv;)V")
	public Class4_Sub12(@OriginalArg(0) Class30_Sub1 arg0) {
		this.aClass30_Sub1_16 = arg0;
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)I")
	public int method1729() {
		return 0;
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)Z")
	public abstract boolean method1730();

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)V")
	public abstract void method1732(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)Z")
	public final boolean method1733() {
		return false;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!wg;Lclient!wg;II)V")
	public abstract void method1734(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) Class1_Sub3 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "(I)Z")
	public abstract boolean method1735();

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)V")
	public abstract void method1737(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(B)V")
	public abstract void method1738();

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)Z")
	public final boolean method1739() {
		return this.aBoolean180;
	}

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "(I)I")
	public final int method1740() {
		return 1;
	}
}
