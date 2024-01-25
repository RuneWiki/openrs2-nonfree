import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public final class Class374 {

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
	public int anInt10393 = Static118.method2229();

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
	public int anInt10398;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "Ljava/lang/String;")
	public String aString108;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "Ljava/lang/String;")
	public String aString112;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Ljava/lang/String;")
	public String aString110;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "Ljava/lang/String;")
	public String aString109;

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
	public int anInt10402;

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "Ljava/lang/String;")
	public String aString111;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
	public int anInt10400;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
	public int anInt10397;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt10398 = arg6;
		this.aString108 = arg5;
		this.aString112 = arg2;
		this.aString110 = arg3;
		this.aString109 = arg7;
		this.anInt10402 = arg1;
		this.aString111 = arg4;
		this.anInt10400 = arg0;
		this.anInt10397 = Static26.anInt350;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V")
	public void method8645(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		this.anInt10393 = Static118.method2229();
		this.anInt10400 = arg2;
		this.anInt10397 = Static26.anInt350;
		this.anInt10402 = arg4;
		this.aString108 = arg1;
		this.anInt10398 = arg7;
		this.aString110 = arg3;
		this.aString111 = arg6;
		this.aString112 = arg5;
		this.aString109 = arg0;
	}
}
