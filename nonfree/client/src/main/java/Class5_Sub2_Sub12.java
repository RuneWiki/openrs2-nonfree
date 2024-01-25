import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public final class Class5_Sub2_Sub12 extends Class5_Sub2 {

	@OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
	public int anInt2252;

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
	public int anInt2253;

	@OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
	public int anInt2254;

	@OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
	public int anInt2255;

	@OriginalMember(owner = "client!dt", name = "B", descriptor = "I")
	public int anInt2257;

	@OriginalMember(owner = "client!dt", name = "z", descriptor = "Lclient!tf;")
	public final Class280 aClass280_1;

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "Lclient!i;")
	public final Class137 aClass137_1;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!tf;Lclient!qp;)V")
	public Class5_Sub2_Sub12(@OriginalArg(0) Class280 arg0, @OriginalArg(1) Class30_Sub7 arg1) {
		this.aClass280_1 = arg0;
		this.aClass137_1 = this.aClass280_1.method6569();
		this.method2084();
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(B)V")
	public void method2084() {
		this.anInt2252 = this.aClass280_1.anInt8070;
		this.anInt2254 = this.aClass280_1.anInt8068;
		this.anInt2255 = this.aClass280_1.anInt8075;
		if (this.aClass280_1.aClass78_6 != null) {
			this.aClass280_1.aClass78_6.I(this.aClass137_1.anInt3805, this.aClass137_1.anInt3811, this.aClass137_1.anInt3799, Static410.anIntArray567);
		}
		this.anInt2253 = Static410.anIntArray567[2];
		this.anInt2257 = Static410.anIntArray567[0];
	}
}
