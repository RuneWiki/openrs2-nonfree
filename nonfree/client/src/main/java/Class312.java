import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public final class Class312 {

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
	public final int anInt8307;

	@OriginalMember(owner = "client!taa", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString90;

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString89;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "J")
	public final long aLong227;

	@OriginalMember(owner = "client!taa", name = "f", descriptor = "I")
	public final int anInt8309;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class312(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt8307 = arg2;
		this.aString90 = arg3;
		this.aString89 = arg1;
		this.aLong227 = arg4;
		this.anInt8309 = arg0;
	}
}
