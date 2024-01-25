import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class1_Sub3_Sub5 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
	public int anInt1559;

	@OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
	public int anInt1563;

	@OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
	public int anInt1564;

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
	public int anInt1567;

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
	public int anInt1568;

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "Lclient!at;")
	public final Class15 aClass15_2;

	@OriginalMember(owner = "client!ee", name = "F", descriptor = "Lclient!rp;")
	public final Class216 aClass216_1;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!at;Lclient!ce;)V")
	public Class1_Sub3_Sub5(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class13_Sub2 arg1) {
		this.aClass15_2 = arg0;
		this.aClass216_1 = this.aClass15_2.method278();
		this.method1285();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public void method1285() {
		this.anInt1564 = this.aClass15_2.anInt334;
		this.anInt1559 = this.aClass15_2.anInt336;
		this.anInt1563 = this.aClass15_2.anInt340;
		if (this.aClass15_2.aClass40_1 != null) {
			this.aClass15_2.aClass40_1.E(this.aClass216_1.anInt5851, this.aClass216_1.anInt5848, this.aClass216_1.anInt5853, Static157.anIntArray135);
		}
		this.anInt1567 = Static157.anIntArray135[0];
		this.anInt1568 = Static157.anIntArray135[2];
	}
}
