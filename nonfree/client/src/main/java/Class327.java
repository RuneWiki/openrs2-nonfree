import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class327 implements Interface8 {

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "Lclient!lga;")
	private final Class223 aClass223_107;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString107;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!lga;Ljava/lang/String;)V")
	public Class327(@OriginalArg(0) Class223 arg0, @OriginalArg(1) String arg1) {
		this.aClass223_107 = arg0;
		this.aString107 = arg1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Lclient!uw;")
	@Override
	public Class370 method8617() {
		return Static634.aClass370_3;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)I")
	@Override
	public int method8618() {
		return this.aClass223_107.method5287(this.aString107) ? 100 : 0;
	}
}
