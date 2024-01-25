import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public final class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!dr", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString53;

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "I")
	public final int anInt1410;

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
	public int anInt1409;

	@OriginalMember(owner = "client!dr", name = "s", descriptor = "Ljava/lang/String;")
	public String aString52;

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
	public final int anInt1406;

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
	public final int anInt1405;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "J")
	public final long aLong30;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
	public Class1_Sub12(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aString53 = arg0;
		this.anInt1410 = arg5;
		this.anInt1409 = arg3;
		this.aString52 = arg1;
		this.anInt1406 = arg2;
		this.anInt1405 = arg6;
		this.aLong30 = arg4;
	}
}
