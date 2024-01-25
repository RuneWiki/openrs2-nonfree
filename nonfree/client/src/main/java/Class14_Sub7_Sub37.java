import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vga")
public final class Class14_Sub7_Sub37 extends Class14_Sub7 {

	@OriginalMember(owner = "client!vga", name = "S", descriptor = "I")
	private int anInt10577;

	@OriginalMember(owner = "client!vga", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!vga", name = "L", descriptor = "I")
	private int anInt10581;

	@OriginalMember(owner = "client!vga", name = "T", descriptor = "[I")
	private int[] anIntArray566;

	@OriginalMember(owner = "client!vga", name = "bb", descriptor = "I")
	private int anInt10586;

	@OriginalMember(owner = "client!vga", name = "fb", descriptor = "[[I")
	private int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!vga", name = "V", descriptor = "I")
	private int anInt10578 = 4;

	@OriginalMember(owner = "client!vga", name = "P", descriptor = "I")
	private int anInt10576 = 0;

	@OriginalMember(owner = "client!vga", name = "W", descriptor = "I")
	private int anInt10580 = 81;

	@OriginalMember(owner = "client!vga", name = "ab", descriptor = "I")
	private int anInt10588 = 1024;

	@OriginalMember(owner = "client!vga", name = "X", descriptor = "I")
	private int anInt10584 = 409;

	@OriginalMember(owner = "client!vga", name = "cb", descriptor = "I")
	private int anInt10591 = 8;

	@OriginalMember(owner = "client!vga", name = "eb", descriptor = "I")
	private int anInt10592 = 204;

	@OriginalMember(owner = "client!vga", name = "Q", descriptor = "I")
	private int anInt10589 = 1024;

	static {
		new Class162("", 73);
	}

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)V")
	private void method9052() {
		@Pc(12) Random local12 = new Random((long) this.anInt10591);
		this.anInt10586 = this.anInt10580 / 2;
		this.anInt10577 = 4096 / this.anInt10578;
		this.anInt10581 = 4096 / this.anInt10591;
		@Pc(35) int local35 = this.anInt10577 / 2;
		@Pc(40) int local40 = this.anInt10581 / 2;
		this.anIntArrayArray65 = new int[this.anInt10591][this.anInt10578 + 1];
		this.anIntArrayArray64 = new int[this.anInt10591][this.anInt10578];
		this.anIntArray566 = new int[this.anInt10591 + 1];
		this.anIntArray566[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt10591; local70++) {
			@Pc(83) int local83;
			@Pc(95) int local95;
			if (local70 > 0) {
				local83 = this.anInt10581;
				local95 = (Static645.method9067(4096, local12) - 2048) * this.anInt10592 >> 12;
				@Pc(103) int local103 = local83 + (local95 * local40 >> 12);
				this.anIntArray566[local70] = this.anIntArray566[local70 - 1] + local103;
			}
			this.anIntArrayArray65[local70][0] = 0;
			for (local83 = 0; local83 < this.anInt10578; local83++) {
				if (local83 > 0) {
					local95 = this.anInt10577;
					@Pc(148) int local148 = (Static645.method9067(4096, local12) - 2048) * this.anInt10584 >> 12;
					local95 += local35 * local148 >> 12;
					this.anIntArrayArray65[local70][local83] = local95 + this.anIntArrayArray65[local70][local83 - 1];
				}
				this.anIntArrayArray64[local70][local83] = this.anInt10589 <= 0 ? 4096 : 4096 - Static645.method9067(this.anInt10589, local12);
			}
			this.anIntArrayArray65[local70][this.anInt10578] = 4096;
		}
		this.anIntArray566[this.anInt10591] = 4096;
	}

	@OriginalMember(owner = "client!vga", name = "e", descriptor = "(I)V")
	@Override
	public void method9386() {
		this.method9052();
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt10578 = arg1.method7695(101);
		} else if (arg0 == 1) {
			this.anInt10591 = arg1.method7695(120);
		} else if (arg0 == 2) {
			this.anInt10584 = arg1.method7717(-1978450544);
		} else if (arg0 == 3) {
			this.anInt10592 = arg1.method7717(-1978450544);
		} else if (arg0 == 4) {
			this.anInt10588 = arg1.method7717(-1978450544);
		} else if (arg0 == 5) {
			this.anInt10576 = arg1.method7717(-1978450544);
		} else if (arg0 == 6) {
			this.anInt10580 = arg1.method7717(-1978450544);
		} else if (arg0 == 7) {
			this.anInt10589 = arg1.method7717(-1978450544);
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = Static655.anIntArray573[arg0] + this.anInt10576; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (this.anInt10591 > local25 && this.anIntArray566[local25] <= local32) {
				local25++;
			}
			@Pc(72) int local72 = local25 - 1;
			@Pc(86) boolean local86 = (local25 & 0x1) == 0;
			@Pc(91) int local91 = this.anIntArray566[local25];
			@Pc(98) int local98 = this.anIntArray566[local25 - 1];
			if (local98 + this.anInt10586 < local32 && local91 - this.anInt10586 > local32) {
				for (@Pc(129) int local129 = 0; local129 < Static613.anInt10114; local129++) {
					@Pc(143) int local143 = local86 ? this.anInt10588 : -this.anInt10588;
					@Pc(145) int local145 = 0;
					@Pc(156) int local156;
					for (local156 = (this.anInt10577 * local143 >> 12) + Static588.anIntArray506[local129]; local156 < 0; local156 += 4096) {
					}
					while (local156 > 4096) {
						local156 -= 4096;
					}
					while (local145 < this.anInt10578 && this.anIntArrayArray65[local72][local145] <= local156) {
						local145++;
					}
					@Pc(207) int local207 = local145 - 1;
					@Pc(214) int local214 = this.anIntArrayArray65[local72][local207];
					@Pc(221) int local221 = this.anIntArrayArray65[local72][local145];
					if (local214 + this.anInt10586 < local156 && local156 < local221 - this.anInt10586) {
						local19[local129] = this.anIntArrayArray64[local72][local207];
					} else {
						local19[local129] = 0;
					}
				}
			} else {
				Static691.method81(local19, 0, Static613.anInt10114, 0);
			}
		}
		return local19;
	}
}
