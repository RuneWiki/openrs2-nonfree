import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public final class Class6_Sub2_Sub11 extends Class6_Sub2 {

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
	public int anInt4791;

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
	public int anInt4792;

	@OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
	public int anInt4796;

	@OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
	public int anInt4798;

	@OriginalMember(owner = "client!jo", name = "C", descriptor = "I")
	public int anInt4799;

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "Lclient!fd;")
	public final Class90 aClass90_2;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "Lclient!cb;")
	public final Class42 aClass42_1;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!fd;Lclient!l;)V")
	public Class6_Sub2_Sub11(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class98_Sub3 arg1) {
		this.aClass90_2 = arg0;
		this.aClass42_1 = this.aClass90_2.method2598();
		this.method4110();
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)V")
	public void method4110() {
		this.anInt4792 = this.aClass90_2.anInt2971;
		this.anInt4799 = this.aClass90_2.anInt2974;
		this.anInt4798 = this.aClass90_2.anInt2976;
		if (this.aClass90_2.aClass54_5 != null) {
			this.aClass90_2.aClass54_5.R(this.aClass42_1.anInt1160, this.aClass42_1.anInt1170, this.aClass42_1.anInt1172, Static540.anIntArray253);
		}
		this.anInt4791 = Static540.anIntArray253[2];
		this.anInt4796 = Static540.anIntArray253[0];
	}
}
