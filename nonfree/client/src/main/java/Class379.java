import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class379 implements Interface7 {

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "Lclient!ha;")
	private Class143 aClass143_15;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Z")
	private boolean aBoolean736;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "Lclient!ub;")
	private final Class349 aClass349_1;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "[Lclient!lp;")
	private final Interface13[] anInterface13Array1;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!ub;Lclient!uga;)V")
	public Class379(@OriginalArg(0) Class349 arg0, @OriginalArg(1) Class356 arg1) {
		this.aClass349_1 = arg0;
		this.anInterface13Array1 = new Interface13[this.aClass349_1.anInterface14Array1.length];
		for (@Pc(13) int local13 = 0; local13 < this.anInterface13Array1.length; local13++) {
			this.anInterface13Array1[local13] = arg1.method8103(this.aClass349_1.anInterface14Array1[local13]);
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	@Override
	public void method8441() {
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)I")
	@Override
	public int method8439() {
		return this.aClass349_1.anInt9635;
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
	@Override
	public void method8442() {
		if (this.aClass143_15 != Static563.aClass143_13) {
			this.aBoolean736 = true;
			this.aClass143_15 = Static563.aClass143_13;
		}
		this.aClass143_15.GA(0);
		@Pc(30) Interface13[] local30 = this.anInterface13Array1;
		for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
			@Pc(38) Interface13 local38 = local30[local32];
			if (local38 != null) {
				local38.method8562();
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)I")
	@Override
	public int method8440() {
		@Pc(14) int local14 = 0;
		@Pc(17) Interface13[] local17 = this.anInterface13Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Interface13 local25 = local17[local19];
			if (local25 == null || local25.method8563()) {
				local14++;
			}
		}
		return local14 * 100 / this.anInterface13Array1.length;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(JB)Z")
	@Override
	public boolean method8444(@OriginalArg(0) long arg0) {
		return Static124.method1947() >= (long) this.aClass349_1.anInt9633 + arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8443(@OriginalArg(1) boolean arg0) {
		@Pc(14) Interface13[] local14 = this.anInterface13Array1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Interface13 local22 = local14[local16];
			if (local22 != null) {
				local22.method8561();
			}
		}
		this.aBoolean736 = false;
	}
}
