import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class Class3_Sub7_Sub11 extends Class3_Sub7 {

	@OriginalMember(owner = "client!p", name = "x", descriptor = "I")
	public int anInt4662;

	@OriginalMember(owner = "client!p", name = "D", descriptor = "I")
	public int anInt4665;

	@OriginalMember(owner = "client!p", name = "E", descriptor = "I")
	public int anInt4666;

	@OriginalMember(owner = "client!p", name = "G", descriptor = "I")
	public int anInt4668;

	@OriginalMember(owner = "client!p", name = "I", descriptor = "I")
	public int anInt4669;

	@OriginalMember(owner = "client!p", name = "C", descriptor = "Lclient!mm;")
	public final Class158 aClass158_2;

	@OriginalMember(owner = "client!p", name = "B", descriptor = "Lclient!wl;")
	public final Class250 aClass250_1;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!mm;Lclient!g;)V")
	public Class3_Sub7_Sub11(@OriginalArg(0) Class158 arg0, @OriginalArg(1) Class12_Sub4 arg1) {
		this.aClass158_2 = arg0;
		this.aClass250_1 = Static245.method4024(arg0.anInt3921);
		this.method4183();
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
	public void method4183() {
		this.anInt4662 = this.aClass158_2.anInt3922;
		this.anInt4669 = this.aClass158_2.anInt3920;
		this.anInt4665 = this.aClass158_2.anInt3919;
		if (this.aClass158_2.aClass118_6 != null) {
			this.aClass158_2.aClass118_6.method2664(this.aClass250_1.anInt6447, this.aClass250_1.anInt6458, this.aClass250_1.anInt6449, Static29.anIntArray488);
		}
		this.anInt4666 = Static29.anIntArray488[2];
		this.anInt4668 = Static29.anIntArray488[0];
	}
}
