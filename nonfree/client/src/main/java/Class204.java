import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kha")
public final class Class204 {

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "Z")
	public boolean aBoolean332;

	@OriginalMember(owner = "client!kha", name = "f", descriptor = "Z")
	public boolean aBoolean333;

	@OriginalMember(owner = "client!kha", name = "g", descriptor = "I")
	private int anInt5210;

	@OriginalMember(owner = "client!kha", name = "e", descriptor = "I")
	private int anInt5212;

	@OriginalMember(owner = "client!kha", name = "m", descriptor = "Lclient!ih;")
	public Class5_Sub12 aClass5_Sub12_2;

	@OriginalMember(owner = "client!kha", name = "i", descriptor = "I")
	private int anInt5213;

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "I")
	public int anInt5214;

	@OriginalMember(owner = "client!kha", name = "k", descriptor = "I")
	private int anInt5216;

	@OriginalMember(owner = "client!kha", name = "h", descriptor = "I")
	private int anInt5219;

	@OriginalMember(owner = "client!kha", name = "d", descriptor = "[S")
	public short[] aShortArray73;

	@OriginalMember(owner = "client!kha", name = "l", descriptor = "I")
	public int anInt5222;

	@OriginalMember(owner = "client!kha", name = "<init>", descriptor = "()V")
	private Class204() {
		if (Static414.anIntArray417 == null) {
			Static386.method5710();
		}
		this.method4700();
	}

	@OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(Lclient!ha;Lclient!wq;I)V")
	public Class204(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class5_Sub36 arg1, @OriginalArg(2) int arg2) {
		if (Static414.anIntArray417 == null) {
			Static386.method5710();
		}
		this.anInt5222 = arg1.method7291();
		this.aBoolean332 = (this.anInt5222 & 0x10) != 0;
		this.aBoolean333 = (this.anInt5222 & 0x8) != 0;
		this.anInt5222 &= 0x7;
		@Pc(46) int local46 = arg1.method7333() << arg2;
		@Pc(52) int local52 = arg1.method7333() << arg2;
		@Pc(58) int local58 = arg1.method7333() << arg2;
		@Pc(62) int local62 = arg1.method7291();
		@Pc(68) int local68 = local62 * 2 + 1;
		this.aShortArray73 = new short[local68];
		@Pc(87) int local87;
		for (@Pc(74) int local74 = 0; local74 < this.aShortArray73.length; local74++) {
			@Pc(83) short local83 = (short) arg1.method7333();
			local87 = local83 >>> 8;
			@Pc(91) int local91 = local83 & 0xFF;
			if (local68 <= local87) {
				local87 = local68 - 1;
			}
			if (local68 - local87 < local91) {
				local91 = local68 - local87;
			}
			this.aShortArray73[local74] = (short) (local87 << 8 | local91);
		}
		local62 = (local62 << Static314.anInt5377) + Static377.anInt6337;
		@Pc(162) int local162 = Static408.anIntArray407 == null ? Static305.anIntArray314[Static161.method2975(arg1.method7333()) & 0xFFFF] : Static408.anIntArray407[arg1.method7333()];
		local87 = arg1.method7291();
		this.anInt5213 = (local87 & 0xE0) << 3;
		this.anInt5214 = local87 & 0x1F;
		if (this.anInt5214 != 31) {
			this.method4700();
		}
		this.method4697(local58, local62, arg0, local162, local46, local52);
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IILclient!ha;IIII)V")
	private void method4697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		this.aClass5_Sub12_2 = arg2.method8625(arg4, arg0, arg5, arg1, arg3, 1.0F);
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IIIII)V")
	public void method4699(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5216 = arg1;
		this.anInt5212 = arg0;
		this.anInt5210 = arg3;
		this.anInt5219 = arg2;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)V")
	private void method4700() {
		@Pc(12) int local12 = this.anInt5214;
		if (local12 == 2) {
			this.anInt5216 = 0;
			this.anInt5210 = 1;
			this.anInt5219 = 2048;
			this.anInt5212 = 2048;
		} else if (local12 == 3) {
			this.anInt5212 = 4096;
			this.anInt5210 = 1;
			this.anInt5219 = 2048;
			this.anInt5216 = 0;
		} else if (local12 == 4) {
			this.anInt5210 = 4;
			this.anInt5212 = 2048;
			this.anInt5219 = 2048;
			this.anInt5216 = 0;
		} else if (local12 == 5) {
			this.anInt5210 = 4;
			this.anInt5216 = 0;
			this.anInt5219 = 2048;
			this.anInt5212 = 8192;
		} else if (local12 == 12) {
			this.anInt5212 = 2048;
			this.anInt5216 = 0;
			this.anInt5210 = 2;
			this.anInt5219 = 2048;
		} else if (local12 == 13) {
			this.anInt5216 = 0;
			this.anInt5210 = 2;
			this.anInt5219 = 2048;
			this.anInt5212 = 8192;
		} else if (local12 == 10) {
			this.anInt5212 = 2048;
			this.anInt5210 = 3;
			this.anInt5216 = 1536;
			this.anInt5219 = 512;
		} else if (local12 == 11) {
			this.anInt5212 = 4096;
			this.anInt5219 = 512;
			this.anInt5216 = 1536;
			this.anInt5210 = 3;
		} else if (local12 == 6) {
			this.anInt5210 = 3;
			this.anInt5212 = 2048;
			this.anInt5216 = 1280;
			this.anInt5219 = 768;
		} else if (local12 == 7) {
			this.anInt5212 = 4096;
			this.anInt5219 = 768;
			this.anInt5216 = 1280;
			this.anInt5210 = 3;
		} else if (local12 == 8) {
			this.anInt5216 = 1024;
			this.anInt5210 = 3;
			this.anInt5219 = 1024;
			this.anInt5212 = 2048;
		} else if (local12 == 9) {
			this.anInt5210 = 3;
			this.anInt5212 = 4096;
			this.anInt5219 = 1024;
			this.anInt5216 = 1024;
		} else if (local12 == 14) {
			this.anInt5212 = 2048;
			this.anInt5210 = 1;
			this.anInt5219 = 768;
			this.anInt5216 = 1280;
		} else if (local12 == 15) {
			this.anInt5212 = 4096;
			this.anInt5216 = 1536;
			this.anInt5210 = 1;
			this.anInt5219 = 512;
		} else if (local12 == 16) {
			this.anInt5216 = 1792;
			this.anInt5212 = 8192;
			this.anInt5210 = 1;
			this.anInt5219 = 256;
		} else {
			this.anInt5210 = 0;
			this.anInt5219 = 2048;
			this.anInt5212 = 2048;
			this.anInt5216 = 0;
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(BZI)V")
	public void method4701(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(75) int local75;
		if (arg0) {
			local75 = 2048;
		} else {
			@Pc(27) int local27 = arg1 * this.anInt5212 / 50 + this.anInt5213 & 0x7FF;
			@Pc(30) int local30 = this.anInt5210;
			if (local30 == 1) {
				local75 = (Class42.anIntArray51[local27 << 3] >> 4) + 1024;
			} else if (local30 == 3) {
				local75 = Static414.anIntArray417[local27] >> 1;
			} else if (local30 == 4) {
				local75 = local27 >> 10 << 11;
			} else if (local30 == 2) {
				local75 = local27;
			} else if (local30 == 5) {
				local75 = (local27 < 1024 ? local27 : 2048 - local27) << 1;
			} else {
				local75 = 2048;
			}
		}
		this.aClass5_Sub12_2.method4535((float) ((local75 * this.anInt5219 >> 11) + this.anInt5216) / 2048.0F);
	}
}
