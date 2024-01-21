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

@OriginalClass("client!EBLTOQBO")
public final class Class8_Sub1 extends Class8 implements Runnable {

	@OriginalMember(owner = "client!EBLTOQBO", name = "z", descriptor = "I")
	private static int anInt151;

	@OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!EBLTOQBO", name = "c", descriptor = "I")
	private int anInt142;

	@OriginalMember(owner = "client!EBLTOQBO", name = "f", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!EBLTOQBO", name = "g", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!EBLTOQBO", name = "i", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!EBLTOQBO", name = "k", descriptor = "I")
	private int anInt144;

	@OriginalMember(owner = "client!EBLTOQBO", name = "n", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!EBLTOQBO", name = "o", descriptor = "I")
	private int anInt146;

	@OriginalMember(owner = "client!EBLTOQBO", name = "p", descriptor = "I")
	public int anInt147;

	@OriginalMember(owner = "client!EBLTOQBO", name = "r", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!EBLTOQBO", name = "s", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!EBLTOQBO", name = "u", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!EBLTOQBO", name = "y", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!EBLTOQBO", name = "A", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!EBLTOQBO", name = "B", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!EBLTOQBO", name = "F", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!EBLTOQBO", name = "H", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!EBLTOQBO", name = "I", descriptor = "I")
	private int anInt154;

	@OriginalMember(owner = "client!EBLTOQBO", name = "J", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!EBLTOQBO", name = "L", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!EBLTOQBO", name = "M", descriptor = "Lclient!ZUBZCVQN;")
	private Class2_Sub1_Sub4 aClass2_Sub1_Sub4_1;

	@OriginalMember(owner = "client!EBLTOQBO", name = "N", descriptor = "I")
	private int anInt155;

	@OriginalMember(owner = "client!EBLTOQBO", name = "O", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!EBLTOQBO", name = "S", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!EBLTOQBO", name = "b", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!EBLTOQBO", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray9 = new int[4][];

	@OriginalMember(owner = "client!EBLTOQBO", name = "e", descriptor = "[B")
	private byte[] aByteArray2 = new byte[65000];

	@OriginalMember(owner = "client!EBLTOQBO", name = "h", descriptor = "I")
	private int anInt143 = -32392;

	@OriginalMember(owner = "client!EBLTOQBO", name = "j", descriptor = "B")
	private byte aByte4 = 3;

	@OriginalMember(owner = "client!EBLTOQBO", name = "l", descriptor = "Lclient!PACANLMY;")
	private Class29 aClass29_1 = new Class29(0);

	@OriginalMember(owner = "client!EBLTOQBO", name = "m", descriptor = "[B")
	private byte[] aByteArray4 = new byte[500];

	@OriginalMember(owner = "client!EBLTOQBO", name = "q", descriptor = "I")
	private int anInt148 = 7;

	@OriginalMember(owner = "client!EBLTOQBO", name = "t", descriptor = "Lclient!PACANLMY;")
	private Class29 aClass29_2 = new Class29(0);

	@OriginalMember(owner = "client!EBLTOQBO", name = "v", descriptor = "I")
	private int anInt150 = 3148;

	@OriginalMember(owner = "client!EBLTOQBO", name = "w", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!EBLTOQBO", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray10 = new int[4][];

	@OriginalMember(owner = "client!EBLTOQBO", name = "C", descriptor = "Lclient!YAKFHRTY;")
	private Class43 aClass43_1 = new Class43(anInt151);

	@OriginalMember(owner = "client!EBLTOQBO", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[4][];

	@OriginalMember(owner = "client!EBLTOQBO", name = "E", descriptor = "Lclient!PACANLMY;")
	private Class29 aClass29_3 = new Class29(0);

	@OriginalMember(owner = "client!EBLTOQBO", name = "G", descriptor = "Z")
	private boolean aBoolean50 = true;

	@OriginalMember(owner = "client!EBLTOQBO", name = "K", descriptor = "Lclient!PACANLMY;")
	private Class29 aClass29_4 = new Class29(0);

	@OriginalMember(owner = "client!EBLTOQBO", name = "P", descriptor = "Z")
	private boolean aBoolean51 = true;

	@OriginalMember(owner = "client!EBLTOQBO", name = "Q", descriptor = "Ljava/lang/String;")
	public String aString2 = "";

	@OriginalMember(owner = "client!EBLTOQBO", name = "R", descriptor = "Lclient!PACANLMY;")
	private Class29 aClass29_5 = new Class29(0);

	@OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(Lclient!FUZJMGZB;Lclient!client;)V")
	public void method125(@OriginalArg(0) Class13 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method186(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class2_Sub1_Sub3 local42 = new Class2_Sub1_Sub3((byte) 114, local31);
			this.anIntArrayArray10[local22] = new int[local36];
			this.aByteArrayArray1[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray10[local22][local56] = local42.method269();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method186(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class2_Sub1_Sub3 local115 = new Class2_Sub1_Sub3((byte) 114, local104);
			this.anIntArrayArray9[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray9[local36][local123] = local115.method272();
			}
		}
		local104 = arg0.method186("model_index", null);
		local56 = this.anIntArrayArray10[0].length;
		this.aByteArray3 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray3[local158] = local104[local158];
			} else {
				this.aByteArray3[local158] = 0;
			}
		}
		local104 = arg0.method186("map_index", null);
		@Pc(193) Class2_Sub1_Sub3 local193 = new Class2_Sub1_Sub3((byte) 114, local104);
		local56 = local104.length / 7;
		this.anIntArray64 = new int[local56];
		this.anIntArray61 = new int[local56];
		this.anIntArray63 = new int[local56];
		this.anIntArray62 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray64[local216] = local193.method269();
			this.anIntArray61[local216] = local193.method269();
			this.anIntArray63[local216] = local193.method269();
			this.anIntArray62[local216] = local193.method267();
		}
		local104 = arg0.method186("anim_index", null);
		local193 = new Class2_Sub1_Sub3((byte) 114, local104);
		local56 = local104.length / 2;
		this.anIntArray60 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray60[local268] = local193.method269();
		}
		local104 = arg0.method186("midi_index", null);
		local193 = new Class2_Sub1_Sub3((byte) 114, local104);
		local56 = local104.length;
		this.anIntArray65 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray65[local300] = local193.method267();
		}
		this.aClient2 = arg1;
		this.aBoolean50 = true;
		this.aClient2.method586(this, 2);
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(BZ)V")
	public void method126(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray64.length;
			for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
				if (arg0 || this.anIntArray62[local9] != 0) {
					this.method139((byte) 2, this.anIntArray63[local9], 3);
					this.method139((byte) 2, this.anIntArray61[local9], 3);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("69786, " + 3 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "b", descriptor = "(I)V")
	private void method127() {
		try {
			while (this.anInt152 == 0) {
				if (this.anInt153 >= 10 || this.anInt146 == 0) {
					return;
				}
				@Pc(11) Class29 local11 = this.aClass29_1;
				@Pc(18) Class2_Sub1_Sub4 local18;
				synchronized (this.aClass29_1) {
					local18 = (Class2_Sub1_Sub4) this.aClass29_1.method354();
				}
				while (local18 != null) {
					if (this.aByteArrayArray1[local18.anInt795][local18.anInt796] != 0) {
						this.aByteArrayArray1[local18.anInt795][local18.anInt796] = 0;
						this.aClass29_5.method352(local18);
						this.method132(local18);
						this.aBoolean49 = true;
						if (this.anInt149 < this.anInt142) {
							this.anInt149++;
						}
						this.aString2 = "Loading extra files - " + this.anInt149 * 100 / this.anInt142 + "%";
						this.anInt153++;
						if (this.anInt153 == 10) {
							return;
						}
					}
					local11 = this.aClass29_1;
					synchronized (this.aClass29_1) {
						local18 = (Class2_Sub1_Sub4) this.aClass29_1.method354();
					}
				}
				for (@Pc(112) int local112 = 0; local112 < 4; local112++) {
					@Pc(119) byte[] local119 = this.aByteArrayArray1[local112];
					@Pc(122) int local122 = local119.length;
					for (@Pc(124) int local124 = 0; local124 < local122; local124++) {
						if (local119[local124] == this.anInt146) {
							local119[local124] = 0;
							local18 = new Class2_Sub1_Sub4();
							local18.anInt795 = local112;
							local18.anInt796 = local124;
							local18.aBoolean176 = false;
							this.aClass29_5.method352(local18);
							this.method132(local18);
							this.aBoolean49 = true;
							if (this.anInt149 < this.anInt142) {
								this.anInt149++;
							}
							this.aString2 = "Loading extra files - " + this.anInt149 * 100 / this.anInt142 + "%";
							this.anInt153++;
							if (this.anInt153 == 10) {
								return;
							}
						}
					}
				}
				this.anInt146--;
			}
		} catch (@Pc(222) RuntimeException local222) {
			signlink.reporterror("88522, " + 1 + ", " + local222.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "()V")
	public void method128() {
		this.aBoolean50 = false;
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(III)V")
	public void method129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient2.aClass25Array1[0] != null && (this.anIntArrayArray10[arg1][arg0] != 0 && (this.aByteArrayArray1[arg1][arg0] != 0 && this.anInt146 != 0))) {
				@Pc(30) Class2_Sub1_Sub4 local30 = new Class2_Sub1_Sub4();
				local30.anInt795 = arg1;
				local30.anInt796 = arg0;
				local30.aBoolean176 = false;
				@Pc(42) Class29 local42 = this.aClass29_1;
				synchronized (this.aClass29_1) {
					this.aClass29_1.method352(local30);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("4063, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(BI)I")
	public int method130(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			return arg0 == this.aByte4 ? this.aByteArray3[arg1] & 0xFF : this.anInt148;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("69124, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(Z)V")
	private void method131() {
		try {
			try {
				@Pc(8) int local8 = this.anInputStream1.available();
				@Pc(43) int local43;
				@Pc(59) int local59;
				if (this.anInt156 == 0 && local8 >= 6) {
					this.aBoolean49 = true;
					for (@Pc(19) int local19 = 0; local19 < 6; local19 += this.anInputStream1.read(this.aByteArray4, local19, 6 - local19)) {
					}
					local43 = this.aByteArray4[0] & 0xFF;
					local59 = ((this.aByteArray4[1] & 0xFF) << 8) + (this.aByteArray4[2] & 0xFF);
					@Pc(75) int local75 = ((this.aByteArray4[3] & 0xFF) << 8) + (this.aByteArray4[4] & 0xFF);
					@Pc(82) int local82 = this.aByteArray4[5] & 0xFF;
					this.aClass2_Sub1_Sub4_1 = null;
					for (@Pc(90) Class2_Sub1_Sub4 local90 = (Class2_Sub1_Sub4) this.aClass29_5.method355(); local90 != null; local90 = (Class2_Sub1_Sub4) this.aClass29_5.method357()) {
						if (local90.anInt795 == local43 && local90.anInt796 == local59) {
							this.aClass2_Sub1_Sub4_1 = local90;
						}
						if (this.aClass2_Sub1_Sub4_1 != null) {
							local90.anInt797 = 0;
						}
					}
					if (this.aClass2_Sub1_Sub4_1 != null) {
						this.anInt144 = 0;
						if (local75 == 0) {
							signlink.reporterror("Rej: " + local43 + "," + local59);
							this.aClass2_Sub1_Sub4_1.aByteArray20 = null;
							if (this.aClass2_Sub1_Sub4_1.aBoolean176) {
								@Pc(148) Class29 local148 = this.aClass29_4;
								synchronized (this.aClass29_4) {
									this.aClass29_4.method352(this.aClass2_Sub1_Sub4_1);
								}
							} else {
								this.aClass2_Sub1_Sub4_1.method573();
							}
							this.aClass2_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass2_Sub1_Sub4_1.aByteArray20 == null && local82 == 0) {
								this.aClass2_Sub1_Sub4_1.aByteArray20 = new byte[local75];
							}
							if (this.aClass2_Sub1_Sub4_1.aByteArray20 == null && local82 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt155 = local82 * 500;
					this.anInt156 = 500;
					if (this.anInt156 > local75 - local82 * 500) {
						this.anInt156 = local75 - local82 * 500;
					}
				}
				if (this.anInt156 > 0 && local8 >= this.anInt156) {
					this.aBoolean49 = true;
					@Pc(227) byte[] local227 = this.aByteArray4;
					local43 = 0;
					if (this.aClass2_Sub1_Sub4_1 != null) {
						local227 = this.aClass2_Sub1_Sub4_1.aByteArray20;
						local43 = this.anInt155;
					}
					for (local59 = 0; local59 < this.anInt156; local59 += this.anInputStream1.read(local227, local59 + local43, this.anInt156 - local59)) {
					}
					if (this.anInt156 + this.anInt155 >= local227.length && this.aClass2_Sub1_Sub4_1 != null) {
						if (this.aClient2.aClass25Array1[0] != null) {
							this.aClient2.aClass25Array1[this.aClass2_Sub1_Sub4_1.anInt795 + 1].method319(local227, this.aClass2_Sub1_Sub4_1.anInt796, local227.length);
						}
						if (!this.aClass2_Sub1_Sub4_1.aBoolean176 && this.aClass2_Sub1_Sub4_1.anInt795 == 3) {
							this.aClass2_Sub1_Sub4_1.aBoolean176 = true;
							this.aClass2_Sub1_Sub4_1.anInt795 = 93;
						}
						if (this.aClass2_Sub1_Sub4_1.aBoolean176) {
							@Pc(320) Class29 local320 = this.aClass29_4;
							synchronized (this.aClass29_4) {
								this.aClass29_4.method352(this.aClass2_Sub1_Sub4_1);
							}
						} else {
							this.aClass2_Sub1_Sub4_1.method573();
						}
					}
					this.anInt156 = 0;
				}
			} catch (@Pc(341) IOException local341) {
				try {
					this.aSocket1.close();
				} catch (@Pc(346) Exception local346) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt156 = 0;
			}
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("45303, " + true + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(Lclient!ZUBZCVQN;Z)V")
	private void method132(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket1 == null) {
					@Pc(9) long local9 = System.currentTimeMillis();
					if (local9 - this.aLong10 < 4000L) {
						return;
					}
					this.aLong10 = local9;
					this.aSocket1 = this.aClient2.method702(client.anInt907 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(44) int local44 = 0; local44 < 8; local44++) {
						this.anInputStream1.read();
					}
					this.anInt144 = 0;
				}
				this.aByteArray4[0] = (byte) arg0.anInt795;
				this.aByteArray4[1] = (byte) (arg0.anInt796 >> 8);
				this.aByteArray4[2] = (byte) arg0.anInt796;
				if (arg0.aBoolean176) {
					this.aByteArray4[3] = 2;
				} else if (this.aClient2.aBoolean204) {
					this.aByteArray4[3] = 0;
				} else {
					this.aByteArray4[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray4, 0, 4);
				this.anInt154 = 0;
				this.anInt147 = -10000;
			} catch (@Pc(121) IOException local121) {
				try {
					this.aSocket1.close();
				} catch (@Pc(126) Exception local126) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt156 = 0;
				this.anInt147++;
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("46109, " + arg0 + ", " + false + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "c", descriptor = "(I)V")
	private void method133() {
		try {
			this.anInt152 = 0;
			this.anInt153 = 0;
			@Pc(12) Class2_Sub1_Sub4 local12;
			for (local12 = (Class2_Sub1_Sub4) this.aClass29_5.method355(); local12 != null; local12 = (Class2_Sub1_Sub4) this.aClass29_5.method357()) {
				if (local12.aBoolean176) {
					this.anInt152++;
				} else {
					this.anInt153++;
				}
			}
			while (this.anInt152 < 10) {
				local12 = (Class2_Sub1_Sub4) this.aClass29_2.method354();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray1[local12.anInt795][local12.anInt796] != 0) {
					this.anInt149++;
				}
				this.aByteArrayArray1[local12.anInt795][local12.anInt796] = 0;
				this.aClass29_5.method352(local12);
				this.anInt152++;
				this.method132(local12);
				this.aBoolean49 = true;
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("3722, " + 23925 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(IB)Z")
	public boolean method134(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray65[arg0] == 1;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("19911, " + arg0 + ", " + 113 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "d", descriptor = "(I)V")
	public void method135(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class29 local2 = this.aClass29_1;
			synchronized (this.aClass29_1) {
				this.aClass29_1.method359();
			}
			if (arg0 != 7) {
				for (@Pc(18) int local18 = 1; local18 > 0; local18++) {
				}
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("27170, " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(IZ)I")
	public int method136(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray10[arg0].length;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("69135, " + arg0 + ", " + false + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(IIII)I")
	public int method137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg2 << 8) + arg0;
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray64.length; local11++) {
				if (this.anIntArray64[local11] == local5) {
					if (arg1 == 0) {
						return this.anIntArray61[local11];
					}
					return this.anIntArray63[local11];
				}
			}
			return -1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("20062, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "b", descriptor = "()Lclient!ZUBZCVQN;")
	public Class2_Sub1_Sub4 method138() {
		@Pc(4) Class29 local4 = this.aClass29_4;
		@Pc(11) Class2_Sub1_Sub4 local11;
		synchronized (this.aClass29_4) {
			local11 = (Class2_Sub1_Sub4) this.aClass29_4.method354();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class43 local24 = this.aClass43_1;
		synchronized (this.aClass43_1) {
			local11.method574();
		}
		if (local11.aByteArray20 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray20));
			while (true) {
				if (local41 == this.aByteArray2.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray2, local41, this.aByteArray2.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray20 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray20[local93] = this.aByteArray2[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(BIIZ)V")
	public void method139(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aClient2.aClass25Array1[0] != null && this.anIntArrayArray10[arg2][arg1] != 0) {
				@Pc(25) byte[] local25 = this.aClient2.aClass25Array1[arg2 + 1].method318(arg1);
				if (!this.method143(local25, this.anIntArrayArray9[arg2][arg1], this.anIntArrayArray10[arg2][arg1])) {
					this.aByteArrayArray1[arg2][arg1] = arg0;
					if (arg0 > this.anInt146) {
						this.anInt146 = arg0;
					}
					this.anInt142++;
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("95916, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "c", descriptor = "()I")
	public int method140() {
		@Pc(2) Class43 local2 = this.aClass43_1;
		synchronized (this.aClass43_1) {
			return this.aClass43_1.method507();
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(II)V")
	public void method141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray10.length || arg1 < 0 || arg1 > this.anIntArrayArray10[arg0].length || this.anIntArrayArray10[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class43 local27 = this.aClass43_1;
		synchronized (this.aClass43_1) {
			@Pc(34) Class2_Sub1_Sub4 local34;
			for (local34 = (Class2_Sub1_Sub4) this.aClass43_1.method505(); local34 != null; local34 = (Class2_Sub1_Sub4) this.aClass43_1.method506()) {
				if (local34.anInt795 == arg0 && local34.anInt796 == arg1) {
					return;
				}
			}
			local34 = new Class2_Sub1_Sub4();
			local34.anInt795 = arg0;
			local34.anInt796 = arg1;
			local34.aBoolean176 = true;
			@Pc(71) Class29 local71 = this.aClass29_3;
			synchronized (this.aClass29_3) {
				this.aClass29_3.method352(local34);
			}
			this.aClass43_1.method503(local34);
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "b", descriptor = "(IB)Z")
	public boolean method142(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray64.length; local3++) {
				if (this.anIntArray63[local3] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("53570, " + arg0 + ", " + 70 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "([BIII)Z")
	private boolean method143(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(28) int local28 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg0, 0, local12);
			@Pc(48) int local48 = (int) this.aCRC32_1.getValue();
			if (local28 == arg2) {
				return local48 == arg1;
			} else {
				return false;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("31355, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(I)V")
	@Override
	public void method124(@OriginalArg(0) int arg0) {
		this.method141(0, arg0);
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean50) {
				this.anInt145++;
				@Pc(11) byte local11 = 20;
				if (this.anInt146 == 0 && this.aClient2.aClass25Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean49 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean49; local32++) {
					this.aBoolean49 = false;
					this.method144(this.anInt150);
					this.method133();
					if (this.anInt152 == 0 && local32 >= 5) {
						break;
					}
					this.method127();
					if (this.anInputStream1 != null) {
						this.method131();
					}
				}
				@Pc(68) boolean local68 = false;
				@Pc(73) Class2_Sub1_Sub4 local73;
				for (local73 = (Class2_Sub1_Sub4) this.aClass29_5.method355(); local73 != null; local73 = (Class2_Sub1_Sub4) this.aClass29_5.method357()) {
					if (local73.aBoolean176) {
						local68 = true;
						local73.anInt797++;
						if (local73.anInt797 > 50) {
							local73.anInt797 = 0;
							this.method132(local73);
						}
					}
				}
				if (!local68) {
					for (local73 = (Class2_Sub1_Sub4) this.aClass29_5.method355(); local73 != null; local73 = (Class2_Sub1_Sub4) this.aClass29_5.method357()) {
						local68 = true;
						local73.anInt797++;
						if (local73.anInt797 > 50) {
							local73.anInt797 = 0;
							this.method132(local73);
						}
					}
				}
				if (local68) {
					this.anInt144++;
					if (this.anInt144 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(158) Exception local158) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt156 = 0;
					}
				} else {
					this.anInt144 = 0;
					this.aString2 = "";
				}
				if (this.aClient2.aBoolean204 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt146 > 0 || this.aClient2.aClass25Array1[0] == null)) {
					this.anInt154++;
					if (this.anInt154 > 500) {
						this.anInt154 = 0;
						this.aByteArray4[0] = 0;
						this.aByteArray4[1] = 0;
						this.aByteArray4[2] = 0;
						this.aByteArray4[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray4, 0, 4);
						} catch (@Pc(239) IOException local239) {
							this.anInt144 = 5000;
						}
					}
				}
			}
		} catch (@Pc(248) Exception local248) {
			signlink.reporterror("od_ex " + local248.getMessage());
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "e", descriptor = "(I)V")
	private void method144(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) Class29 local4 = this.aClass29_3;
			@Pc(11) Class2_Sub1_Sub4 local11;
			synchronized (this.aClass29_3) {
				local11 = (Class2_Sub1_Sub4) this.aClass29_3.method354();
			}
			if (arg0 != 3148) {
				this.aBoolean51 = !this.aBoolean51;
			}
			while (local11 != null) {
				this.aBoolean49 = true;
				@Pc(35) byte[] local35 = null;
				if (this.aClient2.aClass25Array1[0] != null) {
					local35 = this.aClient2.aClass25Array1[local11.anInt795 + 1].method318(local11.anInt796);
				}
				if (!this.method143(local35, this.anIntArrayArray9[local11.anInt795][local11.anInt796], this.anIntArrayArray10[local11.anInt795][local11.anInt796])) {
					local35 = null;
				}
				@Pc(80) Class29 local80 = this.aClass29_3;
				synchronized (this.aClass29_3) {
					if (local35 == null) {
						this.aClass29_2.method352(local11);
					} else {
						local11.aByteArray20 = local35;
						@Pc(96) Class29 local96 = this.aClass29_4;
						synchronized (this.aClass29_4) {
							this.aClass29_4.method352(local11);
						}
					}
					local11 = (Class2_Sub1_Sub4) this.aClass29_3.method354();
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("8044, " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(B)I")
	public int method145(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			return this.anIntArray60.length;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("57408, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}
}
