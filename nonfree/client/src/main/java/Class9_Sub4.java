import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class9_Sub4 extends Class9 {

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Lclient!nl;")
	private Class96_Sub1 aClass96_Sub1_4;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	private int anInt1852 = -1;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "Lclient!ge;")
	private Class7_Sub1 aClass7_Sub1_1 = null;

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
	private int anInt1864 = -32768;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
	private int anInt1858 = -1;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	private int anInt1851;

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
	private int anInt1873;

	@OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
	private int anInt1870;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
	private int anInt1862;

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
	private int anInt1871;

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
	private int anInt1868;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Lclient!gj;")
	private Class49 aClass49_1;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	private int anInt1849;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
	private int anInt1866;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
	private int anInt1859;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
	private int anInt1857;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(IIIIIIIZLclient!sa;)V")
	public Class9_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class9 arg8) {
		this.anInt1851 = arg3;
		this.anInt1873 = arg5;
		this.anInt1870 = arg4;
		this.anInt1862 = arg0;
		this.anInt1871 = arg1;
		this.anInt1868 = arg2;
		if (arg6 != -1) {
			this.aClass49_1 = Static131.method697(arg6);
			this.anInt1849 = 0;
			if (this.aClass49_1.anIntArray168.length > 1) {
				this.anInt1866 = 1;
			} else {
				this.anInt1866 = 0;
			}
			this.anInt1859 = Static156.anInt3722 - 1;
			this.anInt1857 = 1;
			if (this.aClass49_1.anInt2190 == 0 && arg8 != null && arg8 instanceof Class9_Sub4) {
				@Pc(80) Class9_Sub4 local80 = (Class9_Sub4) arg8;
				if (local80.aClass49_1 == this.aClass49_1) {
					this.anInt1866 = local80.anInt1866;
					this.anInt1859 = local80.anInt1859;
					this.anInt1857 = local80.anInt1857;
					this.anInt1849 = local80.anInt1849;
					return;
				}
			}
			if (arg7 && this.aClass49_1.anInt2195 != -1) {
				this.anInt1849 = (int) ((double) this.aClass49_1.anIntArray168.length * Math.random());
				this.anInt1866 = this.anInt1849 + 1;
				if (this.aClass49_1.anIntArray168.length <= this.anInt1866) {
					this.anInt1866 -= this.aClass49_1.anInt2195;
					if (this.anInt1866 < 0 || this.anInt1866 >= this.aClass49_1.anIntArray168.length) {
						this.anInt1866 = -1;
					}
				}
				this.anInt1857 = (int) (Math.random() * (double) this.aClass49_1.anIntArray170[this.anInt1849]) + 1;
				this.anInt1859 = Static156.anInt3722 - this.anInt1857;
			}
		}
		if (arg8 == null) {
			@Pc(183) Class31 local183 = Static77.method1518(this.anInt1862);
			if (local183.anIntArray100 != null) {
				this.aBoolean103 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Lclient!sa;")
	public Class9 method1310() {
		return this.method1313();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1317(arg4, arg3);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()I")
	@Override
	public int method3587() {
		return this.anInt1864;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	@Override
	public void method3588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class96_Sub1 arg10) {
		@Pc(7) Class9 local7 = this.method1310();
		if (local7 != null) {
			local7.method3588(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass96_Sub1_4);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BZ)Lclient!sa;")
	private Class9 method1313() {
		@Pc(8) boolean local8 = Static4.anIntArrayArrayArray1 != Static38.anIntArrayArrayArray6;
		@Pc(19) Class31 local19 = Static77.method1518(this.anInt1862);
		@Pc(22) int local22 = local19.anInt1309;
		if (local19.anIntArray100 != null) {
			local19 = local19.method935();
		}
		if (local19 == null) {
			return null;
		}
		@Pc(54) int local54;
		if (Static68.anInt1404 != 0 && this.aBoolean103 && (this.aClass49_1 == null || this.aClass49_1 != null && this.aClass49_1.anInt2191 != local19.anInt1309)) {
			local54 = local19.anInt1309;
			if (local19.anInt1309 == -1) {
				local54 = local22;
			}
			if (local54 == -1) {
				this.aClass49_1 = null;
			} else {
				this.aClass49_1 = Static131.method697(local54);
			}
			if (this.aClass49_1 != null) {
				if (local19.aBoolean73 && this.aClass49_1.anInt2195 != -1) {
					this.anInt1849 = (int) ((double) this.aClass49_1.anIntArray168.length * Math.random());
					this.anInt1859 -= (int) (Math.random() * (double) this.aClass49_1.anIntArray170[this.anInt1849]);
				} else {
					this.anInt1849 = 0;
					this.anInt1859 = Static156.anInt3722 - 1;
				}
			}
		}
		local54 = this.anInt1868 & 0x3;
		@Pc(146) int local146;
		@Pc(149) int local149;
		if (local54 == 1 || local54 == 3) {
			local146 = local19.anInt1331;
			local149 = local19.anInt1321;
		} else {
			local146 = local19.anInt1321;
			local149 = local19.anInt1331;
		}
		@Pc(164) int local164 = (local146 >> 1) + this.anInt1870;
		@Pc(171) int local171 = (local149 >> 1) + this.anInt1873;
		@Pc(180) int local180 = (local146 + 1 >> 1) + this.anInt1870;
		@Pc(190) int local190 = this.anInt1873 + (local149 + 1 >> 1);
		this.method1317(local171 * 128, local164 * 128);
		@Pc(241) boolean local241 = !local8 && local19.aBoolean79 && (local19.anInt1319 != this.anInt1852 || (this.anInt1858 != this.anInt1849 || this.aClass49_1 != null && (this.aClass49_1.aBoolean131 || Static33.aBoolean265) && this.anInt1849 != this.anInt1866) && Static153.anInt3692 >= 2);
		@Pc(252) int[][] local252 = Static38.anIntArrayArrayArray6[this.anInt1851];
		@Pc(279) int local279 = local252[local180][local171] + local252[local164][local171] + local252[local164][local190] + local252[local180][local190] >> 2;
		@Pc(288) int local288 = (local149 << 6) + (this.anInt1873 << 7);
		@Pc(297) int local297 = (local146 << 6) + (this.anInt1870 << 7);
		@Pc(299) int[][] local299 = null;
		@Pc(306) boolean local306 = this.aClass7_Sub1_1 == null;
		if (local8) {
			local299 = Static4.anIntArrayArrayArray1[0];
		} else if (this.anInt1851 < 3) {
			local299 = Static38.anIntArrayArrayArray6[this.anInt1851 + 1];
		}
		@Pc(352) Class54 local352;
		if (this.aClass49_1 == null) {
			local352 = local19.method932(this.anInt1871, false, local252, local306 ? Static153.aClass7_Sub1_2 : this.aClass7_Sub1_1, local279, this.anInt1868, local288, local297, local299, local241);
		} else {
			local352 = local19.method936(local297, local299, this.anInt1857, local241, local288, this.aClass49_1, local252, this.anInt1871, this.anInt1849, local306 ? Static153.aClass7_Sub1_2 : this.aClass7_Sub1_1, local279, this.anInt1866, this.anInt1868);
		}
		return local352 == null ? null : local352.aClass9_2;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BII)V")
	private void method1317(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass49_1 == null) {
			return;
		}
		@Pc(21) int local21 = Static156.anInt3722 - this.anInt1859;
		if (local21 > 100 && this.aClass49_1.anInt2195 > 0) {
			@Pc(37) int local37 = this.aClass49_1.anIntArray168.length - this.aClass49_1.anInt2195;
			while (this.anInt1849 < local37 && local21 > this.aClass49_1.anIntArray170[this.anInt1849]) {
				local21 -= this.aClass49_1.anIntArray170[this.anInt1849];
				this.anInt1849++;
			}
			if (local37 <= this.anInt1849) {
				@Pc(80) int local80 = 0;
				for (@Pc(82) int local82 = local37; local82 < this.aClass49_1.anIntArray168.length; local82++) {
					local80 += this.aClass49_1.anIntArray170[local82];
				}
				local21 %= local80;
			}
			this.anInt1866 = this.anInt1849 + 1;
			if (this.aClass49_1.anIntArray168.length <= this.anInt1866) {
				this.anInt1866 -= this.aClass49_1.anInt2195;
				if (this.anInt1866 < 0 || this.anInt1866 >= this.aClass49_1.anIntArray168.length) {
					this.anInt1866 = -1;
				}
			}
		}
		while (local21 > this.aClass49_1.anIntArray170[this.anInt1849]) {
			Static232.method3865(arg0, arg1, false, this.anInt1849, this.aClass49_1);
			local21 -= this.aClass49_1.anIntArray170[this.anInt1849];
			this.anInt1849++;
			if (this.anInt1849 >= this.aClass49_1.anIntArray168.length) {
				this.anInt1849 -= this.aClass49_1.anInt2195;
				if (this.anInt1849 < 0 || this.anInt1849 >= this.aClass49_1.anIntArray168.length) {
					this.aClass49_1 = null;
					break;
				}
			}
			this.anInt1866 = this.anInt1849 + 1;
			if (this.aClass49_1.anIntArray168.length <= this.anInt1866) {
				this.anInt1866 -= this.aClass49_1.anInt2195;
				if (this.anInt1866 < 0 || this.anInt1866 >= this.aClass49_1.anIntArray168.length) {
					this.anInt1866 = -1;
				}
			}
		}
		this.anInt1859 = Static156.anInt3722 - local21;
		this.anInt1857 = local21;
	}
}
