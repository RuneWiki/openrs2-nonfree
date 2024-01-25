import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class310 {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
	public final int anInt8980;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "Z")
	public final boolean aBoolean642;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Lclient!ca;")
	public final Class43 aClass43_63;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
	public final int anInt8983;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "Z")
	public final boolean aBoolean643;

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "Lclient!ca;")
	public final Class43 aClass43_64;

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
	private final int anInt8984;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(ILclient!ca;I)V")
	public Class310(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(ILclient!ca;Lclient!ca;II)V")
	public Class310(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(ILclient!ca;Lclient!ca;IIZZ)V")
	public Class310(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt8984 = arg0;
		this.anInt8983 = arg3;
		this.anInt8980 = arg4;
		this.aClass43_63 = arg2;
		this.aBoolean643 = arg5;
		this.aBoolean642 = arg6;
		this.aClass43_64 = arg1;
	}

	@OriginalMember(owner = "client!sj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)I")
	public int method7732() {
		return this.anInt8984;
	}
}
