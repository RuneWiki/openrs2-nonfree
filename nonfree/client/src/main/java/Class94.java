import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class94 {

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
	public final int anInt2736;

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "Lclient!in;")
	public final Class152 aClass152_1;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "Z")
	public final boolean aBoolean209;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "Lclient!in;")
	public final Class152 aClass152_2;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
	private final int anInt2739;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
	public final int anInt2741;

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "Z")
	public final boolean aBoolean210;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(ILclient!in;Lclient!in;II)V")
	public Class94(@OriginalArg(0) int arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(2) Class152 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(ILclient!in;I)V")
	public Class94(@OriginalArg(0) int arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(ILclient!in;Lclient!in;IIZZ)V")
	public Class94(@OriginalArg(0) int arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(2) Class152 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aClass152_2 = arg1;
		this.anInt2739 = arg0;
		this.aBoolean209 = arg5;
		this.aClass152_1 = arg2;
		this.aBoolean210 = arg6;
		this.anInt2741 = arg4;
		this.anInt2736 = arg3;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)I")
	public int method2182() {
		return this.anInt2739;
	}

	@OriginalMember(owner = "client!ei", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
