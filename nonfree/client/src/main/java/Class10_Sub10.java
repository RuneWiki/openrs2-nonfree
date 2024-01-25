import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public abstract class Class10_Sub10 extends Class10 {

	@OriginalMember(owner = "client!su", name = "k", descriptor = "Z")
	public boolean aBoolean57;

	@OriginalMember(owner = "client!su", name = "p", descriptor = "Lclient!da;")
	protected final Class50_Sub1 aClass50_Sub1_11;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class10_Sub10(@OriginalArg(0) Class50_Sub1 arg0) {
		this.aClass50_Sub1_11 = arg0;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)Z")
	public abstract boolean method899();

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!sq;Lclient!sq;IB)V")
	public abstract void method901(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(I)I")
	public int method902() {
		return 0;
	}

	@OriginalMember(owner = "client!su", name = "d", descriptor = "(I)Z")
	public abstract boolean method903();

	@OriginalMember(owner = "client!su", name = "e", descriptor = "(I)I")
	public final int method904() {
		return 1;
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(B)Z")
	public final boolean method905() {
		return false;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IZ)V")
	public abstract void method906(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!su", name = "f", descriptor = "(I)V")
	public abstract void method907();

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IBI)V")
	public abstract void method910(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!su", name = "h", descriptor = "(I)Z")
	public final boolean method911() {
		return this.aBoolean57;
	}
}
