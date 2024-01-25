import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public final class Class94 {

	@OriginalMember(owner = "client!eca", name = "e", descriptor = "Lclient!gj;")
	private final Class143 aClass143_34;

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
	public final int anInt2431;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;)V")
	public Class94(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		new Class279(64);
		this.aClass143_34 = arg2;
		this.anInt2431 = this.aClass143_34.method3123(15);
	}
}
