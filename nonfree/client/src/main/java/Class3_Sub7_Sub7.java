import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public final class Class3_Sub7_Sub7 extends Class3_Sub7 {

	@OriginalMember(owner = "client!fba", name = "x", descriptor = "I")
	public int anInt2994;

	@OriginalMember(owner = "client!fba", name = "z", descriptor = "I")
	public int anInt2996;

	@OriginalMember(owner = "client!fba", name = "A", descriptor = "I")
	public int anInt2997;

	@OriginalMember(owner = "client!fba", name = "B", descriptor = "I")
	public int anInt2998;

	@OriginalMember(owner = "client!fba", name = "D", descriptor = "I")
	public int anInt2999;

	@OriginalMember(owner = "client!fba", name = "C", descriptor = "Lclient!qr;")
	public final Class281 aClass281_1;

	@OriginalMember(owner = "client!fba", name = "K", descriptor = "Lclient!uca;")
	public final Class334 aClass334_1;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!qr;Lclient!wca;)V")
	public Class3_Sub7_Sub7(@OriginalArg(0) Class281 arg0, @OriginalArg(1) Class41_Sub9 arg1) {
		this.aClass281_1 = arg0;
		this.aClass334_1 = this.aClass281_1.method6193();
		this.method2695();
	}

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "(I)V")
	public void method2695() {
		this.anInt2996 = this.aClass281_1.anInt7413;
		this.anInt2999 = this.aClass281_1.anInt7412;
		this.anInt2997 = this.aClass281_1.anInt7418;
		if (this.aClass281_1.aClass11_5 != null) {
			this.aClass281_1.aClass11_5.wa(this.aClass334_1.anInt8427, this.aClass334_1.anInt8437, this.aClass334_1.anInt8436, Static452.anIntArray475);
		}
		this.anInt2998 = Static452.anIntArray475[0];
		this.anInt2994 = Static452.anIntArray475[2];
	}
}
