import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class31 {

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
	public int anInt1199 = Static12.method9559();

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Ljava/lang/String;")
	public String aString13;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	public int anInt1201;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "Ljava/lang/String;")
	public String aString14;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
	public int anInt1197;

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
	public int anInt1195;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
	public int anInt1198;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Ljava/lang/String;")
	public String aString17;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString13 = arg7;
		this.anInt1201 = arg1;
		this.aString14 = arg2;
		this.aString16 = arg4;
		this.anInt1197 = arg6;
		this.anInt1195 = Static716.anInt11157;
		this.anInt1198 = arg0;
		this.aString17 = arg3;
		this.aString15 = arg5;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;BI)V")
	public void method1130(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(8) int arg7) {
		this.anInt1199 = Static12.method9559();
		this.aString13 = arg5;
		this.aString15 = arg6;
		this.anInt1201 = arg1;
		this.anInt1195 = Static716.anInt11157;
		this.anInt1198 = arg2;
		this.aString14 = arg0;
		this.anInt1197 = arg7;
		this.aString17 = arg4;
		this.aString16 = arg3;
	}
}
