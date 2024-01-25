import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class342 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Z")
	public boolean aBoolean709;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "Z")
	public boolean aBoolean710;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	private int anInt9567;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
	private int anInt9569;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "[S")
	public short[] aShortArray161;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
	private int anInt9571;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
	private int anInt9575;

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
	public int anInt9576;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "Lclient!od;")
	public Class6_Sub29 aClass6_Sub29_2;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	public int anInt9577;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
	private int anInt9578;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	private Class342() {
		if (Static336.anIntArray462 == null) {
			Static174.method3503();
		}
		this.method7984();
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!oa;Lclient!iaa;I)V")
	public Class342(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class6_Sub26 arg1, @OriginalArg(2) int arg2) {
		if (Static336.anIntArray462 == null) {
			Static174.method3503();
		}
		this.anInt9576 = arg1.method4966();
		this.aBoolean710 = (this.anInt9576 & 0x10) != 0;
		this.aBoolean709 = (this.anInt9576 & 0x8) != 0;
		this.anInt9576 &= 0x7;
		@Pc(47) int local47 = arg1.method4999() << arg2;
		@Pc(53) int local53 = arg1.method4999() << arg2;
		@Pc(59) int local59 = arg1.method4999() << arg2;
		@Pc(63) int local63 = arg1.method4966();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray161 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray161.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method4999();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			if (local69 - local86 < local90) {
				local90 = local69 - local86;
			}
			this.aShortArray161[local75] = (short) (local86 << 8 | local90);
		}
		local63 = Static406.anInt9843 + (local63 << Static494.anInt8859);
		@Pc(151) int local151 = Static223.anIntArray301 == null ? Static29.anIntArray66[Static340.method5371(arg1.method4999()) & 0xFFFF] : Static223.anIntArray301[arg1.method4999()];
		local86 = arg1.method4966();
		this.anInt9575 = (local86 & 0xE0) << 3;
		this.anInt9577 = local86 & 0x1F;
		if (this.anInt9577 != 31) {
			this.method7984();
		}
		this.method7985(local47, local63, arg0, local53, local151, local59);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	private void method7984() {
		@Pc(8) int local8 = this.anInt9577;
		if (local8 == 2) {
			this.anInt9567 = 2048;
			this.anInt9569 = 0;
			this.anInt9571 = 1;
			this.anInt9578 = 2048;
		} else if (local8 == 3) {
			this.anInt9578 = 2048;
			this.anInt9571 = 1;
			this.anInt9569 = 0;
			this.anInt9567 = 4096;
		} else if (local8 == 4) {
			this.anInt9567 = 2048;
			this.anInt9578 = 2048;
			this.anInt9569 = 0;
			this.anInt9571 = 4;
		} else if (local8 == 5) {
			this.anInt9571 = 4;
			this.anInt9569 = 0;
			this.anInt9567 = 8192;
			this.anInt9578 = 2048;
		} else if (local8 == 12) {
			this.anInt9567 = 2048;
			this.anInt9571 = 2;
			this.anInt9578 = 2048;
			this.anInt9569 = 0;
		} else if (local8 == 13) {
			this.anInt9569 = 0;
			this.anInt9571 = 2;
			this.anInt9578 = 2048;
			this.anInt9567 = 8192;
		} else if (local8 == 10) {
			this.anInt9569 = 1536;
			this.anInt9571 = 3;
			this.anInt9567 = 2048;
			this.anInt9578 = 512;
		} else if (local8 == 11) {
			this.anInt9567 = 4096;
			this.anInt9569 = 1536;
			this.anInt9571 = 3;
			this.anInt9578 = 512;
		} else if (local8 == 6) {
			this.anInt9569 = 1280;
			this.anInt9567 = 2048;
			this.anInt9571 = 3;
			this.anInt9578 = 768;
		} else if (local8 == 7) {
			this.anInt9571 = 3;
			this.anInt9569 = 1280;
			this.anInt9578 = 768;
			this.anInt9567 = 4096;
		} else if (local8 == 8) {
			this.anInt9571 = 3;
			this.anInt9569 = 1024;
			this.anInt9567 = 2048;
			this.anInt9578 = 1024;
		} else if (local8 == 9) {
			this.anInt9578 = 1024;
			this.anInt9569 = 1024;
			this.anInt9567 = 4096;
			this.anInt9571 = 3;
		} else if (local8 == 14) {
			this.anInt9567 = 2048;
			this.anInt9569 = 1280;
			this.anInt9578 = 768;
			this.anInt9571 = 1;
		} else if (local8 == 15) {
			this.anInt9567 = 4096;
			this.anInt9571 = 1;
			this.anInt9569 = 1536;
			this.anInt9578 = 512;
		} else if (local8 == 16) {
			this.anInt9578 = 256;
			this.anInt9571 = 1;
			this.anInt9567 = 8192;
			this.anInt9569 = 1792;
		} else {
			this.anInt9569 = 0;
			this.anInt9578 = 2048;
			this.anInt9567 = 2048;
			this.anInt9571 = 0;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIILclient!oa;III)V")
	private void method7985(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class9 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass6_Sub29_2 = arg2.method5424(arg0, arg5, arg3, arg1, arg4, 1.0F);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V")
	public void method7986(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9567 = arg3;
		this.anInt9571 = arg1;
		this.anInt9569 = arg0;
		this.anInt9578 = arg2;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZIZ)V")
	public void method7989(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (arg0) {
			local9 = 2048;
		} else {
			@Pc(24) int local24 = this.anInt9575 + this.anInt9567 * arg1 / 50 & 0x7FF;
			@Pc(27) int local27 = this.anInt9571;
			if (local27 == 1) {
				local9 = (Class179.anIntArray756[local24 << 3] >> 4) + 1024;
			} else if (local27 == 3) {
				local9 = Static336.anIntArray462[local24] >> 1;
			} else if (local27 == 4) {
				local9 = local24 >> 10 << 11;
			} else if (local27 == 2) {
				local9 = local24;
			} else if (local27 == 5) {
				local9 = (local24 >= 1024 ? 2048 - local24 : local24) << 1;
			} else {
				local9 = 2048;
			}
		}
		this.aClass6_Sub29_2.method6156((float) ((this.anInt9578 * local9 >> 11) + this.anInt9569) / 2048.0F);
	}
}
