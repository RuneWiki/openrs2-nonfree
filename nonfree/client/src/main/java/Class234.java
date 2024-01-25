import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public class Class234 implements Interface13 {

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Lclient!fia;")
	protected Class45 aClass45_21;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Lclient!sa;")
	protected final Class225 aClass225_2;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "Lclient!rg;")
	private final Class310 aClass310_103;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!rg;Lclient!sa;)V")
	public Class234(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class225 arg1) {
		this.aClass225_2 = arg1;
		this.aClass310_103 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8819() {
		@Pc(16) int local16 = this.aClass225_2.aClass258_7.method6293(Static380.anInt6690, this.aClass45_21.method7508()) + this.aClass225_2.anInt6158;
		@Pc(30) int local30 = this.aClass225_2.aClass205_11.method5049(Static380.anInt6697, this.aClass45_21.method7504()) + this.aClass225_2.anInt6156;
		this.aClass45_21.method7488(local16, local30);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
	@Override
	public final void method8821() {
		this.aClass45_21 = Static411.method6195(this.aClass310_103, this.aClass225_2.anInt6159);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method8820() {
		return this.aClass310_103.method7785(this.aClass225_2.anInt6159);
	}
}
