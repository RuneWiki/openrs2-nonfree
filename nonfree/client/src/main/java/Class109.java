import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class109 {

	@OriginalMember(owner = "client!k", name = "b", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "I")
	public int anInt3257;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "I")
	private int anInt3260;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	private int anInt3255 = 0;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "I")
	private int anInt3256 = 128;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "Z")
	public boolean aBoolean220 = false;

	@OriginalMember(owner = "client!k", name = "o", descriptor = "I")
	private int anInt3264 = 0;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "I")
	public int anInt3267 = -1;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "I")
	private int anInt3262 = 128;

	@OriginalMember(owner = "client!k", name = "t", descriptor = "Z")
	public boolean aBoolean221 = false;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "I")
	private int anInt3265 = 0;

	static {
		new Class106("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
		new Class106("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!at;B)V")
	public void method2989(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method2132();
			if (local11 == 0) {
				return;
			}
			this.method2990(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!at;IZ)V")
	private void method2990(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3260 = arg0.method2161();
		} else if (arg1 == 2) {
			this.anInt3267 = arg0.method2161();
		} else if (arg1 == 4) {
			this.anInt3256 = arg0.method2161();
		} else if (arg1 == 5) {
			this.anInt3262 = arg0.method2161();
		} else if (arg1 == 6) {
			this.anInt3255 = arg0.method2161();
		} else if (arg1 == 7) {
			this.anInt3264 = arg0.method2132();
		} else if (arg1 == 8) {
			this.anInt3265 = arg0.method2132();
		} else if (arg1 == 9) {
			this.aBoolean220 = true;
		} else if (arg1 == 10) {
			this.aBoolean221 = true;
		} else {
			@Pc(98) int local98;
			@Pc(108) int local108;
			if (arg1 == 40) {
				local98 = arg0.method2132();
				this.aShortArray69 = new short[local98];
				this.aShortArray68 = new short[local98];
				for (local108 = 0; local108 < local98; local108++) {
					this.aShortArray69[local108] = (short) arg0.method2161();
					this.aShortArray68[local108] = (short) arg0.method2161();
				}
			} else if (arg1 == 41) {
				local98 = arg0.method2132();
				this.aShortArray66 = new short[local98];
				this.aShortArray67 = new short[local98];
				for (local108 = 0; local108 < local98; local108++) {
					this.aShortArray66[local108] = (short) arg0.method2161();
					this.aShortArray67[local108] = (short) arg0.method2161();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIBLclient!fp;)Lclient!bi;")
	public Class3 method2993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class63 arg4) {
		@Pc(7) int local7 = arg0;
		@Pc(23) Class199 local23 = this.anInt3267 == -1 || arg3 == -1 ? null : Static161.method3066(this.anInt3267);
		if (local23 != null) {
			local7 = arg0 | local23.method5416(false, arg3, arg1);
		}
		if (this.anInt3262 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt3256 != 128 || this.anInt3255 != 0) {
			local7 |= 0x5;
		}
		@Pc(62) Class21 local62 = Static93.aClass21_135;
		@Pc(80) Class3 local80;
		synchronized (Static93.aClass21_135) {
			local80 = (Class3) Static93.aClass21_135.method854((long) (this.anInt3257 |= arg4.anInt5007 << 29));
		}
		if (local80 == null || arg4.method4574(local80.method1256(), local7) != 0) {
			if (local80 != null) {
				local7 = arg4.method4628(local7, local80.method1256());
			}
			@Pc(107) int local107 = local7;
			if (this.aShortArray69 != null) {
				local107 = local7 | 0x2000;
			}
			if (this.aShortArray66 != null) {
				local107 |= 0x4000;
			}
			@Pc(128) Class41 local128 = Static227.method4232(this.anInt3260, Static285.aClass30_73);
			if (local128 == null) {
				return null;
			}
			local80 = arg4.method4652(local128, local107, Static13.anInt331, this.anInt3264 + 64, this.anInt3265 - -850);
			@Pc(151) int local151;
			if (this.aShortArray69 != null) {
				for (local151 = 0; local151 < this.aShortArray69.length; local151++) {
					local80.method1260(this.aShortArray69[local151], this.aShortArray68[local151]);
				}
			}
			if (this.aShortArray66 != null) {
				for (local151 = 0; local151 < this.aShortArray66.length; local151++) {
					local80.method1237(this.aShortArray66[local151], this.aShortArray67[local151]);
				}
			}
			local80.method1270(local7);
			@Pc(201) Class21 local201 = Static93.aClass21_135;
			synchronized (Static93.aClass21_135) {
				Static93.aClass21_135.method843(local80, (long) (this.anInt3257 |= arg4.anInt5007 << 29));
			}
		}
		@Pc(243) Class3 local243 = local23 == null ? local80.method1261((byte) 2, local7, true) : local23.method5411(arg1, 0, (byte) 2, arg2, local80, arg3, local7);
		if (this.anInt3256 != 128 || this.anInt3262 != 128) {
			local243.method1252(this.anInt3256, this.anInt3262, this.anInt3256);
		}
		if (this.anInt3255 != 0) {
			if (this.anInt3255 == 90) {
				local243.method1249(4096);
			}
			if (this.anInt3255 == 180) {
				local243.method1249(8192);
			}
			if (this.anInt3255 == 270) {
				local243.method1249(12288);
			}
		}
		local243.method1270(arg0);
		return local243;
	}
}
