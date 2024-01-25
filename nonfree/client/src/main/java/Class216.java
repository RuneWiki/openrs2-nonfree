import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class216 {

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "Lclient!ri;")
	private final Class284 aClass284_105;

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
	public final int anInt6232;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;)V")
	public Class216(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		new Class342(64);
		this.aClass284_105 = arg2;
		this.anInt6232 = this.aClass284_105.method6354(15);
	}
}
