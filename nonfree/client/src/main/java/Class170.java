import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class170 {

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Lclient!dc;")
	public Class37 aClass37_1;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public int anInt5233;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(II)V")
	public Class170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass37_1 = Static268.method4238(arg0);
		this.anInt5233 = arg1;
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!dc;I)V")
	public Class170(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1) {
		this.anInt5233 = arg1;
		this.aClass37_1 = arg0;
	}
}
