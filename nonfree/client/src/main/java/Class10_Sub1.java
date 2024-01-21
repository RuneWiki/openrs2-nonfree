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

@OriginalClass("client!DHNAQSHE")
public final class Class10_Sub1 extends Class10 implements Runnable {

	@OriginalMember(owner = "client!DHNAQSHE", name = "b", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!DHNAQSHE", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!DHNAQSHE", name = "e", descriptor = "Lclient!SGKWAMJX;")
	private Class4_Sub1_Sub4 aClass4_Sub1_Sub4_1;

	@OriginalMember(owner = "client!DHNAQSHE", name = "g", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!DHNAQSHE", name = "h", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!DHNAQSHE", name = "i", descriptor = "I")
	private int anInt209;

	@OriginalMember(owner = "client!DHNAQSHE", name = "j", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!DHNAQSHE", name = "m", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!DHNAQSHE", name = "n", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!DHNAQSHE", name = "o", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!DHNAQSHE", name = "p", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!DHNAQSHE", name = "q", descriptor = "I")
	private int anInt214;

	@OriginalMember(owner = "client!DHNAQSHE", name = "r", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!DHNAQSHE", name = "u", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!DHNAQSHE", name = "x", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!DHNAQSHE", name = "A", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!DHNAQSHE", name = "C", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!DHNAQSHE", name = "D", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!DHNAQSHE", name = "I", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!DHNAQSHE", name = "J", descriptor = "I")
	public int anInt223;

	@OriginalMember(owner = "client!DHNAQSHE", name = "L", descriptor = "[I")
	private int[] anIntArray30;

	@OriginalMember(owner = "client!DHNAQSHE", name = "M", descriptor = "[I")
	private int[] anIntArray31;

	@OriginalMember(owner = "client!DHNAQSHE", name = "O", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!DHNAQSHE", name = "S", descriptor = "I")
	public int anInt225;

	@OriginalMember(owner = "client!DHNAQSHE", name = "T", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!DHNAQSHE", name = "U", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!DHNAQSHE", name = "V", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!DHNAQSHE", name = "d", descriptor = "[B")
	private byte[] aByteArray3 = new byte[65000];

	@OriginalMember(owner = "client!DHNAQSHE", name = "f", descriptor = "Z")
	private boolean aBoolean51 = true;

	@OriginalMember(owner = "client!DHNAQSHE", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray2 = new int[4][];

	@OriginalMember(owner = "client!DHNAQSHE", name = "l", descriptor = "I")
	private int anInt211 = 691;

	@OriginalMember(owner = "client!DHNAQSHE", name = "s", descriptor = "Ljava/lang/String;")
	public String aString4 = "";

	@OriginalMember(owner = "client!DHNAQSHE", name = "t", descriptor = "I")
	private int anInt215 = 64;

	@OriginalMember(owner = "client!DHNAQSHE", name = "v", descriptor = "Lclient!JQSVNFRT;")
	private Class23 aClass23_1 = new Class23(0);

	@OriginalMember(owner = "client!DHNAQSHE", name = "w", descriptor = "Lclient!JQSVNFRT;")
	private Class23 aClass23_2 = new Class23(0);

	@OriginalMember(owner = "client!DHNAQSHE", name = "y", descriptor = "Lclient!JQSVNFRT;")
	private Class23 aClass23_3 = new Class23(0);

	@OriginalMember(owner = "client!DHNAQSHE", name = "z", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!DHNAQSHE", name = "B", descriptor = "Lclient!JQSVNFRT;")
	private Class23 aClass23_4 = new Class23(0);

	@OriginalMember(owner = "client!DHNAQSHE", name = "E", descriptor = "Z")
	private boolean aBoolean53 = true;

	@OriginalMember(owner = "client!DHNAQSHE", name = "F", descriptor = "I")
	private int anInt220 = 16247;

	@OriginalMember(owner = "client!DHNAQSHE", name = "G", descriptor = "[B")
	private byte[] aByteArray5 = new byte[500];

	@OriginalMember(owner = "client!DHNAQSHE", name = "H", descriptor = "I")
	private int anInt221 = 258;

	@OriginalMember(owner = "client!DHNAQSHE", name = "K", descriptor = "I")
	private int anInt224 = 1;

	@OriginalMember(owner = "client!DHNAQSHE", name = "N", descriptor = "B")
	private byte aByte7 = 9;

	@OriginalMember(owner = "client!DHNAQSHE", name = "P", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!DHNAQSHE", name = "Q", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[4][];

	@OriginalMember(owner = "client!DHNAQSHE", name = "R", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!DHNAQSHE", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[4][];

	@OriginalMember(owner = "client!DHNAQSHE", name = "X", descriptor = "Lclient!FEBLELGD;")
	private Class13 aClass13_2 = new Class13((byte) 3);

	@OriginalMember(owner = "client!DHNAQSHE", name = "Y", descriptor = "Lclient!JQSVNFRT;")
	private Class23 aClass23_5 = new Class23(0);

	@OriginalMember(owner = "client!DHNAQSHE", name = "a", descriptor = "()Lclient!SGKWAMJX;")
	public Class4_Sub1_Sub4 method128() {
		@Pc(4) Class23 local4 = this.aClass23_1;
		@Pc(11) Class4_Sub1_Sub4 local11;
		synchronized (this.aClass23_1) {
			local11 = (Class4_Sub1_Sub4) this.aClass23_1.method314();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class13 local24 = this.aClass13_2;
		synchronized (this.aClass13_2) {
			local11.method529();
		}
		if (local11.aByteArray17 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray17));
			while (true) {
				if (local41 == this.aByteArray3.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray3, local41, this.aByteArray3.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray17 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray17[local93] = this.aByteArray3[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "b", descriptor = "(I)I")
	public int method129() {
		try {
			if (this.anInt224 != 1) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			return this.anIntArray31.length;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("9020, " + 1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "a", descriptor = "(II)Z")
	public boolean method130(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray26[arg0] == 1;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("65858, " + 0 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "a", descriptor = "(I[BIZ)Z")
	private boolean method131(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 == null || arg1.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg1.length - 2;
			@Pc(28) int local28 = ((arg1[local12] & 0xFF) << 8) + (arg1[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg1, 0, local12);
			@Pc(42) int local42 = (int) this.aCRC32_1.getValue();
			if (local28 == arg0) {
				return local42 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("44010, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "a", descriptor = "(BIII)I")
	public int method132(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = (arg3 << 8) + arg2;
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray27.length; local9++) {
				if (this.anIntArray27[local9] == local7) {
					if (arg1 == 0) {
						return this.anIntArray30[local9];
					}
					return this.anIntArray28[local9];
				}
			}
			@Pc(40) boolean local40 = false;
			return -1;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("927, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "b", descriptor = "(II)V")
	public void method133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray3.length || arg1 < 0 || arg1 > this.anIntArrayArray3[arg0].length || this.anIntArrayArray3[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class13 local27 = this.aClass13_2;
		synchronized (this.aClass13_2) {
			@Pc(34) Class4_Sub1_Sub4 local34;
			for (local34 = (Class4_Sub1_Sub4) this.aClass13_2.method214(); local34 != null; local34 = (Class4_Sub1_Sub4) this.aClass13_2.method215()) {
				if (local34.anInt711 == arg0 && local34.anInt712 == arg1) {
					return;
				}
			}
			local34 = new Class4_Sub1_Sub4();
			local34.anInt711 = arg0;
			local34.anInt712 = arg1;
			local34.aBoolean191 = true;
			@Pc(71) Class23 local71 = this.aClass23_4;
			synchronized (this.aClass23_4) {
				this.aClass23_4.method312(local34);
			}
			this.aClass13_2.method212(local34);
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "a", descriptor = "(I)V")
	@Override
	public void method127(@OriginalArg(0) int arg0) {
		this.method133(0, arg0);
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "a", descriptor = "(Lclient!TKEGJSFV;Lclient!client;)V")
	public void method134(@OriginalArg(0) Class38 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method514(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class4_Sub1_Sub3 local42 = new Class4_Sub1_Sub3(local31, false);
			this.anIntArrayArray3[local22] = new int[local36];
			this.aByteArrayArray1[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray3[local22][local56] = local42.method169();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method514(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class4_Sub1_Sub3 local115 = new Class4_Sub1_Sub3(local104, false);
			this.anIntArrayArray2[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray2[local36][local123] = local115.method172();
			}
		}
		local104 = arg0.method514("model_index", null);
		local56 = this.anIntArrayArray3[0].length;
		this.aByteArray4 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray4[local158] = local104[local158];
			} else {
				this.aByteArray4[local158] = 0;
			}
		}
		local104 = arg0.method514("map_index", null);
		@Pc(193) Class4_Sub1_Sub3 local193 = new Class4_Sub1_Sub3(local104, false);
		local56 = local104.length / 7;
		this.anIntArray27 = new int[local56];
		this.anIntArray30 = new int[local56];
		this.anIntArray28 = new int[local56];
		this.anIntArray29 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray27[local216] = local193.method169();
			this.anIntArray30[local216] = local193.method169();
			this.anIntArray28[local216] = local193.method169();
			this.anIntArray29[local216] = local193.method167();
		}
		local104 = arg0.method514("anim_index", null);
		local193 = new Class4_Sub1_Sub3(local104, false);
		local56 = local104.length / 2;
		this.anIntArray31 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray31[local268] = local193.method169();
		}
		local104 = arg0.method514("midi_index", null);
		local193 = new Class4_Sub1_Sub3(local104, false);
		local56 = local104.length;
		this.anIntArray26 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray26[local300] = local193.method167();
		}
		this.aClient2 = arg1;
		this.aBoolean53 = true;
		this.aClient2.method584(this, 2);
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "a", descriptor = "(IIIB)V")
	public void method135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(3) int local3 = 15 / arg2;
			if (this.aClient2.aClass11Array1[0] != null && this.anIntArrayArray3[arg0][arg1] != 0) {
				@Pc(29) byte[] local29 = this.aClient2.aClass11Array1[arg0 + 1].method149(arg1);
				if (!this.method131(this.anIntArrayArray3[arg0][arg1], local29, this.anIntArrayArray2[arg0][arg1])) {
					this.aByteArrayArray1[arg0][arg1] = arg3;
					if (arg3 > this.anInt226) {
						this.anInt226 = arg3;
					}
					this.anInt216++;
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("75547, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "c", descriptor = "(II)I")
	public int method136(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray4[arg0] & 0xFF;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("27331, " + 3 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "b", descriptor = "()I")
	public int method137() {
		@Pc(2) Class13 local2 = this.aClass13_2;
		synchronized (this.aClass13_2) {
			return this.aClass13_2.method216();
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "a", descriptor = "(IIZ)V")
	public void method138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.aClient2.aClass11Array1[0] != null && (this.anIntArrayArray3[arg0][arg1] != 0 && (this.aByteArrayArray1[arg0][arg1] != 0 && this.anInt226 != 0))) {
				@Pc(30) Class4_Sub1_Sub4 local30 = new Class4_Sub1_Sub4();
				local30.anInt711 = arg0;
				local30.anInt712 = arg1;
				local30.aBoolean191 = false;
				@Pc(42) Class23 local42 = this.aClass23_5;
				synchronized (this.aClass23_5) {
					this.aClass23_5.method312(local30);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("46202, " + arg0 + ", " + arg1 + ", " + false + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "a", descriptor = "(Lclient!SGKWAMJX;I)V")
	private void method139(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 16247) {
				this.anInt218 = 41;
			}
			try {
				if (this.aSocket1 == null) {
					@Pc(12) long local12 = System.currentTimeMillis();
					if (local12 - this.aLong9 < 4000L) {
						return;
					}
					this.aLong9 = local12;
					this.aSocket1 = this.aClient2.method602(client.anInt856 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(47) int local47 = 0; local47 < 8; local47++) {
						this.anInputStream1.read();
					}
					this.anInt212 = 0;
				}
				this.aByteArray5[0] = (byte) arg0.anInt711;
				this.aByteArray5[1] = (byte) (arg0.anInt712 >> 8);
				this.aByteArray5[2] = (byte) arg0.anInt712;
				if (arg0.aBoolean191) {
					this.aByteArray5[3] = 2;
				} else if (this.aClient2.aBoolean272) {
					this.aByteArray5[3] = 0;
				} else {
					this.aByteArray5[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray5, 0, 4);
				this.anInt219 = 0;
				this.anInt223 = -10000;
			} catch (@Pc(124) IOException local124) {
				try {
					this.aSocket1.close();
				} catch (@Pc(129) Exception local129) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt214 = 0;
				this.anInt223++;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("40550, " + arg0 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "d", descriptor = "(II)Z")
	public boolean method140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray27.length; local1++) {
				if (this.anIntArray28[local1] == arg1) {
					return true;
				}
			}
			@Pc(21) boolean local21 = false;
			return false;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("83284, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "a", descriptor = "(Z)V")
	public void method141() {
		try {
			@Pc(5) Class23 local5 = this.aClass23_5;
			synchronized (this.aClass23_5) {
				this.aClass23_5.method319();
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("86174, " + true + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "c", descriptor = "(I)V")
	private void method142(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.aBoolean51 = !this.aBoolean51;
			}
			@Pc(12) Class23 local12 = this.aClass23_4;
			@Pc(19) Class4_Sub1_Sub4 local19;
			synchronized (this.aClass23_4) {
				local19 = (Class4_Sub1_Sub4) this.aClass23_4.method314();
			}
			while (local19 != null) {
				this.aBoolean52 = true;
				@Pc(30) byte[] local30 = null;
				if (this.aClient2.aClass11Array1[0] != null) {
					local30 = this.aClient2.aClass11Array1[local19.anInt711 + 1].method149(local19.anInt712);
				}
				if (!this.method131(this.anIntArrayArray3[local19.anInt711][local19.anInt712], local30, this.anIntArrayArray2[local19.anInt711][local19.anInt712])) {
					local30 = null;
				}
				@Pc(75) Class23 local75 = this.aClass23_4;
				synchronized (this.aClass23_4) {
					if (local30 == null) {
						this.aClass23_2.method312(local19);
					} else {
						local19.aByteArray17 = local30;
						@Pc(91) Class23 local91 = this.aClass23_1;
						synchronized (this.aClass23_1) {
							this.aClass23_1.method312(local19);
						}
					}
					local19 = (Class4_Sub1_Sub4) this.aClass23_4.method314();
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("76294, " + arg0 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "e", descriptor = "(II)I")
	public int method143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			return arg0 <= 0 ? this.anInt218 : this.anIntArrayArray3[arg1].length;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("10133, " + arg0 + ", " + arg1 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean53) {
				this.anInt225++;
				@Pc(11) byte local11 = 20;
				if (this.anInt226 == 0 && this.aClient2.aClass11Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean52 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean52; local32++) {
					this.aBoolean52 = false;
					this.method142(this.anInt222);
					this.method146();
					if (this.anInt209 == 0 && local32 >= 5) {
						break;
					}
					this.method144();
					if (this.anInputStream1 != null) {
						this.method148();
					}
				}
				@Pc(68) boolean local68 = false;
				@Pc(73) Class4_Sub1_Sub4 local73;
				for (local73 = (Class4_Sub1_Sub4) this.aClass23_3.method315(); local73 != null; local73 = (Class4_Sub1_Sub4) this.aClass23_3.method317()) {
					if (local73.aBoolean191) {
						local68 = true;
						local73.anInt710++;
						if (local73.anInt710 > 50) {
							local73.anInt710 = 0;
							this.method139(local73, this.anInt220);
						}
					}
				}
				if (!local68) {
					for (local73 = (Class4_Sub1_Sub4) this.aClass23_3.method315(); local73 != null; local73 = (Class4_Sub1_Sub4) this.aClass23_3.method317()) {
						local68 = true;
						local73.anInt710++;
						if (local73.anInt710 > 50) {
							local73.anInt710 = 0;
							this.method139(local73, this.anInt220);
						}
					}
				}
				if (local68) {
					this.anInt212++;
					if (this.anInt212 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(160) Exception local160) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt214 = 0;
					}
				} else {
					this.anInt212 = 0;
					this.aString4 = "";
				}
				if (this.aClient2.aBoolean272 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt226 > 0 || this.aClient2.aClass11Array1[0] == null)) {
					this.anInt219++;
					if (this.anInt219 > 500) {
						this.anInt219 = 0;
						this.aByteArray5[0] = 0;
						this.aByteArray5[1] = 0;
						this.aByteArray5[2] = 0;
						this.aByteArray5[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray5, 0, 4);
						} catch (@Pc(241) IOException local241) {
							this.anInt212 = 5000;
						}
					}
				}
			}
		} catch (@Pc(250) Exception local250) {
			signlink.reporterror("od_ex " + local250.getMessage());
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "b", descriptor = "(Z)V")
	private void method144() {
		try {
			while (this.anInt209 == 0) {
				if (this.anInt210 >= 10 || this.anInt226 == 0) {
					return;
				}
				@Pc(18) Class23 local18 = this.aClass23_5;
				@Pc(25) Class4_Sub1_Sub4 local25;
				synchronized (this.aClass23_5) {
					local25 = (Class4_Sub1_Sub4) this.aClass23_5.method314();
				}
				while (local25 != null) {
					if (this.aByteArrayArray1[local25.anInt711][local25.anInt712] != 0) {
						this.aByteArrayArray1[local25.anInt711][local25.anInt712] = 0;
						this.aClass23_3.method312(local25);
						this.method139(local25, this.anInt220);
						this.aBoolean52 = true;
						if (this.anInt217 < this.anInt216) {
							this.anInt217++;
						}
						this.aString4 = "Loading extra files - " + this.anInt217 * 100 / this.anInt216 + "%";
						this.anInt210++;
						if (this.anInt210 == 10) {
							return;
						}
					}
					local18 = this.aClass23_5;
					synchronized (this.aClass23_5) {
						local25 = (Class4_Sub1_Sub4) this.aClass23_5.method314();
					}
				}
				for (@Pc(120) int local120 = 0; local120 < 4; local120++) {
					@Pc(127) byte[] local127 = this.aByteArrayArray1[local120];
					@Pc(130) int local130 = local127.length;
					for (@Pc(132) int local132 = 0; local132 < local130; local132++) {
						if (local127[local132] == this.anInt226) {
							local127[local132] = 0;
							local25 = new Class4_Sub1_Sub4();
							local25.anInt711 = local120;
							local25.anInt712 = local132;
							local25.aBoolean191 = false;
							this.aClass23_3.method312(local25);
							this.method139(local25, this.anInt220);
							this.aBoolean52 = true;
							if (this.anInt217 < this.anInt216) {
								this.anInt217++;
							}
							this.aString4 = "Loading extra files - " + this.anInt217 * 100 / this.anInt216 + "%";
							this.anInt210++;
							if (this.anInt210 == 10) {
								return;
							}
						}
					}
				}
				this.anInt226--;
			}
		} catch (@Pc(231) RuntimeException local231) {
			signlink.reporterror("17692, " + false + ", " + local231.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "a", descriptor = "(IZ)V")
	public void method145(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray27.length;
			for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
				if (arg0 || this.anIntArray29[local8] != 0) {
					this.method135(3, this.anIntArray28[local8], this.anInt221, (byte) 2);
					this.method135(3, this.anIntArray30[local8], this.anInt221, (byte) 2);
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("27406, " + -895 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "d", descriptor = "(I)V")
	private void method146() {
		try {
			if (this.anInt208 > 0 || this.anInt208 < 0) {
				this.aBoolean54 = !this.aBoolean54;
			}
			this.anInt209 = 0;
			this.anInt210 = 0;
			@Pc(28) Class4_Sub1_Sub4 local28;
			for (local28 = (Class4_Sub1_Sub4) this.aClass23_3.method315(); local28 != null; local28 = (Class4_Sub1_Sub4) this.aClass23_3.method317()) {
				if (local28.aBoolean191) {
					this.anInt209++;
				} else {
					this.anInt210++;
				}
			}
			while (this.anInt209 < 10) {
				local28 = (Class4_Sub1_Sub4) this.aClass23_2.method314();
				if (local28 == null) {
					break;
				}
				if (this.aByteArrayArray1[local28.anInt711][local28.anInt712] != 0) {
					this.anInt217++;
				}
				this.aByteArrayArray1[local28.anInt711][local28.anInt712] = 0;
				this.aClass23_3.method312(local28);
				this.anInt209++;
				this.method139(local28, this.anInt220);
				this.aBoolean52 = true;
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("65395, " + 0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "c", descriptor = "()V")
	public void method147() {
		this.aBoolean53 = false;
	}

	@OriginalMember(owner = "client!DHNAQSHE", name = "c", descriptor = "(Z)V")
	private void method148() {
		try {
			try {
				@Pc(8) int local8 = this.anInputStream1.available();
				@Pc(43) int local43;
				@Pc(59) int local59;
				if (this.anInt214 == 0 && local8 >= 6) {
					this.aBoolean52 = true;
					for (@Pc(19) int local19 = 0; local19 < 6; local19 += this.anInputStream1.read(this.aByteArray5, local19, 6 - local19)) {
					}
					local43 = this.aByteArray5[0] & 0xFF;
					local59 = ((this.aByteArray5[1] & 0xFF) << 8) + (this.aByteArray5[2] & 0xFF);
					@Pc(75) int local75 = ((this.aByteArray5[3] & 0xFF) << 8) + (this.aByteArray5[4] & 0xFF);
					@Pc(82) int local82 = this.aByteArray5[5] & 0xFF;
					this.aClass4_Sub1_Sub4_1 = null;
					for (@Pc(90) Class4_Sub1_Sub4 local90 = (Class4_Sub1_Sub4) this.aClass23_3.method315(); local90 != null; local90 = (Class4_Sub1_Sub4) this.aClass23_3.method317()) {
						if (local90.anInt711 == local43 && local90.anInt712 == local59) {
							this.aClass4_Sub1_Sub4_1 = local90;
						}
						if (this.aClass4_Sub1_Sub4_1 != null) {
							local90.anInt710 = 0;
						}
					}
					if (this.aClass4_Sub1_Sub4_1 != null) {
						this.anInt212 = 0;
						if (local75 == 0) {
							signlink.reporterror("Rej: " + local43 + "," + local59);
							this.aClass4_Sub1_Sub4_1.aByteArray17 = null;
							if (this.aClass4_Sub1_Sub4_1.aBoolean191) {
								@Pc(148) Class23 local148 = this.aClass23_1;
								synchronized (this.aClass23_1) {
									this.aClass23_1.method312(this.aClass4_Sub1_Sub4_1);
								}
							} else {
								this.aClass4_Sub1_Sub4_1.method528();
							}
							this.aClass4_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass4_Sub1_Sub4_1.aByteArray17 == null && local82 == 0) {
								this.aClass4_Sub1_Sub4_1.aByteArray17 = new byte[local75];
							}
							if (this.aClass4_Sub1_Sub4_1.aByteArray17 == null && local82 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt213 = local82 * 500;
					this.anInt214 = 500;
					if (this.anInt214 > local75 - local82 * 500) {
						this.anInt214 = local75 - local82 * 500;
					}
				}
				if (this.anInt214 > 0 && local8 >= this.anInt214) {
					this.aBoolean52 = true;
					@Pc(227) byte[] local227 = this.aByteArray5;
					local43 = 0;
					if (this.aClass4_Sub1_Sub4_1 != null) {
						local227 = this.aClass4_Sub1_Sub4_1.aByteArray17;
						local43 = this.anInt213;
					}
					for (local59 = 0; local59 < this.anInt214; local59 += this.anInputStream1.read(local227, local59 + local43, this.anInt214 - local59)) {
					}
					if (this.anInt214 + this.anInt213 >= local227.length && this.aClass4_Sub1_Sub4_1 != null) {
						if (this.aClient2.aClass11Array1[0] != null) {
							this.aClient2.aClass11Array1[this.aClass4_Sub1_Sub4_1.anInt711 + 1].method150(local227, local227.length, this.aClass4_Sub1_Sub4_1.anInt712);
						}
						if (!this.aClass4_Sub1_Sub4_1.aBoolean191 && this.aClass4_Sub1_Sub4_1.anInt711 == 3) {
							this.aClass4_Sub1_Sub4_1.aBoolean191 = true;
							this.aClass4_Sub1_Sub4_1.anInt711 = 93;
						}
						if (this.aClass4_Sub1_Sub4_1.aBoolean191) {
							@Pc(320) Class23 local320 = this.aClass23_1;
							synchronized (this.aClass23_1) {
								this.aClass23_1.method312(this.aClass4_Sub1_Sub4_1);
							}
						} else {
							this.aClass4_Sub1_Sub4_1.method528();
						}
					}
					this.anInt214 = 0;
				}
			} catch (@Pc(341) IOException local341) {
				try {
					this.aSocket1.close();
				} catch (@Pc(346) Exception local346) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt214 = 0;
			}
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("50304, " + true + ", " + local360.toString());
			throw new RuntimeException();
		}
	}
}
