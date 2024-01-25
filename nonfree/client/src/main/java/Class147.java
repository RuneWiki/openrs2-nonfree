import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public final class Class147 {

	@OriginalMember(owner = "client!it", name = "f", descriptor = "I")
	public int anInt5475 = Static29.method770();

	@OriginalMember(owner = "client!it", name = "e", descriptor = "I")
	public int anInt5474;

	@OriginalMember(owner = "client!it", name = "h", descriptor = "I")
	public int anInt5476;

	@OriginalMember(owner = "client!it", name = "i", descriptor = "I")
	public int anInt5477;

	@OriginalMember(owner = "client!it", name = "b", descriptor = "Ljava/lang/String;")
	public String aString53;

	@OriginalMember(owner = "client!it", name = "j", descriptor = "Ljava/lang/String;")
	public String aString55;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "Ljava/lang/String;")
	public String aString52;

	@OriginalMember(owner = "client!it", name = "l", descriptor = "Ljava/lang/String;")
	public String aString56;

	@OriginalMember(owner = "client!it", name = "c", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!it", name = "d", descriptor = "I")
	public int anInt5473;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt5474 = arg6;
		this.anInt5476 = Static384.anInt7234;
		this.anInt5477 = arg0;
		this.aString53 = arg2;
		this.aString55 = arg7;
		this.aString52 = arg5;
		this.aString56 = arg4;
		this.aString54 = arg3;
		this.anInt5473 = arg1;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V")
	public void method4484(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt5475 = Static29.method770();
		this.aString52 = arg3;
		this.anInt5473 = arg4;
		this.aString55 = arg1;
		this.aString54 = arg5;
		this.anInt5476 = Static384.anInt7234;
		this.anInt5474 = arg0;
		this.anInt5477 = arg6;
		this.aString56 = arg7;
		this.aString53 = arg2;
	}
}
