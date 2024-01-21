import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class26 implements Interface3 {

	@OriginalMember(owner = "client!he", name = "q", descriptor = "I")
	private int anInt1332;

	@OriginalMember(owner = "client!he", name = "F", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!he", name = "H", descriptor = "I")
	public int anInt1345;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Z")
	private boolean aBoolean72 = true;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)Lclient!he;")
	public Class26 method815() {
		@Pc(7) byte local7 = 2;
		@Pc(11) Class26 local11 = new Class26();
		local11.anInt1345 = this.anInt1345;
		local11.aByteArray7 = new byte[this.anInt1345];
		for (@Pc(29) int local29 = 0; local29 < this.anInt1345; local29++) {
			@Pc(36) byte local36 = this.aByteArray7[local29];
			if (local36 >= 97 && local36 <= 122 || !(local36 < -32 || local36 > -2 || local36 == -9)) {
				if (local7 == 2) {
					local36 = (byte) (local36 - 32);
				}
				local7 = 0;
			} else if (local36 >= 65 && local36 <= 90 || !(local36 < -64 || local36 > -34 || local36 == -41)) {
				if (local7 == 0) {
					local36 = (byte) (local36 + 32);
				}
				local7 = 0;
			} else if (local36 == 46 || local36 == 33 || local36 == 63) {
				local7 = 2;
			} else if (local36 != 32) {
				local7 = 1;
			} else if (local7 != 2) {
				local7 = 1;
			}
			local11.aByteArray7[local29] = local36;
		}
		return local11;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!he;)Z")
	public boolean method816(@OriginalArg(1) Class26 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1345 == this.anInt1345) {
			if (!this.aBoolean72 || !arg0.aBoolean72) {
				if (this.anInt1332 == 0) {
					this.anInt1332 = this.method834();
					if (this.anInt1332 == 0) {
						this.anInt1332 = 1;
					}
				}
				if (arg0.anInt1332 == 0) {
					arg0.anInt1332 = arg0.method834();
					if (arg0.anInt1332 == 0) {
						arg0.anInt1332 = 1;
					}
				}
				if (this.anInt1332 != arg0.anInt1332) {
					return false;
				}
			}
			for (@Pc(69) int local69 = 0; local69 < this.anInt1345; local69++) {
				if (arg0.aByteArray7[local69] != this.aByteArray7[local69]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!he;B)I")
	public int method817(@OriginalArg(0) Class26 arg0) {
		return this.method821(arg0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)I")
	public int method818() {
		return this.method849(10);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lclient!he;")
	public Class26 method819(@OriginalArg(0) int arg0) {
		return this.method843(arg0, this.anInt1345);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)J")
	public long method820() {
		@Pc(7) long local7 = 0L;
		for (@Pc(16) int local16 = 0; local16 < this.anInt1345 && local16 < 12; local16++) {
			local7 *= 37L;
			@Pc(27) byte local27 = this.aByteArray7[local16];
			if (local27 >= 65 && local27 <= 90) {
				local7 += local27 - 64;
			} else if (local27 >= 97 && local27 <= 122) {
				local7 += local27 + 1 - 97;
			} else if (local27 >= 48 && local27 <= 57) {
				local7 += local27 + 27 - 48;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!he;II)I")
	private int method821(@OriginalArg(0) Class26 arg0) {
		@Pc(4) int[] local4 = new int[256];
		@Pc(8) int[] local8 = new int[arg0.anInt1345];
		@Pc(16) int[] local16 = new int[arg0.anInt1345];
		for (@Pc(18) int local18 = 0; local18 < local4.length; local18++) {
			local4[local18] = arg0.anInt1345;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg0.anInt1345; local36++) {
			local8[local36 - 1] = (arg0.anInt1345 << 1) - local36;
			local4[arg0.aByteArray7[local36 - 1] & 0xFF] = arg0.anInt1345 - local36;
		}
		@Pc(74) int local74 = arg0.anInt1345 + 1;
		@Pc(77) int local77 = arg0.anInt1345;
		while (local77 > 0) {
			local16[local77 - 1] = local74;
			while (local74 <= arg0.anInt1345 && arg0.aByteArray7[local77 - 1] != arg0.aByteArray7[local74 - 1]) {
				if (local8[local74 - 1] >= arg0.anInt1345 - local77) {
					local8[local74 - 1] = arg0.anInt1345 - local77;
				}
				local74 = local16[local74 - 1];
			}
			local77--;
			local74--;
		}
		@Pc(141) int local141 = local74;
		local74 = arg0.anInt1345 + 1 - local74;
		@Pc(151) int local151 = 1;
		@Pc(153) int local153 = 0;
		for (@Pc(155) int local155 = 1; local155 <= local74; local155++) {
			local16[local155 - 1] = local153;
			while (local153 >= 1 && arg0.aByteArray7[local153 - 1] != arg0.aByteArray7[local155 - 1]) {
				local153 = local16[local153 - 1];
			}
			local153++;
		}
		@Pc(200) int local200;
		while (arg0.anInt1345 > local141) {
			for (local200 = local151; local200 <= local141; local200++) {
				if (local141 + arg0.anInt1345 - local200 <= local8[local200 - 1]) {
					local8[local200 - 1] = arg0.anInt1345 + local141 - local200;
				}
			}
			local151 = local141 + 1;
			local141 = local141 + local74 - local16[local74 + -1];
			local74 = local16[local74 - 1];
		}
		@Pc(274) int local274;
		for (local200 = arg0.anInt1345 - 1; local200 < this.anInt1345; local200 += Math.max(local4[this.aByteArray7[local200] & 0xFF], local8[local274])) {
			for (local274 = arg0.anInt1345 - 1; local274 >= 0 && this.aByteArray7[local200] == arg0.aByteArray7[local274]; local274--) {
				local200--;
			}
			if (local274 == -1) {
				return local200 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!he;B)Z")
	public boolean method822(@OriginalArg(0) Class26 arg0) {
		if (arg0.anInt1345 > this.anInt1345) {
			return false;
		}
		for (@Pc(20) int local20 = 0; local20 < arg0.anInt1345; local20++) {
			if (this.aByteArray7[local20] != arg0.aByteArray7[local20]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Lclient!he;")
	public Class26 method823() {
		@Pc(9) Class26 local9 = new Class26();
		local9.anInt1345 = this.anInt1345;
		local9.aByteArray7 = new byte[this.anInt1345];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1345; local28++) {
			local9.aByteArray7[local28] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!he", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method834();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIZ)I")
	private int method825(@OriginalArg(1) int arg0) {
		@Pc(17) byte local17 = (byte) arg0;
		for (@Pc(19) int local19 = 0; local19 < this.anInt1345; local19++) {
			if (local17 == this.aByteArray7[local19]) {
				return local19;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)J")
	private long method826() {
		@Pc(8) long local8 = 0L;
		for (@Pc(10) int local10 = 0; local10 < this.anInt1345; local10++) {
			local8 = (long) (this.aByteArray7[local10] & 0xFF) + (local8 << 5) - local8;
		}
		return local8;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(ILclient!he;)I")
	public int method827(@OriginalArg(1) Class26 arg0) {
		@Pc(17) int local17;
		if (this.anInt1345 <= arg0.anInt1345) {
			local17 = this.anInt1345;
		} else {
			local17 = arg0.anInt1345;
		}
		for (@Pc(29) int local29 = 0; local29 < local17; local29++) {
			if ((arg0.aByteArray7[local29] & 0xFF) > (this.aByteArray7[local29] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray7[local29] & 0xFF) > (arg0.aByteArray7[local29] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt1345 < arg0.anInt1345) {
			return -1;
		} else if (this.anInt1345 > arg0.anInt1345) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(B)Ljava/net/URL;")
	public URL method828() throws MalformedURLException {
		return new URL(new String(this.aByteArray7, 0, this.anInt1345));
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)Lclient!he;")
	public Class26 method829() {
		@Pc(3) int local3;
		for (local3 = 0; local3 < this.anInt1345 && (this.aByteArray7[local3] >= 0 && this.aByteArray7[local3] <= 32 || (this.aByteArray7[local3] & 0xFF) == 160); local3++) {
		}
		@Pc(43) int local43;
		for (local43 = this.anInt1345; local3 < local43 && (this.aByteArray7[local43 - 1] >= 0 && this.aByteArray7[local43 - 1] <= 32 || (this.aByteArray7[local43 - 1] & 0xFF) == 160); local43--) {
		}
		if (local3 == 0 && local43 == this.anInt1345) {
			return this;
		}
		@Pc(97) Class26 local97 = new Class26();
		local97.anInt1345 = local43 - local3;
		local97.aByteArray7 = new byte[local97.anInt1345];
		for (@Pc(110) int local110 = 0; local110 < local97.anInt1345; local110++) {
			local97.aByteArray7[local110] = this.aByteArray7[local3 + local110];
		}
		return local97;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)Lclient!he;")
	public Class26 method830() {
		@Pc(5) Class26 local5 = new Class26();
		local5.anInt1345 = 0;
		local5.aByteArray7 = new byte[12];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1345; local20++) {
			if (this.aByteArray7[local20] >= 65 && this.aByteArray7[local20] <= 90) {
				local5.aByteArray7[local18++] = (byte) (this.aByteArray7[local20] + 32);
				local5.anInt1345 = local18;
			} else if (this.aByteArray7[local20] >= 97 && this.aByteArray7[local20] <= 122 || this.aByteArray7[local20] >= 48 && this.aByteArray7[local20] <= 57) {
				local5.aByteArray7[local18++] = this.aByteArray7[local20];
				local5.anInt1345 = local18;
			} else if (local18 > 0) {
				local5.aByteArray7[local18++] = 95;
			}
			if (local18 == 12) {
				break;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	public void method831(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray7, 0, this.anInt1345, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local13 = new String(this.aByteArray7, 0, this.anInt1345);
		}
		arg2.drawString(local13, arg0, arg1);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(Lclient!he;B)Z")
	public boolean method832(@OriginalArg(0) Class26 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1345 == arg0.anInt1345) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt1345; local18++) {
				@Pc(25) byte local25 = arg0.aByteArray7[local18];
				if (local25 >= 65 && local25 <= 90 || local25 >= -64 && local25 <= -34 && local25 != -41) {
					local25 = (byte) (local25 + 32);
				}
				@Pc(54) byte local54 = this.aByteArray7[local18];
				if (local54 >= 65 && local54 <= 90 || local54 >= -64 && local54 <= -34 && local54 != -41) {
					local54 = (byte) (local54 + 32);
				}
				if (local25 != local54) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(B)Z")
	public boolean method833() {
		return this.method855();
	}

	@OriginalMember(owner = "client!he", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class26)) {
			throw new IllegalArgumentException();
		}
		return this.method816((Class26) arg0);
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(B)I")
	public int method834() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1345; local7++) {
			local5 = (this.aByteArray7[local7] & 0xFF) + ((local5 << 5) - local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIZI[B)I")
	public int method835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) byte[] arg2) {
		Static135.method733(this.aByteArray7, 0, arg2, arg1, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method836(@OriginalArg(1) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray7, 0, this.anInt1345, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray7, 0, this.anInt1345);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)Lclient!he;")
	public Class26 method838(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean72) {
			this.anInt1332 = 0;
			if (this.anInt1345 == this.aByteArray7.length) {
				@Pc(42) int local42;
				for (local42 = 1; local42 <= this.anInt1345; local42 += local42) {
				}
				@Pc(59) byte[] local59 = new byte[local42];
				Static135.method733(this.aByteArray7, 0, local59, 0, this.anInt1345);
				this.aByteArray7 = local59;
			}
			this.aByteArray7[this.anInt1345++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)I")
	public int method839() {
		return this.anInt1345;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(Lclient!he;B)Z")
	public boolean method840(@OriginalArg(0) Class26 arg0) {
		if (this.anInt1345 < arg0.anInt1345) {
			return false;
		}
		@Pc(19) int local19 = this.anInt1345 - arg0.anInt1345;
		for (@Pc(29) int local29 = 0; local29 < arg0.anInt1345; local29++) {
			if (this.aByteArray7[local19 + local29] != arg0.aByteArray7[local29]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(B)Lclient!he;")
	public Class26 method841() {
		@Pc(7) Class26 local7 = new Class26();
		local7.anInt1345 = this.anInt1345;
		local7.aByteArray7 = new byte[this.anInt1345];
		for (@Pc(23) int local23 = 0; local23 < this.anInt1345; local23++) {
			@Pc(29) byte local29 = this.aByteArray7[local23];
			if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
				local29 = (byte) (local29 + 32);
			}
			local7.aByteArray7[local23] = local29;
		}
		return local7;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)Lclient!he;")
	public Class26 method842() {
		@Pc(7) long local7 = this.method826();
		@Pc(16) Class local16 = he.class;
		synchronized (he.class) {
			@Pc(26) Class3_Sub21 local26;
			if (Static43.aClass17_18 == null) {
				Static43.aClass17_18 = new Class17(4096);
			} else {
				for (local26 = (Class3_Sub21) Static43.aClass17_18.method599(local7); local26 != null; local26 = (Class3_Sub21) Static43.aClass17_18.method602()) {
					if (this.method816(local26.aClass26_1567)) {
						return local26.aClass26_1567;
					}
				}
			}
			local26 = new Class3_Sub21();
			local26.aClass26_1567 = this;
			this.aBoolean72 = false;
			Static43.aClass17_18.method594(local26, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BII)Lclient!he;")
	public Class26 method843(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class26 local7 = new Class26();
		local7.aByteArray7 = new byte[arg1 - arg0];
		local7.anInt1345 = arg1 - arg0;
		Static135.method733(this.aByteArray7, arg0, local7.aByteArray7, 0, local7.anInt1345);
		return local7;
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(I)Lclient!he;")
	public Class26 method845() {
		if (!this.aBoolean72) {
			throw new IllegalArgumentException();
		}
		this.anInt1332 = 0;
		if (this.anInt1345 != this.aByteArray7.length) {
			@Pc(23) byte[] local23 = new byte[this.anInt1345];
			Static135.method733(this.aByteArray7, 0, local23, 0, this.anInt1345);
			this.aByteArray7 = local23;
		}
		return this;
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(Lclient!he;B)Lclient!he;")
	public Class26 method846(@OriginalArg(0) Class26 arg0) {
		if (!this.aBoolean72) {
			throw new IllegalArgumentException();
		}
		this.anInt1332 = 0;
		if (arg0.anInt1345 + this.anInt1345 > this.aByteArray7.length) {
			@Pc(31) int local31;
			for (local31 = 1; local31 < arg0.anInt1345 + this.anInt1345; local31 += local31) {
			}
			@Pc(47) byte[] local47 = new byte[local31];
			Static135.method733(this.aByteArray7, 0, local47, 0, this.anInt1345);
			this.aByteArray7 = local47;
		}
		Static135.method733(arg0.aByteArray7, 0, this.aByteArray7, this.anInt1345, arg0.anInt1345);
		this.anInt1345 += arg0.anInt1345;
		return this;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!he;I)I")
	public int method847(@OriginalArg(0) Class26 arg0) {
		@Pc(13) int local13;
		if (arg0.anInt1345 >= this.anInt1345) {
			local13 = this.anInt1345;
		} else {
			local13 = arg0.anInt1345;
		}
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			if (Static32.anIntArray108[arg0.aByteArray7[local20] & 0xFF] > Static32.anIntArray108[this.aByteArray7[local20] & 0xFF]) {
				return -1;
			}
			if (Static32.anIntArray108[this.aByteArray7[local20] & 0xFF] > Static32.anIntArray108[arg0.aByteArray7[local20] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt1345 < arg0.anInt1345) {
			return -1;
		} else if (arg0.anInt1345 < this.anInt1345) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(II)I")
	public int method848(@OriginalArg(1) int arg0) {
		return this.aByteArray7[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!he", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(II)I")
	public int method849(@OriginalArg(1) int arg0) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1345; local21++) {
			@Pc(30) int local30 = this.aByteArray7[local21] & 0xFF;
			if (local21 == 0) {
				if (local30 == 45) {
					local15 = true;
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
			if (local30 >= arg0) {
				throw new NumberFormatException();
			}
			if (local15) {
				local30 = -local30;
			}
			@Pc(104) int local104 = arg0 * local19 + local30;
			if (local104 / arg0 != local19) {
				throw new NumberFormatException();
			}
			local19 = local104;
			local17 = true;
		}
		if (!local17) {
			throw new NumberFormatException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(I)[B")
	public byte[] method850() {
		@Pc(14) byte[] local14 = new byte[this.anInt1345];
		Static135.method733(this.aByteArray7, 0, local14, 0, this.anInt1345);
		return local14;
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(II)I")
	public int method851(@OriginalArg(0) int arg0) {
		return this.method825(arg0);
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(II)Lclient!he;")
	public Class26 method852(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(22) Class26 local22 = new Class26();
		local22.aByteArray7 = new byte[this.anInt1345 + 1];
		local22.anInt1345 = this.anInt1345 + 1;
		Static135.method733(this.aByteArray7, 0, local22.aByteArray7, 0, this.anInt1345);
		local22.aByteArray7[this.anInt1345] = (byte) arg0;
		return local22;
	}

	@OriginalMember(owner = "client!he", name = "h", descriptor = "(I)Lclient!he;")
	public Class26 method853() {
		@Pc(14) boolean local14 = true;
		@Pc(18) Class26 local18 = new Class26();
		local18.anInt1345 = this.anInt1345;
		local18.aByteArray7 = new byte[this.anInt1345];
		for (@Pc(29) int local29 = 0; local29 < this.anInt1345; local29++) {
			@Pc(36) byte local36 = this.aByteArray7[local29];
			if (local36 == 95) {
				local18.aByteArray7[local29] = 32;
				local14 = true;
			} else if (local36 >= 97 && local36 <= 122 && local14) {
				local14 = false;
				local18.aByteArray7[local29] = (byte) (local36 - 32);
			} else {
				local14 = false;
				local18.aByteArray7[local29] = local36;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)Z")
	private boolean method855() {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt1345; local28++) {
			@Pc(36) int local36 = this.aByteArray7[local28] & 0xFF;
			if (local28 == 0) {
				if (local36 == 45) {
					local15 = true;
					continue;
				}
				if (local36 == 43) {
					continue;
				}
			}
			if (local36 >= 48 && local36 <= 57) {
				local36 -= 48;
			} else if (local36 >= 65 && local36 <= 90) {
				local36 -= 55;
			} else if (local36 >= 97 && local36 <= 122) {
				local36 -= 87;
			} else {
				return false;
			}
			if (local36 >= 10) {
				return false;
			}
			if (local15) {
				local36 = -local36;
			}
			@Pc(96) int local96 = local36 + local19 * 10;
			if (local19 != local96 / 10) {
				return false;
			}
			local17 = true;
			local19 = local96;
		}
		return local17;
	}
}
