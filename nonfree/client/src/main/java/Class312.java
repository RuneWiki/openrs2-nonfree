import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class312 {

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
	public int anInt9000 = Static406.method6475();

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "Ljava/lang/String;")
	public String aString102;

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "Ljava/lang/String;")
	public String aString105;

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
	public int anInt8998;

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
	public int anInt8996;

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "Ljava/lang/String;")
	public String aString104;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "Ljava/lang/String;")
	public String aString101;

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "Ljava/lang/String;")
	public String aString103;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
	public int anInt8994;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
	public int anInt8992;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString102 = arg5;
		this.aString105 = arg2;
		this.anInt8998 = Static101.anInt2262;
		this.anInt8996 = arg1;
		this.aString104 = arg4;
		this.aString101 = arg7;
		this.aString103 = arg3;
		this.anInt8994 = arg0;
		this.anInt8992 = arg6;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIIILjava/lang/String;)V")
	public void method7739(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		this.anInt9000 = Static406.method6475();
		this.anInt8992 = arg5;
		this.aString102 = arg1;
		this.anInt8998 = Static101.anInt2262;
		this.aString101 = arg3;
		this.anInt8994 = arg4;
		this.aString105 = arg2;
		this.aString104 = arg0;
		this.anInt8996 = arg6;
		this.aString103 = arg7;
	}
}
