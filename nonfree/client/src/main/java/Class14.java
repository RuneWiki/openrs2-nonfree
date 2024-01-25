import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public final class Class14 {

	@OriginalMember(owner = "client!at", name = "g", descriptor = "Lclient!nl;")
	private final Class171 aClass171_5;

	@OriginalMember(owner = "client!at", name = "i", descriptor = "I")
	public final int anInt384;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;)V")
	public Class14(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		new Class160(64);
		this.aClass171_5 = arg2;
		this.anInt384 = this.aClass171_5.method3750(15);
	}
}
