import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class202 {

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "Lclient!kl;")
	public final Class198 aClass198_62;

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "Z")
	public final boolean aBoolean394;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
	private final int anInt5244;

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "Lclient!kl;")
	public final Class198 aClass198_63;

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
	public final int anInt5246;

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
	public final int anInt5248;

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "Z")
	public final boolean aBoolean395;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(ILclient!kl;I)V")
	public Class202(@OriginalArg(0) int arg0, @OriginalArg(1) Class198 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(ILclient!kl;Lclient!kl;II)V")
	public Class202(@OriginalArg(0) int arg0, @OriginalArg(1) Class198 arg1, @OriginalArg(2) Class198 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(ILclient!kl;Lclient!kl;IIZZ)V")
	public Class202(@OriginalArg(0) int arg0, @OriginalArg(1) Class198 arg1, @OriginalArg(2) Class198 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt5248 = arg4;
		this.aClass198_62 = arg1;
		this.aBoolean395 = arg5;
		this.anInt5244 = arg0;
		this.anInt5246 = arg3;
		this.aClass198_63 = arg2;
		this.aBoolean394 = arg6;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)I")
	public int method4437() {
		return this.anInt5244;
	}

	@OriginalMember(owner = "client!kq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
