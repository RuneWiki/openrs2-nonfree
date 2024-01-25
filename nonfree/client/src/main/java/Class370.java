import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public final class Class370 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	public final int anInt9706;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
	private final int anInt9709;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "Lclient!te;")
	public final Class335 aClass335_64;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!te;")
	public final Class335 aClass335_65;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "Z")
	public final boolean aBoolean717;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
	public final int anInt9713;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "Z")
	public final boolean aBoolean718;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(ILclient!te;Lclient!te;II)V")
	public Class370(@OriginalArg(0) int arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(ILclient!te;I)V")
	public Class370(@OriginalArg(0) int arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(ILclient!te;Lclient!te;IIZZ)V")
	public Class370(@OriginalArg(0) int arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean717 = arg5;
		this.anInt9706 = arg3;
		this.anInt9709 = arg0;
		this.aClass335_64 = arg2;
		this.aBoolean718 = arg6;
		this.anInt9713 = arg4;
		this.aClass335_65 = arg1;
	}

	@OriginalMember(owner = "client!vc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)I")
	public int method8274() {
		return this.anInt9709;
	}
}
