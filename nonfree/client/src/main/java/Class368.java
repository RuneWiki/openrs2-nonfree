import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class Class368 {

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
	public int anInt10123 = Static370.method5583();

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
	public int anInt10128;

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "Ljava/lang/String;")
	public String aString106;

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
	public int anInt10126;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "Ljava/lang/String;")
	public String aString103;

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "Ljava/lang/String;")
	public String aString105;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
	public int anInt10125;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "Ljava/lang/String;")
	public String aString107;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
	public int anInt10122;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "Ljava/lang/String;")
	public String aString104;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt10128 = arg6;
		this.aString106 = arg2;
		this.anInt10126 = Static325.anInt5888;
		this.aString103 = arg7;
		this.aString105 = arg3;
		this.anInt10125 = arg1;
		this.aString107 = arg4;
		this.anInt10122 = arg0;
		this.aString104 = arg5;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
	public void method8470(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt10123 = Static370.method5583();
		this.anInt10126 = Static325.anInt5888;
		this.anInt10128 = arg0;
		this.anInt10125 = arg2;
		this.aString105 = arg3;
		this.aString104 = arg4;
		this.aString106 = arg1;
		this.anInt10122 = arg6;
		this.aString107 = arg5;
		this.aString103 = arg7;
	}
}
