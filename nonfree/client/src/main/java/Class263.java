import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public final class Class263 implements Interface20 {

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString160;

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "Lclient!vo;")
	private final Class348 aClass348_97;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!vo;Ljava/lang/String;)V")
	public Class263(@OriginalArg(0) Class348 arg0, @OriginalArg(1) String arg1) {
		this.aString160 = arg1;
		this.aClass348_97 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)Lclient!sba;")
	@Override
	public Class300 method6812() {
		return Static472.aClass300_4;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)I")
	@Override
	public int method6811() {
		return this.aClass348_97.method7955(this.aString160) ? 100 : this.aClass348_97.method7967(this.aString160);
	}
}
