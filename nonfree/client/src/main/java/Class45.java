import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class45 {

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
	public final int anInt1148;

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "Z")
	public final boolean aBoolean83;

	@OriginalMember(owner = "client!bu", name = "f", descriptor = "Lclient!uf;")
	public final Class346 aClass346_1;

	@OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
	private final int anInt1153;

	@OriginalMember(owner = "client!bu", name = "i", descriptor = "Z")
	public final boolean aBoolean84;

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
	public final int anInt1154;

	@OriginalMember(owner = "client!bu", name = "n", descriptor = "Lclient!uf;")
	public final Class346 aClass346_2;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(ILclient!uf;I)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(ILclient!uf;Lclient!uf;II)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(ILclient!uf;Lclient!uf;IIZZ)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aClass346_1 = arg1;
		this.anInt1154 = arg3;
		this.anInt1148 = arg4;
		this.aBoolean83 = arg5;
		this.anInt1153 = arg0;
		this.aClass346_2 = arg2;
		this.aBoolean84 = arg6;
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)I")
	public int method1209() {
		return this.anInt1153;
	}

	@OriginalMember(owner = "client!bu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
