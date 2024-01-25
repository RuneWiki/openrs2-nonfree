import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class14_Sub3_Sub17 extends Class14_Sub3 {

	@OriginalMember(owner = "client!tm", name = "y", descriptor = "I")
	public int anInt9950;

	@OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
	public int anInt9951;

	@OriginalMember(owner = "client!tm", name = "A", descriptor = "I")
	public int anInt9952;

	@OriginalMember(owner = "client!tm", name = "C", descriptor = "I")
	public int anInt9953;

	@OriginalMember(owner = "client!tm", name = "I", descriptor = "I")
	public int anInt9957;

	@OriginalMember(owner = "client!tm", name = "J", descriptor = "Lclient!oq;")
	public final Class265 aClass265_2;

	@OriginalMember(owner = "client!tm", name = "B", descriptor = "Lclient!ej;")
	public final Class93 aClass93_1;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!oq;Lclient!cv;)V")
	public Class14_Sub3_Sub17(@OriginalArg(0) Class265 arg0, @OriginalArg(1) Class12_Sub4 arg1) {
		this.aClass265_2 = arg0;
		this.aClass93_1 = this.aClass265_2.method6432();
		this.method8286();
	}

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "(B)V")
	public void method8286() {
		this.anInt9950 = this.aClass265_2.anInt7791;
		this.anInt9953 = this.aClass265_2.anInt7790;
		this.anInt9951 = this.aClass265_2.anInt7792;
		if (this.aClass265_2.aClass26_10 != null) {
			this.aClass265_2.aClass26_10.method6453(this.aClass93_1.anInt2586, this.aClass93_1.anInt2583, this.aClass93_1.anInt2577, Static586.anIntArray731);
		}
		this.anInt9957 = Static586.anIntArray731[0];
		this.anInt9952 = Static586.anIntArray731[2];
	}
}
