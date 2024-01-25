import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public final class Class105 {

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "I")
	public final int anInt3145;

	@OriginalMember(owner = "client!ffa", name = "l", descriptor = "I")
	public final int anInt3151;

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString24;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "J")
	public final long aLong72;

	@OriginalMember(owner = "client!ffa", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString25;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class105(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt3145 = arg0;
		this.anInt3151 = arg2;
		this.aString24 = arg3;
		this.aLong72 = arg4;
		this.aString25 = arg1;
	}
}
