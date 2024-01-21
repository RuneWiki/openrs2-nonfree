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

@OriginalClass("client!dj")
public final class Class24 implements Interface3 {

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!dj", name = "J", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!dj", name = "kb", descriptor = "I")
	public int anInt1084;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Z")
	private boolean aBoolean59 = true;

	@OriginalMember(owner = "client!dj", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method745();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!dj;)I")
	public int method738(@OriginalArg(1) Class24 arg0) {
		return this.method767(0, arg0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)J")
	private long method740() {
		@Pc(5) long local5 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt1084; local14++) {
			local5 = (local5 << 5) - (local5 - ((long) (this.aByteArray13[local14] & 0xFF)));
		}
		return local5;
	}

	@OriginalMember(owner = "client!dj", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class24)) {
			throw new IllegalArgumentException();
		}
		return this.method755((Class24) arg0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!dj;Z)Z")
	public boolean method741(@OriginalArg(0) Class24 arg0) {
		if (arg0.anInt1084 > this.anInt1084) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1084; local12++) {
			@Pc(18) byte local18 = this.aByteArray13[local12];
			if (local18 >= 65 && local18 <= 90 || local18 >= -64 && local18 <= -34 && local18 != -41) {
				local18 = (byte) (local18 + 32);
			}
			@Pc(47) byte local47 = arg0.aByteArray13[local12];
			if (local47 >= 65 && local47 <= 90 || local47 >= -64 && local47 <= -34 && local47 != -41) {
				local47 = (byte) (local47 + 32);
			}
			if (local47 != local18) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBII[B)I")
	public int method742(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2) {
		Static214.method348(this.aByteArray13, 0, arg2, arg0, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I")
	public int method743(@OriginalArg(1) int arg0) {
		return this.aByteArray13[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)[Lclient!dj;")
	public Class24[] method744(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1084; local7++) {
			if (arg0 == this.aByteArray13[local7]) {
				local5++;
			}
		}
		@Pc(29) Class24[] local29 = new Class24[local5 + 1];
		if (local5 == 0) {
			local29[0] = this;
			return local29;
		}
		@Pc(42) int local42 = 0;
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < local5; local51++) {
			@Pc(54) int local54;
			for (local54 = 0; arg0 != this.aByteArray13[local54 + local49]; local54++) {
			}
			local29[local42++] = this.method759(local54 + local49, local49);
			local49 += local54 + 1;
		}
		local29[local5] = this.method759(this.anInt1084, local49);
		return local29;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I")
	public int method745() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1084; local7++) {
			local5 = (local5 << 5) + (this.aByteArray13[local7] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)Z")
	public boolean method746() {
		return this.method762();
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)J")
	public long method747() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1084 && local7 < 12; local7++) {
			local5 *= 37L;
			@Pc(22) byte local22 = this.aByteArray13[local7];
			if (local22 >= 65 && local22 <= 90) {
				local5 += local22 + 1 - 65;
			} else if (local22 >= 97 && local22 <= 122) {
				local5 += local22 + 1 - 97;
			} else if (local22 >= 48 && local22 <= 57) {
				local5 += local22 + 27 - 48;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(II)Lclient!dj;")
	public Class24 method748(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean59) {
			this.anInt1034 = 0;
			if (this.aByteArray13.length == this.anInt1084) {
				@Pc(45) int local45;
				for (local45 = 1; local45 <= this.anInt1084; local45 += local45) {
				}
				@Pc(57) byte[] local57 = new byte[local45];
				Static214.method348(this.aByteArray13, 0, local57, 0, this.anInt1084);
				this.aByteArray13 = local57;
			}
			this.aByteArray13[this.anInt1084++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Ljava/net/URL;")
	public URL method749() throws MalformedURLException {
		return new URL(new String(this.aByteArray13, 0, this.anInt1084));
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/net/URL;)Ljava/net/URL;")
	public URL method750(@OriginalArg(1) URL arg0) throws MalformedURLException {
		return new URL(arg0, new String(this.aByteArray13, 0, this.anInt1084));
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!dj;I)Z")
	public boolean method751(@OriginalArg(0) Class24 arg0) {
		if (arg0.anInt1084 > this.anInt1084) {
			return false;
		}
		@Pc(19) int local19 = this.anInt1084 - arg0.anInt1084;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1084; local21++) {
			if (this.aByteArray13[local21 + local19] != arg0.aByteArray13[local21]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)Lclient!dj;")
	public Class24 method752() {
		if (!this.aBoolean59) {
			throw new IllegalArgumentException();
		}
		this.anInt1034 = 0;
		if (this.aByteArray13.length != this.anInt1084) {
			@Pc(31) byte[] local31 = new byte[this.anInt1084];
			Static214.method348(this.aByteArray13, 0, local31, 0, this.anInt1084);
			this.aByteArray13 = local31;
		}
		return this;
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)Lclient!dj;")
	public Class24 method753() {
		@Pc(14) Class24 local14 = new Class24();
		local14.anInt1084 = this.anInt1084;
		local14.aByteArray13 = new byte[this.anInt1084];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1084; local25++) {
			@Pc(31) byte local31 = this.aByteArray13[local25];
			if (local31 >= 65 && local31 <= 90 || local31 >= -64 && local31 <= -34 && local31 != -41) {
				local31 = (byte) (local31 + 32);
			}
			local14.aByteArray13[local25] = local31;
		}
		return local14;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(Lclient!dj;I)I")
	public int method754(@OriginalArg(0) Class24 arg0) {
		@Pc(21) int local21;
		if (arg0.anInt1084 >= this.anInt1084) {
			local21 = this.anInt1084;
		} else {
			local21 = arg0.anInt1084;
		}
		for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
			if (Static183.anIntArray356[arg0.aByteArray13[local27] & 0xFF] > Static183.anIntArray356[this.aByteArray13[local27] & 0xFF]) {
				return -1;
			}
			if (Static183.anIntArray356[arg0.aByteArray13[local27] & 0xFF] < Static183.anIntArray356[this.aByteArray13[local27] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt1084 > this.anInt1084) {
			return -1;
		} else if (arg0.anInt1084 < this.anInt1084) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(Lclient!dj;I)Z")
	public boolean method755(@OriginalArg(0) Class24 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1084 == this.anInt1084) {
			if (!this.aBoolean59 || !arg0.aBoolean59) {
				if (this.anInt1034 == 0) {
					this.anInt1034 = this.method745();
					if (this.anInt1034 == 0) {
						this.anInt1034 = 1;
					}
				}
				if (arg0.anInt1034 == 0) {
					arg0.anInt1034 = arg0.method745();
					if (arg0.anInt1034 == 0) {
						arg0.anInt1034 = 1;
					}
				}
				if (this.anInt1034 != arg0.anInt1034) {
					return false;
				}
			}
			for (@Pc(73) int local73 = 0; local73 < this.anInt1084; local73++) {
				if (arg0.aByteArray13[local73] != this.aByteArray13[local73]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLclient!dj;)I")
	public int method756(@OriginalArg(1) Class24 arg0) {
		@Pc(11) int local11;
		if (this.anInt1084 > arg0.anInt1084) {
			local11 = arg0.anInt1084;
		} else {
			local11 = this.anInt1084;
		}
		for (@Pc(25) int local25 = 0; local25 < local11; local25++) {
			if ((arg0.aByteArray13[local25] & 0xFF) > (this.aByteArray13[local25] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray13[local25] & 0xFF) < (this.aByteArray13[local25] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt1084 < arg0.anInt1084) {
			return -1;
		} else if (arg0.anInt1084 < this.anInt1084) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)Lclient!dj;")
	public Class24 method758() {
		@Pc(16) Class24 local16 = Static35.method3219(this.method747());
		return local16 == null ? Static187.aClass24_1203 : local16;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Lclient!dj;")
	public Class24 method759(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class24 local7 = new Class24();
		local7.aByteArray13 = new byte[arg0 - arg1];
		local7.anInt1084 = arg0 - arg1;
		Static214.method348(this.aByteArray13, arg1, local7.aByteArray13, 0, local7.anInt1084);
		return local7;
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(II)I")
	public int method760(@OriginalArg(1) int arg0) {
		@Pc(20) int local20 = 0;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < this.anInt1084; local26++) {
			@Pc(34) int local34 = this.aByteArray13[local26] & 0xFF;
			if (local26 == 0) {
				if (local34 == 45) {
					local22 = true;
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
			if (local34 >= arg0) {
				throw new NumberFormatException();
			}
			if (local22) {
				local34 = -local34;
			}
			@Pc(103) int local103 = arg0 * local20 + local34;
			if (local103 / arg0 != local20) {
				throw new NumberFormatException();
			}
			local24 = true;
			local20 = local103;
		}
		if (!local24) {
			throw new NumberFormatException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(Z)Lclient!dj;")
	public Class24 method761() {
		@Pc(7) Class24 local7 = new Class24();
		local7.anInt1084 = this.anInt1084;
		local7.aByteArray13 = new byte[this.anInt1084];
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1084; local20++) {
			@Pc(30) byte local30 = this.aByteArray13[local20];
			if (local30 == 95) {
				local18 = true;
				local7.aByteArray13[local20] = 32;
			} else if (local30 >= 97 && local30 <= 122 && local18) {
				local7.aByteArray13[local20] = (byte) (local30 - 32);
				local18 = false;
			} else {
				local18 = false;
				local7.aByteArray13[local20] = local30;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(II)Z")
	private boolean method762() {
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt1084; local28++) {
			@Pc(36) int local36 = this.aByteArray13[local28] & 0xFF;
			if (local28 == 0) {
				if (local36 == 45) {
					local17 = true;
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
			if (local17) {
				local36 = -local36;
			}
			@Pc(96) int local96 = local36 + local21 * 10;
			if (local21 != local96 / 10) {
				return false;
			}
			local21 = local96;
			local19 = true;
		}
		return local19;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(Z)Lclient!dj;")
	public Class24 method763() {
		@Pc(5) Class24 local5 = new Class24();
		@Pc(11) byte local11 = 2;
		local5.anInt1084 = this.anInt1084;
		local5.aByteArray13 = new byte[this.anInt1084];
		for (@Pc(30) int local30 = 0; local30 < this.anInt1084; local30++) {
			@Pc(37) byte local37 = this.aByteArray13[local30];
			if (local37 >= 97 && local37 <= 122 || !(local37 < -32 || local37 > -2 || local37 == -9)) {
				if (local11 == 2) {
					local37 = (byte) (local37 - 32);
				}
				local11 = 0;
			} else if (local37 >= 65 && local37 <= 90 || !(local37 < -64 || local37 > -34 || local37 == -41)) {
				if (local11 == 0) {
					local37 = (byte) (local37 + 32);
				}
				local11 = 0;
			} else if (local37 == 46 || local37 == 33 || local37 == 63) {
				local11 = 2;
			} else if (local37 != 32) {
				local11 = 1;
			} else if (local11 != 2) {
				local11 = 1;
			}
			local5.aByteArray13[local30] = local37;
		}
		return local5;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZLclient!dj;)Z")
	public boolean method764(@OriginalArg(1) Class24 arg0) {
		if (this.anInt1084 < arg0.anInt1084) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1084; local21++) {
			if (arg0.aByteArray13[local21] != this.aByteArray13[local21]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(III)I")
	public int method765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte local6 = (byte) arg1;
		for (@Pc(16) int local16 = arg0; local16 < this.anInt1084; local16++) {
			if (local6 == this.aByteArray13[local16]) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)Lclient!dj;")
	public Class24 method766() {
		@Pc(7) long local7 = this.method740();
		@Pc(16) Class local16 = dj.class;
		synchronized (dj.class) {
			@Pc(35) Class1_Sub21 local35;
			if (Static153.aClass57_34 == null) {
				Static153.aClass57_34 = new Class57(4096);
			} else {
				for (local35 = (Class1_Sub21) Static153.aClass57_34.method1872(local7); local35 != null; local35 = (Class1_Sub21) Static153.aClass57_34.method1877()) {
					if (this.method755(local35.aClass24_971)) {
						return local35.aClass24_971;
					}
				}
			}
			local35 = new Class1_Sub21();
			local35.aClass24_971 = this;
			this.aBoolean59 = false;
			Static153.aClass57_34.method1874(local35, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BILclient!dj;)I")
	public int method767(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		@Pc(3) int[] local3 = new int[arg1.anInt1084];
		@Pc(6) int[] local6 = new int[256];
		@Pc(14) int[] local14 = new int[arg1.anInt1084];
		for (@Pc(16) int local16 = 0; local16 < local6.length; local16++) {
			local6[local16] = arg1.anInt1084;
		}
		for (@Pc(37) int local37 = 1; local37 <= arg1.anInt1084; local37++) {
			local3[local37 - 1] = (arg1.anInt1084 << 1) - local37;
			local6[arg1.aByteArray13[local37 - 1] & 0xFF] = arg1.anInt1084 - local37;
		}
		@Pc(74) int local74 = arg1.anInt1084 + 1;
		for (@Pc(77) int local77 = arg1.anInt1084; local77 > 0; local77--) {
			local14[local77 - 1] = local74;
			while (arg1.anInt1084 >= local74 && arg1.aByteArray13[local74 - 1] != arg1.aByteArray13[local77 - 1]) {
				if (local3[local74 - 1] >= arg1.anInt1084 - local77) {
					local3[local74 - 1] = arg1.anInt1084 - local77;
				}
				local74 = local14[local74 - 1];
			}
			local74--;
		}
		@Pc(135) int local135 = local74;
		local74 = arg1.anInt1084 + 1 - local74;
		@Pc(145) int local145 = 1;
		@Pc(147) int local147 = 0;
		for (@Pc(149) int local149 = 1; local149 <= local74; local149++) {
			local14[local149 - 1] = local147;
			while (local147 >= 1 && arg1.aByteArray13[local147 - 1] != arg1.aByteArray13[local149 - 1]) {
				local147 = local14[local147 - 1];
			}
			local147++;
		}
		@Pc(191) int local191;
		while (local135 < arg1.anInt1084) {
			for (local191 = local145; local191 <= local135; local191++) {
				if (local3[local191 - 1] >= arg1.anInt1084 + local135 - local191) {
					local3[local191 - 1] = local135 + arg1.anInt1084 - local191;
				}
			}
			local145 = local135 + 1;
			local135 = local135 + local74 - local14[local74 - 1];
			local74 = local14[local74 - 1];
		}
		@Pc(268) int local268;
		for (local191 = arg1.anInt1084 + arg0 - 1; local191 < this.anInt1084; local191 += Math.max(local6[this.aByteArray13[local191] & 0xFF], local3[local268])) {
			for (local268 = arg1.anInt1084 - 1; local268 >= 0 && arg1.aByteArray13[local268] == this.aByteArray13[local191]; local268--) {
				local191--;
			}
			if (local268 == -1) {
				return local191 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)[B")
	public byte[] method768() {
		@Pc(7) byte[] local7 = new byte[this.anInt1084];
		Static214.method348(this.aByteArray13, 0, local7, 0, this.anInt1084);
		return local7;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIZ)Lclient!dj;")
	public Class24 method769() {
		@Pc(15) Class24 local15 = new Class24();
		local15.anInt1084 = this.anInt1084;
		local15.aByteArray13 = new byte[this.anInt1084];
		for (@Pc(29) int local29 = 0; local29 < this.anInt1084; local29++) {
			@Pc(35) byte local35 = this.aByteArray13[local29];
			if (local35 == 47) {
				local15.aByteArray13[local29] = 32;
			} else {
				local15.aByteArray13[local29] = local35;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/applet/Applet;I)V")
	public void method770(@OriginalArg(0) Applet arg0) throws Throwable {
		@Pc(12) String local12 = new String(this.aByteArray13, 0, this.anInt1084);
		Static220.method2526(arg0, local12);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(Lclient!dj;Z)Z")
	public boolean method771(@OriginalArg(0) Class24 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1084 == this.anInt1084) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt1084; local27++) {
				@Pc(33) byte local33 = this.aByteArray13[local27];
				if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
					local33 = (byte) (local33 + 32);
				}
				@Pc(62) byte local62 = arg0.aByteArray13[local27];
				if (local62 >= 65 && local62 <= 90 || local62 >= -64 && local62 <= -34 && local62 != -41) {
					local62 = (byte) (local62 + 32);
				}
				if (local62 != local33) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(B)I")
	public int method772() {
		return this.method760(10);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)Lclient!dj;")
	public Class24 method773(@OriginalArg(0) int arg0) {
		return this.method759(this.anInt1084, arg0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/awt/FontMetrics;Z)I")
	public int method774(@OriginalArg(0) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray13, 0, this.anInt1084, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray13, 0, this.anInt1084);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!dj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/applet/Applet;)Lclient!dj;")
	public Class24 method775(@OriginalArg(1) Applet arg0) {
		@Pc(12) String local12 = new String(this.aByteArray13, 0, this.anInt1084);
		@Pc(24) String local24 = arg0.getParameter(local12);
		return local24 == null ? null : Static54.method2993(local24);
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(Z)V")
	public void method776() {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray13, 0, this.anInt1084, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local13 = new String(this.aByteArray13, 0, this.anInt1084);
		}
		System.out.println(local13);
	}

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "(B)Lclient!dj;")
	public Class24 method777() {
		@Pc(5) Class24 local5 = new Class24();
		local5.anInt1084 = this.anInt1084;
		local5.aByteArray13 = new byte[this.anInt1084];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1084; local28++) {
			local5.aByteArray13[local28] = 42;
		}
		return local5;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(Lclient!dj;Z)Lclient!dj;")
	public Class24 method778(@OriginalArg(0) Class24 arg0) {
		if (!this.aBoolean59) {
			throw new IllegalArgumentException();
		}
		this.anInt1034 = 0;
		if (this.aByteArray13.length < this.anInt1084 + arg0.anInt1084) {
			@Pc(32) int local32;
			for (local32 = 1; local32 < arg0.anInt1084 + this.anInt1084; local32 += local32) {
			}
			@Pc(47) byte[] local47 = new byte[local32];
			Static214.method348(this.aByteArray13, 0, local47, 0, this.anInt1084);
			this.aByteArray13 = local47;
		}
		Static214.method348(arg0.aByteArray13, 0, this.aByteArray13, this.anInt1084, arg0.anInt1084);
		this.anInt1084 += arg0.anInt1084;
		return this;
	}

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "(II)Lclient!dj;")
	public Class24 method779(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(19) Class24 local19 = new Class24();
		local19.aByteArray13 = new byte[this.anInt1084 + 1];
		local19.anInt1084 = this.anInt1084 + 1;
		Static214.method348(this.aByteArray13, 0, local19.aByteArray13, 0, this.anInt1084);
		local19.aByteArray13[this.anInt1084] = (byte) arg0;
		return local19;
	}

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "(I)Lclient!dj;")
	public Class24 method780() {
		@Pc(6) int local6 = this.anInt1084;
		@Pc(8) int local8;
		for (local8 = 0; this.anInt1084 > local8 && (this.aByteArray13[local8] >= 0 && this.aByteArray13[local8] <= 32 || (this.aByteArray13[local8] & 0xFF) == 160); local8++) {
		}
		while (local6 > local8 && (this.aByteArray13[local6 - 1] >= 0 && this.aByteArray13[local6 - 1] <= 32 || (this.aByteArray13[local6 - 1] & 0xFF) == 160)) {
			local6--;
		}
		if (local8 == 0 && this.anInt1084 == local6) {
			return this;
		}
		@Pc(100) Class24 local100 = new Class24();
		local100.anInt1084 = local6 - local8;
		local100.aByteArray13 = new byte[local100.anInt1084];
		for (@Pc(113) int local113 = 0; local113 < local100.anInt1084; local113++) {
			local100.aByteArray13[local113] = this.aByteArray13[local8 + local113];
		}
		return local100;
	}

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "(I)I")
	public int method781() {
		return this.anInt1084;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
	public void method782(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2) {
		@Pc(17) String local17;
		try {
			local17 = new String(this.aByteArray13, 0, this.anInt1084, "ISO-8859-1");
		} catch (@Pc(19) UnsupportedEncodingException local19) {
			local17 = new String(this.aByteArray13, 0, this.anInt1084);
		}
		arg1.drawString(local17, arg2, arg0);
	}
}
