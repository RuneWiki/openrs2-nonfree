import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class228 {

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "Z")
	public final boolean aBoolean495;

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "Z")
	public final boolean aBoolean496;

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
	private final int anInt7285;

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "Lclient!li;")
	public final Class192 aClass192_63;

	@OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
	public final int anInt7287;

	@OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
	public final int anInt7289;

	@OriginalMember(owner = "client!nr", name = "q", descriptor = "Lclient!li;")
	public final Class192 aClass192_64;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(ILclient!li;Lclient!li;II)V")
	public Class228(@OriginalArg(0) int arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) Class192 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(ILclient!li;I)V")
	public Class228(@OriginalArg(0) int arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(ILclient!li;Lclient!li;IIZZ)V")
	public Class228(@OriginalArg(0) int arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) Class192 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt7289 = arg3;
		this.aClass192_63 = arg1;
		this.anInt7285 = arg0;
		this.aBoolean495 = arg6;
		this.anInt7287 = arg4;
		this.aClass192_64 = arg2;
		this.aBoolean496 = arg5;
	}

	@OriginalMember(owner = "client!nr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(B)I")
	public int method6202() {
		return this.anInt7285;
	}
}
