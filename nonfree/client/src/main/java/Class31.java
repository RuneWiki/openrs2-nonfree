import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class31 {

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "Lclient!sv;")
	private Class306 aClass306_1 = null;

	@OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
	public int anInt775;

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "Lclient!so;")
	private final Class235 aClass235_1;

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "Z")
	private final boolean aBoolean65;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!so;ZI)V")
	public Class31(@OriginalArg(0) Class235 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt775 = arg2;
		this.aClass235_1 = arg0;
		this.aBoolean65 = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method652(@OriginalArg(0) String arg0) {
		if (this.method673()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass306_1.aClass236_1.method5091(Static318.method4858(local20));
			return this.method678(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Ljava/lang/String;B)I")
	public int method653(@OriginalArg(0) String arg0) {
		if (this.method673()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass306_1.aClass236_1.method5091(Static318.method4858(local18));
			return this.method671(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public void method654() {
		if (this.anObjectArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray1.length; local6++) {
				this.anObjectArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZZZ)V")
	public void method655(@OriginalArg(2) boolean arg0) {
		if (!this.method673()) {
			return;
		}
		this.aClass306_1.aClass236Array1 = null;
		this.aClass306_1.anIntArrayArray71 = null;
		if (arg0) {
			this.aClass306_1.anIntArray661 = null;
			this.aClass306_1.aClass236_1 = null;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I")
	public int method656() {
		if (!this.method673()) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anObjectArray1.length; local22++) {
			if (this.aClass306_1.anIntArray659[local22] > 0) {
				local20 += this.method674(local22);
				local18 += 100;
			}
		}
		if (local18 == 0) {
			return 100;
		} else {
			return local20 * 100 / local18;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I")
	public int method657(@OriginalArg(1) int arg0) {
		return this.method671(arg0) ? this.aClass306_1.anIntArray657[arg0] : 0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method658(@OriginalArg(0) String arg0) {
		if (this.method673()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass306_1.aClass236_1.method5091(Static318.method4858(local13));
			this.method666(local22);
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
	public void method660() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArrayArray1.length; local10++) {
				this.anObjectArrayArray1[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)[B")
	public byte[] method661(@OriginalArg(0) int arg0) {
		if (!this.method673()) {
			return null;
		} else if (this.aClass306_1.anIntArray657.length == 1) {
			return this.method667(0, arg0);
		} else if (!this.method671(arg0)) {
			return null;
		} else if (this.aClass306_1.anIntArray657[arg0] == 1) {
			return this.method667(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method662(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method673()) {
			return null;
		}
		@Pc(18) String local18 = arg0.toLowerCase();
		@Pc(21) String local21 = arg1.toLowerCase();
		@Pc(30) int local30 = this.aClass306_1.aClass236_1.method5091(Static318.method4858(local18));
		if (this.method671(local30)) {
			@Pc(48) int local48 = this.aClass306_1.aClass236Array1[local30].method5091(Static318.method4858(local21));
			return this.method667(local30, local48);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)Z")
	public boolean method663() {
		if (!this.method673()) {
			return false;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.aClass306_1.anIntArray658.length; local20++) {
			@Pc(28) int local28 = this.aClass306_1.anIntArray658[local20];
			if (this.anObjectArray1[local28] == null) {
				this.method686(local28);
				if (this.anObjectArray1[local28] == null) {
					local18 = false;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)[I")
	public int[] method664(@OriginalArg(0) int arg0) {
		if (!this.method671(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass306_1.anIntArrayArray72[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass306_1.anIntArray659[arg0]];
			@Pc(34) int local34 = 0;
			while (local23.length > local34) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II[II)Z")
	private boolean method665(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method671(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			return false;
		} else {
			@Pc(30) int local30 = this.aClass306_1.anIntArray659[arg0];
			@Pc(36) int[] local36 = this.aClass306_1.anIntArrayArray72[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass306_1.anIntArray657[arg0]];
			}
			@Pc(56) Object[] local56 = this.anObjectArrayArray1[arg0];
			@Pc(58) boolean local58 = true;
			for (@Pc(60) int local60 = 0; local60 < local30; local60++) {
				@Pc(66) int local66;
				if (local36 == null) {
					local66 = local60;
				} else {
					local66 = local36[local60];
				}
				if (local56[local66] == null) {
					local58 = false;
					break;
				}
			}
			if (local58) {
				return true;
			}
			@Pc(124) byte[] local124;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local124 = Static557.method92(false, this.anObjectArray1[arg0]);
			} else {
				local124 = Static557.method92(true, this.anObjectArray1[arg0]);
				@Pc(129) Class4_Sub9 local129 = new Class4_Sub9(local124);
				local129.method5999(local129.aByteArray97.length, arg1);
			}
			@Pc(151) byte[] local151;
			try {
				local151 = Static308.method4761(local124);
			} catch (@Pc(153) RuntimeException local153) {
				throw Static530.method7398(local153, "T3 - " + (arg1 != null) + "," + arg0 + "," + local124.length + "," + Static529.method7394(local124.length, local124) + "," + Static529.method7394(local124.length - 2, local124) + "," + this.aClass306_1.anIntArray656[arg0] + "," + this.aClass306_1.anInt8583);
			}
			if (this.aBoolean65) {
				this.anObjectArray1[arg0] = null;
			}
			@Pc(225) int local225;
			if (local30 <= 1) {
				if (local36 == null) {
					local225 = 0;
				} else {
					local225 = local36[0];
				}
				if (this.anInt775 == 0) {
					local56[local225] = Static422.method6064(local151);
				} else {
					local56[local225] = local151;
				}
			} else {
				@Pc(266) int local266;
				@Pc(279) Class4_Sub9 local279;
				@Pc(283) int local283;
				@Pc(288) int local288;
				@Pc(292) int local292;
				@Pc(294) int local294;
				@Pc(306) int local306;
				@Pc(356) int local356;
				@Pc(358) int local358;
				if (this.anInt775 == 2) {
					local225 = local151.length;
					local225--;
					local266 = local151[local225] & 0xFF;
					local225 -= local30 * local266 * 4;
					local279 = new Class4_Sub9(local151);
					@Pc(281) int local281 = 0;
					local283 = 0;
					local279.anInt7219 = local225;
					for (local288 = 0; local288 < local266; local288++) {
						local292 = 0;
						for (local294 = 0; local294 < local30; local294++) {
							local292 += local279.method6026();
							if (local36 == null) {
								local306 = local294;
							} else {
								local306 = local36[local294];
							}
							if (arg2 == local306) {
								local283 = local306;
								local281 += local292;
							}
						}
					}
					if (local281 == 0) {
						return true;
					}
					@Pc(343) byte[] local343 = new byte[local281];
					local281 = 0;
					local279.anInt7219 = local225;
					local294 = 0;
					for (local306 = 0; local306 < local266; local306++) {
						local356 = 0;
						for (local358 = 0; local358 < local30; local358++) {
							local356 += local279.method6026();
							@Pc(372) int local372;
							if (local36 == null) {
								local372 = local358;
							} else {
								local372 = local36[local358];
							}
							if (arg2 == local372) {
								Static602.method1586(local151, local294, local343, local281, local356);
								local281 += local356;
							}
							local294 += local356;
						}
					}
					local56[local283] = local343;
				} else {
					local225 = local151.length;
					local225--;
					local266 = local151[local225] & 0xFF;
					local225 -= local266 * local30 * 4;
					local279 = new Class4_Sub9(local151);
					@Pc(437) int[] local437 = new int[local30];
					local279.anInt7219 = local225;
					for (local283 = 0; local283 < local266; local283++) {
						local288 = 0;
						for (local292 = 0; local292 < local30; local292++) {
							local288 += local279.method6026();
							local437[local292] += local288;
						}
					}
					@Pc(474) byte[][] local474 = new byte[local30][];
					for (local292 = 0; local292 < local30; local292++) {
						local474[local292] = new byte[local437[local292]];
						local437[local292] = 0;
					}
					local279.anInt7219 = local225;
					local294 = 0;
					for (local306 = 0; local306 < local266; local306++) {
						local356 = 0;
						for (local358 = 0; local358 < local30; local358++) {
							local356 += local279.method6026();
							Static602.method1586(local151, local294, local474[local358], local437[local358], local356);
							local437[local358] += local356;
							local294 += local356;
						}
					}
					for (local356 = 0; local356 < local30; local356++) {
						if (local36 == null) {
							local358 = local356;
						} else {
							local358 = local36[local356];
						}
						if (this.anInt775 == 0) {
							local56[local358] = Static422.method6064(local474[local356]);
						} else {
							local56[local358] = local474[local356];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)V")
	private void method666(@OriginalArg(1) int arg0) {
		this.aClass235_1.method5079(arg0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZII)[B")
	public byte[] method667(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method681(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(ZII)Z")
	public boolean method668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method684(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray1[arg1] == null) {
			this.method686(arg1);
			return this.anObjectArray1[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method669(@OriginalArg(1) String arg0) {
		if (this.method673()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass306_1.aClass236_1.method5091(Static318.method4858(local12));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)Z")
	private boolean method671(@OriginalArg(0) int arg0) {
		if (!this.method673()) {
			return false;
		} else if (arg0 >= 0 && this.aClass306_1.anIntArray657.length > arg0 && this.aClass306_1.anIntArray657[arg0] != 0) {
			return true;
		} else if (Static505.aBoolean608) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)Z")
	private boolean method673() {
		if (this.aClass306_1 == null) {
			this.aClass306_1 = this.aClass235_1.method5078();
			if (this.aClass306_1 == null) {
				return false;
			}
			this.anObjectArray1 = new Object[this.aClass306_1.anInt8587];
			this.anObjectArrayArray1 = new Object[this.aClass306_1.anInt8587][];
		}
		return true;
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(II)I")
	private int method674(@OriginalArg(1) int arg0) {
		if (this.method671(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass235_1.method5081(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)I")
	public int method675() {
		return this.method673() ? this.aClass306_1.anIntArray657.length : -1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method676(@OriginalArg(1) String arg0) {
		if (this.method673()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass306_1.aClass236_1.method5091(Static318.method4858(local20));
			return this.method674(local29);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(II)V")
	public void method677(@OriginalArg(1) int arg0) {
		if (this.method671(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "(II)Z")
	public boolean method678(@OriginalArg(1) int arg0) {
		if (!this.method671(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method686(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "(II)Z")
	public boolean method679(@OriginalArg(0) int arg0) {
		if (!this.method673()) {
			return false;
		} else if (this.aClass306_1.anIntArray657.length == 1) {
			return this.method668(arg0, 0);
		} else if (!this.method671(arg0)) {
			return false;
		} else if (this.aClass306_1.anIntArray657[arg0] == 1) {
			return this.method668(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method680(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = this.method653("");
		return local8 == -1 ? this.method682(arg0, "") : this.method682("", arg0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III[I)[B")
	public byte[] method681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method684(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(32) boolean local32 = this.method665(arg1, arg2, arg0);
			if (!local32) {
				this.method686(arg1);
				local32 = this.method665(arg1, arg2, arg0);
				if (!local32) {
					return null;
				}
			}
		}
		@Pc(59) byte[] local59 = Static557.method92(false, this.anObjectArrayArray1[arg1][arg0]);
		if (this.anInt775 == 1) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass306_1.anIntArray657[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt775 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local59;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	private boolean method682(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method673()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass306_1.aClass236_1.method5091(Static318.method4858(local12));
		if (this.method671(local24)) {
			@Pc(47) int local47 = this.aClass306_1.aClass236Array1[local24].method5091(Static318.method4858(local15));
			return this.method668(local47, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method683(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method673()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass306_1.aClass236_1.method5091(Static318.method4858(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(42) int local42 = this.aClass306_1.aClass236Array1[local24].method5091(Static318.method4858(local15));
			return local42 >= 0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)Z")
	private boolean method684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method673()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass306_1.anIntArray657.length > arg1 && this.aClass306_1.anIntArray657[arg1] > arg0) {
			return true;
		} else if (Static505.aBoolean608) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)I")
	public int method685() {
		if (!this.method673()) {
			throw new IllegalStateException("");
		}
		return this.aClass306_1.anInt8583;
	}

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "(II)V")
	private void method686(@OriginalArg(0) int arg0) {
		if (this.aBoolean65) {
			this.anObjectArray1[arg0] = this.aClass235_1.method5077(arg0);
		} else {
			this.anObjectArray1[arg0] = Static422.method6064(this.aClass235_1.method5077(arg0));
		}
	}

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "(II)I")
	public int method687(@OriginalArg(0) int arg0) {
		if (this.method673()) {
			@Pc(24) int local24 = this.aClass306_1.aClass236_1.method5091(arg0);
			return this.method671(local24) ? local24 : -1;
		} else {
			return -1;
		}
	}
}
