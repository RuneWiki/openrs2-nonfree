import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class146 {

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
	public final int anInt3222;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "Lclient!tr;")
	public final Class335 aClass335_1;

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "Z")
	public final boolean aBoolean262;

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "Z")
	public final boolean aBoolean263;

	@OriginalMember(owner = "client!gl", name = "r", descriptor = "Lclient!tr;")
	public final Class335 aClass335_2;

	@OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
	private final int anInt3225;

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
	public final int anInt3227;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(ILclient!tr;I)V")
	public Class146(@OriginalArg(0) int arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(ILclient!tr;Lclient!tr;II)V")
	public Class146(@OriginalArg(0) int arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(ILclient!tr;Lclient!tr;IIZZ)V")
	public Class146(@OriginalArg(0) int arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aClass335_2 = arg2;
		this.anInt3225 = arg0;
		this.aClass335_1 = arg1;
		this.aBoolean263 = arg5;
		this.aBoolean262 = arg6;
		this.anInt3227 = arg3;
		this.anInt3222 = arg4;
	}

	@OriginalMember(owner = "client!gl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)I")
	public int method2859() {
		return this.anInt3225;
	}
}
