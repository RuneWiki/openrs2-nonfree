import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public final class Class159 {

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
	public final int anInt4338;

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "I")
	private final int anInt4339;

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "Lclient!dm;")
	public final Class84 aClass84_63;

	@OriginalMember(owner = "client!ida", name = "g", descriptor = "Lclient!dm;")
	public final Class84 aClass84_64;

	@OriginalMember(owner = "client!ida", name = "h", descriptor = "I")
	public final int anInt4341;

	@OriginalMember(owner = "client!ida", name = "j", descriptor = "Z")
	public final boolean aBoolean292;

	@OriginalMember(owner = "client!ida", name = "k", descriptor = "Z")
	public final boolean aBoolean293;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(ILclient!dm;Lclient!dm;II)V")
	public Class159(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(ILclient!dm;I)V")
	public Class159(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(ILclient!dm;Lclient!dm;IIZZ)V")
	public Class159(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean292 = arg6;
		this.aBoolean293 = arg5;
		this.anInt4341 = arg3;
		this.anInt4339 = arg0;
		this.aClass84_63 = arg1;
		this.aClass84_64 = arg2;
		this.anInt4338 = arg4;
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(B)I")
	public int method3708() {
		return this.anInt4339;
	}

	@OriginalMember(owner = "client!ida", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
