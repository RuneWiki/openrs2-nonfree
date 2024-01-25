import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class72 implements Interface7 {

	@OriginalMember(owner = "client!dt", name = "i", descriptor = "Lclient!f;")
	private Class78 aClass78_4;

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "Lclient!kda;")
	private final Class186 aClass186_1;

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "Lclient!jn;")
	private final Class176 aClass176_34;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!jn;Lclient!kda;)V")
	public Class72(@OriginalArg(0) Class176 arg0, @OriginalArg(1) Class186 arg1) {
		this.aClass186_1 = arg1;
		this.aClass176_34 = arg0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
	@Override
	public void method7416() {
		this.aClass78_4 = Static335.method5482(this.aClass176_34, this.aClass186_1.anInt5061);
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7417() {
		return this.aClass176_34.method3996(this.aClass186_1.anInt5061);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7418() {
		@Pc(22) int local22 = Static501.anInt6750 < Static554.anInt9828 ? Static554.anInt9828 : Static501.anInt6750;
		@Pc(33) int local33 = Static212.anInt3952 < Static375.anInt7256 ? Static375.anInt7256 : Static212.anInt3952;
		@Pc(37) int local37 = this.aClass78_4.A();
		@Pc(41) int local41 = this.aClass78_4.ca();
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = local22;
		@Pc(51) int local51 = local41 * local22 / local37;
		@Pc(58) int local58 = (local33 - local51) / 2;
		if (local51 > local33) {
			local58 = 0;
			local51 = local33;
			local45 = local37 * local33 / local41;
			local43 = (local22 - local45) / 2;
		}
		this.aClass78_4.method8187(local43, local58, local45, local51);
	}
}
