import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public final class Class246 {

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "Z")
	public final boolean aBoolean507;

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "I")
	private final int anInt6556;

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "Lclient!oi;")
	public final Class253 aClass253_1;

	@OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
	public final int anInt6557;

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "Z")
	public final boolean aBoolean508;

	@OriginalMember(owner = "client!nw", name = "j", descriptor = "Lclient!oi;")
	public final Class253 aClass253_2;

	@OriginalMember(owner = "client!nw", name = "m", descriptor = "I")
	public final int anInt6562;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(ILclient!oi;Lclient!oi;II)V")
	public Class246(@OriginalArg(0) int arg0, @OriginalArg(1) Class253 arg1, @OriginalArg(2) Class253 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(ILclient!oi;I)V")
	public Class246(@OriginalArg(0) int arg0, @OriginalArg(1) Class253 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(ILclient!oi;Lclient!oi;IIZZ)V")
	public Class246(@OriginalArg(0) int arg0, @OriginalArg(1) Class253 arg1, @OriginalArg(2) Class253 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt6562 = arg4;
		this.aClass253_2 = arg1;
		this.aBoolean508 = arg6;
		this.aClass253_1 = arg2;
		this.anInt6557 = arg3;
		this.anInt6556 = arg0;
		this.aBoolean507 = arg5;
	}

	@OriginalMember(owner = "client!nw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)I")
	public int method5315() {
		return this.anInt6556;
	}
}
