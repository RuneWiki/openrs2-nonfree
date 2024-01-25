import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class99 {

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
	private int anInt2161 = 0;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
	private int anInt2166 = -1;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "Lclient!am;")
	private Class14 aClass14_8 = new Class14();

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "Z")
	public boolean aBoolean228 = false;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
	private final int anInt2162;

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
	private final int anInt2164;

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "[Lclient!pn;")
	private Class1_Sub36[] aClass1_Sub36Array1;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(III)V")
	public Class99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2162 = arg0;
		this.anInt2164 = arg1;
		this.aClass1_Sub36Array1 = new Class1_Sub36[this.anInt2164];
		this.anIntArrayArrayArray1 = new int[this.anInt2162][3][arg2];
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V")
	public void method1769() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2162; local3++) {
			this.anIntArrayArrayArray1[local3][0] = null;
			this.anIntArrayArrayArray1[local3][1] = null;
			this.anIntArrayArrayArray1[local3][2] = null;
			this.anIntArrayArrayArray1[local3] = null;
		}
		this.anIntArrayArrayArray1 = null;
		this.aClass1_Sub36Array1 = null;
		this.aClass14_8.method204();
		this.aClass14_8 = null;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)[[[I")
	public int[][][] method1770() {
		if (this.anInt2162 != this.anInt2164) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt2162; local23++) {
			this.aClass1_Sub36Array1[local23] = Static7.aClass1_Sub36_1;
		}
		return this.anIntArrayArrayArray1;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)[[I")
	public int[][] method1772(@OriginalArg(0) int arg0) {
		if (this.anInt2162 == this.anInt2164) {
			this.aBoolean228 = this.aClass1_Sub36Array1[arg0] == null;
			this.aClass1_Sub36Array1[arg0] = Static7.aClass1_Sub36_1;
			return this.anIntArrayArrayArray1[arg0];
		} else if (this.anInt2162 == 1) {
			this.aBoolean228 = arg0 != this.anInt2166;
			this.anInt2166 = arg0;
			return this.anIntArrayArrayArray1[0];
		} else {
			@Pc(30) Class1_Sub36 local30 = this.aClass1_Sub36Array1[arg0];
			if (local30 == null) {
				this.aBoolean228 = true;
				if (this.anInt2162 > this.anInt2161) {
					local30 = new Class1_Sub36(arg0, this.anInt2161);
					this.anInt2161++;
				} else {
					@Pc(70) Class1_Sub36 local70 = (Class1_Sub36) this.aClass14_8.method210();
					local30 = new Class1_Sub36(arg0, local70.anInt5323);
					this.aClass1_Sub36Array1[local70.anInt5324] = null;
					local70.method5953();
				}
				this.aClass1_Sub36Array1[arg0] = local30;
			} else {
				this.aBoolean228 = false;
			}
			this.aClass14_8.method206(local30);
			return this.anIntArrayArrayArray1[local30.anInt5323];
		}
	}
}
