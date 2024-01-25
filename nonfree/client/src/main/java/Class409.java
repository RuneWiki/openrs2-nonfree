import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class409 {

	@OriginalMember(owner = "client!wv", name = "m", descriptor = "[S")
	private short[] aShortArray148;

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "Lclient!dca;")
	public Class73 aClass73_2;

	@OriginalMember(owner = "client!wv", name = "n", descriptor = "[S")
	private short[] aShortArray149;

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "[S")
	private short[] aShortArray150;

	@OriginalMember(owner = "client!wv", name = "o", descriptor = "[I")
	private int[] anIntArray799;

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "[S")
	private short[] aShortArray151;

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "[I")
	private final int[] anIntArray798 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZILclient!ika;)V")
	private void method9588(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			arg1.method2048(255);
			return;
		}
		@Pc(33) int local33;
		@Pc(43) int local43;
		if (arg0 == 2) {
			local33 = arg1.method2048(255);
			this.anIntArray799 = new int[local33];
			for (local43 = 0; local43 < local33; local43++) {
				this.anIntArray799[local43] = arg1.method2028(-14795);
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local33 = arg1.method2048(255);
				this.aShortArray148 = new short[local33];
				this.aShortArray151 = new short[local33];
				for (local43 = 0; local43 < local33; local43++) {
					this.aShortArray151[local43] = (short) arg1.method2028(-14795);
					this.aShortArray148[local43] = (short) arg1.method2028(-14795);
				}
			} else if (arg0 == 41) {
				local33 = arg1.method2048(255);
				this.aShortArray149 = new short[local33];
				this.aShortArray150 = new short[local33];
				for (local43 = 0; local43 < local33; local43++) {
					this.aShortArray150[local43] = (short) arg1.method2028(-14795);
					this.aShortArray149[local43] = (short) arg1.method2028(-14795);
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray798[arg0 - 60] = arg1.method2028(-14795);
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)Lclient!gt;")
	public Class145 method9590() {
		if (this.anIntArray799 == null) {
			return null;
		}
		@Pc(16) Class145[] local16 = new Class145[this.anIntArray799.length];
		@Pc(20) Class182 local20 = this.aClass73_2.aClass182_32;
		@Pc(24) int local24;
		synchronized (this.aClass73_2.aClass182_32) {
			local24 = 0;
			while (true) {
				if (this.anIntArray799.length <= local24) {
					break;
				}
				local16[local24] = Static716.method9500(this.anIntArray799[local24], this.aClass73_2.aClass182_32);
				local24++;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anIntArray799.length; local61++) {
			if (local16[local61].anInt3633 < 13) {
				local16[local61].method3297(2);
			}
		}
		if (35 != 35) {
			Static726.method9589(-40, 24, 39, -47, 65, 76, -59);
		}
		@Pc(119) Class145 local119;
		if (local16.length == 1) {
			local119 = local16[0];
		} else {
			local119 = new Class145(local16, local16.length);
		}
		if (local119 == null) {
			return null;
		}
		if (this.aShortArray151 != null) {
			for (local24 = 0; local24 < this.aShortArray151.length; local24++) {
				local119.method3299(this.aShortArray151[local24], this.aShortArray148[local24]);
			}
		}
		if (this.aShortArray150 != null) {
			for (local24 = 0; local24 < this.aShortArray150.length; local24++) {
				local119.method3300(this.aShortArray150[local24], (byte) -124, this.aShortArray149[local24]);
			}
		}
		return local119;
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(Z)Z")
	public boolean method9591() {
		if (this.anIntArray799 == null) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		@Pc(17) Class182 local17 = this.aClass73_2.aClass182_32;
		synchronized (this.aClass73_2.aClass182_32) {
			for (@Pc(28) int local28 = 0; local28 < this.anIntArray799.length; local28++) {
				if (!this.aClass73_2.aClass182_32.method3986(this.anIntArray799[local28], 0)) {
					local13 = false;
				}
			}
			return local13;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)Lclient!gt;")
	public Class145 method9592() {
		@Pc(8) Class145[] local8 = new Class145[5];
		@Pc(19) int local19 = 0;
		@Pc(23) Class182 local23 = this.aClass73_2.aClass182_32;
		@Pc(27) int local27;
		synchronized (this.aClass73_2.aClass182_32) {
			local27 = 0;
			while (true) {
				if (local27 >= 5) {
					break;
				}
				if (this.anIntArray798[local27] != -1) {
					local8[local19++] = Static716.method9500(this.anIntArray798[local27], this.aClass73_2.aClass182_32);
				}
				local27++;
			}
		}
		for (@Pc(68) int local68 = 0; local68 < 5; local68++) {
			if (local8[local68] != null && local8[local68].anInt3633 < 13) {
				local8[local68].method3297(2);
			}
		}
		@Pc(102) Class145 local102 = new Class145(local8, local19);
		if (this.aShortArray151 != null) {
			for (local27 = 0; local27 < this.aShortArray151.length; local27++) {
				local102.method3299(this.aShortArray151[local27], this.aShortArray148[local27]);
			}
		}
		if (this.aShortArray150 != null) {
			for (local27 = 0; local27 < this.aShortArray150.length; local27++) {
				local102.method3300(this.aShortArray150[local27], (byte) -102, this.aShortArray149[local27]);
			}
		}
		return local102;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILclient!ika;)V")
	public void method9593(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2048(255);
			if (local15 == 0) {
				return;
			}
			this.method9588(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)Z")
	public boolean method9594() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class182 local11 = this.aClass73_2.aClass182_32;
		synchronized (this.aClass73_2.aClass182_32) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray798[local15] != -1 && !this.aClass73_2.aClass182_32.method3986(this.anIntArray798[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}
}
