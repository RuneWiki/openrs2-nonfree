import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class Class47_Sub4 extends Class47 {

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
	public int anInt4954;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
	public int anInt4958;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
	public int anInt4950;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
	protected final int anInt4960;

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
	public final int anInt4961;

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
	public int anInt4956;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
	public final int anInt4951;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class47_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4954 = arg2;
		this.anInt4958 = arg0;
		this.anInt4950 = arg5;
		this.anInt4960 = arg1;
		this.anInt4961 = arg6;
		this.anInt4956 = arg4;
		this.anInt4951 = arg3;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILclient!qa;IZLclient!ha;I)V")
	@Override
	public final void method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method5725() {
		return false;
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V")
	@Override
	public final void method5723() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)I")
	public abstract int method4049();
}
