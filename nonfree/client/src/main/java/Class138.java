import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class138 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
	private final int anInt4445;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "Lclient!gu;")
	public final Class134 aClass134_63;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Z")
	public final boolean aBoolean349;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Z")
	public final boolean aBoolean350;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
	public final int anInt4447;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
	public final int anInt4448;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!gu;")
	public final Class134 aClass134_64;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(ILclient!gu;I)V")
	public Class138(@OriginalArg(0) int arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(ILclient!gu;Lclient!gu;II)V")
	public Class138(@OriginalArg(0) int arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(ILclient!gu;Lclient!gu;IIZZ)V")
	public Class138(@OriginalArg(0) int arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aClass134_64 = arg1;
		this.anInt4445 = arg0;
		this.anInt4448 = arg3;
		this.aBoolean349 = arg5;
		this.aBoolean350 = arg6;
		this.anInt4447 = arg4;
		this.aClass134_63 = arg2;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
	public int method4023() {
		return this.anInt4445;
	}

	@OriginalMember(owner = "client!hd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
