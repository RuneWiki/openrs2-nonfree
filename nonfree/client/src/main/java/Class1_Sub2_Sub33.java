import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class1_Sub2_Sub33 extends Class1_Sub2 {

	@OriginalMember(owner = "client!th", name = "G", descriptor = "[I")
	private int[] anIntArray721;

	@OriginalMember(owner = "client!th", name = "T", descriptor = "I")
	private int anInt5779;

	@OriginalMember(owner = "client!th", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!th", name = "W", descriptor = "I")
	private int anInt5781;

	@OriginalMember(owner = "client!th", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!th", name = "bb", descriptor = "I")
	private int anInt5784;

	@OriginalMember(owner = "client!th", name = "J", descriptor = "I")
	private int anInt5773 = 4;

	@OriginalMember(owner = "client!th", name = "N", descriptor = "I")
	private int anInt5775 = 1024;

	@OriginalMember(owner = "client!th", name = "X", descriptor = "I")
	private int anInt5782 = 8;

	@OriginalMember(owner = "client!th", name = "R", descriptor = "I")
	private int anInt5777 = 1024;

	@OriginalMember(owner = "client!th", name = "V", descriptor = "I")
	private int anInt5780 = 204;

	@OriginalMember(owner = "client!th", name = "cb", descriptor = "I")
	private int anInt5785 = 81;

	@OriginalMember(owner = "client!th", name = "eb", descriptor = "I")
	private int anInt5787 = 0;

	@OriginalMember(owner = "client!th", name = "ab", descriptor = "I")
	private int anInt5783 = 409;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(B)V")
	private void method5091() {
		@Pc(20) Random local20 = new Random((long) this.anInt5782);
		this.anInt5784 = 4096 / this.anInt5782;
		this.anInt5779 = this.anInt5785 / 2;
		this.anInt5781 = 4096 / this.anInt5773;
		@Pc(43) int local43 = this.anInt5781 / 2;
		this.anIntArrayArray58 = new int[this.anInt5782][this.anInt5773 + 1];
		this.anIntArrayArray57 = new int[this.anInt5782][this.anInt5773];
		this.anIntArray721 = new int[this.anInt5782 + 1];
		@Pc(71) int local71 = this.anInt5784 / 2;
		this.anIntArray721[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt5782; local78++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local78 > 0) {
				local85 = this.anInt5784;
				local97 = (Static263.method4610(local20, 4096) - 2048) * this.anInt5780 >> 12;
				@Pc(105) int local105 = local85 + (local97 * local71 >> 12);
				this.anIntArray721[local78] = local105 + this.anIntArray721[local78 - 1];
			}
			this.anIntArrayArray58[local78][0] = 0;
			for (local85 = 0; local85 < this.anInt5773; local85++) {
				if (local85 > 0) {
					local97 = this.anInt5781;
					@Pc(145) int local145 = (Static263.method4610(local20, 4096) - 2048) * this.anInt5783 >> 12;
					local97 += local43 * local145 >> 12;
					this.anIntArrayArray58[local78][local85] = local97 + this.anIntArrayArray58[local78][local85 - 1];
				}
				this.anIntArrayArray57[local78][local85] = this.anInt5775 > 0 ? 4096 - Static263.method4610(local20, this.anInt5775) : 4096;
			}
			this.anIntArrayArray58[local78][this.anInt5773] = 4096;
		}
		this.anIntArray721[this.anInt5782] = 4096;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = this.anInt5787 + Static66.anIntArray158[arg0]; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (local22 < this.anInt5782 && local29 >= this.anIntArray721[local22]) {
				local22++;
			}
			@Pc(57) int local57 = local22 - 1;
			@Pc(68) boolean local68 = (local22 & 0x1) == 0;
			@Pc(73) int local73 = this.anIntArray721[local22];
			@Pc(80) int local80 = this.anIntArray721[local22 - 1];
			if (local29 > this.anInt5779 + local80 && local73 - this.anInt5779 > local29) {
				for (@Pc(95) int local95 = 0; local95 < Static251.anInt6509; local95++) {
					@Pc(99) int local99 = 0;
					@Pc(108) int local108 = local68 ? this.anInt5777 : -this.anInt5777;
					@Pc(119) int local119;
					for (local119 = (local108 * this.anInt5781 >> 12) + Static7.anIntArray23[local95]; local119 < 0; local119 += 4096) {
					}
					while (local119 > 4096) {
						local119 -= 4096;
					}
					while (local99 < this.anInt5773 && this.anIntArrayArray58[local57][local99] <= local119) {
						local99++;
					}
					@Pc(149) int local149 = local99 - 1;
					@Pc(156) int local156 = this.anIntArrayArray58[local57][local149];
					@Pc(163) int local163 = this.anIntArrayArray58[local57][local99];
					if (local119 > this.anInt5779 + local156 && local163 - this.anInt5779 > local119) {
						local16[local95] = this.anIntArrayArray57[local57][local149];
					} else {
						local16[local95] = 0;
					}
				}
			} else {
				Static367.method5379(local16, 0, Static251.anInt6509, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
	@Override
	public void method5661() {
		this.method5091();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5773 = arg1.method3141();
		} else if (arg0 == 1) {
			this.anInt5782 = arg1.method3141();
		} else if (arg0 == 2) {
			this.anInt5783 = arg1.method3115();
		} else if (arg0 == 3) {
			this.anInt5780 = arg1.method3115();
		} else if (arg0 == 4) {
			this.anInt5777 = arg1.method3115();
		} else if (arg0 == 5) {
			this.anInt5787 = arg1.method3115();
		} else if (arg0 == 6) {
			this.anInt5785 = arg1.method3115();
		} else if (arg0 == 7) {
			this.anInt5775 = arg1.method3115();
		}
	}
}
