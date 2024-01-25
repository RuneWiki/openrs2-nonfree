import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class154 implements Interface14 {

	@OriginalMember(owner = "client!im", name = "g", descriptor = "Lclient!da;")
	private Class62 aClass62_11;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "Lclient!wu;")
	private final Class380 aClass380_58;

	@OriginalMember(owner = "client!im", name = "d", descriptor = "Lclient!wu;")
	private final Class380 aClass380_57;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "Lclient!og;")
	private final Class247 aClass247_1;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;Lclient!og;)V")
	public Class154(@OriginalArg(0) Class380 arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) Class247 arg2) {
		this.aClass380_58 = arg1;
		this.aClass380_57 = arg0;
		this.aClass247_1 = arg2;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8642() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass380_57.method8638(this.aClass247_1.anInt6304)) {
			local5 = false;
		}
		if (!this.aClass380_58.method8638(this.aClass247_1.anInt6304)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
	@Override
	public void method8644() {
		@Pc(17) Class256 local17 = Static3.method8590(this.aClass380_58, this.aClass247_1.anInt6304);
		this.aClass62_11 = Static192.aClass95_4.method6956(local17, Static655.method7422(this.aClass380_57, this.aClass247_1.anInt6304));
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8643() {
		@Pc(20) int local20 = this.aClass247_1.aClass361_8.method8101(Static66.anInt10099, this.aClass247_1.anInt6298) + this.aClass247_1.anInt6296;
		@Pc(35) int local35 = this.aClass247_1.aClass306_9.method6899(this.aClass247_1.anInt6293, Static364.anInt5763) + this.aClass247_1.anInt6297;
		this.aClass62_11.method5680(null, this.aClass247_1.anInt6303, local20, this.aClass247_1.anInt6295, this.aClass247_1.anInt6302, 0, this.aClass247_1.anInt6300, null, 0, this.aClass247_1.aString85, local35, this.aClass247_1.anInt6294, null, this.aClass247_1.anInt6298, this.aClass247_1.anInt6293);
	}
}
