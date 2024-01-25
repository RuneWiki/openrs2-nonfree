import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class280 {

	@OriginalMember(owner = "client!pw", name = "j", descriptor = "Lclient!rg;")
	private Class2_Sub7 aClass2_Sub7_43 = new Class2_Sub7();

	@OriginalMember(owner = "client!pw", name = "k", descriptor = "Lclient!qk;")
	private final Class290 aClass290_6 = new Class290();

	@OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
	private int anInt7379;

	@OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
	private final int anInt7380;

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "Lclient!tba;")
	private final Class323 aClass323_26;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(I)V")
	public Class280(@OriginalArg(0) int arg0) {
		this.anInt7379 = arg0;
		this.anInt7380 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass323_26 = new Class323(local19);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IJ)Lclient!rg;")
	public Class2_Sub7 method6424(@OriginalArg(1) long arg0) {
		@Pc(18) Class2_Sub7 local18 = (Class2_Sub7) this.aClass323_26.method7484(arg0);
		if (local18 != null) {
			this.aClass290_6.method6678(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(IJ)V")
	public void method6425(@OriginalArg(1) long arg0) {
		@Pc(10) Class2_Sub7 local10 = (Class2_Sub7) this.aClass323_26.method7484(arg0);
		if (local10 != null) {
			local10.method8920();
			local10.method8504();
			this.anInt7379++;
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)V")
	public void method6427() {
		this.aClass290_6.method6675();
		this.aClass323_26.method7485();
		this.aClass2_Sub7_43 = new Class2_Sub7();
		this.anInt7379 = this.anInt7380;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IJLclient!rg;)V")
	public void method6428(@OriginalArg(1) long arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		if (this.anInt7379 == 0) {
			@Pc(31) Class2_Sub7 local31 = this.aClass290_6.method6676();
			local31.method8920();
			local31.method8504();
			if (this.aClass2_Sub7_43 == local31) {
				local31 = this.aClass290_6.method6676();
				local31.method8920();
				local31.method8504();
			}
		} else {
			this.anInt7379--;
		}
		this.aClass323_26.method7477(arg1, arg0);
		this.aClass290_6.method6678(arg1);
	}
}
