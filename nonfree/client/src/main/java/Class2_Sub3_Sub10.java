import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class2_Sub3_Sub10 extends Class2_Sub3 {

	@OriginalMember(owner = "client!mt", name = "s", descriptor = "I")
	public int anInt6242;

	@OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
	public int anInt6243;

	@OriginalMember(owner = "client!mt", name = "u", descriptor = "I")
	public int anInt6244;

	@OriginalMember(owner = "client!mt", name = "y", descriptor = "I")
	public int anInt6246;

	@OriginalMember(owner = "client!mt", name = "z", descriptor = "I")
	public int anInt6247;

	@OriginalMember(owner = "client!mt", name = "x", descriptor = "Lclient!qg;")
	public final Class270 aClass270_1;

	@OriginalMember(owner = "client!mt", name = "v", descriptor = "Lclient!vj;")
	public final Class349 aClass349_1;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!qg;Lclient!tq;)V")
	public Class2_Sub3_Sub10(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		this.aClass270_1 = arg0;
		this.aClass349_1 = this.aClass270_1.method6130();
		this.method5185();
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)V")
	public void method5185() {
		this.anInt6244 = this.aClass270_1.anInt7320;
		this.anInt6242 = this.aClass270_1.anInt7321;
		this.anInt6247 = this.aClass270_1.anInt7314;
		if (this.aClass270_1.aClass68_6 != null) {
			this.aClass270_1.aClass68_6.wa(this.aClass349_1.anInt9209, this.aClass349_1.anInt9210, this.aClass349_1.anInt9200, Static193.anIntArray226);
		}
		this.anInt6246 = Static193.anIntArray226[0];
		this.anInt6243 = Static193.anIntArray226[2];
	}
}
