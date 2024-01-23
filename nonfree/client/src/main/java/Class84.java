import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class84 {

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
	private int anInt2775 = 0;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
	private int anInt2778 = -1;

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "Lclient!an;")
	private Class10 aClass10_28 = new Class10();

	@OriginalMember(owner = "client!jn", name = "p", descriptor = "Z")
	public boolean aBoolean183 = false;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
	private int anInt2773;

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "[Lclient!le;")
	private Class4_Sub20[] aClass4_Sub20Array1;

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
	private int anInt2779;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(III)V")
	public Class84(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2773 = arg1;
		this.aClass4_Sub20Array1 = new Class4_Sub20[this.anInt2773];
		this.anInt2779 = arg0;
		this.anIntArrayArrayArray7 = new int[this.anInt2779][3][arg2];
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)[[I")
	public int[][] method2153(@OriginalArg(1) int arg0) {
		if (this.anInt2773 == this.anInt2779) {
			this.aBoolean183 = this.aClass4_Sub20Array1[arg0] == null;
			this.aClass4_Sub20Array1[arg0] = Static86.aClass4_Sub20_1;
			return this.anIntArrayArrayArray7[arg0];
		} else if (this.anInt2779 == 1) {
			this.aBoolean183 = arg0 != this.anInt2778;
			this.anInt2778 = arg0;
			return this.anIntArrayArrayArray7[0];
		} else {
			@Pc(72) Class4_Sub20 local72 = this.aClass4_Sub20Array1[arg0];
			if (local72 == null) {
				this.aBoolean183 = true;
				if (this.anInt2775 < this.anInt2779) {
					local72 = new Class4_Sub20(arg0, this.anInt2775);
					this.anInt2775++;
				} else {
					@Pc(103) Class4_Sub20 local103 = (Class4_Sub20) this.aClass10_28.method187();
					local72 = new Class4_Sub20(arg0, local103.anInt3044);
					this.aClass4_Sub20Array1[local103.anInt3041] = null;
					local103.method4391();
				}
				this.aClass4_Sub20Array1[arg0] = local72;
			} else {
				this.aBoolean183 = false;
			}
			this.aClass10_28.method189(local72);
			return this.anIntArrayArrayArray7[local72.anInt3044];
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)[[[I")
	public int[][][] method2154() {
		if (this.anInt2779 != this.anInt2773) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt2779; local21++) {
			this.aClass4_Sub20Array1[local21] = Static86.aClass4_Sub20_1;
		}
		return this.anIntArrayArrayArray7;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
	public void method2155() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2779; local3++) {
			this.anIntArrayArrayArray7[local3][0] = null;
			this.anIntArrayArrayArray7[local3][1] = null;
			this.anIntArrayArrayArray7[local3][2] = null;
			this.anIntArrayArrayArray7[local3] = null;
		}
		this.anIntArrayArrayArray7 = null;
		this.aClass4_Sub20Array1 = null;
		this.aClass10_28.method192();
		this.aClass10_28 = null;
	}
}
