import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class83 {

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
	public int anInt2437 = Static217.method3478();

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "Ljava/lang/String;")
	public String aString42;

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
	public int anInt2435;

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "Ljava/lang/String;")
	public String aString43;

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
	public int anInt2439;

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
	public int anInt2433;

	@OriginalMember(owner = "client!dw", name = "r", descriptor = "Ljava/lang/String;")
	public String aString40;

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "Ljava/lang/String;")
	public String aString39;

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
	public int anInt2432;

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "Ljava/lang/String;")
	public String aString41;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString42 = arg7;
		this.anInt2435 = arg6;
		this.aString43 = arg2;
		this.anInt2439 = arg1;
		this.anInt2433 = Static269.anInt4883;
		this.aString40 = arg3;
		this.aString39 = arg4;
		this.anInt2432 = arg0;
		this.aString41 = arg5;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public void method2163(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		this.anInt2437 = Static217.method3478();
		this.anInt2433 = Static269.anInt4883;
		this.anInt2432 = arg0;
		this.aString39 = arg2;
		this.aString40 = arg3;
		this.aString43 = arg4;
		this.aString42 = arg6;
		this.anInt2435 = arg1;
		this.anInt2439 = arg5;
		this.aString41 = arg7;
	}
}
