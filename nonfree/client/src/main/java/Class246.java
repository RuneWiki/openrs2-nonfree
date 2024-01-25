import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class246 {

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
	public final int anInt7036;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString64;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString63;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
	public final int anInt7033;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "J")
	public final long aLong297;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class246(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt7036 = arg0;
		this.aString64 = arg3;
		this.aString63 = arg1;
		this.anInt7033 = arg2;
		this.aLong297 = arg4;
	}
}
