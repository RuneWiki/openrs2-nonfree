import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class323 implements Interface1 {

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "Lclient!nha;")
	private final Class224 aClass224_1;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "Lclient!eaa;")
	private final Class83 aClass83_2;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!eaa;Lclient!nha;)V")
	public Class323(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class224 arg1) {
		this.aClass224_1 = arg1;
		this.aClass83_2 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9232() {
		return this.aClass83_2.method2847();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	@Override
	public void method9231() {
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BZ)V")
	@Override
	public void method9233() {
		@Pc(11) Class368 local11 = this.aClass83_2.method2846(this.aClass224_1.anInt7350);
		if (local11 == null) {
			return;
		}
		@Pc(28) int local28 = this.aClass224_1.aClass309_9.method7817(Static326.anInt6591, this.aClass224_1.anInt7358) + this.aClass224_1.anInt7354;
		@Pc(45) int local45 = this.aClass224_1.aClass86_8.method2903(Static467.anInt8715, this.aClass224_1.anInt7353) + this.aClass224_1.anInt7352;
		if (this.aClass224_1.aBoolean537) {
			Static186.aClass20_4.method7231(local28, local45, this.aClass224_1.anInt7358, this.aClass224_1.anInt7353, this.aClass224_1.anInt7349, 0);
		}
		local45 += this.method8009(local11.aString108, Static571.aClass68_12, local28, local45) * 12;
		local45 += 8;
		if (this.aClass224_1.aBoolean537) {
			Static186.aClass20_4.method7312(local28, local45, local28 + this.aClass224_1.anInt7358 - 1, local45, this.aClass224_1.anInt7349, 0);
		}
		local45++;
		local45 += this.method8009(local11.aString107, Static571.aClass68_12, local28, local45) * 12;
		local45 += 5;
		@Pc(127) int local127 = local45 + this.method8009(local11.aString109, Static571.aClass68_12, local28, local45) * 12;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;ZLclient!da;II)I")
	private int method8009(@OriginalArg(1) String arg0, @OriginalArg(3) Class68 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return arg1.method8115(null, 0, this.aClass224_1.anInt7357, null, this.aClass224_1.anInt7347, 0, this.aClass224_1.anInt7353 - 10, null, arg3 + 5, 0, 0, this.aClass224_1.anInt7358 - 10, arg2 + 5, 0, arg0);
	}
}
