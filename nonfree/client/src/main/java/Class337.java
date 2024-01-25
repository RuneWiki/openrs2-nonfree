import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class337 {

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
	public int anInt9226 = Static333.method5066();

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
	public int anInt9230;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "Ljava/lang/String;")
	public String aString90;

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "Ljava/lang/String;")
	public String aString92;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
	public int anInt9232;

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "Ljava/lang/String;")
	public String aString93;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
	public int anInt9225;

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
	public int anInt9231;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "Ljava/lang/String;")
	public String aString91;

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "Ljava/lang/String;")
	public String aString94;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt9230 = arg0;
		this.aString90 = arg7;
		this.aString92 = arg4;
		this.anInt9232 = arg1;
		this.aString93 = arg5;
		this.anInt9225 = arg6;
		this.anInt9231 = Static389.anInt6694;
		this.aString91 = arg2;
		this.aString94 = arg3;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public void method7859(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		this.anInt9226 = Static333.method5066();
		this.anInt9230 = arg2;
		this.aString92 = arg4;
		this.anInt9225 = arg1;
		this.anInt9231 = Static389.anInt6694;
		this.anInt9232 = arg5;
		this.aString91 = arg7;
		this.aString90 = arg3;
		this.aString93 = arg6;
		this.aString94 = arg0;
	}
}
