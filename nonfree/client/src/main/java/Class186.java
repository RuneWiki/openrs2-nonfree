import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class186 {

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "Lclient!hh;")
	private final Class109 aClass109_68;

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
	public final int anInt4885;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;)V")
	public Class186(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2) {
		new Class151(64);
		this.aClass109_68 = arg2;
		this.anInt4885 = this.aClass109_68.method2322(15);
	}
}
