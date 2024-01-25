import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class151 {

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
	private final int anInt4129;

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "Lclient!uw;")
	public final Class343 aClass343_1;

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
	public final int anInt4131;

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
	public final int anInt4134;

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "Lclient!uw;")
	public final Class343 aClass343_2;

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "Z")
	public final boolean aBoolean302;

	@OriginalMember(owner = "client!ir", name = "k", descriptor = "Z")
	public final boolean aBoolean303;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(ILclient!uw;Lclient!uw;II)V")
	public Class151(@OriginalArg(0) int arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class343 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(ILclient!uw;I)V")
	public Class151(@OriginalArg(0) int arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(ILclient!uw;Lclient!uw;IIZZ)V")
	public Class151(@OriginalArg(0) int arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class343 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt4131 = arg3;
		this.anInt4134 = arg4;
		this.aBoolean302 = arg6;
		this.aBoolean303 = arg5;
		this.anInt4129 = arg0;
		this.aClass343_1 = arg2;
		this.aClass343_2 = arg1;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)I")
	public int method3631() {
		return this.anInt4129;
	}

	@OriginalMember(owner = "client!ir", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
