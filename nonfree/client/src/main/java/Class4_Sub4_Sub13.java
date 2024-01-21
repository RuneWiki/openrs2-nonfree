import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class4_Sub4_Sub13 extends Class4_Sub4 {

	@OriginalMember(owner = "client!qe", name = "G", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!qe", name = "O", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
	public int anInt2224;

	@OriginalMember(owner = "client!qe", name = "R", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!qe", name = "V", descriptor = "I")
	private int anInt2227;

	@OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
	private int anInt2223 = 0;

	@OriginalMember(owner = "client!qe", name = "Z", descriptor = "I")
	public int anInt2230 = -1;

	@OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
	private int anInt2231 = 0;

	@OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
	private int anInt2226 = 0;

	@OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
	private int anInt2221 = 128;

	@OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
	private int anInt2233 = 128;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!ne;Z)V")
	private void method1544(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt2227 = arg1.method604();
		} else if (arg0 == 2) {
			this.anInt2230 = arg1.method604();
		} else if (arg0 == 4) {
			this.anInt2233 = arg1.method604();
		} else if (arg0 == 5) {
			this.anInt2221 = arg1.method604();
		} else if (arg0 == 6) {
			this.anInt2226 = arg1.method604();
		} else if (arg0 == 7) {
			this.anInt2231 = arg1.method599();
		} else if (arg0 == 8) {
			this.anInt2223 = arg1.method599();
			return;
		} else {
			@Pc(54) int local54;
			@Pc(64) int local64;
			if (arg0 == 40) {
				local54 = arg1.method599();
				this.aShortArray20 = new short[local54];
				this.aShortArray21 = new short[local54];
				for (local64 = 0; local64 < local54; local64++) {
					this.aShortArray21[local64] = (short) arg1.method604();
					this.aShortArray20[local64] = (short) arg1.method604();
				}
				return;
			}
			if (arg0 == 41) {
				local54 = arg1.method599();
				this.aShortArray23 = new short[local54];
				this.aShortArray22 = new short[local54];
				for (local64 = 0; local64 < local54; local64++) {
					this.aShortArray23[local64] = (short) arg1.method604();
					this.aShortArray22[local64] = (short) arg1.method604();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lclient!u;")
	public Class4_Sub4_Sub3_Sub7 method1545(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub4_Sub3_Sub7 local13 = (Class4_Sub4_Sub3_Sub7) Static95.aClass72_24.method1781((long) this.anInt2224);
		if (local13 == null) {
			@Pc(21) Class4_Sub4_Sub3_Sub5 local21 = Static108.method1648(Static43.aClass17_5, this.anInt2227);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray21 != null) {
				for (local30 = 0; local30 < this.aShortArray21.length; local30++) {
					local21.method1657(this.aShortArray21[local30], this.aShortArray20[local30]);
				}
			}
			if (this.aShortArray23 != null) {
				for (local30 = 0; local30 < this.aShortArray23.length; local30++) {
					local21.method1655(this.aShortArray23[local30], this.aShortArray22[local30]);
				}
			}
			local13 = local21.method1652(this.anInt2231 + 64, this.anInt2223 + 850, -30, -50, -30);
			Static95.aClass72_24.method1783(local13, (long) this.anInt2224);
		}
		@Pc(115) Class4_Sub4_Sub3_Sub7 local115;
		if (this.anInt2230 == -1 || arg0 == -1) {
			local115 = local13.method1777(true);
		} else {
			local115 = Static118.method1796(this.anInt2230).method1037(local13, arg0);
		}
		if (this.anInt2233 != 128 || this.anInt2221 != 128) {
			local115.method1774(this.anInt2233, this.anInt2221, this.anInt2233);
		}
		if (this.anInt2226 != 0) {
			if (this.anInt2226 == 90) {
				local115.method1765();
			}
			if (this.anInt2226 == 180) {
				local115.method1765();
				local115.method1765();
			}
			if (this.anInt2226 == 270) {
				local115.method1765();
				local115.method1765();
				local115.method1765();
			}
		}
		return local115;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!ne;)V")
	public void method1548(@OriginalArg(1) Class4_Sub10 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method599();
			if (local14 == 0) {
				return;
			}
			this.method1544(local14, arg0);
		}
	}
}
