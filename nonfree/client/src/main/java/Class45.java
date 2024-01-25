import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class45 implements Interface12 {

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "Lclient!sp;")
	private final Class318 aClass318_2;

	@OriginalMember(owner = "client!caa", name = "h", descriptor = "Lclient!mf;")
	private final Class226 aClass226_1;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lclient!sp;Lclient!mf;)V")
	public Class45(@OriginalArg(0) Class318 arg0, @OriginalArg(1) Class226 arg1) {
		this.aClass318_2 = arg0;
		this.aClass226_1 = arg1;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8775() {
		@Pc(11) Class320 local11 = this.aClass318_2.method7563(this.aClass226_1.anInt5985);
		if (local11 == null) {
			return;
		}
		@Pc(33) int local33 = this.aClass226_1.aClass204_9.method4964(this.aClass226_1.anInt5979, Static519.anInt7022) + this.aClass226_1.anInt5990;
		@Pc(47) int local47 = this.aClass226_1.aClass288_9.method6878(Static363.anInt6413, this.aClass226_1.anInt5989) + this.aClass226_1.anInt5982;
		if (this.aClass226_1.aBoolean499) {
			Static485.aClass126_17.method7021(local33, local47, this.aClass226_1.anInt5979, this.aClass226_1.anInt5989, this.aClass226_1.anInt5991, 0);
		}
		local47 += this.method970(Static471.aClass6_12, local11.aString122, local47, local33) * 12;
		local47 += 8;
		if (this.aClass226_1.aBoolean499) {
			Static485.aClass126_17.method6991(local33, local47, this.aClass226_1.anInt5979 + local33 - 1, local47, this.aClass226_1.anInt5991, 0);
		}
		local47++;
		local47 += this.method970(Static471.aClass6_12, local11.aString124, local47, local33) * 12;
		local47 += 5;
		@Pc(129) int local129 = local47 + this.method970(Static471.aClass6_12, local11.aString123, local47, local33) * 12;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8776() {
		return this.aClass318_2.method7566();
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V")
	@Override
	public void method8777() {
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!da;Ljava/lang/String;IIII)I")
	private int method970(@OriginalArg(0) Class6 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		return arg0.method7215(arg2 + 5, 0, (Class1) null, arg1, 0, (int[]) null, this.aClass226_1.anInt5980, arg3 + 5, this.aClass226_1.anInt5989 + -10, this.aClass226_1.anInt5983, 0, (Class44[]) null, 0, 0, this.aClass226_1.anInt5979 - 10);
	}
}
