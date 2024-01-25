import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public final class Class102 {

	@OriginalMember(owner = "client!fea", name = "g", descriptor = "I")
	public final int anInt2766;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "J")
	public final long aLong49;

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
	public final int anInt2764;

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString23;

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString24;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class102(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt2766 = arg2;
		this.aLong49 = arg4;
		this.anInt2764 = arg0;
		this.aString23 = arg1;
		this.aString24 = arg3;
	}
}
