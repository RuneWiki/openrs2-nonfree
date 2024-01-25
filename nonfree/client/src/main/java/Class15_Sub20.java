import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qla")
public final class Class15_Sub20 extends Class15 {

	@OriginalMember(owner = "client!qla", name = "i", descriptor = "I")
	private final int anInt8328;

	@OriginalMember(owner = "client!qla", name = "u", descriptor = "I")
	private final int anInt8329;

	@OriginalMember(owner = "client!qla", name = "k", descriptor = "I")
	private final int anInt8322;

	@OriginalMember(owner = "client!qla", name = "n", descriptor = "I")
	private final int anInt8326;

	@OriginalMember(owner = "client!qla", name = "o", descriptor = "I")
	private final int anInt8331;

	@OriginalMember(owner = "client!qla", name = "m", descriptor = "I")
	private final int anInt8334;

	@OriginalMember(owner = "client!qla", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub20(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt8328 = arg0.method8575();
		this.anInt8329 = arg0.method8575();
		this.anInt8322 = arg0.method8575();
		this.anInt8326 = arg0.method8575();
		this.anInt8331 = arg0.method8575();
		this.anInt8334 = arg0.method8575();
	}

	@OriginalMember(owner = "client!qla", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		Static73.aClass256Array1[this.anInt8328].method6148(0);
		Static73.aClass256Array1[this.anInt8329].method6148(1);
		Static165.anInt2831 = 0;
		Static577.anInt9120 = this.anInt8331;
		Static220.anInt3520 = this.anInt8334;
		Static60.anInt1040 = 3;
		Static144.anInt2464 = 1;
		Static119.anInt2000 = this.anInt8326;
		Static654.anInt10226 = 0;
		Static599.anInt9313 = this.anInt8322;
		Static578.method8065();
		Static337.aBoolean444 = true;
	}
}
