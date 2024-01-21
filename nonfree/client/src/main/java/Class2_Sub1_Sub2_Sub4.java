import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class2_Sub1_Sub2_Sub4 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!kd", name = "Gb", descriptor = "Z")
	public boolean aBoolean83 = false;

	@OriginalMember(owner = "client!kd", name = "Rb", descriptor = "I")
	private int anInt1564 = 0;

	@OriginalMember(owner = "client!kd", name = "Tb", descriptor = "I")
	private int anInt1566 = 0;

	@OriginalMember(owner = "client!kd", name = "wb", descriptor = "I")
	public final int anInt1555;

	@OriginalMember(owner = "client!kd", name = "Lb", descriptor = "I")
	public final int anInt1562;

	@OriginalMember(owner = "client!kd", name = "Fb", descriptor = "I")
	public final int anInt1559;

	@OriginalMember(owner = "client!kd", name = "Sb", descriptor = "I")
	public final int anInt1565;

	@OriginalMember(owner = "client!kd", name = "xb", descriptor = "I")
	public final int anInt1556;

	@OriginalMember(owner = "client!kd", name = "vb", descriptor = "I")
	private final int anInt1554;

	@OriginalMember(owner = "client!kd", name = "Ab", descriptor = "Lclient!aa;")
	private Class2_Sub1_Sub1 aClass2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1555 = arg1;
		this.anInt1562 = arg2;
		this.anInt1559 = arg3;
		this.anInt1565 = arg4;
		this.anInt1556 = arg5 + arg6;
		this.anInt1554 = arg0;
		@Pc(36) int local36 = Static5.method79(this.anInt1554).anInt2000;
		if (local36 == -1) {
			this.aBoolean83 = true;
		} else {
			this.aBoolean83 = false;
			this.aClass2_Sub1_Sub1_2 = Static69.method1439(local36);
		}
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)Lclient!ga;")
	@Override
	protected Class2_Sub1_Sub2_Sub2 method2061() {
		@Pc(16) Class2_Sub1_Sub13 local16 = Static5.method79(this.anInt1554);
		@Pc(24) Class2_Sub1_Sub2_Sub2 local24;
		if (this.aBoolean83) {
			local24 = local16.method1433(-1);
		} else {
			local24 = local16.method1433(this.anInt1566);
		}
		return local24 == null ? null : local24;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
	public void method1084(@OriginalArg(1) int arg0) {
		if (this.aBoolean83) {
			return;
		}
		this.anInt1564 += arg0;
		while (this.aClass2_Sub1_Sub1_2.anIntArray8[this.anInt1566] < this.anInt1564) {
			this.anInt1564 -= this.aClass2_Sub1_Sub1_2.anIntArray8[this.anInt1566];
			this.anInt1566++;
			if (this.anInt1566 >= this.aClass2_Sub1_Sub1_2.anIntArray7.length) {
				this.aBoolean83 = true;
				break;
			}
		}
	}
}
