import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public final class Class385 {

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString118;

	@OriginalMember(owner = "client!waa", name = "g", descriptor = "J")
	public final long aLong301;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString119;

	@OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
	public final int anInt10668;

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "I")
	public final int anInt10669;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class385(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString118 = arg1;
		this.aLong301 = arg4;
		this.aString119 = arg3;
		this.anInt10668 = arg0;
		this.anInt10669 = arg2;
	}
}
