import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class343 implements Interface1 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "Lclient!la;")
	private Class63 aClass63_11;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "Lclient!ri;")
	private final Class284 aClass284_161;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "Lclient!io;")
	private final Class149 aClass149_1;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "Lclient!ri;")
	private final Class284 aClass284_162;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!ri;Lclient!ri;Lclient!io;)V")
	public Class343(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(2) Class149 arg2) {
		this.aClass284_161 = arg0;
		this.aClass149_1 = arg2;
		this.aClass284_162 = arg1;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	@Override
	public void method7700() {
		@Pc(20) Class328 local20 = Static410.method5763(this.aClass149_1.anInt4681, this.aClass284_162);
		this.aClass63_11 = Static319.aClass31_11.method8027(local20, Static607.method8164(this.aClass284_161, this.aClass149_1.anInt4681));
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7701() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass284_161.method6347(this.aClass149_1.anInt4681)) {
			local5 = false;
		}
		if (!this.aClass284_162.method6347(this.aClass149_1.anInt4681)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7699() {
		@Pc(23) int local23 = this.aClass149_1.aClass154_9.method3814(this.aClass149_1.anInt4682, Static333.anInt6024) + this.aClass149_1.anInt4678;
		@Pc(38) int local38 = this.aClass149_1.aClass201_10.method4868(this.aClass149_1.anInt4674, Static473.anInt8221) + this.aClass149_1.anInt4675;
		this.aClass63_11.method6882(this.aClass149_1.anInt4682, this.aClass149_1.anInt4667, this.aClass149_1.anInt4672, 0, null, local38, this.aClass149_1.aString112, this.aClass149_1.anInt4668, local23, this.aClass149_1.anInt4671, 0, this.aClass149_1.anInt4665, null, null, this.aClass149_1.anInt4674);
	}
}
