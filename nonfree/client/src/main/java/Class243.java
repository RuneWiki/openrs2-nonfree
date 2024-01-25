import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class243 {

	@OriginalMember(owner = "client!np", name = "g", descriptor = "I")
	public int anInt6129 = Static345.method5015();

	@OriginalMember(owner = "client!np", name = "m", descriptor = "Ljava/lang/String;")
	public String aString87;

	@OriginalMember(owner = "client!np", name = "h", descriptor = "Ljava/lang/String;")
	public String aString85;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "Ljava/lang/String;")
	public String aString86;

	@OriginalMember(owner = "client!np", name = "l", descriptor = "I")
	public int anInt6132;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "I")
	public int anInt6131;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "Ljava/lang/String;")
	public String aString83;

	@OriginalMember(owner = "client!np", name = "f", descriptor = "Ljava/lang/String;")
	public String aString84;

	@OriginalMember(owner = "client!np", name = "i", descriptor = "I")
	public int anInt6130;

	@OriginalMember(owner = "client!np", name = "n", descriptor = "I")
	public int anInt6133;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString87 = arg3;
		this.aString85 = arg7;
		this.aString86 = arg5;
		this.anInt6132 = arg6;
		this.anInt6131 = Static532.anInt8757;
		this.aString83 = arg2;
		this.aString84 = arg4;
		this.anInt6130 = arg1;
		this.anInt6133 = arg0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIBLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public void method5139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		this.anInt6129 = Static345.method5015();
		this.aString83 = arg2;
		this.anInt6130 = arg7;
		this.aString87 = arg6;
		this.anInt6131 = Static532.anInt8757;
		this.anInt6132 = arg0;
		this.anInt6133 = arg1;
		this.aString86 = arg5;
		this.aString85 = arg3;
		this.aString84 = arg4;
	}
}
