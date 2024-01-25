import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public final class Class6_Sub4_Sub16 extends Class6_Sub4 {

	@OriginalMember(owner = "client!sfa", name = "v", descriptor = "I")
	public int anInt8561;

	@OriginalMember(owner = "client!sfa", name = "x", descriptor = "I")
	public int anInt8562;

	@OriginalMember(owner = "client!sfa", name = "y", descriptor = "I")
	public int anInt8563;

	@OriginalMember(owner = "client!sfa", name = "z", descriptor = "I")
	public int anInt8564;

	@OriginalMember(owner = "client!sfa", name = "C", descriptor = "I")
	public int anInt8567;

	@OriginalMember(owner = "client!sfa", name = "E", descriptor = "Lclient!haa;")
	public final Class128 aClass128_2;

	@OriginalMember(owner = "client!sfa", name = "w", descriptor = "Lclient!vf;")
	public final Class330 aClass330_1;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lclient!haa;Lclient!hm;)V")
	public Class6_Sub4_Sub16(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class5_Sub2 arg1) {
		this.aClass128_2 = arg0;
		this.aClass330_1 = this.aClass128_2.method3602();
		this.method7156();
	}

	@OriginalMember(owner = "client!sfa", name = "e", descriptor = "(B)V")
	public void method7156() {
		this.anInt8567 = this.aClass128_2.anInt4089;
		this.anInt8563 = this.aClass128_2.anInt4086;
		this.anInt8562 = this.aClass128_2.anInt4091;
		if (this.aClass128_2.aClass8_5 != null) {
			this.aClass128_2.aClass8_5.R(this.aClass330_1.anInt9293, this.aClass330_1.anInt9295, this.aClass330_1.anInt9309, Static165.anIntArray248);
		}
		this.anInt8561 = Static165.anIntArray248[0];
		this.anInt8564 = Static165.anIntArray248[2];
	}
}
