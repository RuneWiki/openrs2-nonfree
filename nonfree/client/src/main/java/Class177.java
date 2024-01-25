import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class177 implements Interface9 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "Lclient!f;")
	private Class88 aClass88_16;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Lclient!vo;")
	private final Class348 aClass348_58;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Lclient!ju;")
	private final Class170 aClass170_1;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!vo;Lclient!ju;)V")
	public Class177(@OriginalArg(0) Class348 arg0, @OriginalArg(1) Class170 arg1) {
		this.aClass348_58 = arg0;
		this.aClass170_1 = arg1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	@Override
	public void method8148() {
		this.aClass88_16 = Static402.method6120(this.aClass170_1.anInt5202, this.aClass348_58);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8147() {
		@Pc(8) int local8 = Static123.anInt9150 <= Static370.anInt7124 ? Static370.anInt7124 : Static123.anInt9150;
		@Pc(15) int local15 = Static71.anInt1872 <= Static324.anInt6378 ? Static324.anInt6378 : Static71.anInt1872;
		@Pc(19) int local19 = this.aClass88_16.A();
		@Pc(23) int local23 = this.aClass88_16.ca();
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = local8;
		@Pc(33) int local33 = local8 * local23 / local19;
		@Pc(40) int local40 = (local15 - local33) / 2;
		if (local15 < local33) {
			local27 = local15 * local19 / local23;
			local33 = local15;
			local40 = 0;
			local25 = (local8 - local27) / 2;
		}
		this.aClass88_16.method8046(local25, local40, local27, local33);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8149() {
		return this.aClass348_58.method7960(this.aClass170_1.anInt5202);
	}
}
