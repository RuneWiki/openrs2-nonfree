import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public final class Class72 {

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString29;

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString28;

	@OriginalMember(owner = "client!dca", name = "g", descriptor = "I")
	public final int anInt1975;

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "J")
	public final long aLong51;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
	public final int anInt1973;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class72(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString29 = arg3;
		this.aString28 = arg1;
		this.anInt1975 = arg0;
		this.aLong51 = arg4;
		this.anInt1973 = arg2;
	}
}
