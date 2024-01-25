import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public final class Class130 implements Interface14 {

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "Lclient!gj;")
	private final Class143 aClass143_44;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!gj;)V")
	public Class130(@OriginalArg(0) Class143 arg0) {
		this.aClass143_44 = arg0;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)Lclient!gb;")
	@Override
	public Class139 method7866() {
		return Static186.aClass139_1;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)I")
	@Override
	public int method7865() {
		return this.aClass143_44.method3114() ? 100 : this.aClass143_44.method3115();
	}
}
