import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class34 implements Interface1 {

	@OriginalMember(owner = "client!id", name = "o", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!id", name = "G", descriptor = "I")
	private int anInt1550;

	@OriginalMember(owner = "client!id", name = "J", descriptor = "I")
	public int anInt1553;

	@OriginalMember(owner = "client!id", name = "Q", descriptor = "Z")
	private boolean aBoolean85 = true;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)I")
	public int method953(@OriginalArg(0) int arg0) {
		return this.aByteArray20[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(II)Lclient!id;")
	public Class34 method956(@OriginalArg(0) int arg0) {
		return this.method962(this.anInt1553, arg0);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Lclient!id;")
	public Class34 method957() {
		@Pc(3) int local3 = 0;
		@Pc(6) int local6 = this.anInt1553;
		while (local3 < this.anInt1553 && (this.aByteArray20[local3] >= 0 && this.aByteArray20[local3] <= 32 || (this.aByteArray20[local3] & 0xFF) == 160)) {
			local3++;
		}
		while (local6 > local3 && (this.aByteArray20[local6 - 1] >= 0 && this.aByteArray20[local6 - 1] <= 32 || (this.aByteArray20[local6 - 1] & 0xFF) == 160)) {
			local6--;
		}
		if (local3 == 0 && this.anInt1553 == local6) {
			return this;
		}
		@Pc(94) Class34 local94 = new Class34();
		local94.anInt1553 = local6 - local3;
		local94.aByteArray20 = new byte[local94.anInt1553];
		for (@Pc(107) int local107 = 0; local107 < local94.anInt1553; local107++) {
			local94.aByteArray20[local107] = this.aByteArray20[local3 + local107];
		}
		return local94;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BILclient!id;)I")
	private int method958(@OriginalArg(2) Class34 arg0) {
		@Pc(9) int[] local9 = new int[arg0.anInt1553];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt1553];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg0.anInt1553;
		}
		for (@Pc(32) int local32 = 1; local32 <= arg0.anInt1553; local32++) {
			local9[local32 - 1] = (arg0.anInt1553 << 1) - local32;
			local12[arg0.aByteArray20[local32 - 1] & 0xFF] = arg0.anInt1553 - local32;
		}
		@Pc(75) int local75 = arg0.anInt1553 + 1;
		@Pc(86) int local86 = arg0.anInt1553;
		while (local86 > 0) {
			local16[local86 - 1] = local75;
			while (local75 <= arg0.anInt1553 && arg0.aByteArray20[local86 - 1] != arg0.aByteArray20[local75 - 1]) {
				if (arg0.anInt1553 - local86 <= local9[local75 + -1]) {
					local9[local75 - 1] = arg0.anInt1553 - local86;
				}
				local75 = local16[local75 - 1];
			}
			local86--;
			local75--;
		}
		@Pc(160) int local160 = local75;
		local75 = arg0.anInt1553 + 1 - local75;
		@Pc(170) int local170 = 1;
		@Pc(172) int local172 = 0;
		for (@Pc(174) int local174 = 1; local174 <= local75; local174++) {
			local16[local174 - 1] = local172;
			while (local172 >= 1 && arg0.aByteArray20[local174 - 1] != arg0.aByteArray20[local172 - 1]) {
				local172 = local16[local172 - 1];
			}
			local172++;
		}
		@Pc(219) int local219;
		while (local160 < arg0.anInt1553) {
			for (local219 = local170; local219 <= local160; local219++) {
				if (local9[local219 - 1] >= local160 + arg0.anInt1553 - local219) {
					local9[local219 - 1] = local160 + arg0.anInt1553 - local219;
				}
			}
			local170 = local160 + 1;
			local160 = local75 + local160 - local16[local75 + -1];
			local75 = local16[local75 - 1];
		}
		@Pc(296) int local296;
		for (local219 = arg0.anInt1553 - 1; local219 < this.anInt1553; local219 += Math.max(local12[this.aByteArray20[local219] & 0xFF], local9[local296])) {
			for (local296 = arg0.anInt1553 - 1; local296 >= 0 && this.aByteArray20[local219] == arg0.aByteArray20[local296]; local296--) {
				local219--;
			}
			if (local296 == -1) {
				return local219 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)I")
	public int method959() {
		return this.method964(10);
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(II)Z")
	private boolean method960() {
		@Pc(7) boolean local7 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt1553; local28++) {
			@Pc(37) int local37 = this.aByteArray20[local28] & 0xFF;
			if (local28 == 0) {
				if (local37 == 45) {
					local24 = true;
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
			if (local24) {
				local37 = -local37;
			}
			@Pc(101) int local101 = local26 * 10 + local37;
			if (local26 != local101 / 10) {
				return false;
			}
			local7 = true;
			local26 = local101;
		}
		return local7;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!id;B)Z")
	public boolean method961(@OriginalArg(0) Class34 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1553 == this.anInt1553) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt1553; local18++) {
				@Pc(25) byte local25 = arg0.aByteArray20[local18];
				@Pc(30) byte local30 = this.aByteArray20[local18];
				if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
					local30 = (byte) (local30 + 32);
				}
				if (local25 >= 65 && local25 <= 90 || local25 >= -64 && local25 <= -34 && local25 != -41) {
					local25 = (byte) (local25 + 32);
				}
				if (local25 != local30) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!id", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!id", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class34)) {
			throw new IllegalArgumentException();
		}
		return this.method986((Class34) arg0);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)Lclient!id;")
	public Class34 method962(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class34 local10 = new Class34();
		local10.aByteArray20 = new byte[arg0 - arg1];
		local10.anInt1553 = arg0 - arg1;
		Static140.method1970(this.aByteArray20, arg1, local10.aByteArray20, 0, local10.anInt1553);
		return local10;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)Lclient!id;")
	public Class34 method963() {
		@Pc(3) Class34 local3 = new Class34();
		local3.anInt1553 = this.anInt1553;
		local3.aByteArray20 = new byte[this.anInt1553];
		for (@Pc(23) int local23 = 0; local23 < this.anInt1553; local23++) {
			@Pc(29) byte local29 = this.aByteArray20[local23];
			if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
				local29 = (byte) (local29 + 32);
			}
			local3.aByteArray20[local23] = local29;
		}
		return local3;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(BI)I")
	public int method964(@OriginalArg(1) int arg0) {
		@Pc(13) boolean local13 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt1553; local23++) {
			@Pc(32) int local32 = this.aByteArray20[local23] & 0xFF;
			if (local23 == 0) {
				if (local32 == 45) {
					local13 = true;
					continue;
				}
				if (local32 == 43) {
					continue;
				}
			}
			if (local32 >= 48 && local32 <= 57) {
				local32 -= 48;
			} else if (local32 >= 65 && local32 <= 90) {
				local32 -= 55;
			} else if (local32 >= 97 && local32 <= 122) {
				local32 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (local32 >= arg0) {
				throw new NumberFormatException();
			}
			if (local13) {
				local32 = -local32;
			}
			@Pc(106) int local106 = local32 + arg0 * local21;
			if (local21 != local106 / arg0) {
				throw new NumberFormatException();
			}
			local19 = true;
			local21 = local106;
		}
		if (!local19) {
			throw new NumberFormatException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)J")
	public long method965() {
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; this.anInt1553 > local12 && local12 < 12; local12++) {
			@Pc(18) byte local18 = this.aByteArray20[local12];
			local10 *= 37L;
			if (local18 >= 65 && local18 <= 90) {
				local10 += local18 + 1 - 65;
			} else if (local18 >= 97 && local18 <= 122) {
				local10 += local18 - 96;
			} else if (local18 >= 48 && local18 <= 57) {
				local10 += local18 + 27 - 48;
			}
		}
		while (local10 % 37L == 0L && local10 != 0L) {
			local10 /= 37L;
		}
		return local10;
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(I)Lclient!id;")
	public Class34 method966() {
		@Pc(5) Class34 local5 = new Class34();
		@Pc(7) int local7 = 0;
		local5.anInt1553 = 0;
		local5.aByteArray20 = new byte[12];
		for (@Pc(20) int local20 = 0; local20 < this.anInt1553; local20++) {
			if (this.aByteArray20[local20] >= 65 && this.aByteArray20[local20] <= 90) {
				local5.aByteArray20[local7++] = (byte) (this.aByteArray20[local20] + 32);
				local5.anInt1553 = local7;
			} else if (this.aByteArray20[local20] >= 97 && this.aByteArray20[local20] <= 122 || this.aByteArray20[local20] >= 48 && this.aByteArray20[local20] <= 57) {
				local5.aByteArray20[local7++] = this.aByteArray20[local20];
				local5.anInt1553 = local7;
			} else if (local7 > 0) {
				local5.aByteArray20[local7++] = 95;
			}
			if (local7 == 12) {
				break;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!id;Z)I")
	public int method967(@OriginalArg(0) Class34 arg0) {
		@Pc(13) int local13;
		if (arg0.anInt1553 >= this.anInt1553) {
			local13 = this.anInt1553;
		} else {
			local13 = arg0.anInt1553;
		}
		for (@Pc(25) int local25 = 0; local25 < local13; local25++) {
			if ((arg0.aByteArray20[local25] & 0xFF) > (this.aByteArray20[local25] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray20[local25] & 0xFF) > (arg0.aByteArray20[local25] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt1553 < arg0.anInt1553) {
			return -1;
		} else if (this.anInt1553 > arg0.anInt1553) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Z")
	public boolean method968() {
		return this.method960();
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(B)Lclient!id;")
	public Class34 method969() {
		@Pc(9) Class34 local9 = new Class34();
		local9.anInt1553 = this.anInt1553;
		local9.aByteArray20 = new byte[this.anInt1553];
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < this.anInt1553; local27++) {
			@Pc(34) byte local34 = this.aByteArray20[local27];
			if (local34 == 95) {
				local25 = true;
				local9.aByteArray20[local27] = 32;
			} else if (local34 >= 97 && local34 <= 122 && local25) {
				local25 = false;
				local9.aByteArray20[local27] = (byte) (local34 - 32);
			} else {
				local9.aByteArray20[local27] = local34;
				local25 = false;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "(I)I")
	public int method970() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1553; local7++) {
			local5 = (local5 << 5) + (this.aByteArray20[local7] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray20, 0, this.anInt1553, "ISO-8859-1");
		} catch (@Pc(21) UnsupportedEncodingException local21) {
			local13 = new String(this.aByteArray20, 0, this.anInt1553);
		}
		arg2.drawString(local13, arg0, arg1);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!id;I)Lclient!id;")
	public Class34 method972(@OriginalArg(0) Class34 arg0) {
		if (!this.aBoolean85) {
			throw new IllegalArgumentException();
		}
		this.anInt1550 = 0;
		if (this.aByteArray20.length < arg0.anInt1553 + this.anInt1553) {
			@Pc(26) int local26;
			for (local26 = 1; local26 < this.anInt1553 + arg0.anInt1553; local26 += local26) {
			}
			@Pc(42) byte[] local42 = new byte[local26];
			Static140.method1970(this.aByteArray20, 0, local42, 0, this.anInt1553);
			this.aByteArray20 = local42;
		}
		Static140.method1970(arg0.aByteArray20, 0, this.aByteArray20, this.anInt1553, arg0.anInt1553);
		this.anInt1553 += arg0.anInt1553;
		return this;
	}

	@OriginalMember(owner = "client!id", name = "g", descriptor = "(I)J")
	private long method973() {
		@Pc(5) long local5 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt1553; local14++) {
			local5 = (local5 << 5) + (long) (this.aByteArray20[local14] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)Lclient!id;")
	public Class34 method974() {
		if (!this.aBoolean85) {
			throw new IllegalArgumentException();
		}
		this.anInt1550 = 0;
		if (this.aByteArray20.length != this.anInt1553) {
			@Pc(35) byte[] local35 = new byte[this.anInt1553];
			Static140.method1970(this.aByteArray20, 0, local35, 0, this.anInt1553);
			this.aByteArray20 = local35;
		}
		return this;
	}

	@OriginalMember(owner = "client!id", name = "h", descriptor = "(I)[B")
	public byte[] method975() {
		@Pc(7) byte[] local7 = new byte[this.anInt1553];
		Static140.method1970(this.aByteArray20, 0, local7, 0, this.anInt1553);
		return local7;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(BI)Lclient!id;")
	public Class34 method976(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean85) {
			this.anInt1550 = 0;
			if (this.aByteArray20.length == this.anInt1553) {
				@Pc(45) int local45;
				for (local45 = 1; local45 <= this.anInt1553; local45 += local45) {
				}
				@Pc(62) byte[] local62 = new byte[local45];
				Static140.method1970(this.aByteArray20, 0, local62, 0, this.anInt1553);
				this.aByteArray20 = local62;
			}
			this.aByteArray20[this.anInt1553++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!id", name = "i", descriptor = "(I)Lclient!id;")
	public Class34 method977() {
		@Pc(9) Class34 local9 = new Class34();
		local9.anInt1553 = this.anInt1553;
		local9.aByteArray20 = new byte[this.anInt1553];
		for (@Pc(20) int local20 = 0; local20 < this.anInt1553; local20++) {
			local9.aByteArray20[local20] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZI)I")
	private int method978(@OriginalArg(0) int arg0) {
		@Pc(8) byte local8 = (byte) arg0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt1553; local10++) {
			if (this.aByteArray20[local10] == local8) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)Lclient!id;")
	public Class34 method979() {
		@Pc(7) Class34 local7 = new Class34();
		@Pc(9) byte local9 = 2;
		local7.anInt1553 = this.anInt1553;
		local7.aByteArray20 = new byte[this.anInt1553];
		for (@Pc(20) int local20 = 0; local20 < this.anInt1553; local20++) {
			@Pc(26) byte local26 = this.aByteArray20[local20];
			if (local26 >= 97 && local26 <= 122 || !(local26 < -32 || local26 > -2 || local26 == -9)) {
				if (local9 == 2) {
					local26 = (byte) (local26 - 32);
				}
				local9 = 0;
			} else if (local26 >= 65 && local26 <= 90 || !(local26 < -64 || local26 > -34 || local26 == -41)) {
				if (local9 == 0) {
					local26 = (byte) (local26 + 32);
				}
				local9 = 0;
			} else if (local26 == 46 || local26 == 33 || local26 == 63) {
				local9 = 2;
			} else if (local26 != 32) {
				local9 = 1;
			} else if (local9 != 2) {
				local9 = 1;
			}
			local7.aByteArray20[local20] = local26;
		}
		return local7;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIBI[B)I")
	public int method980(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2) {
		Static140.method1970(this.aByteArray20, 0, arg2, arg1, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Lclient!id;I)I")
	public int method981(@OriginalArg(0) Class34 arg0) {
		return this.method958(arg0);
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(B)I")
	public int method982() {
		return this.anInt1553;
	}

	@OriginalMember(owner = "client!id", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method970();
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(Lclient!id;I)Z")
	public boolean method983(@OriginalArg(0) Class34 arg0) {
		if (this.anInt1553 < arg0.anInt1553) {
			return false;
		}
		@Pc(19) int local19 = this.anInt1553 - arg0.anInt1553;
		for (@Pc(26) int local26 = 0; local26 < arg0.anInt1553; local26++) {
			if (this.aByteArray20[local19 + local26] != arg0.aByteArray20[local26]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!id", name = "j", descriptor = "(I)Lclient!id;")
	public Class34 method984() {
		@Pc(9) long local9 = this.method973();
		@Pc(18) Class local18 = id.class;
		synchronized (id.class) {
			@Pc(28) Class1_Sub21 local28;
			if (Static92.aClass48_11 == null) {
				Static92.aClass48_11 = new Class48(4096);
			} else {
				for (local28 = (Class1_Sub21) Static92.aClass48_11.method1340(local9); local28 != null; local28 = (Class1_Sub21) Static92.aClass48_11.method1341()) {
					if (this.method986(local28.aClass34_1247)) {
						return local28.aClass34_1247;
					}
				}
			}
			local28 = new Class1_Sub21();
			local28.aClass34_1247 = this;
			this.aBoolean85 = false;
			Static92.aClass48_11.method1336(local9, local28);
			return this;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!id;)Z")
	public boolean method985(@OriginalArg(1) Class34 arg0) {
		if (arg0.anInt1553 > this.anInt1553) {
			return false;
		}
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt1553; local22++) {
			if (arg0.aByteArray20[local22] != this.aByteArray20[local22]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(Lclient!id;I)Z")
	public boolean method986(@OriginalArg(0) Class34 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1553 == this.anInt1553) {
			if (!this.aBoolean85 || !arg0.aBoolean85) {
				if (this.anInt1550 == 0) {
					this.anInt1550 = this.method970();
					if (this.anInt1550 == 0) {
						this.anInt1550 = 1;
					}
				}
				if (arg0.anInt1550 == 0) {
					arg0.anInt1550 = arg0.method970();
					if (arg0.anInt1550 == 0) {
						arg0.anInt1550 = 1;
					}
				}
				if (this.anInt1550 != arg0.anInt1550) {
					return false;
				}
			}
			for (@Pc(76) int local76 = 0; local76 < this.anInt1553; local76++) {
				if (this.aByteArray20[local76] != arg0.aByteArray20[local76]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!id", name = "k", descriptor = "(I)Ljava/net/URL;")
	public URL method987() throws MalformedURLException {
		return new URL(new String(this.aByteArray20, 0, this.anInt1553));
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IB)I")
	public int method988(@OriginalArg(0) int arg0) {
		return this.method978(arg0);
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(II)Lclient!id;")
	public Class34 method990(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(27) Class34 local27 = new Class34();
		local27.aByteArray20 = new byte[this.anInt1553 + 1];
		local27.anInt1553 = this.anInt1553 + 1;
		Static140.method1970(this.aByteArray20, 0, local27.aByteArray20, 0, this.anInt1553);
		local27.aByteArray20[this.anInt1553] = (byte) arg0;
		return local27;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!id;)I")
	public int method991(@OriginalArg(1) Class34 arg0) {
		@Pc(11) int local11;
		if (this.anInt1553 <= arg0.anInt1553) {
			local11 = this.anInt1553;
		} else {
			local11 = arg0.anInt1553;
		}
		for (@Pc(28) int local28 = 0; local28 < local11; local28++) {
			if (Static71.anIntArray226[arg0.aByteArray20[local28] & 0xFF] > Static71.anIntArray226[this.aByteArray20[local28] & 0xFF]) {
				return -1;
			}
			if (Static71.anIntArray226[arg0.aByteArray20[local28] & 0xFF] < Static71.anIntArray226[this.aByteArray20[local28] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt1553 < arg0.anInt1553) {
			return -1;
		} else if (arg0.anInt1553 < this.anInt1553) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I")
	public int method992(@OriginalArg(1) FontMetrics arg0) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray20, 0, this.anInt1553, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray20, 0, this.anInt1553);
		}
		return arg0.stringWidth(local9);
	}
}
