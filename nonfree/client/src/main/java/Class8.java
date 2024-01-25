import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public final class Class8 {

	@OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
	public int anInt221 = Static25.method1670();

	@OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
	public int anInt222;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!ada", name = "l", descriptor = "I")
	public int anInt220;

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
	public int anInt215;

	@OriginalMember(owner = "client!ada", name = "h", descriptor = "Ljava/lang/String;")
	public String aString6;

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
	public int anInt217;

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6) {
		this.anInt222 = arg5;
		this.aString4 = arg4;
		this.anInt220 = arg0;
		this.anInt215 = Static115.anInt2326;
		this.aString6 = arg3;
		this.anInt217 = arg1;
		this.aString5 = arg6;
		this.aString7 = arg2;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;BILjava/lang/String;Ljava/lang/String;)V")
	public void method377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6) {
		this.anInt221 = Static25.method1670();
		this.aString4 = arg2;
		this.aString6 = arg3;
		this.anInt215 = Static115.anInt2326;
		this.anInt220 = arg0;
		this.aString7 = arg5;
		this.aString5 = arg6;
		this.anInt222 = arg4;
		this.anInt217 = arg1;
	}
}
