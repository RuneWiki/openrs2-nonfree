import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class102 {

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "J")
	public final long aLong68;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString72;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public final int anInt3364;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
	public final int anInt3366;

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString73;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class102(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aLong68 = arg4;
		this.aString72 = arg1;
		this.anInt3364 = arg2;
		this.anInt3366 = arg0;
		this.aString73 = arg3;
	}
}
