import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class261 {

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "Lclient!gk;")
	private Class5_Sub2 aClass5_Sub2_56 = new Class5_Sub2();

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "Lclient!jh;")
	private final Class123 aClass123_12 = new Class123();

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
	private int anInt7357;

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
	private final int anInt7358;

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "Lclient!vg;")
	private final Class252 aClass252_41;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
	public Class261(@OriginalArg(0) int arg0) {
		this.anInt7357 = arg0;
		this.anInt7358 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass252_41 = new Class252(local19);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public void method5896() {
		this.aClass123_12.method2622();
		this.aClass252_41.method5661();
		this.aClass5_Sub2_56 = new Class5_Sub2();
		this.anInt7357 = this.anInt7358;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(JB)Lclient!gk;")
	public Class5_Sub2 method5897(@OriginalArg(0) long arg0) {
		@Pc(10) Class5_Sub2 local10 = (Class5_Sub2) this.aClass252_41.method5659(arg0);
		if (local10 != null) {
			this.aClass123_12.method2620(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(JLclient!gk;I)V")
	public void method5900(@OriginalArg(0) long arg0, @OriginalArg(1) Class5_Sub2 arg1) {
		if (this.anInt7357 == 0) {
			@Pc(19) Class5_Sub2 local19 = this.aClass123_12.method2619();
			local19.method6003();
			local19.method6006();
			if (this.aClass5_Sub2_56 == local19) {
				local19 = this.aClass123_12.method2619();
				local19.method6003();
				local19.method6006();
			}
		} else {
			this.anInt7357--;
		}
		this.aClass252_41.method5658(arg1, arg0);
		this.aClass123_12.method2620(arg1);
	}
}
