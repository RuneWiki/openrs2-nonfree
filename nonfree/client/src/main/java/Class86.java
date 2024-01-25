import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class86 implements Interface1 {

	@OriginalMember(owner = "client!eea", name = "f", descriptor = "Lclient!f;")
	private Class73 aClass73_6;

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "Lclient!ri;")
	private final Class284 aClass284_37;

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "Lclient!ada;")
	private final Class8 aClass8_1;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lclient!ri;Lclient!ada;)V")
	public Class86(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class8 arg1) {
		this.aClass284_37 = arg0;
		this.aClass8_1 = arg1;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)V")
	@Override
	public void method7700() {
		this.aClass73_6 = Static581.method7907(this.aClass8_1.anInt52, this.aClass284_37);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7701() {
		return this.aClass284_37.method6347(this.aClass8_1.anInt52);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7699() {
		@Pc(21) int local21 = Static34.anInt3201 <= Static333.anInt6024 ? Static333.anInt6024 : Static34.anInt3201;
		@Pc(32) int local32 = Static492.anInt8445 <= Static473.anInt8221 ? Static473.anInt8221 : Static492.anInt8445;
		@Pc(36) int local36 = this.aClass73_6.A();
		@Pc(40) int local40 = this.aClass73_6.ca();
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = local21;
		@Pc(50) int local50 = local40 * local21 / local36;
		@Pc(56) int local56 = (local32 - local50) / 2;
		if (local32 < local50) {
			local56 = 0;
			local50 = local32;
			local44 = local36 * local32 / local40;
			local42 = (local21 - local44) / 2;
		}
		this.aClass73_6.method7955(local42, local56, local44, local50);
	}
}
