import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class277 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "Z")
	public final boolean aBoolean535;

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
	private final int anInt7501;

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "Lclient!gea;")
	public final Class120 aClass120_63;

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "Z")
	public final boolean aBoolean536;

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "I")
	public final int anInt7504;

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
	public final int anInt7507;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "Lclient!gea;")
	public final Class120 aClass120_64;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(ILclient!gea;Lclient!gea;II)V")
	public Class277(@OriginalArg(0) int arg0, @OriginalArg(1) Class120 arg1, @OriginalArg(2) Class120 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(ILclient!gea;I)V")
	public Class277(@OriginalArg(0) int arg0, @OriginalArg(1) Class120 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(ILclient!gea;Lclient!gea;IIZZ)V")
	public Class277(@OriginalArg(0) int arg0, @OriginalArg(1) Class120 arg1, @OriginalArg(2) Class120 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean535 = arg5;
		this.anInt7507 = arg4;
		this.aClass120_64 = arg2;
		this.aClass120_63 = arg1;
		this.anInt7501 = arg0;
		this.aBoolean536 = arg6;
		this.anInt7504 = arg3;
	}

	@OriginalMember(owner = "client!ps", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(B)I")
	public int method6654() {
		return this.anInt7501;
	}
}
