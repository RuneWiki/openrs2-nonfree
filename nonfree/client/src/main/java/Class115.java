import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class115 {

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
	private int anInt2961 = -1;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
	private int anInt2958 = 0;

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "Lclient!jia;")
	private Class193 aClass193_17 = new Class193();

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Z")
	public boolean aBoolean233 = false;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
	private final int anInt2956;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
	private final int anInt2962;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "[Lclient!qe;")
	private Class3_Sub43[] aClass3_Sub43Array1;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(III)V")
	public Class115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2956 = arg1;
		this.anInt2962 = arg0;
		this.aClass3_Sub43Array1 = new Class3_Sub43[this.anInt2956];
		this.anIntArrayArrayArray10 = new int[this.anInt2962][3][arg2];
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)[[[I")
	public int[][][] method2720() {
		if (this.anInt2962 != this.anInt2956) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt2962; local26++) {
			this.aClass3_Sub43Array1[local26] = Static376.aClass3_Sub43_1;
		}
		return this.anIntArrayArrayArray10;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	public void method2721() {
		for (@Pc(14) int local14 = 0; local14 < this.anInt2962; local14++) {
			this.anIntArrayArrayArray10[local14][0] = null;
			this.anIntArrayArrayArray10[local14][1] = null;
			this.anIntArrayArrayArray10[local14][2] = null;
			this.anIntArrayArrayArray10[local14] = null;
		}
		this.aClass3_Sub43Array1 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass193_17.method4458();
		this.aClass193_17 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)[[I")
	public int[][] method2722(@OriginalArg(0) int arg0) {
		if (this.anInt2956 == this.anInt2962) {
			this.aBoolean233 = this.aClass3_Sub43Array1[arg0] == null;
			this.aClass3_Sub43Array1[arg0] = Static376.aClass3_Sub43_1;
			return this.anIntArrayArrayArray10[arg0];
		} else if (this.anInt2962 == 1) {
			this.aBoolean233 = arg0 != this.anInt2961;
			this.anInt2961 = arg0;
			return this.anIntArrayArrayArray10[0];
		} else {
			@Pc(28) Class3_Sub43 local28 = this.aClass3_Sub43Array1[arg0];
			if (local28 == null) {
				this.aBoolean233 = true;
				if (this.anInt2962 > this.anInt2958) {
					local28 = new Class3_Sub43(arg0, this.anInt2958);
					this.anInt2958++;
				} else {
					@Pc(64) Class3_Sub43 local64 = (Class3_Sub43) this.aClass193_17.method4456();
					local28 = new Class3_Sub43(arg0, local64.anInt8133);
					this.aClass3_Sub43Array1[local64.anInt8131] = null;
					local64.method8770();
				}
				this.aClass3_Sub43Array1[arg0] = local28;
			} else {
				this.aBoolean233 = false;
			}
			this.aClass193_17.method4455(local28);
			return this.anIntArrayArrayArray10[local28.anInt8133];
		}
	}
}
