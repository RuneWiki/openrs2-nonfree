import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class178 {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	public final int anInt5101;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
	private final int anInt5102;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "Z")
	public final boolean aBoolean361;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "Z")
	public final boolean aBoolean362;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "Lclient!jga;")
	public final Class156 aClass156_62;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "Lclient!jga;")
	public final Class156 aClass156_63;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
	public final int anInt5104;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(ILclient!jga;Lclient!jga;II)V")
	public Class178(@OriginalArg(0) int arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) Class156 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(ILclient!jga;I)V")
	public Class178(@OriginalArg(0) int arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(ILclient!jga;Lclient!jga;IIZZ)V")
	public Class178(@OriginalArg(0) int arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) Class156 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt5101 = arg3;
		this.anInt5104 = arg4;
		this.aClass156_62 = arg1;
		this.anInt5102 = arg0;
		this.aBoolean362 = arg5;
		this.aClass156_63 = arg2;
		this.aBoolean361 = arg6;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)I")
	public int method4392() {
		return this.anInt5102;
	}

	@OriginalMember(owner = "client!kk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
