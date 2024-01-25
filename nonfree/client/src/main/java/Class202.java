import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public final class Class202 implements Interface8 {

	@OriginalMember(owner = "client!kba", name = "h", descriptor = "Lclient!lga;")
	private final Class223 aClass223_68;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lclient!lga;)V")
	public Class202(@OriginalArg(0) Class223 arg0) {
		this.aClass223_68 = arg0;
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)I")
	@Override
	public int method8618() {
		return this.aClass223_68.method5273() ? 100 : this.aClass223_68.method5263();
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)Lclient!uw;")
	@Override
	public Class370 method8617() {
		return Static634.aClass370_2;
	}
}
