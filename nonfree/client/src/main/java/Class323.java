import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public final class Class323 {

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "Z")
	public final boolean aBoolean652;

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
	public final int anInt8660;

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
	public final int anInt8662;

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "Lclient!pk;")
	public final Class271 aClass271_63;

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "Lclient!pk;")
	public final Class271 aClass271_64;

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "Z")
	public final boolean aBoolean653;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
	private final int anInt8667;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(ILclient!pk;I)V")
	public Class323(@OriginalArg(0) int arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(ILclient!pk;Lclient!pk;IIZZ)V")
	public Class323(@OriginalArg(0) int arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) Class271 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean652 = arg5;
		this.aBoolean653 = arg6;
		this.anInt8667 = arg0;
		this.aClass271_64 = arg2;
		this.anInt8660 = arg4;
		this.aClass271_63 = arg1;
		this.anInt8662 = arg3;
	}

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(ILclient!pk;Lclient!pk;II)V")
	public Class323(@OriginalArg(0) int arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) Class271 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)I")
	public int method7297() {
		return this.anInt8667;
	}

	@OriginalMember(owner = "client!sp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
