import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class5_Sub5_Sub1 extends Class5_Sub5 {

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
	public int anInt561;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
	public int anInt562;

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
	public int anInt564;

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
	public int anInt566;

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
	public int anInt567;

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "Lclient!sn;")
	public final Class320 aClass320_1;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "Lclient!tda;")
	public final Class328 aClass328_1;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!sn;Lclient!em;)V")
	public Class5_Sub5_Sub1(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class4_Sub4 arg1) {
		this.aClass320_1 = arg0;
		this.aClass328_1 = this.aClass320_1.method7683();
		this.method537();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public void method537() {
		this.anInt567 = this.aClass320_1.anInt8925;
		this.anInt562 = this.aClass320_1.anInt8923;
		this.anInt564 = this.aClass320_1.anInt8926;
		if (this.aClass320_1.aClass113_8 != null) {
			this.aClass320_1.aClass113_8.method8447(this.aClass328_1.anInt9107, this.aClass328_1.anInt9117, this.aClass328_1.anInt9115, Static600.anIntArray575);
		}
		this.anInt566 = Static600.anIntArray575[0];
		this.anInt561 = Static600.anIntArray575[2];
	}
}
