import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class336 implements Interface23 {

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "Lclient!ta;")
	private Class91 aClass91_9;

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "Lclient!bi;")
	private final Class31 aClass31_112;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "Lclient!oq;")
	private final Class256 aClass256_1;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "Lclient!bi;")
	private final Class31 aClass31_113;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!bi;Lclient!bi;Lclient!oq;)V")
	public Class336(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class256 arg2) {
		this.aClass31_112 = arg1;
		this.aClass256_1 = arg2;
		this.aClass31_113 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7805() {
		@Pc(25) int local25 = this.aClass256_1.aClass297_10.method6544(this.aClass256_1.anInt6836, Static9.anInt8933) + this.aClass256_1.anInt6843;
		@Pc(41) int local41 = this.aClass256_1.aClass58_11.method1299(this.aClass256_1.anInt6840, Static576.anInt9547) + this.aClass256_1.anInt6844;
		this.aClass91_9.method7465(this.aClass256_1.anInt6834, this.aClass256_1.anInt6833, local41, this.aClass256_1.anInt6840, this.aClass256_1.anInt6841, local25, this.aClass256_1.aString79, 0, null, null, 0, this.aClass256_1.anInt6836, this.aClass256_1.anInt6838, this.aClass256_1.anInt6835, null);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7806() {
		@Pc(10) boolean local10 = true;
		if (!this.aClass31_113.method679(this.aClass256_1.anInt6842)) {
			local10 = false;
		}
		if (!this.aClass31_112.method679(this.aClass256_1.anInt6842)) {
			local10 = false;
		}
		return local10;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
	@Override
	public void method7804() {
		@Pc(15) Class196 local15 = Static533.method7421(this.aClass31_112, this.aClass256_1.anInt6842);
		this.aClass91_9 = Static185.aClass66_14.method6829(local15, Static607.method5871(this.aClass31_113, this.aClass256_1.anInt6842));
	}
}
