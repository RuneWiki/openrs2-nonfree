import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class326 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "Lclient!ik;")
	private final Class182 aClass182_108;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
	public final int anInt8593;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class326(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		new Class307(64);
		this.aClass182_108 = arg2;
		this.anInt8593 = this.aClass182_108.method3970(15);
	}
}
