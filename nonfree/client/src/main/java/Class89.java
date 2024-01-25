import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public final class Class89 {

	@OriginalMember(owner = "client!eja", name = "f", descriptor = "I")
	public int anInt2745 = Static464.method6729();

	@OriginalMember(owner = "client!eja", name = "l", descriptor = "Ljava/lang/String;")
	public String aString27;

	@OriginalMember(owner = "client!eja", name = "d", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!eja", name = "o", descriptor = "I")
	public int anInt2749;

	@OriginalMember(owner = "client!eja", name = "h", descriptor = "I")
	public int anInt2746;

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!eja", name = "i", descriptor = "I")
	public int anInt2747;

	@OriginalMember(owner = "client!eja", name = "j", descriptor = "Ljava/lang/String;")
	public String aString26;

	@OriginalMember(owner = "client!eja", name = "k", descriptor = "I")
	public int anInt2748;

	@OriginalMember(owner = "client!eja", name = "e", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString27 = arg3;
		this.aString24 = arg4;
		this.anInt2749 = arg0;
		this.anInt2746 = arg1;
		this.aString23 = arg2;
		this.anInt2747 = Static588.anInt9467;
		this.aString26 = arg7;
		this.anInt2748 = arg6;
		this.aString25 = arg5;
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;BILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public void method2519(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		this.anInt2745 = Static464.method6729();
		this.anInt2749 = arg1;
		this.anInt2747 = Static588.anInt9467;
		this.aString24 = arg7;
		this.anInt2746 = arg6;
		this.aString23 = arg5;
		this.aString26 = arg2;
		this.anInt2748 = arg3;
		this.aString25 = arg0;
		this.aString27 = arg4;
	}
}
