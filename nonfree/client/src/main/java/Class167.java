import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class167 {

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Lclient!si;")
	private final Class338 aClass338_22 = new Class338(256);

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Lclient!d;")
	private final Interface2 anInterface2_6;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Lclient!nb;")
	private final Class67_Sub1 aClass67_Sub1_6;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!nb;Lclient!d;)V")
	public Class167(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) Interface2 arg1) {
		this.anInterface2_6 = arg1;
		this.aClass67_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public void method4096() {
		this.aClass338_22.method8052(5);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public void method4097() {
		this.aClass338_22.method8051();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)Lclient!gp;")
	public Interface6 method4098(@OriginalArg(0) int arg0) {
		@Pc(20) Object local20 = this.aClass338_22.method8049((long) arg0);
		if (local20 != null) {
			return (Interface6) local20;
		} else if (this.anInterface2_6.method1024(arg0)) {
			@Pc(43) Class32 local43 = this.anInterface2_6.method1027(arg0);
			@Pc(53) int local53 = local43.aBoolean71 ? 64 : this.aClass67_Sub1_6.anInt6661;
			@Pc(115) Interface6 local115;
			if (local43.aBoolean66 && this.aClass67_Sub1_6.method7643()) {
				@Pc(127) float[] local127 = this.anInterface2_6.method1029(0.7F, local53, local53, arg0);
				local115 = this.aClass67_Sub1_6.method5678(local43.aByte21 != 0, local53, local53, Static557.aClass145_14, local127);
			} else {
				@Pc(85) int[] local85;
				if (local43.anInt861 != 2 && Static627.method8496(local43.aByte25)) {
					local85 = this.anInterface2_6.method1025(local53, local53, 0.7F, arg0, true);
				} else {
					local85 = this.anInterface2_6.method1026(0.7F, local53, local53, arg0);
				}
				local115 = this.aClass67_Sub1_6.method5567(local53, local43.aByte21 != 0, local53, local85);
			}
			local115.method9275(local43.aBoolean64, local43.aBoolean68);
			this.aClass338_22.method8044((long) arg0, local115);
			return local115;
		} else {
			return null;
		}
	}
}
