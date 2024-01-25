import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class3_Sub26 extends Class3 {

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "J")
	public final long aLong100;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
	public final int anInt2737;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "Ljava/lang/String;")
	public String aString103;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	public int anInt2734;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString102;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
	public final int anInt2735;

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
	public final int anInt2736;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
	public Class3_Sub26(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aLong100 = arg4;
		this.anInt2737 = arg5;
		this.aString103 = arg1;
		this.anInt2734 = arg3;
		this.aString102 = arg0;
		this.anInt2735 = arg2;
		this.anInt2736 = arg6;
	}
}
