import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class294 {

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString85;

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
	public final int anInt7781;

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "J")
	public final long aLong198;

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString86;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	public final int anInt7777;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class294(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString85 = arg3;
		this.anInt7781 = arg2;
		this.aLong198 = arg4;
		this.aString86 = arg1;
		this.anInt7777 = arg0;
	}
}
