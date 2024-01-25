import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class134 {

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!pl;")
	private final Class259 aClass259_58;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
	public final int anInt3849;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;)V")
	public Class134(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2) {
		new Class313(64);
		this.aClass259_58 = arg2;
		this.anInt3849 = this.aClass259_58.method5969(15);
	}
}
