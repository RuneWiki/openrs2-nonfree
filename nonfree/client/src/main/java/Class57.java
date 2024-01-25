import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class57 implements Interface24 {

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "Lclient!om;")
	private final Class259 aClass259_1;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "Lclient!eb;")
	private final Class77 aClass77_2;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!eb;Lclient!om;)V")
	public Class57(@OriginalArg(0) Class77 arg0, @OriginalArg(1) Class259 arg1) {
		this.aClass259_1 = arg1;
		this.aClass77_2 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	@Override
	public void method8705() {
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8704() {
		return this.aClass77_2.method1837();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8706() {
		@Pc(15) Class228 local15 = this.aClass77_2.method1836(this.aClass259_1.anInt7343);
		if (local15 == null) {
			return;
		}
		@Pc(31) int local31 = this.aClass259_1.aClass7_8.method247(Static365.anInt6242, this.aClass259_1.anInt7346) + this.aClass259_1.anInt7350;
		@Pc(45) int local45 = this.aClass259_1.aClass249_11.method6236(Static335.anInt5755, this.aClass259_1.anInt7349) + this.aClass259_1.anInt7347;
		if (this.aClass259_1.aBoolean489) {
			Static546.aClass132_13.method7481(local31, local45, this.aClass259_1.anInt7346, this.aClass259_1.anInt7349, this.aClass259_1.anInt7344, 0);
		}
		local45 += this.method1507(local45, local31, Static51.aClass19_4, local15.aString83) * 12;
		local45 += 8;
		if (this.aClass259_1.aBoolean489) {
			Static546.aClass132_13.method7473(local31, local45, local31 + this.aClass259_1.anInt7346 - 1, local45, this.aClass259_1.anInt7344, 0);
		}
		local45++;
		local45 += this.method1507(local45, local31, Static51.aClass19_4, local15.aString84) * 12;
		local45 += 5;
		@Pc(129) int local129 = local45 + this.method1507(local45, local31, Static51.aClass19_4, local15.aString82) * 12;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIILclient!da;ILjava/lang/String;)I")
	private int method1507(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19 arg2, @OriginalArg(5) String arg3) {
		return arg2.method6326(arg0 + 5, 0, 0, arg1 + 5, 0, this.aClass259_1.anInt7346 - 10, this.aClass259_1.anInt7349 + -10, (Class9[]) null, arg3, this.aClass259_1.anInt7348, (Class1) null, this.aClass259_1.anInt7342, 0, 0, (int[]) null);
	}
}
