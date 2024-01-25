import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class246 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Z")
	public final boolean aBoolean442;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	public final int anInt5770;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "Lclient!ji;")
	public final Class179 aClass179_63;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Z")
	public final boolean aBoolean443;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "Lclient!ji;")
	public final Class179 aClass179_64;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public final int anInt5774;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	private final int anInt5776;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(ILclient!ji;Lclient!ji;II)V")
	public Class246(@OriginalArg(0) int arg0, @OriginalArg(1) Class179 arg1, @OriginalArg(2) Class179 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(ILclient!ji;I)V")
	public Class246(@OriginalArg(0) int arg0, @OriginalArg(1) Class179 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(ILclient!ji;Lclient!ji;IIZZ)V")
	public Class246(@OriginalArg(0) int arg0, @OriginalArg(1) Class179 arg1, @OriginalArg(2) Class179 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean442 = arg6;
		this.aClass179_64 = arg1;
		this.anInt5774 = arg3;
		this.aClass179_63 = arg2;
		this.aBoolean443 = arg5;
		this.anInt5776 = arg0;
		this.anInt5770 = arg4;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)I")
	public int method5071() {
		return this.anInt5776;
	}

	@OriginalMember(owner = "client!nc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
