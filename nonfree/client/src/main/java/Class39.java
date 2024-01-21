import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class39 implements Interface2 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "[I")
	public static int[] anIntArray245 = new int[32];

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
	private int anInt1676;

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
	public int anInt1707;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Z")
	private boolean aBoolean144 = true;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray245[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)Lclient!kd;")
	public Class39 method1148() {
		if (!this.aBoolean144) {
			throw new IllegalArgumentException();
		}
		this.anInt1676 = 0;
		if (this.aByteArray50.length != this.anInt1707) {
			@Pc(28) byte[] local28 = new byte[this.anInt1707];
			Static136.method1939(this.aByteArray50, 0, local28, 0, this.anInt1707);
			this.aByteArray50 = local28;
		}
		return this;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)J")
	private long method1149() {
		@Pc(1) long local1 = 0L;
		for (@Pc(8) int local8 = 0; local8 < this.anInt1707; local8++) {
			local1 = (long) (this.aByteArray50[local8] & 0xFF) + (local1 << 5) - local1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Lclient!kd;")
	public Class39 method1150(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(20) Class39 local20 = new Class39();
		local20.aByteArray50 = new byte[this.anInt1707 + 1];
		local20.anInt1707 = this.anInt1707 + 1;
		Static136.method1939(this.aByteArray50, 0, local20.aByteArray50, 0, this.anInt1707);
		local20.aByteArray50[this.anInt1707] = (byte) arg0;
		return local20;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)Lclient!kd;")
	public Class39 method1151() {
		@Pc(9) Class39 local9 = new Class39();
		local9.anInt1707 = this.anInt1707;
		local9.aByteArray50 = new byte[this.anInt1707];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1707; local25++) {
			@Pc(32) byte local32 = this.aByteArray50[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local9.aByteArray50[local25] = local32;
		}
		return local9;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)Lclient!kd;")
	public Class39 method1152() {
		@Pc(5) Class39 local5 = new Class39();
		local5.aByteArray50 = new byte[12];
		local5.anInt1707 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt1707; local27++) {
			if (this.aByteArray50[local27] >= 65 && this.aByteArray50[local27] <= 90) {
				local5.aByteArray50[local25++] = (byte) (this.aByteArray50[local27] + 97 - 65);
				local5.anInt1707 = local25;
			} else if (this.aByteArray50[local27] >= 97 && this.aByteArray50[local27] <= 122 || this.aByteArray50[local27] >= 48 && this.aByteArray50[local27] <= 57) {
				local5.aByteArray50[local25++] = this.aByteArray50[local27];
				local5.anInt1707 = local25;
			} else if (local25 > 0) {
				local5.aByteArray50[local25++] = 95;
			}
			if (local25 == 12) {
				break;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)Lclient!kd;")
	public Class39 method1153() {
		@Pc(9) Class39 local9 = new Class39();
		local9.anInt1707 = this.anInt1707;
		@Pc(15) boolean local15 = true;
		local9.aByteArray50 = new byte[this.anInt1707];
		for (@Pc(22) int local22 = 0; local22 < this.anInt1707; local22++) {
			@Pc(29) byte local29 = this.aByteArray50[local22];
			if (local29 == 95) {
				local15 = true;
				local9.aByteArray50[local22] = 32;
			} else if (local29 >= 97 && local29 <= 122 && local15) {
				local9.aByteArray50[local22] = (byte) (local29 - 32);
				local15 = false;
			} else {
				local9.aByteArray50[local22] = local29;
				local15 = false;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)Lclient!kd;")
	public Class39 method1154() {
		@Pc(14) long local14 = this.method1149();
		@Pc(23) Class local23 = kd.class;
		synchronized (kd.class) {
			@Pc(39) Class1_Sub14 local39;
			if (Static122.aClass70_12 == null) {
				Static122.aClass70_12 = new Class70(4096);
			} else {
				for (local39 = (Class1_Sub14) Static122.aClass70_12.method1961(local14); local39 != null; local39 = (Class1_Sub14) Static122.aClass70_12.method1963()) {
					if (this.method1159(local39.aClass39_955)) {
						return local39.aClass39_955;
					}
				}
			}
			local39 = new Class1_Sub14();
			this.aBoolean144 = false;
			local39.aClass39_955 = this;
			Static122.aClass70_12.method1955(local39, local14);
			return this;
		}
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)[B")
	public byte[] method1155() {
		@Pc(14) byte[] local14 = new byte[this.anInt1707];
		Static136.method1939(this.aByteArray50, 0, local14, 0, this.anInt1707);
		return local14;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILclient!kd;)I")
	private int method1156(@OriginalArg(2) Class39 arg0) {
		@Pc(9) int[] local9 = new int[arg0.anInt1707];
		@Pc(13) int[] local13 = new int[arg0.anInt1707];
		@Pc(16) int[] local16 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			local16[local18] = arg0.anInt1707;
		}
		for (@Pc(37) int local37 = 1; local37 <= arg0.anInt1707; local37++) {
			local9[local37 - 1] = (arg0.anInt1707 << 1) - local37;
			local16[arg0.aByteArray50[local37 - 1] & 0xFF] = arg0.anInt1707 - local37;
		}
		@Pc(80) int local80 = arg0.anInt1707 + 1;
		for (@Pc(83) int local83 = arg0.anInt1707; local83 > 0; local83--) {
			local13[local83 - 1] = local80;
			while (local80 <= arg0.anInt1707 && arg0.aByteArray50[local80 - 1] != arg0.aByteArray50[local83 - 1]) {
				if (local9[local80 - 1] >= arg0.anInt1707 - local83) {
					local9[local80 - 1] = arg0.anInt1707 - local83;
				}
				local80 = local13[local80 - 1];
			}
			local80--;
		}
		@Pc(146) int local146 = local80;
		local80 = arg0.anInt1707 + 1 - local80;
		@Pc(156) int local156 = 1;
		@Pc(158) int local158 = 0;
		for (@Pc(160) int local160 = 1; local160 <= local80; local160++) {
			local13[local160 - 1] = local158;
			while (local158 >= 1 && arg0.aByteArray50[local158 - 1] != arg0.aByteArray50[local160 - 1]) {
				local158 = local13[local158 - 1];
			}
			local158++;
		}
		@Pc(201) int local201;
		while (arg0.anInt1707 > local146) {
			for (local201 = local156; local201 <= local146; local201++) {
				if (local146 + arg0.anInt1707 - local201 <= local9[local201 - 1]) {
					local9[local201 - 1] = arg0.anInt1707 + local146 - local201;
				}
			}
			local156 = local146 + 1;
			local146 = local146 + local80 - local13[local80 - 1];
			local80 = local13[local80 - 1];
		}
		@Pc(279) int local279;
		for (local201 = arg0.anInt1707 - 1; local201 < this.anInt1707; local201 += Math.max(local16[this.aByteArray50[local201] & 0xFF], local9[local279])) {
			for (local279 = arg0.anInt1707 - 1; local279 >= 0 && this.aByteArray50[local201] == arg0.aByteArray50[local279]; local279--) {
				local201--;
			}
			if (local279 == -1) {
				return local201 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)Ljava/net/URL;")
	public URL method1157() throws MalformedURLException {
		return new URL(new String(this.aByteArray50, 0, this.anInt1707));
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!kd;I)Z")
	public boolean method1158(@OriginalArg(0) Class39 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1707 == this.anInt1707) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt1707; local20++) {
				@Pc(26) byte local26 = this.aByteArray50[local20];
				if (local26 >= 65 && local26 <= 90 || local26 >= -64 && local26 <= -34 && local26 != -41) {
					local26 = (byte) (local26 + 32);
				}
				@Pc(57) byte local57 = arg0.aByteArray50[local20];
				if (local57 >= 65 && local57 <= 90 || local57 >= -64 && local57 <= -34 && local57 != -41) {
					local57 = (byte) (local57 + 32);
				}
				if (local26 != local57) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!kd;)Z")
	public boolean method1159(@OriginalArg(1) Class39 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1707 == this.anInt1707) {
			if (!this.aBoolean144 || !arg0.aBoolean144) {
				if (this.anInt1676 == 0) {
					this.anInt1676 = this.method1177();
					if (this.anInt1676 == 0) {
						this.anInt1676 = 1;
					}
				}
				if (arg0.anInt1676 == 0) {
					arg0.anInt1676 = arg0.method1177();
					if (arg0.anInt1676 == 0) {
						arg0.anInt1676 = 1;
					}
				}
				if (arg0.anInt1676 != this.anInt1676) {
					return false;
				}
			}
			for (@Pc(68) int local68 = 0; local68 < this.anInt1707; local68++) {
				if (arg0.aByteArray50[local68] != this.aByteArray50[local68]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)I")
	public int method1160() {
		return this.method1164();
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)I")
	public int method1161() {
		return this.method1172(10);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII[B)I")
	public int method1162(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2) {
		Static136.method1939(this.aByteArray50, 0, arg2, arg1, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IZ)Z")
	private boolean method1163() {
		@Pc(13) boolean local13 = false;
		@Pc(19) int local19 = 0;
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < this.anInt1707; local23++) {
			@Pc(32) int local32 = this.aByteArray50[local23] & 0xFF;
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
				return false;
			}
			if (local32 >= 10) {
				return false;
			}
			if (local13) {
				local32 = -local32;
			}
			@Pc(101) int local101 = local19 * 10 + local32;
			if (local101 / 10 != local19) {
				return false;
			}
			local21 = true;
			local19 = local101;
		}
		return local21;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
	private int method1164() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt1707; local15++) {
			if (this.aByteArray50[local15] == 32) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)Lclient!kd;")
	public Class39 method1165() {
		@Pc(3) Class39 local3 = new Class39();
		local3.anInt1707 = this.anInt1707;
		local3.aByteArray50 = new byte[this.anInt1707];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1707; local18++) {
			local3.aByteArray50[local18] = 42;
		}
		return local3;
	}

	@OriginalMember(owner = "client!kd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(ILclient!kd;)I")
	public int method1166(@OriginalArg(1) Class39 arg0) {
		return this.method1156(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(IZ)I")
	public int method1167(@OriginalArg(0) int arg0) {
		return this.aByteArray50[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)Lclient!kd;")
	public Class39 method1168() {
		@Pc(10) byte local10 = 2;
		@Pc(14) Class39 local14 = new Class39();
		local14.anInt1707 = this.anInt1707;
		local14.aByteArray50 = new byte[this.anInt1707];
		for (@Pc(29) int local29 = 0; local29 < this.anInt1707; local29++) {
			@Pc(36) byte local36 = this.aByteArray50[local29];
			if (local36 >= 97 && local36 <= 122 || !(local36 < -32 || local36 > -2 || local36 == -9)) {
				if (local10 == 2) {
					local36 = (byte) (local36 - 32);
				}
				local10 = 0;
			} else if (local36 >= 65 && local36 <= 90 || !(local36 < -64 || local36 > -34 || local36 == -41)) {
				if (local10 == 0) {
					local36 = (byte) (local36 + 32);
				}
				local10 = 0;
			} else if (local36 == 46 || local36 == 33 || local36 == 63) {
				local10 = 2;
			} else if (local36 != 32) {
				local10 = 1;
			} else if (local10 != 2) {
				local10 = 1;
			}
			local14.aByteArray50[local29] = local36;
		}
		return local14;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLclient!kd;)Lclient!kd;")
	public Class39 method1169(@OriginalArg(1) Class39 arg0) {
		if (!this.aBoolean144) {
			throw new IllegalArgumentException();
		}
		this.anInt1676 = 0;
		if (this.aByteArray50.length < arg0.anInt1707 + this.anInt1707) {
			@Pc(26) int local26;
			for (local26 = 1; local26 < this.anInt1707 + arg0.anInt1707; local26 += local26) {
			}
			@Pc(47) byte[] local47 = new byte[local26];
			Static136.method1939(this.aByteArray50, 0, local47, 0, this.anInt1707);
			this.aByteArray50 = local47;
		}
		Static136.method1939(arg0.aByteArray50, 0, this.aByteArray50, this.anInt1707, arg0.anInt1707);
		this.anInt1707 += arg0.anInt1707;
		return this;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(ILclient!kd;)Z")
	public boolean method1170(@OriginalArg(1) Class39 arg0) {
		if (this.anInt1707 < arg0.anInt1707) {
			return false;
		}
		@Pc(28) int local28 = this.anInt1707 - arg0.anInt1707;
		for (@Pc(30) int local30 = 0; local30 < arg0.anInt1707; local30++) {
			if (this.aByteArray50[local30 + local28] != arg0.aByteArray50[local30]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class39)) {
			throw new IllegalArgumentException();
		}
		return this.method1159((Class39) arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method1171(@OriginalArg(0) FontMetrics arg0) {
		@Pc(20) String local20;
		try {
			local20 = new String(this.aByteArray50, 0, this.anInt1707, "ISO-8859-1");
		} catch (@Pc(22) UnsupportedEncodingException local22) {
			local20 = new String(this.aByteArray50, 0, this.anInt1707);
		}
		return arg0.stringWidth(local20);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)I")
	public int method1172(@OriginalArg(1) int arg0) {
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt1707; local25++) {
			@Pc(34) int local34 = this.aByteArray50[local25] & 0xFF;
			if (local25 == 0) {
				if (local34 == 45) {
					local21 = true;
					continue;
				}
				if (local34 == 43) {
					continue;
				}
			}
			if (local34 >= 48 && local34 <= 57) {
				local34 -= 48;
			} else if (local34 >= 65 && local34 <= 90) {
				local34 -= 55;
			} else if (local34 >= 97 && local34 <= 122) {
				local34 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local34) {
				throw new NumberFormatException();
			}
			if (local21) {
				local34 = -local34;
			}
			@Pc(106) int local106 = local34 + local23 * arg0;
			if (local106 / arg0 != local23) {
				throw new NumberFormatException();
			}
			local23 = local106;
			local19 = true;
		}
		if (!local19) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)Lclient!kd;")
	public Class39 method1173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class39 local7 = new Class39();
		local7.anInt1707 = arg0 - arg1;
		local7.aByteArray50 = new byte[arg0 - arg1];
		Static136.method1939(this.aByteArray50, arg1, local7.aByteArray50, 0, local7.anInt1707);
		return local7;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)I")
	public int method1175() {
		return this.anInt1707;
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(B)I")
	public int method1177() {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1707; local15++) {
			local13 = (local13 << 5) + (this.aByteArray50[local15] & 0xFF) - local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!kd", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1177();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
	public void method1178(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray50, 0, this.anInt1707, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray50, 0, this.anInt1707);
		}
		arg1.drawString(local18, arg2, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)Z")
	public boolean method1179() {
		return this.method1163();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!kd;B)I")
	public int method1180(@OriginalArg(0) Class39 arg0) {
		@Pc(22) int local22;
		if (this.anInt1707 <= arg0.anInt1707) {
			local22 = this.anInt1707;
		} else {
			local22 = arg0.anInt1707;
		}
		for (@Pc(29) int local29 = 0; local29 < local22; local29++) {
			if ((arg0.aByteArray50[local29] & 0xFF) > (this.aByteArray50[local29] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray50[local29] & 0xFF) < (this.aByteArray50[local29] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt1707 < arg0.anInt1707) {
			return -1;
		} else if (arg0.anInt1707 < this.anInt1707) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lclient!kd;")
	public Class39 method1181(@OriginalArg(0) int arg0) {
		return this.method1173(this.anInt1707, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(ILclient!kd;)I")
	public int method1182(@OriginalArg(1) Class39 arg0) {
		@Pc(13) int local13;
		if (this.anInt1707 <= arg0.anInt1707) {
			local13 = this.anInt1707;
		} else {
			local13 = arg0.anInt1707;
		}
		for (@Pc(32) int local32 = 0; local32 < local13; local32++) {
			if (Static76.anIntArray267[this.aByteArray50[local32] & 0xFF] < Static76.anIntArray267[arg0.aByteArray50[local32] & 0xFF]) {
				return -1;
			}
			if (Static76.anIntArray267[arg0.aByteArray50[local32] & 0xFF] < Static76.anIntArray267[this.aByteArray50[local32] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt1707 < arg0.anInt1707) {
			return -1;
		} else if (this.anInt1707 > arg0.anInt1707) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)Lclient!kd;")
	public Class39 method1183() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt1707 && (this.aByteArray50[local7] >= 0 && this.aByteArray50[local7] <= 32 || (this.aByteArray50[local7] & 0xFF) == 160); local7++) {
		}
		@Pc(47) int local47;
		for (local47 = this.anInt1707; local7 < local47 && (this.aByteArray50[local47 - 1] >= 0 && this.aByteArray50[local47 - 1] <= 32 || (this.aByteArray50[local47 - 1] & 0xFF) == 160); local47--) {
		}
		if (local7 == 0 && this.anInt1707 == local47) {
			return this;
		}
		@Pc(95) Class39 local95 = new Class39();
		local95.anInt1707 = local47 - local7;
		local95.aByteArray50 = new byte[local95.anInt1707];
		for (@Pc(107) int local107 = 0; local107 < local95.anInt1707; local107++) {
			local95.aByteArray50[local107] = this.aByteArray50[local107 + local7];
		}
		return local95;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)Lclient!kd;")
	public Class39 method1184(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean144) {
			this.anInt1676 = 0;
			if (this.anInt1707 == this.aByteArray50.length) {
				@Pc(54) int local54;
				for (local54 = 1; local54 <= this.anInt1707; local54 += local54) {
				}
				@Pc(71) byte[] local71 = new byte[local54];
				Static136.method1939(this.aByteArray50, 0, local71, 0, this.anInt1707);
				this.aByteArray50 = local71;
			}
			this.aByteArray50[this.anInt1707++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(ILclient!kd;)Z")
	public boolean method1185(@OriginalArg(1) Class39 arg0) {
		if (arg0.anInt1707 > this.anInt1707) {
			return false;
		}
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt1707; local22++) {
			if (this.aByteArray50[local22] != arg0.aByteArray50[local22]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)J")
	public long method1186() {
		@Pc(7) long local7 = 0L;
		for (@Pc(9) int local9 = 0; this.anInt1707 > local9 && local9 < 12; local9++) {
			local7 *= 37L;
			@Pc(20) byte local20 = this.aByteArray50[local9];
			if (local20 >= 65 && local20 <= 90) {
				local7 += local20 + 1 - 65;
			} else if (local20 >= 97 && local20 <= 122) {
				local7 += local20 + 1 - 97;
			} else if (local20 >= 48 && local20 <= 57) {
				local7 += local20 + 27 - 48;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}
}
