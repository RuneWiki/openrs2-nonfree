import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class5_Sub1_Sub31 extends Class5_Sub1 {

	@OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
	private int anInt3418;

	@OriginalMember(owner = "client!rj", name = "N", descriptor = "[I")
	private int[] anIntArray361;

	@OriginalMember(owner = "client!rj", name = "eb", descriptor = "I")
	private int anInt3432;

	@OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
	private int anInt3427 = -1;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub31() {
		super(0, false);
	}

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)Z")
	private boolean method2598() {
		if (this.anIntArray361 != null) {
			return true;
		} else if (this.anInt3427 >= 0) {
			@Pc(23) int local23 = Static174.anInt3489;
			@Pc(25) int local25 = Static207.anInt4072;
			@Pc(35) int local35 = Static77.anInterface1_12.method2492(this.anInt3427) ? 64 : 128;
			this.anIntArray361 = Static77.anInterface1_12.method2486(this.anInt3427);
			this.anInt3432 = local35;
			this.anInt3418 = local35;
			Static21.method3201(local23, local25);
			return this.anIntArray361 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3427 = arg0.method3077();
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183 && this.method2598()) {
			@Pc(44) int local44 = (Static207.anInt4072 == this.anInt3432 ? arg0 : arg0 * this.anInt3432 / Static207.anInt4072) * this.anInt3418;
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[0];
			@Pc(56) int[] local56 = local16[2];
			@Pc(62) int local62;
			@Pc(70) int local70;
			if (this.anInt3418 == Static174.anInt3489) {
				for (local62 = 0; local62 < Static174.anInt3489; local62++) {
					local70 = this.anIntArray361[local44++];
					local56[local62] = (local70 & 0xFF) << 4;
					local48[local62] = local70 >> 4 & 0xFF0;
					local52[local62] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static174.anInt3489; local62++) {
					local70 = this.anInt3418 * local62 / Static174.anInt3489;
					@Pc(122) int local122 = this.anIntArray361[local70 + local44];
					local56[local62] = (local122 & 0xFF) << 4;
					local48[local62] = local122 >> 4 & 0xFF0;
					local52[local62] = local122 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)I")
	@Override
	public int method3199() {
		return this.anInt3427;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V")
	@Override
	public void method3189() {
		super.method3189();
		this.anIntArray361 = null;
	}
}
