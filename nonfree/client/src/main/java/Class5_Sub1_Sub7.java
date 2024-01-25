import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class5_Sub1_Sub7 extends Class5_Sub1 {

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
	public int anInt3750;

	@OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
	public int anInt3751;

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
	public int anInt3752;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
	public int anInt3754;

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
	public int anInt3755;

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "Lclient!ok;")
	public final Class270 aClass270_1;

	@OriginalMember(owner = "client!hi", name = "C", descriptor = "Lclient!ot;")
	public final Class274 aClass274_1;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!ok;Lclient!tn;)V")
	public Class5_Sub1_Sub7(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class4_Sub9 arg1) {
		this.aClass270_1 = arg0;
		this.aClass274_1 = this.aClass270_1.method6191();
		this.method3435();
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V")
	public void method3435() {
		this.anInt3752 = this.aClass270_1.anInt7120;
		this.anInt3754 = this.aClass270_1.anInt7124;
		this.anInt3750 = this.aClass270_1.anInt7119;
		if (this.aClass270_1.aClass10_7 != null) {
			this.aClass270_1.aClass10_7.method4228(this.aClass274_1.anInt7214, this.aClass274_1.anInt7224, this.aClass274_1.anInt7223, Static571.anIntArray518);
		}
		this.anInt3755 = Static571.anIntArray518[2];
		this.anInt3751 = Static571.anIntArray518[0];
	}
}
