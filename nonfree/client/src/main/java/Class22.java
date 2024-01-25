import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class22 {

	@OriginalMember(owner = "client!au", name = "R", descriptor = "[I")
	public static final int[] anIntArray20 = new int[16384];

	@OriginalMember(owner = "client!au", name = "Q", descriptor = "[I")
	public static final int[] anIntArray19 = new int[16384];

	@OriginalMember(owner = "client!au", name = "a", descriptor = "I")
	public final int anInt436;

	@OriginalMember(owner = "client!au", name = "b", descriptor = "Z")
	public final boolean aBoolean25;

	@OriginalMember(owner = "client!au", name = "d", descriptor = "I")
	private final int anInt437;

	@OriginalMember(owner = "client!au", name = "e", descriptor = "I")
	public final int anInt438;

	@OriginalMember(owner = "client!au", name = "f", descriptor = "Lclient!ff;")
	public final Class103 aClass103_1;

	@OriginalMember(owner = "client!au", name = "k", descriptor = "Lclient!ff;")
	public final Class103 aClass103_2;

	static {
		@Pc(284) double local284 = 3.834951969714103E-4D;
		for (@Pc(286) int local286 = 0; local286 < 16384; local286++) {
			anIntArray20[local286] = (int) (Math.sin((double) local286 * local284) * 16384.0D);
			anIntArray19[local286] = (int) (Math.cos(local284 * (double) local286) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(ILclient!ff;I)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, false);
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(ILclient!ff;Lclient!ff;II)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, false);
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(ILclient!ff;Lclient!ff;IIZ)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass103_1 = arg1;
		this.anInt436 = arg3;
		this.aBoolean25 = arg5;
		this.aClass103_2 = arg2;
		this.anInt437 = arg0;
		this.anInt438 = arg4;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)I")
	public int method356() {
		return this.anInt437;
	}

	@OriginalMember(owner = "client!au", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
