import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class300 {

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
	public int anInt9038 = Static488.method2077();

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "Ljava/lang/String;")
	public String aString101;

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
	public int anInt9033;

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
	public int anInt9034;

	@OriginalMember(owner = "client!sn", name = "q", descriptor = "Ljava/lang/String;")
	public String aString105;

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "Ljava/lang/String;")
	public String aString104;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Ljava/lang/String;")
	public String aString102;

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
	public int anInt9037;

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
	public int anInt9036;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Ljava/lang/String;")
	public String aString103;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString101 = arg5;
		this.anInt9033 = arg6;
		this.anInt9034 = arg0;
		this.aString105 = arg7;
		this.aString104 = arg2;
		this.aString102 = arg3;
		this.anInt9037 = arg1;
		this.anInt9036 = Static129.anInt10429;
		this.aString103 = arg4;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IBLjava/lang/String;)V")
	public void method7402(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(8) String arg7) {
		this.anInt9038 = Static488.method2077();
		this.aString105 = arg2;
		this.aString101 = arg5;
		this.aString102 = arg0;
		this.aString103 = arg4;
		this.anInt9034 = arg6;
		this.anInt9037 = arg3;
		this.aString104 = arg7;
		this.anInt9036 = Static129.anInt10429;
		this.anInt9033 = arg1;
	}
}
