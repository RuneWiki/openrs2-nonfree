import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class89 {

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!rg;")
	private final Class2_Sub1 aClass2_Sub1_74 = new Class2_Sub1();

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "Lclient!n;")
	private final Class55 aClass55_2 = new Class55();

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
	private int anInt4476;

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
	private final int anInt4477;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "Lclient!md;")
	private final Class51 aClass51_16;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V")
	public Class89(@OriginalArg(0) int arg0) {
		this.anInt4476 = arg0;
		@Pc(16) int local16 = 1;
		this.anInt4477 = arg0;
		while (local16 + local16 < arg0) {
			local16 += local16;
		}
		this.aClass51_16 = new Class51(local16);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!rg;BJ)V")
	public void method3432(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt4476 == 0) {
			@Pc(21) Class2_Sub1 local21 = this.aClass55_2.method2530();
			local21.method3556();
			local21.method3415();
			if (this.aClass2_Sub1_74 == local21) {
				local21 = this.aClass55_2.method2530();
				local21.method3556();
				local21.method3415();
			}
		} else {
			this.anInt4476--;
		}
		this.aClass51_16.method2463(arg0, arg1);
		this.aClass55_2.method2528(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(JZ)V")
	public void method3434(@OriginalArg(0) long arg0) {
		@Pc(16) Class2_Sub1 local16 = (Class2_Sub1) this.aClass51_16.method2458(arg0);
		if (local16 != null) {
			local16.method3556();
			local16.method3415();
			this.anInt4476++;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Lclient!vd;")
	public Class2 method3435() {
		return this.aClass51_16.method2465();
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)Lclient!vd;")
	public Class2 method3436() {
		return this.aClass51_16.method2462();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(JB)Lclient!rg;")
	public Class2_Sub1 method3437(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub1 local10 = (Class2_Sub1) this.aClass51_16.method2458(arg0);
		if (local10 != null) {
			this.aClass55_2.method2528(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public void method3439() {
		while (true) {
			@Pc(12) Class2_Sub1 local12 = this.aClass55_2.method2530();
			if (local12 == null) {
				this.anInt4476 = this.anInt4477;
				return;
			}
			local12.method3556();
			local12.method3415();
		}
	}
}
