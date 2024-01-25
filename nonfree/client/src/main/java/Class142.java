import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class142 implements Interface1 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Lclient!ifa;")
	private final Class160 aClass160_1;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "Lclient!lk;")
	private final Class215 aClass215_1;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!lk;Lclient!ifa;)V")
	public Class142(@OriginalArg(0) Class215 arg0, @OriginalArg(1) Class160 arg1) {
		this.aClass160_1 = arg1;
		this.aClass215_1 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8740() {
		return this.aClass215_1.method5266();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	@Override
	public void method8739() {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!da;Ljava/lang/String;IIII)I")
	private int method3379(@OriginalArg(0) Class38 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		return arg0.method8994(0, (Class20[]) null, 0, this.aClass160_1.anInt4370 - 10, arg2 - -5, 0, 0, arg1, this.aClass160_1.anInt4373 - 10, (int[]) null, arg3 + 5, 0, this.aClass160_1.anInt4371, (Class1) null, this.aClass160_1.anInt4372);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8741() {
		@Pc(15) Class18 local15 = this.aClass215_1.method5265(this.aClass160_1.anInt4368);
		if (local15 == null) {
			return;
		}
		@Pc(32) int local32 = this.aClass160_1.aClass168_9.method3716(this.aClass160_1.anInt4370, Static258.anInt4461) + this.aClass160_1.anInt4369;
		@Pc(47) int local47 = this.aClass160_1.aClass339_8.method8222(this.aClass160_1.anInt4373, Static297.anInt5240) + this.aClass160_1.anInt4376;
		if (this.aClass160_1.aBoolean305) {
			Static677.aClass137_47.method7927(local32, local47, this.aClass160_1.anInt4370, this.aClass160_1.anInt4373, this.aClass160_1.anInt4375, 0);
		}
		local47 += this.method3379(Static448.aClass38_10, local15.aString3, local47, local32) * 12;
		local47 += 8;
		if (this.aClass160_1.aBoolean305) {
			Static677.aClass137_47.method7907(local32, local47, local32 + this.aClass160_1.anInt4370 - 1, local47, this.aClass160_1.anInt4375, 0);
		}
		local47++;
		local47 += this.method3379(Static448.aClass38_10, local15.aString4, local47, local32) * 12;
		local47 += 5;
		@Pc(129) int local129 = local47 + this.method3379(Static448.aClass38_10, local15.aString2, local47, local32) * 12;
	}
}
