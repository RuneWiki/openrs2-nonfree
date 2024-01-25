import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class295 {

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
	public int anInt8435 = Static252.method3530();

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "Ljava/lang/String;")
	public String aString84;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "Ljava/lang/String;")
	public String aString85;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "Ljava/lang/String;")
	public String aString87;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	public int anInt8437;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
	public int anInt8439;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Ljava/lang/String;")
	public String aString86;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "Ljava/lang/String;")
	public String aString88;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
	public int anInt8440;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
	public int anInt8433;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString84 = arg7;
		this.aString85 = arg4;
		this.aString87 = arg5;
		this.anInt8437 = arg0;
		this.anInt8439 = Static421.anInt7434;
		this.aString86 = arg3;
		this.aString88 = arg2;
		this.anInt8440 = arg6;
		this.anInt8433 = arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public void method7179(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(8) String arg7) {
		this.anInt8435 = Static252.method3530();
		this.aString87 = arg6;
		this.anInt8437 = arg4;
		this.aString86 = arg5;
		this.anInt8440 = arg0;
		this.aString88 = arg1;
		this.aString85 = arg3;
		this.aString84 = arg7;
		this.anInt8439 = Static421.anInt7434;
		this.anInt8433 = arg2;
	}
}
