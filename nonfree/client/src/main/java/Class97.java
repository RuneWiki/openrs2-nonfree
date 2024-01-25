import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class Class97 {

	@OriginalMember(owner = "client!em", name = "l", descriptor = "I")
	public int anInt2502 = Static217.method3244();

	@OriginalMember(owner = "client!em", name = "j", descriptor = "I")
	public int anInt2500;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "Ljava/lang/String;")
	public String aString19;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	public int anInt2497;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "Ljava/lang/String;")
	public String aString18;

	@OriginalMember(owner = "client!em", name = "m", descriptor = "I")
	public int anInt2503;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "Ljava/lang/String;")
	public String aString17;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "I")
	public int anInt2498;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "Ljava/lang/String;")
	public String aString20;

	@OriginalMember(owner = "client!em", name = "n", descriptor = "Ljava/lang/String;")
	public String aString21;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class97(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt2500 = arg1;
		this.aString19 = arg3;
		this.anInt2497 = arg0;
		this.aString18 = arg2;
		this.anInt2503 = Static177.anInt3088;
		this.aString17 = arg5;
		this.anInt2498 = arg6;
		this.aString20 = arg7;
		this.aString21 = arg4;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;BI)V")
	public void method2409(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(8) int arg7) {
		this.anInt2502 = Static217.method3244();
		this.anInt2497 = arg4;
		this.aString18 = arg5;
		this.anInt2500 = arg7;
		this.aString17 = arg2;
		this.aString19 = arg1;
		this.anInt2498 = arg0;
		this.anInt2503 = Static177.anInt3088;
		this.aString21 = arg6;
		this.aString20 = arg3;
	}
}
