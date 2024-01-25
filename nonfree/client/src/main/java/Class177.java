import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class177 {

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
	public int anInt4988 = Static143.method6945();

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
	public int anInt4984;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Ljava/lang/String;")
	public String aString67;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Ljava/lang/String;")
	public String aString68;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
	public int anInt4985;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	public int anInt4989;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
	public int anInt4990;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString66 = arg7;
		this.anInt4984 = arg6;
		this.aString67 = arg2;
		this.aString65 = arg4;
		this.aString68 = arg3;
		this.anInt4985 = Static305.anInt5560;
		this.anInt4989 = arg1;
		this.aString69 = arg5;
		this.anInt4990 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V")
	public void method4351(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.anInt4988 = Static143.method6945();
		this.anInt4990 = arg7;
		this.aString67 = arg0;
		this.aString68 = arg3;
		this.aString66 = arg2;
		this.aString69 = arg1;
		this.anInt4985 = Static305.anInt5560;
		this.anInt4984 = arg4;
		this.anInt4989 = arg6;
		this.aString65 = arg5;
	}
}
