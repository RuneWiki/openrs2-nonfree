import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public final class Class372 implements Interface22 {

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "Lclient!kha;")
	private final Class181 aClass181_132;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lclient!kha;)V")
	public Class372(@OriginalArg(0) Class181 arg0) {
		this.aClass181_132 = arg0;
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(B)I")
	@Override
	public int method8554() {
		return this.aClass181_132.method5042() ? 100 : this.aClass181_132.method5045();
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)Lclient!am;")
	@Override
	public Class19 method8553() {
		return Static19.aClass19_1;
	}
}
