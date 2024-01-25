import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public final class Class350 {

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "Z")
	public final boolean aBoolean676;

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "Lclient!ds;")
	public final Class77 aClass77_65;

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
	public final int anInt9278;

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
	public final int anInt9280;

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "Lclient!ds;")
	public final Class77 aClass77_66;

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
	private final int anInt9282;

	@OriginalMember(owner = "client!vv", name = "m", descriptor = "Z")
	public final boolean aBoolean677;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(ILclient!ds;I)V")
	public Class350(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(ILclient!ds;Lclient!ds;II)V")
	public Class350(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) Class77 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(ILclient!ds;Lclient!ds;IIZZ)V")
	public Class350(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) Class77 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aClass77_66 = arg1;
		this.anInt9280 = arg4;
		this.anInt9282 = arg0;
		this.aBoolean677 = arg5;
		this.aBoolean676 = arg6;
		this.aClass77_65 = arg2;
		this.anInt9278 = arg3;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)I")
	public int method7664() {
		return this.anInt9282;
	}

	@OriginalMember(owner = "client!vv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
