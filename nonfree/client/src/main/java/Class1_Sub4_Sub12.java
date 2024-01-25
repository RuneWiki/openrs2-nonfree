import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public final class Class1_Sub4_Sub12 extends Class1_Sub4 {

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
	public int anInt2611;

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
	public int anInt2612;

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
	public int anInt2616;

	@OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
	public int anInt2620;

	@OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
	public int anInt2621;

	@OriginalMember(owner = "client!hj", name = "D", descriptor = "Lclient!kh;")
	public final Class115 aClass115_1;

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "Lclient!ti;")
	public final Class195 aClass195_1;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!kh;Lclient!kq;)V")
	public Class1_Sub4_Sub12(@OriginalArg(0) Class115 arg0, @OriginalArg(1) Class8_Sub6 arg1) {
		this.aClass115_1 = arg0;
		this.aClass195_1 = Static91.method1962(arg0.anInt3429);
		this.method2426();
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V")
	public void method2426() {
		this.anInt2616 = this.aClass115_1.anInt3427;
		this.anInt2611 = this.aClass115_1.anInt3426;
		this.anInt2612 = this.aClass115_1.anInt3423;
		if (this.aClass115_1.aClass109_23 != null) {
			this.aClass115_1.aClass109_23.method3876(this.aClass195_1.anInt6016, this.aClass195_1.anInt6012, this.aClass195_1.anInt6011, Static290.anIntArray481);
		}
		this.anInt2620 = Static290.anIntArray481[2];
		this.anInt2621 = Static290.anIntArray481[0];
	}
}
