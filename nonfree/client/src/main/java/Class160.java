import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class160 {

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
	private int anInt3625;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
	public int anInt3629;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "Lclient!wha;")
	public Class385 aClass385_1;

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!hi", name = "o", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
	private int anInt3630 = -1;

	@OriginalMember(owner = "client!hi", name = "B", descriptor = "Z")
	public boolean aBoolean288 = false;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
	private int anInt3633 = 0;

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "B")
	public byte aByte50 = 0;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
	public int anInt3635 = -1;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
	private int anInt3632 = 0;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
	private int anInt3636 = 128;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
	private int anInt3640 = 128;

	@OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
	private int anInt3638 = 0;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIILclient!sda;BLclient!ha;IB)Lclient!ka;")
	public Class164 method3178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class317 arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) Class57 arg5, @OriginalArg(6) int arg6) {
		return this.method3184((Class22) null, arg5, arg6, arg2, 0, arg1, 0, arg3, arg0, false, 0, (Class22) null, arg4);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!s;ILclient!s;Lclient!ha;IZIZLclient!sda;III)Lclient!ka;")
	public Class164 method3179(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(4) Class57 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class317 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method3184(arg1, arg4, arg5, arg6, arg10, arg8, arg0, arg7, arg2, true, arg9, arg3, (byte) 2);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!ha;Lclient!sda;IIIBI)Lclient!ka;")
	public Class164 method3180(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class317 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		return this.method3184((Class22) null, arg0, arg2, arg5, 0, arg4, 0, arg1, arg3, false, 0, (Class22) null, (byte) 2);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILclient!ib;)V")
	private void method3182(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt3625 = arg1.method8519();
		} else if (arg0 == 2) {
			this.anInt3635 = arg1.method8519();
		} else if (arg0 == 4) {
			this.anInt3636 = arg1.method8519();
		} else if (arg0 == 5) {
			this.anInt3640 = arg1.method8519();
		} else if (arg0 == 6) {
			this.anInt3638 = arg1.method8519();
		} else if (arg0 == 7) {
			this.anInt3632 = arg1.method8529();
		} else if (arg0 == 8) {
			this.anInt3633 = arg1.method8529();
		} else if (arg0 == 9) {
			this.anInt3630 = 8224;
			this.aByte50 = 3;
		} else if (arg0 == 10) {
			this.aBoolean288 = true;
		} else if (arg0 == 11) {
			this.aByte50 = 1;
		} else if (arg0 == 12) {
			this.aByte50 = 4;
		} else if (arg0 == 13) {
			this.aByte50 = 5;
		} else if (arg0 == 14) {
			this.aByte50 = 2;
			this.anInt3630 = arg1.method8529() * 256;
		} else if (arg0 == 15) {
			this.aByte50 = 3;
			this.anInt3630 = arg1.method8519();
		} else if (arg0 == 16) {
			this.aByte50 = 3;
			this.anInt3630 = arg1.method8527();
		} else {
			@Pc(166) int local166;
			@Pc(176) int local176;
			if (arg0 == 40) {
				local166 = arg1.method8529();
				this.aShortArray23 = new short[local166];
				this.aShortArray24 = new short[local166];
				for (local176 = 0; local176 < local166; local176++) {
					this.aShortArray23[local176] = (short) arg1.method8519();
					this.aShortArray24[local176] = (short) arg1.method8519();
				}
			} else if (arg0 == 41) {
				local166 = arg1.method8529();
				this.aShortArray26 = new short[local166];
				this.aShortArray25 = new short[local166];
				for (local176 = 0; local176 < local166; local176++) {
					this.aShortArray26[local176] = (short) arg1.method8519();
					this.aShortArray25[local176] = (short) arg1.method8519();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!ib;)V")
	public void method3183(@OriginalArg(1) Class5_Sub23 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method8529();
			if (local10 == 0) {
				return;
			}
			this.method3182(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLclient!s;Lclient!ha;IIIIILclient!sda;IZILclient!s;B)Lclient!ka;")
	private Class164 method3184(@OriginalArg(1) Class22 arg0, @OriginalArg(2) Class57 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class317 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class22 arg11, @OriginalArg(13) byte arg12) {
		@Pc(7) int local7 = arg5;
		@Pc(27) Class165 local27 = this.anInt3635 == -1 || arg8 == -1 ? null : arg7.method7882(this.anInt3635, 100);
		@Pc(37) boolean local37 = arg9 & this.aByte50 != 0;
		if (local27 != null) {
			local7 = arg5 | local27.method3393(-1149698992, arg3, arg8, false);
		}
		if (local37) {
			local7 |= this.aByte50 == 3 ? 7 : 2;
		}
		if (this.anInt3640 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt3636 != 128 || this.anInt3638 != 0) {
			local7 |= 0x5;
		}
		@Pc(95) Class391 local95 = this.aClass385_1.aClass391_66;
		@Pc(115) Class164 local115;
		synchronized (this.aClass385_1.aClass391_66) {
			local115 = (Class164) this.aClass385_1.aClass391_66.method9275((long) (this.anInt3629 |= arg1.anInt8956 << 29));
		}
		if (local115 == null || arg1.method7670(local115.ua(), local7) != 0) {
			if (local115 != null) {
				local7 = arg1.method7661(local7, local115.ua());
			}
			@Pc(143) int local143 = local7;
			if (this.aShortArray23 != null) {
				local143 = local7 | 0x4000;
			}
			if (this.aShortArray26 != null) {
				local143 |= 0x8000;
			}
			@Pc(166) Class192 local166 = Static213.method3061(this.aClass385_1.aClass208_147, this.anInt3625);
			if (local166 == null) {
				return null;
			}
			if (local166.anInt5087 < 13) {
				local166.method4319();
			}
			local115 = arg1.method7700(local166, local143, this.aClass385_1.anInt10648, this.anInt3632 + 64, this.anInt3633 + 850);
			@Pc(204) int local204;
			if (this.aShortArray23 != null) {
				for (local204 = 0; local204 < this.aShortArray23.length; local204++) {
					local115.ia(this.aShortArray23[local204], this.aShortArray24[local204]);
				}
			}
			if (this.aShortArray26 != null) {
				for (local204 = 0; local204 < this.aShortArray26.length; local204++) {
					local115.aa(this.aShortArray26[local204], this.aShortArray25[local204]);
				}
			}
			local115.s(local7);
			@Pc(266) Class391 local266 = this.aClass385_1.aClass391_66;
			synchronized (this.aClass385_1.aClass391_66) {
				this.aClass385_1.aClass391_66.method9273((long) (this.anInt3629 |= arg1.anInt8956 << 29), local115, 1);
			}
		}
		@Pc(311) Class164 local311 = local27 == null ? local115.method9072(arg12, local7, true) : local27.method3400(0, arg2, arg8, arg12, arg3, local7, local115);
		if (this.anInt3636 != 128 || this.anInt3640 != 128) {
			local311.O(this.anInt3636, this.anInt3640, this.anInt3636);
		}
		if (this.anInt3638 != 0) {
			if (this.anInt3638 == 90) {
				local311.a(4096);
			}
			if (this.anInt3638 == 180) {
				local311.a(8192);
			}
			if (this.anInt3638 == 270) {
				local311.a(12288);
			}
		}
		if (local37) {
			local311.p(this.aByte50, this.anInt3630, arg11, arg0, arg4, arg6, arg10);
		}
		local311.s(arg5);
		return local311;
	}
}
