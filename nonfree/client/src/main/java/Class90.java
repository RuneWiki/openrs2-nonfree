import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public final class Class90 {

	@OriginalMember(owner = "client!es", name = "a", descriptor = "I")
	public final int anInt3323;

	@OriginalMember(owner = "client!es", name = "b", descriptor = "Z")
	public final boolean aBoolean257;

	@OriginalMember(owner = "client!es", name = "d", descriptor = "Z")
	public final boolean aBoolean258;

	@OriginalMember(owner = "client!es", name = "e", descriptor = "Lclient!sw;")
	public final Class316 aClass316_1;

	@OriginalMember(owner = "client!es", name = "f", descriptor = "I")
	private final int anInt3325;

	@OriginalMember(owner = "client!es", name = "h", descriptor = "I")
	public final int anInt3327;

	@OriginalMember(owner = "client!es", name = "l", descriptor = "Lclient!sw;")
	public final Class316 aClass316_2;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(ILclient!sw;I)V")
	public Class90(@OriginalArg(0) int arg0, @OriginalArg(1) Class316 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(ILclient!sw;Lclient!sw;II)V")
	public Class90(@OriginalArg(0) int arg0, @OriginalArg(1) Class316 arg1, @OriginalArg(2) Class316 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(ILclient!sw;Lclient!sw;IIZZ)V")
	public Class90(@OriginalArg(0) int arg0, @OriginalArg(1) Class316 arg1, @OriginalArg(2) Class316 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean258 = arg5;
		this.aBoolean257 = arg6;
		this.aClass316_1 = arg2;
		this.aClass316_2 = arg1;
		this.anInt3325 = arg0;
		this.anInt3323 = arg3;
		this.anInt3327 = arg4;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(B)I")
	public int method2772() {
		return this.anInt3325;
	}

	@OriginalMember(owner = "client!es", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
