import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class70 implements Interface3 {

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
	private int anInt3880;

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
	public int anInt3915;

	@OriginalMember(owner = "client!rf", name = "J", descriptor = "Z")
	private boolean aBoolean146 = true;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)Lclient!rf;")
	public Class70 method2889(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean146) {
			this.anInt3880 = 0;
			if (this.aByteArray46.length == this.anInt3915) {
				@Pc(44) int local44;
				for (local44 = 1; local44 <= this.anInt3915; local44 += local44) {
				}
				@Pc(57) byte[] local57 = new byte[local44];
				Static188.method2304(this.aByteArray46, 0, local57, 0, this.anInt3915);
				this.aByteArray46 = local57;
			}
			this.aByteArray46[this.anInt3915++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)J")
	private long method2890() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt3915; local7++) {
			local5 = (long) (this.aByteArray46[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!rf;)Z")
	public boolean method2891(@OriginalArg(1) Class70 arg0) {
		if (this.anInt3915 < arg0.anInt3915) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt3915; local23++) {
			if (arg0.aByteArray46[local23] != this.aByteArray46[local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)I")
	public int method2892() {
		return this.method2908(10);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Lclient!rf;")
	public Class70 method2893() {
		if (!this.aBoolean146) {
			throw new IllegalArgumentException();
		}
		this.anInt3880 = 0;
		if (this.aByteArray46.length != this.anInt3915) {
			@Pc(32) byte[] local32 = new byte[this.anInt3915];
			Static188.method2304(this.aByteArray46, 0, local32, 0, this.anInt3915);
			this.aByteArray46 = local32;
		}
		return this;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Z")
	private boolean method2894() {
		@Pc(17) int local17 = 0;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		for (@Pc(31) int local31 = 0; local31 < this.anInt3915; local31++) {
			@Pc(40) int local40 = this.aByteArray46[local31] & 0xFF;
			if (local31 == 0) {
				if (local40 == 45) {
					local21 = true;
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
			if (local21) {
				local40 = -local40;
			}
			@Pc(108) int local108 = local17 * 10 + local40;
			if (local108 / 10 != local17) {
				return false;
			}
			local19 = true;
			local17 = local108;
		}
		return local19;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method2895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray46, 0, this.anInt3915, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray46, 0, this.anInt3915);
		}
		arg2.drawString(local18, arg1, arg0);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)I")
	public int method2896() {
		return this.anInt3915;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)Ljava/net/URL;")
	public URL method2897() throws MalformedURLException {
		return new URL(new String(this.aByteArray46, 0, this.anInt3915));
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)Lclient!rf;")
	public Class70 method2898() {
		@Pc(9) Class70 local9 = new Class70();
		local9.anInt3915 = this.anInt3915;
		@Pc(15) boolean local15 = true;
		local9.aByteArray46 = new byte[this.anInt3915];
		for (@Pc(30) int local30 = 0; local30 < this.anInt3915; local30++) {
			@Pc(37) byte local37 = this.aByteArray46[local30];
			if (local37 == 95) {
				local15 = true;
				local9.aByteArray46[local30] = 32;
			} else if (local37 >= 97 && local37 <= 122 && local15) {
				local15 = false;
				local9.aByteArray46[local30] = (byte) (local37 - 32);
			} else {
				local15 = false;
				local9.aByteArray46[local30] = local37;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)I")
	public int method2899(@OriginalArg(0) int arg0) {
		return this.aByteArray46[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILclient!rf;)I")
	public int method2900(@OriginalArg(1) int arg0, @OriginalArg(2) Class70 arg1) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(12) int[] local12 = new int[arg1.anInt3915];
		@Pc(16) int[] local16 = new int[arg1.anInt3915];
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			local8[local18] = arg1.anInt3915;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg1.anInt3915; local36++) {
			local12[local36 - 1] = (arg1.anInt3915 << 1) - local36;
			local8[arg1.aByteArray46[local36 - 1] & 0xFF] = arg1.anInt3915 - local36;
		}
		@Pc(75) int local75 = arg1.anInt3915 + 1;
		@Pc(78) int local78 = arg1.anInt3915;
		while (local78 > 0) {
			local16[local78 - 1] = local75;
			while (local75 <= arg1.anInt3915 && arg1.aByteArray46[local78 - 1] != arg1.aByteArray46[local75 - 1]) {
				if (local12[local75 - 1] >= arg1.anInt3915 - local78) {
					local12[local75 - 1] = arg1.anInt3915 - local78;
				}
				local75 = local16[local75 - 1];
			}
			local78--;
			local75--;
		}
		@Pc(153) int local153 = local75;
		local75 = arg1.anInt3915 + 1 - local75;
		@Pc(163) int local163 = 1;
		@Pc(165) int local165 = 0;
		@Pc(167) int local167 = 1;
		while (local75 >= local167) {
			local16[local167 - 1] = local165;
			while (local165 >= 1 && arg1.aByteArray46[local165 - 1] != arg1.aByteArray46[local167 - 1]) {
				local165 = local16[local165 - 1];
			}
			local167++;
			local165++;
		}
		@Pc(212) int local212;
		while (local153 < arg1.anInt3915) {
			for (local212 = local163; local212 <= local153; local212++) {
				if (local153 + arg1.anInt3915 - local212 <= local12[local212 + -1]) {
					local12[local212 - 1] = local153 + arg1.anInt3915 - local212;
				}
			}
			local163 = local153 + 1;
			local153 += local75 - local16[local75 - 1];
			local75 = local16[local75 - 1];
		}
		@Pc(286) int local286;
		for (local212 = arg1.anInt3915 + arg0 - 1; local212 < this.anInt3915; local212 += Math.max(local8[this.aByteArray46[local212] & 0xFF], local12[local286])) {
			for (local286 = arg1.anInt3915 - 1; local286 >= 0 && arg1.aByteArray46[local286] == this.aByteArray46[local212]; local286--) {
				local212--;
			}
			if (local286 == -1) {
				return local212 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!rf;I)Lclient!rf;")
	public Class70 method2901(@OriginalArg(0) Class70 arg0) {
		if (!this.aBoolean146) {
			throw new IllegalArgumentException();
		}
		this.anInt3880 = 0;
		if (this.aByteArray46.length < arg0.anInt3915 + this.anInt3915) {
			@Pc(34) int local34;
			for (local34 = 1; local34 < this.anInt3915 + arg0.anInt3915; local34 += local34) {
			}
			@Pc(51) byte[] local51 = new byte[local34];
			Static188.method2304(this.aByteArray46, 0, local51, 0, this.anInt3915);
			this.aByteArray46 = local51;
		}
		Static188.method2304(arg0.aByteArray46, 0, this.aByteArray46, this.anInt3915, arg0.anInt3915);
		this.anInt3915 += arg0.anInt3915;
		return this;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZLclient!rf;)I")
	public int method2902(@OriginalArg(1) Class70 arg0) {
		return this.method2900(0, arg0);
	}

	@OriginalMember(owner = "client!rf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBI)Lclient!rf;")
	public Class70 method2903(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class70 local3 = new Class70();
		local3.aByteArray46 = new byte[arg0 - arg1];
		local3.anInt3915 = arg0 - arg1;
		Static188.method2304(this.aByteArray46, arg1, local3.aByteArray46, 0, local3.anInt3915);
		return local3;
	}

	@OriginalMember(owner = "client!rf", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class70)) {
			throw new IllegalArgumentException();
		}
		return this.method2910((Class70) arg0);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)Lclient!rf;")
	public Class70 method2904() {
		@Pc(15) Class70 local15 = new Class70();
		local15.anInt3915 = this.anInt3915;
		local15.aByteArray46 = new byte[this.anInt3915];
		@Pc(26) byte local26 = 2;
		for (@Pc(28) int local28 = 0; local28 < this.anInt3915; local28++) {
			@Pc(34) byte local34 = this.aByteArray46[local28];
			if (local34 >= 97 && local34 <= 122 || !(local34 < -32 || local34 > -2 || local34 == -9)) {
				if (local26 == 2) {
					local34 = (byte) (local34 - 32);
				}
				local26 = 0;
			} else if (local34 >= 65 && local34 <= 90 || !(local34 < -64 || local34 > -34 || local34 == -41)) {
				if (local26 == 0) {
					local34 = (byte) (local34 + 32);
				}
				local26 = 0;
			} else if (local34 == 46 || local34 == 33 || local34 == 63) {
				local26 = 2;
			} else if (local34 != 32) {
				local26 = 1;
			} else if (local26 != 2) {
				local26 = 1;
			}
			local15.aByteArray46[local28] = local34;
		}
		return local15;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(Lclient!rf;I)Z")
	public boolean method2905(@OriginalArg(0) Class70 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt3915 == arg0.anInt3915) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt3915; local22++) {
				@Pc(29) byte local29 = this.aByteArray46[local22];
				if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
					local29 = (byte) (local29 + 32);
				}
				@Pc(62) byte local62 = arg0.aByteArray46[local22];
				if (local62 >= 65 && local62 <= 90 || local62 >= -64 && local62 <= -34 && local62 != -41) {
					local62 = (byte) (local62 + 32);
				}
				if (local62 != local29) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)Lclient!rf;")
	public Class70 method2906(@OriginalArg(0) int arg0) {
		return this.method2903(this.anInt3915, arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLclient!rf;)Z")
	public boolean method2907(@OriginalArg(1) Class70 arg0) {
		if (arg0.anInt3915 > this.anInt3915) {
			return false;
		}
		@Pc(22) int local22 = this.anInt3915 - arg0.anInt3915;
		for (@Pc(24) int local24 = 0; local24 < arg0.anInt3915; local24++) {
			if (this.aByteArray46[local24 + local22] != arg0.aByteArray46[local24]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)I")
	public int method2908(@OriginalArg(0) int arg0) {
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt3915; local25++) {
			@Pc(34) int local34 = this.aByteArray46[local25] & 0xFF;
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
			if (local34 >= arg0) {
				throw new NumberFormatException();
			}
			if (local21) {
				local34 = -local34;
			}
			@Pc(110) int local110 = local34 + local23 * arg0;
			if (local110 / arg0 != local23) {
				throw new NumberFormatException();
			}
			local23 = local110;
			local19 = true;
		}
		if (!local19) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)Z")
	public boolean method2909() {
		return this.method2894();
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(ILclient!rf;)Z")
	public boolean method2910(@OriginalArg(1) Class70 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt3915 == this.anInt3915) {
			if (!this.aBoolean146 || !arg0.aBoolean146) {
				if (this.anInt3880 == 0) {
					this.anInt3880 = this.method2923();
					if (this.anInt3880 == 0) {
						this.anInt3880 = 1;
					}
				}
				if (arg0.anInt3880 == 0) {
					arg0.anInt3880 = arg0.method2923();
					if (arg0.anInt3880 == 0) {
						arg0.anInt3880 = 1;
					}
				}
				if (this.anInt3880 != arg0.anInt3880) {
					return false;
				}
			}
			for (@Pc(71) int local71 = 0; local71 < this.anInt3915; local71++) {
				if (this.aByteArray46[local71] != arg0.aByteArray46[local71]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rf", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method2923();
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)Lclient!rf;")
	public Class70 method2911() {
		@Pc(17) Class70 local17 = Static108.method2267(this.method2925());
		return local17 == null ? Static118.aClass70_1079 : local17;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(ILclient!rf;)I")
	public int method2912(@OriginalArg(1) Class70 arg0) {
		@Pc(17) int local17;
		if (arg0.anInt3915 < this.anInt3915) {
			local17 = arg0.anInt3915;
		} else {
			local17 = this.anInt3915;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if (Static185.anIntArray440[this.aByteArray46[local24] & 0xFF] < Static185.anIntArray440[arg0.aByteArray46[local24] & 0xFF]) {
				return -1;
			}
			if (Static185.anIntArray440[arg0.aByteArray46[local24] & 0xFF] < Static185.anIntArray440[this.aByteArray46[local24] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt3915 > this.anInt3915) {
			return -1;
		} else if (this.anInt3915 > arg0.anInt3915) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I")
	public int method2913(@OriginalArg(0) FontMetrics arg0) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray46, 0, this.anInt3915, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray46, 0, this.anInt3915);
		}
		return arg0.stringWidth(local9);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(IB)Lclient!rf;")
	public Class70 method2914(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(30) Class70 local30 = new Class70();
		local30.aByteArray46 = new byte[this.anInt3915 + 1];
		local30.anInt3915 = this.anInt3915 + 1;
		Static188.method2304(this.aByteArray46, 0, local30.aByteArray46, 0, this.anInt3915);
		local30.aByteArray46[this.anInt3915] = (byte) arg0;
		return local30;
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(Z)Lclient!rf;")
	public Class70 method2917() {
		@Pc(7) Class70 local7 = new Class70();
		local7.anInt3915 = this.anInt3915;
		local7.aByteArray46 = new byte[this.anInt3915];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3915; local18++) {
			local7.aByteArray46[local18] = 42;
		}
		return local7;
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)Lclient!rf;")
	public Class70 method2918() {
		@Pc(10) long local10 = this.method2890();
		@Pc(23) Class local23 = rf.class;
		synchronized (rf.class) {
			@Pc(33) Class1_Sub23 local33;
			if (Static132.aClass30_12 == null) {
				Static132.aClass30_12 = new Class30(4096);
			} else {
				for (local33 = (Class1_Sub23) Static132.aClass30_12.method1467(local10); local33 != null; local33 = (Class1_Sub23) Static132.aClass30_12.method1466()) {
					if (this.method2910(local33.aClass70_1439)) {
						return local33.aClass70_1439;
					}
				}
			}
			local33 = new Class1_Sub23();
			local33.aClass70_1439 = this;
			this.aBoolean146 = false;
			Static132.aClass30_12.method1464(local33, local10);
			return this;
		}
	}

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)Lclient!rf;")
	public Class70 method2919() {
		@Pc(3) int local3;
		for (local3 = 0; local3 < this.anInt3915 && (this.aByteArray46[local3] >= 0 && this.aByteArray46[local3] <= 32 || (this.aByteArray46[local3] & 0xFF) == 160); local3++) {
		}
		@Pc(36) int local36;
		for (local36 = this.anInt3915; local3 < local36 && (this.aByteArray46[local36 - 1] >= 0 && this.aByteArray46[local36 - 1] <= 32 || (this.aByteArray46[local36 - 1] & 0xFF) == 160); local36--) {
		}
		if (local3 == 0 && this.anInt3915 == local36) {
			return this;
		}
		@Pc(97) Class70 local97 = new Class70();
		local97.anInt3915 = local36 - local3;
		local97.aByteArray46 = new byte[local97.anInt3915];
		for (@Pc(115) int local115 = 0; local115 < local97.anInt3915; local115++) {
			local97.aByteArray46[local115] = this.aByteArray46[local115 + local3];
		}
		return local97;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II[BII)I")
	public int method2921(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2) {
		Static188.method2304(this.aByteArray46, 0, arg1, arg2, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(Lclient!rf;I)I")
	public int method2922(@OriginalArg(0) Class70 arg0) {
		@Pc(13) int local13;
		if (arg0.anInt3915 < this.anInt3915) {
			local13 = arg0.anInt3915;
		} else {
			local13 = this.anInt3915;
		}
		for (@Pc(30) int local30 = 0; local30 < local13; local30++) {
			if ((this.aByteArray46[local30] & 0xFF) < (arg0.aByteArray46[local30] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray46[local30] & 0xFF) > (arg0.aByteArray46[local30] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt3915 < arg0.anInt3915) {
			return -1;
		} else if (arg0.anInt3915 < this.anInt3915) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "(I)I")
	public int method2923() {
		@Pc(5) int local5 = 0;
		for (@Pc(13) int local13 = 0; local13 < this.anInt3915; local13++) {
			local5 = (local5 << 5) + (this.aByteArray46[local13] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)I")
	public int method2924(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte local13 = (byte) arg0;
		for (@Pc(15) int local15 = arg1; local15 < this.anInt3915; local15++) {
			if (this.aByteArray46[local15] == local13) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "(I)J")
	public long method2925() {
		@Pc(7) long local7 = 0L;
		for (@Pc(9) int local9 = 0; local9 < this.anInt3915 && local9 < 12; local9++) {
			local7 *= 37L;
			@Pc(20) byte local20 = this.aByteArray46[local9];
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

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "(I)[B")
	public byte[] method2926() {
		@Pc(9) byte[] local9 = new byte[this.anInt3915];
		Static188.method2304(this.aByteArray46, 0, local9, 0, this.anInt3915);
		return local9;
	}

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "(I)Lclient!rf;")
	public Class70 method2927() {
		@Pc(9) Class70 local9 = new Class70();
		local9.anInt3915 = this.anInt3915;
		local9.aByteArray46 = new byte[this.anInt3915];
		for (@Pc(25) int local25 = 0; local25 < this.anInt3915; local25++) {
			@Pc(32) byte local32 = this.aByteArray46[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local9.aByteArray46[local25] = local32;
		}
		return local9;
	}
}
