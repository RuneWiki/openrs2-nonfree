import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class18 implements Interface1 {

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
	public int anInt1129;

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
	private int anInt1138;

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Z")
	private boolean aBoolean38 = true;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ea;I)I")
	public int method718(@OriginalArg(0) Class18 arg0) {
		@Pc(13) int local13;
		if (this.anInt1129 <= arg0.anInt1129) {
			local13 = this.anInt1129;
		} else {
			local13 = arg0.anInt1129;
		}
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			if ((arg0.aByteArray6[local20] & 0xFF) > (this.aByteArray6[local20] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray6[local20] & 0xFF) > (arg0.aByteArray6[local20] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt1129 < arg0.anInt1129) {
			return -1;
		} else if (this.anInt1129 > arg0.anInt1129) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)Lclient!ea;")
	public Class18 method719(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(20) Class18 local20 = new Class18();
		local20.aByteArray6 = new byte[this.anInt1129 + 1];
		local20.anInt1129 = this.anInt1129 + 1;
		Static185.method2279(this.aByteArray6, 0, local20.aByteArray6, 0, this.anInt1129);
		local20.aByteArray6[this.anInt1129] = (byte) arg0;
		return local20;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)Z")
	public boolean method720() {
		return this.method724();
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Lclient!ea;")
	public Class18 method722() {
		@Pc(12) Class18 local12 = new Class18();
		local12.anInt1129 = this.anInt1129;
		local12.aByteArray6 = new byte[this.anInt1129];
		for (@Pc(27) int local27 = 0; local27 < this.anInt1129; local27++) {
			@Pc(34) byte local34 = this.aByteArray6[local27];
			if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
				local34 = (byte) (local34 + 32);
			}
			local12.aByteArray6[local27] = local34;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!ea;)Z")
	public boolean method723(@OriginalArg(1) Class18 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1129 == arg0.anInt1129) {
			if (!this.aBoolean38 || !arg0.aBoolean38) {
				if (this.anInt1138 == 0) {
					this.anInt1138 = this.method737();
					if (this.anInt1138 == 0) {
						this.anInt1138 = 1;
					}
				}
				if (arg0.anInt1138 == 0) {
					arg0.anInt1138 = arg0.method737();
					if (arg0.anInt1138 == 0) {
						arg0.anInt1138 = 1;
					}
				}
				if (this.anInt1138 != arg0.anInt1138) {
					return false;
				}
			}
			for (@Pc(69) int local69 = 0; local69 < this.anInt1129; local69++) {
				if (arg0.aByteArray6[local69] != this.aByteArray6[local69]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Z")
	private boolean method724() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(19) int local19 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt1129; local31++) {
			@Pc(40) int local40 = this.aByteArray6[local31] & 0xFF;
			if (local31 == 0) {
				if (local40 == 45) {
					local9 = true;
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
			if (local9) {
				local40 = -local40;
			}
			@Pc(108) int local108 = local19 * 10 + local40;
			if (local108 / 10 != local19) {
				return false;
			}
			local7 = true;
			local19 = local108;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Lclient!ea;")
	public Class18 method725() {
		@Pc(3) byte local3 = 2;
		@Pc(7) Class18 local7 = new Class18();
		local7.anInt1129 = this.anInt1129;
		local7.aByteArray6 = new byte[this.anInt1129];
		for (@Pc(26) int local26 = 0; local26 < this.anInt1129; local26++) {
			@Pc(33) byte local33 = this.aByteArray6[local26];
			if (local33 >= 97 && local33 <= 122 || !(local33 < -32 || local33 > -2 || local33 == -9)) {
				if (local3 == 2) {
					local33 = (byte) (local33 - 32);
				}
				local3 = 0;
			} else if (local33 >= 65 && local33 <= 90 || !(local33 < -64 || local33 > -34 || local33 == -41)) {
				if (local3 == 0) {
					local33 = (byte) (local33 + 32);
				}
				local3 = 0;
			} else if (local33 == 46 || local33 == 33 || local33 == 63) {
				local3 = 2;
			} else if (local33 != 32) {
				local3 = 1;
			} else if (local3 != 2) {
				local3 = 1;
			}
			local7.aByteArray6[local26] = local33;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)Lclient!ea;")
	public Class18 method726() {
		@Pc(15) int local15 = this.anInt1129;
		@Pc(17) int local17;
		for (local17 = 0; local17 < this.anInt1129 && (this.aByteArray6[local17] >= 0 && this.aByteArray6[local17] <= 32 || (this.aByteArray6[local17] & 0xFF) == 160); local17++) {
		}
		while (local17 < local15 && (this.aByteArray6[local15 - 1] >= 0 && this.aByteArray6[local15 - 1] <= 32 || (this.aByteArray6[local15 - 1] & 0xFF) == 160)) {
			local15--;
		}
		if (local17 == 0 && local15 == this.anInt1129) {
			return this;
		}
		@Pc(99) Class18 local99 = new Class18();
		local99.anInt1129 = local15 - local17;
		local99.aByteArray6 = new byte[local99.anInt1129];
		for (@Pc(112) int local112 = 0; local112 < local99.anInt1129; local112++) {
			local99.aByteArray6[local112] = this.aByteArray6[local17 + local112];
		}
		return local99;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)J")
	public long method727() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1129 && local7 < 12; local7++) {
			@Pc(13) byte local13 = this.aByteArray6[local7];
			local5 *= 37L;
			if (local13 >= 65 && local13 <= 90) {
				local5 += local13 + 1 - 65;
			} else if (local13 >= 97 && local13 <= 122) {
				local5 += local13 + 1 - 97;
			} else if (local13 >= 48 && local13 <= 57) {
				local5 += local13 + 27 - 48;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)Lclient!ea;")
	public Class18 method729(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean38) {
			this.anInt1138 = 0;
			if (this.anInt1129 == this.aByteArray6.length) {
				@Pc(44) int local44;
				for (local44 = 1; local44 <= this.anInt1129; local44 += local44) {
				}
				@Pc(61) byte[] local61 = new byte[local44];
				Static185.method2279(this.aByteArray6, 0, local61, 0, this.anInt1129);
				this.aByteArray6 = local61;
			}
			this.aByteArray6[this.anInt1129++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ea", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method737();
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)I")
	public int method730(@OriginalArg(1) int arg0) {
		@Pc(8) boolean local8 = false;
		@Pc(18) boolean local18 = false;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt1129; local26++) {
			@Pc(35) int local35 = this.aByteArray6[local26] & 0xFF;
			if (local26 == 0) {
				if (local35 == 45) {
					local8 = true;
					continue;
				}
				if (local35 == 43) {
					continue;
				}
			}
			if (local35 >= 48 && local35 <= 57) {
				local35 -= 48;
			} else if (local35 >= 65 && local35 <= 90) {
				local35 -= 55;
			} else if (local35 >= 97 && local35 <= 122) {
				local35 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local35) {
				throw new NumberFormatException();
			}
			if (local8) {
				local35 = -local35;
			}
			@Pc(105) int local105 = local35 + local24 * arg0;
			if (local105 / arg0 != local24) {
				throw new NumberFormatException();
			}
			local24 = local105;
			local18 = true;
		}
		if (!local18) {
			throw new NumberFormatException();
		}
		return local24;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(ILclient!ea;)I")
	public int method731(@OriginalArg(1) Class18 arg0) {
		return this.method743(arg0, 0);
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(Lclient!ea;I)Lclient!ea;")
	public Class18 method732(@OriginalArg(0) Class18 arg0) {
		if (!this.aBoolean38) {
			throw new IllegalArgumentException();
		}
		this.anInt1138 = 0;
		if (this.aByteArray6.length < arg0.anInt1129 + this.anInt1129) {
			@Pc(30) int local30;
			for (local30 = 1; local30 < this.anInt1129 + arg0.anInt1129; local30 += local30) {
			}
			@Pc(46) byte[] local46 = new byte[local30];
			Static185.method2279(this.aByteArray6, 0, local46, 0, this.anInt1129);
			this.aByteArray6 = local46;
		}
		Static185.method2279(arg0.aByteArray6, 0, this.aByteArray6, this.anInt1129, arg0.anInt1129);
		this.anInt1129 += arg0.anInt1129;
		return this;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(II)Lclient!ea;")
	public Class18 method733(@OriginalArg(0) int arg0) {
		return this.method744(arg0, this.anInt1129);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ea;B)Z")
	public boolean method734(@OriginalArg(0) Class18 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1129 == this.anInt1129) {
			for (@Pc(28) int local28 = 0; local28 < this.anInt1129; local28++) {
				@Pc(35) byte local35 = arg0.aByteArray6[local28];
				if (local35 >= 65 && local35 <= 90 || local35 >= -64 && local35 <= -34 && local35 != -41) {
					local35 = (byte) (local35 + 32);
				}
				@Pc(64) byte local64 = this.aByteArray6[local28];
				if (local64 >= 65 && local64 <= 90 || local64 >= -64 && local64 <= -34 && local64 != -41) {
					local64 = (byte) (local64 + 32);
				}
				if (local35 != local64) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)I")
	public int method735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte local8 = (byte) arg1;
		for (@Pc(19) int local19 = arg0; local19 < this.anInt1129; local19++) {
			if (local8 == this.aByteArray6[local19]) {
				return local19;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(II)I")
	public int method736(@OriginalArg(0) int arg0) {
		return this.aByteArray6[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)I")
	public int method737() {
		@Pc(5) int local5 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1129; local12++) {
			local5 = (local5 << 5) + (this.aByteArray6[local12] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)Lclient!ea;")
	public Class18 method738() {
		@Pc(3) Class18 local3 = new Class18();
		local3.anInt1129 = this.anInt1129;
		local3.aByteArray6 = new byte[this.anInt1129];
		for (@Pc(14) int local14 = 0; local14 < this.anInt1129; local14++) {
			local3.aByteArray6[local14] = 42;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ea", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class18)) {
			throw new IllegalArgumentException();
		}
		return this.method723((Class18) arg0);
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)Lclient!ea;")
	public Class18 method739() {
		@Pc(9) Class18 local9 = new Class18();
		local9.anInt1129 = this.anInt1129;
		@Pc(20) boolean local20 = true;
		local9.aByteArray6 = new byte[this.anInt1129];
		for (@Pc(27) int local27 = 0; local27 < this.anInt1129; local27++) {
			@Pc(34) byte local34 = this.aByteArray6[local27];
			if (local34 == 95) {
				local20 = true;
				local9.aByteArray6[local27] = 32;
			} else if (local34 >= 97 && local34 <= 122 && local20) {
				local20 = false;
				local9.aByteArray6[local27] = (byte) (local34 - 32);
			} else {
				local20 = false;
				local9.aByteArray6[local27] = local34;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(Lclient!ea;I)Z")
	public boolean method740(@OriginalArg(0) Class18 arg0) {
		if (arg0.anInt1129 > this.anInt1129) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < arg0.anInt1129; local18++) {
			if (arg0.aByteArray6[local18] != this.aByteArray6[local18]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)Lclient!ea;")
	public Class18 method741() {
		@Pc(3) long local3 = this.method746();
		@Pc(16) Class local16 = ea.class;
		synchronized (ea.class) {
			@Pc(26) Class1_Sub2 local26;
			if (Static131.aClass14_10 == null) {
				Static131.aClass14_10 = new Class14(4096);
			} else {
				for (local26 = (Class1_Sub2) Static131.aClass14_10.method569(local3); local26 != null; local26 = (Class1_Sub2) Static131.aClass14_10.method567()) {
					if (this.method723(local26.aClass18_67)) {
						return local26.aClass18_67;
					}
				}
			}
			local26 = new Class1_Sub2();
			this.aBoolean38 = false;
			local26.aClass18_67 = this;
			Static131.aClass14_10.method570(local26, local3);
			return this;
		}
	}

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "(I)Lclient!ea;")
	public Class18 method742() {
		@Pc(3) int local3 = 0;
		@Pc(15) Class18 local15 = new Class18();
		local15.aByteArray6 = new byte[12];
		local15.anInt1129 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt1129; local28++) {
			if (this.aByteArray6[local28] >= 65 && this.aByteArray6[local28] <= 90) {
				local15.aByteArray6[local3++] = (byte) (this.aByteArray6[local28] + 32);
				local15.anInt1129 = local3;
			} else if (this.aByteArray6[local28] >= 97 && this.aByteArray6[local28] <= 122 || this.aByteArray6[local28] >= 48 && this.aByteArray6[local28] <= 57) {
				local15.aByteArray6[local3++] = this.aByteArray6[local28];
				local15.anInt1129 = local3;
			} else if (local3 > 0) {
				local15.aByteArray6[local3++] = 95;
			}
			if (local3 == 12) {
				break;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLclient!ea;I)I")
	public int method743(@OriginalArg(1) Class18 arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int[] local3 = new int[arg0.anInt1129];
		@Pc(10) int[] local10 = new int[256];
		@Pc(14) int[] local14 = new int[arg0.anInt1129];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			local10[local16] = arg0.anInt1129;
		}
		for (@Pc(40) int local40 = 1; local40 <= arg0.anInt1129; local40++) {
			local3[local40 - 1] = (arg0.anInt1129 << 1) - local40;
			local10[arg0.aByteArray6[local40 - 1] & 0xFF] = arg0.anInt1129 - local40;
		}
		@Pc(81) int local81 = arg0.anInt1129 + 1;
		@Pc(84) int local84 = arg0.anInt1129;
		while (local84 > 0) {
			local14[local84 - 1] = local81;
			while (arg0.anInt1129 >= local81 && arg0.aByteArray6[local84 - 1] != arg0.aByteArray6[local81 - 1]) {
				if (local3[local81 - 1] >= arg0.anInt1129 - local84) {
					local3[local81 - 1] = arg0.anInt1129 - local84;
				}
				local81 = local14[local81 - 1];
			}
			local84--;
			local81--;
		}
		@Pc(152) int local152 = local81;
		@Pc(154) int local154 = 0;
		@Pc(156) int local156 = 1;
		local81 = arg0.anInt1129 + 1 - local81;
		for (@Pc(166) int local166 = 1; local166 <= local81; local166++) {
			local14[local166 - 1] = local154;
			while (local154 >= 1 && arg0.aByteArray6[local166 - 1] != arg0.aByteArray6[local154 - 1]) {
				local154 = local14[local154 - 1];
			}
			local154++;
		}
		@Pc(208) int local208;
		while (local152 < arg0.anInt1129) {
			for (local208 = local156; local208 <= local152; local208++) {
				if (local152 + arg0.anInt1129 - local208 <= local3[local208 + -1]) {
					local3[local208 - 1] = local152 + arg0.anInt1129 - local208;
				}
			}
			local156 = local152 + 1;
			local152 += local81 - local14[local81 - 1];
			local81 = local14[local81 - 1];
		}
		@Pc(287) int local287;
		for (local208 = arg0.anInt1129 + arg1 - 1; local208 < this.anInt1129; local208 += Math.max(local10[this.aByteArray6[local208] & 0xFF], local3[local287])) {
			for (local287 = arg0.anInt1129 - 1; local287 >= 0 && this.aByteArray6[local208] == arg0.aByteArray6[local287]; local287--) {
				local208--;
			}
			if (local287 == -1) {
				return local208 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)Lclient!ea;")
	public Class18 method744(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class18 local7 = new Class18();
		local7.aByteArray6 = new byte[arg1 - arg0];
		local7.anInt1129 = arg1 - arg0;
		Static185.method2279(this.aByteArray6, arg0, local7.aByteArray6, 0, local7.anInt1129);
		return local7;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLclient!ea;)I")
	public int method745(@OriginalArg(1) Class18 arg0) {
		@Pc(9) int local9;
		if (this.anInt1129 > arg0.anInt1129) {
			local9 = arg0.anInt1129;
		} else {
			local9 = this.anInt1129;
		}
		for (@Pc(29) int local29 = 0; local29 < local9; local29++) {
			if (Static121.anIntArray298[this.aByteArray6[local29] & 0xFF] < Static121.anIntArray298[arg0.aByteArray6[local29] & 0xFF]) {
				return -1;
			}
			if (Static121.anIntArray298[arg0.aByteArray6[local29] & 0xFF] < Static121.anIntArray298[this.aByteArray6[local29] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt1129 < arg0.anInt1129) {
			return -1;
		} else if (arg0.anInt1129 < this.anInt1129) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "(I)J")
	private long method746() {
		@Pc(13) long local13 = 0L;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1129; local15++) {
			local13 = (long) (this.aByteArray6[local15] & 0xFF) + (local13 << 5) - local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)I")
	public int method747() {
		return this.anInt1129;
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(B)Lclient!ea;")
	public Class18 method748() {
		if (!this.aBoolean38) {
			throw new IllegalArgumentException();
		}
		this.anInt1138 = 0;
		if (this.aByteArray6.length != this.anInt1129) {
			@Pc(27) byte[] local27 = new byte[this.anInt1129];
			Static185.method2279(this.aByteArray6, 0, local27, 0, this.anInt1129);
			this.aByteArray6 = local27;
		}
		return this;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method749(@OriginalArg(0) FontMetrics arg0) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray6, 0, this.anInt1129, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray6, 0, this.anInt1129);
		}
		return arg0.stringWidth(local9);
	}

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "(I)I")
	public int method750() {
		return this.method730(10);
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(Lclient!ea;B)Z")
	public boolean method751(@OriginalArg(0) Class18 arg0) {
		if (arg0.anInt1129 > this.anInt1129) {
			return false;
		}
		@Pc(23) int local23 = this.anInt1129 - arg0.anInt1129;
		for (@Pc(30) int local30 = 0; local30 < arg0.anInt1129; local30++) {
			if (this.aByteArray6[local30 + local23] != arg0.aByteArray6[local30]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[BII)I")
	public int method752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		Static185.method2279(this.aByteArray6, 0, arg2, arg1, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(B)Ljava/net/URL;")
	public URL method753() throws MalformedURLException {
		return new URL(new String(this.aByteArray6, 0, this.anInt1129));
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "(B)[B")
	public byte[] method754() {
		@Pc(12) byte[] local12 = new byte[this.anInt1129];
		Static185.method2279(this.aByteArray6, 0, local12, 0, this.anInt1129);
		return local12;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public void method755(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) String local21;
		try {
			local21 = new String(this.aByteArray6, 0, this.anInt1129, "ISO-8859-1");
		} catch (@Pc(23) UnsupportedEncodingException local23) {
			local21 = new String(this.aByteArray6, 0, this.anInt1129);
		}
		arg0.drawString(local21, arg1, arg2);
	}
}
