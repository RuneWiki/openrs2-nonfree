import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class77 implements Interface13 {

	@OriginalMember(owner = "client!dfa", name = "h", descriptor = "Lclient!da;")
	private Class72 aClass72_5;

	@OriginalMember(owner = "client!dfa", name = "i", descriptor = "Lclient!tp;")
	private final Class343 aClass343_1;

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "Lclient!cb;")
	private final Class50 aClass50_28;

	@OriginalMember(owner = "client!dfa", name = "d", descriptor = "Lclient!cb;")
	private final Class50 aClass50_29;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Lclient!cb;Lclient!cb;Lclient!tp;)V")
	public Class77(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_1 = arg2;
		this.aClass50_28 = arg0;
		this.aClass50_29 = arg1;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8561() {
		@Pc(15) int local15 = this.aClass343_1.aClass112_17.method2278(Static345.anInt6198, this.aClass343_1.anInt9402) + this.aClass343_1.anInt9410;
		@Pc(30) int local30 = this.aClass343_1.aClass4_12.method49(Static427.anInt10577, this.aClass343_1.anInt9398) + this.aClass343_1.anInt9401;
		this.aClass72_5.method6912(local30, this.aClass343_1.anInt9398, this.aClass343_1.aString97, 0, 0, this.aClass343_1.anInt9408, this.aClass343_1.anInt9402, this.aClass343_1.anInt9405, this.aClass343_1.anInt9407, local15, this.aClass343_1.anInt9409, (Class1) null, (Class59[]) null, (int[]) null, this.aClass343_1.anInt9399);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Z)V")
	@Override
	public void method8562() {
		@Pc(11) Class198 local11 = Static249.method3522(this.aClass50_29, this.aClass343_1.anInt9403);
		this.aClass72_5 = Static563.aClass143_13.method6194(local11, Static684.method7229(this.aClass50_28, this.aClass343_1.anInt9403));
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8563() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass50_28.method897(this.aClass343_1.anInt9403)) {
			local5 = false;
		}
		if (!this.aClass50_29.method897(this.aClass343_1.anInt9403)) {
			local5 = false;
		}
		return local5;
	}
}
