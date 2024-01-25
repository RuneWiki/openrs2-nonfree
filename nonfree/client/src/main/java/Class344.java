import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class344 implements Interface13 {

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "Lclient!fia;")
	private Class45 aClass45_23;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!pha;")
	private final Class286 aClass286_1;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!rg;")
	private final Class310 aClass310_112;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!rg;Lclient!pha;)V")
	public Class344(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class286 arg1) {
		this.aClass286_1 = arg1;
		this.aClass310_112 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8820() {
		return this.aClass310_112.method7785(this.aClass286_1.anInt7835);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	@Override
	public void method8821() {
		this.aClass45_23 = Static411.method6195(this.aClass310_112, this.aClass286_1.anInt7835);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8819() {
		@Pc(19) int local19 = Static380.anInt6690 >= Static563.anInt4939 ? Static380.anInt6690 : Static563.anInt4939;
		@Pc(27) int local27 = Static380.anInt6697 >= Static506.anInt8791 ? Static380.anInt6697 : Static506.anInt8791;
		@Pc(31) int local31 = this.aClass45_23.method7508();
		@Pc(35) int local35 = this.aClass45_23.method7504();
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = local19;
		@Pc(45) int local45 = local35 * local19 / local31;
		@Pc(51) int local51 = (local27 - local45) / 2;
		if (local45 > local27) {
			local45 = local27;
			local51 = 0;
			local39 = local27 * local31 / local35;
			local37 = (local19 - local39) / 2;
		}
		this.aClass45_23.method7502(local37, local51, local39, local45);
	}
}
