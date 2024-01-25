import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public final class Class295 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	public int anInt8174 = Static453.method6458();

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	public int anInt8176;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Ljava/lang/String;")
	public String aString92;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
	public int anInt8180;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	public int anInt8178;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Ljava/lang/String;")
	public String aString88;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Ljava/lang/String;")
	public String aString91;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	public int anInt8179;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Ljava/lang/String;")
	public String aString90;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Ljava/lang/String;")
	public String aString89;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt8176 = arg6;
		this.aString92 = arg2;
		this.anInt8180 = arg1;
		this.anInt8178 = arg0;
		this.aString88 = arg3;
		this.aString91 = arg7;
		this.anInt8179 = Static412.anInt575;
		this.aString90 = arg4;
		this.aString89 = arg5;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;)V")
	public void method6773(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) String arg7) {
		this.anInt8174 = Static453.method6458();
		this.anInt8178 = arg4;
		this.anInt8176 = arg6;
		this.anInt8179 = Static412.anInt575;
		this.aString89 = arg0;
		this.aString90 = arg7;
		this.aString91 = arg1;
		this.aString88 = arg3;
		this.anInt8180 = arg5;
		this.aString92 = arg2;
	}
}
