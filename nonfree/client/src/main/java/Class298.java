import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public final class Class298 {

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "Lclient!wu;")
	private final Class380 aClass380_109;

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
	public final int anInt8044;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;)V")
	public Class298(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2) {
		new Class32(64);
		this.aClass380_109 = arg2;
		this.anInt8044 = this.aClass380_109.method8631(15);
	}
}
