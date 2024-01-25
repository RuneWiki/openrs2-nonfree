import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public final class Class40 {

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
	public final int anInt705;

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "Z")
	public final boolean aBoolean46;

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
	private final int anInt707;

	@OriginalMember(owner = "client!bl", name = "x", descriptor = "Lclient!gi;")
	public final Class131 aClass131_1;

	@OriginalMember(owner = "client!bl", name = "D", descriptor = "Z")
	public final boolean aBoolean47;

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "Lclient!gi;")
	public final Class131 aClass131_2;

	@OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
	public final int anInt710;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(ILclient!gi;Lclient!gi;II)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) Class131 arg1, @OriginalArg(2) Class131 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(ILclient!gi;I)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) Class131 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(ILclient!gi;Lclient!gi;IIZZ)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) Class131 arg1, @OriginalArg(2) Class131 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aClass131_2 = arg2;
		this.anInt710 = arg4;
		this.anInt707 = arg0;
		this.aClass131_1 = arg1;
		this.aBoolean46 = arg6;
		this.aBoolean47 = arg5;
		this.anInt705 = arg3;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)I")
	public int method774() {
		return this.anInt707;
	}

	@OriginalMember(owner = "client!bl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
