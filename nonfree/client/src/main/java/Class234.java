import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public final class Class234 {

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString76;

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
	public final int anInt7462;

	@OriginalMember(owner = "client!oba", name = "g", descriptor = "J")
	public final long aLong185;

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "I")
	public final int anInt7464;

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString75;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class234(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString76 = arg1;
		this.anInt7462 = arg2;
		this.aLong185 = arg4;
		this.anInt7464 = arg0;
		this.aString75 = arg3;
	}
}
