import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Class167 {

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "Lclient!va;")
	public final Class351 aClass351_1;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "Z")
	public final boolean aBoolean437;

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!va;")
	public final Class351 aClass351_2;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "Z")
	public final boolean aBoolean438;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
	private final int anInt5648;

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
	public final int anInt5651;

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
	public final int anInt5653;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(ILclient!va;I)V")
	public Class167(@OriginalArg(0) int arg0, @OriginalArg(1) Class351 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(ILclient!va;Lclient!va;II)V")
	public Class167(@OriginalArg(0) int arg0, @OriginalArg(1) Class351 arg1, @OriginalArg(2) Class351 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(ILclient!va;Lclient!va;IIZZ)V")
	public Class167(@OriginalArg(0) int arg0, @OriginalArg(1) Class351 arg1, @OriginalArg(2) Class351 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aClass351_1 = arg1;
		this.anInt5651 = arg4;
		this.anInt5648 = arg0;
		this.anInt5653 = arg3;
		this.aClass351_2 = arg2;
		this.aBoolean438 = arg6;
		this.aBoolean437 = arg5;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I")
	public int method4891() {
		return this.anInt5648;
	}

	@OriginalMember(owner = "client!jj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
