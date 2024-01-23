import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class4_Sub1_Sub6 extends Class4_Sub1 {

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
	private int anInt1507;

	@OriginalMember(owner = "client!fc", name = "W", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
	private int anInt1516;

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
	private int anInt1508 = -1;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub6() {
		super(0, false);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)I")
	@Override
	public int method4541() {
		return this.anInt1508;
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
	@Override
	public void method4547() {
		super.method4547();
		this.anIntArray142 = null;
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)Z")
	private boolean method1260() {
		if (this.anIntArray142 != null) {
			return true;
		} else if (this.anInt1508 >= 0) {
			@Pc(24) int local24 = Static33.anInt660;
			@Pc(26) int local26 = Static68.anInt1753;
			@Pc(39) int local39 = Static68.anInterface4_2.method2413(this.anInt1508).aBoolean306 ? 64 : 128;
			this.anIntArray142 = Static68.anInterface4_2.method2412(local39, this.anInt1508, 1.0F, local39);
			this.anInt1516 = local39;
			this.anInt1507 = local39;
			Static28.method588(local26, local24);
			return this.anIntArray142 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt1508 = arg1.method3085();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232 && this.method1260()) {
			@Pc(29) int[] local29 = local16[0];
			@Pc(33) int[] local33 = local16[1];
			@Pc(49) int local49 = (Static33.anInt660 == this.anInt1507 ? arg0 : arg0 * this.anInt1507 / Static33.anInt660) * this.anInt1516;
			@Pc(53) int[] local53 = local16[2];
			@Pc(63) int local63;
			@Pc(72) int local72;
			if (Static68.anInt1753 == this.anInt1516) {
				for (local63 = 0; local63 < Static68.anInt1753; local63++) {
					local72 = this.anIntArray142[local49++];
					local53[local63] = (local72 & 0xFF) << 4;
					local33[local63] = local72 >> 4 & 0xFF0;
					local29[local63] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static68.anInt1753; local63++) {
					local72 = this.anInt1516 * local63 / Static68.anInt1753;
					@Pc(120) int local120 = this.anIntArray142[local72 + local49];
					local53[local63] = (local120 & 0xFF) << 4;
					local33[local63] = local120 >> 4 & 0xFF0;
					local29[local63] = local120 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}
}
