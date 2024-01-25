import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
	public int anInt2756;

	@OriginalMember(owner = "client!hr", name = "z", descriptor = "I")
	public int anInt2757;

	@OriginalMember(owner = "client!hr", name = "B", descriptor = "I")
	public int anInt2759;

	@OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
	public int anInt2761;

	@OriginalMember(owner = "client!hr", name = "G", descriptor = "I")
	public int anInt2762;

	@OriginalMember(owner = "client!hr", name = "I", descriptor = "Lclient!wq;")
	public final Class265 aClass265_1;

	@OriginalMember(owner = "client!hr", name = "E", descriptor = "Lclient!aw;")
	public final Class18 aClass18_1;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!wq;Lclient!rb;)V")
	public Class1_Sub1_Sub8(@OriginalArg(0) Class265 arg0, @OriginalArg(1) Class36_Sub7 arg1) {
		this.aClass265_1 = arg0;
		this.aClass18_1 = this.aClass265_1.method5979();
		this.method2450();
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(B)V")
	public void method2450() {
		this.anInt2759 = this.aClass265_1.anInt7755;
		this.anInt2757 = this.aClass265_1.anInt7754;
		this.anInt2761 = this.aClass265_1.anInt7757;
		if (this.aClass265_1.aClass43_5 != null) {
			this.aClass265_1.aClass43_5.E(this.aClass18_1.anInt322, this.aClass18_1.anInt319, this.aClass18_1.anInt306, Static441.anIntArray573);
		}
		this.anInt2762 = Static441.anIntArray573[2];
		this.anInt2756 = Static441.anIntArray573[0];
	}
}
