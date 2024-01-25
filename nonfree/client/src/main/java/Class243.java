import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class243 {

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "Lclient!bi;")
	private final Class31 aClass31_75;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
	public final int anInt6214;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;)V")
	public Class243(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		new Class223(64);
		this.aClass31_75 = arg2;
		this.anInt6214 = this.aClass31_75.method657(15);
	}
}
