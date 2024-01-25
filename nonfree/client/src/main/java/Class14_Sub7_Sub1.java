import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class14_Sub7_Sub1 extends Class14_Sub7 {

	@OriginalMember(owner = "client!bda", name = "S", descriptor = "I")
	private int anInt607 = 2000;

	@OriginalMember(owner = "client!bda", name = "L", descriptor = "I")
	private int anInt611 = 16;

	@OriginalMember(owner = "client!bda", name = "O", descriptor = "I")
	private int anInt606 = 0;

	@OriginalMember(owner = "client!bda", name = "Q", descriptor = "I")
	private int anInt614 = 4096;

	@OriginalMember(owner = "client!bda", name = "X", descriptor = "I")
	private int anInt618 = 0;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "(I)V")
	@Override
	public void method9386() {
		Static678.method9367();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt606 = arg1.method7695(96);
		} else if (arg0 == 1) {
			this.anInt607 = arg1.method7717(-1978450544);
		} else if (arg0 == 2) {
			this.anInt611 = arg1.method7695(120);
		} else if (arg0 == 3) {
			this.anInt618 = arg1.method7717(-1978450544);
		} else if (arg0 == 4) {
			this.anInt614 = arg1.method7717(-1978450544);
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(30) int local30 = this.anInt614 >> 1;
			@Pc(35) int[][] local35 = super.aClass83_41.method1818();
			@Pc(42) Random local42 = new Random((long) this.anInt606);
			for (@Pc(44) int local44 = 0; local44 < this.anInt607; local44++) {
				@Pc(70) int local70 = this.anInt614 <= 0 ? this.anInt618 : this.anInt618 + Static645.method9067(this.anInt614, local42) - local30;
				@Pc(76) int local76 = local70 >> 4 & 0xFF;
				@Pc(81) int local81 = Static645.method9067(Static613.anInt10114, local42);
				@Pc(86) int local86 = Static645.method9067(Static497.anInt8633, local42);
				@Pc(97) int local97 = (this.anInt611 * Static79.anIntArray75[local76] >> 12) + local81;
				@Pc(108) int local108 = (this.anInt611 * Static600.anIntArray533[local76] >> 12) + local86;
				@Pc(113) int local113 = local108 - local86;
				@Pc(118) int local118 = local97 - local81;
				if (local118 != 0 || local113 != 0) {
					if (local113 < 0) {
						local113 = -local113;
					}
					if (local118 < 0) {
						local118 = -local118;
					}
					@Pc(151) boolean local151 = local118 < local113;
					@Pc(155) int local155;
					@Pc(157) int local157;
					if (local151) {
						local155 = local81;
						local157 = local97;
						local81 = local86;
						local97 = local108;
						local86 = local155;
						local108 = local157;
					}
					if (local97 < local81) {
						local155 = local81;
						local157 = local86;
						local81 = local97;
						local86 = local108;
						local97 = local155;
						local108 = local157;
					}
					local155 = local86;
					local157 = local97 - local81;
					@Pc(195) int local195 = local108 - local86;
					@Pc(200) int local200 = -local157 / 2;
					@Pc(204) int local204 = 2048 / local157;
					@Pc(214) int local214 = 1024 - (Static645.method9067(4096, local42) >> 2);
					@Pc(222) int local222 = local86 < local108 ? 1 : -1;
					if (local195 < 0) {
						local195 = -local195;
					}
					for (@Pc(229) int local229 = local81; local229 < local97; local229++) {
						@Pc(242) int local242 = (local229 - local81) * local204 + local214 + 1024;
						@Pc(246) int local246 = local229 & Static677.anInt11036;
						@Pc(250) int local250 = Static660.anInt6757 & local155;
						local200 += local195;
						if (local151) {
							local35[local250][local246] = local242;
						} else {
							local35[local246][local250] = local242;
						}
						if (local200 > 0) {
							local155 += local222;
							local200 += -local157;
						}
					}
				}
			}
		}
		return local11;
	}
}
