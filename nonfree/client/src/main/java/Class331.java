import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public final class Class331 {

	@OriginalMember(owner = "client!sl", name = "B", descriptor = "I")
	public final int anInt9107;

	@OriginalMember(owner = "client!sl", name = "C", descriptor = "Lclient!bn;")
	public final Class43 aClass43_63;

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "Z")
	public final boolean aBoolean687;

	@OriginalMember(owner = "client!sl", name = "D", descriptor = "Z")
	public final boolean aBoolean688;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
	public final int anInt9109;

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "Lclient!bn;")
	public final Class43 aClass43_64;

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
	private final int anInt9110;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(ILclient!bn;Lclient!bn;II)V")
	public Class331(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(ILclient!bn;I)V")
	public Class331(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(ILclient!bn;Lclient!bn;IIZZ)V")
	public Class331(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt9107 = arg4;
		this.anInt9109 = arg3;
		this.anInt9110 = arg0;
		this.aClass43_63 = arg2;
		this.aBoolean688 = arg5;
		this.aClass43_64 = arg1;
		this.aBoolean687 = arg6;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)I")
	public int method7957() {
		return this.anInt9110;
	}

	@OriginalMember(owner = "client!sl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
