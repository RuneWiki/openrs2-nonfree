import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Class2_Sub35 extends Class2 {

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
	public final int anInt5877;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
	public final int anInt5876;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString60;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "J")
	public final long aLong299;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
	public final int anInt5878;

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
	public final int anInt5881;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Z")
	public final boolean aBoolean414;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "Ljava/lang/String;")
	public String aString61;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
	public int anInt5875;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Z")
	public final boolean aBoolean413;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class2_Sub35(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt5877 = arg6;
		this.anInt5876 = arg2;
		this.aString60 = arg0;
		this.aLong299 = arg5;
		this.anInt5878 = arg4;
		this.anInt5881 = arg7;
		this.aBoolean414 = arg9;
		this.aString61 = arg1;
		this.anInt5875 = arg3;
		this.aBoolean413 = arg8;
	}
}
