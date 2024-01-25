import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class253 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "Lclient!ns;")
	private final Class166 aClass166_282;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
	public final int anInt7123;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;)V")
	public Class253(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2) {
		new Class69(64);
		this.aClass166_282 = arg2;
		this.anInt7123 = this.aClass166_282.method3691(15);
	}
}
