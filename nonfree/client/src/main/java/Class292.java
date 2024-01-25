import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class292 {

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
	public int anInt7893 = Static101.method1649();

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "Ljava/lang/String;")
	public String aString92;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Ljava/lang/String;")
	public String aString93;

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "Ljava/lang/String;")
	public String aString95;

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
	public int anInt7895;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
	public int anInt7889;

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
	public int anInt7896;

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "Ljava/lang/String;")
	public String aString96;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
	public int anInt7894;

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "Ljava/lang/String;")
	public String aString94;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString92 = arg7;
		this.aString93 = arg5;
		this.aString95 = arg3;
		this.anInt7895 = arg6;
		this.anInt7889 = Static358.anInt6263;
		this.anInt7896 = arg0;
		this.aString96 = arg2;
		this.anInt7894 = arg1;
		this.aString94 = arg4;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;BIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public void method6522(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		this.anInt7893 = Static101.method1649();
		this.anInt7896 = arg2;
		this.aString95 = arg3;
		this.aString96 = arg7;
		this.anInt7894 = arg1;
		this.anInt7889 = Static358.anInt6263;
		this.aString94 = arg0;
		this.anInt7895 = arg6;
		this.aString93 = arg4;
		this.aString92 = arg5;
	}
}
