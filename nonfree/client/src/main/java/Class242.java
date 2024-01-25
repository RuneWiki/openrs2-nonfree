import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class242 {

	@OriginalMember(owner = "client!og", name = "k", descriptor = "I")
	public int anInt7574 = Static253.method8218();

	@OriginalMember(owner = "client!og", name = "h", descriptor = "Ljava/lang/String;")
	public String aString85;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "I")
	public int anInt7575;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "Ljava/lang/String;")
	public String aString86;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "Ljava/lang/String;")
	public String aString84;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "Ljava/lang/String;")
	public String aString82;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "I")
	public int anInt7573;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Ljava/lang/String;")
	public String aString83;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "I")
	public int anInt7572;

	@OriginalMember(owner = "client!og", name = "f", descriptor = "I")
	public int anInt7571;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString85 = arg7;
		this.anInt7575 = arg0;
		this.aString86 = arg3;
		this.aString84 = arg4;
		this.aString82 = arg5;
		this.anInt7573 = Static407.anInt7704;
		this.aString83 = arg2;
		this.anInt7572 = arg1;
		this.anInt7571 = arg6;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
	public void method6491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		this.anInt7574 = Static253.method8218();
		this.aString86 = arg3;
		this.aString83 = arg6;
		this.anInt7573 = Static407.anInt7704;
		this.aString84 = arg2;
		this.anInt7575 = arg0;
		this.aString82 = arg4;
		this.aString85 = arg7;
		this.anInt7572 = arg1;
		this.anInt7571 = arg5;
	}
}
