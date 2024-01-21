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

@OriginalClass("client!VCPXACGS")
public final class Class31_Sub1 extends Class31 implements Runnable {

	@OriginalMember(owner = "client!VCPXACGS", name = "g", descriptor = "Z")
	private static boolean aBoolean171 = true;

	@OriginalMember(owner = "client!VCPXACGS", name = "d", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!VCPXACGS", name = "f", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!VCPXACGS", name = "j", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!VCPXACGS", name = "k", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!VCPXACGS", name = "l", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!VCPXACGS", name = "m", descriptor = "I")
	private int anInt771;

	@OriginalMember(owner = "client!VCPXACGS", name = "o", descriptor = "I")
	private int anInt773;

	@OriginalMember(owner = "client!VCPXACGS", name = "p", descriptor = "I")
	private int anInt774;

	@OriginalMember(owner = "client!VCPXACGS", name = "q", descriptor = "I")
	private int anInt775;

	@OriginalMember(owner = "client!VCPXACGS", name = "r", descriptor = "I")
	private int anInt776;

	@OriginalMember(owner = "client!VCPXACGS", name = "v", descriptor = "I")
	public int anInt777;

	@OriginalMember(owner = "client!VCPXACGS", name = "w", descriptor = "I")
	private int anInt778;

	@OriginalMember(owner = "client!VCPXACGS", name = "A", descriptor = "Lclient!LMSXRUPQ;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!VCPXACGS", name = "D", descriptor = "I")
	public int anInt779;

	@OriginalMember(owner = "client!VCPXACGS", name = "E", descriptor = "[I")
	private int[] anIntArray201;

	@OriginalMember(owner = "client!VCPXACGS", name = "F", descriptor = "I")
	private int anInt780;

	@OriginalMember(owner = "client!VCPXACGS", name = "G", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!VCPXACGS", name = "H", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!VCPXACGS", name = "M", descriptor = "[I")
	private int[] anIntArray203;

	@OriginalMember(owner = "client!VCPXACGS", name = "N", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!VCPXACGS", name = "P", descriptor = "I")
	private int anInt782;

	@OriginalMember(owner = "client!VCPXACGS", name = "Q", descriptor = "I")
	private int anInt783;

	@OriginalMember(owner = "client!VCPXACGS", name = "U", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!VCPXACGS", name = "V", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!VCPXACGS", name = "b", descriptor = "Lclient!OUZUCGGU;")
	private Class32 aClass32_5 = new Class32(-392);

	@OriginalMember(owner = "client!VCPXACGS", name = "c", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!VCPXACGS", name = "e", descriptor = "Z")
	private boolean aBoolean170 = true;

	@OriginalMember(owner = "client!VCPXACGS", name = "h", descriptor = "Z")
	private boolean aBoolean172 = true;

	@OriginalMember(owner = "client!VCPXACGS", name = "i", descriptor = "I")
	private int anInt770 = -308;

	@OriginalMember(owner = "client!VCPXACGS", name = "n", descriptor = "I")
	private int anInt772 = -874;

	@OriginalMember(owner = "client!VCPXACGS", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray20 = new int[4][];

	@OriginalMember(owner = "client!VCPXACGS", name = "t", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!VCPXACGS", name = "u", descriptor = "Lclient!OUZUCGGU;")
	private Class32 aClass32_6 = new Class32(-392);

	@OriginalMember(owner = "client!VCPXACGS", name = "x", descriptor = "Z")
	private boolean aBoolean173 = true;

	@OriginalMember(owner = "client!VCPXACGS", name = "y", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!VCPXACGS", name = "z", descriptor = "Lclient!BOZWYCIO;")
	private Class5 aClass5_2 = new Class5(aBoolean171);

	@OriginalMember(owner = "client!VCPXACGS", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[4][];

	@OriginalMember(owner = "client!VCPXACGS", name = "C", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!VCPXACGS", name = "I", descriptor = "I")
	private int anInt781 = 9;

	@OriginalMember(owner = "client!VCPXACGS", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray21 = new int[4][];

	@OriginalMember(owner = "client!VCPXACGS", name = "K", descriptor = "Lclient!OUZUCGGU;")
	private Class32 aClass32_7 = new Class32(-392);

	@OriginalMember(owner = "client!VCPXACGS", name = "L", descriptor = "Lclient!OUZUCGGU;")
	private Class32 aClass32_8 = new Class32(-392);

	@OriginalMember(owner = "client!VCPXACGS", name = "O", descriptor = "Ljava/lang/String;")
	public String aString16 = "";

	@OriginalMember(owner = "client!VCPXACGS", name = "R", descriptor = "Z")
	private boolean aBoolean174 = true;

	@OriginalMember(owner = "client!VCPXACGS", name = "S", descriptor = "B")
	private byte aByte50 = 63;

	@OriginalMember(owner = "client!VCPXACGS", name = "T", descriptor = "Lclient!OUZUCGGU;")
	private Class32 aClass32_9 = new Class32(-392);

	@OriginalMember(owner = "client!VCPXACGS", name = "a", descriptor = "(I)V")
	@Override
	public void method516(@OriginalArg(0) int arg0) {
		this.method529(0, arg0);
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "a", descriptor = "(ILclient!LMSXRUPQ;)V")
	private void method517(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket2 == null) {
					@Pc(9) long local9 = System.currentTimeMillis();
					if (local9 - this.aLong25 < 4000L) {
						return;
					}
					this.aLong25 = local9;
					this.aSocket2 = this.aClient5.method662(client.anInt976 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(44) int local44 = 0; local44 < 8; local44++) {
						this.anInputStream2.read();
					}
					this.anInt774 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt401;
				this.aByteArray18[1] = (byte) (arg0.anInt399 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt399;
				if (arg0.aBoolean93) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient5.aBoolean215) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt778 = 0;
				this.anInt779 = -10000;
			} catch (@Pc(121) IOException local121) {
				try {
					this.aSocket2.close();
				} catch (@Pc(126) Exception local126) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt776 = 0;
				this.anInt779++;
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("37666, " + 0 + ", " + arg0 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "b", descriptor = "(I)V")
	private void method518(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) Class32 local6 = this.aClass32_6;
			@Pc(13) Class1_Sub1_Sub4 local13;
			synchronized (this.aClass32_6) {
				local13 = (Class1_Sub1_Sub4) this.aClass32_6.method335();
			}
			while (local13 != null) {
				this.aBoolean169 = true;
				@Pc(24) byte[] local24 = null;
				if (this.aClient5.aClass21Array1[0] != null) {
					local24 = this.aClient5.aClass21Array1[local13.anInt401 + 1].method288(local13.anInt399);
				}
				if (!this.method534(this.anIntArrayArray21[local13.anInt401][local13.anInt399], this.anIntArrayArray20[local13.anInt401][local13.anInt399], local24)) {
					local24 = null;
				}
				@Pc(69) Class32 local69 = this.aClass32_6;
				synchronized (this.aClass32_6) {
					if (local24 == null) {
						this.aClass32_8.method333(local13);
					} else {
						local13.aByteArray5 = local24;
						@Pc(85) Class32 local85 = this.aClass32_5;
						synchronized (this.aClass32_5) {
							this.aClass32_5.method333(local13);
						}
					}
					local13 = (Class1_Sub1_Sub4) this.aClass32_6.method335();
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("29942, " + arg0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "a", descriptor = "(ZI)I")
	public int method519(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray21[arg0].length;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("49342, " + true + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "a", descriptor = "(BI)I")
	public int method520(@OriginalArg(1) int arg0) {
		try {
			if (this.aByte50 != 63) {
				this.aBoolean173 = !this.aBoolean173;
			}
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("37938, " + 63 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "a", descriptor = "(B)V")
	private void method521() {
		try {
			while (this.anInt782 == 0) {
				if (this.anInt783 >= 10 || this.anInt771 == 0) {
					return;
				}
				@Pc(11) Class32 local11 = this.aClass32_7;
				@Pc(18) Class1_Sub1_Sub4 local18;
				synchronized (this.aClass32_7) {
					local18 = (Class1_Sub1_Sub4) this.aClass32_7.method335();
				}
				while (local18 != null) {
					if (this.aByteArrayArray3[local18.anInt401][local18.anInt399] != 0) {
						this.aByteArrayArray3[local18.anInt401][local18.anInt399] = 0;
						this.aClass32_9.method333(local18);
						this.method517(local18);
						this.aBoolean169 = true;
						if (this.anInt780 < this.anInt773) {
							this.anInt780++;
						}
						this.aString16 = "Loading extra files - " + this.anInt780 * 100 / this.anInt773 + "%";
						this.anInt783++;
						if (this.anInt783 == 10) {
							return;
						}
					}
					local11 = this.aClass32_7;
					synchronized (this.aClass32_7) {
						local18 = (Class1_Sub1_Sub4) this.aClass32_7.method335();
					}
				}
				for (@Pc(112) int local112 = 0; local112 < 4; local112++) {
					@Pc(119) byte[] local119 = this.aByteArrayArray3[local112];
					@Pc(122) int local122 = local119.length;
					for (@Pc(124) int local124 = 0; local124 < local122; local124++) {
						if (local119[local124] == this.anInt771) {
							local119[local124] = 0;
							local18 = new Class1_Sub1_Sub4();
							local18.anInt401 = local112;
							local18.anInt399 = local124;
							local18.aBoolean93 = false;
							this.aClass32_9.method333(local18);
							this.method517(local18);
							this.aBoolean169 = true;
							if (this.anInt780 < this.anInt773) {
								this.anInt780++;
							}
							this.aString16 = "Loading extra files - " + this.anInt780 * 100 / this.anInt773 + "%";
							this.anInt783++;
							if (this.anInt783 == 10) {
								return;
							}
						}
					}
				}
				this.anInt771--;
			}
		} catch (@Pc(222) RuntimeException local222) {
			signlink.reporterror("47644, " + 1 + ", " + local222.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "a", descriptor = "(Lclient!HRXSNEYZ;Lclient!client;)V")
	public void method522(@OriginalArg(0) Class15 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method220(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, 8);
			this.anIntArrayArray21[local22] = new int[local36];
			this.aByteArrayArray3[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray21[local22][local56] = local42.method240();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method220(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, 8);
			this.anIntArrayArray20[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray20[local36][local123] = local115.method243();
			}
		}
		local104 = arg0.method220("model_index", null);
		local56 = this.anIntArrayArray21[0].length;
		this.aByteArray17 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray17[local158] = local104[local158];
			} else {
				this.aByteArray17[local158] = 0;
			}
		}
		local104 = arg0.method220("map_index", null);
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, 8);
		local56 = local104.length / 7;
		this.anIntArray203 = new int[local56];
		this.anIntArray204 = new int[local56];
		this.anIntArray202 = new int[local56];
		this.anIntArray201 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray203[local216] = local193.method240();
			this.anIntArray204[local216] = local193.method240();
			this.anIntArray202[local216] = local193.method240();
			this.anIntArray201[local216] = local193.method238();
		}
		local104 = arg0.method220("anim_index", null);
		local193 = new Class1_Sub1_Sub3(local104, 8);
		local56 = local104.length / 2;
		this.anIntArray200 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray200[local268] = local193.method240();
		}
		local104 = arg0.method220("midi_index", null);
		local193 = new Class1_Sub1_Sub3(local104, 8);
		local56 = local104.length;
		this.anIntArray205 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray205[local300] = local193.method238();
		}
		this.aClient5 = arg1;
		this.aBoolean170 = true;
		this.aClient5.method579(this, 2);
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "c", descriptor = "(I)I")
	public int method523(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return this.anIntArray200.length;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("39977, " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "d", descriptor = "(I)V")
	private void method524() {
		try {
			try {
				@Pc(9) int local9 = this.anInputStream2.available();
				@Pc(44) int local44;
				@Pc(60) int local60;
				if (this.anInt776 == 0 && local9 >= 6) {
					this.aBoolean169 = true;
					for (@Pc(20) int local20 = 0; local20 < 6; local20 += this.anInputStream2.read(this.aByteArray18, local20, 6 - local20)) {
					}
					local44 = this.aByteArray18[0] & 0xFF;
					local60 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(76) int local76 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(83) int local83 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(91) Class1_Sub1_Sub4 local91 = (Class1_Sub1_Sub4) this.aClass32_9.method336(); local91 != null; local91 = (Class1_Sub1_Sub4) this.aClass32_9.method338()) {
						if (local91.anInt401 == local44 && local91.anInt399 == local60) {
							this.aClass1_Sub1_Sub4_1 = local91;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local91.anInt400 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt774 = 0;
						if (local76 == 0) {
							signlink.reporterror("Rej: " + local44 + "," + local60);
							this.aClass1_Sub1_Sub4_1.aByteArray5 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean93) {
								@Pc(149) Class32 local149 = this.aClass32_5;
								synchronized (this.aClass32_5) {
									this.aClass32_5.method333(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method544();
							}
							this.aClass1_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass1_Sub1_Sub4_1.aByteArray5 == null && local83 == 0) {
								this.aClass1_Sub1_Sub4_1.aByteArray5 = new byte[local76];
							}
							if (this.aClass1_Sub1_Sub4_1.aByteArray5 == null && local83 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt775 = local83 * 500;
					this.anInt776 = 500;
					if (this.anInt776 > local76 - local83 * 500) {
						this.anInt776 = local76 - local83 * 500;
					}
				}
				if (this.anInt776 > 0 && local9 >= this.anInt776) {
					this.aBoolean169 = true;
					@Pc(228) byte[] local228 = this.aByteArray18;
					local44 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local228 = this.aClass1_Sub1_Sub4_1.aByteArray5;
						local44 = this.anInt775;
					}
					for (local60 = 0; local60 < this.anInt776; local60 += this.anInputStream2.read(local228, local60 + local44, this.anInt776 - local60)) {
					}
					if (this.anInt776 + this.anInt775 >= local228.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient5.aClass21Array1[0] != null) {
							this.aClient5.aClass21Array1[this.aClass1_Sub1_Sub4_1.anInt401 + 1].method289(local228, this.aClass1_Sub1_Sub4_1.anInt399, local228.length);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean93 && this.aClass1_Sub1_Sub4_1.anInt401 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean93 = true;
							this.aClass1_Sub1_Sub4_1.anInt401 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean93) {
							@Pc(321) Class32 local321 = this.aClass32_5;
							synchronized (this.aClass32_5) {
								this.aClass32_5.method333(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method544();
						}
					}
					this.anInt776 = 0;
				}
			} catch (@Pc(342) IOException local342) {
				try {
					this.aSocket2.close();
				} catch (@Pc(347) Exception local347) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt776 = 0;
			}
		} catch (@Pc(361) RuntimeException local361) {
			signlink.reporterror("56338, " + -25950 + ", " + local361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "a", descriptor = "(IIIZ)I")
	public int method525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) int local5 = (arg1 << 8) + arg2;
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray203.length; local12++) {
				if (this.anIntArray203[local12] == local5) {
					if (arg0 == 0) {
						return this.anIntArray204[local12];
					}
					return this.anIntArray202[local12];
				}
			}
			return -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("52750, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "a", descriptor = "(BIII)V")
	public void method526(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient5.aClass21Array1[0] != null && this.anIntArrayArray21[arg2][arg1] != 0) {
				@Pc(25) byte[] local25 = this.aClient5.aClass21Array1[arg2 + 1].method288(arg1);
				if (this.anInt781 > 9 || this.anInt781 < 9) {
					this.anInt772 = -317;
				}
				if (!this.method534(this.anIntArrayArray21[arg2][arg1], this.anIntArrayArray20[arg2][arg1], local25)) {
					this.aByteArrayArray3[arg2][arg1] = arg0;
					if (arg0 > this.anInt771) {
						this.anInt771 = arg0;
					}
					this.anInt773++;
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("49882, " + arg0 + ", " + 9 + ", " + arg1 + ", " + arg2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "a", descriptor = "(III)V")
	public void method527(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient5.aClass21Array1[0] != null && (this.anIntArrayArray21[arg1][arg0] != 0 && (this.aByteArrayArray3[arg1][arg0] != 0 && this.anInt771 != 0))) {
				@Pc(35) Class1_Sub1_Sub4 local35 = new Class1_Sub1_Sub4();
				local35.anInt401 = arg1;
				local35.anInt399 = arg0;
				local35.aBoolean93 = false;
				@Pc(47) Class32 local47 = this.aClass32_7;
				synchronized (this.aClass32_7) {
					this.aClass32_7.method333(local35);
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("7508, " + -198 + ", " + arg0 + ", " + arg1 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "b", descriptor = "(BI)Z")
	public boolean method528(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray205[arg0] == 1;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("38828, " + -6 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "a", descriptor = "(II)V")
	public void method529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray21.length || arg1 < 0 || arg1 > this.anIntArrayArray21[arg0].length || this.anIntArrayArray21[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class5 local27 = this.aClass5_2;
		synchronized (this.aClass5_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass5_2.method74(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass5_2.method75()) {
				if (local34.anInt401 == arg0 && local34.anInt399 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt401 = arg0;
			local34.anInt399 = arg1;
			local34.aBoolean93 = true;
			@Pc(71) Class32 local71 = this.aClass32_6;
			synchronized (this.aClass32_6) {
				this.aClass32_6.method333(local34);
			}
			this.aClass5_2.method72(local34);
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "a", descriptor = "()Lclient!LMSXRUPQ;")
	public Class1_Sub1_Sub4 method530() {
		@Pc(4) Class32 local4 = this.aClass32_5;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass32_5) {
			local11 = (Class1_Sub1_Sub4) this.aClass32_5.method335();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class5 local24 = this.aClass5_2;
		synchronized (this.aClass5_2) {
			local11.method545();
		}
		if (local11.aByteArray5 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray5));
			while (true) {
				if (local41 == this.aByteArray19.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray19, local41, this.aByteArray19.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray5 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray5[local93] = this.aByteArray19[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "e", descriptor = "(I)V")
	private void method531() {
		try {
			this.anInt782 = 0;
			this.anInt783 = 0;
			@Pc(12) Class1_Sub1_Sub4 local12;
			for (local12 = (Class1_Sub1_Sub4) this.aClass32_9.method336(); local12 != null; local12 = (Class1_Sub1_Sub4) this.aClass32_9.method338()) {
				if (local12.aBoolean93) {
					this.anInt782++;
				} else {
					this.anInt783++;
				}
			}
			while (this.anInt782 < 10) {
				local12 = (Class1_Sub1_Sub4) this.aClass32_8.method335();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray3[local12.anInt401][local12.anInt399] != 0) {
					this.anInt780++;
				}
				this.aByteArrayArray3[local12.anInt401][local12.anInt399] = 0;
				this.aClass32_9.method333(local12);
				this.anInt782++;
				this.method517(local12);
				this.aBoolean169 = true;
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("77722, " + 853 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "a", descriptor = "(IZ)V")
	public void method532(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(5) int local5 = this.anIntArray203.length;
			for (@Pc(7) int local7 = 0; local7 < local5; local7++) {
				if (arg0 || this.anIntArray201[local7] != 0) {
					this.method526((byte) 2, this.anIntArray202[local7], 3);
					this.method526((byte) 2, this.anIntArray204[local7], 3);
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("48555, " + -328 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "b", descriptor = "()I")
	public int method533() {
		@Pc(2) Class5 local2 = this.aClass5_2;
		synchronized (this.aClass5_2) {
			return this.aClass5_2.method76();
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "a", descriptor = "(III[B)Z")
	private boolean method534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
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
			signlink.reporterror("89788, " + arg0 + ", " + arg1 + ", " + -20083 + ", " + arg2 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "f", descriptor = "(I)V")
	public void method535() {
		try {
			@Pc(2) Class32 local2 = this.aClass32_7;
			synchronized (this.aClass32_7) {
				this.aClass32_7.method340();
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("20634, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean170) {
				this.anInt777++;
				@Pc(11) byte local11 = 20;
				if (this.anInt771 == 0 && this.aClient5.aClass21Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean169 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean169; local32++) {
					this.aBoolean169 = false;
					this.method518(439);
					this.method531();
					if (this.anInt782 == 0 && local32 >= 5) {
						break;
					}
					this.method521();
					if (this.anInputStream2 != null) {
						this.method524();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class1_Sub1_Sub4 local72;
				for (local72 = (Class1_Sub1_Sub4) this.aClass32_9.method336(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass32_9.method338()) {
					if (local72.aBoolean93) {
						local67 = true;
						local72.anInt400++;
						if (local72.anInt400 > 50) {
							local72.anInt400 = 0;
							this.method517(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass32_9.method336(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass32_9.method338()) {
						local67 = true;
						local72.anInt400++;
						if (local72.anInt400 > 50) {
							local72.anInt400 = 0;
							this.method517(local72);
						}
					}
				}
				if (local67) {
					this.anInt774++;
					if (this.anInt774 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt776 = 0;
					}
				} else {
					this.anInt774 = 0;
					this.aString16 = "";
				}
				if (this.aClient5.aBoolean215 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt771 > 0 || this.aClient5.aClass21Array1[0] == null)) {
					this.anInt778++;
					if (this.anInt778 > 500) {
						this.anInt778 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt774 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "c", descriptor = "()V")
	public void method536() {
		this.aBoolean170 = false;
	}

	@OriginalMember(owner = "client!VCPXACGS", name = "c", descriptor = "(BI)Z")
	public boolean method537(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray203.length; local3++) {
				if (this.anIntArray202[local3] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("17405, " + -93 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}
}
