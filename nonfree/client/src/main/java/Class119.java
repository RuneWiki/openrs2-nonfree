import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class119 implements Interface27 {

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "Lclient!da;")
	private Class67 aClass67_4;

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "Lclient!lga;")
	private final Class223 aClass223_32;

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "Lclient!lga;")
	private final Class223 aClass223_33;

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "Lclient!sca;")
	private final Class324 aClass324_1;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!lga;Lclient!lga;Lclient!sca;)V")
	public Class119(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class324 arg2) {
		this.aClass223_32 = arg0;
		this.aClass223_33 = arg1;
		this.aClass324_1 = arg2;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8038() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass223_32.method5285(this.aClass324_1.anInt8857)) {
			local5 = false;
		}
		if (!this.aClass223_33.method5285(this.aClass324_1.anInt8857)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8039() {
		@Pc(16) int local16 = this.aClass324_1.aClass318_18.method7565(this.aClass324_1.anInt8868, Static339.anInt5789) + this.aClass324_1.anInt8858;
		@Pc(30) int local30 = this.aClass324_1.aClass238_10.method5892(this.aClass324_1.anInt8869, Static48.anInt6772) + this.aClass324_1.anInt8863;
		this.aClass67_4.method8281(local30, this.aClass324_1.anInt8866, local16, (int[]) null, this.aClass324_1.anInt8859, this.aClass324_1.anInt8869, 0, this.aClass324_1.anInt8865, this.aClass324_1.anInt8861, 0, (Class49[]) null, this.aClass324_1.anInt8864, (Class1) null, this.aClass324_1.anInt8868, this.aClass324_1.aString106);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	@Override
	public void method8040() {
		@Pc(19) Class53 local19 = Static287.method4708(this.aClass324_1.anInt8857, this.aClass223_33);
		this.aClass67_4 = Static202.aClass75_5.method6649(local19, Static691.method1247(this.aClass223_32, this.aClass324_1.anInt8857));
	}
}
