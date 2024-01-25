import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public final class Class275 {

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "Lclient!gga;")
	private final Class124 aClass124_99;

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "I")
	public final int anInt8144;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;)V")
	public Class275(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2) {
		new Class22(64);
		this.aClass124_99 = arg2;
		this.anInt8144 = this.aClass124_99.method3629(15);
	}
}
