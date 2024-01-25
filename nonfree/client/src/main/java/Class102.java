import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class102 {

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[16384];

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[16384];

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	private int anInt3077 = 0;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	private int anInt3080 = -1;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!mf;")
	private Class163 aClass163_28 = new Class163();

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Z")
	public boolean aBoolean216 = false;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	private final int anInt3079;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
	private final int anInt3081;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "[Lclient!ln;")
	private Class10_Sub27[] aClass10_Sub27Array1;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray24[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray25[local9] = (float) Math.cos(local7 * (double) local9);
		}
		new Class36("", 76);
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(III)V")
	public Class102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3079 = arg1;
		this.anInt3081 = arg0;
		this.aClass10_Sub27Array1 = new Class10_Sub27[this.anInt3079];
		this.anIntArrayArrayArray4 = new int[this.anInt3081][3][arg2];
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)[[[I")
	public int[][][] method2565() {
		if (this.anInt3079 != this.anInt3081) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt3081; local21++) {
			this.aClass10_Sub27Array1[local21] = Static286.aClass10_Sub27_1;
		}
		return this.anIntArrayArrayArray4;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[[I")
	public int[][] method2566(@OriginalArg(0) int arg0) {
		if (this.anInt3079 == this.anInt3081) {
			this.aBoolean216 = this.aClass10_Sub27Array1[arg0] == null;
			this.aClass10_Sub27Array1[arg0] = Static286.aClass10_Sub27_1;
			return this.anIntArrayArrayArray4[arg0];
		} else if (this.anInt3081 == 1) {
			this.aBoolean216 = arg0 != this.anInt3080;
			this.anInt3080 = arg0;
			return this.anIntArrayArrayArray4[0];
		} else {
			@Pc(33) Class10_Sub27 local33 = this.aClass10_Sub27Array1[arg0];
			if (local33 == null) {
				this.aBoolean216 = true;
				if (this.anInt3081 > this.anInt3077) {
					local33 = new Class10_Sub27(arg0, this.anInt3077);
					this.anInt3077++;
				} else {
					@Pc(64) Class10_Sub27 local64 = (Class10_Sub27) this.aClass163_28.method3612();
					local33 = new Class10_Sub27(arg0, local64.anInt4313);
					this.aClass10_Sub27Array1[local64.anInt4310] = null;
					local64.method6033();
				}
				this.aClass10_Sub27Array1[arg0] = local33;
			} else {
				this.aBoolean216 = false;
			}
			this.aClass163_28.method3615(local33);
			return this.anIntArrayArrayArray4[local33.anInt4313];
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public void method2567() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3081; local7++) {
			this.anIntArrayArrayArray4[local7][0] = null;
			this.anIntArrayArrayArray4[local7][1] = null;
			this.anIntArrayArrayArray4[local7][2] = null;
			this.anIntArrayArrayArray4[local7] = null;
		}
		this.anIntArrayArrayArray4 = null;
		this.aClass10_Sub27Array1 = null;
		this.aClass163_28.method3619();
		this.aClass163_28 = null;
	}
}
