import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class4_Sub5_Sub1 extends Class4_Sub5 {

	@OriginalMember(owner = "client!al", name = "v", descriptor = "I")
	public int anInt327;

	@OriginalMember(owner = "client!al", name = "x", descriptor = "I")
	public int anInt328;

	@OriginalMember(owner = "client!al", name = "y", descriptor = "I")
	public int anInt329;

	@OriginalMember(owner = "client!al", name = "z", descriptor = "I")
	public int anInt330;

	@OriginalMember(owner = "client!al", name = "G", descriptor = "I")
	public int anInt333;

	@OriginalMember(owner = "client!al", name = "C", descriptor = "Lclient!ir;")
	public final Class170 aClass170_1;

	@OriginalMember(owner = "client!al", name = "B", descriptor = "Lclient!rq;")
	public final Class320 aClass320_1;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!ir;Lclient!sia;)V")
	public Class4_Sub5_Sub1(@OriginalArg(0) Class170 arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		this.aClass170_1 = arg0;
		this.aClass320_1 = this.aClass170_1.method3791();
		this.method322();
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
	public void method322() {
		this.anInt328 = this.aClass170_1.anInt4270;
		this.anInt330 = this.aClass170_1.anInt4272;
		this.anInt329 = this.aClass170_1.anInt4275;
		if (this.aClass170_1.aClass92_3 != null) {
			this.aClass170_1.aClass92_3.method3855(this.aClass320_1.anInt8193, this.aClass320_1.anInt8180, this.aClass320_1.anInt8189, Static281.anIntArray345);
		}
		this.anInt333 = Static281.anIntArray345[2];
		this.anInt327 = Static281.anIntArray345[0];
	}
}
