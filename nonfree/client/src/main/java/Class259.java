import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class259 {

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	public final int anInt7313;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Z")
	public final boolean aBoolean631;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
	private final int anInt7314;

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!cb;")
	public final Class52 aClass52_63;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "Lclient!cb;")
	public final Class52 aClass52_64;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
	public final int anInt7316;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Z")
	public final boolean aBoolean632;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(ILclient!cb;Lclient!cb;II)V")
	public Class259(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) Class52 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(ILclient!cb;I)V")
	public Class259(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(ILclient!cb;Lclient!cb;IIZZ)V")
	public Class259(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) Class52 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean632 = arg6;
		this.aClass52_64 = arg2;
		this.anInt7316 = arg3;
		this.aBoolean631 = arg5;
		this.anInt7313 = arg4;
		this.anInt7314 = arg0;
		this.aClass52_63 = arg1;
	}

	@OriginalMember(owner = "client!ob", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)I")
	public int method6132() {
		return this.anInt7314;
	}
}
