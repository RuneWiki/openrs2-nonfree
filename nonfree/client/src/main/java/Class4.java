import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class4 implements Interface4 {

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
	public int anInt238;

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "Z")
	private boolean aBoolean18 = true;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ad;I)I")
	public int method117(@OriginalArg(0) Class4 arg0) {
		return this.method138(arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I")
	public int method118() {
		return this.anInt238;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)Lclient!ad;")
	public Class4 method119() {
		@Pc(3) Class4 local3 = new Class4();
		local3.anInt238 = this.anInt238;
		local3.aByteArray1 = new byte[this.anInt238];
		for (@Pc(26) int local26 = 0; local26 < this.anInt238; local26++) {
			local3.aByteArray1[local26] = 42;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lclient!ad;I)Lclient!ad;")
	public Class4 method120(@OriginalArg(0) Class4 arg0) {
		if (!this.aBoolean18) {
			throw new IllegalArgumentException();
		}
		this.anInt247 = 0;
		if (this.anInt238 + arg0.anInt238 > this.aByteArray1.length) {
			@Pc(36) int local36;
			for (local36 = 1; local36 < arg0.anInt238 + this.anInt238; local36 += local36) {
			}
			@Pc(52) byte[] local52 = new byte[local36];
			Static116.method551(this.aByteArray1, 0, local52, 0, this.anInt238);
			this.aByteArray1 = local52;
		}
		Static116.method551(arg0.aByteArray1, 0, this.aByteArray1, this.anInt238, arg0.anInt238);
		this.anInt238 += arg0.anInt238;
		return this;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)Lclient!ad;")
	public Class4 method121(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(28) Class4 local28 = new Class4();
		local28.aByteArray1 = new byte[this.anInt238 + 1];
		local28.anInt238 = this.anInt238 + 1;
		Static116.method551(this.aByteArray1, 0, local28.aByteArray1, 0, this.anInt238);
		local28.aByteArray1[this.anInt238] = (byte) arg0;
		return local28;
	}

	@OriginalMember(owner = "client!ad", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)Lclient!ad;")
	public Class4 method122() {
		@Pc(3) long local3 = this.method134();
		@Pc(16) Class local16 = ad.class;
		synchronized (ad.class) {
			@Pc(32) Class3_Sub2 local32;
			if (Static16.aClass34_2 == null) {
				Static16.aClass34_2 = new Class34(4096);
			} else {
				for (local32 = (Class3_Sub2) Static16.aClass34_2.method797(local3); local32 != null; local32 = (Class3_Sub2) Static16.aClass34_2.method799()) {
					if (this.method151(local32.aClass4_182)) {
						return local32.aClass4_182;
					}
				}
			}
			local32 = new Class3_Sub2();
			this.aBoolean18 = false;
			local32.aClass4_182 = this;
			Static16.aClass34_2.method792(local3, local32);
			return this;
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)I")
	public int method123() {
		return this.method162();
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)Lclient!ad;")
	public Class4 method124() {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = this.anInt238;
		while (local7 < this.anInt238 && (this.aByteArray1[local7] >= 0 && this.aByteArray1[local7] <= 32 || (this.aByteArray1[local7] & 0xFF) == 160)) {
			local7++;
		}
		while (local10 > local7 && (this.aByteArray1[local10 - 1] >= 0 && this.aByteArray1[local10 - 1] <= 32 || (this.aByteArray1[local10 - 1] & 0xFF) == 160)) {
			local10--;
		}
		if (local7 == 0 && this.anInt238 == local10) {
			return this;
		}
		@Pc(97) Class4 local97 = new Class4();
		local97.anInt238 = local10 - local7;
		local97.aByteArray1 = new byte[local97.anInt238];
		for (@Pc(114) int local114 = 0; local114 < local97.anInt238; local114++) {
			local97.aByteArray1[local114] = this.aByteArray1[local114 + local7];
		}
		return local97;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Z")
	private boolean method125() {
		@Pc(17) boolean local17 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt238; local28++) {
			@Pc(37) int local37 = this.aByteArray1[local28] & 0xFF;
			if (local28 == 0) {
				if (local37 == 45) {
					local17 = true;
					continue;
				}
				if (local37 == 43) {
					continue;
				}
			}
			if (local37 >= 48 && local37 <= 57) {
				local37 -= 48;
			} else if (local37 >= 65 && local37 <= 90) {
				local37 -= 55;
			} else if (local37 >= 97 && local37 <= 122) {
				local37 -= 87;
			} else {
				return false;
			}
			if (local37 >= 10) {
				return false;
			}
			if (local17) {
				local37 = -local37;
			}
			@Pc(114) int local114 = local26 * 10 + local37;
			if (local114 / 10 != local26) {
				return false;
			}
			local26 = local114;
			local24 = true;
		}
		return local24;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)I")
	public int method128() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt238; local7++) {
			local5 = (this.aByteArray1[local7] & 0xFF) + ((local5 << 5) - local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method129(@OriginalArg(1) FontMetrics arg0) {
		@Pc(22) String local22;
		try {
			local22 = new String(this.aByteArray1, 0, this.anInt238, "ISO-8859-1");
		} catch (@Pc(24) UnsupportedEncodingException local24) {
			local22 = new String(this.aByteArray1, 0, this.anInt238);
		}
		return arg0.stringWidth(local22);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)Lclient!ad;")
	public Class4 method130() {
		@Pc(15) boolean local15 = true;
		@Pc(19) Class4 local19 = new Class4();
		local19.anInt238 = this.anInt238;
		local19.aByteArray1 = new byte[this.anInt238];
		for (@Pc(30) int local30 = 0; local30 < this.anInt238; local30++) {
			@Pc(37) byte local37 = this.aByteArray1[local30];
			if (local37 == 95) {
				local19.aByteArray1[local30] = 32;
				local15 = true;
			} else if (local37 >= 97 && local37 <= 122 && local15) {
				local15 = false;
				local19.aByteArray1[local30] = (byte) (local37 - 32);
			} else {
				local15 = false;
				local19.aByteArray1[local30] = local37;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)Z")
	public boolean method131() {
		return this.method125();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!ad;)Z")
	public boolean method132(@OriginalArg(1) Class4 arg0) {
		if (arg0.anInt238 > this.anInt238) {
			return false;
		}
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt238; local22++) {
			if (this.aByteArray1[local22] != arg0.aByteArray1[local22]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method128();
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)Lclient!ad;")
	public Class4 method133() {
		if (!this.aBoolean18) {
			throw new IllegalArgumentException();
		}
		this.anInt247 = 0;
		if (this.anInt238 != this.aByteArray1.length) {
			@Pc(31) byte[] local31 = new byte[this.anInt238];
			Static116.method551(this.aByteArray1, 0, local31, 0, this.anInt238);
			this.aByteArray1 = local31;
		}
		return this;
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(B)J")
	private long method134() {
		@Pc(5) long local5 = 0L;
		for (@Pc(15) int local15 = 0; local15 < this.anInt238; local15++) {
			local5 = (local5 << 5) + (long) (this.aByteArray1[local15] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)Lclient!ad;")
	public Class4 method136(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4 local12 = new Class4();
		local12.anInt238 = arg1 - arg0;
		local12.aByteArray1 = new byte[arg1 - arg0];
		Static116.method551(this.aByteArray1, arg0, local12.aByteArray1, 0, local12.anInt238);
		return local12;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)Lclient!ad;")
	public Class4 method137(@OriginalArg(0) int arg0) {
		return this.method136(arg0, this.anInt238);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLclient!ad;I)I")
	private int method138(@OriginalArg(1) Class4 arg0) {
		@Pc(9) int[] local9 = new int[arg0.anInt238];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt238];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg0.anInt238;
		}
		for (@Pc(32) int local32 = 1; local32 <= arg0.anInt238; local32++) {
			local9[local32 - 1] = (arg0.anInt238 << 1) - local32;
			local12[arg0.aByteArray1[local32 - 1] & 0xFF] = arg0.anInt238 - local32;
		}
		@Pc(70) int local70 = arg0.anInt238 + 1;
		for (@Pc(73) int local73 = arg0.anInt238; local73 > 0; local73--) {
			local16[local73 - 1] = local70;
			while (local70 <= arg0.anInt238 && arg0.aByteArray1[local73 - 1] != arg0.aByteArray1[local70 - 1]) {
				if (arg0.anInt238 - local73 <= local9[local70 + -1]) {
					local9[local70 - 1] = arg0.anInt238 - local73;
				}
				local70 = local16[local70 - 1];
			}
			local70--;
		}
		@Pc(142) int local142 = local70;
		local70 = arg0.anInt238 + 1 - local70;
		@Pc(151) int local151 = 1;
		@Pc(153) int local153 = 0;
		for (@Pc(155) int local155 = 1; local155 <= local70; local155++) {
			local16[local155 - 1] = local153;
			while (local153 >= 1 && arg0.aByteArray1[local153 - 1] != arg0.aByteArray1[local155 - 1]) {
				local153 = local16[local153 - 1];
			}
			local153++;
		}
		@Pc(200) int local200;
		while (local142 < arg0.anInt238) {
			for (local200 = local151; local200 <= local142; local200++) {
				if (local9[local200 - 1] >= local142 + arg0.anInt238 - local200) {
					local9[local200 - 1] = local142 + arg0.anInt238 - local200;
				}
			}
			local151 = local142 + 1;
			local142 = local70 + local142 - local16[local70 - 1];
			local70 = local16[local70 - 1];
		}
		@Pc(273) int local273;
		for (local200 = arg0.anInt238 - 1; local200 < this.anInt238; local200 += Math.max(local12[this.aByteArray1[local200] & 0xFF], local9[local273])) {
			for (local273 = arg0.anInt238 - 1; local273 >= 0 && this.aByteArray1[local200] == arg0.aByteArray1[local273]; local273--) {
				local200--;
			}
			if (local273 == -1) {
				return local200 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)I")
	public int method140(@OriginalArg(0) int arg0) {
		return this.aByteArray1[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(ILclient!ad;)Z")
	public boolean method141(@OriginalArg(1) Class4 arg0) {
		if (this.anInt238 < arg0.anInt238) {
			return false;
		}
		@Pc(19) int local19 = this.anInt238 - arg0.anInt238;
		for (@Pc(26) int local26 = 0; local26 < arg0.anInt238; local26++) {
			if (arg0.aByteArray1[local26] != this.aByteArray1[local19 + local26]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(II)Lclient!ad;")
	public Class4 method142(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean18) {
			this.anInt247 = 0;
			if (this.anInt238 == this.aByteArray1.length) {
				@Pc(43) int local43;
				for (local43 = 1; local43 <= this.anInt238; local43 += local43) {
				}
				@Pc(60) byte[] local60 = new byte[local43];
				Static116.method551(this.aByteArray1, 0, local60, 0, this.anInt238);
				this.aByteArray1 = local60;
			}
			this.aByteArray1[this.anInt238++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I[BIII)I")
	public int method145(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) int arg2) {
		Static116.method551(this.aByteArray1, 0, arg1, arg0, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!ad", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(II)I")
	public int method146() {
		return this.method150();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!ad;I)Lclient!ad;")
	public Class4 method148(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		if (!this.aBoolean18) {
			throw new IllegalArgumentException();
		} else if (arg0 > this.anInt238) {
			throw new IllegalArgumentException();
		} else {
			this.anInt247 = 0;
			if (this.aByteArray1.length < arg0 + arg1.anInt238) {
				@Pc(39) int local39;
				for (local39 = 1; local39 < arg1.anInt238 + arg0; local39 += local39) {
				}
				@Pc(58) byte[] local58 = new byte[local39];
				Static116.method551(this.aByteArray1, 0, local58, 0, this.anInt238);
				this.aByteArray1 = local58;
			}
			Static116.method551(arg1.aByteArray1, 0, this.aByteArray1, arg0, arg1.anInt238);
			if (this.anInt238 < arg0 + arg1.anInt238) {
				this.anInt238 = arg1.anInt238 + arg0;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(B)J")
	public long method149() {
		@Pc(7) long local7 = 0L;
		for (@Pc(9) int local9 = 0; this.anInt238 > local9 && local9 < 12; local9++) {
			@Pc(21) byte local21 = this.aByteArray1[local9];
			local7 *= 37L;
			if (local21 >= 65 && local21 <= 90) {
				local7 += local21 + 1 - 65;
			} else if (local21 >= 97 && local21 <= 122) {
				local7 += local21 + 1 - 97;
			} else if (local21 >= 48 && local21 <= 57) {
				local7 += local21 + 27 - 48;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIB)I")
	private int method150() {
		for (@Pc(10) int local10 = 0; local10 < this.anInt238; local10++) {
			if (this.aByteArray1[local10] == 32) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLclient!ad;)Z")
	public boolean method151(@OriginalArg(1) Class4 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt238 == this.anInt238) {
			if (!this.aBoolean18 || !arg0.aBoolean18) {
				if (this.anInt247 == 0) {
					this.anInt247 = this.method128();
					if (this.anInt247 == 0) {
						this.anInt247 = 1;
					}
				}
				if (arg0.anInt247 == 0) {
					arg0.anInt247 = arg0.method128();
					if (arg0.anInt247 == 0) {
						arg0.anInt247 = 1;
					}
				}
				if (this.anInt247 != arg0.anInt247) {
					return false;
				}
			}
			for (@Pc(72) int local72 = 0; local72 < this.anInt238; local72++) {
				if (arg0.aByteArray1[local72] != this.aByteArray1[local72]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "(B)Lclient!ad;")
	public Class4 method153() {
		@Pc(9) Class4 local9 = new Class4();
		local9.anInt238 = this.anInt238;
		local9.aByteArray1 = new byte[this.anInt238];
		for (@Pc(20) int local20 = 0; local20 < this.anInt238; local20++) {
			@Pc(27) byte local27 = this.aByteArray1[local20];
			if (local27 >= 65 && local27 <= 90 || local27 >= -64 && local27 <= -34 && local27 != -41) {
				local27 = (byte) (local27 + 32);
			}
			local9.aByteArray1[local20] = local27;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "(B)[B")
	public byte[] method156() {
		@Pc(12) byte[] local12 = new byte[this.anInt238];
		Static116.method551(this.aByteArray1, 0, local12, 0, this.anInt238);
		return local12;
	}

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "(B)Lclient!ad;")
	public Class4 method157() {
		@Pc(5) Class4 local5 = new Class4();
		@Pc(11) boolean local11 = true;
		local5.anInt238 = this.anInt238;
		local5.aByteArray1 = new byte[this.anInt238];
		for (@Pc(27) int local27 = 0; local27 < this.anInt238; local27++) {
			@Pc(34) byte local34 = this.aByteArray1[local27];
			if (local34 >= 97 && local34 <= 122 || local34 >= -32 && local34 <= -2 && local34 != -9) {
				if (local11) {
					local34 = (byte) (local34 - 32);
				}
				local11 = false;
			} else if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
				if (!local11) {
					local34 = (byte) (local34 + 32);
				}
				local11 = false;
			}
			if (local34 == 46 || local34 == 33 || local34 == 63) {
				local11 = true;
			}
			local5.aByteArray1[local27] = local34;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public void method158(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray1, 0, this.anInt238, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray1, 0, this.anInt238);
		}
		arg1.drawString(local9, arg0, arg2);
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)Lclient!ad;")
	public Class4 method159() {
		@Pc(5) Class4 local5 = new Class4();
		@Pc(11) int local11 = 0;
		local5.aByteArray1 = new byte[12];
		local5.anInt238 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt238; local25++) {
			if (this.aByteArray1[local25] >= 65 && this.aByteArray1[local25] <= 90) {
				local5.aByteArray1[local11++] = (byte) (this.aByteArray1[local25] + 32);
				local5.anInt238 = local11;
			} else if (this.aByteArray1[local25] >= 97 && this.aByteArray1[local25] <= 122 || this.aByteArray1[local25] >= 48 && this.aByteArray1[local25] <= 57) {
				local5.aByteArray1[local11++] = this.aByteArray1[local25];
				local5.anInt238 = local11;
			} else if (local11 > 0) {
				local5.aByteArray1[local11++] = 95;
			}
			if (local11 == 12) {
				break;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLclient!ad;)Z")
	public boolean method160(@OriginalArg(1) Class4 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt238 == arg0.anInt238) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt238; local27++) {
				@Pc(34) byte local34 = arg0.aByteArray1[local27];
				@Pc(39) byte local39 = this.aByteArray1[local27];
				if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
					local34 = (byte) (local34 + 32);
				}
				if (local39 >= 65 && local39 <= 90 || local39 >= -64 && local39 <= -34 && local39 != -41) {
					local39 = (byte) (local39 + 32);
				}
				if (local34 != local39) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(IB)I")
	private int method162() {
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt238; local28++) {
			@Pc(37) int local37 = this.aByteArray1[local28] & 0xFF;
			if (local28 == 0) {
				if (local37 == 45) {
					local22 = true;
					continue;
				}
				if (local37 == 43) {
					continue;
				}
			}
			if (local37 >= 48 && local37 <= 57) {
				local37 -= 48;
			} else if (local37 >= 65 && local37 <= 90) {
				local37 -= 55;
			} else if (local37 >= 97 && local37 <= 122) {
				local37 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (local37 >= 10) {
				throw new NumberFormatException();
			}
			if (local22) {
				local37 = -local37;
			}
			@Pc(110) int local110 = local26 * 10 + local37;
			if (local110 / 10 != local26) {
				throw new NumberFormatException();
			}
			local24 = true;
			local26 = local110;
		}
		if (!local24) {
			throw new NumberFormatException();
		}
		return local26;
	}
}
