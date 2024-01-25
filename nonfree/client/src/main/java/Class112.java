import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class112 {

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
	public int anInt2796 = Static160.method2422();

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "Ljava/lang/String;")
	public String aString47;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "Ljava/lang/String;")
	public String aString46;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
	public int anInt2800;

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
	public int anInt2797;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	public int anInt2795;

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
	public int anInt2794;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "Ljava/lang/String;")
	public String aString48;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString47 = arg7;
		this.aString46 = arg2;
		this.aString45 = arg4;
		this.anInt2800 = arg0;
		this.aString49 = arg5;
		this.anInt2797 = arg1;
		this.anInt2795 = Static235.anInt3998;
		this.anInt2794 = arg6;
		this.aString48 = arg3;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public void method2409(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		this.anInt2796 = Static160.method2422();
		this.aString45 = arg4;
		this.aString49 = arg0;
		this.anInt2795 = Static235.anInt3998;
		this.aString48 = arg7;
		this.anInt2800 = arg3;
		this.anInt2797 = arg2;
		this.aString46 = arg6;
		this.anInt2794 = arg1;
		this.aString47 = arg5;
	}
}
