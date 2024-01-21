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

@OriginalClass("client!ob")
public final class Class60 implements Interface3 {

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
	private int anInt3455;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
	public int anInt3466;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Z")
	private boolean aBoolean129 = true;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public void method2662(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) String local17;
		try {
			local17 = new String(this.aByteArray39, 0, this.anInt3466, "ISO-8859-1");
		} catch (@Pc(19) UnsupportedEncodingException local19) {
			local17 = new String(this.aByteArray39, 0, this.anInt3466);
		}
		arg0.drawString(local17, arg2, arg1);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lclient!ob;")
	public Class60 method2663() {
		@Pc(14) Class60 local14 = new Class60();
		local14.anInt3466 = this.anInt3466;
		local14.aByteArray39 = new byte[this.anInt3466];
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < this.anInt3466; local27++) {
			@Pc(34) byte local34 = this.aByteArray39[local27];
			if (local34 == 95) {
				local25 = true;
				local14.aByteArray39[local27] = 32;
			} else if (local34 >= 97 && local34 <= 122 && local25) {
				local14.aByteArray39[local27] = (byte) (local34 - 32);
				local25 = false;
			} else {
				local25 = false;
				local14.aByteArray39[local27] = local34;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ob;Z)Z")
	public boolean method2664(@OriginalArg(0) Class60 arg0) {
		if (arg0.anInt3466 > this.anInt3466) {
			return false;
		}
		@Pc(27) int local27 = this.anInt3466 - arg0.anInt3466;
		for (@Pc(29) int local29 = 0; local29 < arg0.anInt3466; local29++) {
			if (this.aByteArray39[local29 + local27] != arg0.aByteArray39[local29]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I")
	public int method2665(@OriginalArg(1) int arg0) {
		return this.aByteArray39[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)J")
	private long method2666() {
		@Pc(1) long local1 = 0L;
		for (@Pc(8) int local8 = 0; local8 < this.anInt3466; local8++) {
			local1 = (long) (this.aByteArray39[local8] & 0xFF) + (local1 << 5) - local1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIB)Lclient!ob;")
	public Class60 method2667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class60 local7 = new Class60();
		local7.aByteArray39 = new byte[arg0 - arg1];
		local7.anInt3466 = arg0 - arg1;
		Static203.method2767(this.aByteArray39, arg1, local7.aByteArray39, 0, local7.anInt3466);
		return local7;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)Lclient!ob;")
	public Class60 method2668() {
		@Pc(7) long local7 = this.method2666();
		@Pc(16) Class local16 = ob.class;
		synchronized (ob.class) {
			@Pc(32) Class2_Sub13 local32;
			if (Static157.aClass51_12 == null) {
				Static157.aClass51_12 = new Class51(4096);
			} else {
				for (local32 = (Class2_Sub13) Static157.aClass51_12.method2458(local7); local32 != null; local32 = (Class2_Sub13) Static157.aClass51_12.method2459()) {
					if (this.method2687(local32.aClass60_826)) {
						return local32.aClass60_826;
					}
				}
			}
			local32 = new Class2_Sub13();
			this.aBoolean129 = false;
			local32.aClass60_826 = this;
			Static157.aClass51_12.method2463(local32, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!ob", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ob;B)Lclient!ob;")
	public Class60 method2670(@OriginalArg(0) Class60 arg0) {
		if (!this.aBoolean129) {
			throw new IllegalArgumentException();
		}
		this.anInt3455 = 0;
		if (this.aByteArray39.length < arg0.anInt3466 + this.anInt3466) {
			@Pc(31) int local31;
			for (local31 = 1; local31 < this.anInt3466 + arg0.anInt3466; local31 += local31) {
			}
			@Pc(52) byte[] local52 = new byte[local31];
			Static203.method2767(this.aByteArray39, 0, local52, 0, this.anInt3466);
			this.aByteArray39 = local52;
		}
		Static203.method2767(arg0.aByteArray39, 0, this.aByteArray39, this.anInt3466, arg0.anInt3466);
		this.anInt3466 += arg0.anInt3466;
		return this;
	}

	@OriginalMember(owner = "client!ob", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method2682();
	}

	@OriginalMember(owner = "client!ob", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class60)) {
			throw new IllegalArgumentException();
		}
		return this.method2687((Class60) arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/applet/Applet;B)V")
	public void method2671(@OriginalArg(0) Applet arg0) throws Throwable {
		@Pc(8) String local8 = new String(this.aByteArray39, 0, this.anInt3466);
		Static204.method3107(local8, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Lclient!ob;")
	public Class60 method2672(@OriginalArg(1) int arg0) {
		return this.method2667(this.anInt3466, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)I")
	public int method2673() {
		return this.anInt3466;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)[B")
	public byte[] method2674() {
		@Pc(12) byte[] local12 = new byte[this.anInt3466];
		Static203.method2767(this.aByteArray39, 0, local12, 0, this.anInt3466);
		return local12;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lclient!ob;B)I")
	public int method2675(@OriginalArg(0) Class60 arg0) {
		return this.method2693(0, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)I")
	public int method2676(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte local8 = (byte) arg0;
		for (@Pc(10) int local10 = arg1; local10 < this.anInt3466; local10++) {
			if (this.aByteArray39[local10] == local8) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)Lclient!ob;")
	public Class60 method2677(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(27) Class60 local27 = new Class60();
		local27.aByteArray39 = new byte[this.anInt3466 + 1];
		local27.anInt3466 = this.anInt3466 + 1;
		Static203.method2767(this.aByteArray39, 0, local27.aByteArray39, 0, this.anInt3466);
		local27.aByteArray39[this.anInt3466] = (byte) arg0;
		return local27;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lclient!ob;B)I")
	public int method2678(@OriginalArg(0) Class60 arg0) {
		@Pc(15) int local15;
		if (arg0.anInt3466 >= this.anInt3466) {
			local15 = this.anInt3466;
		} else {
			local15 = arg0.anInt3466;
		}
		for (@Pc(21) int local21 = 0; local21 < local15; local21++) {
			if ((this.aByteArray39[local21] & 0xFF) < (arg0.aByteArray39[local21] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray39[local21] & 0xFF) < (this.aByteArray39[local21] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt3466 < arg0.anInt3466) {
			return -1;
		} else if (arg0.anInt3466 < this.anInt3466) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)Lclient!ob;")
	public Class60 method2679() {
		@Pc(9) Class60 local9 = new Class60();
		local9.anInt3466 = this.anInt3466;
		local9.aByteArray39 = new byte[this.anInt3466];
		for (@Pc(26) int local26 = 0; local26 < this.anInt3466; local26++) {
			@Pc(33) byte local33 = this.aByteArray39[local26];
			if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
				local33 = (byte) (local33 + 32);
			}
			local9.aByteArray39[local26] = local33;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(II)I")
	public int method2680(@OriginalArg(1) int arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt3466; local28++) {
			@Pc(37) int local37 = this.aByteArray39[local28] & 0xFF;
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
				throw new NumberFormatException();
			}
			if (arg0 <= local37) {
				throw new NumberFormatException();
			}
			if (local24) {
				local37 = -local37;
			}
			@Pc(115) int local115 = local37 + arg0 * local26;
			if (local26 != local115 / arg0) {
				throw new NumberFormatException();
			}
			local18 = true;
			local26 = local115;
		}
		if (!local18) {
			throw new NumberFormatException();
		}
		return local26;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method2681(@OriginalArg(0) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray39, 0, this.anInt3466, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray39, 0, this.anInt3466);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)I")
	public int method2682() {
		@Pc(5) int local5 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt3466; local14++) {
			local5 = (local5 << 5) + ((this.aByteArray39[local14] & 0xFF) - local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)Z")
	private boolean method2684() {
		@Pc(13) boolean local13 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt3466; local23++) {
			@Pc(35) int local35 = this.aByteArray39[local23] & 0xFF;
			if (local23 == 0) {
				if (local35 == 45) {
					local13 = true;
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
				return false;
			}
			if (local35 >= 10) {
				return false;
			}
			if (local13) {
				local35 = -local35;
			}
			@Pc(100) int local100 = local21 * 10 + local35;
			if (local21 != local100 / 10) {
				return false;
			}
			local21 = local100;
			local19 = true;
		}
		return local19;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLclient!ob;)I")
	public int method2685(@OriginalArg(1) Class60 arg0) {
		@Pc(17) int local17;
		if (this.anInt3466 <= arg0.anInt3466) {
			local17 = this.anInt3466;
		} else {
			local17 = arg0.anInt3466;
		}
		for (@Pc(29) int local29 = 0; local29 < local17; local29++) {
			if (Static82.anIntArray272[this.aByteArray39[local29] & 0xFF] < Static82.anIntArray272[arg0.aByteArray39[local29] & 0xFF]) {
				return -1;
			}
			if (Static82.anIntArray272[this.aByteArray39[local29] & 0xFF] > Static82.anIntArray272[arg0.aByteArray39[local29] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt3466 > this.anInt3466) {
			return -1;
		} else if (arg0.anInt3466 < this.anInt3466) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBII[B)I")
	public int method2686(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2) {
		Static203.method2767(this.aByteArray39, 0, arg2, arg1, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLclient!ob;)Z")
	public boolean method2687(@OriginalArg(1) Class60 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt3466 == arg0.anInt3466) {
			if (!this.aBoolean129 || !arg0.aBoolean129) {
				if (this.anInt3455 == 0) {
					this.anInt3455 = this.method2682();
					if (this.anInt3455 == 0) {
						this.anInt3455 = 1;
					}
				}
				if (arg0.anInt3455 == 0) {
					arg0.anInt3455 = arg0.method2682();
					if (arg0.anInt3455 == 0) {
						arg0.anInt3455 = 1;
					}
				}
				if (arg0.anInt3455 != this.anInt3455) {
					return false;
				}
			}
			for (@Pc(79) int local79 = 0; local79 < this.anInt3466; local79++) {
				if (this.aByteArray39[local79] != arg0.aByteArray39[local79]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(B)Ljava/net/URL;")
	public URL method2688() throws MalformedURLException {
		return new URL(new String(this.aByteArray39, 0, this.anInt3466));
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)Lclient!ob;")
	public Class60 method2689() {
		@Pc(14) int local14;
		for (local14 = 0; this.anInt3466 > local14 && (this.aByteArray39[local14] >= 0 && this.aByteArray39[local14] <= 32 || (this.aByteArray39[local14] & 0xFF) == 160); local14++) {
		}
		@Pc(54) int local54;
		for (local54 = this.anInt3466; local14 < local54 && (this.aByteArray39[local54 - 1] >= 0 && this.aByteArray39[local54 - 1] <= 32 || (this.aByteArray39[local54 - 1] & 0xFF) == 160); local54--) {
		}
		if (local14 == 0 && this.anInt3466 == local54) {
			return this;
		}
		@Pc(105) Class60 local105 = new Class60();
		local105.anInt3466 = local54 - local14;
		local105.aByteArray39 = new byte[local105.anInt3466];
		for (@Pc(118) int local118 = 0; local118 < local105.anInt3466; local118++) {
			local105.aByteArray39[local118] = this.aByteArray39[local118 + local14];
		}
		return local105;
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(B)Lclient!ob;")
	public Class60 method2690() {
		@Pc(11) Class60 local11 = Static182.method3394(this.method2691());
		return local11 == null ? Static161.aClass60_1094 : local11;
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)J")
	public long method2691() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; this.anInt3466 > local7 && local7 < 12; local7++) {
			local5 *= 37L;
			@Pc(21) byte local21 = this.aByteArray39[local7];
			if (local21 >= 65 && local21 <= 90) {
				local5 += local21 - 64;
			} else if (local21 >= 97 && local21 <= 122) {
				local5 += local21 + 1 - 97;
			} else if (local21 >= 48 && local21 <= 57) {
				local5 += local21 + 27 - 48;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)I")
	public int method2692() {
		return this.method2680(10);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILclient!ob;)I")
	public int method2693(@OriginalArg(1) int arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(9) int[] local9 = new int[arg1.anInt3466];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg1.anInt3466];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg1.anInt3466;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg1.anInt3466; local36++) {
			local9[local36 - 1] = (arg1.anInt3466 << 1) - local36;
			local12[arg1.aByteArray39[local36 - 1] & 0xFF] = arg1.anInt3466 - local36;
		}
		@Pc(75) int local75 = arg1.anInt3466 + 1;
		for (@Pc(78) int local78 = arg1.anInt3466; local78 > 0; local78--) {
			local16[local78 - 1] = local75;
			while (arg1.anInt3466 >= local75 && arg1.aByteArray39[local75 - 1] != arg1.aByteArray39[local78 - 1]) {
				if (local9[local75 - 1] >= arg1.anInt3466 - local78) {
					local9[local75 - 1] = arg1.anInt3466 - local78;
				}
				local75 = local16[local75 - 1];
			}
			local75--;
		}
		@Pc(157) int local157 = local75;
		local75 = arg1.anInt3466 + 1 - local75;
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 1;
		while (local75 >= local168) {
			local16[local168 - 1] = local166;
			while (local166 >= 1 && arg1.aByteArray39[local166 - 1] != arg1.aByteArray39[local168 - 1]) {
				local166 = local16[local166 - 1];
			}
			local168++;
			local166++;
		}
		@Pc(207) int local207 = 1;
		@Pc(211) int local211;
		while (local157 < arg1.anInt3466) {
			for (local211 = local207; local211 <= local157; local211++) {
				if (arg1.anInt3466 + local157 - local211 <= local9[local211 + -1]) {
					local9[local211 - 1] = arg1.anInt3466 + local157 - local211;
				}
			}
			local207 = local157 + 1;
			local157 = local157 + local75 - local16[local75 - 1];
			local75 = local16[local75 - 1];
		}
		@Pc(284) int local284;
		for (local211 = arg1.anInt3466 + arg0 - 1; local211 < this.anInt3466; local211 += Math.max(local12[this.aByteArray39[local211] & 0xFF], local9[local284])) {
			for (local284 = arg1.anInt3466 - 1; local284 >= 0 && this.aByteArray39[local211] == arg1.aByteArray39[local284]; local284--) {
				local211--;
			}
			if (local284 == -1) {
				return local211 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(II)Lclient!ob;")
	public Class60 method2694(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean129) {
			this.anInt3455 = 0;
			if (this.aByteArray39.length == this.anInt3466) {
				@Pc(43) int local43;
				for (local43 = 1; local43 <= this.anInt3466; local43 += local43) {
				}
				@Pc(56) byte[] local56 = new byte[local43];
				Static203.method2767(this.aByteArray39, 0, local56, 0, this.anInt3466);
				this.aByteArray39 = local56;
			}
			this.aByteArray39[this.anInt3466++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Ljava/applet/Applet;B)Lclient!ob;")
	public Class60 method2695(@OriginalArg(0) Applet arg0) {
		@Pc(12) String local12 = new String(this.aByteArray39, 0, this.anInt3466);
		@Pc(21) String local21 = arg0.getParameter(local12);
		return local21 == null ? null : Static174.method3264(local21);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)Lclient!ob;")
	public Class60 method2696() {
		@Pc(16) Class60 local16 = new Class60();
		local16.anInt3466 = this.anInt3466;
		local16.aByteArray39 = new byte[this.anInt3466];
		for (@Pc(27) int local27 = 0; local27 < this.anInt3466; local27++) {
			local16.aByteArray39[local27] = 42;
		}
		return local16;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!ob;)Z")
	public boolean method2697(@OriginalArg(1) Class60 arg0) {
		if (this.anInt3466 < arg0.anInt3466) {
			return false;
		}
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt3466; local22++) {
			if (this.aByteArray39[local22] != arg0.aByteArray39[local22]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(BLclient!ob;)Z")
	public boolean method2698(@OriginalArg(1) Class60 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt3466 == this.anInt3466) {
			for (@Pc(25) int local25 = 0; local25 < this.anInt3466; local25++) {
				@Pc(31) byte local31 = this.aByteArray39[local25];
				if (local31 >= 65 && local31 <= 90 || local31 >= -64 && local31 <= -34 && local31 != -41) {
					local31 = (byte) (local31 + 32);
				}
				@Pc(64) byte local64 = arg0.aByteArray39[local25];
				if (local64 >= 65 && local64 <= 90 || local64 >= -64 && local64 <= -34 && local64 != -41) {
					local64 = (byte) (local64 + 32);
				}
				if (local64 != local31) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "(B)Z")
	public boolean method2699() {
		return this.method2684();
	}

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "(B)Lclient!ob;")
	public Class60 method2700() {
		@Pc(3) byte local3 = 2;
		@Pc(7) Class60 local7 = new Class60();
		local7.anInt3466 = this.anInt3466;
		local7.aByteArray39 = new byte[this.anInt3466];
		for (@Pc(22) int local22 = 0; local22 < this.anInt3466; local22++) {
			@Pc(29) byte local29 = this.aByteArray39[local22];
			if (local29 >= 97 && local29 <= 122 || !(local29 < -32 || local29 > -2 || local29 == -9)) {
				if (local3 == 2) {
					local29 = (byte) (local29 - 32);
				}
				local3 = 0;
			} else if (local29 >= 65 && local29 <= 90 || !(local29 < -64 || local29 > -34 || local29 == -41)) {
				if (local3 == 0) {
					local29 = (byte) (local29 + 32);
				}
				local3 = 0;
			} else if (local29 == 46 || local29 == 33 || local29 == 63) {
				local3 = 2;
			} else if (local29 != 32) {
				local3 = 1;
			} else if (local3 != 2) {
				local3 = 1;
			}
			local7.aByteArray39[local22] = local29;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "(B)Lclient!ob;")
	public Class60 method2701() {
		if (!this.aBoolean129) {
			throw new IllegalArgumentException();
		}
		this.anInt3455 = 0;
		if (this.anInt3466 != this.aByteArray39.length) {
			@Pc(31) byte[] local31 = new byte[this.anInt3466];
			Static203.method2767(this.aByteArray39, 0, local31, 0, this.anInt3466);
			this.aByteArray39 = local31;
		}
		return this;
	}
}
