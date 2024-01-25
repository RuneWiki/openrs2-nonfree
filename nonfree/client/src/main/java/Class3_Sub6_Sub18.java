import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class3_Sub6_Sub18 extends Class3_Sub6 {

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
	public int anInt8497;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
	public int anInt8498;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
	public int anInt8499;

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
	public int anInt8500;

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
	public int anInt8501;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "Lclient!qr;")
	public final Class298 aClass298_2;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "Lclient!om;")
	public final Class265 aClass265_1;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!qr;Lclient!f;)V")
	public Class3_Sub6_Sub18(@OriginalArg(0) Class298 arg0, @OriginalArg(1) Class23_Sub5 arg1) {
		this.aClass298_2 = arg0;
		this.aClass265_1 = this.aClass298_2.method7100();
		this.method7191();
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
	public void method7191() {
		this.anInt8498 = this.aClass298_2.anInt8373;
		this.anInt8499 = this.aClass298_2.anInt8378;
		this.anInt8501 = this.aClass298_2.anInt8379;
		if (this.aClass298_2.aClass25_7 != null) {
			this.aClass298_2.aClass25_7.method4295(this.aClass265_1.anInt7624, this.aClass265_1.anInt7612, this.aClass265_1.anInt7615, Static319.anIntArray384);
		}
		this.anInt8500 = Static319.anIntArray384[2];
		this.anInt8497 = Static319.anIntArray384[0];
	}
}
