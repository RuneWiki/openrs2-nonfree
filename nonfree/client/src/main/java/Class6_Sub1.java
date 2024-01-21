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

@OriginalClass("client!IBVXWOKK")
public final class Class6_Sub1 extends Class6 implements Runnable {

	@OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!IBVXWOKK", name = "b", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!IBVXWOKK", name = "c", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!IBVXWOKK", name = "h", descriptor = "I")
	public int anInt295;

	@OriginalMember(owner = "client!IBVXWOKK", name = "i", descriptor = "I")
	public int anInt296;

	@OriginalMember(owner = "client!IBVXWOKK", name = "l", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!IBVXWOKK", name = "m", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!IBVXWOKK", name = "q", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!IBVXWOKK", name = "r", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!IBVXWOKK", name = "u", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!IBVXWOKK", name = "v", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!IBVXWOKK", name = "x", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!IBVXWOKK", name = "y", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!IBVXWOKK", name = "z", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!IBVXWOKK", name = "A", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!IBVXWOKK", name = "C", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!IBVXWOKK", name = "D", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!IBVXWOKK", name = "E", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!IBVXWOKK", name = "G", descriptor = "Lclient!BYVCZVKG;")
	private Class3_Sub3_Sub1 aClass3_Sub3_Sub1_1;

	@OriginalMember(owner = "client!IBVXWOKK", name = "H", descriptor = "[I")
	private int[] anIntArray91;

	@OriginalMember(owner = "client!IBVXWOKK", name = "O", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!IBVXWOKK", name = "P", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!IBVXWOKK", name = "Q", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!IBVXWOKK", name = "R", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!IBVXWOKK", name = "d", descriptor = "Lclient!NYZQPNXB;")
	private Class26 aClass26_1 = new Class26(2);

	@OriginalMember(owner = "client!IBVXWOKK", name = "e", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[4][];

	@OriginalMember(owner = "client!IBVXWOKK", name = "f", descriptor = "Z")
	private boolean aBoolean68 = true;

	@OriginalMember(owner = "client!IBVXWOKK", name = "g", descriptor = "Lclient!NYZQPNXB;")
	private Class26 aClass26_2 = new Class26(2);

	@OriginalMember(owner = "client!IBVXWOKK", name = "j", descriptor = "Z")
	private boolean aBoolean69 = true;

	@OriginalMember(owner = "client!IBVXWOKK", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray10 = new int[4][];

	@OriginalMember(owner = "client!IBVXWOKK", name = "n", descriptor = "[B")
	private byte[] aByteArray11 = new byte[65000];

	@OriginalMember(owner = "client!IBVXWOKK", name = "o", descriptor = "Lclient!EZRJDJYN;")
	private Class10 aClass10_1 = new Class10(5);

	@OriginalMember(owner = "client!IBVXWOKK", name = "p", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!IBVXWOKK", name = "s", descriptor = "I")
	private int anInt299 = 34989;

	@OriginalMember(owner = "client!IBVXWOKK", name = "t", descriptor = "Lclient!NYZQPNXB;")
	private Class26 aClass26_3 = new Class26(2);

	@OriginalMember(owner = "client!IBVXWOKK", name = "w", descriptor = "Lclient!NYZQPNXB;")
	private Class26 aClass26_4 = new Class26(2);

	@OriginalMember(owner = "client!IBVXWOKK", name = "B", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!IBVXWOKK", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray11 = new int[4][];

	@OriginalMember(owner = "client!IBVXWOKK", name = "I", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!IBVXWOKK", name = "J", descriptor = "Z")
	private boolean aBoolean72 = true;

	@OriginalMember(owner = "client!IBVXWOKK", name = "K", descriptor = "Ljava/lang/String;")
	public String aString4 = "";

	@OriginalMember(owner = "client!IBVXWOKK", name = "L", descriptor = "I")
	private int anInt303 = -424;

	@OriginalMember(owner = "client!IBVXWOKK", name = "M", descriptor = "[B")
	private byte[] aByteArray12 = new byte[500];

	@OriginalMember(owner = "client!IBVXWOKK", name = "N", descriptor = "I")
	private int anInt304 = -39;

	@OriginalMember(owner = "client!IBVXWOKK", name = "S", descriptor = "Lclient!NYZQPNXB;")
	private Class26 aClass26_5 = new Class26(2);

	@OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(ZI)Z")
	public boolean method158(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray88.length; local12++) {
				if (this.anIntArray89[local12] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("61545, " + true + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(IIII)I")
	public int method159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(12) int local12 = (arg0 << 8) + arg1;
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray88.length; local14++) {
				if (this.anIntArray88[local14] == local12) {
					if (arg2 == 0) {
						return this.anIntArray90[local14];
					}
					return this.anIntArray89[local14];
				}
			}
			return -1;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("79872, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(IZ)V")
	public void method160(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray88.length;
			for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
				if (arg0 || this.anIntArray87[local9] != 0) {
					this.method166(3, this.anIntArray89[local9], (byte) 2);
					this.method166(3, this.anIntArray90[local9], (byte) 2);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("4031, " + -27395 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(BII[B)Z")
	private boolean method161(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null || arg2.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg2.length - 2;
			@Pc(28) int local28 = ((arg2[local12] & 0xFF) << 8) + (arg2[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg2, 0, local12);
			@Pc(48) int local48 = (int) this.aCRC32_1.getValue();
			if (local28 == arg0) {
				return local48 == arg1;
			} else {
				return false;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("17013, " + -23 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(III)V")
	public void method162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient2.aClass20Array1[0] != null && (this.anIntArrayArray10[arg0][arg1] != 0 && (this.aByteArrayArray2[arg0][arg1] != 0 && this.anInt302 != 0))) {
				@Pc(30) Class3_Sub3_Sub1 local30 = new Class3_Sub3_Sub1();
				local30.anInt101 = arg0;
				local30.anInt100 = arg1;
				local30.aBoolean23 = false;
				@Pc(42) Class26 local42 = this.aClass26_1;
				synchronized (this.aClass26_1) {
					this.aClass26_1.method221(local30);
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("89418, " + -951 + ", " + arg0 + ", " + arg1 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "b", descriptor = "(I)I")
	public int method163(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				this.aBoolean71 = !this.aBoolean71;
			}
			return this.anIntArray92.length;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("18035, " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "c", descriptor = "(I)V")
	private void method164() {
		try {
			this.anInt305 = 0;
			this.anInt306 = 0;
			@Pc(12) Class3_Sub3_Sub1 local12;
			for (local12 = (Class3_Sub3_Sub1) this.aClass26_2.method224(); local12 != null; local12 = (Class3_Sub3_Sub1) this.aClass26_2.method226()) {
				if (local12.aBoolean23) {
					this.anInt305++;
				} else {
					this.anInt306++;
				}
			}
			while (this.anInt305 < 10) {
				local12 = (Class3_Sub3_Sub1) this.aClass26_4.method223();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray2[local12.anInt101][local12.anInt100] != 0) {
					this.anInt294++;
				}
				this.aByteArrayArray2[local12.anInt101][local12.anInt100] = 0;
				this.aClass26_2.method221(local12);
				this.anInt305++;
				this.method171(local12);
				this.aBoolean70 = true;
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("58063, " + 8 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "()Lclient!BYVCZVKG;")
	public Class3_Sub3_Sub1 method165() {
		@Pc(4) Class26 local4 = this.aClass26_3;
		@Pc(11) Class3_Sub3_Sub1 local11;
		synchronized (this.aClass26_3) {
			local11 = (Class3_Sub3_Sub1) this.aClass26_3.method223();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class10 local24 = this.aClass10_1;
		synchronized (this.aClass10_1) {
			local11.method546();
		}
		if (local11.aByteArray2 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray2));
			while (true) {
				if (local41 == this.aByteArray11.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray11, local41, this.aByteArray11.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray2 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray2[local93] = this.aByteArray11[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(IIIB)V")
	public void method166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		try {
			if (this.aClient2.aClass20Array1[0] != null && this.anIntArrayArray10[arg0][arg1] != 0) {
				@Pc(25) byte[] local25 = this.aClient2.aClass20Array1[arg0 + 1].method182(arg1);
				if (!this.method161(this.anIntArrayArray10[arg0][arg1], this.anIntArrayArray11[arg0][arg1], local25)) {
					this.aByteArrayArray2[arg0][arg1] = arg2;
					if (arg2 > this.anInt302) {
						this.anInt302 = arg2;
					}
					this.anInt297++;
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("646, " + -424 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "d", descriptor = "(I)V")
	public void method167(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class26 local2 = this.aClass26_1;
			synchronized (this.aClass26_1) {
				this.aClass26_1.method228();
			}
			@Pc(17) boolean local17 = false;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("48789, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "b", descriptor = "()V")
	public void method168() {
		this.aBoolean72 = false;
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "b", descriptor = "(ZI)I")
	public int method169(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray10[arg0] & 0xFF;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("34626, " + true + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "e", descriptor = "(I)V")
	private void method170(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 34989) {
				this.anInt303 = 146;
			}
			while (this.anInt305 == 0) {
				if (this.anInt306 >= 10 || this.anInt302 == 0) {
					return;
				}
				@Pc(15) Class26 local15 = this.aClass26_1;
				@Pc(22) Class3_Sub3_Sub1 local22;
				synchronized (this.aClass26_1) {
					local22 = (Class3_Sub3_Sub1) this.aClass26_1.method223();
				}
				while (local22 != null) {
					if (this.aByteArrayArray2[local22.anInt101][local22.anInt100] != 0) {
						this.aByteArrayArray2[local22.anInt101][local22.anInt100] = 0;
						this.aClass26_2.method221(local22);
						this.method171(local22);
						this.aBoolean70 = true;
						if (this.anInt294 < this.anInt297) {
							this.anInt294++;
						}
						this.aString4 = "Loading extra files - " + this.anInt294 * 100 / this.anInt297 + "%";
						this.anInt306++;
						if (this.anInt306 == 10) {
							return;
						}
					}
					local15 = this.aClass26_1;
					synchronized (this.aClass26_1) {
						local22 = (Class3_Sub3_Sub1) this.aClass26_1.method223();
					}
				}
				for (@Pc(116) int local116 = 0; local116 < 4; local116++) {
					@Pc(123) byte[] local123 = this.aByteArrayArray2[local116];
					@Pc(126) int local126 = local123.length;
					for (@Pc(128) int local128 = 0; local128 < local126; local128++) {
						if (local123[local128] == this.anInt302) {
							local123[local128] = 0;
							local22 = new Class3_Sub3_Sub1();
							local22.anInt101 = local116;
							local22.anInt100 = local128;
							local22.aBoolean23 = false;
							this.aClass26_2.method221(local22);
							this.method171(local22);
							this.aBoolean70 = true;
							if (this.anInt294 < this.anInt297) {
								this.anInt294++;
							}
							this.aString4 = "Loading extra files - " + this.anInt294 * 100 / this.anInt297 + "%";
							this.anInt306++;
							if (this.anInt306 == 10) {
								return;
							}
						}
					}
				}
				this.anInt302--;
			}
		} catch (@Pc(226) RuntimeException local226) {
			signlink.reporterror("9661, " + arg0 + ", " + local226.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(Lclient!BYVCZVKG;Z)V")
	private void method171(@OriginalArg(0) Class3_Sub3_Sub1 arg0) {
		try {
			try {
				if (this.aSocket1 == null) {
					@Pc(15) long local15 = System.currentTimeMillis();
					if (local15 - this.aLong12 < 4000L) {
						return;
					}
					this.aLong12 = local15;
					this.aSocket1 = this.aClient2.method686(client.anInt933 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(50) int local50 = 0; local50 < 8; local50++) {
						this.anInputStream1.read();
					}
					this.anInt293 = 0;
				}
				this.aByteArray12[0] = (byte) arg0.anInt101;
				this.aByteArray12[1] = (byte) (arg0.anInt100 >> 8);
				this.aByteArray12[2] = (byte) arg0.anInt100;
				if (arg0.aBoolean23) {
					this.aByteArray12[3] = 2;
				} else if (this.aClient2.aBoolean241) {
					this.aByteArray12[3] = 0;
				} else {
					this.aByteArray12[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray12, 0, 4);
				this.anInt298 = 0;
				this.anInt296 = -10000;
			} catch (@Pc(127) IOException local127) {
				try {
					this.aSocket1.close();
				} catch (@Pc(132) Exception local132) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt301 = 0;
				this.anInt296++;
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("11457, " + arg0 + ", " + true + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(Z)V")
	private void method172(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			@Pc(13) Class26 local13 = this.aClass26_5;
			@Pc(20) Class3_Sub3_Sub1 local20;
			synchronized (this.aClass26_5) {
				local20 = (Class3_Sub3_Sub1) this.aClass26_5.method223();
			}
			while (local20 != null) {
				this.aBoolean70 = true;
				@Pc(31) byte[] local31 = null;
				if (this.aClient2.aClass20Array1[0] != null) {
					local31 = this.aClient2.aClass20Array1[local20.anInt101 + 1].method182(local20.anInt100);
				}
				if (!this.method161(this.anIntArrayArray10[local20.anInt101][local20.anInt100], this.anIntArrayArray11[local20.anInt101][local20.anInt100], local31)) {
					local31 = null;
				}
				@Pc(76) Class26 local76 = this.aClass26_5;
				synchronized (this.aClass26_5) {
					if (local31 == null) {
						this.aClass26_4.method221(local20);
					} else {
						local20.aByteArray2 = local31;
						@Pc(92) Class26 local92 = this.aClass26_3;
						synchronized (this.aClass26_3) {
							this.aClass26_3.method221(local20);
						}
					}
					local20 = (Class3_Sub3_Sub1) this.aClass26_5.method223();
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("15562, " + arg0 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "c", descriptor = "()I")
	public int method173() {
		@Pc(2) Class10 local2 = this.aClass10_1;
		synchronized (this.aClass10_1) {
			return this.aClass10_1.method71();
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(II)V")
	public void method174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray10.length || arg1 < 0 || arg1 > this.anIntArrayArray10[arg0].length || this.anIntArrayArray10[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class10 local27 = this.aClass10_1;
		synchronized (this.aClass10_1) {
			@Pc(34) Class3_Sub3_Sub1 local34;
			for (local34 = (Class3_Sub3_Sub1) this.aClass10_1.method69(); local34 != null; local34 = (Class3_Sub3_Sub1) this.aClass10_1.method70(954)) {
				if (local34.anInt101 == arg0 && local34.anInt100 == arg1) {
					return;
				}
			}
			local34 = new Class3_Sub3_Sub1();
			local34.anInt101 = arg0;
			local34.anInt100 = arg1;
			local34.aBoolean23 = true;
			@Pc(71) Class26 local71 = this.aClass26_5;
			synchronized (this.aClass26_5) {
				this.aClass26_5.method221(local34);
			}
			this.aClass10_1.method67(local34);
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(BI)I")
	public int method175(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray10[arg0].length;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("87794, " + 4 + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "b", descriptor = "(Z)V")
	private void method176() {
		try {
			try {
				@Pc(14) int local14 = this.anInputStream1.available();
				@Pc(49) int local49;
				@Pc(65) int local65;
				if (this.anInt301 == 0 && local14 >= 6) {
					this.aBoolean70 = true;
					for (@Pc(25) int local25 = 0; local25 < 6; local25 += this.anInputStream1.read(this.aByteArray12, local25, 6 - local25)) {
					}
					local49 = this.aByteArray12[0] & 0xFF;
					local65 = ((this.aByteArray12[1] & 0xFF) << 8) + (this.aByteArray12[2] & 0xFF);
					@Pc(81) int local81 = ((this.aByteArray12[3] & 0xFF) << 8) + (this.aByteArray12[4] & 0xFF);
					@Pc(88) int local88 = this.aByteArray12[5] & 0xFF;
					this.aClass3_Sub3_Sub1_1 = null;
					for (@Pc(96) Class3_Sub3_Sub1 local96 = (Class3_Sub3_Sub1) this.aClass26_2.method224(); local96 != null; local96 = (Class3_Sub3_Sub1) this.aClass26_2.method226()) {
						if (local96.anInt101 == local49 && local96.anInt100 == local65) {
							this.aClass3_Sub3_Sub1_1 = local96;
						}
						if (this.aClass3_Sub3_Sub1_1 != null) {
							local96.anInt102 = 0;
						}
					}
					if (this.aClass3_Sub3_Sub1_1 != null) {
						this.anInt293 = 0;
						if (local81 == 0) {
							signlink.reporterror("Rej: " + local49 + "," + local65);
							this.aClass3_Sub3_Sub1_1.aByteArray2 = null;
							if (this.aClass3_Sub3_Sub1_1.aBoolean23) {
								@Pc(154) Class26 local154 = this.aClass26_3;
								synchronized (this.aClass26_3) {
									this.aClass26_3.method221(this.aClass3_Sub3_Sub1_1);
								}
							} else {
								this.aClass3_Sub3_Sub1_1.method545();
							}
							this.aClass3_Sub3_Sub1_1 = null;
						} else {
							if (this.aClass3_Sub3_Sub1_1.aByteArray2 == null && local88 == 0) {
								this.aClass3_Sub3_Sub1_1.aByteArray2 = new byte[local81];
							}
							if (this.aClass3_Sub3_Sub1_1.aByteArray2 == null && local88 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt300 = local88 * 500;
					this.anInt301 = 500;
					if (this.anInt301 > local81 - local88 * 500) {
						this.anInt301 = local81 - local88 * 500;
					}
				}
				if (this.anInt301 > 0 && local14 >= this.anInt301) {
					this.aBoolean70 = true;
					@Pc(233) byte[] local233 = this.aByteArray12;
					local49 = 0;
					if (this.aClass3_Sub3_Sub1_1 != null) {
						local233 = this.aClass3_Sub3_Sub1_1.aByteArray2;
						local49 = this.anInt300;
					}
					for (local65 = 0; local65 < this.anInt301; local65 += this.anInputStream1.read(local233, local65 + local49, this.anInt301 - local65)) {
					}
					if (this.anInt301 + this.anInt300 >= local233.length && this.aClass3_Sub3_Sub1_1 != null) {
						if (this.aClient2.aClass20Array1[0] != null) {
							this.aClient2.aClass20Array1[this.aClass3_Sub3_Sub1_1.anInt101 + 1].method183(this.aClass3_Sub3_Sub1_1.anInt100, 697, local233.length, local233);
						}
						if (!this.aClass3_Sub3_Sub1_1.aBoolean23 && this.aClass3_Sub3_Sub1_1.anInt101 == 3) {
							this.aClass3_Sub3_Sub1_1.aBoolean23 = true;
							this.aClass3_Sub3_Sub1_1.anInt101 = 93;
						}
						if (this.aClass3_Sub3_Sub1_1.aBoolean23) {
							@Pc(326) Class26 local326 = this.aClass26_3;
							synchronized (this.aClass26_3) {
								this.aClass26_3.method221(this.aClass3_Sub3_Sub1_1);
							}
						} else {
							this.aClass3_Sub3_Sub1_1.method545();
						}
					}
					this.anInt301 = 0;
				}
			} catch (@Pc(347) IOException local347) {
				try {
					this.aSocket1.close();
				} catch (@Pc(352) Exception local352) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt301 = 0;
			}
		} catch (@Pc(366) RuntimeException local366) {
			signlink.reporterror("51022, " + false + ", " + local366.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(Lclient!LKPVZAQN;Lclient!client;)V")
	public void method177(@OriginalArg(0) Class22 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method207(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class3_Sub3_Sub4 local42 = new Class3_Sub3_Sub4((byte) -115, local31);
			this.anIntArrayArray10[local22] = new int[local36];
			this.aByteArrayArray2[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray10[local22][local56] = local42.method470();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method207(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class3_Sub3_Sub4 local115 = new Class3_Sub3_Sub4((byte) -115, local104);
			this.anIntArrayArray11[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray11[local36][local123] = local115.method473();
			}
		}
		local104 = arg0.method207("model_index", null);
		local56 = this.anIntArrayArray10[0].length;
		this.aByteArray10 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray10[local158] = local104[local158];
			} else {
				this.aByteArray10[local158] = 0;
			}
		}
		local104 = arg0.method207("map_index", null);
		@Pc(193) Class3_Sub3_Sub4 local193 = new Class3_Sub3_Sub4((byte) -115, local104);
		local56 = local104.length / 7;
		this.anIntArray88 = new int[local56];
		this.anIntArray90 = new int[local56];
		this.anIntArray89 = new int[local56];
		this.anIntArray87 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray88[local216] = local193.method470();
			this.anIntArray90[local216] = local193.method470();
			this.anIntArray89[local216] = local193.method470();
			this.anIntArray87[local216] = local193.method468();
		}
		local104 = arg0.method207("anim_index", null);
		local193 = new Class3_Sub3_Sub4((byte) -115, local104);
		local56 = local104.length / 2;
		this.anIntArray92 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray92[local268] = local193.method470();
		}
		local104 = arg0.method207("midi_index", null);
		local193 = new Class3_Sub3_Sub4((byte) -115, local104);
		local56 = local104.length;
		this.anIntArray91 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray91[local300] = local193.method468();
		}
		this.aClient2 = arg1;
		this.aBoolean72 = true;
		this.aClient2.method586(this, 2);
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean72) {
				this.anInt295++;
				@Pc(11) byte local11 = 20;
				if (this.anInt302 == 0 && this.aClient2.aClass20Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean70 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean70; local32++) {
					this.aBoolean70 = false;
					this.method172(this.aBoolean68);
					this.method164();
					if (this.anInt305 == 0 && local32 >= 5) {
						break;
					}
					this.method170(this.anInt299);
					if (this.anInputStream1 != null) {
						this.method176();
					}
				}
				@Pc(69) boolean local69 = false;
				@Pc(74) Class3_Sub3_Sub1 local74;
				for (local74 = (Class3_Sub3_Sub1) this.aClass26_2.method224(); local74 != null; local74 = (Class3_Sub3_Sub1) this.aClass26_2.method226()) {
					if (local74.aBoolean23) {
						local69 = true;
						local74.anInt102++;
						if (local74.anInt102 > 50) {
							local74.anInt102 = 0;
							this.method171(local74);
						}
					}
				}
				if (!local69) {
					for (local74 = (Class3_Sub3_Sub1) this.aClass26_2.method224(); local74 != null; local74 = (Class3_Sub3_Sub1) this.aClass26_2.method226()) {
						local69 = true;
						local74.anInt102++;
						if (local74.anInt102 > 50) {
							local74.anInt102 = 0;
							this.method171(local74);
						}
					}
				}
				if (local69) {
					this.anInt293++;
					if (this.anInt293 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(159) Exception local159) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt301 = 0;
					}
				} else {
					this.anInt293 = 0;
					this.aString4 = "";
				}
				if (this.aClient2.aBoolean241 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt302 > 0 || this.aClient2.aClass20Array1[0] == null)) {
					this.anInt298++;
					if (this.anInt298 > 500) {
						this.anInt298 = 0;
						this.aByteArray12[0] = 0;
						this.aByteArray12[1] = 0;
						this.aByteArray12[2] = 0;
						this.aByteArray12[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray12, 0, 4);
						} catch (@Pc(240) IOException local240) {
							this.anInt293 = 5000;
						}
					}
				}
			}
		} catch (@Pc(249) Exception local249) {
			signlink.reporterror("od_ex " + local249.getMessage());
		}
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(I)V")
	@Override
	public void method157(@OriginalArg(0) int arg0) {
		this.method174(0, arg0);
	}

	@OriginalMember(owner = "client!IBVXWOKK", name = "b", descriptor = "(II)Z")
	public boolean method178(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray91[arg0] == 1;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("34815, " + arg0 + ", " + 3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
