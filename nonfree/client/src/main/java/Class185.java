import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class185 {

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "Lclient!ng;")
	private final Class167 aClass167_69 = new Class167(256);

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_30;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "Lclient!m;")
	private final Interface8 anInterface8_9;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!od;Lclient!m;)V")
	public Class185(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) Interface8 arg1) {
		this.aClass128_Sub2_30 = arg0;
		this.anInterface8_9 = arg1;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
	public void method3892() {
		this.aClass167_69.method3384(5);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)Lclient!ah;")
	public Class5_Sub1 method3894(@OriginalArg(1) int arg0) {
		@Pc(14) Object local14 = this.aClass167_69.method3386((long) arg0);
		if (local14 != null) {
			return (Class5_Sub1) local14;
		} else if (this.anInterface8_9.method1376(arg0)) {
			@Pc(33) Class201 local33 = this.anInterface8_9.method1375(arg0);
			@Pc(42) int local42 = local33.aBoolean431 ? 64 : this.aClass128_Sub2_30.anInt4602;
			@Pc(101) Class5_Sub1 local101;
			if (local33.aBoolean430 && this.aClass128_Sub2_30.method3536()) {
				@Pc(113) float[] local113 = this.anInterface8_9.method1372(0.7F, local42, arg0, local42);
				local101 = new Class5_Sub1(this.aClass128_Sub2_30, 3553, 34842, local42, local42, local33.aByte62 != 0, local113, 6408);
			} else {
				@Pc(59) short local59;
				@Pc(69) int[] local69;
				if (local33.aBoolean433 && Static196.method2591(local33.aByte61)) {
					local59 = 6407;
					local69 = this.anInterface8_9.method1374(local42, false, local42, 0.7F, arg0);
				} else {
					local59 = 6408;
					local69 = this.anInterface8_9.method1373(local42, local42, arg0, 0.7F);
				}
				local101 = new Class5_Sub1(this.aClass128_Sub2_30, 3553, local59, local42, local42, local33.aByte62 != 0, local69, false);
			}
			local101.method5547(local33.aBoolean428, local33.aBoolean434);
			this.aClass167_69.method3392(local101, (long) arg0);
			return local101;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)V")
	public void method3897() {
		this.aClass167_69.method3390();
	}
}
