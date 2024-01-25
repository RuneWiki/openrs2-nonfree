import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class98 {

	@OriginalMember(owner = "client!er", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString19;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString18;

	@OriginalMember(owner = "client!er", name = "b", descriptor = "I")
	public final int anInt2850;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "I")
	public final int anInt2849;

	@OriginalMember(owner = "client!er", name = "i", descriptor = "J")
	public final long aLong78;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class98(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString19 = arg3;
		this.aString18 = arg1;
		this.anInt2850 = arg0;
		this.anInt2849 = arg2;
		this.aLong78 = arg4;
	}
}
