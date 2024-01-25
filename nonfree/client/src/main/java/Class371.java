import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class371 {

	@OriginalMember(owner = "client!we", name = "m", descriptor = "I")
	public int anInt9993 = Static472.method6988();

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Ljava/lang/String;")
	public String aString101;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Ljava/lang/String;")
	public String aString104;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Ljava/lang/String;")
	public String aString105;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Ljava/lang/String;")
	public String aString102;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	public int anInt9990;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "I")
	public int anInt9991;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "Ljava/lang/String;")
	public String aString103;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	public int anInt9987;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	public int anInt9988;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString101 = arg2;
		this.aString104 = arg5;
		this.aString105 = arg3;
		this.aString102 = arg7;
		this.anInt9990 = Static304.anInt8391;
		this.anInt9991 = arg0;
		this.aString103 = arg4;
		this.anInt9987 = arg1;
		this.anInt9988 = arg6;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
	public void method8485(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.anInt9993 = Static472.method6988();
		this.anInt9987 = arg1;
		this.aString102 = arg2;
		this.anInt9991 = arg6;
		this.aString103 = arg3;
		this.aString104 = arg0;
		this.anInt9990 = Static304.anInt8391;
		this.aString105 = arg4;
		this.anInt9988 = arg7;
		this.aString101 = arg5;
	}
}
