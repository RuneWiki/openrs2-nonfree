import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
	public final int anInt1321;

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "J")
	public final long aLong38;

	@OriginalMember(owner = "client!dn", name = "B", descriptor = "I")
	public final int anInt1319;

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
	public int anInt1317;

	@OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
	public final int anInt1318;

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString13;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
	public Class2_Sub13(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1321 = arg2;
		this.aString12 = arg1;
		this.aLong38 = arg4;
		this.anInt1319 = arg6;
		this.anInt1317 = arg3;
		this.anInt1318 = arg5;
		this.aString13 = arg0;
	}
}
