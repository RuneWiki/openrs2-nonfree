import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class5_Sub14_Sub2 extends Class5_Sub14 {

	@OriginalMember(owner = "client!dg", name = "F", descriptor = "Z")
	private boolean aBoolean123;

	@OriginalMember(owner = "client!dg", name = "K", descriptor = "Z")
	private boolean aBoolean124;

	@OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
	private int anInt1815;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "Lclient!ga;")
	private final Class124 aClass124_13 = new Class124();

	@OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
	private int anInt1810 = 256;

	@OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
	private int anInt1811 = 256;

	@OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
	private int anInt1814 = 0;

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
	private final int anInt1799;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I)V")
	public Class5_Sub14_Sub2(@OriginalArg(0) int arg0) {
		this.anInt1799 = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "()Lclient!eha;")
	@Override
	public Class5_Sub14 method8779() {
		return null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8778(@OriginalArg(0) int arg0) {
		if (this.aBoolean123) {
			return;
		}
		while (true) {
			@Pc(11) Class5_Sub2_Sub17 local11 = this.method1687();
			if (local11 == null) {
				if (this.aBoolean124) {
					this.method8829();
					Static357.aClass252_2.method5970();
				}
				return;
			}
			if (arg0 < local11.aShortArrayArray15[0].length - this.anInt1815) {
				this.anInt1815 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray15[0].length - this.anInt1815;
			this.method1683();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!of;Z)V")
	public synchronized void method1682(@OriginalArg(0) Class5_Sub2_Sub17 arg0) {
		while (this.anInt1814 >= 100) {
			this.aClass124_13.method2571();
			this.anInt1814--;
		}
		this.aClass124_13.method2574(arg0);
		this.anInt1814++;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
	private synchronized void method1683() {
		@Pc(11) Class5_Sub2_Sub17 local11 = this.method1687();
		if (local11 != null) {
			local11.method8829();
			this.anInt1814--;
			this.anInt1815 = 0;
			Static357.aClass252_2.method5974(local11, local11.method6180());
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8781(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean123) {
			return;
		}
		if (this.method1687() != null) {
			@Pc(27) int local27 = arg1 + arg2;
			if (Static135.aBoolean154) {
				local27 <<= 0x1;
			}
			@Pc(37) byte local37 = 0;
			if (this.anInt1799 == 2) {
				local37 = 1;
			}
			while (local27 > arg1) {
				@Pc(49) Class5_Sub2_Sub17 local49 = this.method1687();
				if (local49 == null) {
					return;
				}
				@Pc(55) short[][] local55 = local49.aShortArrayArray15;
				while (arg1 < local27 && this.anInt1815 < local55[0].length) {
					if (Static135.aBoolean154) {
						arg0[arg1++] = local55[0][this.anInt1815] * this.anInt1810;
						arg0[arg1++] = local55[local37][this.anInt1815] * this.anInt1811;
					} else {
						@Pc(61) int local61 = arg1++;
						arg0[local61] += local55[local37][this.anInt1815] * this.anInt1811 + this.anInt1810 * local55[0][this.anInt1815];
					}
					this.anInt1815++;
				}
				if (local55[0].length <= this.anInt1815) {
					this.method1683();
				}
			}
		} else if (this.aBoolean124) {
			this.method8829();
			Static357.aClass252_2.method5970();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IDZ)Lclient!of;")
	public Class5_Sub2_Sub17 method1684(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(11) long local11 = (long) (arg0 | this.anInt1799 << 0);
		@Pc(17) Class5_Sub2_Sub17 local17 = (Class5_Sub2_Sub17) Static357.aClass252_2.method5973(local11);
		if (local17 == null) {
			local17 = new Class5_Sub2_Sub17(new short[this.anInt1799][arg0], arg1);
		} else {
			local17.aDouble14 = arg1;
			Static357.aClass252_2.method5971(local11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "()Lclient!eha;")
	@Override
	public Class5_Sub14 method8780() {
		return null;
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "()I")
	@Override
	public int method8783() {
		return 1;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)D")
	public synchronized double method1685() {
		if (this.anInt1814 < 1) {
			return -1.0D;
		} else {
			@Pc(22) Class5_Sub2_Sub17 local22 = (Class5_Sub2_Sub17) this.aClass124_13.method2572();
			return local22 == null ? -1.0D : (double) -((float) local22.aShortArrayArray15[0].length / (float) Static227.anInt3654) + local22.aDouble14;
		}
	}

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)Lclient!of;")
	private synchronized Class5_Sub2_Sub17 method1687() {
		return (Class5_Sub2_Sub17) this.aClass124_13.method2572();
	}

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)I")
	public synchronized int method1689() {
		return this.anInt1814;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)V")
	public synchronized void method1690(@OriginalArg(0) boolean arg0) {
		this.aBoolean123 = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	public synchronized void method1691() {
		this.aBoolean124 = true;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)V")
	public void method1694(@OriginalArg(0) int arg0) {
		this.anInt1810 = arg0;
		this.anInt1811 = arg0;
	}
}
