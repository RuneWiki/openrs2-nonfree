import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class141 {

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString38;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "J")
	public final long aLong99;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
	public final int anInt3806;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString39;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
	public final int anInt3807;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class141(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString38 = arg1;
		this.aLong99 = arg4;
		this.anInt3806 = arg2;
		this.aString39 = arg3;
		this.anInt3807 = arg0;
	}
}
