import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class10_Sub1_Sub10 extends Class10_Sub1 {

	@OriginalMember(owner = "client!m", name = "v", descriptor = "I")
	public int anInt4406;

	@OriginalMember(owner = "client!m", name = "y", descriptor = "I")
	public int anInt4407;

	@OriginalMember(owner = "client!m", name = "A", descriptor = "I")
	public int anInt4408;

	@OriginalMember(owner = "client!m", name = "G", descriptor = "I")
	public int anInt4411;

	@OriginalMember(owner = "client!m", name = "H", descriptor = "I")
	public int anInt4412;

	@OriginalMember(owner = "client!m", name = "x", descriptor = "Lclient!kh;")
	public final Class141 aClass141_2;

	@OriginalMember(owner = "client!m", name = "F", descriptor = "Lclient!ti;")
	public final Class236 aClass236_1;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!kh;Lclient!oi;)V")
	public Class10_Sub1_Sub10(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class40_Sub6 arg1) {
		this.aClass141_2 = arg0;
		this.aClass236_1 = this.aClass141_2.method3256();
		this.method3554();
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(B)V")
	public void method3554() {
		this.anInt4408 = this.aClass141_2.anInt4095;
		this.anInt4412 = this.aClass141_2.anInt4093;
		this.anInt4406 = this.aClass141_2.anInt4092;
		if (this.aClass141_2.aClass34_3 != null) {
			this.aClass141_2.aClass34_3.K(this.aClass236_1.anInt6619, this.aClass236_1.anInt6605, this.aClass236_1.anInt6611, Static337.anIntArray556);
		}
		this.anInt4407 = Static337.anIntArray556[0];
		this.anInt4411 = Static337.anIntArray556[2];
	}
}
