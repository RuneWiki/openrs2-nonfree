import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class309 {

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public int anInt8998 = Static123.method2250();

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	public int anInt8992;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "Ljava/lang/String;")
	public String aString106;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "Ljava/lang/String;")
	public String aString105;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
	public int anInt8994;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	public int anInt8999;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
	public int anInt8993;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Ljava/lang/String;")
	public String aString102;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Ljava/lang/String;")
	public String aString104;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Ljava/lang/String;")
	public String aString103;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt8992 = arg6;
		this.aString106 = arg2;
		this.aString105 = arg4;
		this.anInt8994 = arg0;
		this.anInt8999 = arg1;
		this.anInt8993 = Static62.anInt1184;
		this.aString102 = arg5;
		this.aString104 = arg7;
		this.aString103 = arg3;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
	public void method7899(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		this.anInt8998 = Static123.method2250();
		this.aString106 = arg0;
		this.anInt8993 = Static62.anInt1184;
		this.anInt8994 = arg5;
		this.anInt8999 = arg4;
		this.aString104 = arg6;
		this.aString103 = arg3;
		this.aString102 = arg1;
		this.anInt8992 = arg2;
		this.aString105 = arg7;
	}
}
