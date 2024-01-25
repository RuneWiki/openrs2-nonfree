import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class3_Sub7_Sub16 extends Class3_Sub7 {

	@OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
	public int anInt7408;

	@OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
	public int anInt7409;

	@OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
	public int anInt7410;

	@OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
	public int anInt7412;

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
	public int anInt7413;

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "Lclient!rea;")
	public final Class280 aClass280_1;

	@OriginalMember(owner = "client!pk", name = "M", descriptor = "Lclient!mh;")
	public final Class205 aClass205_1;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!rea;Lclient!iu;)V")
	public Class3_Sub7_Sub16(@OriginalArg(0) Class280 arg0, @OriginalArg(1) Class25_Sub7 arg1) {
		this.aClass280_1 = arg0;
		this.aClass205_1 = this.aClass280_1.method6283();
		this.method5788();
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
	public void method5788() {
		this.anInt7412 = this.aClass280_1.anInt7971;
		this.anInt7410 = this.aClass280_1.anInt7964;
		this.anInt7409 = this.aClass280_1.anInt7965;
		if (this.aClass280_1.aClass42_5 != null) {
			this.aClass280_1.aClass42_5.wa(this.aClass205_1.anInt6025, this.aClass205_1.anInt6031, this.aClass205_1.anInt6019, Static74.anIntArray66);
		}
		this.anInt7413 = Static74.anIntArray66[2];
		this.anInt7408 = Static74.anIntArray66[0];
	}
}
