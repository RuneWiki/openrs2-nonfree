import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class291 {

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "Lclient!cn;")
	public final Class58 aClass58_64;

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "Z")
	public final boolean aBoolean658;

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
	private final int anInt7916;

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
	public final int anInt7917;

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
	public final int anInt7918;

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "Z")
	public final boolean aBoolean659;

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "Lclient!cn;")
	public final Class58 aClass58_65;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(ILclient!cn;I)V")
	public Class291(@OriginalArg(0) int arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(ILclient!cn;Lclient!cn;II)V")
	public Class291(@OriginalArg(0) int arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(ILclient!cn;Lclient!cn;IIZZ)V")
	public Class291(@OriginalArg(0) int arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt7918 = arg3;
		this.anInt7917 = arg4;
		this.aClass58_64 = arg1;
		this.aBoolean659 = arg6;
		this.aClass58_65 = arg2;
		this.anInt7916 = arg0;
		this.aBoolean658 = arg5;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)I")
	public int method6904() {
		return this.anInt7916;
	}

	@OriginalMember(owner = "client!qo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
