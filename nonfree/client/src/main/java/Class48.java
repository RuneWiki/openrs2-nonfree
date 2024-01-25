import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public final class Class48 {

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "Lclient!uda;")
	public final Class345 aClass345_1;

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
	public final int anInt1435;

	@OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
	public final int anInt1437;

	@OriginalMember(owner = "client!caa", name = "h", descriptor = "Z")
	public final boolean aBoolean130;

	@OriginalMember(owner = "client!caa", name = "i", descriptor = "Lclient!uda;")
	public final Class345 aClass345_2;

	@OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
	private final int anInt1438;

	@OriginalMember(owner = "client!caa", name = "l", descriptor = "Z")
	public final boolean aBoolean131;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(ILclient!uda;Lclient!uda;II)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) Class345 arg1, @OriginalArg(2) Class345 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(ILclient!uda;I)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) Class345 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(ILclient!uda;Lclient!uda;IIZZ)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) Class345 arg1, @OriginalArg(2) Class345 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean130 = arg5;
		this.aBoolean131 = arg6;
		this.aClass345_1 = arg1;
		this.anInt1438 = arg0;
		this.anInt1437 = arg3;
		this.aClass345_2 = arg2;
		this.anInt1435 = arg4;
	}

	@OriginalMember(owner = "client!caa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)I")
	public int method1309() {
		return this.anInt1438;
	}
}
