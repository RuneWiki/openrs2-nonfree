import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public final class Class406 {

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "Z")
	public final boolean aBoolean940;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "Z")
	public final boolean aBoolean941;

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
	private final int anInt11028;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
	public final int anInt11029;

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
	public final int anInt11031;

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "Lclient!jc;")
	public final Class191 aClass191_63;

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "Lclient!jc;")
	public final Class191 aClass191_64;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(ILclient!jc;I)V")
	public Class406(@OriginalArg(0) int arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(ILclient!jc;Lclient!jc;II)V")
	public Class406(@OriginalArg(0) int arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) Class191 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(ILclient!jc;Lclient!jc;IIZZ)V")
	public Class406(@OriginalArg(0) int arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) Class191 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt11029 = arg3;
		this.aBoolean940 = arg5;
		this.anInt11031 = arg4;
		this.aClass191_64 = arg1;
		this.aBoolean941 = arg6;
		this.anInt11028 = arg0;
		this.aClass191_63 = arg2;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)I")
	public int method9624() {
		return this.anInt11028;
	}

	@OriginalMember(owner = "client!wr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
