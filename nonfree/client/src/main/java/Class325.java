import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class325 {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Lclient!fh;")
	public final Class101 aClass101_62;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "Lclient!fh;")
	public final Class101 aClass101_63;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	public final int anInt9605;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	public final int anInt9607;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	private final int anInt9608;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Z")
	public final boolean aBoolean800;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "Z")
	public final boolean aBoolean801;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(ILclient!fh;I)V")
	public Class325(@OriginalArg(0) int arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(ILclient!fh;Lclient!fh;II)V")
	public Class325(@OriginalArg(0) int arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) Class101 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(ILclient!fh;Lclient!fh;IIZZ)V")
	public Class325(@OriginalArg(0) int arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) Class101 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt9607 = arg4;
		this.anInt9605 = arg3;
		this.aBoolean801 = arg6;
		this.anInt9608 = arg0;
		this.aBoolean800 = arg5;
		this.aClass101_62 = arg1;
		this.aClass101_63 = arg2;
	}

	@OriginalMember(owner = "client!uf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)I")
	public int method7780() {
		return this.anInt9608;
	}
}
