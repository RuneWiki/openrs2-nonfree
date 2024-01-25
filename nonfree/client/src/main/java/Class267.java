import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class267 {

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString98;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "J")
	public final long aLong186;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString97;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
	public final int anInt6679;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
	public final int anInt6682;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class267(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString98 = arg3;
		this.aLong186 = arg4;
		this.aString97 = arg1;
		this.anInt6679 = arg2;
		this.anInt6682 = arg0;
	}
}
