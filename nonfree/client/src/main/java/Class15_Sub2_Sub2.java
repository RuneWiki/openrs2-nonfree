import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class15_Sub2_Sub2 extends Class15_Sub2 {

	@OriginalMember(owner = "client!dq", name = "w", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!dq", name = "y", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!dq", name = "E", descriptor = "Lclient!io;")
	private Class60_Sub4 aClass60_Sub4_1;

	@OriginalMember(owner = "client!dq", name = "K", descriptor = "I")
	private int anInt1823;

	@OriginalMember(owner = "client!dq", name = "R", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!dq", name = "S", descriptor = "I")
	private int anInt1828;

	@OriginalMember(owner = "client!dq", name = "U", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!dq", name = "X", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!dq", name = "Z", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!dq", name = "bb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!dq", name = "gb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!dq", name = "I", descriptor = "Z")
	private boolean aBoolean124 = false;

	@OriginalMember(owner = "client!dq", name = "W", descriptor = "I")
	private int anInt1831 = -32768;

	@OriginalMember(owner = "client!dq", name = "ib", descriptor = "I")
	private int anInt1839 = -1;

	@OriginalMember(owner = "client!dq", name = "F", descriptor = "I")
	private int anInt1819 = 0;

	@OriginalMember(owner = "client!dq", name = "N", descriptor = "I")
	private int anInt1826 = 0;

	@OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
	private final int anInt1815;

	@OriginalMember(owner = "client!dq", name = "v", descriptor = "I")
	public final int anInt1812;

	@OriginalMember(owner = "client!dq", name = "Y", descriptor = "I")
	private final int anInt1832;

	@OriginalMember(owner = "client!dq", name = "fb", descriptor = "I")
	public final int anInt1837;

	@OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
	private final int anInt1816;

	@OriginalMember(owner = "client!dq", name = "u", descriptor = "I")
	public final int anInt1811;

	@OriginalMember(owner = "client!dq", name = "hb", descriptor = "I")
	private final int anInt1838;

	@OriginalMember(owner = "client!dq", name = "H", descriptor = "I")
	public final int anInt1821;

	@OriginalMember(owner = "client!dq", name = "P", descriptor = "Z")
	private final boolean aBoolean125;

	@OriginalMember(owner = "client!dq", name = "Q", descriptor = "Lclient!ct;")
	private final Class63 aClass63_1;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class15_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static37.method631(arg3, arg2, arg1) - arg4, arg3, arg2 >> 9, arg2 >> 9, arg3 >> 9, arg3 >> 9, false, (byte) 0);
		this.anInt1815 = arg0;
		this.anInt1812 = arg6;
		this.anInt1832 = arg7;
		this.anInt1837 = arg10;
		this.anInt1816 = arg8;
		this.aBoolean124 = false;
		this.anInt1811 = arg9;
		this.anInt1838 = arg4;
		this.anInt1821 = arg5;
		this.aBoolean125 = arg11;
		@Pc(78) int local78 = Static475.aClass291_2.method6548(this.anInt1815).anInt6960;
		if (local78 == -1) {
			this.aClass63_1 = null;
		} else {
			this.aClass63_1 = Static388.aClass324_2.method7265(local78);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
	public void method1661() {
		if (this.aClass60_Sub4_1 != null) {
			this.aClass60_Sub4_1.method3590();
		}
	}

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "(I)V")
	@Override
	public void method7122() {
		super.aShort116 = super.aShort115 = (short) (this.aDouble7 / 512.0D);
		super.aShort114 = super.aShort117 = (short) (this.aDouble4 / 512.0D);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
		@Pc(9) Class24 local9 = this.method1664(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(20) Class93 local20 = arg0.method7455();
		local20.XA(this.anInt1828);
		local20.P(this.anInt1823);
		local20.G((int) this.aDouble7, (int) this.aDouble6, (int) this.aDouble4);
		this.anInt1831 = local9.DA();
		this.method1663(local20, local9, arg0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		@Pc(16) Class24 local16 = this.method1664(arg0, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class93 local23 = arg0.method7455();
		local23.XA(this.anInt1828);
		local23.P(this.anInt1823);
		local23.G((int) this.aDouble7, (int) this.aDouble6, (int) this.aDouble4);
		this.method1663(local23, local16, arg0);
		if (this.aClass60_Sub4_1 == null) {
			local16.method7393(local23, null, 0);
		} else {
			@Pc(62) Class127 local62 = this.aClass60_Sub4_1.method3587();
			arg0.method7470(local16, local62, local23, null, 0);
		}
		this.anInt1831 = local16.DA();
		return null;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!q;ILclient!ba;Lclient!oa;)V")
	private void method1663(@OriginalArg(0) Class93 arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) Class90 arg2) {
		arg1.method7388(arg0);
		@Pc(21) Class33[] local21 = arg1.method7383();
		@Pc(24) Class335[] local24 = arg1.method7402();
		if ((this.aClass60_Sub4_1 == null || this.aClass60_Sub4_1.aBoolean316) && (local21 != null || local24 != null)) {
			this.aClass60_Sub4_1 = Static229.method3576(Static363.anInt6671, true);
		}
		if (this.aClass60_Sub4_1 != null) {
			this.aClass60_Sub4_1.method3580(arg2, (long) Static363.anInt6671, local21, local24);
			this.aClass60_Sub4_1.method3577(super.aByte98, super.aShort116, super.aShort115, super.aShort114, super.aShort117);
		}
	}

	@OriginalMember(owner = "client!dq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass60_Sub4_1 != null) {
			this.aClass60_Sub4_1.method3590();
		}
	}

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7162() {
		return false;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	private Class24 method1664(@OriginalArg(0) Class90 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class239 local14 = Static475.aClass291_2.method6548(this.anInt1815);
		return local14.method5575(this.anInt1826, this.anInt1839, arg1, Static388.aClass324_2, arg0, this.anInt1819);
	}

	@OriginalMember(owner = "client!dq", name = "i", descriptor = "(I)I")
	@Override
	public int method7123() {
		return this.anInt1831;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILclient!gfa;IIZLclient!oa;)V")
	@Override
	public void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class90 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V")
	@Override
	public void method7165() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)V")
	public void method1666(@OriginalArg(0) int arg0) {
		this.aBoolean124 = true;
		this.aDouble4 += this.aDouble3 * (double) arg0;
		this.aDouble7 += this.aDouble5 * (double) arg0;
		if (this.aBoolean125) {
			this.aDouble6 = Static37.method631((int) this.aDouble4, (int) this.aDouble7, super.aByte98) - this.anInt1838;
		} else if (this.anInt1832 == -1) {
			this.aDouble6 += (double) arg0 * this.aDouble9;
		} else {
			this.aDouble6 += (double) arg0 * (double) arg0 * 0.5D * this.aDouble2 + this.aDouble9 * (double) arg0;
			this.aDouble9 += (double) arg0 * this.aDouble2;
		}
		this.anInt1823 = (int) (Math.atan2(this.aDouble5, this.aDouble3) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt1828 = (int) (Math.atan2(this.aDouble9, this.aDouble8) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass63_1 == null) {
			return;
		}
		this.anInt1826 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass63_1.anIntArray128[this.anInt1819] >= this.anInt1826) {
						return;
					}
					this.anInt1826 -= this.aClass63_1.anIntArray128[this.anInt1819];
					this.anInt1819++;
					if (this.aClass63_1.anIntArray127.length <= this.anInt1819) {
						this.anInt1819 -= this.aClass63_1.anInt1378;
						if (this.anInt1819 < 0 || this.aClass63_1.anIntArray127.length <= this.anInt1819) {
							this.anInt1819 = 0;
						}
					}
					this.anInt1839 = this.anInt1819 + 1;
				} while (this.anInt1839 < this.aClass63_1.anIntArray127.length);
				this.anInt1839 -= this.aClass63_1.anInt1378;
			} while (this.anInt1839 >= 0 && this.aClass63_1.anIntArray127.length > this.anInt1839);
			this.anInt1839 = -1;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIII)V")
	public void method1667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) double local21;
		if (!this.aBoolean124) {
			local21 = arg0 - super.anInt8911;
			@Pc(28) double local28 = (double) (arg1 - super.anInt8913);
			@Pc(37) double local37 = Math.sqrt(local21 * local21 + local28 * local28);
			this.aDouble7 = (double) super.anInt8911 + (double) this.anInt1816 * local21 / local37;
			this.aDouble4 = (double) super.anInt8913 + local28 * (double) this.anInt1816 / local37;
			if (this.aBoolean125) {
				this.aDouble6 = Static37.method631((int) this.aDouble4, (int) this.aDouble7, super.aByte98) - this.anInt1838;
			} else {
				this.aDouble6 = super.anInt8915;
			}
		}
		local21 = this.anInt1812 + 1 - arg3;
		this.aDouble5 = ((double) arg0 - this.aDouble7) / local21;
		this.aDouble3 = ((double) arg1 - this.aDouble4) / local21;
		this.aDouble8 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble5 * this.aDouble5);
		if (this.anInt1832 == -1) {
			this.aDouble9 = ((double) arg2 - this.aDouble6) / local21;
		} else {
			if (!this.aBoolean124) {
				this.aDouble9 = -this.aDouble8 * Math.tan((double) this.anInt1832 * 0.02454369D);
			}
			this.aDouble2 = ((double) arg2 - local21 * this.aDouble9 - this.aDouble6) * 2.0D / (local21 * local21);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		return false;
	}
}
