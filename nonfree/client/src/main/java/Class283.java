import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public final class Class283 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
	public int anInt7990 = Static217.method3474();

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "Ljava/lang/String;")
	public String aString68;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "Ljava/lang/String;")
	public String aString67;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
	public int anInt7994;

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
	public int anInt7993;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!rq", name = "l", descriptor = "I")
	public int anInt7995;

	@OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
	public int anInt7996;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString68 = arg3;
		this.aString67 = arg5;
		this.aString66 = arg4;
		this.anInt7994 = arg6;
		this.aString69 = arg7;
		this.anInt7993 = arg1;
		this.aString65 = arg2;
		this.anInt7995 = arg0;
		this.anInt7996 = Static363.anInt6671;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V")
	public void method6355(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		this.anInt7990 = Static217.method3474();
		this.aString68 = arg3;
		this.aString67 = arg1;
		this.anInt7994 = arg0;
		this.anInt7995 = arg6;
		this.anInt7993 = arg2;
		this.aString65 = arg4;
		this.aString66 = arg5;
		this.anInt7996 = Static363.anInt6671;
		this.aString69 = arg7;
	}
}
