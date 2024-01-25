import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class14 {

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
	public int anInt405 = Static153.method2801();

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
	public int anInt406;

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
	public int anInt409;

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
	public int anInt408;

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "Ljava/lang/String;")
	public String aString13;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
	public int anInt407;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6) {
		this.anInt406 = arg1;
		this.anInt409 = Static481.anInt8318;
		this.anInt408 = arg5;
		this.aString13 = arg6;
		this.anInt407 = arg0;
		this.aString10 = arg3;
		this.aString12 = arg4;
		this.aString11 = arg2;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;BLjava/lang/String;ILjava/lang/String;)V")
	public void method533(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		this.anInt405 = Static153.method2801();
		this.anInt408 = arg5;
		this.aString11 = arg3;
		this.anInt406 = arg1;
		this.aString13 = arg6;
		this.aString12 = arg4;
		this.aString10 = arg0;
		this.anInt407 = arg2;
		this.anInt409 = Static481.anInt8318;
	}
}
