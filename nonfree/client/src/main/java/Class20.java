import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public class Class20 implements Interface10 {

	@OriginalMember(owner = "client!am", name = "d", descriptor = "Lclient!ug;")
	protected Class43 aClass43_24;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "Lclient!wca;")
	protected final Class321 aClass321_2;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Lclient!nca;")
	private final Class254 aClass254_116;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!nca;Lclient!wca;)V")
	public Class20(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class321 arg1) {
		this.aClass321_2 = arg1;
		this.aClass254_116 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method9562() {
		return this.aClass254_116.method6072(this.aClass321_2.anInt8627);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9560() {
		@Pc(27) int local27 = this.aClass321_2.aClass18_15.method282(Static33.anInt443, this.aClass43_24.method9587()) + this.aClass321_2.anInt8626;
		@Pc(42) int local42 = this.aClass321_2.aClass239_17.method5836(Static277.anInt4340, this.aClass43_24.method9600()) + this.aClass321_2.anInt8628;
		this.aClass43_24.method9588(local27, local42);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
	@Override
	public final void method9561() {
		this.aClass43_24 = Static551.method6202(this.aClass254_116, this.aClass321_2.anInt8627);
	}
}
