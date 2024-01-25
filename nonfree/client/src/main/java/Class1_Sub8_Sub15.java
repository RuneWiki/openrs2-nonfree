import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public final class Class1_Sub8_Sub15 extends Class1_Sub8 {

	@OriginalMember(owner = "client!sw", name = "x", descriptor = "I")
	public int anInt8354;

	@OriginalMember(owner = "client!sw", name = "z", descriptor = "I")
	public int anInt8355;

	@OriginalMember(owner = "client!sw", name = "D", descriptor = "I")
	public int anInt8356;

	@OriginalMember(owner = "client!sw", name = "E", descriptor = "I")
	public int anInt8357;

	@OriginalMember(owner = "client!sw", name = "I", descriptor = "I")
	public int anInt8359;

	@OriginalMember(owner = "client!sw", name = "B", descriptor = "Lclient!lp;")
	public final Class212 aClass212_2;

	@OriginalMember(owner = "client!sw", name = "y", descriptor = "Lclient!kba;")
	public final Class183 aClass183_1;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lclient!lp;Lclient!oa;)V")
	public Class1_Sub8_Sub15(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class11_Sub9 arg1) {
		this.aClass212_2 = arg0;
		this.aClass183_1 = this.aClass212_2.method4603();
		this.method6744();
	}

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "(I)V")
	public void method6744() {
		this.anInt8359 = this.aClass212_2.anInt5655;
		this.anInt8355 = this.aClass212_2.anInt5651;
		this.anInt8357 = this.aClass212_2.anInt5653;
		if (this.aClass212_2.aClass34_4 != null) {
			this.aClass212_2.aClass34_4.wa(this.aClass183_1.anInt4755, this.aClass183_1.anInt4763, this.aClass183_1.anInt4759, Static167.anIntArray144);
		}
		this.anInt8354 = Static167.anIntArray144[2];
		this.anInt8356 = Static167.anIntArray144[0];
	}
}
