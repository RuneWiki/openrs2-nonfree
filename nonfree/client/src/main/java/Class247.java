import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class247 {

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "Lclient!pq;")
	private final Class251 aClass251_113;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	public final int anInt6920;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;)V")
	public Class247(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		new Class332(64);
		this.aClass251_113 = arg2;
		this.anInt6920 = this.aClass251_113.method5849(15);
	}
}
