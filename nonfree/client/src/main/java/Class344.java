import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public final class Class344 {

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
	public final int anInt9660;

	@OriginalMember(owner = "client!sp", name = "D", descriptor = "Z")
	public final boolean aBoolean693;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "Lclient!pb;")
	public final Class279 aClass279_63;

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
	private final int anInt9663;

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "Lclient!pb;")
	public final Class279 aClass279_64;

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
	public final int anInt9668;

	@OriginalMember(owner = "client!sp", name = "H", descriptor = "Z")
	public final boolean aBoolean694;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(ILclient!pb;I)V")
	public Class344(@OriginalArg(0) int arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(ILclient!pb;Lclient!pb;II)V")
	public Class344(@OriginalArg(0) int arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) Class279 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(ILclient!pb;Lclient!pb;IIZZ)V")
	public Class344(@OriginalArg(0) int arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) Class279 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt9663 = arg0;
		this.anInt9660 = arg3;
		this.aClass279_64 = arg2;
		this.aClass279_63 = arg1;
		this.anInt9668 = arg4;
		this.aBoolean694 = arg5;
		this.aBoolean693 = arg6;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)I")
	public int method8153() {
		return this.anInt9663;
	}

	@OriginalMember(owner = "client!sp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
