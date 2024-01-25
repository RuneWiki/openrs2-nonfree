import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class386 implements Interface13 {

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Lclient!qda;")
	private Class59 aClass59_40;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Lclient!cb;")
	private final Class50 aClass50_183;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "Lclient!ck;")
	private final Class61 aClass61_1;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!cb;Lclient!ck;)V")
	public Class386(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class61 arg1) {
		this.aClass50_183 = arg0;
		this.aClass61_1 = arg1;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	@Override
	public void method8562() {
		this.aClass59_40 = Static231.method799(this.aClass61_1.anInt1272, this.aClass50_183);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8563() {
		return this.aClass50_183.method897(this.aClass61_1.anInt1272);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8561() {
		@Pc(8) int local8 = Static563.anInt9176 <= Static345.anInt6198 ? Static345.anInt6198 : Static563.anInt9176;
		@Pc(15) int local15 = Static316.anInt8165 <= Static427.anInt10577 ? Static427.anInt10577 : Static316.anInt8165;
		@Pc(19) int local19 = this.aClass59_40.method8053();
		@Pc(23) int local23 = this.aClass59_40.method8064();
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = local8;
		@Pc(33) int local33 = local23 * local8 / local19;
		@Pc(40) int local40 = (local15 - local33) / 2;
		if (local33 > local15) {
			local33 = local15;
			local27 = local15 * local19 / local23;
			local40 = 0;
			local25 = (local8 - local27) / 2;
		}
		this.aClass59_40.method8055(local25, local40, local27, local33);
	}
}
