import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class234 implements Interface20 {

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "Lclient!vo;")
	private final Class348 aClass348_75;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!vo;)V")
	public Class234(@OriginalArg(0) Class348 arg0) {
		this.aClass348_75 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)I")
	@Override
	public int method6811() {
		return this.aClass348_75.method7959() ? 100 : this.aClass348_75.method7962();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)Lclient!sba;")
	@Override
	public Class300 method6812() {
		return Static472.aClass300_2;
	}
}
