import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public final class Class315 {

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
	public int anInt9390 = Static132.method2517();

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
	public int anInt9388;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "Ljava/lang/String;")
	public String aString211;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "Ljava/lang/String;")
	public String aString210;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
	public int anInt9394;

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "Ljava/lang/String;")
	public String aString212;

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "Ljava/lang/String;")
	public String aString213;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
	public int anInt9391;

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
	public int anInt9395;

	static {
		new Class45("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6) {
		this.anInt9388 = arg5;
		this.aString211 = arg2;
		this.aString210 = arg3;
		this.anInt9394 = arg0;
		this.aString212 = arg6;
		this.aString213 = arg4;
		this.anInt9391 = arg1;
		this.anInt9395 = Static445.anInt7791;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
	public void method8098(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		this.anInt9390 = Static132.method2517();
		this.aString210 = arg5;
		this.aString213 = arg3;
		this.anInt9388 = arg4;
		this.anInt9391 = arg6;
		this.aString212 = arg0;
		this.anInt9395 = Static445.anInt7791;
		this.aString211 = arg2;
		this.anInt9394 = arg1;
	}
}
