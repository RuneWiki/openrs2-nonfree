import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class61 {

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
	public int anInt1921 = Static100.method2146();

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
	public int anInt1922 = Static508.anInt8998;

	@OriginalMember(owner = "client!cw", name = "j", descriptor = "I")
	public int anInt1925;

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
	public int anInt1923;

	@OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
	public int anInt1926;

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "Ljava/lang/String;")
	public String aString17;

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "Ljava/lang/String;")
	public String aString18;

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "Ljava/lang/String;")
	public String aString19;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt1925 = arg0;
		this.aString16 = arg4;
		this.aString15 = arg5;
		this.anInt1923 = arg1;
		this.anInt1926 = arg6;
		this.aString17 = arg2;
		this.aString18 = arg7;
		this.aString19 = arg3;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;II)V")
	public void method1706(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.anInt1921 = Static100.method2146();
		this.anInt1923 = arg7;
		this.aString19 = arg3;
		this.aString16 = arg2;
		this.anInt1922 = Static508.anInt8998;
		this.anInt1926 = arg6;
		this.aString17 = arg5;
		this.aString15 = arg1;
		this.aString18 = arg4;
		this.anInt1925 = arg0;
	}
}
