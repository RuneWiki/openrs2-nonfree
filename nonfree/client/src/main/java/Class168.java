import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class168 {

	@OriginalMember(owner = "client!ic", name = "y", descriptor = "Lclient!ao;")
	public final Class21 aClass21_63;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	private final int anInt4633;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "Lclient!ao;")
	public final Class21 aClass21_64;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Z")
	public final boolean aBoolean352;

	@OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
	public final int anInt4638;

	@OriginalMember(owner = "client!ic", name = "E", descriptor = "Z")
	public final boolean aBoolean353;

	@OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
	public final int anInt4640;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(ILclient!ao;Lclient!ao;II)V")
	public Class168(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(ILclient!ao;I)V")
	public Class168(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(ILclient!ao;Lclient!ao;IIZZ)V")
	public Class168(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt4640 = arg3;
		this.aBoolean353 = arg5;
		this.aClass21_64 = arg2;
		this.aBoolean352 = arg6;
		this.anInt4638 = arg4;
		this.anInt4633 = arg0;
		this.aClass21_63 = arg1;
	}

	@OriginalMember(owner = "client!ic", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)I")
	public int method4057() {
		return this.anInt4633;
	}
}
