import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class321 {

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "Lclient!bm;")
	private Class3_Sub7 aClass3_Sub7_52 = new Class3_Sub7();

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "Lclient!ce;")
	private final Class49 aClass49_10 = new Class49();

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
	private final int anInt9175;

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
	private int anInt9174;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "Lclient!sba;")
	private final Class297 aClass297_32;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(I)V")
	public Class321(@OriginalArg(0) int arg0) {
		this.anInt9175 = arg0;
		this.anInt9174 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass297_32 = new Class297(local19);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IJ)Lclient!bm;")
	public Class3_Sub7 method7220(@OriginalArg(1) long arg0) {
		@Pc(18) Class3_Sub7 local18 = (Class3_Sub7) this.aClass297_32.method6531(arg0);
		if (local18 != null) {
			this.aClass49_10.method1455(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)V")
	public void method7222() {
		this.aClass49_10.method1450();
		this.aClass297_32.method6535();
		this.aClass3_Sub7_52 = new Class3_Sub7();
		this.anInt9174 = this.anInt9175;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IJLclient!bm;)V")
	public void method7223(@OriginalArg(1) long arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (this.anInt9174 == 0) {
			@Pc(19) Class3_Sub7 local19 = this.aClass49_10.method1452();
			local19.method8128();
			local19.method8136();
			if (this.aClass3_Sub7_52 == local19) {
				local19 = this.aClass49_10.method1452();
				local19.method8128();
				local19.method8136();
			}
		} else {
			this.anInt9174--;
		}
		this.aClass297_32.method6537(arg0, arg1);
		this.aClass49_10.method1455(arg1);
	}
}
