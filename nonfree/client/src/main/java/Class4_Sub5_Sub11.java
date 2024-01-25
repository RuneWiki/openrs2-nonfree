import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class4_Sub5_Sub11 extends Class4_Sub5 {

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
	public int anInt6317;

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
	public int anInt6319;

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
	public int anInt6320;

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
	public int anInt6322;

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
	public int anInt6323;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "Lclient!fk;")
	public final Class103 aClass103_2;

	@OriginalMember(owner = "client!ml", name = "D", descriptor = "Lclient!mp;")
	public final Class222 aClass222_1;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!fk;Lclient!au;)V")
	public Class4_Sub5_Sub11(@OriginalArg(0) Class103 arg0, @OriginalArg(1) Class1_Sub2 arg1) {
		this.aClass103_2 = arg0;
		this.aClass222_1 = this.aClass103_2.method2736();
		this.method5371();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	public void method5371() {
		this.anInt6317 = this.aClass103_2.anInt2991;
		this.anInt6322 = this.aClass103_2.anInt2992;
		this.anInt6320 = this.aClass103_2.anInt2990;
		if (this.aClass103_2.aClass8_1 != null) {
			this.aClass103_2.aClass8_1.wa(this.aClass222_1.anInt6338, this.aClass222_1.anInt6337, this.aClass222_1.anInt6339, Static546.anIntArray519);
		}
		this.anInt6319 = Static546.anIntArray519[2];
		this.anInt6323 = Static546.anIntArray519[0];
	}
}
