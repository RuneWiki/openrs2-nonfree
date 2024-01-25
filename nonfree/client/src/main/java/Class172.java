import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class172 implements Interface14 {

	@OriginalMember(owner = "client!il", name = "b", descriptor = "Lclient!rq;")
	private final Class327 aClass327_1;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "Lclient!bea;")
	private final Class25 aClass25_1;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!bea;Lclient!rq;)V")
	public Class172(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class327 arg1) {
		this.aClass327_1 = arg1;
		this.aClass25_1 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
	@Override
	public void method8745() {
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8743() {
		@Pc(16) Class176 local16 = this.aClass25_1.method603(this.aClass327_1.anInt9308);
		if (local16 == null) {
			return;
		}
		@Pc(32) int local32 = this.aClass327_1.aClass304_13.method7463(this.aClass327_1.anInt9312, Static347.anInt2639) + this.aClass327_1.anInt9309;
		@Pc(46) int local46 = this.aClass327_1.aClass216_11.method5030(Static426.anInt7511, this.aClass327_1.anInt9315) + this.aClass327_1.anInt9313;
		if (this.aClass327_1.aBoolean682) {
			Static488.aClass67_12.method7700(local32, local46, this.aClass327_1.anInt9312, this.aClass327_1.anInt9315, this.aClass327_1.anInt9316, 0);
		}
		local46 += this.method4239(local16.aString86, local32, local46, Static427.aClass44_34) * 12;
		local46 += 8;
		if (this.aClass327_1.aBoolean682) {
			Static488.aClass67_12.method7650(local32, local46, this.aClass327_1.anInt9312 + local32 - 1, local46, this.aClass327_1.anInt9316, 0);
		}
		local46++;
		local46 += this.method4239(local16.aString87, local32, local46, Static427.aClass44_34) * 12;
		local46 += 5;
		@Pc(132) int local132 = local46 + this.method4239(local16.aString85, local32, local46, Static427.aClass44_34) * 12;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8744() {
		return this.aClass25_1.method601();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/lang/String;IIILclient!da;)I")
	private int method4239(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class44 arg3) {
		return arg3.method8132(arg2 + 5, (Class9[]) null, this.aClass327_1.anInt9307, arg0, 0, arg1 + 5, this.aClass327_1.anInt9312 + -10, (Class1) null, (int[]) null, 0, 0, this.aClass327_1.anInt9317, 0, this.aClass327_1.anInt9315 - 10, 0);
	}
}
