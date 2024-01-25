import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public final class Class373 implements Interface8 {

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "Lclient!lga;")
	private final Class223 aClass223_117;

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "Ljava/lang/String;")
	private final String aString120;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lclient!lga;Ljava/lang/String;)V")
	public Class373(@OriginalArg(0) Class223 arg0, @OriginalArg(1) String arg1) {
		this.aClass223_117 = arg0;
		this.aString120 = arg1;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)I")
	@Override
	public int method8618() {
		return this.aClass223_117.method5258(this.aString120) ? 100 : this.aClass223_117.method5274(this.aString120);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)Lclient!uw;")
	@Override
	public Class370 method8617() {
		return Static634.aClass370_4;
	}
}
