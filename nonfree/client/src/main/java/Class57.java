import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class57 {

	@OriginalMember(owner = "client!de", name = "o", descriptor = "I")
	public int anInt1581 = Static30.method578();

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Ljava/lang/String;")
	public String aString17;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "I")
	public int anInt1580;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	public int anInt1578;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	public int anInt1577;

	@OriginalMember(owner = "client!de", name = "n", descriptor = "Ljava/lang/String;")
	public String aString20;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Ljava/lang/String;")
	public String aString19;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "Ljava/lang/String;")
	public String aString18;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "I")
	public int anInt1574;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString16 = arg7;
		this.aString17 = arg3;
		this.anInt1580 = arg1;
		this.anInt1578 = arg0;
		this.anInt1577 = arg6;
		this.aString20 = arg5;
		this.aString19 = arg2;
		this.aString18 = arg4;
		this.anInt1574 = Static518.anInt9331;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public void method1365(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		this.anInt1581 = Static30.method578();
		this.aString20 = arg0;
		this.aString17 = arg5;
		this.anInt1574 = Static518.anInt9331;
		this.aString16 = arg7;
		this.aString18 = arg4;
		this.anInt1577 = arg6;
		this.anInt1580 = arg1;
		this.anInt1578 = arg3;
		this.aString19 = arg2;
	}
}
