import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public final class Class68 {

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString31;

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "J")
	public final long aLong62;

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString30;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
	public final int anInt2182;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
	public final int anInt2183;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class68(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString31 = arg1;
		this.aLong62 = arg4;
		this.aString30 = arg3;
		this.anInt2182 = arg0;
		this.anInt2183 = arg2;
	}
}
