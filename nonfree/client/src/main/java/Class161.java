import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class161 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
	public final int anInt3991;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
	public final int anInt3993;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "Z")
	public final boolean aBoolean255;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
	private final int anInt3996;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Lclient!fj;")
	public final Class104 aClass104_109;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "Lclient!fj;")
	public final Class104 aClass104_110;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(ILclient!fj;Lclient!fj;II)V")
	public Class161(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class104 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, false);
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(ILclient!fj;I)V")
	public Class161(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, false);
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(ILclient!fj;Lclient!fj;IIZ)V")
	public Class161(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class104 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass104_109 = arg2;
		this.anInt3991 = arg3;
		this.aBoolean255 = arg5;
		this.anInt3993 = arg4;
		this.aClass104_110 = arg1;
		this.anInt3996 = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)I")
	public int method3451() {
		return this.anInt3996;
	}
}
