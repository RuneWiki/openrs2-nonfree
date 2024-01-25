import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class6_Sub2_Sub15 extends Class6_Sub2 {

	@OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
	public int anInt7273;

	@OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
	public int anInt7274;

	@OriginalMember(owner = "client!nq", name = "H", descriptor = "I")
	public int anInt7276;

	@OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
	public int anInt7277;

	@OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
	public int anInt7278;

	@OriginalMember(owner = "client!nq", name = "C", descriptor = "Lclient!ol;")
	public final Class243 aClass243_1;

	@OriginalMember(owner = "client!nq", name = "E", descriptor = "Lclient!fl;")
	public final Class103 aClass103_1;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ol;Lclient!paa;)V")
	public Class6_Sub2_Sub15(@OriginalArg(0) Class243 arg0, @OriginalArg(1) Class20_Sub8 arg1) {
		this.aClass243_1 = arg0;
		this.aClass103_1 = this.aClass243_1.method6506();
		this.method6191();
	}

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)V")
	public void method6191() {
		this.anInt7274 = this.aClass243_1.anInt7531;
		this.anInt7276 = this.aClass243_1.anInt7534;
		this.anInt7278 = this.aClass243_1.anInt7533;
		if (this.aClass243_1.aClass154_7 != null) {
			this.aClass243_1.aClass154_7.method6562(this.aClass103_1.anInt3361, this.aClass103_1.anInt3362, this.aClass103_1.anInt3364, Static175.anIntArray220);
		}
		this.anInt7273 = Static175.anIntArray220[2];
		this.anInt7277 = Static175.anIntArray220[0];
	}
}
