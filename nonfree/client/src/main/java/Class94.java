import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class94 {

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "Lclient!sw;")
	private final Class277 aClass277_17 = new Class277(256);

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "Lclient!n;")
	private final Interface13 anInterface13_7;

	@OriginalMember(owner = "client!faa", name = "h", descriptor = "Lclient!bda;")
	private final Class4_Sub2 aClass4_Sub2_4;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lclient!bda;Lclient!n;)V")
	public Class94(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) Interface13 arg1) {
		this.anInterface13_7 = arg1;
		this.aClass4_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(BI)Lclient!eea;")
	public Interface5 method2333(@OriginalArg(1) int arg0) {
		@Pc(20) Object local20 = this.aClass277_17.method7014((long) arg0);
		if (local20 != null) {
			return (Interface5) local20;
		} else if (this.anInterface13_7.method5788(arg0)) {
			@Pc(39) Class296 local39 = this.anInterface13_7.method5789(arg0);
			@Pc(48) int local48 = local39.aBoolean638 ? 64 : this.aClass4_Sub2_4.anInt8320;
			@Pc(99) Interface5 local99;
			if (local39.aBoolean644 && this.aClass4_Sub2_4.method7182()) {
				@Pc(111) float[] local111 = this.anInterface13_7.method5787(local48, local48, 0.7F, arg0);
				local99 = this.aClass4_Sub2_4.method7302(Static171.aClass110_13, local39.aByte102 != 0, local111, local48, local48);
			} else {
				@Pc(80) int[] local80 = local39.aBoolean637 ? this.anInterface13_7.method5786(0.7F, local48, local48, arg0) : this.anInterface13_7.method5790(local48, true, 0.7F, arg0, local48);
				local99 = this.aClass4_Sub2_4.method7271(local80, local48, local48, local39.aByte102 != 0);
			}
			local99.method7769(local39.aBoolean645, local39.aBoolean643);
			this.aClass277_17.method7016(local99, (long) arg0);
			return local99;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)V")
	public void method2334() {
		this.aClass277_17.method7019();
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
	public void method2337() {
		this.aClass277_17.method7018(5);
	}
}
