import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public final class Class261 {

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "Z")
	public final boolean aBoolean527;

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "Lclient!ih;")
	public final Class159 aClass159_65;

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "I")
	public final int anInt6593;

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "Lclient!ih;")
	public final Class159 aClass159_66;

	@OriginalMember(owner = "client!paa", name = "g", descriptor = "I")
	private final int anInt6595;

	@OriginalMember(owner = "client!paa", name = "i", descriptor = "I")
	public final int anInt6597;

	@OriginalMember(owner = "client!paa", name = "l", descriptor = "Z")
	public final boolean aBoolean528;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(ILclient!ih;I)V")
	public Class261(@OriginalArg(0) int arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(ILclient!ih;Lclient!ih;II)V")
	public Class261(@OriginalArg(0) int arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(2) Class159 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(ILclient!ih;Lclient!ih;IIZZ)V")
	public Class261(@OriginalArg(0) int arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(2) Class159 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt6595 = arg0;
		this.aBoolean527 = arg5;
		this.aClass159_66 = arg2;
		this.aClass159_65 = arg1;
		this.anInt6593 = arg4;
		this.aBoolean528 = arg6;
		this.anInt6597 = arg3;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)I")
	public int method5483() {
		return this.anInt6595;
	}

	@OriginalMember(owner = "client!paa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
