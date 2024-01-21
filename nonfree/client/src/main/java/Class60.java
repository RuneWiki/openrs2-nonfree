import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class60 implements Interface2 {

	@OriginalMember(owner = "client!od", name = "E", descriptor = "I")
	private int anInt1971;

	@OriginalMember(owner = "client!od", name = "X", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!od", name = "fb", descriptor = "I")
	public int anInt1991;

	@OriginalMember(owner = "client!od", name = "R", descriptor = "Z")
	private boolean aBoolean67 = true;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Lclient!od;")
	public Class60 method1307() {
		@Pc(14) Class60 local14 = new Class60();
		local14.anInt1991 = this.anInt1991;
		local14.aByteArray21 = new byte[this.anInt1991];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1991; local25++) {
			local14.aByteArray21[local25] = 42;
		}
		return local14;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)Lclient!od;")
	public Class60 method1308(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean67) {
			this.anInt1971 = 0;
			if (this.aByteArray21.length == this.anInt1991) {
				@Pc(48) int local48;
				for (local48 = 1; local48 <= this.anInt1991; local48 += local48) {
				}
				@Pc(65) byte[] local65 = new byte[local48];
				Static136.method700(this.aByteArray21, 0, local65, 0, this.anInt1991);
				this.aByteArray21 = local65;
			}
			this.aByteArray21[this.anInt1991++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!od;B)I")
	public int method1309(@OriginalArg(0) Class60 arg0) {
		@Pc(22) int local22;
		if (arg0.anInt1991 >= this.anInt1991) {
			local22 = this.anInt1991;
		} else {
			local22 = arg0.anInt1991;
		}
		for (@Pc(29) int local29 = 0; local29 < local22; local29++) {
			if ((arg0.aByteArray21[local29] & 0xFF) > (this.aByteArray21[local29] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray21[local29] & 0xFF) < (this.aByteArray21[local29] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt1991 > this.anInt1991) {
			return -1;
		} else if (arg0.anInt1991 < this.anInt1991) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)I")
	public int method1310(@OriginalArg(1) int arg0) {
		return this.method1314(arg0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!od;)Z")
	public boolean method1311(@OriginalArg(1) Class60 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1991 == arg0.anInt1991) {
			if (!this.aBoolean67 || !arg0.aBoolean67) {
				if (this.anInt1971 == 0) {
					this.anInt1971 = this.method1342();
					if (this.anInt1971 == 0) {
						this.anInt1971 = 1;
					}
				}
				if (arg0.anInt1971 == 0) {
					arg0.anInt1971 = arg0.method1342();
					if (arg0.anInt1971 == 0) {
						arg0.anInt1971 = 1;
					}
				}
				if (arg0.anInt1971 != this.anInt1971) {
					return false;
				}
			}
			for (@Pc(71) int local71 = 0; local71 < this.anInt1991; local71++) {
				if (this.aByteArray21[local71] != arg0.aByteArray21[local71]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)Ljava/net/URL;")
	public URL method1313() throws MalformedURLException {
		return new URL(new String(this.aByteArray21, 0, this.anInt1991));
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBI)I")
	private int method1314(@OriginalArg(2) int arg0) {
		@Pc(8) byte local8 = (byte) arg0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt1991; local10++) {
			if (this.aByteArray21[local10] == local8) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(BI)Lclient!od;")
	public Class60 method1315(@OriginalArg(1) int arg0) {
		return this.method1333(arg0, this.anInt1991);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!od;)I")
	public int method1316(@OriginalArg(1) Class60 arg0) {
		return this.method1344(arg0);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Lclient!od;")
	public Class60 method1317() {
		@Pc(9) Class60 local9 = new Class60();
		@Pc(19) int local19 = 0;
		local9.anInt1991 = 0;
		local9.aByteArray21 = new byte[12];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1991; local28++) {
			if (this.aByteArray21[local28] >= 65 && this.aByteArray21[local28] <= 90) {
				local9.aByteArray21[local19++] = (byte) (this.aByteArray21[local28] + 97 - 65);
				local9.anInt1991 = local19;
			} else if (this.aByteArray21[local28] >= 97 && this.aByteArray21[local28] <= 122 || this.aByteArray21[local28] >= 48 && this.aByteArray21[local28] <= 57) {
				local9.aByteArray21[local19++] = this.aByteArray21[local28];
				local9.anInt1991 = local19;
			} else if (local19 > 0) {
				local9.aByteArray21[local19++] = 95;
			}
			if (local19 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!od;I)Z")
	public boolean method1318(@OriginalArg(0) Class60 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1991 == arg0.anInt1991) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt1991; local22++) {
				@Pc(34) byte local34 = this.aByteArray21[local22];
				if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
					local34 = (byte) (local34 + 32);
				}
				@Pc(65) byte local65 = arg0.aByteArray21[local22];
				if (local65 >= 65 && local65 <= 90 || local65 >= -64 && local65 <= -34 && local65 != -41) {
					local65 = (byte) (local65 + 32);
				}
				if (local34 != local65) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public void method1319(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray21, 0, this.anInt1991, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray21, 0, this.anInt1991);
		}
		arg1.drawString(local9, arg2, arg0);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(B)[B")
	public byte[] method1320() {
		@Pc(3) byte[] local3 = new byte[this.anInt1991];
		Static136.method700(this.aByteArray21, 0, local3, 0, this.anInt1991);
		return local3;
	}

	@OriginalMember(owner = "client!od", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class60)) {
			throw new IllegalArgumentException();
		}
		return this.method1311((Class60) arg0);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Lclient!od;I)Z")
	public boolean method1321(@OriginalArg(0) Class60 arg0) {
		if (arg0.anInt1991 > this.anInt1991) {
			return false;
		}
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1991; local25++) {
			if (this.aByteArray21[local25] != arg0.aByteArray21[local25]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)Lclient!od;")
	public Class60 method1322() {
		@Pc(12) boolean local12 = true;
		@Pc(16) Class60 local16 = new Class60();
		local16.anInt1991 = this.anInt1991;
		local16.aByteArray21 = new byte[this.anInt1991];
		for (@Pc(27) int local27 = 0; local27 < this.anInt1991; local27++) {
			@Pc(34) byte local34 = this.aByteArray21[local27];
			if (local34 == 95) {
				local16.aByteArray21[local27] = 32;
				local12 = true;
			} else if (local34 >= 97 && local34 <= 122 && local12) {
				local12 = false;
				local16.aByteArray21[local27] = (byte) (local34 - 32);
			} else {
				local16.aByteArray21[local27] = local34;
				local12 = false;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(BI)Lclient!od;")
	public Class60 method1323(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(30) Class60 local30 = new Class60();
		local30.aByteArray21 = new byte[this.anInt1991 + 1];
		local30.anInt1991 = this.anInt1991 + 1;
		Static136.method700(this.aByteArray21, 0, local30.aByteArray21, 0, this.anInt1991);
		local30.aByteArray21[this.anInt1991] = (byte) arg0;
		return local30;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)I")
	public int method1324() {
		return this.method1331(10);
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(I)J")
	public long method1325() {
		@Pc(3) long local3 = 0L;
		for (@Pc(5) int local5 = 0; local5 < this.anInt1991 && local5 < 12; local5++) {
			local3 *= 37L;
			@Pc(24) byte local24 = this.aByteArray21[local5];
			if (local24 >= 65 && local24 <= 90) {
				local3 += local24 + 1 - 65;
			} else if (local24 >= 97 && local24 <= 122) {
				local3 += local24 - 96;
			} else if (local24 >= 48 && local24 <= 57) {
				local3 += local24 + 27 - 48;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(BI)Z")
	private boolean method1328() {
		@Pc(7) boolean local7 = false;
		@Pc(27) boolean local27 = false;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt1991; local31++) {
			@Pc(40) int local40 = this.aByteArray21[local31] & 0xFF;
			if (local31 == 0) {
				if (local40 == 45) {
					local7 = true;
					continue;
				}
				if (local40 == 43) {
					continue;
				}
			}
			if (local40 >= 48 && local40 <= 57) {
				local40 -= 48;
			} else if (local40 >= 65 && local40 <= 90) {
				local40 -= 55;
			} else if (local40 >= 97 && local40 <= 122) {
				local40 -= 87;
			} else {
				return false;
			}
			if (local40 >= 10) {
				return false;
			}
			if (local7) {
				local40 = -local40;
			}
			@Pc(102) int local102 = local40 + local29 * 10;
			if (local102 / 10 != local29) {
				return false;
			}
			local29 = local102;
			local27 = true;
		}
		return local27;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method1329(@OriginalArg(0) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray21, 0, this.anInt1991, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray21, 0, this.anInt1991);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)Z")
	public boolean method1330() {
		return this.method1328();
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(BI)I")
	public int method1331(@OriginalArg(1) int arg0) {
		@Pc(17) boolean local17 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < this.anInt1991; local30++) {
			@Pc(39) int local39 = this.aByteArray21[local30] & 0xFF;
			if (local30 == 0) {
				if (local39 == 45) {
					local17 = true;
					continue;
				}
				if (local39 == 43) {
					continue;
				}
			}
			if (local39 >= 48 && local39 <= 57) {
				local39 -= 48;
			} else if (local39 >= 65 && local39 <= 90) {
				local39 -= 55;
			} else if (local39 >= 97 && local39 <= 122) {
				local39 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local39) {
				throw new NumberFormatException();
			}
			if (local17) {
				local39 = -local39;
			}
			@Pc(114) int local114 = local39 + local28 * arg0;
			if (local114 / arg0 != local28) {
				throw new NumberFormatException();
			}
			local28 = local114;
			local26 = true;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!od;Z)Lclient!od;")
	public Class60 method1332(@OriginalArg(0) Class60 arg0) {
		if (!this.aBoolean67) {
			throw new IllegalArgumentException();
		}
		this.anInt1971 = 0;
		if (this.anInt1991 + arg0.anInt1991 > this.aByteArray21.length) {
			@Pc(31) int local31;
			for (local31 = 1; local31 < arg0.anInt1991 + this.anInt1991; local31 += local31) {
			}
			@Pc(47) byte[] local47 = new byte[local31];
			Static136.method700(this.aByteArray21, 0, local47, 0, this.anInt1991);
			this.aByteArray21 = local47;
		}
		Static136.method700(arg0.aByteArray21, 0, this.aByteArray21, this.anInt1991, arg0.anInt1991);
		this.anInt1991 += arg0.anInt1991;
		return this;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)Lclient!od;")
	public Class60 method1333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class60 local12 = new Class60();
		local12.anInt1991 = arg1 - arg0;
		local12.aByteArray21 = new byte[arg1 - arg0];
		Static136.method700(this.aByteArray21, arg0, local12.aByteArray21, 0, local12.anInt1991);
		return local12;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Lclient!od;")
	public Class60 method1334() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt1991 && (this.aByteArray21[local7] >= 0 && this.aByteArray21[local7] <= 32 || (this.aByteArray21[local7] & 0xFF) == 160); local7++) {
		}
		@Pc(40) int local40;
		for (local40 = this.anInt1991; local7 < local40 && (this.aByteArray21[local40 - 1] >= 0 && this.aByteArray21[local40 - 1] <= 32 || (this.aByteArray21[local40 - 1] & 0xFF) == 160); local40--) {
		}
		if (local7 == 0 && this.anInt1991 == local40) {
			return this;
		}
		@Pc(93) Class60 local93 = new Class60();
		local93.anInt1991 = local40 - local7;
		local93.aByteArray21 = new byte[local93.anInt1991];
		for (@Pc(106) int local106 = 0; local106 < local93.anInt1991; local106++) {
			local93.aByteArray21[local106] = this.aByteArray21[local7 + local106];
		}
		return local93;
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)Lclient!od;")
	public Class60 method1335() {
		if (!this.aBoolean67) {
			throw new IllegalArgumentException();
		}
		this.anInt1971 = 0;
		if (this.anInt1991 != this.aByteArray21.length) {
			@Pc(32) byte[] local32 = new byte[this.anInt1991];
			Static136.method700(this.aByteArray21, 0, local32, 0, this.anInt1991);
			this.aByteArray21 = local32;
		}
		return this;
	}

	@OriginalMember(owner = "client!od", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(B)Lclient!od;")
	public Class60 method1337() {
		@Pc(9) Class60 local9 = new Class60();
		@Pc(19) byte local19 = 2;
		local9.anInt1991 = this.anInt1991;
		local9.aByteArray21 = new byte[this.anInt1991];
		for (@Pc(30) int local30 = 0; local30 < this.anInt1991; local30++) {
			@Pc(37) byte local37 = this.aByteArray21[local30];
			if (local37 >= 97 && local37 <= 122 || local37 >= -32 && local37 <= -2 && local37 != -9) {
				if (local19 == 2) {
					local37 = (byte) (local37 - 32);
				}
				local19 = 0;
			} else if (local37 >= 65 && local37 <= 90 || !(local37 < -64 || local37 > -34 || local37 == -41)) {
				if (local19 == 0) {
					local37 = (byte) (local37 + 32);
				}
				local19 = 0;
			} else if (local37 == 46 || local37 == 33 || local37 == 63) {
				local19 = 2;
			} else if (local37 != 32) {
				local19 = 1;
			} else if (local19 != 2) {
				local19 = 1;
			}
			local9.aByteArray21[local30] = local37;
		}
		return local9;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
	public int method1338(@OriginalArg(1) int arg0) {
		return this.aByteArray21[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!od", name = "h", descriptor = "(I)Lclient!od;")
	public Class60 method1339() {
		@Pc(9) Class60 local9 = new Class60();
		local9.anInt1991 = this.anInt1991;
		local9.aByteArray21 = new byte[this.anInt1991];
		for (@Pc(20) int local20 = 0; local20 < this.anInt1991; local20++) {
			@Pc(32) byte local32 = this.aByteArray21[local20];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local9.aByteArray21[local20] = local32;
		}
		return local9;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(BLclient!od;)I")
	public int method1340(@OriginalArg(1) Class60 arg0) {
		@Pc(13) int local13;
		if (this.anInt1991 > arg0.anInt1991) {
			local13 = arg0.anInt1991;
		} else {
			local13 = this.anInt1991;
		}
		for (@Pc(29) int local29 = 0; local29 < local13; local29++) {
			if (Static87.anIntArray232[this.aByteArray21[local29] & 0xFF] < Static87.anIntArray232[arg0.aByteArray21[local29] & 0xFF]) {
				return -1;
			}
			if (Static87.anIntArray232[this.aByteArray21[local29] & 0xFF] > Static87.anIntArray232[arg0.aByteArray21[local29] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt1991 < arg0.anInt1991) {
			return -1;
		} else if (this.anInt1991 > arg0.anInt1991) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!od", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1342();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZII[BI)I")
	public int method1341(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		Static136.method700(this.aByteArray21, 0, arg2, arg1, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)I")
	public int method1342() {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1991; local12++) {
			local10 = (this.aByteArray21[local12] & 0xFF) + ((local10 << 5) - local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLclient!od;)Z")
	public boolean method1343(@OriginalArg(1) Class60 arg0) {
		if (arg0.anInt1991 > this.anInt1991) {
			return false;
		}
		@Pc(19) int local19 = this.anInt1991 - arg0.anInt1991;
		for (@Pc(26) int local26 = 0; local26 < arg0.anInt1991; local26++) {
			if (arg0.aByteArray21[local26] != this.aByteArray21[local26 + local19]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILclient!od;)I")
	private int method1344(@OriginalArg(2) Class60 arg0) {
		@Pc(5) int[] local5 = new int[arg0.anInt1991];
		@Pc(8) int[] local8 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt1991];
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			local8[local18] = arg0.anInt1991;
		}
		for (@Pc(32) int local32 = 1; local32 <= arg0.anInt1991; local32++) {
			local5[local32 - 1] = (arg0.anInt1991 << 1) - local32;
			local8[arg0.aByteArray21[local32 - 1] & 0xFF] = arg0.anInt1991 - local32;
		}
		@Pc(70) int local70 = arg0.anInt1991 + 1;
		for (@Pc(73) int local73 = arg0.anInt1991; local73 > 0; local73--) {
			local16[local73 - 1] = local70;
			while (local70 <= arg0.anInt1991 && arg0.aByteArray21[local70 - 1] != arg0.aByteArray21[local73 - 1]) {
				if (arg0.anInt1991 - local73 <= local5[local70 + -1]) {
					local5[local70 - 1] = arg0.anInt1991 - local73;
				}
				local70 = local16[local70 - 1];
			}
			local70--;
		}
		@Pc(140) int local140 = local70;
		@Pc(142) int local142 = 1;
		local70 = arg0.anInt1991 + 1 - local70;
		@Pc(152) int local152 = 0;
		@Pc(154) int local154 = 1;
		while (local70 >= local154) {
			local16[local154 - 1] = local152;
			while (local152 >= 1 && arg0.aByteArray21[local152 - 1] != arg0.aByteArray21[local154 - 1]) {
				local152 = local16[local152 - 1];
			}
			local154++;
			local152++;
		}
		@Pc(197) int local197;
		while (arg0.anInt1991 > local140) {
			for (local197 = local142; local197 <= local140; local197++) {
				if (arg0.anInt1991 + local140 - local197 <= local5[local197 + -1]) {
					local5[local197 - 1] = arg0.anInt1991 + local140 - local197;
				}
			}
			local142 = local140 + 1;
			local140 = local140 + local70 - local16[local70 - 1];
			local70 = local16[local70 - 1];
		}
		@Pc(278) int local278;
		for (local197 = arg0.anInt1991 - 1; local197 < this.anInt1991; local197 += Math.max(local8[this.aByteArray21[local197] & 0xFF], local5[local278])) {
			for (local278 = arg0.anInt1991 - 1; local278 >= 0 && this.aByteArray21[local197] == arg0.aByteArray21[local278]; local278--) {
				local197--;
			}
			if (local278 == -1) {
				return local197 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!od", name = "i", descriptor = "(I)I")
	public int method1345() {
		return this.anInt1991;
	}

	@OriginalMember(owner = "client!od", name = "j", descriptor = "(I)Lclient!od;")
	public Class60 method1346() {
		@Pc(3) long local3 = this.method1348();
		@Pc(16) Class local16 = od.class;
		synchronized (od.class) {
			@Pc(32) Class4_Sub7 local32;
			if (Static46.aClass75_7 == null) {
				Static46.aClass75_7 = new Class75(4096);
			} else {
				for (local32 = (Class4_Sub7) Static46.aClass75_7.method1896(local3); local32 != null; local32 = (Class4_Sub7) Static46.aClass75_7.method1899()) {
					if (this.method1311(local32.aClass60_353)) {
						return local32.aClass60_353;
					}
				}
			}
			local32 = new Class4_Sub7();
			local32.aClass60_353 = this;
			this.aBoolean67 = false;
			Static46.aClass75_7.method1892(local3, local32);
			return this;
		}
	}

	@OriginalMember(owner = "client!od", name = "k", descriptor = "(I)J")
	private long method1348() {
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1991; local12++) {
			local10 = (local10 << 5) + (long) (this.aByteArray21[local12] & 0xFF) - local10;
		}
		return local10;
	}
}
