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

@OriginalClass("client!sc")
public final class Class107 implements Interface3 {

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	public int anInt4186;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
	private int anInt4217;

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "Z")
	private boolean aBoolean370 = true;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)J")
	public long method3066() {
		@Pc(7) long local7 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt4186 && local14 < 12; local14++) {
			local7 *= 37L;
			@Pc(25) byte local25 = this.aByteArray55[local14];
			if (local25 >= 65 && local25 <= 90) {
				local7 += local25 + 1 - 65;
			} else if (local25 >= 97 && local25 <= 122) {
				local7 += local25 + 1 - 97;
			} else if (local25 >= 48 && local25 <= 57) {
				local7 += local25 + 27 - 48;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
	public void method3067() {
		@Pc(17) String local17;
		try {
			local17 = new String(this.aByteArray55, 0, this.anInt4186, "ISO-8859-1");
		} catch (@Pc(19) UnsupportedEncodingException local19) {
			local17 = new String(this.aByteArray55, 0, this.anInt4186);
		}
		System.out.println(local17);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Ljava/net/URL;")
	public URL method3068() throws MalformedURLException {
		return new URL(new String(this.aByteArray55, 0, this.anInt4186));
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)Lclient!sc;")
	public Class107 method3069() {
		@Pc(15) long local15 = this.method3110();
		@Pc(24) Class local24 = sc.class;
		synchronized (sc.class) {
			@Pc(40) Class1_Sub19 local40;
			if (Static203.aClass50_3 == null) {
				Static203.aClass50_3 = new Class50(4096);
			} else {
				for (local40 = (Class1_Sub19) Static203.aClass50_3.method1364(local15); local40 != null; local40 = (Class1_Sub19) Static203.aClass50_3.method1363()) {
					if (this.method3071(local40.aClass107_816)) {
						return local40.aClass107_816;
					}
				}
			}
			local40 = new Class1_Sub19();
			local40.aClass107_816 = this;
			this.aBoolean370 = false;
			Static203.aClass50_3.method1362(local15, local40);
			return this;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[BIIB)I")
	public int method3070(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static236.method300(this.aByteArray55, 0, arg0, arg2, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!sc;I)Z")
	public boolean method3071(@OriginalArg(0) Class107 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt4186 == this.anInt4186) {
			if (!this.aBoolean370 || !arg0.aBoolean370) {
				if (this.anInt4217 == 0) {
					this.anInt4217 = this.method3106();
					if (this.anInt4217 == 0) {
						this.anInt4217 = 1;
					}
				}
				if (arg0.anInt4217 == 0) {
					arg0.anInt4217 = arg0.method3106();
					if (arg0.anInt4217 == 0) {
						arg0.anInt4217 = 1;
					}
				}
				if (arg0.anInt4217 != this.anInt4217) {
					return false;
				}
			}
			for (@Pc(78) int local78 = 0; local78 < this.anInt4186; local78++) {
				if (arg0.aByteArray55[local78] != this.aByteArray55[local78]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lclient!sc;")
	public Class107 method3072(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(17) Class107 local17 = new Class107();
		local17.aByteArray55 = new byte[this.anInt4186 + 1];
		local17.anInt4186 = this.anInt4186 + 1;
		Static236.method300(this.aByteArray55, 0, local17.aByteArray55, 0, this.anInt4186);
		local17.aByteArray55[this.anInt4186] = (byte) arg0;
		return local17;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)I")
	public int method3073() {
		return this.method3077(44, 0);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)I")
	public int method3074() {
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt4186; local18++) {
			if (this.aByteArray55[local18] == 60) {
				local10++;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!sc;B)I")
	public int method3075(@OriginalArg(0) int arg0, @OriginalArg(1) Class107 arg1) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(12) int[] local12 = new int[arg1.anInt4186];
		@Pc(16) int[] local16 = new int[arg1.anInt4186];
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			local8[local18] = arg1.anInt4186;
		}
		for (@Pc(35) int local35 = 1; local35 <= arg1.anInt4186; local35++) {
			local16[local35 - 1] = (arg1.anInt4186 << 1) - local35;
			local8[arg1.aByteArray55[local35 - 1] & 0xFF] = arg1.anInt4186 - local35;
		}
		@Pc(74) int local74 = arg1.anInt4186 + 1;
		@Pc(77) int local77 = arg1.anInt4186;
		while (local77 > 0) {
			local12[local77 - 1] = local74;
			while (arg1.anInt4186 >= local74 && arg1.aByteArray55[local77 - 1] != arg1.aByteArray55[local74 - 1]) {
				if (local16[local74 - 1] >= arg1.anInt4186 - local77) {
					local16[local74 - 1] = arg1.anInt4186 - local77;
				}
				local74 = local12[local74 - 1];
			}
			local77--;
			local74--;
		}
		@Pc(139) int local139 = local74;
		local74 = arg1.anInt4186 + 1 - local74;
		@Pc(148) int local148 = 1;
		@Pc(150) int local150 = 0;
		for (@Pc(152) int local152 = 1; local152 <= local74; local152++) {
			local12[local152 - 1] = local150;
			while (local150 >= 1 && arg1.aByteArray55[local152 - 1] != arg1.aByteArray55[local150 - 1]) {
				local150 = local12[local150 - 1];
			}
			local150++;
		}
		@Pc(203) int local203;
		while (local139 < arg1.anInt4186) {
			for (local203 = local148; local203 <= local139; local203++) {
				if (arg1.anInt4186 + local139 - local203 <= local16[local203 + -1]) {
					local16[local203 - 1] = arg1.anInt4186 + local139 - local203;
				}
			}
			local148 = local139 + 1;
			local139 = local74 + local139 - local12[local74 - 1];
			local74 = local12[local74 - 1];
		}
		@Pc(282) int local282;
		for (local203 = arg1.anInt4186 + arg0 - 1; local203 < this.anInt4186; local203 += Math.max(local8[this.aByteArray55[local203] & 0xFF], local16[local282])) {
			for (local282 = arg1.anInt4186 - 1; local282 >= 0 && this.aByteArray55[local203] == arg1.aByteArray55[local282]; local282--) {
				local203--;
			}
			if (local282 == -1) {
				return local203 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([BII)I")
	private int method3076(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt4186; local9 += 4) {
			@Pc(18) int local18 = Static47.method929(this.aByteArray55[local9]);
			@Pc(39) int local39 = local9 + 1 < this.anInt4186 ? Static47.method929(this.aByteArray55[local9 + 1]) : -1;
			@Pc(60) int local60 = local9 + 2 < this.anInt4186 ? Static47.method929(this.aByteArray55[local9 + 2]) : -1;
			@Pc(81) int local81 = local9 + 3 >= this.anInt4186 ? -1 : Static47.method929(this.aByteArray55[local9 + 3]);
			arg0[arg1++] = (byte) (local39 >>> 4 | local18 << 2);
			if (local60 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local39 & 0xF) << 4 | local60 >>> 2);
			if (local81 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local60 & 0x3) << 6 | local81);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!sc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class107)) {
			throw new IllegalArgumentException();
		}
		return this.method3071((Class107) arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBI)I")
	public int method3077(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte local8 = (byte) arg0;
		for (@Pc(15) int local15 = arg1; local15 < this.anInt4186; local15++) {
			if (local8 == this.aByteArray55[local15]) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!sc;)I")
	public int method3078(@OriginalArg(1) Class107 arg0) {
		@Pc(13) int local13;
		if (this.anInt4186 <= arg0.anInt4186) {
			local13 = this.anInt4186;
		} else {
			local13 = arg0.anInt4186;
		}
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			if ((this.aByteArray55[local20] & 0xFF) < (arg0.aByteArray55[local20] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray55[local20] & 0xFF) < (this.aByteArray55[local20] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt4186 < arg0.anInt4186) {
			return -1;
		} else if (arg0.anInt4186 < this.anInt4186) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/net/URL;)Ljava/net/URL;")
	public URL method3079(@OriginalArg(1) URL arg0) throws MalformedURLException {
		return new URL(arg0, new String(this.aByteArray55, 0, this.anInt4186));
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(II)V")
	public void method3080() {
		this.anInt4217 = 0;
		if (!this.aBoolean370) {
			throw new IllegalArgumentException();
		}
		@Pc(32) int local32;
		if (this.aByteArray55.length < 0) {
			for (local32 = 1; local32 < 0; local32 += local32) {
			}
			@Pc(48) byte[] local48 = new byte[local32];
			Static236.method300(this.aByteArray55, 0, local48, 0, this.anInt4186);
			this.aByteArray55 = local48;
		}
		for (local32 = this.anInt4186; local32 < 0; local32++) {
			this.aByteArray55[local32] = 32;
		}
		this.anInt4186 = 0;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILclient!sc;)Z")
	public boolean method3081(@OriginalArg(1) Class107 arg0) {
		if (arg0.anInt4186 > this.anInt4186) {
			return false;
		}
		@Pc(23) int local23 = this.anInt4186 - arg0.anInt4186;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt4186; local25++) {
			if (this.aByteArray55[local23 + local25] != arg0.aByteArray55[local25]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/applet/Applet;I)Lclient!sc;")
	public Class107 method3083(@OriginalArg(0) Applet arg0) {
		@Pc(8) String local8 = new String(this.aByteArray55, 0, this.anInt4186);
		@Pc(16) String local16 = arg0.getParameter(local8);
		return local16 == null ? null : Static144.method2376(local16);
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(II)Lclient!sc;")
	public Class107 method3084(@OriginalArg(1) int arg0) {
		return this.method3104(arg0, this.anInt4186);
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Lclient!sc;")
	public Class107 method3085() {
		@Pc(17) Class107 local17 = new Class107();
		local17.anInt4186 = this.anInt4186;
		local17.aByteArray55 = new byte[this.anInt4186];
		for (@Pc(28) int local28 = 0; local28 < this.anInt4186; local28++) {
			@Pc(35) byte local35 = this.aByteArray55[local28];
			if (local35 >= 65 && local35 <= 90 || local35 >= -64 && local35 <= -34 && local35 != -41) {
				local35 = (byte) (local35 + 32);
			}
			local17.aByteArray55[local28] = local35;
		}
		return local17;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)I")
	public int method3086(@OriginalArg(0) int arg0) {
		return this.aByteArray55[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)Lclient!sc;")
	public Class107 method3087() {
		@Pc(7) byte local7 = 2;
		@Pc(11) Class107 local11 = new Class107();
		local11.anInt4186 = this.anInt4186;
		local11.aByteArray55 = new byte[this.anInt4186];
		for (@Pc(28) int local28 = 0; local28 < this.anInt4186; local28++) {
			@Pc(35) byte local35 = this.aByteArray55[local28];
			if (local35 >= 97 && local35 <= 122 || !(local35 < -32 || local35 > -2 || local35 == -9)) {
				if (local7 == 2) {
					local35 = (byte) (local35 - 32);
				}
				local7 = 0;
			} else if (local35 >= 65 && local35 <= 90 || !(local35 < -64 || local35 > -34 || local35 == -41)) {
				if (local7 == 0) {
					local35 = (byte) (local35 + 32);
				}
				local7 = 0;
			} else if (local35 == 46 || local35 == 33 || local35 == 63) {
				local7 = 2;
			} else if (local35 != 32) {
				local7 = 1;
			} else if (local7 != 2) {
				local7 = 1;
			}
			local11.aByteArray55[local28] = local35;
		}
		return local11;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/applet/Applet;B)V")
	public void method3088(@OriginalArg(0) Applet arg0) throws Throwable {
		@Pc(8) String local8 = new String(this.aByteArray55, 0, this.anInt4186);
		Static242.method2786(arg0, local8);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLclient!sc;)I")
	public int method3089(@OriginalArg(1) Class107 arg0) {
		return this.method3075(0, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)Lclient!sc;")
	public Class107 method3090() {
		if (!this.aBoolean370) {
			throw new IllegalArgumentException();
		}
		this.anInt4217 = 0;
		if (this.anInt4186 != this.aByteArray55.length) {
			@Pc(28) byte[] local28 = new byte[this.anInt4186];
			Static236.method300(this.aByteArray55, 0, local28, 0, this.anInt4186);
			this.aByteArray55 = local28;
		}
		return this;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!sc;I)I")
	public int method3091(@OriginalArg(0) Class107 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.anInt4186;
		@Pc(13) int local13 = this.anInt4186;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = this.anInt4186;
		@Pc(21) int local21 = arg0.anInt4186;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		while (local13 != 0 && local10 != 0) {
			if (local15 == 156 || local15 == 230) {
				local15 = 101;
			} else if (local15 == 140 || local15 == 198) {
				local15 = 69;
			} else if (local15 == 223) {
				local15 = 115;
			} else {
				local15 = this.aByteArray55[local23] & 0xFF;
				local23++;
			}
			if (Static218.method3569(local15)) {
				local18++;
			} else {
				local13--;
			}
			if (local7 == 156 || local7 == 230) {
				local7 = 101;
			} else if (local7 == 140 || local7 == 198) {
				local7 = 69;
			} else if (local7 == 223) {
				local7 = 115;
			} else {
				local7 = arg0.aByteArray55[local25] & 0xFF;
				local25++;
			}
			if (Static218.method3569(local7)) {
				local21++;
			} else {
				local10--;
			}
			if (Static125.anIntArray242[local15] < Static125.anIntArray242[local7]) {
				return -1;
			}
			if (Static125.anIntArray242[local15] > Static125.anIntArray242[local7]) {
				return 1;
			}
		}
		if (local18 < local21) {
			return -1;
		} else if (local21 < local18) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Lclient!sc;")
	public Class107 method3092() {
		@Pc(9) Class107 local9 = new Class107();
		@Pc(11) boolean local11 = true;
		local9.anInt4186 = this.anInt4186;
		local9.aByteArray55 = new byte[this.anInt4186];
		for (@Pc(22) int local22 = 0; local22 < this.anInt4186; local22++) {
			@Pc(29) byte local29 = this.aByteArray55[local22];
			if (local29 == 95) {
				local9.aByteArray55[local22] = 32;
				local11 = true;
			} else if (local29 >= 97 && local29 <= 122 && local11) {
				local9.aByteArray55[local22] = (byte) (local29 - 32);
				local11 = false;
			} else {
				local11 = false;
				local9.aByteArray55[local22] = local29;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(Lclient!sc;I)Z")
	public boolean method3093(@OriginalArg(0) Class107 arg0) {
		if (arg0.anInt4186 > this.anInt4186) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < arg0.anInt4186; local19++) {
			@Pc(26) byte local26 = this.aByteArray55[local19];
			@Pc(31) byte local31 = arg0.aByteArray55[local19];
			if (local31 >= 65 && local31 <= 90 || local31 >= -64 && local31 <= -34 && local31 != -41) {
				local31 = (byte) (local31 + 32);
			}
			if (local26 >= 65 && local26 <= 90 || local26 >= -64 && local26 <= -34 && local26 != -41) {
				local26 = (byte) (local26 + 32);
			}
			if (local31 != local26) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Lclient!sc;")
	public Class107 method3094(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean370) {
			this.anInt4217 = 0;
			if (this.aByteArray55.length == this.anInt4186) {
				@Pc(45) int local45;
				for (local45 = 1; local45 <= this.anInt4186; local45 += local45) {
				}
				@Pc(62) byte[] local62 = new byte[local45];
				Static236.method300(this.aByteArray55, 0, local62, 0, this.anInt4186);
				this.aByteArray55 = local62;
			}
			this.aByteArray55[this.anInt4186++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)I")
	public int method3095() {
		return this.anInt4186;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(ILclient!sc;)Z")
	public boolean method3096(@OriginalArg(1) Class107 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt4186 == this.anInt4186) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt4186; local22++) {
				@Pc(29) byte local29 = this.aByteArray55[local22];
				if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
					local29 = (byte) (local29 + 32);
				}
				@Pc(56) byte local56 = arg0.aByteArray55[local22];
				if (local56 >= 65 && local56 <= 90 || local56 >= -64 && local56 <= -34 && local56 != -41) {
					local56 = (byte) (local56 + 32);
				}
				if (local29 != local56) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)[B")
	public byte[] method3098() {
		if (this.anInt4186 == 0) {
			return new byte[0];
		}
		@Pc(22) int local22 = this.anInt4186 + 3 & 0xFFFFFFFC;
		@Pc(28) int local28 = local22 / 4 * 3;
		if (this.anInt4186 <= local22 - 2 || Static47.method929(this.aByteArray55[local22 - 2]) == -1) {
			local28 -= 2;
		} else if (local22 - 1 >= this.anInt4186 || Static47.method929(this.aByteArray55[local22 - 1]) == -1) {
			local28--;
		}
		@Pc(68) byte[] local68 = new byte[local28];
		this.method3076(local68, 0);
		return local68;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLclient!sc;)Z")
	public boolean method3099(@OriginalArg(1) Class107 arg0) {
		if (arg0.anInt4186 > this.anInt4186) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt4186; local21++) {
			if (this.aByteArray55[local21] != arg0.aByteArray55[local21]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "(I)Lclient!sc;")
	public Class107 method3101() {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = this.anInt4186;
		while (local7 < this.anInt4186 && (this.aByteArray55[local7] >= 0 && this.aByteArray55[local7] <= 32 || (this.aByteArray55[local7] & 0xFF) == 160)) {
			local7++;
		}
		while (local7 < local10 && (this.aByteArray55[local10 - 1] >= 0 && this.aByteArray55[local10 - 1] <= 32 || (this.aByteArray55[local10 - 1] & 0xFF) == 160)) {
			local10--;
		}
		if (local7 == 0 && this.anInt4186 == local10) {
			return this;
		}
		@Pc(98) Class107 local98 = new Class107();
		local98.anInt4186 = local10 - local7;
		local98.aByteArray55 = new byte[local98.anInt4186];
		for (@Pc(116) int local116 = 0; local116 < local98.anInt4186; local116++) {
			local98.aByteArray55[local116] = this.aByteArray55[local7 + local116];
		}
		return local98;
	}

	@OriginalMember(owner = "client!sc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(Z)I")
	public int method3103() {
		return this.method3112(10);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)Lclient!sc;")
	public Class107 method3104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class107 local7 = new Class107();
		local7.anInt4186 = arg1 - arg0;
		local7.aByteArray55 = new byte[arg1 - arg0];
		Static236.method300(this.aByteArray55, arg0, local7.aByteArray55, 0, local7.anInt4186);
		return local7;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(BI)Z")
	private boolean method3105() {
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt4186; local28++) {
			@Pc(37) int local37 = this.aByteArray55[local28] & 0xFF;
			if (local28 == 0) {
				if (local37 == 45) {
					local19 = true;
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
			if (local19) {
				local37 = -local37;
			}
			@Pc(105) int local105 = local26 * 10 + local37;
			if (local26 != local105 / 10) {
				return false;
			}
			local26 = local105;
			local17 = true;
		}
		return local17;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)I")
	public int method3106() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt4186; local7++) {
			local5 = (local5 << 5) + (this.aByteArray55[local7] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method3107(@OriginalArg(0) FontMetrics arg0) {
		@Pc(21) String local21;
		try {
			local21 = new String(this.aByteArray55, 0, this.anInt4186, "ISO-8859-1");
		} catch (@Pc(23) UnsupportedEncodingException local23) {
			local21 = new String(this.aByteArray55, 0, this.anInt4186);
		}
		return arg0.stringWidth(local21);
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(Lclient!sc;I)Lclient!sc;")
	public Class107 method3108(@OriginalArg(0) Class107 arg0) {
		if (!this.aBoolean370) {
			throw new IllegalArgumentException();
		}
		this.anInt4217 = 0;
		if (arg0.anInt4186 + this.anInt4186 > this.aByteArray55.length) {
			@Pc(30) int local30;
			for (local30 = 1; local30 < this.anInt4186 + arg0.anInt4186; local30 += local30) {
			}
			@Pc(47) byte[] local47 = new byte[local30];
			Static236.method300(this.aByteArray55, 0, local47, 0, this.anInt4186);
			this.aByteArray55 = local47;
		}
		Static236.method300(arg0.aByteArray55, 0, this.aByteArray55, this.anInt4186, arg0.anInt4186);
		this.anInt4186 += arg0.anInt4186;
		return this;
	}

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "(I)Lclient!sc;")
	public Class107 method3109() {
		@Pc(13) Class107 local13 = Static19.method382(this.method3066());
		return local13 == null ? Static84.aClass107_532 : local13;
	}

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "(I)J")
	public long method3110() {
		@Pc(6) long local6 = (long) 0;
		for (@Pc(8) int local8 = 0; local8 < this.anInt4186; local8++) {
			local6 = (long) (this.aByteArray55[local8] & 0xFF) + (local6 << 5) - local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "(I)Z")
	public boolean method3111() {
		return this.method3105();
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IZ)I")
	public int method3112(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		for (@Pc(21) int local21 = 0; local21 < this.anInt4186; local21++) {
			@Pc(30) int local30 = this.aByteArray55[local21] & 0xFF;
			if (local21 == 0) {
				if (local30 == 45) {
					local9 = true;
					continue;
				}
				if (local30 == 43) {
					continue;
				}
			}
			if (local30 >= 48 && local30 <= 57) {
				local30 -= 48;
			} else if (local30 >= 65 && local30 <= 90) {
				local30 -= 55;
			} else if (local30 >= 97 && local30 <= 122) {
				local30 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local30) {
				throw new NumberFormatException();
			}
			if (local9) {
				local30 = -local30;
			}
			@Pc(104) int local104 = arg0 * local7 + local30;
			if (local7 != local104 / arg0) {
				throw new NumberFormatException();
			}
			local7 = local104;
			local11 = true;
		}
		if (!local11) {
			throw new NumberFormatException();
		}
		return local7;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/applet/Applet;)Ljava/lang/Object;")
	public Object method3113(@OriginalArg(1) Applet arg0) throws Throwable {
		@Pc(12) String local12 = new String(this.aByteArray55, 0, this.anInt4186);
		@Pc(18) Object local18 = Static242.method2787(local12, null, arg0);
		if (local18 instanceof String) {
			@Pc(25) byte[] local25 = ((String) local18).getBytes();
			local18 = Static140.method661(0, local25.length, local25);
		}
		return local18;
	}

	@OriginalMember(owner = "client!sc", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method3106();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!sc;II)Lclient!sc;")
	public Class107 method3114(@OriginalArg(0) int arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(3) int arg2) {
		if (!this.aBoolean370) {
			throw new IllegalArgumentException();
		} else if (arg0 >= 0 && arg0 <= arg2 && arg1.anInt4186 >= arg2) {
			this.anInt4217 = 0;
			if (this.anInt4186 + arg2 - arg0 > this.aByteArray55.length) {
				@Pc(49) int local49;
				for (local49 = 1; local49 < this.anInt4186 + arg1.anInt4186; local49 += local49) {
				}
				@Pc(70) byte[] local70 = new byte[local49];
				Static236.method300(this.aByteArray55, 0, local70, 0, this.anInt4186);
				this.aByteArray55 = local70;
			}
			Static236.method300(arg1.aByteArray55, arg0, this.aByteArray55, this.anInt4186, arg2 - arg0);
			this.anInt4186 += arg2 - arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
	public void method3115(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) String local17;
		try {
			local17 = new String(this.aByteArray55, 0, this.anInt4186, "ISO-8859-1");
		} catch (@Pc(19) UnsupportedEncodingException local19) {
			local17 = new String(this.aByteArray55, 0, this.anInt4186);
		}
		arg0.drawString(local17, arg2, arg1);
	}

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "(I)[B")
	public byte[] method3116() {
		@Pc(7) byte[] local7 = new byte[this.anInt4186];
		Static236.method300(this.aByteArray55, 0, local7, 0, this.anInt4186);
		return local7;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(IZ)[Lclient!sc;")
	public Class107[] method3117() {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt4186; local5++) {
			if (this.aByteArray55[local5] == 60) {
				local3++;
			}
		}
		@Pc(39) Class107[] local39 = new Class107[local3 + 1];
		if (local3 == 0) {
			local39[0] = this;
			return local39;
		}
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 0;
		for (@Pc(56) int local56 = 0; local56 < local3; local56++) {
			@Pc(60) int local60;
			for (local60 = 0; this.aByteArray55[local60 + local54] != 60; local60++) {
			}
			local39[local52++] = this.method3104(local54, local54 + local60);
			local54 += local60 + 1;
		}
		local39[local3] = this.method3104(local54, this.anInt4186);
		return local39;
	}
}
