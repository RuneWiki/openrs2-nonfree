import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class82 {

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
	private int anInt2670 = 0;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
	private int anInt2672 = -1;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "Lclient!pk;")
	private Class183 aClass183_18 = new Class183();

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "Z")
	public boolean aBoolean243 = false;

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
	private final int anInt2673;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	private final int anInt2667;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "[Lclient!cr;")
	private Class4_Sub11[] aClass4_Sub11Array1;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(III)V")
	public Class82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2673 = arg1;
		this.anInt2667 = arg0;
		this.aClass4_Sub11Array1 = new Class4_Sub11[this.anInt2673];
		this.anIntArrayArray26 = new int[this.anInt2667][arg2];
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	public void method2259() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2667; local11++) {
			this.anIntArrayArray26[local11] = null;
		}
		this.anIntArrayArray26 = null;
		this.aClass4_Sub11Array1 = null;
		this.aClass183_18.method4138();
		this.aClass183_18 = null;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)[[I")
	public int[][] method2263() {
		if (this.anInt2667 != this.anInt2673) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt2667; local22++) {
			this.aClass4_Sub11Array1[local22] = Static71.aClass4_Sub11_10;
		}
		return this.anIntArrayArray26;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)[I")
	public int[] method2265(@OriginalArg(1) int arg0) {
		if (this.anInt2673 == this.anInt2667) {
			this.aBoolean243 = this.aClass4_Sub11Array1[arg0] == null;
			this.aClass4_Sub11Array1[arg0] = Static71.aClass4_Sub11_10;
			return this.anIntArrayArray26[arg0];
		} else if (this.anInt2667 == 1) {
			this.aBoolean243 = this.anInt2672 != arg0;
			this.anInt2672 = arg0;
			return this.anIntArrayArray26[0];
		} else {
			@Pc(24) Class4_Sub11 local24 = this.aClass4_Sub11Array1[arg0];
			if (local24 == null) {
				this.aBoolean243 = true;
				if (this.anInt2667 > this.anInt2670) {
					local24 = new Class4_Sub11(arg0, this.anInt2670);
					this.anInt2670++;
				} else {
					@Pc(59) Class4_Sub11 local59 = (Class4_Sub11) this.aClass183_18.method4139();
					local24 = new Class4_Sub11(arg0, local59.anInt1037);
					this.aClass4_Sub11Array1[local59.anInt1036] = null;
					local59.method5684();
				}
				this.aClass4_Sub11Array1[arg0] = local24;
			} else {
				this.aBoolean243 = false;
			}
			this.aClass183_18.method4133(local24);
			return this.anIntArrayArray26[local24.anInt1037];
		}
	}
}
