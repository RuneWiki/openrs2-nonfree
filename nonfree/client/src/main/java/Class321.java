import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public final class Class321 {

	@OriginalMember(owner = "client!saa", name = "o", descriptor = "I")
	public int anInt8810 = Static428.method6531();

	@OriginalMember(owner = "client!saa", name = "m", descriptor = "I")
	public int anInt8807 = Static141.anInt8737;

	@OriginalMember(owner = "client!saa", name = "p", descriptor = "Ljava/lang/String;")
	public String aString101;

	@OriginalMember(owner = "client!saa", name = "n", descriptor = "Ljava/lang/String;")
	public String aString102;

	@OriginalMember(owner = "client!saa", name = "l", descriptor = "I")
	public int anInt8803;

	@OriginalMember(owner = "client!saa", name = "g", descriptor = "I")
	public int anInt8809;

	@OriginalMember(owner = "client!saa", name = "k", descriptor = "I")
	public int anInt8804;

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "Ljava/lang/String;")
	public String aString103;

	@OriginalMember(owner = "client!saa", name = "j", descriptor = "Ljava/lang/String;")
	public String aString104;

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "Ljava/lang/String;")
	public String aString105;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString101 = arg7;
		this.aString102 = arg2;
		this.anInt8803 = arg1;
		this.anInt8809 = arg0;
		this.anInt8804 = arg6;
		this.aString103 = arg5;
		this.aString104 = arg4;
		this.aString105 = arg3;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;B)V")
	public void method7713(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) String arg7) {
		this.anInt8810 = Static428.method6531();
		this.aString104 = arg0;
		this.anInt8807 = Static141.anInt8737;
		this.anInt8804 = arg2;
		this.anInt8803 = arg1;
		this.aString105 = arg7;
		this.anInt8809 = arg5;
		this.aString103 = arg6;
		this.aString101 = arg4;
		this.aString102 = arg3;
	}
}
