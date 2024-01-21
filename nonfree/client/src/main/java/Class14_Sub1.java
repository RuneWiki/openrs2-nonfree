import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GHOWLKWN")
public final class Class14_Sub1 extends Class14 implements Runnable {

	@OriginalMember(owner = "client!GHOWLKWN", name = "q", descriptor = "I")
	private static int anInt378;

	@OriginalMember(owner = "client!GHOWLKWN", name = "b", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!GHOWLKWN", name = "d", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!GHOWLKWN", name = "f", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!GHOWLKWN", name = "g", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!GHOWLKWN", name = "i", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!GHOWLKWN", name = "m", descriptor = "I")
	public int anInt377;

	@OriginalMember(owner = "client!GHOWLKWN", name = "o", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!GHOWLKWN", name = "r", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!GHOWLKWN", name = "s", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!GHOWLKWN", name = "t", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!GHOWLKWN", name = "u", descriptor = "I")
	public int anInt381;

	@OriginalMember(owner = "client!GHOWLKWN", name = "v", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!GHOWLKWN", name = "w", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!GHOWLKWN", name = "z", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!GHOWLKWN", name = "B", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!GHOWLKWN", name = "F", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!GHOWLKWN", name = "H", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!GHOWLKWN", name = "I", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!GHOWLKWN", name = "L", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!GHOWLKWN", name = "M", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!GHOWLKWN", name = "O", descriptor = "Lclient!PHKHJKBS;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!GHOWLKWN", name = "Q", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!GHOWLKWN", name = "R", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!GHOWLKWN", name = "S", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!GHOWLKWN", name = "c", descriptor = "Lclient!LHGXPZPG;")
	private Class21 aClass21_1 = new Class21(169);

	@OriginalMember(owner = "client!GHOWLKWN", name = "e", descriptor = "Ljava/lang/String;")
	public String aString12 = "";

	@OriginalMember(owner = "client!GHOWLKWN", name = "h", descriptor = "Z")
	private boolean aBoolean86 = true;

	@OriginalMember(owner = "client!GHOWLKWN", name = "j", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!GHOWLKWN", name = "k", descriptor = "[B")
	private byte[] aByteArray4 = new byte[500];

	@OriginalMember(owner = "client!GHOWLKWN", name = "l", descriptor = "I")
	private int anInt376 = 923;

	@OriginalMember(owner = "client!GHOWLKWN", name = "n", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[4][];

	@OriginalMember(owner = "client!GHOWLKWN", name = "p", descriptor = "Lclient!LHGXPZPG;")
	private Class21 aClass21_2 = new Class21(169);

	@OriginalMember(owner = "client!GHOWLKWN", name = "x", descriptor = "I")
	private int anInt383 = 13603;

	@OriginalMember(owner = "client!GHOWLKWN", name = "y", descriptor = "Z")
	private boolean aBoolean87 = true;

	@OriginalMember(owner = "client!GHOWLKWN", name = "A", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!GHOWLKWN", name = "C", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!GHOWLKWN", name = "D", descriptor = "Lclient!LHGXPZPG;")
	private Class21 aClass21_3 = new Class21(169);

	@OriginalMember(owner = "client!GHOWLKWN", name = "E", descriptor = "[B")
	private byte[] aByteArray5 = new byte[65000];

	@OriginalMember(owner = "client!GHOWLKWN", name = "G", descriptor = "Lclient!BISVHPUN;")
	private Class3 aClass3_2 = new Class3(anInt378);

	@OriginalMember(owner = "client!GHOWLKWN", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[4][];

	@OriginalMember(owner = "client!GHOWLKWN", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[4][];

	@OriginalMember(owner = "client!GHOWLKWN", name = "N", descriptor = "Lclient!LHGXPZPG;")
	private Class21 aClass21_4 = new Class21(169);

	@OriginalMember(owner = "client!GHOWLKWN", name = "P", descriptor = "Lclient!LHGXPZPG;")
	private Class21 aClass21_5 = new Class21(169);

	@OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(IBI[B)Z")
	private boolean method181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null || arg2.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg2.length - 2;
			@Pc(28) int local28 = ((arg2[local12] & 0xFF) << 8) + (arg2[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg2, 0, local12);
			@Pc(53) int local53 = (int) this.aCRC32_1.getValue();
			if (local28 == arg0) {
				return local53 == arg1;
			} else {
				return false;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("46053, " + arg0 + ", " + 3 + ", " + arg1 + ", " + arg2 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "b", descriptor = "(I)V")
	private void method182() {
		try {
			try {
				@Pc(15) int local15 = this.anInputStream1.available();
				@Pc(50) int local50;
				@Pc(66) int local66;
				if (this.anInt380 == 0 && local15 >= 6) {
					this.aBoolean89 = true;
					for (@Pc(26) int local26 = 0; local26 < 6; local26 += this.anInputStream1.read(this.aByteArray4, local26, 6 - local26)) {
					}
					local50 = this.aByteArray4[0] & 0xFF;
					local66 = ((this.aByteArray4[1] & 0xFF) << 8) + (this.aByteArray4[2] & 0xFF);
					@Pc(82) int local82 = ((this.aByteArray4[3] & 0xFF) << 8) + (this.aByteArray4[4] & 0xFF);
					@Pc(89) int local89 = this.aByteArray4[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(97) Class1_Sub1_Sub4 local97 = (Class1_Sub1_Sub4) this.aClass21_1.method246(); local97 != null; local97 = (Class1_Sub1_Sub4) this.aClass21_1.method248()) {
						if (local97.anInt597 == local50 && local97.anInt598 == local66) {
							this.aClass1_Sub1_Sub4_1 = local97;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local97.anInt599 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt386 = 0;
						if (local82 == 0) {
							signlink.reporterror("Rej: " + local50 + "," + local66);
							this.aClass1_Sub1_Sub4_1.aByteArray12 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean152) {
								@Pc(155) Class21 local155 = this.aClass21_3;
								synchronized (this.aClass21_3) {
									this.aClass21_3.method243(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method526();
							}
							this.aClass1_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass1_Sub1_Sub4_1.aByteArray12 == null && local89 == 0) {
								this.aClass1_Sub1_Sub4_1.aByteArray12 = new byte[local82];
							}
							if (this.aClass1_Sub1_Sub4_1.aByteArray12 == null && local89 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt379 = local89 * 500;
					this.anInt380 = 500;
					if (this.anInt380 > local82 - local89 * 500) {
						this.anInt380 = local82 - local89 * 500;
					}
				}
				if (this.anInt380 > 0 && local15 >= this.anInt380) {
					this.aBoolean89 = true;
					@Pc(234) byte[] local234 = this.aByteArray4;
					local50 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local234 = this.aClass1_Sub1_Sub4_1.aByteArray12;
						local50 = this.anInt379;
					}
					for (local66 = 0; local66 < this.anInt380; local66 += this.anInputStream1.read(local234, local66 + local50, this.anInt380 - local66)) {
					}
					if (this.anInt380 + this.anInt379 >= local234.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient2.aClass16Array1[0] != null) {
							this.aClient2.aClass16Array1[this.aClass1_Sub1_Sub4_1.anInt597 + 1].method215(local234.length, local234, (byte) 2, this.aClass1_Sub1_Sub4_1.anInt598);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean152 && this.aClass1_Sub1_Sub4_1.anInt597 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean152 = true;
							this.aClass1_Sub1_Sub4_1.anInt597 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean152) {
							@Pc(327) Class21 local327 = this.aClass21_3;
							synchronized (this.aClass21_3) {
								this.aClass21_3.method243(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method526();
						}
					}
					this.anInt380 = 0;
				}
			} catch (@Pc(348) IOException local348) {
				try {
					this.aSocket1.close();
				} catch (@Pc(353) Exception local353) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt380 = 0;
			}
		} catch (@Pc(367) RuntimeException local367) {
			signlink.reporterror("81261, " + -369 + ", " + local367.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(Lclient!XTGLDHGX;Lclient!client;)V")
	public void method183(@OriginalArg(0) Class44 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method484(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, 891);
			this.anIntArrayArray4[local22] = new int[local36];
			this.aByteArrayArray1[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray4[local22][local56] = local42.method270();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method484(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, 891);
			this.anIntArrayArray5[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray5[local36][local123] = local115.method273();
			}
		}
		local104 = arg0.method484("model_index", null);
		local56 = this.anIntArrayArray4[0].length;
		this.aByteArray6 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray6[local158] = local104[local158];
			} else {
				this.aByteArray6[local158] = 0;
			}
		}
		local104 = arg0.method484("map_index", null);
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, 891);
		local56 = local104.length / 7;
		this.anIntArray68 = new int[local56];
		this.anIntArray65 = new int[local56];
		this.anIntArray63 = new int[local56];
		this.anIntArray66 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray68[local216] = local193.method270();
			this.anIntArray65[local216] = local193.method270();
			this.anIntArray63[local216] = local193.method270();
			this.anIntArray66[local216] = local193.method268();
		}
		local104 = arg0.method484("anim_index", null);
		local193 = new Class1_Sub1_Sub3(local104, 891);
		local56 = local104.length / 2;
		this.anIntArray67 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray67[local268] = local193.method270();
		}
		local104 = arg0.method484("midi_index", null);
		local193 = new Class1_Sub1_Sub3(local104, 891);
		local56 = local104.length;
		this.anIntArray64 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray64[local300] = local193.method268();
		}
		this.aClient2 = arg1;
		this.aBoolean87 = true;
		this.aClient2.method576(this, 2);
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "()I")
	public int method184() {
		@Pc(2) Class3 local2 = this.aClass3_2;
		synchronized (this.aClass3_2) {
			return this.aClass3_2.method24();
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "b", descriptor = "()V")
	public void method185() {
		this.aBoolean87 = false;
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(ZI)V")
	public void method186(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray68.length;
			for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
				if (arg0 || this.anIntArray66[local9] != 0) {
					this.method195((byte) 2, 3, this.anIntArray63[local9], (byte) 8);
					this.method195((byte) 2, 3, this.anIntArray65[local9], (byte) 8);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("6116, " + arg0 + ", " + 0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(II)I")
	public int method187(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray4[arg0].length;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("72363, " + 79 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(ILclient!PHKHJKBS;)V")
	private void method188(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket1 == null) {
					@Pc(15) long local15 = System.currentTimeMillis();
					if (local15 - this.aLong14 < 4000L) {
						return;
					}
					this.aLong14 = local15;
					this.aSocket1 = this.aClient2.method583(client.anInt902 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(50) int local50 = 0; local50 < 8; local50++) {
						this.anInputStream1.read();
					}
					this.anInt386 = 0;
				}
				this.aByteArray4[0] = (byte) arg0.anInt597;
				this.aByteArray4[1] = (byte) (arg0.anInt598 >> 8);
				this.aByteArray4[2] = (byte) arg0.anInt598;
				if (arg0.aBoolean152) {
					this.aByteArray4[3] = 2;
				} else if (this.aClient2.aBoolean246) {
					this.aByteArray4[3] = 0;
				} else {
					this.aByteArray4[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray4, 0, 4);
				this.anInt375 = 0;
				this.anInt381 = -10000;
			} catch (@Pc(127) IOException local127) {
				try {
					this.aSocket1.close();
				} catch (@Pc(132) Exception local132) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt380 = 0;
				this.anInt381++;
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("96894, " + 8 + ", " + arg0 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "c", descriptor = "(I)I")
	public int method189() {
		try {
			return this.anIntArray67.length;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("92552, " + 0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "b", descriptor = "(II)V")
	public void method190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray4.length || arg1 < 0 || arg1 > this.anIntArrayArray4[arg0].length || this.anIntArrayArray4[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class3 local27 = this.aClass3_2;
		synchronized (this.aClass3_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass3_2.method22(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass3_2.method23()) {
				if (local34.anInt597 == arg0 && local34.anInt598 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt597 = arg0;
			local34.anInt598 = arg1;
			local34.aBoolean152 = true;
			@Pc(71) Class21 local71 = this.aClass21_5;
			synchronized (this.aClass21_5) {
				this.aClass21_5.method243(local34);
			}
			this.aClass3_2.method20(local34);
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "c", descriptor = "(II)I")
	public int method191(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray6[arg0] & 0xFF;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("46001, " + arg0 + ", " + -203 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean87) {
				this.anInt377++;
				@Pc(11) byte local11 = 20;
				if (this.anInt374 == 0 && this.aClient2.aClass16Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean89 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean89; local32++) {
					this.aBoolean89 = false;
					this.method199();
					this.method197();
					if (this.anInt384 == 0 && local32 >= 5) {
						break;
					}
					this.method200();
					if (this.anInputStream1 != null) {
						this.method182();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class1_Sub1_Sub4 local72;
				for (local72 = (Class1_Sub1_Sub4) this.aClass21_1.method246(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass21_1.method248()) {
					if (local72.aBoolean152) {
						local67 = true;
						local72.anInt599++;
						if (local72.anInt599 > 50) {
							local72.anInt599 = 0;
							this.method188(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass21_1.method246(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass21_1.method248()) {
						local67 = true;
						local72.anInt599++;
						if (local72.anInt599 > 50) {
							local72.anInt599 = 0;
							this.method188(local72);
						}
					}
				}
				if (local67) {
					this.anInt386++;
					if (this.anInt386 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt380 = 0;
					}
				} else {
					this.anInt386 = 0;
					this.aString12 = "";
				}
				if (this.aClient2.aBoolean246 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt374 > 0 || this.aClient2.aClass16Array1[0] == null)) {
					this.anInt375++;
					if (this.anInt375 > 500) {
						this.anInt375 = 0;
						this.aByteArray4[0] = 0;
						this.aByteArray4[1] = 0;
						this.aByteArray4[2] = 0;
						this.aByteArray4[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray4, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt386 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(IIZ)V")
	public void method192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.aClient2.aClass16Array1[0] != null && (this.anIntArrayArray4[arg1][arg0] != 0 && (this.aByteArrayArray1[arg1][arg0] != 0 && this.anInt374 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt597 = arg1;
				local30.anInt598 = arg0;
				local30.aBoolean152 = false;
				@Pc(46) Class21 local46 = this.aClass21_2;
				synchronized (this.aClass21_2) {
					this.aClass21_2.method243(local30);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("1578, " + arg0 + ", " + arg1 + ", " + false + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "c", descriptor = "()Lclient!PHKHJKBS;")
	public Class1_Sub1_Sub4 method193() {
		@Pc(4) Class21 local4 = this.aClass21_3;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass21_3) {
			local11 = (Class1_Sub1_Sub4) this.aClass21_3.method245();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class3 local24 = this.aClass3_2;
		synchronized (this.aClass3_2) {
			local11.method527();
		}
		if (local11.aByteArray12 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray12));
			while (true) {
				if (local41 == this.aByteArray5.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray5, local41, this.aByteArray5.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray12 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray12[local93] = this.aByteArray5[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(IIII)I")
	public int method194(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(9) int local9 = (arg2 << 8) + arg1;
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray68.length; local11++) {
				if (this.anIntArray68[local11] == local9) {
					if (arg0 == 0) {
						return this.anIntArray65[local11];
					}
					return this.anIntArray63[local11];
				}
			}
			return -1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("78844, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(I)V")
	@Override
	public void method180(@OriginalArg(0) int arg0) {
		this.method190(0, arg0);
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(BIIB)V")
	public void method195(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(4) boolean local4 = false;
			if (this.aClient2.aClass16Array1[0] != null && this.anIntArrayArray4[arg1][arg2] != 0) {
				@Pc(35) byte[] local35 = this.aClient2.aClass16Array1[arg1 + 1].method214(arg2);
				if (!this.method181(this.anIntArrayArray4[arg1][arg2], this.anIntArrayArray5[arg1][arg2], local35)) {
					this.aByteArrayArray1[arg1][arg2] = arg0;
					if (arg0 > this.anInt374) {
						this.anInt374 = arg0;
					}
					this.anInt373++;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("88351, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "d", descriptor = "(II)Z")
	public boolean method196(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray68.length; local11++) {
				if (this.anIntArray63[local11] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("5492, " + arg0 + ", " + -520 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(Z)V")
	private void method197() {
		try {
			this.anInt384 = 0;
			this.anInt385 = 0;
			@Pc(15) Class1_Sub1_Sub4 local15;
			for (local15 = (Class1_Sub1_Sub4) this.aClass21_1.method246(); local15 != null; local15 = (Class1_Sub1_Sub4) this.aClass21_1.method248()) {
				if (local15.aBoolean152) {
					this.anInt384++;
				} else {
					this.anInt385++;
				}
			}
			while (this.anInt384 < 10) {
				local15 = (Class1_Sub1_Sub4) this.aClass21_4.method245();
				if (local15 == null) {
					break;
				}
				if (this.aByteArrayArray1[local15.anInt597][local15.anInt598] != 0) {
					this.anInt382++;
				}
				this.aByteArrayArray1[local15.anInt597][local15.anInt598] = 0;
				this.aClass21_1.method243(local15);
				this.anInt384++;
				this.method188(local15);
				this.aBoolean89 = true;
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("89950, " + false + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "d", descriptor = "(I)V")
	public void method198() {
		try {
			@Pc(11) Class21 local11 = this.aClass21_2;
			synchronized (this.aClass21_2) {
				this.aClass21_2.method250();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("26326, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "b", descriptor = "(Z)V")
	private void method199() {
		try {
			@Pc(5) Class21 local5 = this.aClass21_5;
			@Pc(12) Class1_Sub1_Sub4 local12;
			synchronized (this.aClass21_5) {
				local12 = (Class1_Sub1_Sub4) this.aClass21_5.method245();
			}
			while (local12 != null) {
				this.aBoolean89 = true;
				@Pc(23) byte[] local23 = null;
				if (this.aClient2.aClass16Array1[0] != null) {
					local23 = this.aClient2.aClass16Array1[local12.anInt597 + 1].method214(local12.anInt598);
				}
				if (!this.method181(this.anIntArrayArray4[local12.anInt597][local12.anInt598], this.anIntArrayArray5[local12.anInt597][local12.anInt598], local23)) {
					local23 = null;
				}
				@Pc(68) Class21 local68 = this.aClass21_5;
				synchronized (this.aClass21_5) {
					if (local23 == null) {
						this.aClass21_4.method243(local12);
					} else {
						local12.aByteArray12 = local23;
						@Pc(84) Class21 local84 = this.aClass21_3;
						synchronized (this.aClass21_3) {
							this.aClass21_3.method243(local12);
						}
					}
					local12 = (Class1_Sub1_Sub4) this.aClass21_5.method245();
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("20446, " + true + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(B)V")
	private void method200() {
		try {
			while (this.anInt384 == 0) {
				if (this.anInt385 >= 10 || this.anInt374 == 0) {
					return;
				}
				@Pc(19) Class21 local19 = this.aClass21_2;
				@Pc(26) Class1_Sub1_Sub4 local26;
				synchronized (this.aClass21_2) {
					local26 = (Class1_Sub1_Sub4) this.aClass21_2.method245();
				}
				while (local26 != null) {
					if (this.aByteArrayArray1[local26.anInt597][local26.anInt598] != 0) {
						this.aByteArrayArray1[local26.anInt597][local26.anInt598] = 0;
						this.aClass21_1.method243(local26);
						this.method188(local26);
						this.aBoolean89 = true;
						if (this.anInt382 < this.anInt373) {
							this.anInt382++;
						}
						this.aString12 = "Loading extra files - " + this.anInt382 * 100 / this.anInt373 + "%";
						this.anInt385++;
						if (this.anInt385 == 10) {
							return;
						}
					}
					local19 = this.aClass21_2;
					synchronized (this.aClass21_2) {
						local26 = (Class1_Sub1_Sub4) this.aClass21_2.method245();
					}
				}
				for (@Pc(120) int local120 = 0; local120 < 4; local120++) {
					@Pc(127) byte[] local127 = this.aByteArrayArray1[local120];
					@Pc(130) int local130 = local127.length;
					for (@Pc(132) int local132 = 0; local132 < local130; local132++) {
						if (local127[local132] == this.anInt374) {
							local127[local132] = 0;
							local26 = new Class1_Sub1_Sub4();
							local26.anInt597 = local120;
							local26.anInt598 = local132;
							local26.aBoolean152 = false;
							this.aClass21_1.method243(local26);
							this.method188(local26);
							this.aBoolean89 = true;
							if (this.anInt382 < this.anInt373) {
								this.anInt382++;
							}
							this.aString12 = "Loading extra files - " + this.anInt382 * 100 / this.anInt373 + "%";
							this.anInt385++;
							if (this.anInt385 == 10) {
								return;
							}
						}
					}
				}
				this.anInt374--;
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("32156, " + -56 + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHOWLKWN", name = "e", descriptor = "(II)Z")
	public boolean method201(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray64[arg0] == 1;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("54888, " + arg0 + ", " + 5 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
