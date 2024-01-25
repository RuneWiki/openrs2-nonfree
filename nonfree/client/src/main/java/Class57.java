import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class57 {

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	public int anInt2176 = Static11.method157();

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "Ljava/lang/String;")
	public String aString21;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
	public int anInt2175;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "Ljava/lang/String;")
	public String aString20;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
	public int anInt2177;

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "Ljava/lang/String;")
	public String aString22;

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
	public int anInt2178;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
	public int anInt2180;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString21 = arg5;
		this.anInt2175 = arg6;
		this.aString20 = arg3;
		this.anInt2177 = arg0;
		this.aString22 = arg2;
		this.anInt2178 = arg1;
		this.aString24 = arg4;
		this.anInt2180 = Static435.anInt8192;
		this.aString23 = arg7;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;BIILjava/lang/String;Ljava/lang/String;I)V")
	public void method1880(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		this.anInt2176 = Static11.method157();
		this.anInt2177 = arg4;
		this.anInt2180 = Static435.anInt8192;
		this.anInt2175 = arg7;
		this.anInt2178 = arg3;
		this.aString23 = arg5;
		this.aString20 = arg0;
		this.aString24 = arg2;
		this.aString22 = arg1;
		this.aString21 = arg6;
	}
}
