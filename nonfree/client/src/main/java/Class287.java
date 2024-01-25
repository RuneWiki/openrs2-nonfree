import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class287 implements Interface23 {

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "Lclient!ut;")
	private final Class322 aClass322_2;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "Lclient!lfa;")
	private final Class197 aClass197_1;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!ut;Lclient!lfa;)V")
	public Class287(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class197 arg1) {
		this.aClass322_2 = arg0;
		this.aClass197_1 = arg1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8047() {
		@Pc(15) Class345 local15 = this.aClass322_2.method7661(this.aClass197_1.anInt5664);
		if (local15 == null) {
			return;
		}
		@Pc(31) int local31 = this.aClass197_1.aClass148_7.method3982(Static419.anInt7811, this.aClass197_1.anInt5656) + this.aClass197_1.anInt5658;
		@Pc(45) int local45 = this.aClass197_1.aClass49_8.method1326(Static79.anInt9888, this.aClass197_1.anInt5662) + this.aClass197_1.anInt5665;
		if (this.aClass197_1.aBoolean430) {
			Static323.aClass9_8.method5436(local31, local45, this.aClass197_1.anInt5656, this.aClass197_1.anInt5662, this.aClass197_1.anInt5657, 0);
		}
		local45 += this.method7193(local15.aString112, local31, local45, Static489.aClass73_5) * 12;
		local45 += 8;
		if (this.aClass197_1.aBoolean430) {
			Static323.aClass9_8.method5450(local31, local45, this.aClass197_1.anInt5656 + local31 - 1, local45, this.aClass197_1.anInt5657, 0);
		}
		local45++;
		local45 += this.method7193(local15.aString111, local31, local45, Static489.aClass73_5) * 12;
		local45 += 5;
		@Pc(127) int local127 = local45 + this.method7193(local15.aString110, local31, local45, Static489.aClass73_5) * 12;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILjava/lang/String;IIILclient!ta;)I")
	private int method7193(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class73 arg3) {
		return arg3.method7891(0, arg2 + 5, this.aClass197_1.anInt5661, null, 0, this.aClass197_1.anInt5662 - 10, 0, arg1 + 5, this.aClass197_1.anInt5659, 0, arg0, this.aClass197_1.anInt5656 - 10, null, null);
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		return this.aClass322_2.method7663();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	@Override
	public void method8048() {
	}
}
