import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class30 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	public int anInt536 = Static35.method583();

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "Ljava/lang/String;")
	public String aString13;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	public int anInt535;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	public int anInt534;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Ljava/lang/String;")
	public String aString14;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	public int anInt532;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	public int anInt537;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString13 = arg5;
		this.anInt535 = arg0;
		this.anInt534 = arg6;
		this.aString12 = arg7;
		this.aString14 = arg4;
		this.aString11 = arg2;
		this.anInt532 = arg1;
		this.aString10 = arg3;
		this.anInt537 = Static530.anInt9105;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V")
	public void method573(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		this.anInt536 = Static35.method583();
		this.anInt537 = Static530.anInt9105;
		this.anInt532 = arg6;
		this.aString13 = arg3;
		this.aString11 = arg1;
		this.anInt535 = arg0;
		this.aString14 = arg2;
		this.aString10 = arg4;
		this.anInt534 = arg5;
		this.aString12 = arg7;
	}
}
