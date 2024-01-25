import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public final class Class131 {

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "Lclient!om;")
	private final Class246 aClass246_96;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	public final int anInt4012;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;)V")
	public Class131(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		new Class10(64);
		this.aClass246_96 = arg2;
		this.anInt4012 = this.aClass246_96.method5673(15);
	}
}
