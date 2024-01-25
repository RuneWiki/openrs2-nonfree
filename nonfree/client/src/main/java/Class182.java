import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class182 {

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "Lclient!jc;")
	public Class116 aClass116_2;

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
	private int anInt5096;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
	public int anInt5102;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
	private int anInt5092 = 0;

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
	private int anInt5094 = 128;

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "Z")
	public boolean aBoolean374 = false;

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
	private int anInt5095 = 128;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
	private int anInt5098 = 0;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "Z")
	public boolean aBoolean373 = false;

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
	private int anInt5103 = 0;

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
	public int anInt5101 = -1;

	static {
		new Class62("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!vt;)V")
	public void method4566(@OriginalArg(1) Class2_Sub24 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5732();
			if (local5 == 0) {
				return;
			}
			this.method4570(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIILclient!dd;IILclient!oj;)Lclient!qh;")
	public Class159 method4568(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class50 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class48 arg5) {
		@Pc(7) int local7 = arg4;
		@Pc(23) Class102 local23 = this.anInt5101 == -1 || arg1 == -1 ? null : arg2.method1175(this.anInt5101);
		if (local23 != null) {
			local7 = arg4 | local23.method2409(false, arg1, arg3);
		}
		if (this.anInt5095 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt5094 != 128 || this.anInt5103 != 0) {
			local7 |= 0x5;
		}
		@Pc(67) Class41 local67 = this.aClass116_2.aClass41_42;
		@Pc(87) Class159 local87;
		synchronized (this.aClass116_2.aClass41_42) {
			local87 = (Class159) this.aClass116_2.aClass41_42.method823((long) (this.anInt5102 |= arg5.anInt3038 << 29));
		}
		if (local87 == null || arg5.method2448(local87.method4951(), local7) != 0) {
			if (local87 != null) {
				local7 = arg5.method2451(local7, local87.method4951());
			}
			@Pc(114) int local114 = local7;
			if (this.aShortArray94 != null) {
				local114 = local7 | 0x2000;
			}
			if (this.aShortArray93 != null) {
				local114 |= 0x4000;
			}
			@Pc(137) Class130 local137 = Static215.method3852(this.aClass116_2.aClass83_64, this.anInt5096);
			if (local137 == null) {
				return null;
			}
			local87 = arg5.method2540(local137, local114, this.aClass116_2.anInt3259, this.anInt5092 + 64, this.anInt5098 + 850);
			@Pc(162) int local162;
			if (this.aShortArray94 != null) {
				for (local162 = 0; local162 < this.aShortArray94.length; local162++) {
					local87.method4964(this.aShortArray94[local162], this.aShortArray91[local162]);
				}
			}
			if (this.aShortArray93 != null) {
				for (local162 = 0; local162 < this.aShortArray93.length; local162++) {
					local87.method4939(this.aShortArray93[local162], this.aShortArray92[local162]);
				}
			}
			local87.method4958(local7);
			@Pc(214) Class41 local214 = this.aClass116_2.aClass41_42;
			synchronized (this.aClass116_2.aClass41_42) {
				this.aClass116_2.aClass41_42.method832((long) (this.anInt5102 |= arg5.anInt3038 << 29), local87);
			}
		}
		@Pc(258) Class159 local258 = local23 == null ? local87.method4927((byte) 2, local7, true) : local23.method2415((byte) 2, arg3, local87, arg1, 0, local7, arg0);
		if (this.anInt5094 != 128 || this.anInt5095 != 128) {
			local258.method4947(this.anInt5094, this.anInt5095, this.anInt5094);
		}
		if (this.anInt5103 != 0) {
			if (this.anInt5103 == 90) {
				local258.method4969(4096);
			}
			if (this.anInt5103 == 180) {
				local258.method4969(8192);
			}
			if (this.anInt5103 == 270) {
				local258.method4969(12288);
			}
		}
		local258.method4958(arg4);
		return local258;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILclient!vt;)V")
	private void method4570(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 1) {
			this.anInt5096 = arg1.method5753();
		} else if (arg0 == 2) {
			this.anInt5101 = arg1.method5753();
		} else if (arg0 == 4) {
			this.anInt5094 = arg1.method5753();
		} else if (arg0 == 5) {
			this.anInt5095 = arg1.method5753();
		} else if (arg0 == 6) {
			this.anInt5103 = arg1.method5753();
		} else if (arg0 == 7) {
			this.anInt5092 = arg1.method5732();
		} else if (arg0 == 8) {
			this.anInt5098 = arg1.method5732();
		} else if (arg0 == 9) {
			this.aBoolean373 = true;
		} else if (arg0 == 10) {
			this.aBoolean374 = true;
		} else {
			@Pc(76) int local76;
			@Pc(86) int local86;
			if (arg0 == 40) {
				local76 = arg1.method5732();
				this.aShortArray91 = new short[local76];
				this.aShortArray94 = new short[local76];
				for (local86 = 0; local86 < local76; local86++) {
					this.aShortArray94[local86] = (short) arg1.method5753();
					this.aShortArray91[local86] = (short) arg1.method5753();
				}
			} else if (arg0 == 41) {
				local76 = arg1.method5732();
				this.aShortArray93 = new short[local76];
				this.aShortArray92 = new short[local76];
				for (local86 = 0; local86 < local76; local86++) {
					this.aShortArray93[local86] = (short) arg1.method5753();
					this.aShortArray92[local86] = (short) arg1.method5753();
				}
				return;
			}
		}
	}
}
