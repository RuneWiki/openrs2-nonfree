import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public final class Class46 {

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "Z")
	public final boolean aBoolean60;

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "Lclient!bm;")
	public final Class41 aClass41_63;

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
	public final int anInt1170;

	@OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
	private final int anInt1171;

	@OriginalMember(owner = "client!caa", name = "f", descriptor = "Lclient!bm;")
	public final Class41 aClass41_64;

	@OriginalMember(owner = "client!caa", name = "g", descriptor = "Z")
	public final boolean aBoolean61;

	@OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
	public final int anInt1174;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(ILclient!bm;I)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(ILclient!bm;Lclient!bm;II)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) Class41 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(ILclient!bm;Lclient!bm;IIZZ)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) Class41 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1171 = arg0;
		this.aClass41_63 = arg2;
		this.aClass41_64 = arg1;
		this.anInt1170 = arg3;
		this.anInt1174 = arg4;
		this.aBoolean60 = arg6;
		this.aBoolean61 = arg5;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)I")
	public int method1119() {
		return this.anInt1171;
	}

	@OriginalMember(owner = "client!caa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
