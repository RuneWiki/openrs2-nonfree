import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public final class Class12 {

	@OriginalMember(owner = "client!aha", name = "l", descriptor = "I")
	public int anInt266 = Static312.method4751();

	@OriginalMember(owner = "client!aha", name = "j", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!aha", name = "i", descriptor = "I")
	public int anInt263;

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!aha", name = "k", descriptor = "I")
	public int anInt265;

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!aha", name = "m", descriptor = "I")
	public int anInt262;

	@OriginalMember(owner = "client!aha", name = "n", descriptor = "I")
	public int anInt264;

	@OriginalMember(owner = "client!aha", name = "h", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString4 = arg2;
		this.anInt263 = arg1;
		this.aString3 = arg4;
		this.anInt265 = Static44.anInt740;
		this.aString2 = arg3;
		this.anInt262 = arg6;
		this.anInt264 = arg0;
		this.aString1 = arg5;
		this.aString5 = arg7;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;B)V")
	public void method257(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt266 = Static312.method4751();
		this.aString3 = arg0;
		this.anInt265 = Static44.anInt740;
		this.aString1 = arg7;
		this.anInt263 = arg1;
		this.anInt264 = arg5;
		this.aString4 = arg4;
		this.aString5 = arg2;
		this.anInt262 = arg6;
		this.aString2 = arg3;
	}
}
