import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public class Class32 implements Interface13 {

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Lclient!td;")
	protected Class24 aClass24_2;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Lclient!la;")
	private final Class196 aClass196_16;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "Lclient!bba;")
	protected final Class25 aClass25_2;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!la;Lclient!bba;)V")
	public Class32(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class25 arg1) {
		this.aClass196_16 = arg0;
		this.aClass25_2 = arg1;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8397() {
		@Pc(16) int local16 = this.aClass25_2.aClass83_9.method2416(Static612.anInt9912, this.aClass24_2.method8576()) + this.aClass25_2.anInt7824;
		@Pc(31) int local31 = this.aClass25_2.aClass50_10.method1701(this.aClass24_2.method8573(), Static90.anInt2181) + this.aClass25_2.anInt7821;
		this.aClass24_2.method8559(local16, local31);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
	@Override
	public final void method8396() {
		this.aClass24_2 = Static128.method2506(this.aClass196_16, this.aClass25_2.anInt7822);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)Z")
	@Override
	public final boolean method8398() {
		return this.aClass196_16.method5111(this.aClass25_2.anInt7822);
	}
}
