import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class1_Sub1_Sub20 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
	private int anInt2090;

	@OriginalMember(owner = "client!ib", name = "gb", descriptor = "I")
	private int anInt2099;

	@OriginalMember(owner = "client!ib", name = "hb", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
	private int anInt2096;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)Z")
	private boolean method1539() {
		if (this.anIntArray226 != null) {
			return true;
		} else if (this.anInt2096 >= 0) {
			@Pc(30) int local30 = Static59.anInterface3_2.method2051(this.anInt2096) ? 64 : 128;
			this.anIntArray226 = Static59.anInterface3_2.method2050(this.anInt2096);
			this.anInt2090 = local30;
			this.anInt2099 = local30;
			return this.anIntArray226 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168 && this.method1539()) {
			@Pc(35) int local35 = (this.anInt2099 == Static30.anInt1097 ? arg0 : arg0 * this.anInt2099 / Static30.anInt1097) * this.anInt2090;
			@Pc(39) int[] local39 = local7[0];
			@Pc(43) int[] local43 = local7[1];
			@Pc(47) int[] local47 = local7[2];
			@Pc(53) int local53;
			@Pc(62) int local62;
			if (this.anInt2090 == Static65.anInt1933) {
				for (local53 = 0; local53 < Static65.anInt1933; local53++) {
					local62 = this.anIntArray226[local35++];
					local47[local53] = (local62 & 0xFF) << 4;
					local43[local53] = local62 >> 4 & 0xFF0;
					local39[local53] = local62 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static65.anInt1933; local53++) {
					local62 = this.anInt2090 * local53 / Static65.anInt1933;
					@Pc(69) int local69 = this.anIntArray226[local35 + local62];
					local47[local53] = (local69 & 0xFF) << 4;
					local43[local53] = local69 >> 4 & 0xFF0;
					local39[local53] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)I")
	@Override
	public int method3005() {
		return this.anInt2096;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2096 = arg1.method1642();
		}
	}
}
