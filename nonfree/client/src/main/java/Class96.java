import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class96 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	public final int anInt2827;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient!wr;")
	public final Class364 aClass364_1;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	private final int anInt2830;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Z")
	public final boolean aBoolean211;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public final int anInt2835;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Z")
	public final boolean aBoolean212;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient!wr;")
	public final Class364 aClass364_2;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(ILclient!wr;I)V")
	public Class96(@OriginalArg(0) int arg0, @OriginalArg(1) Class364 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(ILclient!wr;Lclient!wr;II)V")
	public Class96(@OriginalArg(0) int arg0, @OriginalArg(1) Class364 arg1, @OriginalArg(2) Class364 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(ILclient!wr;Lclient!wr;IIZZ)V")
	public Class96(@OriginalArg(0) int arg0, @OriginalArg(1) Class364 arg1, @OriginalArg(2) Class364 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean211 = arg6;
		this.aClass364_2 = arg2;
		this.aClass364_1 = arg1;
		this.anInt2827 = arg4;
		this.anInt2830 = arg0;
		this.anInt2835 = arg3;
		this.aBoolean212 = arg5;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)I")
	public int method2634() {
		return this.anInt2830;
	}

	@OriginalMember(owner = "client!fc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
