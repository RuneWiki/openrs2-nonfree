import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class101 {

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "Lclient!gg;")
	private final Class112 aClass112_17 = new Class112(256);

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Lclient!bm;")
	private final Class33_Sub1 aClass33_Sub1_6;

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "Lclient!d;")
	private final Interface5 anInterface5_7;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!bm;Lclient!d;)V")
	public Class101(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) Interface5 arg1) {
		this.aClass33_Sub1_6 = arg0;
		this.anInterface5_7 = arg1;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
	public void method3354() {
		this.aClass112_17.method3637(5);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public void method3355() {
		this.aClass112_17.method3638();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Lclient!baa;")
	public Interface2 method3356(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass112_17.method3640((long) arg0);
		if (local12 != null) {
			return (Interface2) local12;
		} else if (this.anInterface5_7.method6867(arg0)) {
			@Pc(31) Class156 local31 = this.anInterface5_7.method6869(arg0);
			@Pc(40) int local40 = local31.aBoolean494 ? 64 : this.aClass33_Sub1_6.anInt2188;
			@Pc(99) Interface2 local99;
			if (local31.aBoolean498 && this.aClass33_Sub1_6.method6185()) {
				@Pc(111) float[] local111 = this.anInterface5_7.method6871(local40, arg0, 0.7F, local40);
				local99 = this.aClass33_Sub1_6.method1986(local40, Static333.aClass82_9, local40, local111, local31.aByte70 != 0);
			} else {
				@Pc(73) int[] local73;
				if (local31.anInt5679 != 2 && Static237.method4550(local31.aByte69)) {
					local73 = this.anInterface5_7.method6868(true, 0.7F, local40, arg0, local40);
				} else {
					local73 = this.anInterface5_7.method6870(arg0, 0.7F, local40, local40);
				}
				local99 = this.aClass33_Sub1_6.method2023(local73, local31.aByte70 != 0, local40, local40);
			}
			local99.method6506(local31.aBoolean492, local31.aBoolean495);
			this.aClass112_17.method3636((long) arg0, local99);
			return local99;
		} else {
			return null;
		}
	}
}
