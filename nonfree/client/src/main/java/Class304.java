import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class304 {

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
	private int anInt7714 = 0;

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
	private int anInt7711 = -1;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "Lclient!ifa;")
	private Class163 aClass163_58 = new Class163();

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "Z")
	public boolean aBoolean604 = false;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
	private final int anInt7713;

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
	private final int anInt7717;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "[Lclient!he;")
	private Class4_Sub21[] aClass4_Sub21Array1;

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(III)V")
	public Class304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7713 = arg0;
		this.anInt7717 = arg1;
		this.aClass4_Sub21Array1 = new Class4_Sub21[this.anInt7717];
		this.anIntArrayArrayArray20 = new int[this.anInt7713][3][arg2];
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)[[I")
	public int[][] method6699(@OriginalArg(0) int arg0) {
		if (this.anInt7717 == this.anInt7713) {
			this.aBoolean604 = this.aClass4_Sub21Array1[arg0] == null;
			this.aClass4_Sub21Array1[arg0] = Static301.aClass4_Sub21_1;
			return this.anIntArrayArrayArray20[arg0];
		} else if (this.anInt7713 == 1) {
			this.aBoolean604 = arg0 != this.anInt7711;
			this.anInt7711 = arg0;
			return this.anIntArrayArrayArray20[0];
		} else {
			@Pc(44) Class4_Sub21 local44 = this.aClass4_Sub21Array1[arg0];
			if (local44 == null) {
				this.aBoolean604 = true;
				if (this.anInt7714 < this.anInt7713) {
					local44 = new Class4_Sub21(arg0, this.anInt7714);
					this.anInt7714++;
				} else {
					@Pc(86) Class4_Sub21 local86 = (Class4_Sub21) this.aClass163_58.method3648();
					local44 = new Class4_Sub21(arg0, local86.anInt3458);
					this.aClass4_Sub21Array1[local86.anInt3460] = null;
					local86.method9000();
				}
				this.aClass4_Sub21Array1[arg0] = local44;
			} else {
				this.aBoolean604 = false;
			}
			this.aClass163_58.method3641(local44);
			return this.anIntArrayArrayArray20[local44.anInt3458];
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
	public void method6700() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7713; local7++) {
			this.anIntArrayArrayArray20[local7][0] = null;
			this.anIntArrayArrayArray20[local7][1] = null;
			this.anIntArrayArrayArray20[local7][2] = null;
			this.anIntArrayArrayArray20[local7] = null;
		}
		this.anIntArrayArrayArray20 = null;
		this.aClass4_Sub21Array1 = null;
		this.aClass163_58.method3643();
		this.aClass163_58 = null;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)[[[I")
	public int[][][] method6701() {
		if (this.anInt7713 != this.anInt7717) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt7713; local21++) {
			this.aClass4_Sub21Array1[local21] = Static301.aClass4_Sub21_1;
		}
		return this.anIntArrayArrayArray20;
	}
}
