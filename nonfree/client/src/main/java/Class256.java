import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class256 {

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
	public int anInt7105;

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
	private int anInt7107;

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
	public int anInt7108;

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
	private int anInt7109;

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "Z")
	public boolean aBoolean531;

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
	private int anInt7110;

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
	private int anInt7112;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
	private int anInt7115;

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "Lclient!ta;")
	public Class6_Sub10 aClass6_Sub10_3;

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "Z")
	public boolean aBoolean532;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
	private Class256() {
		if (Static582.anIntArray604 == null) {
			Static82.method1216();
		}
		this.method6255();
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!ha;Lclient!jc;I)V")
	public Class256(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class6_Sub15 arg1, @OriginalArg(2) int arg2) {
		if (Static582.anIntArray604 == null) {
			Static82.method1216();
		}
		this.anInt7105 = arg1.method3030();
		this.aBoolean532 = (this.anInt7105 & 0x8) != 0;
		this.aBoolean531 = (this.anInt7105 & 0x10) != 0;
		this.anInt7105 &= 0x7;
		@Pc(46) int local46 = arg1.method3018() << arg2;
		@Pc(52) int local52 = arg1.method3018() << arg2;
		@Pc(58) int local58 = arg1.method3018() << arg2;
		@Pc(62) int local62 = arg1.method3030();
		@Pc(68) int local68 = local62 * 2 + 1;
		this.aShortArray78 = new short[local68];
		@Pc(87) int local87;
		for (@Pc(74) int local74 = 0; local74 < this.aShortArray78.length; local74++) {
			@Pc(83) short local83 = (short) arg1.method3018();
			local87 = local83 >>> 8;
			if (local68 <= local87) {
				local87 = local68 - 1;
			}
			@Pc(102) int local102 = local83 & 0xFF;
			if (local68 - local87 < local102) {
				local102 = local68 - local87;
			}
			this.aShortArray78[local74] = (short) (local87 << 8 | local102);
		}
		local62 = (local62 << Static594.anInt9440) + Static430.anInt3928;
		@Pc(158) int local158 = Static229.anIntArray228 == null ? Static123.anIntArray129[Static70.method928(arg1.method3018()) & 0xFFFF] : Static229.anIntArray228[arg1.method3018()];
		local87 = arg1.method3030();
		this.anInt7109 = (local87 & 0xE0) << 3;
		this.anInt7108 = local87 & 0x1F;
		if (this.anInt7108 != 31) {
			this.method6255();
		}
		this.method6256(local62, arg0, local52, local58, local46, local158);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZZ)V")
	public void method6254(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) int local9;
		if (arg1) {
			local9 = 2048;
		} else {
			@Pc(24) int local24 = this.anInt7109 + this.anInt7107 * arg0 / 50 & 0x7FF;
			@Pc(27) int local27 = this.anInt7112;
			if (local27 == 1) {
				local9 = (Class6_Sub2_Sub12.anIntArray293[local24 << 3] >> 4) + 1024;
			} else if (local27 == 3) {
				local9 = Static582.anIntArray604[local24] >> 1;
			} else if (local27 == 4) {
				local9 = local24 >> 10 << 11;
			} else if (local27 == 2) {
				local9 = local24;
			} else if (local27 == 5) {
				local9 = (local24 < 1024 ? local24 : 2048 - local24) << 1;
			} else {
				local9 = 2048;
			}
		}
		this.aClass6_Sub10_3.method8335((float) ((this.anInt7115 * local9 >> 11) + this.anInt7110) / 2048.0F);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
	private void method6255() {
		@Pc(4) int local4 = this.anInt7108;
		if (local4 == 2) {
			this.anInt7110 = 0;
			this.anInt7115 = 2048;
			this.anInt7112 = 1;
			this.anInt7107 = 2048;
		} else if (local4 == 3) {
			this.anInt7110 = 0;
			this.anInt7112 = 1;
			this.anInt7115 = 2048;
			this.anInt7107 = 4096;
		} else if (local4 == 4) {
			this.anInt7115 = 2048;
			this.anInt7112 = 4;
			this.anInt7107 = 2048;
			this.anInt7110 = 0;
		} else if (local4 == 5) {
			this.anInt7115 = 2048;
			this.anInt7107 = 8192;
			this.anInt7112 = 4;
			this.anInt7110 = 0;
		} else if (local4 == 12) {
			this.anInt7107 = 2048;
			this.anInt7115 = 2048;
			this.anInt7110 = 0;
			this.anInt7112 = 2;
		} else if (local4 == 13) {
			this.anInt7112 = 2;
			this.anInt7107 = 8192;
			this.anInt7110 = 0;
			this.anInt7115 = 2048;
		} else if (local4 == 10) {
			this.anInt7110 = 1536;
			this.anInt7107 = 2048;
			this.anInt7112 = 3;
			this.anInt7115 = 512;
		} else if (local4 == 11) {
			this.anInt7115 = 512;
			this.anInt7112 = 3;
			this.anInt7107 = 4096;
			this.anInt7110 = 1536;
		} else if (local4 == 6) {
			this.anInt7115 = 768;
			this.anInt7110 = 1280;
			this.anInt7112 = 3;
			this.anInt7107 = 2048;
		} else if (local4 == 7) {
			this.anInt7112 = 3;
			this.anInt7107 = 4096;
			this.anInt7110 = 1280;
			this.anInt7115 = 768;
		} else if (local4 == 8) {
			this.anInt7112 = 3;
			this.anInt7115 = 1024;
			this.anInt7107 = 2048;
			this.anInt7110 = 1024;
		} else if (local4 == 9) {
			this.anInt7110 = 1024;
			this.anInt7112 = 3;
			this.anInt7115 = 1024;
			this.anInt7107 = 4096;
		} else if (local4 == 14) {
			this.anInt7107 = 2048;
			this.anInt7115 = 768;
			this.anInt7112 = 1;
			this.anInt7110 = 1280;
		} else if (local4 == 15) {
			this.anInt7112 = 1;
			this.anInt7107 = 4096;
			this.anInt7115 = 512;
			this.anInt7110 = 1536;
		} else if (local4 == 16) {
			this.anInt7112 = 1;
			this.anInt7107 = 8192;
			this.anInt7115 = 256;
			this.anInt7110 = 1792;
		} else {
			this.anInt7110 = 0;
			this.anInt7112 = 0;
			this.anInt7115 = 2048;
			this.anInt7107 = 2048;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!ha;BIIII)V")
	private void method6256(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass6_Sub10_3 = arg1.method6647(arg4, arg3, arg2, arg0, arg5, 1.0F);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIII)V")
	public void method6258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7107 = arg2;
		this.anInt7115 = arg3;
		this.anInt7110 = arg1;
		this.anInt7112 = arg0;
	}
}
