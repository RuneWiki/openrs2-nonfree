import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uha")
public final class Class340 implements Interface21 {

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "Lclient!vv;")
	private final Class367 aClass367_1;

	@OriginalMember(owner = "client!uha", name = "e", descriptor = "Lclient!dk;")
	private final Class66 aClass66_1;

	@OriginalMember(owner = "client!uha", name = "<init>", descriptor = "(Lclient!vv;Lclient!dk;)V")
	public Class340(@OriginalArg(0) Class367 arg0, @OriginalArg(1) Class66 arg1) {
		this.aClass367_1 = arg0;
		this.aClass66_1 = arg1;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7993() {
		return this.aClass367_1.method8470();
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(B)V")
	@Override
	public void method7992() {
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7994() {
		@Pc(16) Class372 local16 = this.aClass367_1.method8471(this.aClass66_1.anInt2879);
		if (local16 == null) {
			return;
		}
		@Pc(33) int local33 = this.aClass66_1.aClass79_4.method2610(Static182.anInt4018, this.aClass66_1.anInt2874) + this.aClass66_1.anInt2878;
		@Pc(47) int local47 = this.aClass66_1.aClass127_5.method3682(this.aClass66_1.anInt2876, Static52.anInt1780) + this.aClass66_1.anInt2867;
		if (this.aClass66_1.aBoolean235) {
			Static467.aClass5_13.method6142(local33, local47, this.aClass66_1.anInt2874, this.aClass66_1.anInt2876, this.aClass66_1.anInt2866, 0);
		}
		local47 += this.method7996(local47, Static537.aClass34_12, local16.aString115, local33) * 12;
		local47 += 8;
		if (this.aClass66_1.aBoolean235) {
			Static467.aClass5_13.method6158(local33, local47, local33 + this.aClass66_1.anInt2874 - 1, local47, this.aClass66_1.anInt2866, 0);
		}
		local47++;
		local47 += this.method7996(local47, Static537.aClass34_12, local16.aString113, local33) * 12;
		local47 += 5;
		@Pc(129) int local129 = local47 + this.method7996(local47, Static537.aClass34_12, local16.aString114, local33) * 12;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IILclient!da;Ljava/lang/String;ZI)I")
	private int method7996(@OriginalArg(1) int arg0, @OriginalArg(2) Class34 arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3) {
		return arg1.method8595(arg3 + 5, (Class4[]) null, this.aClass66_1.anInt2874 - 10, arg2, 0, this.aClass66_1.anInt2868, (Class1) null, 0, this.aClass66_1.anInt2870, (int[]) null, 0, 0, 0, arg0 + 5, this.aClass66_1.anInt2876 + -10);
	}
}
