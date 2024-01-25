import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oea")
public final class Class245 {

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "Lclient!vda;")
	private Class4_Sub5 aClass4_Sub5_46 = new Class4_Sub5();

	@OriginalMember(owner = "client!oea", name = "h", descriptor = "Lclient!an;")
	private final Class18 aClass18_3 = new Class18();

	@OriginalMember(owner = "client!oea", name = "g", descriptor = "I")
	private final int anInt7229;

	@OriginalMember(owner = "client!oea", name = "i", descriptor = "I")
	private int anInt7230;

	@OriginalMember(owner = "client!oea", name = "j", descriptor = "Lclient!waa;")
	private final Class350 aClass350_30;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(I)V")
	public Class245(@OriginalArg(0) int arg0) {
		this.anInt7229 = arg0;
		this.anInt7230 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass350_30 = new Class350(local19);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!vda;IJ)V")
	public void method5975(@OriginalArg(0) Class4_Sub5 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt7230 == 0) {
			@Pc(10) Class4_Sub5 local10 = this.aClass18_3.method226();
			local10.method8379();
			local10.method8015();
			if (local10 == this.aClass4_Sub5_46) {
				local10 = this.aClass18_3.method226();
				local10.method8379();
				local10.method8015();
			}
		} else {
			this.anInt7230--;
		}
		this.aClass350_30.method8199(arg1, arg0);
		this.aClass18_3.method219(arg0);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IJ)Lclient!vda;")
	public Class4_Sub5 method5976(@OriginalArg(1) long arg0) {
		@Pc(16) Class4_Sub5 local16 = (Class4_Sub5) this.aClass350_30.method8207(arg0);
		if (local16 != null) {
			this.aClass18_3.method219(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)V")
	public void method5977() {
		this.aClass18_3.method227();
		this.aClass350_30.method8203();
		this.aClass4_Sub5_46 = new Class4_Sub5();
		this.anInt7230 = this.anInt7229;
	}
}
