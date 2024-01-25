import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class Class95 {

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_36;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
	public final int anInt3017;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;)V")
	public Class95(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		new Class136(64);
		this.aClass251_36 = arg2;
		this.anInt3017 = this.aClass251_36.method5768(15);
	}
}
