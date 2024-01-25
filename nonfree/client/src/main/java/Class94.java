import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public final class Class94 {

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "Lclient!kea;")
	private final Class161 aClass161_30;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
	public final int anInt2898;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;)V")
	public Class94(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2) {
		new Class125(64);
		this.aClass161_30 = arg2;
		this.anInt2898 = this.aClass161_30.method4266(15);
	}
}
