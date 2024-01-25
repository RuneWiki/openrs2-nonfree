import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public final class Class106 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
	public final int anInt3500;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Lclient!vr;")
	public final Class350 aClass350_1;

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "Z")
	public final boolean aBoolean250;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
	private final int anInt3503;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "Z")
	public final boolean aBoolean251;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
	public final int anInt3505;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "Lclient!vr;")
	public final Class350 aClass350_2;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(ILclient!vr;I)V")
	public Class106(@OriginalArg(0) int arg0, @OriginalArg(1) Class350 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(ILclient!vr;Lclient!vr;II)V")
	public Class106(@OriginalArg(0) int arg0, @OriginalArg(1) Class350 arg1, @OriginalArg(2) Class350 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(ILclient!vr;Lclient!vr;IIZZ)V")
	public Class106(@OriginalArg(0) int arg0, @OriginalArg(1) Class350 arg1, @OriginalArg(2) Class350 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt3500 = arg4;
		this.anInt3505 = arg3;
		this.aBoolean250 = arg6;
		this.aClass350_1 = arg2;
		this.aClass350_2 = arg1;
		this.aBoolean251 = arg5;
		this.anInt3503 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)I")
	public int method2842() {
		return this.anInt3503;
	}
}
