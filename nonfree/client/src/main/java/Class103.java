import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public final class Class103 {

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "I")
	public final int anInt2628;

	@OriginalMember(owner = "client!fga", name = "d", descriptor = "Lclient!vw;")
	public final Class351 aClass351_1;

	@OriginalMember(owner = "client!fga", name = "g", descriptor = "I")
	public final int anInt2631;

	@OriginalMember(owner = "client!fga", name = "h", descriptor = "I")
	private final int anInt2632;

	@OriginalMember(owner = "client!fga", name = "j", descriptor = "Z")
	public final boolean aBoolean195;

	@OriginalMember(owner = "client!fga", name = "m", descriptor = "Z")
	public final boolean aBoolean196;

	@OriginalMember(owner = "client!fga", name = "n", descriptor = "Lclient!vw;")
	public final Class351 aClass351_2;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(ILclient!vw;I)V")
	public Class103(@OriginalArg(0) int arg0, @OriginalArg(1) Class351 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(ILclient!vw;Lclient!vw;II)V")
	public Class103(@OriginalArg(0) int arg0, @OriginalArg(1) Class351 arg1, @OriginalArg(2) Class351 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(ILclient!vw;Lclient!vw;IIZZ)V")
	public Class103(@OriginalArg(0) int arg0, @OriginalArg(1) Class351 arg1, @OriginalArg(2) Class351 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt2631 = arg4;
		this.aClass351_1 = arg1;
		this.anInt2632 = arg0;
		this.aBoolean196 = arg6;
		this.anInt2628 = arg3;
		this.aBoolean195 = arg5;
		this.aClass351_2 = arg2;
	}

	@OriginalMember(owner = "client!fga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "(I)I")
	public int method2088() {
		return this.anInt2632;
	}
}
