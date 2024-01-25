import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class11_Sub5_Sub1 extends Class11_Sub5 {

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "Z")
	public boolean aBoolean82;

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
	private int anInt1292;

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
	private int anInt1296;

	@OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
	private int anInt1298;

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
	private int anInt1299;

	@OriginalMember(owner = "client!ee", name = "G", descriptor = "Z")
	public boolean aBoolean83;

	@OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
	public int anInt1302;

	@OriginalMember(owner = "client!ee", name = "J", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
	private int anInt1304;

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
	public int anInt1306;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	private Class11_Sub5_Sub1() {
		if (Static34.anIntArray47 == null) {
			Static32.method463();
		}
		this.method1046();
	}

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!kh;)V")
	public Class11_Sub5_Sub1(@OriginalArg(0) Class11_Sub25 arg0) {
		if (Static34.anIntArray47 == null) {
			Static32.method463();
		}
		this.anInt1306 = arg0.method5185();
		this.aBoolean83 = (this.anInt1306 & 0x8) != 0;
		this.aBoolean82 = (this.anInt1306 & 0x10) != 0;
		this.anInt1306 &= 0x7;
		super.anInt1285 = arg0.method5187();
		super.anInt1286 = arg0.method5187();
		super.anInt1287 = arg0.method5187();
		super.anInt1289 = arg0.method5185();
		@Pc(68) int local68 = super.anInt1289 * 2 + 1;
		this.aShortArray40 = new short[local68];
		for (@Pc(74) int local74 = 0; local74 < this.aShortArray40.length; local74++) {
			@Pc(81) short local81 = (short) arg0.method5187();
			@Pc(85) int local85 = local81 >>> 8;
			@Pc(89) int local89 = local81 & 0xFF;
			if (local85 >= local68) {
				local85 = local68 - 1;
			}
			if (local89 > local68 - local85) {
				local89 = local68 - local85;
			}
			this.aShortArray40[local74] = (short) (local85 << 8 | local89);
		}
		super.anInt1289 = (super.anInt1289 << 7) + 64;
		if (Static81.anIntArray100 == null) {
			super.anInt1290 = Static315.anIntArray506[Static8.method81(arg0.method5187()) & 0xFFFF];
		} else {
			super.anInt1290 = Static81.anIntArray100[arg0.method5187()];
		}
		@Pc(161) int local161 = arg0.method5185();
		this.anInt1302 = local161 & 0x1F;
		this.anInt1292 = (local161 & 0xE0) << 3;
		if (this.anInt1302 != 31) {
			this.method1046();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZII)V")
	public void method1043(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg0) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = arg1 * this.anInt1304 / 50 + this.anInt1292 & 0x7FF;
			@Pc(26) int local26 = this.anInt1298;
			if (local26 == 1) {
				local9 = (Class140.anIntArray330[local23 << 3] >> 5) + 1024;
			} else if (local26 == 3) {
				local9 = Static34.anIntArray47[local23] >> 1;
			} else if (local26 == 4) {
				local9 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local9 = local23;
			} else if (local26 == 5) {
				local9 = (local23 < 1024 ? local23 : 2048 - local23) << 1;
			} else {
				local9 = 2048;
			}
		}
		super.aFloat9 = (float) ((this.anInt1299 * local9 >> 11) + this.anInt1296) / 2048.0F;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIII)V")
	public void method1044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1298 = arg0;
		this.anInt1299 = arg1;
		this.anInt1304 = arg2;
		this.anInt1296 = arg3;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
	private void method1046() {
		@Pc(11) int local11 = this.anInt1302;
		if (local11 == 2) {
			this.anInt1299 = 2048;
			this.anInt1298 = 1;
			this.anInt1304 = 2048;
			this.anInt1296 = 0;
		} else if (local11 == 3) {
			this.anInt1298 = 1;
			this.anInt1296 = 0;
			this.anInt1299 = 2048;
			this.anInt1304 = 4096;
		} else if (local11 == 4) {
			this.anInt1304 = 2048;
			this.anInt1296 = 0;
			this.anInt1298 = 4;
			this.anInt1299 = 2048;
		} else if (local11 == 5) {
			this.anInt1304 = 8192;
			this.anInt1299 = 2048;
			this.anInt1298 = 4;
			this.anInt1296 = 0;
		} else if (local11 == 12) {
			this.anInt1298 = 2;
			this.anInt1299 = 2048;
			this.anInt1296 = 0;
			this.anInt1304 = 2048;
		} else if (local11 == 13) {
			this.anInt1298 = 2;
			this.anInt1299 = 2048;
			this.anInt1304 = 8192;
			this.anInt1296 = 0;
		} else if (local11 == 10) {
			this.anInt1299 = 512;
			this.anInt1296 = 1536;
			this.anInt1298 = 3;
			this.anInt1304 = 2048;
		} else if (local11 == 11) {
			this.anInt1298 = 3;
			this.anInt1304 = 4096;
			this.anInt1296 = 1536;
			this.anInt1299 = 512;
		} else if (local11 == 6) {
			this.anInt1298 = 3;
			this.anInt1296 = 1280;
			this.anInt1304 = 2048;
			this.anInt1299 = 768;
		} else if (local11 == 7) {
			this.anInt1296 = 1280;
			this.anInt1298 = 3;
			this.anInt1304 = 4096;
			this.anInt1299 = 768;
		} else if (local11 == 8) {
			this.anInt1296 = 1024;
			this.anInt1298 = 3;
			this.anInt1299 = 1024;
			this.anInt1304 = 2048;
		} else if (local11 == 9) {
			this.anInt1298 = 3;
			this.anInt1299 = 1024;
			this.anInt1304 = 4096;
			this.anInt1296 = 1024;
		} else if (local11 == 14) {
			this.anInt1298 = 1;
			this.anInt1304 = 2048;
			this.anInt1296 = 1280;
			this.anInt1299 = 768;
		} else if (local11 == 15) {
			this.anInt1298 = 1;
			this.anInt1299 = 512;
			this.anInt1304 = 4096;
			this.anInt1296 = 1536;
		} else if (local11 == 16) {
			this.anInt1304 = 8192;
			this.anInt1299 = 256;
			this.anInt1296 = 1792;
			this.anInt1298 = 1;
		} else {
			this.anInt1304 = 2048;
			this.anInt1296 = 0;
			this.anInt1299 = 2048;
			this.anInt1298 = 0;
		}
	}
}
