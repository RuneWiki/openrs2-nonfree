import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class19 {

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
	private int anInt1409 = 0;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
	private int anInt1410 = -1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Lclient!ad;")
	private Class4 aClass4_4 = new Class4();

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "Z")
	public boolean aBoolean54 = false;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
	private final int anInt1407;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	private final int anInt1413;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "[Lclient!rb;")
	private Class1_Sub21[] aClass1_Sub21Array1;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(III)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1407 = arg1;
		this.anInt1413 = arg0;
		this.anIntArrayArrayArray4 = new int[arg0][3][arg2];
		this.aClass1_Sub21Array1 = new Class1_Sub21[arg1];
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)[[I")
	public int[][] method1028(@OriginalArg(0) int arg0) {
		if (this.anInt1407 == this.anInt1413) {
			this.aBoolean54 = this.aClass1_Sub21Array1[arg0] == null;
			this.aClass1_Sub21Array1[arg0] = Static119.aClass1_Sub21_1;
			return this.anIntArrayArrayArray4[arg0];
		} else if (this.anInt1413 == 1) {
			this.aBoolean54 = this.anInt1410 != arg0;
			this.anInt1410 = arg0;
			return this.anIntArrayArrayArray4[0];
		} else {
			@Pc(45) Class1_Sub21 local45 = this.aClass1_Sub21Array1[arg0];
			if (this.aBoolean54 = local45 == null) {
				if (this.anInt1409 < this.anInt1413) {
					local45 = new Class1_Sub21(arg0, this.anInt1409);
					this.anInt1409++;
				} else {
					@Pc(80) Class1_Sub21 local80 = (Class1_Sub21) this.aClass4_4.method176();
					local45 = new Class1_Sub21(arg0, local80.anInt3818);
					this.aClass1_Sub21Array1[local80.anInt3820] = null;
					local80.method3499();
				}
				this.aClass1_Sub21Array1[arg0] = local45;
			}
			this.aClass4_4.method180(local45);
			return this.anIntArrayArrayArray4[local45.anInt3818];
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public void method1029() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1413; local7++) {
			this.anIntArrayArrayArray4[local7][0] = null;
			this.anIntArrayArrayArray4[local7][1] = null;
			this.anIntArrayArrayArray4[local7][2] = null;
			this.anIntArrayArrayArray4[local7] = null;
		}
		this.aClass1_Sub21Array1 = null;
		this.anIntArrayArrayArray4 = null;
		this.aClass4_4.method182();
		this.aClass4_4 = null;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)[[[I")
	public int[][][] method1030() {
		if (this.anInt1407 != this.anInt1413) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt1413; local21++) {
			this.aClass1_Sub21Array1[local21] = Static119.aClass1_Sub21_1;
		}
		return this.anIntArrayArrayArray4;
	}
}
