import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class331 {

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "Lclient!nca;")
	public final Class257 aClass257_63;

	@OriginalMember(owner = "client!rr", name = "C", descriptor = "Z")
	public final boolean aBoolean584;

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
	private final int anInt8678;

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "Z")
	public final boolean aBoolean585;

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
	public final int anInt8680;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "Lclient!nca;")
	public final Class257 aClass257_64;

	@OriginalMember(owner = "client!rr", name = "D", descriptor = "I")
	public final int anInt8681;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(ILclient!nca;I)V")
	public Class331(@OriginalArg(0) int arg0, @OriginalArg(1) Class257 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(ILclient!nca;Lclient!nca;II)V")
	public Class331(@OriginalArg(0) int arg0, @OriginalArg(1) Class257 arg1, @OriginalArg(2) Class257 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(ILclient!nca;Lclient!nca;IIZZ)V")
	public Class331(@OriginalArg(0) int arg0, @OriginalArg(1) Class257 arg1, @OriginalArg(2) Class257 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean585 = arg5;
		this.aBoolean584 = arg6;
		this.aClass257_64 = arg2;
		this.anInt8678 = arg0;
		this.anInt8680 = arg3;
		this.aClass257_63 = arg1;
		this.anInt8681 = arg4;
	}

	@OriginalMember(owner = "client!rr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)I")
	public int method7410() {
		return this.anInt8678;
	}
}
