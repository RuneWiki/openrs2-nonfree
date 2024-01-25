import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class372 {

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
	private final int anInt10145;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "Lclient!wha;")
	public final Class369 aClass369_63;

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "Z")
	public final boolean aBoolean747;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "Lclient!wha;")
	public final Class369 aClass369_64;

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
	public final int anInt10147;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
	public final int anInt10149;

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "Z")
	public final boolean aBoolean748;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(ILclient!wha;I)V")
	public Class372(@OriginalArg(0) int arg0, @OriginalArg(1) Class369 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(ILclient!wha;Lclient!wha;II)V")
	public Class372(@OriginalArg(0) int arg0, @OriginalArg(1) Class369 arg1, @OriginalArg(2) Class369 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(ILclient!wha;Lclient!wha;IIZZ)V")
	public Class372(@OriginalArg(0) int arg0, @OriginalArg(1) Class369 arg1, @OriginalArg(2) Class369 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aClass369_64 = arg1;
		this.aClass369_63 = arg2;
		this.anInt10149 = arg4;
		this.aBoolean748 = arg6;
		this.anInt10147 = arg3;
		this.anInt10145 = arg0;
		this.aBoolean747 = arg5;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)I")
	public int method8483() {
		return this.anInt10145;
	}

	@OriginalMember(owner = "client!wj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
