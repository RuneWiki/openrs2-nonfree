import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public final class Class297 implements Interface20 {

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "Lclient!vo;")
	private final Class348 aClass348_108;

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "Ljava/lang/String;")
	private final String aString186;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!vo;Ljava/lang/String;)V")
	public Class297(@OriginalArg(0) Class348 arg0, @OriginalArg(1) String arg1) {
		this.aClass348_108 = arg0;
		this.aString186 = arg1;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)Lclient!sba;")
	@Override
	public Class300 method6812() {
		return Static472.aClass300_3;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)I")
	@Override
	public int method6811() {
		return this.aClass348_108.method7951(this.aString186) ? 100 : 0;
	}
}
