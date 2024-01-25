import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class128 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public int anInt3747;

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
	private int anInt3753;

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "Z")
	public boolean aBoolean267 = false;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
	private int anInt3749 = 0;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
	private int anInt3757 = 0;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
	private int anInt3754 = 0;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
	private int anInt3756 = 128;

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
	private int anInt3762 = 128;

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
	public int anInt3759 = -1;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "Z")
	public boolean aBoolean266 = false;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!bk;IB)V")
	private void method3463(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3753 = arg0.method1845();
		} else if (arg1 == 2) {
			this.anInt3759 = arg0.method1845();
		} else if (arg1 == 4) {
			this.anInt3762 = arg0.method1845();
		} else if (arg1 == 5) {
			this.anInt3756 = arg0.method1845();
		} else if (arg1 == 6) {
			this.anInt3754 = arg0.method1845();
		} else if (arg1 == 7) {
			this.anInt3749 = arg0.method1832();
		} else if (arg1 == 8) {
			this.anInt3757 = arg0.method1832();
		} else if (arg1 == 9) {
			this.aBoolean267 = true;
		} else if (arg1 == 10) {
			this.aBoolean266 = true;
		} else {
			@Pc(105) int local105;
			@Pc(115) int local115;
			if (arg1 == 40) {
				local105 = arg0.method1832();
				this.aShortArray42 = new short[local105];
				this.aShortArray44 = new short[local105];
				for (local115 = 0; local115 < local105; local115++) {
					this.aShortArray44[local115] = (short) arg0.method1845();
					this.aShortArray42[local115] = (short) arg0.method1845();
				}
			} else if (arg1 == 41) {
				local105 = arg0.method1832();
				this.aShortArray43 = new short[local105];
				this.aShortArray41 = new short[local105];
				for (local115 = 0; local115 < local105; local115++) {
					this.aShortArray43[local115] = (short) arg0.method1845();
					this.aShortArray41[local115] = (short) arg0.method1845();
				}
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!en;IIBI)Lclient!mj;")
	public Class101 method3470(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg0;
		@Pc(21) Class17 local21 = this.anInt3759 == -1 || arg4 == -1 ? null : Static261.method4492(this.anInt3759);
		if (local21 != null) {
			local7 = arg0 | local21.method522(arg4, arg3, false);
		}
		if (this.anInt3756 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt3762 != 128 || this.anInt3754 != 0) {
			local7 |= 0x5;
		}
		@Pc(61) Class66 local61 = Static35.aClass66_8;
		@Pc(79) Class101 local79;
		synchronized (Static35.aClass66_8) {
			local79 = (Class101) Static35.aClass66_8.method1939((long) (this.anInt3747 |= arg1.anInt5487 << 29));
		}
		if (local79 == null || arg1.method4792(local79.method5171(), local7) != 0) {
			if (local79 != null) {
				local7 = arg1.method4843(local7, local79.method5171());
			}
			@Pc(103) int local103 = local7;
			if (this.aShortArray44 != null) {
				local103 = local7 | 0x2000;
			}
			if (this.aShortArray43 != null) {
				local103 |= 0x4000;
			}
			@Pc(124) Class150 local124 = Static17.method5326(this.anInt3753, Static310.aClass170_106);
			if (local124 == null) {
				return null;
			}
			local79 = arg1.method4804(local124, local103, Static15.anInt503, this.anInt3749 + 64, this.anInt3757 + 850);
			@Pc(147) int local147;
			if (this.aShortArray44 != null) {
				for (local147 = 0; local147 < this.aShortArray44.length; local147++) {
					local79.method5159(this.aShortArray44[local147], this.aShortArray42[local147]);
				}
			}
			if (this.aShortArray43 != null) {
				for (local147 = 0; local147 < this.aShortArray43.length; local147++) {
					local79.method5153(this.aShortArray43[local147], this.aShortArray41[local147]);
				}
			}
			local79.method5145(local7);
			@Pc(197) Class66 local197 = Static35.aClass66_8;
			synchronized (Static35.aClass66_8) {
				Static35.aClass66_8.method1936((long) (this.anInt3747 |= arg1.anInt5487 << 29), local79);
			}
		}
		@Pc(226) Class101 local226 = local79.method5184((byte) 2, local7, true);
		if (local21 != null) {
			local226 = local21.method521(arg3, local226, arg2, (byte) 2, 0, local7, arg4);
		}
		if (this.anInt3762 != 128 || this.anInt3756 != 128) {
			local226.method5158(this.anInt3762, this.anInt3756, this.anInt3762);
		}
		if (this.anInt3754 != 0) {
			if (this.anInt3754 == 90) {
				local226.method5177(4096);
			}
			if (this.anInt3754 == 180) {
				local226.method5177(8192);
			}
			if (this.anInt3754 == 270) {
				local226.method5177(12288);
			}
		}
		local226.method5145(arg0);
		return local226;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!bk;I)V")
	public void method3473(@OriginalArg(0) Class5_Sub1 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1832();
			if (local13 == 0) {
				return;
			}
			this.method3463(arg0, local13);
		}
	}
}
