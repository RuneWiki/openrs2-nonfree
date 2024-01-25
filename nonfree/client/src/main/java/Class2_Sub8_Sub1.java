import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class2_Sub8_Sub1 extends Class2_Sub8 {

	@OriginalMember(owner = "client!da", name = "B", descriptor = "Z")
	public boolean aBoolean111;

	@OriginalMember(owner = "client!da", name = "C", descriptor = "I")
	public int anInt1381;

	@OriginalMember(owner = "client!da", name = "D", descriptor = "I")
	private int anInt1382;

	@OriginalMember(owner = "client!da", name = "E", descriptor = "Z")
	public boolean aBoolean112;

	@OriginalMember(owner = "client!da", name = "G", descriptor = "I")
	private int anInt1383;

	@OriginalMember(owner = "client!da", name = "J", descriptor = "I")
	private int anInt1385;

	@OriginalMember(owner = "client!da", name = "M", descriptor = "I")
	private int anInt1387;

	@OriginalMember(owner = "client!da", name = "O", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!da", name = "P", descriptor = "I")
	public int anInt1389;

	@OriginalMember(owner = "client!da", name = "S", descriptor = "I")
	private int anInt1391;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	private Class2_Sub8_Sub1() {
		if (Static257.anIntArray403 == null) {
			Static378.method4274();
		}
		this.method1147();
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!vt;)V")
	public Class2_Sub8_Sub1(@OriginalArg(0) Class2_Sub24 arg0) {
		if (Static257.anIntArray403 == null) {
			Static378.method4274();
		}
		this.anInt1381 = arg0.method5732();
		this.aBoolean111 = (this.anInt1381 & 0x10) != 0;
		this.aBoolean112 = (this.anInt1381 & 0x8) != 0;
		this.anInt1381 &= 0x7;
		super.anInt1379 = arg0.method5753();
		super.anInt1377 = arg0.method5753();
		super.anInt1375 = arg0.method5753();
		super.anInt1374 = arg0.method5732();
		@Pc(68) int local68 = super.anInt1374 * 2 + 1;
		this.aShortArray15 = new short[local68];
		for (@Pc(74) int local74 = 0; local74 < this.aShortArray15.length; local74++) {
			@Pc(81) short local81 = (short) arg0.method5753();
			@Pc(85) int local85 = local81 >>> 8;
			@Pc(89) int local89 = local81 & 0xFF;
			if (local85 >= local68) {
				local85 = local68 - 1;
			}
			if (local68 - local85 < local89) {
				local89 = local68 - local85;
			}
			this.aShortArray15[local74] = (short) (local85 << 8 | local89);
		}
		super.anInt1374 = Static291.anInt5453 + (super.anInt1374 << Static162.anInt3362);
		if (Static261.anIntArray406 == null) {
			super.anInt1378 = Static65.anIntArray109[Static17.method379(arg0.method5753()) & 0xFFFF];
		} else {
			super.anInt1378 = Static261.anIntArray406[arg0.method5753()];
		}
		@Pc(165) int local165 = arg0.method5732();
		this.anInt1389 = local165 & 0x1F;
		this.anInt1385 = (local165 & 0xE0) << 3;
		if (this.anInt1389 != 31) {
			this.method1147();
		}
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V")
	private void method1147() {
		@Pc(13) int local13 = this.anInt1389;
		if (local13 == 2) {
			this.anInt1387 = 2048;
			this.anInt1391 = 1;
			this.anInt1382 = 2048;
			this.anInt1383 = 0;
		} else if (local13 == 3) {
			this.anInt1391 = 1;
			this.anInt1383 = 0;
			this.anInt1382 = 2048;
			this.anInt1387 = 4096;
		} else if (local13 == 4) {
			this.anInt1382 = 2048;
			this.anInt1391 = 4;
			this.anInt1383 = 0;
			this.anInt1387 = 2048;
		} else if (local13 == 5) {
			this.anInt1383 = 0;
			this.anInt1387 = 8192;
			this.anInt1391 = 4;
			this.anInt1382 = 2048;
		} else if (local13 == 12) {
			this.anInt1382 = 2048;
			this.anInt1391 = 2;
			this.anInt1383 = 0;
			this.anInt1387 = 2048;
		} else if (local13 == 13) {
			this.anInt1383 = 0;
			this.anInt1387 = 8192;
			this.anInt1382 = 2048;
			this.anInt1391 = 2;
		} else if (local13 == 10) {
			this.anInt1387 = 2048;
			this.anInt1383 = 1536;
			this.anInt1391 = 3;
			this.anInt1382 = 512;
		} else if (local13 == 11) {
			this.anInt1387 = 4096;
			this.anInt1382 = 512;
			this.anInt1391 = 3;
			this.anInt1383 = 1536;
		} else if (local13 == 6) {
			this.anInt1387 = 2048;
			this.anInt1382 = 768;
			this.anInt1391 = 3;
			this.anInt1383 = 1280;
		} else if (local13 == 7) {
			this.anInt1383 = 1280;
			this.anInt1387 = 4096;
			this.anInt1391 = 3;
			this.anInt1382 = 768;
		} else if (local13 == 8) {
			this.anInt1391 = 3;
			this.anInt1387 = 2048;
			this.anInt1382 = 1024;
			this.anInt1383 = 1024;
		} else if (local13 == 9) {
			this.anInt1387 = 4096;
			this.anInt1382 = 1024;
			this.anInt1383 = 1024;
			this.anInt1391 = 3;
		} else if (local13 == 14) {
			this.anInt1391 = 1;
			this.anInt1387 = 2048;
			this.anInt1383 = 1280;
			this.anInt1382 = 768;
		} else if (local13 == 15) {
			this.anInt1382 = 512;
			this.anInt1391 = 1;
			this.anInt1387 = 4096;
			this.anInt1383 = 1536;
		} else if (local13 == 16) {
			this.anInt1383 = 1792;
			this.anInt1391 = 1;
			this.anInt1387 = 8192;
			this.anInt1382 = 256;
		} else {
			this.anInt1383 = 0;
			this.anInt1382 = 2048;
			this.anInt1391 = 0;
			this.anInt1387 = 2048;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V")
	public void method1148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1383 = arg0;
		this.anInt1387 = arg1;
		this.anInt1391 = arg2;
		this.anInt1382 = arg3;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZ)V")
	public void method1152(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(56) int local56;
		if (arg1) {
			local56 = 2048;
		} else {
			@Pc(24) int local24 = arg0 * this.anInt1387 / 50 + this.anInt1385 & 0x7FF;
			@Pc(27) int local27 = this.anInt1391;
			if (local27 == 1) {
				local56 = (Class106.anIntArray240[local24 << 3] >> 5) + 1024;
			} else if (local27 == 3) {
				local56 = Static257.anIntArray403[local24] >> 1;
			} else if (local27 == 4) {
				local56 = local24 >> 10 << 11;
			} else if (local27 == 2) {
				local56 = local24;
			} else if (local27 == 5) {
				local56 = (local24 < 1024 ? local24 : 2048 - local24) << 1;
			} else {
				local56 = 2048;
			}
		}
		super.aFloat7 = (float) ((local56 * this.anInt1382 >> 11) + this.anInt1383) / 2048.0F;
	}
}
