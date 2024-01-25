import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class215 {

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "Lclient!wc;")
	private Class1_Sub1 aClass1_Sub1_46 = new Class1_Sub1();

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "Lclient!vt;")
	private final Class262 aClass262_8 = new Class262();

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
	private final int anInt6436;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
	private int anInt6437;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "Lclient!bu;")
	private final Class38 aClass38_30;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I)V")
	public Class215(@OriginalArg(0) int arg0) {
		this.anInt6436 = arg0;
		this.anInt6437 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass38_30 = new Class38(local19);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLclient!wc;J)V")
	public void method4925(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt6437 == 0) {
			@Pc(17) Class1_Sub1 local17 = this.aClass262_8.method5880();
			local17.method6178();
			local17.method6125();
			if (local17 == this.aClass1_Sub1_46) {
				local17 = this.aClass262_8.method5880();
				local17.method6178();
				local17.method6125();
			}
		} else {
			this.anInt6437--;
		}
		this.aClass38_30.method766(arg0, arg1);
		this.aClass262_8.method5876(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BJ)Lclient!wc;")
	public Class1_Sub1 method4926(@OriginalArg(1) long arg0) {
		@Pc(16) Class1_Sub1 local16 = (Class1_Sub1) this.aClass38_30.method765(arg0);
		if (local16 != null) {
			this.aClass262_8.method5876(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public void method4927() {
		this.aClass262_8.method5875();
		this.aClass38_30.method774();
		this.aClass1_Sub1_46 = new Class1_Sub1();
		this.anInt6437 = this.anInt6436;
	}
}
