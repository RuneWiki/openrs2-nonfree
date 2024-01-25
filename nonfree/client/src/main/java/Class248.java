import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Class248 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Lclient!an;")
	private final Class16 aClass16_92;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public final int anInt7441;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;)V")
	public Class248(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		new Class125(64);
		this.aClass16_92 = arg2;
		this.anInt7441 = this.aClass16_92.method399(15);
	}
}
