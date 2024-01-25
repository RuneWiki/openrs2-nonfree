import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class354 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "[S")
	private short[] aShortArray147;

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "[S")
	private short[] aShortArray148;

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "Lclient!oq;")
	public Class263 aClass263_2;

	@OriginalMember(owner = "client!uq", name = "v", descriptor = "I")
	private int anInt9839;

	@OriginalMember(owner = "client!uq", name = "x", descriptor = "[S")
	private short[] aShortArray149;

	@OriginalMember(owner = "client!uq", name = "y", descriptor = "[S")
	private short[] aShortArray150;

	@OriginalMember(owner = "client!uq", name = "B", descriptor = "I")
	public int anInt9843;

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
	private int anInt9826 = 128;

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
	private int anInt9832 = 0;

	@OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
	private int anInt9836 = 0;

	@OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
	private int anInt9835 = 128;

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "I")
	private int anInt9838 = 0;

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
	private int anInt9834 = -1;

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "Z")
	public boolean aBoolean712 = false;

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
	public int anInt9829 = -1;

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "B")
	public byte aByte130 = 0;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BIILclient!ru;IILclient!ha;)Lclient!ka;")
	public Class193 method8347(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class308 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13 arg5) {
		return this.method8350(arg3, (byte) 5, (Class91) null, arg0, 0, arg1, false, 0, (Class91) null, arg4, arg2, arg5, 0);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIILclient!ha;Lclient!ru;I)Lclient!ka;")
	public Class193 method8348(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class13 arg3, @OriginalArg(5) Class308 arg4, @OriginalArg(6) int arg5) {
		return this.method8350(arg5, (byte) 2, (Class91) null, arg2, 0, arg0, false, 0, (Class91) null, arg1, arg4, arg3, 0);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBLclient!s;IIIZILclient!s;ILclient!ru;Lclient!ha;IB)Lclient!ka;")
	private Class193 method8350(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class91 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class308 arg10, @OriginalArg(11) Class13 arg11, @OriginalArg(12) int arg12) {
		@Pc(7) int local7 = arg9;
		@Pc(22) Class228 local22 = this.anInt9829 == -1 || arg5 == -1 ? null : arg10.method7075(this.anInt9829);
		@Pc(31) boolean local31 = arg6 & this.aByte130 != 0;
		if (local22 != null) {
			local7 = arg9 | local22.method5358(arg5, arg0, false);
		}
		if (local31) {
			local7 |= this.aByte130 == 3 ? 7 : 2;
		}
		if (this.anInt9826 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt9835 != 128 || this.anInt9838 != 0) {
			local7 |= 0x5;
		}
		@Pc(84) Class69 local84 = this.aClass263_2.aClass69_42;
		@Pc(104) Class193 local104;
		synchronized (this.aClass263_2.aClass69_42) {
			local104 = (Class193) this.aClass263_2.aClass69_42.method1919((long) (this.anInt9843 |= arg11.anInt9527 << 29));
		}
		if (local104 == null || arg11.method8163(local104.ua(), local7) != 0) {
			if (local104 != null) {
				local7 = arg11.method8122(local7, local104.ua());
			}
			@Pc(128) int local128 = local7;
			if (this.aShortArray150 != null) {
				local128 = local7 | 0x4000;
			}
			if (this.aShortArray149 != null) {
				local128 |= 0x8000;
			}
			@Pc(151) Class212 local151 = Static532.method7368(this.aClass263_2.aClass238_189, this.anInt9839);
			if (local151 == null) {
				return null;
			}
			if (local151.anInt5662 < 13) {
				local151.method4920();
			}
			local104 = arg11.method8161(local151, local128, this.aClass263_2.anInt6997, this.anInt9832 + 64, this.anInt9836 + 850);
			@Pc(186) int local186;
			if (this.aShortArray150 != null) {
				for (local186 = 0; local186 < this.aShortArray150.length; local186++) {
					local104.ia(this.aShortArray150[local186], this.aShortArray148[local186]);
				}
			}
			if (this.aShortArray149 != null) {
				for (local186 = 0; local186 < this.aShortArray149.length; local186++) {
					local104.aa(this.aShortArray149[local186], this.aShortArray147[local186]);
				}
			}
			local104.s(local7);
			@Pc(238) Class69 local238 = this.aClass263_2.aClass69_42;
			synchronized (this.aClass263_2.aClass69_42) {
				this.aClass263_2.aClass69_42.method1917((long) (this.anInt9843 |= arg11.anInt9527 << 29), local104);
			}
		}
		@Pc(282) Class193 local282 = local22 == null ? local104.method6609(arg1, local7, true) : local22.method5355(arg0, local104, arg1, arg5, local7, arg3, 0);
		if (this.anInt9835 != 128 || this.anInt9826 != 128) {
			local282.O(this.anInt9835, this.anInt9826, this.anInt9835);
		}
		if (this.anInt9838 != 0) {
			if (this.anInt9838 == 90) {
				local282.a(4096);
			}
			if (this.anInt9838 == 180) {
				local282.a(8192);
			}
			if (this.anInt9838 == 270) {
				local282.a(12288);
			}
		}
		if (local31) {
			local282.p(this.aByte130, this.anInt9834, arg8, arg2, arg12, arg4, arg7);
		}
		local282.s(arg9);
		return local282;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!sl;I)V")
	public void method8351(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method2859();
			if (local11 == 0) {
				return;
			}
			this.method8352(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IILclient!sl;)V")
	private void method8352(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt9839 = arg1.method2825();
		} else if (arg0 == 2) {
			this.anInt9829 = arg1.method2825();
		} else if (arg0 == 4) {
			this.anInt9835 = arg1.method2825();
		} else if (arg0 == 5) {
			this.anInt9826 = arg1.method2825();
		} else if (arg0 == 6) {
			this.anInt9838 = arg1.method2825();
		} else if (arg0 == 7) {
			this.anInt9832 = arg1.method2859();
		} else if (arg0 == 8) {
			this.anInt9836 = arg1.method2859();
		} else if (arg0 == 9) {
			this.aByte130 = 3;
			this.anInt9834 = 8224;
		} else if (arg0 == 10) {
			this.aBoolean712 = true;
		} else if (arg0 == 11) {
			this.aByte130 = 1;
		} else if (arg0 == 12) {
			this.aByte130 = 4;
		} else if (arg0 == 13) {
			this.aByte130 = 5;
		} else if (arg0 == 14) {
			this.aByte130 = 2;
			this.anInt9834 = arg1.method2859() * 256;
		} else if (arg0 == 15) {
			this.aByte130 = 3;
			this.anInt9834 = arg1.method2825();
		} else if (arg0 == 16) {
			this.aByte130 = 3;
			this.anInt9834 = arg1.method2881();
		} else {
			@Pc(91) int local91;
			@Pc(101) int local101;
			if (arg0 == 40) {
				local91 = arg1.method2859();
				this.aShortArray148 = new short[local91];
				this.aShortArray150 = new short[local91];
				for (local101 = 0; local101 < local91; local101++) {
					this.aShortArray150[local101] = (short) arg1.method2825();
					this.aShortArray148[local101] = (short) arg1.method2825();
				}
			} else if (arg0 == 41) {
				local91 = arg1.method2859();
				this.aShortArray149 = new short[local91];
				this.aShortArray147 = new short[local91];
				for (local101 = 0; local101 < local91; local101++) {
					this.aShortArray149[local101] = (short) arg1.method2825();
					this.aShortArray147[local101] = (short) arg1.method2825();
				}
			}
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IILclient!s;BIILclient!ru;IILclient!s;IZLclient!ha;)Lclient!ka;")
	public Class193 method8353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class308 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class91 arg8, @OriginalArg(10) int arg9, @OriginalArg(12) Class13 arg10) {
		return this.method8350(arg9, (byte) 2, arg8, arg4, arg0, arg6, true, arg7, arg2, arg3, arg5, arg10, arg1);
	}
}
