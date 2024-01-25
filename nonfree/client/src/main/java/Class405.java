import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class405 {

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
	public int anInt10905 = Static536.method7524();

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "Ljava/lang/String;")
	public String aString131;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
	public int anInt10901;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "Ljava/lang/String;")
	public String aString129;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
	public int anInt10904;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "Ljava/lang/String;")
	public String aString128;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
	public int anInt10902;

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
	public int anInt10908;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Ljava/lang/String;")
	public String aString132;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "Ljava/lang/String;")
	public String aString130;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString131 = arg3;
		this.anInt10901 = arg1;
		this.aString129 = arg5;
		this.anInt10904 = arg0;
		this.aString128 = arg2;
		this.anInt10902 = arg6;
		this.anInt10908 = Static528.anInt8386;
		this.aString132 = arg7;
		this.aString130 = arg4;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
	public void method9517(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		this.anInt10905 = Static536.method7524();
		this.aString131 = arg7;
		this.aString130 = arg0;
		this.aString132 = arg3;
		this.anInt10901 = arg4;
		this.anInt10902 = arg2;
		this.aString128 = arg1;
		this.anInt10904 = arg5;
		this.aString129 = arg6;
		this.anInt10908 = Static528.anInt8386;
	}
}
