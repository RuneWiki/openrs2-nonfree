import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public final class Class186 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "Lclient!oi;")
	private final Class185 aClass185_79;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public final int anInt5063;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;)V")
	public Class186(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2) {
		new Class77(64);
		this.aClass185_79 = arg2;
		this.anInt5063 = this.aClass185_79.method4011(15);
	}
}
