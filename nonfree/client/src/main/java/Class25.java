import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class25 {

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	public int anInt723 = Static611.method8223();

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	public int anInt720;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
	public int anInt725;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	public int anInt721;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public int anInt718;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Ljava/lang/String;")
	public String aString6;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString4 = arg5;
		this.aString5 = arg3;
		this.aString3 = arg4;
		this.anInt720 = Static262.anInt5597;
		this.anInt725 = arg0;
		this.anInt721 = arg6;
		this.anInt718 = arg1;
		this.aString7 = arg7;
		this.aString6 = arg2;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
	public void method575(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.anInt723 = Static611.method8223();
		this.anInt720 = Static262.anInt5597;
		this.aString6 = arg3;
		this.aString4 = arg2;
		this.anInt725 = arg1;
		this.anInt718 = arg6;
		this.anInt721 = arg7;
		this.aString7 = arg5;
		this.aString5 = arg0;
		this.aString3 = arg4;
	}
}
