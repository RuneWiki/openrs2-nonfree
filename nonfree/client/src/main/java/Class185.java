import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public final class Class185 {

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString69;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString68;

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "I")
	public final int anInt4673;

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
	public final int anInt4672;

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "J")
	public final long aLong144;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class185(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString69 = arg3;
		this.aString68 = arg1;
		this.anInt4673 = arg0;
		this.anInt4672 = arg2;
		this.aLong144 = arg4;
	}
}
