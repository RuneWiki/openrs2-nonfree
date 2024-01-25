import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public final class Class99 {

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
	public final int anInt2734;

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "J")
	public final long aLong83;

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString34;

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString35;

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
	public final int anInt2735;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class99(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt2734 = arg2;
		this.aLong83 = arg4;
		this.aString34 = arg1;
		this.aString35 = arg3;
		this.anInt2735 = arg0;
	}
}
