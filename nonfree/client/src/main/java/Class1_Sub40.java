import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class1_Sub40 extends Class1 {

	@OriginalMember(owner = "client!se", name = "m", descriptor = "I")
	public int anInt5411;

	@OriginalMember(owner = "client!se", name = "w", descriptor = "J")
	public final long aLong172;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "I")
	public final int anInt5413;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "I")
	public final int anInt5414;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "Ljava/lang/String;")
	public String aString63;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "Z")
	public final boolean aBoolean510;

	@OriginalMember(owner = "client!se", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString62;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "I")
	public final int anInt5412;

	@OriginalMember(owner = "client!se", name = "y", descriptor = "I")
	public final int anInt5416;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "Z")
	public final boolean aBoolean509;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class1_Sub40(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt5411 = arg3;
		this.aLong172 = arg5;
		this.anInt5413 = arg7;
		this.anInt5414 = arg6;
		this.aString63 = arg1;
		this.aBoolean510 = arg9;
		this.aString62 = arg0;
		this.anInt5412 = arg4;
		this.anInt5416 = arg2;
		this.aBoolean509 = arg8;
	}
}
