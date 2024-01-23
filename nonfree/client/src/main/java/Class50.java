import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class50 implements Interface1 {

	@OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
	public int anInt1705;

	@OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
	private int anInt1707;

	@OriginalMember(owner = "client!hh", name = "eb", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!hh", name = "Y", descriptor = "Z")
	private boolean aBoolean81 = true;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILjava/net/URL;)Ljava/net/URL;")
	public URL method1211(@OriginalArg(1) URL arg0) throws MalformedURLException {
		return new URL(arg0, new String(this.aByteArray12, 0, this.anInt1705));
	}

	@OriginalMember(owner = "client!hh", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1229();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Ljava/net/URL;")
	public URL method1212() throws MalformedURLException {
		return new URL(new String(this.aByteArray12, 0, this.anInt1705));
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!hh;)Z")
	public boolean method1213(@OriginalArg(1) Class50 arg0) {
		if (this.anInt1705 < arg0.anInt1705) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < arg0.anInt1705; local18++) {
			@Pc(25) byte local25 = this.aByteArray12[local18];
			@Pc(30) byte local30 = arg0.aByteArray12[local18];
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
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)Lclient!hh;")
	public Class50 method1215() {
		if (!this.aBoolean81) {
			throw new IllegalArgumentException();
		}
		this.anInt1707 = 0;
		if (this.anInt1705 != this.aByteArray12.length) {
			@Pc(31) byte[] local31 = new byte[this.anInt1705];
			Static235.method866(this.aByteArray12, 0, local31, 0, this.anInt1705);
			this.aByteArray12 = local31;
		}
		return this;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZII)Lclient!hh;")
	public Class50 method1216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class50 local7 = new Class50();
		local7.aByteArray12 = new byte[arg0 - arg1];
		local7.anInt1705 = arg0 - arg1;
		Static235.method866(this.aByteArray12, arg1, local7.aByteArray12, 0, local7.anInt1705);
		return local7;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/applet/Applet;B)Ljava/lang/Object;")
	public Object method1217(@OriginalArg(0) Applet arg0) throws Throwable {
		@Pc(12) String local12 = new String(this.aByteArray12, 0, this.anInt1705);
		@Pc(18) Object local18 = Static238.method1578(arg0, local12, null);
		if (local18 instanceof String) {
			@Pc(30) byte[] local30 = ((String) local18).getBytes();
			local18 = Static20.method301(local30.length, 0, local30);
		}
		return local18;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)Lclient!hh;")
	public Class50 method1218() {
		@Pc(9) Class50 local9 = new Class50();
		@Pc(11) boolean local11 = true;
		local9.anInt1705 = this.anInt1705;
		local9.aByteArray12 = new byte[this.anInt1705];
		for (@Pc(27) int local27 = 0; local27 < this.anInt1705; local27++) {
			@Pc(34) byte local34 = this.aByteArray12[local27];
			if (local34 == 95) {
				local11 = true;
				local9.aByteArray12[local27] = 32;
			} else if (local34 >= 97 && local34 <= 122 && local11) {
				local11 = false;
				local9.aByteArray12[local27] = (byte) (local34 - 32);
			} else {
				local11 = false;
				local9.aByteArray12[local27] = local34;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Lclient!hh;")
	public Class50 method1219(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(22) Class50 local22 = new Class50();
		local22.aByteArray12 = new byte[this.anInt1705 + 1];
		local22.anInt1705 = this.anInt1705 + 1;
		Static235.method866(this.aByteArray12, 0, local22.aByteArray12, 0, this.anInt1705);
		local22.aByteArray12[this.anInt1705] = (byte) arg0;
		return local22;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!hh;I)I")
	public int method1220(@OriginalArg(0) Class50 arg0) {
		@Pc(13) int local13;
		if (this.anInt1705 <= arg0.anInt1705) {
			local13 = this.anInt1705;
		} else {
			local13 = arg0.anInt1705;
		}
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			if ((arg0.aByteArray12[local20] & 0xFF) > (this.aByteArray12[local20] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray12[local20] & 0xFF) > (arg0.aByteArray12[local20] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt1705 < arg0.anInt1705) {
			return -1;
		} else if (this.anInt1705 > arg0.anInt1705) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)J")
	public long method1221() {
		@Pc(7) long local7 = 0L;
		for (@Pc(15) int local15 = 0; this.anInt1705 > local15 && local15 < 12; local15++) {
			local7 *= 37L;
			@Pc(26) byte local26 = this.aByteArray12[local15];
			if (local26 >= 65 && local26 <= 90) {
				local7 += local26 + 1 - 65;
			} else if (local26 >= 97 && local26 <= 122) {
				local7 += local26 - 96;
			} else if (local26 >= 48 && local26 <= 57) {
				local7 += local26 - 21;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)Lclient!hh;")
	public Class50 method1222() {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = this.anInt1705;
		while (this.anInt1705 > local7 && (this.aByteArray12[local7] >= 0 && this.aByteArray12[local7] <= 32 || (this.aByteArray12[local7] & 0xFF) == 160)) {
			local7++;
		}
		while (local10 > local7 && (this.aByteArray12[local10 - 1] >= 0 && this.aByteArray12[local10 - 1] <= 32 || (this.aByteArray12[local10 - 1] & 0xFF) == 160)) {
			local10--;
		}
		if (local7 == 0 && this.anInt1705 == local10) {
			return this;
		}
		@Pc(97) Class50 local97 = new Class50();
		local97.anInt1705 = local10 - local7;
		local97.aByteArray12 = new byte[local97.anInt1705];
		for (@Pc(115) int local115 = 0; local115 < local97.anInt1705; local115++) {
			local97.aByteArray12[local115] = this.aByteArray12[local115 + local7];
		}
		return local97;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(ILclient!hh;)Z")
	public boolean method1223(@OriginalArg(1) Class50 arg0) {
		if (arg0.anInt1705 > this.anInt1705) {
			return false;
		}
		@Pc(23) int local23 = this.anInt1705 - arg0.anInt1705;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1705; local25++) {
			if (arg0.aByteArray12[local25] != this.aByteArray12[local23 + local25]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLjava/applet/Applet;)Lclient!hh;")
	public Class50 method1224(@OriginalArg(1) Applet arg0) {
		@Pc(12) String local12 = new String(this.aByteArray12, 0, this.anInt1705);
		@Pc(21) String local21 = arg0.getParameter(local12);
		return local21 == null ? null : Static149.method2502(local21);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)I")
	public int method1225(@OriginalArg(1) int arg0) {
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1705; local29++) {
			@Pc(38) int local38 = this.aByteArray12[local29] & 0xFF;
			if (local29 == 0) {
				if (local38 == 45) {
					local17 = true;
					continue;
				}
				if (local38 == 43) {
					continue;
				}
			}
			if (local38 >= 48 && local38 <= 57) {
				local38 -= 48;
			} else if (local38 >= 65 && local38 <= 90) {
				local38 -= 55;
			} else if (local38 >= 97 && local38 <= 122) {
				local38 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (local38 >= arg0) {
				throw new NumberFormatException();
			}
			if (local17) {
				local38 = -local38;
			}
			@Pc(111) int local111 = local38 + arg0 * local21;
			if (local21 != local111 / arg0) {
				throw new NumberFormatException();
			}
			local19 = true;
			local21 = local111;
		}
		if (!local19) {
			throw new NumberFormatException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III[BI)I")
	public int method1226(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2) {
		Static235.method866(this.aByteArray12, 0, arg1, arg0, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)[B")
	public byte[] method1227() {
		if (this.anInt1705 == 0) {
			return new byte[0];
		}
		@Pc(22) int local22 = this.anInt1705 + 3 & 0xFFFFFFFC;
		@Pc(28) int local28 = local22 / 4 * 3;
		if (local22 - 2 >= this.anInt1705 || Static109.method1733(this.aByteArray12[local22 - 2]) == -1) {
			local28 -= 2;
		} else if (this.anInt1705 <= local22 - 1 || Static109.method1733(this.aByteArray12[local22 - 1]) == -1) {
			local28--;
		}
		@Pc(77) byte[] local77 = new byte[local28];
		this.method1251(local77, 0);
		return local77;
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(B)Lclient!hh;")
	public Class50 method1228() {
		@Pc(9) Class50 local9 = new Class50();
		local9.anInt1705 = this.anInt1705;
		local9.aByteArray12 = new byte[this.anInt1705];
		@Pc(25) byte local25 = 2;
		for (@Pc(27) int local27 = 0; local27 < this.anInt1705; local27++) {
			@Pc(34) byte local34 = this.aByteArray12[local27];
			if (local34 >= 97 && local34 <= 122 || local34 >= -32 && local34 <= -2 && local34 != -9) {
				if (local25 == 2) {
					local34 = (byte) (local34 - 32);
				}
				local25 = 0;
			} else if (local34 >= 65 && local34 <= 90 || !(local34 < -64 || local34 > -34 || local34 == -41)) {
				if (local25 == 0) {
					local34 = (byte) (local34 + 32);
				}
				local25 = 0;
			} else if (local34 == 46 || local34 == 33 || local34 == 63) {
				local25 = 2;
			} else if (local34 != 32) {
				local25 = 1;
			} else if (local25 != 2) {
				local25 = 1;
			}
			local9.aByteArray12[local27] = local34;
		}
		return local9;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)I")
	public int method1229() {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < this.anInt1705; local13++) {
			local11 = (this.aByteArray12[local13] & 0xFF) + (local11 << 5) - local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)[B")
	public byte[] method1230() {
		@Pc(13) byte[] local13 = new byte[this.anInt1705];
		Static235.method866(this.aByteArray12, 0, local13, 0, this.anInt1705);
		return local13;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	public void method1231(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray12, 0, this.anInt1705, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray12, 0, this.anInt1705);
		}
		arg1.drawString(local18, arg2, arg0);
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(B)V")
	public void method1232() {
		@Pc(17) String local17;
		try {
			local17 = new String(this.aByteArray12, 0, this.anInt1705, "ISO-8859-1");
		} catch (@Pc(19) UnsupportedEncodingException local19) {
			local17 = new String(this.aByteArray12, 0, this.anInt1705);
		}
		System.out.println(local17);
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)Lclient!hh;")
	public Class50 method1233() {
		@Pc(10) Class50 local10 = new Class50();
		local10.anInt1705 = this.anInt1705;
		local10.aByteArray12 = new byte[this.anInt1705];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1705; local25++) {
			@Pc(32) byte local32 = this.aByteArray12[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local10.aByteArray12[local25] = local32;
		}
		return local10;
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)Z")
	public boolean method1234() {
		return this.method1246();
	}

	@OriginalMember(owner = "client!hh", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class50)) {
			throw new IllegalArgumentException();
		}
		return this.method1236((Class50) arg0);
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "(B)I")
	public int method1235() {
		return this.method1225(10);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!hh;B)Z")
	public boolean method1236(@OriginalArg(0) Class50 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1705 == arg0.anInt1705) {
			if (!this.aBoolean81 || !arg0.aBoolean81) {
				if (this.anInt1707 == 0) {
					this.anInt1707 = this.method1229();
					if (this.anInt1707 == 0) {
						this.anInt1707 = 1;
					}
				}
				if (arg0.anInt1707 == 0) {
					arg0.anInt1707 = arg0.method1229();
					if (arg0.anInt1707 == 0) {
						arg0.anInt1707 = 1;
					}
				}
				if (this.anInt1707 != arg0.anInt1707) {
					return false;
				}
			}
			for (@Pc(72) int local72 = 0; local72 < this.anInt1705; local72++) {
				if (this.aByteArray12[local72] != arg0.aByteArray12[local72]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BILclient!hh;)I")
	public int method1237(@OriginalArg(1) int arg0, @OriginalArg(2) Class50 arg1) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(12) int[] local12 = new int[arg1.anInt1705];
		@Pc(16) int[] local16 = new int[arg1.anInt1705];
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			local8[local18] = arg1.anInt1705;
		}
		for (@Pc(32) int local32 = 1; local32 <= arg1.anInt1705; local32++) {
			local12[local32 - 1] = (arg1.anInt1705 << 1) - local32;
			local8[arg1.aByteArray12[local32 - 1] & 0xFF] = arg1.anInt1705 - local32;
		}
		@Pc(71) int local71 = arg1.anInt1705 + 1;
		for (@Pc(74) int local74 = arg1.anInt1705; local74 > 0; local74--) {
			local16[local74 - 1] = local71;
			while (local71 <= arg1.anInt1705 && arg1.aByteArray12[local74 - 1] != arg1.aByteArray12[local71 - 1]) {
				if (arg1.anInt1705 - local74 <= local12[local71 + -1]) {
					local12[local71 - 1] = arg1.anInt1705 - local74;
				}
				local71 = local16[local71 - 1];
			}
			local71--;
		}
		@Pc(150) int local150 = local71;
		@Pc(152) int local152 = 1;
		@Pc(154) int local154 = 0;
		local71 = arg1.anInt1705 + 1 - local71;
		for (@Pc(163) int local163 = 1; local163 <= local71; local163++) {
			local16[local163 - 1] = local154;
			while (local154 >= 1 && arg1.aByteArray12[local154 - 1] != arg1.aByteArray12[local163 - 1]) {
				local154 = local16[local154 - 1];
			}
			local154++;
		}
		@Pc(208) int local208;
		while (arg1.anInt1705 > local150) {
			for (local208 = local152; local208 <= local150; local208++) {
				if (local150 + arg1.anInt1705 - local208 <= local12[local208 - 1]) {
					local12[local208 - 1] = arg1.anInt1705 + local150 - local208;
				}
			}
			local152 = local150 + 1;
			local150 = local71 + local150 - local16[local71 + -1];
			local71 = local16[local71 - 1];
		}
		@Pc(286) int local286;
		for (local208 = arg1.anInt1705 + arg0 - 1; local208 < this.anInt1705; local208 += Math.max(local8[this.aByteArray12[local208] & 0xFF], local12[local286])) {
			for (local286 = arg1.anInt1705 - 1; local286 >= 0 && this.aByteArray12[local208] == arg1.aByteArray12[local286]; local286--) {
				local208--;
			}
			if (local286 == -1) {
				return local208 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!hh;IIB)Lclient!hh;")
	public Class50 method1238(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean81) {
			throw new IllegalArgumentException();
		} else if (arg2 >= 0 && arg1 >= arg2 && arg0.anInt1705 >= arg1) {
			this.anInt1707 = 0;
			if (this.aByteArray12.length < this.anInt1705 + arg1 - arg2) {
				@Pc(53) int local53;
				for (local53 = 1; local53 < this.anInt1705 + arg0.anInt1705; local53 += local53) {
				}
				@Pc(74) byte[] local74 = new byte[local53];
				Static235.method866(this.aByteArray12, 0, local74, 0, this.anInt1705);
				this.aByteArray12 = local74;
			}
			Static235.method866(arg0.aByteArray12, arg2, this.aByteArray12, this.anInt1705, arg1 - arg2);
			this.anInt1705 += arg1 - arg2;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIB)I")
	public int method1239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) byte local15 = (byte) arg1;
		for (@Pc(17) int local17 = arg0; local17 < this.anInt1705; local17++) {
			if (local15 == this.aByteArray12[local17]) {
				return local17;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Lclient!hh;I)Z")
	public boolean method1240(@OriginalArg(0) Class50 arg0) {
		if (arg0.anInt1705 > this.anInt1705) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < arg0.anInt1705; local18++) {
			if (arg0.aByteArray12[local18] != this.aByteArray12[local18]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)I")
	public int method1241(@OriginalArg(1) int arg0) {
		return this.aByteArray12[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method1242(@OriginalArg(1) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray12, 0, this.anInt1705, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray12, 0, this.anInt1705);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/applet/Applet;I)V")
	public void method1243(@OriginalArg(0) Applet arg0) throws Throwable {
		@Pc(19) String local19 = new String(this.aByteArray12, 0, this.anInt1705);
		Static238.method1579(local19, arg0);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)Lclient!hh;")
	public Class50 method1244(@OriginalArg(0) int arg0) {
		return this.method1216(this.anInt1705, arg0);
	}

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)J")
	public long method1245() {
		@Pc(13) long local13 = 0L;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1705; local15++) {
			local13 = (long) (this.aByteArray12[local15] & 0xFF) + (local13 << 5) - local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(BI)Z")
	private boolean method1246() {
		@Pc(7) boolean local7 = false;
		@Pc(19) int local19 = 0;
		@Pc(21) boolean local21 = false;
		for (@Pc(28) int local28 = 0; local28 < this.anInt1705; local28++) {
			@Pc(37) int local37 = this.aByteArray12[local28] & 0xFF;
			if (local28 == 0) {
				if (local37 == 45) {
					local7 = true;
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
			if (local7) {
				local37 = -local37;
			}
			@Pc(113) int local113 = local19 * 10 + local37;
			if (local19 != local113 / 10) {
				return false;
			}
			local19 = local113;
			local21 = true;
		}
		return local21;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(BI)V")
	public void method1247() {
		this.anInt1707 = 0;
		if (!this.aBoolean81) {
			throw new IllegalArgumentException();
		}
		@Pc(31) int local31;
		if (this.aByteArray12.length < 0) {
			for (local31 = 1; local31 < 0; local31 += local31) {
			}
			@Pc(47) byte[] local47 = new byte[local31];
			Static235.method866(this.aByteArray12, 0, local47, 0, this.anInt1705);
			this.aByteArray12 = local47;
		}
		for (local31 = this.anInt1705; local31 < 0; local31++) {
			this.aByteArray12[local31] = 32;
		}
		this.anInt1705 = 0;
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(BI)[Lclient!hh;")
	public Class50[] method1248() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt1705; local9++) {
			if (this.aByteArray12[local9] == 60) {
				local7++;
			}
		}
		@Pc(44) Class50[] local44 = new Class50[local7 + 1];
		if (local7 == 0) {
			local44[0] = this;
			return local44;
		}
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < local7; local61++) {
			@Pc(65) int local65;
			for (local65 = 0; this.aByteArray12[local65 + local57] != 60; local65++) {
			}
			local44[local59++] = this.method1216(local57 + local65, local57);
			local57 += local65 + 1;
		}
		local44[local7] = this.method1216(this.anInt1705, local57);
		return local44;
	}

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)I")
	public int method1249() {
		return this.anInt1705;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)I")
	public int method1250() {
		@Pc(13) int local13 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt1705; local18++) {
			if (this.aByteArray12[local18] == 60) {
				local13++;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([BII)I")
	private int method1251(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < this.anInt1705; local14 += 4) {
			@Pc(23) int local23 = Static109.method1733(this.aByteArray12[local14]);
			@Pc(40) int local40 = local14 + 1 >= this.anInt1705 ? -1 : Static109.method1733(this.aByteArray12[local14 + 1]);
			@Pc(61) int local61 = local14 + 2 >= this.anInt1705 ? -1 : Static109.method1733(this.aByteArray12[local14 + 2]);
			@Pc(82) int local82 = local14 + 3 < this.anInt1705 ? Static109.method1733(this.aByteArray12[local14 + 3]) : -1;
			arg0[arg1++] = (byte) (local40 >>> 4 | local23 << 2);
			if (local61 == -1) {
				break;
			}
			arg0[arg1++] = (byte) (local61 >>> 2 | (local40 & 0xF) << 4);
			if (local82 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local61 & 0x3) << 6 | local82);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(IZ)I")
	public int method1252() {
		return this.method1239(0, 44);
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(Lclient!hh;I)I")
	public int method1253(@OriginalArg(0) Class50 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt1705;
		@Pc(15) int local15 = arg0.anInt1705;
		@Pc(18) int local18 = this.anInt1705;
		@Pc(21) int local21 = arg0.anInt1705;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		while (local12 != 0 && local15 != 0) {
			if (local7 == 156 || local7 == 230) {
				local7 = 101;
			} else if (local7 == 140 || local7 == 198) {
				local7 = 69;
			} else if (local7 == 223) {
				local7 = 115;
			} else {
				local7 = this.aByteArray12[local23] & 0xFF;
				local23++;
			}
			if (Static20.method303(local7)) {
				local18++;
			} else {
				local12--;
			}
			if (local9 == 156 || local9 == 230) {
				local9 = 101;
			} else if (local9 == 140 || local9 == 198) {
				local9 = 69;
			} else if (local9 == 223) {
				local9 = 115;
			} else {
				local9 = arg0.aByteArray12[local25] & 0xFF;
				local25++;
			}
			if (Static20.method303(local9)) {
				local21++;
			} else {
				local15--;
			}
			if (Static214.anIntArray490[local7] < Static214.anIntArray490[local9]) {
				return -1;
			}
			if (Static214.anIntArray490[local9] < Static214.anIntArray490[local7]) {
				return 1;
			}
		}
		if (local18 < local21) {
			return -1;
		} else if (local18 > local21) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "(B)Lclient!hh;")
	public Class50 method1254() {
		@Pc(10) Class50 local10 = Static130.method2183(this.method1221());
		return local10 == null ? Static16.aClass50_129 : local10;
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(BI)Lclient!hh;")
	public Class50 method1255(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean81) {
			this.anInt1707 = 0;
			if (this.anInt1705 == this.aByteArray12.length) {
				@Pc(42) int local42;
				for (local42 = 1; local42 <= this.anInt1705; local42 += local42) {
				}
				@Pc(55) byte[] local55 = new byte[local42];
				Static235.method866(this.aByteArray12, 0, local55, 0, this.anInt1705);
				this.aByteArray12 = local55;
			}
			this.aByteArray12[this.anInt1705++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(Lclient!hh;I)Z")
	public boolean method1256(@OriginalArg(0) Class50 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1705 == arg0.anInt1705) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1705; local24++) {
				@Pc(30) byte local30 = this.aByteArray12[local24];
				if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
					local30 = (byte) (local30 + 32);
				}
				@Pc(59) byte local59 = arg0.aByteArray12[local24];
				if (local59 >= 65 && local59 <= 90 || local59 >= -64 && local59 <= -34 && local59 != -41) {
					local59 = (byte) (local59 + 32);
				}
				if (local30 != local59) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLclient!hh;)I")
	public int method1257(@OriginalArg(1) Class50 arg0) {
		return this.method1237(0, arg0);
	}

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "(B)Lclient!hh;")
	public Class50 method1258() {
		@Pc(7) long local7 = this.method1245();
		@Pc(16) Class local16 = hh.class;
		synchronized (hh.class) {
			@Pc(32) Class1_Sub6 local32;
			if (Static217.aClass90_22 == null) {
				Static217.aClass90_22 = new Class90(4096);
			} else {
				for (local32 = (Class1_Sub6) Static217.aClass90_22.method2819(local7); local32 != null; local32 = (Class1_Sub6) Static217.aClass90_22.method2816()) {
					if (this.method1236(local32.aClass50_187)) {
						return local32.aClass50_187;
					}
				}
			}
			local32 = new Class1_Sub6();
			this.aBoolean81 = false;
			local32.aClass50_187 = this;
			Static217.aClass90_22.method2817(local32, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(Lclient!hh;I)Lclient!hh;")
	public Class50 method1259(@OriginalArg(0) Class50 arg0) {
		if (!this.aBoolean81) {
			throw new IllegalArgumentException();
		}
		this.anInt1707 = 0;
		if (this.aByteArray12.length < arg0.anInt1705 + this.anInt1705) {
			@Pc(36) int local36;
			for (local36 = 1; local36 < arg0.anInt1705 + this.anInt1705; local36 += local36) {
			}
			@Pc(52) byte[] local52 = new byte[local36];
			Static235.method866(this.aByteArray12, 0, local52, 0, this.anInt1705);
			this.aByteArray12 = local52;
		}
		Static235.method866(arg0.aByteArray12, 0, this.aByteArray12, this.anInt1705, arg0.anInt1705);
		this.anInt1705 += arg0.anInt1705;
		return this;
	}
}
