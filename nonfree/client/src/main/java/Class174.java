import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public final class Class174 {

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "Lclient!ig;")
	public final Class152 aClass152_109;

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "I")
	private final int anInt5260;

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "I")
	public final int anInt5261;

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "Z")
	public final boolean aBoolean396;

	@OriginalMember(owner = "client!kaa", name = "h", descriptor = "I")
	public final int anInt5263;

	@OriginalMember(owner = "client!kaa", name = "i", descriptor = "Lclient!ig;")
	public final Class152 aClass152_110;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(ILclient!ig;Lclient!ig;II)V")
	public Class174(@OriginalArg(0) int arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(2) Class152 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, false);
	}

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(ILclient!ig;I)V")
	public Class174(@OriginalArg(0) int arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, false);
	}

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(ILclient!ig;Lclient!ig;IIZ)V")
	public Class174(@OriginalArg(0) int arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(2) Class152 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean396 = arg5;
		this.anInt5263 = arg3;
		this.anInt5260 = arg0;
		this.aClass152_110 = arg2;
		this.aClass152_109 = arg1;
		this.anInt5261 = arg4;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)I")
	public int method4525() {
		return this.anInt5260;
	}

	@OriginalMember(owner = "client!kaa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
