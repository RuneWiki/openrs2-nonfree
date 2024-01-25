import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class15 implements Interface7 {

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "Lclient!ta;")
	private Class92 aClass92_1;

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_11;

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_10;

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "Lclient!mea;")
	private final Class205 aClass205_1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!pfa;Lclient!pfa;Lclient!mea;)V")
	public Class15(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class205 arg2) {
		this.aClass251_11 = arg1;
		this.aClass251_10 = arg0;
		this.aClass205_1 = arg2;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7571() {
		@Pc(19) int local19 = this.aClass205_1.aClass319_8.method7077(Static592.anInt9585, this.aClass205_1.anInt5663) + this.aClass205_1.anInt5669;
		@Pc(33) int local33 = this.aClass205_1.aClass247_7.method5723(Static579.anInt9514, this.aClass205_1.anInt5661) + this.aClass205_1.anInt5668;
		this.aClass92_1.method6401(this.aClass205_1.anInt5673, 0, this.aClass205_1.aString44, this.aClass205_1.anInt5661, this.aClass205_1.anInt5667, null, local19, null, this.aClass205_1.anInt5666, local33, this.aClass205_1.anInt5663, this.aClass205_1.anInt5664, 0, this.aClass205_1.anInt5662, null);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
	@Override
	public void method7570() {
		@Pc(17) Class327 local17 = Static18.method427(this.aClass205_1.anInt5660, this.aClass251_11);
		this.aClass92_1 = Static240.aClass14_7.method6854(local17, Static604.method3618(this.aClass251_10, this.aClass205_1.anInt5660));
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7572() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass251_10.method5782(this.aClass205_1.anInt5660)) {
			local11 = false;
		}
		if (!this.aClass251_11.method5782(this.aClass205_1.anInt5660)) {
			local11 = false;
		}
		return local11;
	}
}
