import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
	private int anInt1772;

	@OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
	private int anInt1773;

	@OriginalMember(owner = "client!fg", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!fg", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
	private int anInt1777;

	@OriginalMember(owner = "client!fg", name = "P", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
	private int anInt1775 = 1024;

	@OriginalMember(owner = "client!fg", name = "Y", descriptor = "I")
	private int anInt1783 = 1024;

	@OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
	private int anInt1776 = 204;

	@OriginalMember(owner = "client!fg", name = "ab", descriptor = "I")
	private int anInt1785 = 8;

	@OriginalMember(owner = "client!fg", name = "Z", descriptor = "I")
	private int anInt1784 = 409;

	@OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
	private int anInt1786 = 81;

	@OriginalMember(owner = "client!fg", name = "cb", descriptor = "I")
	private int anInt1787 = 4;

	@OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
	private int anInt1782 = 0;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
	private void method1451() {
		@Pc(12) Random local12 = new Random((long) this.anInt1785);
		this.anInt1772 = this.anInt1786 / 2;
		this.anInt1777 = 4096 / this.anInt1787;
		this.anInt1773 = 4096 / this.anInt1785;
		@Pc(35) int local35 = this.anInt1777 / 2;
		this.anIntArrayArray25 = new int[this.anInt1785][this.anInt1787 + 1];
		@Pc(53) int local53 = this.anInt1773 / 2;
		this.anIntArray229 = new int[this.anInt1785 + 1];
		this.anIntArrayArray26 = new int[this.anInt1785][this.anInt1787];
		this.anIntArray229[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt1785; local74++) {
			@Pc(81) int local81;
			@Pc(93) int local93;
			if (local74 > 0) {
				local81 = this.anInt1773;
				local93 = (Static351.method4927(4096, local12) - 2048) * this.anInt1776 >> 12;
				@Pc(101) int local101 = local81 + (local53 * local93 >> 12);
				this.anIntArray229[local74] = this.anIntArray229[local74 - 1] + local101;
			}
			this.anIntArrayArray25[local74][0] = 0;
			for (local81 = 0; local81 < this.anInt1787; local81++) {
				if (local81 > 0) {
					local93 = this.anInt1777;
					@Pc(144) int local144 = (Static351.method4927(4096, local12) - 2048) * this.anInt1784 >> 12;
					local93 += local144 * local35 >> 12;
					this.anIntArrayArray25[local74][local81] = local93 + this.anIntArrayArray25[local74][local81 - 1];
				}
				this.anIntArrayArray26[local74][local81] = this.anInt1783 > 0 ? 4096 - Static351.method4927(this.anInt1783, local12) : 4096;
			}
			this.anIntArrayArray25[local74][this.anInt1787] = 4096;
		}
		this.anIntArray229[this.anInt1785] = 4096;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt1787 = arg1.method5174();
		} else if (arg0 == 1) {
			this.anInt1785 = arg1.method5174();
		} else if (arg0 == 2) {
			this.anInt1784 = arg1.method5177();
		} else if (arg0 == 3) {
			this.anInt1776 = arg1.method5177();
		} else if (arg0 == 4) {
			this.anInt1775 = arg1.method5177();
		} else if (arg0 == 5) {
			this.anInt1782 = arg1.method5177();
		} else if (arg0 == 6) {
			this.anInt1786 = arg1.method5177();
		} else if (arg0 == 7) {
			this.anInt1783 = arg1.method5177();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
	@Override
	public void method5505() {
		this.method1451();
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(17) int local17 = 0;
			@Pc(25) int local25;
			for (local25 = Static394.anIntArray751[arg0] + this.anInt1782; local25 < 0; local25 += 4096) {
			}
			while (local25 > 4096) {
				local25 -= 4096;
			}
			while (local17 < this.anInt1785 && local25 >= this.anIntArray229[local17]) {
				local17++;
			}
			@Pc(55) int local55 = local17 - 1;
			@Pc(63) boolean local63 = (local17 & 0x1) == 0;
			@Pc(68) int local68 = this.anIntArray229[local17];
			@Pc(75) int local75 = this.anIntArray229[local17 - 1];
			if (local25 > local75 + this.anInt1772 && local25 < local68 - this.anInt1772) {
				for (@Pc(97) int local97 = 0; local97 < Static158.anInt2658; local97++) {
					@Pc(101) int local101 = 0;
					@Pc(110) int local110 = local63 ? this.anInt1775 : -this.anInt1775;
					@Pc(121) int local121;
					for (local121 = (this.anInt1777 * local110 >> 12) + Static87.anIntArray211[local97]; local121 < 0; local121 += 4096) {
					}
					while (local121 > 4096) {
						local121 -= 4096;
					}
					while (local101 < this.anInt1787 && local121 >= this.anIntArrayArray25[local55][local101]) {
						local101++;
					}
					@Pc(158) int local158 = local101 - 1;
					@Pc(165) int local165 = this.anIntArrayArray25[local55][local158];
					@Pc(172) int local172 = this.anIntArrayArray25[local55][local101];
					if (local165 + this.anInt1772 < local121 && local121 < local172 - this.anInt1772) {
						local11[local97] = this.anIntArrayArray26[local55][local158];
					} else {
						local11[local97] = 0;
					}
				}
			} else {
				Static404.method4340(local11, 0, Static158.anInt2658, 0);
			}
		}
		return local11;
	}
}
