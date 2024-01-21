import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "ib", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!bb", name = "tb", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!bb", name = "Db", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!bb", name = "Bb", descriptor = "I")
	private int anInt394 = -1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub3() {
		super(0, false);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt394 = arg1.method1753();
		}
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)Z")
	private boolean method271() {
		if (this.anIntArray39 != null) {
			return true;
		} else if (this.anInt394 >= 0) {
			@Pc(21) int local21 = Static176.anInt3921;
			@Pc(23) int local23 = Static112.anInt2736;
			@Pc(33) int local33 = Static138.anInterface2_2.method1091(this.anInt394) ? 64 : 128;
			this.anIntArray39 = Static138.anInterface2_2.method1094(this.anInt394);
			this.anInt390 = local33;
			this.anInt383 = local33;
			Static208.method2987(local21, local23);
			return this.anIntArray39 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)I")
	@Override
	public int method3311() {
		return this.anInt394;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82 && this.method271()) {
			@Pc(42) int local42 = (this.anInt390 == Static112.anInt2736 ? arg0 : this.anInt390 * arg0 / Static112.anInt2736) * this.anInt383;
			@Pc(46) int[] local46 = local18[0];
			@Pc(50) int[] local50 = local18[1];
			@Pc(54) int[] local54 = local18[2];
			@Pc(64) int local64;
			@Pc(73) int local73;
			if (Static176.anInt3921 == this.anInt383) {
				for (local64 = 0; local64 < Static176.anInt3921; local64++) {
					local73 = this.anIntArray39[local42++];
					local54[local64] = (local73 & 0xFF) << 4;
					local50[local64] = local73 >> 4 & 0xFF0;
					local46[local64] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local64 = 0; local64 < Static176.anInt3921; local64++) {
					local73 = this.anInt383 * local64 / Static176.anInt3921;
					@Pc(80) int local80 = this.anIntArray39[local73 + local42];
					local54[local64] = (local80 & 0xFF) << 4;
					local50[local64] = local80 >> 4 & 0xFF0;
					local46[local64] = local80 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V")
	@Override
	public void method3306() {
		super.method3306();
		this.anIntArray39 = null;
	}
}
