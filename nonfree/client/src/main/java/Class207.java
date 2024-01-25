import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class207 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "Lclient!jn;")
	private final Class176 aClass176_79;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
	public final int anInt6115;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;)V")
	public Class207(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		new Class223(64);
		this.aClass176_79 = arg2;
		this.anInt6115 = this.aClass176_79.method3999(15);
	}
}
