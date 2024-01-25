import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
	public final int anInt55;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "J")
	public final long aLong7;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString2;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString1;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
	public final int anInt56;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class2(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt55 = arg0;
		this.aLong7 = arg4;
		this.aString2 = arg1;
		this.aString1 = arg3;
		this.anInt56 = arg2;
	}
}
