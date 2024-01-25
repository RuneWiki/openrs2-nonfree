import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class295 implements Interface19 {

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "Lclient!fd;")
	private final Class100 aClass100_2;

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "Lclient!aq;")
	private final Class18 aClass18_1;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!fd;Lclient!aq;)V")
	public Class295(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class18 arg1) {
		this.aClass100_2 = arg0;
		this.aClass18_1 = arg1;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6772() {
		return this.aClass100_2.method2342();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6771() {
		@Pc(15) Class106 local15 = this.aClass100_2.method2343(this.aClass18_1.anInt389);
		if (local15 == null) {
			return;
		}
		@Pc(32) int local32 = this.aClass18_1.aClass114_1.method2576(this.aClass18_1.anInt382, Static168.anInt3084) + this.aClass18_1.anInt383;
		@Pc(46) int local46 = this.aClass18_1.aClass72_1.method1433(Static112.anInt1892, this.aClass18_1.anInt390) + this.aClass18_1.anInt385;
		if (this.aClass18_1.aBoolean24) {
			Static554.aClass90_12.method7494(local32, local46, this.aClass18_1.anInt382, this.aClass18_1.anInt390, this.aClass18_1.anInt387, 0);
		}
		local46 += this.method6775(local15.aString26, local46, Static264.aClass82_3, local32) * 12;
		local46 += 8;
		if (this.aClass18_1.aBoolean24) {
			Static554.aClass90_12.method7484(local32, local46, this.aClass18_1.anInt382 + local32 - 1, local46, this.aClass18_1.anInt387, 0);
		}
		local46++;
		local46 += this.method6775(local15.aString28, local46, Static264.aClass82_3, local32) * 12;
		local46 += 5;
		@Pc(130) int local130 = local46 + this.method6775(local15.aString27, local46, Static264.aClass82_3, local32) * 12;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
	@Override
	public void method6770() {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;IIILclient!ta;I)I")
	private int method6775(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class82 arg2, @OriginalArg(5) int arg3) {
		return arg2.method7878(0, null, arg0, this.aClass18_1.anInt390 - 10, null, 0, 0, this.aClass18_1.anInt382 - 10, this.aClass18_1.anInt388, null, this.aClass18_1.anInt386, arg1 + 5, arg3 + 5, 0);
	}
}
