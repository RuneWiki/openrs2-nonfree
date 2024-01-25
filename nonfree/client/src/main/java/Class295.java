import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class295 implements Interface27 {

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "Lclient!da;")
	private Class69 aClass69_12;

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "Lclient!aj;")
	private final Class15 aClass15_128;

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "Lclient!aj;")
	private final Class15 aClass15_127;

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "Lclient!jl;")
	private final Class170 aClass170_1;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!aj;Lclient!aj;Lclient!jl;)V")
	public Class295(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class170 arg2) {
		this.aClass15_128 = arg0;
		this.aClass15_127 = arg1;
		this.aClass170_1 = arg2;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7760() {
		@Pc(15) int local15 = this.aClass170_1.aClass356_5.method8711(this.aClass170_1.anInt4885, Static33.anInt10742) + this.aClass170_1.anInt4881;
		@Pc(30) int local30 = this.aClass170_1.aClass56_7.method1354(Static602.anInt9666, this.aClass170_1.anInt4888) + this.aClass170_1.anInt4878;
		this.aClass69_12.method8853(this.aClass170_1.aString46, 0, 0, (Class33[]) null, local15, this.aClass170_1.anInt4887, this.aClass170_1.anInt4882, this.aClass170_1.anInt4885, this.aClass170_1.anInt4888, this.aClass170_1.anInt4889, this.aClass170_1.anInt4890, this.aClass170_1.anInt4879, (Class1) null, (int[]) null, local30);
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7759() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass15_128.method526(this.aClass170_1.anInt4883)) {
			local5 = false;
		}
		if (!this.aClass15_127.method526(this.aClass170_1.anInt4883)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
	@Override
	public void method7758() {
		@Pc(11) Class88 local11 = Static629.method8788(this.aClass15_127, this.aClass170_1.anInt4883);
		this.aClass69_12 = Static674.aClass13_22.method8515(local11, Static682.method2747(this.aClass15_128, this.aClass170_1.anInt4883));
	}
}
