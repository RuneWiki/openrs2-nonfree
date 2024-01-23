import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class1_Sub4_Sub15 extends Class1_Sub4 {

	@OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
	private int anInt2122;

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "[I")
	private int[] anIntArray180;

	@OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
	private int anInt2124;

	@OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
	private int anInt2125 = -1;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub15() {
		super(0, false);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2125 = arg0.method1386();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171 && this.method1912()) {
			@Pc(42) int local42 = (Static117.anInt2472 == this.anInt2122 ? arg0 : this.anInt2122 * arg0 / Static117.anInt2472) * this.anInt2124;
			@Pc(46) int[] local46 = local13[2];
			@Pc(50) int[] local50 = local13[0];
			@Pc(54) int[] local54 = local13[1];
			@Pc(60) int local60;
			@Pc(69) int local69;
			if (this.anInt2124 == Static182.anInt3492) {
				for (local60 = 0; local60 < Static182.anInt3492; local60++) {
					local69 = this.anIntArray180[local42++];
					local46[local60] = (local69 & 0xFF) << 4;
					local54[local60] = local69 >> 4 & 0xFF0;
					local50[local60] = local69 >> 12 & 0xFF0;
				}
			} else {
				for (local60 = 0; local60 < Static182.anInt3492; local60++) {
					local69 = local60 * this.anInt2124 / Static182.anInt3492;
					@Pc(121) int local121 = this.anIntArray180[local42 + local69];
					local46[local60] = (local121 & 0xFF) << 4;
					local54[local60] = local121 >> 4 & 0xFF0;
					local50[local60] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
	@Override
	public void method4751() {
		super.method4751();
		this.anIntArray180 = null;
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)I")
	@Override
	public int method4754() {
		return this.anInt2125;
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)Z")
	private boolean method1912() {
		if (this.anIntArray180 != null) {
			return true;
		} else if (this.anInt2125 >= 0) {
			@Pc(15) int local15 = Static117.anInt2472;
			@Pc(17) int local17 = Static182.anInt3492;
			@Pc(28) int local28 = Static100.anInterface1_1.method755(this.anInt2125).aBoolean236 ? 64 : 128;
			this.anIntArray180 = Static100.anInterface1_1.method754(local28, this.anInt2125, local28, 1.0F);
			this.anInt2124 = local28;
			this.anInt2122 = local28;
			Static225.method3499(local15, local17);
			return this.anIntArray180 != null;
		} else {
			return false;
		}
	}
}
