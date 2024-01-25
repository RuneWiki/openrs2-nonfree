import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public final class Class160 implements Interface14 {

	@OriginalMember(owner = "client!io", name = "j", descriptor = "Ljava/lang/String;")
	private final String aString63;

	@OriginalMember(owner = "client!io", name = "i", descriptor = "Lclient!wu;")
	private final Class384 aClass384_58;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!wu;Ljava/lang/String;)V")
	public Class160(@OriginalArg(0) Class384 arg0, @OriginalArg(1) String arg1) {
		this.aString63 = arg1;
		this.aClass384_58 = arg0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)I")
	@Override
	public int method3686() {
		return this.aClass384_58.method8894(this.aString63) ? 100 : this.aClass384_58.method8879(this.aString63);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)Lclient!saa;")
	@Override
	public Class309 method3687() {
		return Static508.aClass309_4;
	}
}
