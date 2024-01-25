import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class296 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
	public final int anInt8689;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
	public final int anInt8691;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "Z")
	public final boolean aBoolean615;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "Lclient!ef;")
	public final Class84 aClass84_63;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "Lclient!ef;")
	public final Class84 aClass84_64;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "Z")
	public final boolean aBoolean616;

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
	private final int anInt8696;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(ILclient!ef;I)V")
	public Class296(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(ILclient!ef;Lclient!ef;II)V")
	public Class296(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(ILclient!ef;Lclient!ef;IIZZ)V")
	public Class296(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean616 = arg5;
		this.aClass84_64 = arg2;
		this.aBoolean615 = arg6;
		this.aClass84_63 = arg1;
		this.anInt8689 = arg3;
		this.anInt8691 = arg4;
		this.anInt8696 = arg0;
	}

	@OriginalMember(owner = "client!rj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)I")
	public int method7183() {
		return this.anInt8696;
	}
}
