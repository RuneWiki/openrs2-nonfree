import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sga")
public final class Class304 implements Interface7 {

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "Lclient!ih;")
	private final Class145 aClass145_2;

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "Lclient!ie;")
	private final Class142 aClass142_1;

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lclient!ih;Lclient!ie;)V")
	public Class304(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class142 arg1) {
		this.aClass145_2 = arg0;
		this.aClass142_1 = arg1;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7571() {
		@Pc(11) Class318 local11 = this.aClass145_2.method3685(this.aClass142_1.anInt4167);
		if (local11 == null) {
			return;
		}
		@Pc(28) int local28 = this.aClass142_1.aClass319_5.method7077(Static592.anInt9585, this.aClass142_1.anInt4166) + this.aClass142_1.anInt4163;
		@Pc(43) int local43 = this.aClass142_1.aClass247_5.method5723(Static579.anInt9514, this.aClass142_1.anInt4170) + this.aClass142_1.anInt4171;
		if (this.aClass142_1.aBoolean286) {
			Static240.aClass14_7.method6875(local28, local43, this.aClass142_1.anInt4166, this.aClass142_1.anInt4170, this.aClass142_1.anInt4168, 0);
		}
		local43 += this.method6618(local11.aString95, Static114.aClass92_4, local43, local28) * 12;
		local43 += 8;
		if (this.aClass142_1.aBoolean286) {
			Static240.aClass14_7.method6894(local28, local43, this.aClass142_1.anInt4166 + local28 - 1, local43, this.aClass142_1.anInt4168, 0);
		}
		local43++;
		local43 += this.method6618(local11.aString93, Static114.aClass92_4, local43, local28) * 12;
		local43 += 5;
		@Pc(125) int local125 = local43 + this.method6618(local11.aString94, Static114.aClass92_4, local43, local28) * 12;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/String;Lclient!ta;IIII)I")
	private int method6618(@OriginalArg(0) String arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return arg1.method6401(this.aClass142_1.anInt4164, 0, arg0, this.aClass142_1.anInt4170 - 10, 0, null, arg3 + 5, null, 0, arg2 + 5, this.aClass142_1.anInt4166 - 10, 0, 0, this.aClass142_1.anInt4165, null);
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7572() {
		return this.aClass145_2.method3686();
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V")
	@Override
	public void method7570() {
	}
}
