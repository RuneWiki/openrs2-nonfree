import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class247 {

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
	private final int anInt6912;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "Lclient!bl;")
	public final Class42 aClass42_63;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "Lclient!bl;")
	public final Class42 aClass42_64;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "Z")
	public final boolean aBoolean497;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "Z")
	public final boolean aBoolean498;

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
	public final int anInt6916;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
	public final int anInt6917;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(ILclient!bl;Lclient!bl;II)V")
	public Class247(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(ILclient!bl;Lclient!bl;IIZZ)V")
	public Class247(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean497 = arg6;
		this.anInt6912 = arg0;
		this.aClass42_63 = arg2;
		this.anInt6916 = arg4;
		this.aBoolean498 = arg5;
		this.anInt6917 = arg3;
		this.aClass42_64 = arg1;
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(ILclient!bl;I)V")
	public Class247(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!nm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)I")
	public int method5877() {
		return this.anInt6912;
	}
}
