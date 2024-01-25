import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class353 {

	@OriginalMember(owner = "client!vd", name = "G", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray32;

	@OriginalMember(owner = "client!vd", name = "N", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "Lclient!uia;")
	private Class345 aClass345_2 = null;

	@OriginalMember(owner = "client!vd", name = "F", descriptor = "Lclient!pm;")
	private final Class217 aClass217_1;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "Z")
	private final boolean aBoolean678;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
	public int anInt9949;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!pm;ZI)V")
	public Class353(@OriginalArg(0) Class217 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aClass217_1 = arg0;
		this.aBoolean678 = arg1;
		this.anInt9949 = arg2;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BZZ)V")
	public void method8393(@OriginalArg(2) boolean arg0) {
		if (!this.method8400()) {
			return;
		}
		if (arg0) {
			this.aClass345_2.aClass119_1 = null;
			this.aClass345_2.anIntArray593 = null;
		}
		this.aClass345_2.anIntArrayArray54 = null;
		this.aClass345_2.aClass119Array1 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II[II)Z")
	private boolean method8394(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method8424(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass345_2.anIntArray589[arg0];
			@Pc(31) int[] local31 = this.aClass345_2.anIntArrayArray53[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass345_2.anIntArray591[arg0]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg0];
			@Pc(53) boolean local53 = true;
			for (@Pc(62) int local62 = 0; local62 < local25; local62++) {
				@Pc(70) int local70;
				if (local31 == null) {
					local70 = local62;
				} else {
					local70 = local31[local62];
				}
				if (local51[local70] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(122) byte[] local122;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local122 = Static589.method8324(false, this.anObjectArray32[arg0]);
			} else {
				local122 = Static589.method8324(true, this.anObjectArray32[arg0]);
				@Pc(127) Class6_Sub40 local127 = new Class6_Sub40(local122);
				local127.method8567(local127.aByteArray113.length, arg1);
			}
			@Pc(149) byte[] local149;
			try {
				local149 = Static130.method2126(local122);
			} catch (@Pc(151) RuntimeException local151) {
				throw Static640.method8962(local151, "T3 - " + (arg1 != null) + "," + arg0 + "," + local122.length + "," + Static240.method4159(local122, local122.length) + "," + Static240.method4159(local122, local122.length - 2) + "," + this.aClass345_2.anIntArray592[arg0] + "," + this.aClass345_2.anInt9664);
			}
			if (this.aBoolean678) {
				this.anObjectArray32[arg0] = null;
			}
			@Pc(226) int local226;
			if (local25 > 1) {
				@Pc(233) int local233;
				@Pc(246) Class6_Sub40 local246;
				@Pc(254) int local254;
				@Pc(258) int local258;
				@Pc(260) int local260;
				@Pc(310) int local310;
				@Pc(312) int local312;
				@Pc(316) int local316;
				@Pc(318) int local318;
				if (this.anInt9949 == 2) {
					local226 = local149.length;
					local226--;
					local233 = local149[local226] & 0xFF;
					local226 -= local233 * 4 * local25;
					local246 = new Class6_Sub40(local149);
					@Pc(428) int local428 = 0;
					local254 = 0;
					local246.anInt10169 = local226;
					for (local258 = 0; local258 < local233; local258++) {
						local260 = 0;
						for (local310 = 0; local310 < local25; local310++) {
							local260 += local246.method8579();
							if (local31 == null) {
								local312 = local310;
							} else {
								local312 = local31[local310];
							}
							if (local312 == arg2) {
								local254 = local312;
								local428 += local260;
							}
						}
					}
					if (local428 == 0) {
						return true;
					}
					@Pc(490) byte[] local490 = new byte[local428];
					local246.anInt10169 = local226;
					local428 = 0;
					local310 = 0;
					for (local312 = 0; local312 < local233; local312++) {
						local316 = 0;
						for (local318 = 0; local318 < local25; local318++) {
							local316 += local246.method8579();
							@Pc(519) int local519;
							if (local31 == null) {
								local519 = local318;
							} else {
								local519 = local31[local318];
							}
							if (arg2 == local519) {
								Static655.method5836(local149, local310, local490, local428, local316);
								local428 += local316;
							}
							local310 += local316;
						}
					}
					local51[local254] = local490;
				} else {
					local226 = local149.length;
					@Pc(228) int local228 = local226 - 1;
					local233 = local149[local228] & 0xFF;
					@Pc(241) int local241 = local228 - local233 * local25 * 4;
					local246 = new Class6_Sub40(local149);
					local246.anInt10169 = local241;
					@Pc(252) int[] local252 = new int[local25];
					for (local254 = 0; local254 < local233; local254++) {
						local258 = 0;
						for (local260 = 0; local260 < local25; local260++) {
							local258 += local246.method8579();
							local252[local260] += local258;
						}
					}
					@Pc(286) byte[][] local286 = new byte[local25][];
					for (local260 = 0; local260 < local25; local260++) {
						local286[local260] = new byte[local252[local260]];
						local252[local260] = 0;
					}
					local246.anInt10169 = local241;
					local310 = 0;
					for (local312 = 0; local312 < local233; local312++) {
						local316 = 0;
						for (local318 = 0; local318 < local25; local318++) {
							local316 += local246.method8579();
							Static655.method5836(local149, local310, local286[local318], local252[local318], local316);
							local310 += local316;
							local252[local318] += local316;
						}
					}
					for (local316 = 0; local316 < local25; local316++) {
						if (local31 == null) {
							local318 = local316;
						} else {
							local318 = local31[local316];
						}
						if (this.anInt9949 == 0) {
							local51[local318] = Static493.method7391(local286[local316]);
						} else {
							local51[local318] = local286[local316];
						}
					}
				}
			} else {
				if (local31 == null) {
					local226 = 0;
				} else {
					local226 = local31[0];
				}
				if (this.anInt9949 == 0) {
					local51[local226] = Static493.method7391(local149);
				} else {
					local51[local226] = local149;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)I")
	public int method8395() {
		if (!this.method8400()) {
			throw new IllegalStateException("");
		}
		return this.aClass345_2.anInt9664;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I")
	private int method8396(@OriginalArg(1) int arg0) {
		if (this.method8424(arg0)) {
			return this.anObjectArray32[arg0] == null ? this.aClass217_1.method5793(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method8397(@OriginalArg(0) String arg0) {
		if (this.method8400()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass345_2.aClass119_1.method3369(Static278.method4873(local21));
			return this.method8412(local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)V")
	private void method8399(@OriginalArg(1) int arg0) {
		if (this.aBoolean678) {
			this.anObjectArray32[arg0] = this.aClass217_1.method5794(arg0);
		} else {
			this.anObjectArray32[arg0] = Static493.method7391(this.aClass217_1.method5794(arg0));
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)Z")
	private boolean method8400() {
		if (this.aClass345_2 == null) {
			this.aClass345_2 = this.aClass217_1.method5791();
			if (this.aClass345_2 == null) {
				return false;
			}
			this.anObjectArray32 = new Object[this.aClass345_2.anInt9659];
			this.anObjectArrayArray1 = new Object[this.aClass345_2.anInt9659][];
		}
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)Z")
	public boolean method8401(@OriginalArg(0) int arg0) {
		if (!this.method8400()) {
			return false;
		} else if (this.aClass345_2.anIntArray591.length == 1) {
			return this.method8407(arg0, 0);
		} else if (!this.method8424(arg0)) {
			return false;
		} else if (this.aClass345_2.anIntArray591[arg0] == 1) {
			return this.method8407(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method8402(@OriginalArg(1) String arg0) {
		if (this.method8400()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass345_2.aClass119_1.method3369(Static278.method4873(local11));
			this.method8406(local20);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	private boolean method8403(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method8400()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(26) int local26 = this.aClass345_2.aClass119_1.method3369(Static278.method4873(local12));
		if (this.method8424(local26)) {
			@Pc(44) int local44 = this.aClass345_2.aClass119Array1[local26].method3369(Static278.method4873(local15));
			return this.method8407(local44, local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZII)[B")
	public byte[] method8404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method8411(arg1, arg0, (int[]) null);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method8405(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method8400()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass345_2.aClass119_1.method3369(Static278.method4873(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(44) int local44 = this.aClass345_2.aClass119Array1[local24].method3369(Static278.method4873(local15));
			return local44 >= 0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(IB)V")
	private void method8406(@OriginalArg(0) int arg0) {
		this.aClass217_1.method5790(arg0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Z")
	public boolean method8407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method8423(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray32[arg1] == null) {
			this.method8399(arg1);
			return this.anObjectArray32[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)I")
	public int method8408(@OriginalArg(0) int arg0) {
		if (this.method8400()) {
			@Pc(16) int local16 = this.aClass345_2.aClass119_1.method3369(arg0);
			return this.method8424(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)I")
	public int method8409() {
		if (!this.method8400()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anObjectArray32.length; local25++) {
			if (this.aClass345_2.anIntArray589[local25] > 0) {
				local23 += this.method8396(local25);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local23 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method8410(@OriginalArg(0) String arg0) {
		if (this.method8400()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass345_2.aClass119_1.method3369(Static278.method4873(local17));
			return this.method8424(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III[I)[B")
	public byte[] method8411(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method8423(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(32) boolean local32 = this.method8394(arg1, arg2, arg0);
			if (!local32) {
				this.method8399(arg1);
				local32 = this.method8394(arg1, arg2, arg0);
				if (!local32) {
					return null;
				}
			}
		}
		@Pc(61) byte[] local61 = Static589.method8324(false, this.anObjectArrayArray1[arg1][arg0]);
		if (this.anInt9949 == 1) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass345_2.anIntArray591[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt9949 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local61;
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(II)Z")
	public boolean method8412(@OriginalArg(1) int arg0) {
		if (!this.method8424(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			this.method8399(arg0);
			return this.anObjectArray32[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Z")
	public boolean method8413() {
		if (!this.method8400()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass345_2.anIntArray586.length; local15++) {
			@Pc(23) int local23 = this.aClass345_2.anIntArray586[local15];
			if (this.anObjectArray32[local23] == null) {
				this.method8399(local23);
				if (this.anObjectArray32[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method8414(@OriginalArg(1) String arg0) {
		if (this.method8400()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass345_2.aClass119_1.method3369(Static278.method4873(local19));
			return local28 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)I")
	public int method8415() {
		return this.method8400() ? this.aClass345_2.anIntArray591.length : -1;
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(II)[I")
	public int[] method8416(@OriginalArg(1) int arg0) {
		if (!this.method8424(arg0)) {
			return null;
		}
		@Pc(26) int[] local26 = this.aClass345_2.anIntArrayArray53[arg0];
		if (local26 == null) {
			local26 = new int[this.aClass345_2.anIntArray589[arg0]];
			@Pc(37) int local37 = 0;
			while (local37 < local26.length) {
				local26[local37] = local37++;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)V")
	public void method8417() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray1.length; local12++) {
				this.anObjectArrayArray1[local12] = null;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method8418(@OriginalArg(1) String arg0) {
		if (this.method8400()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass345_2.aClass119_1.method3369(Static278.method4873(local20));
			return this.method8396(local29);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(II)[B")
	public byte[] method8419(@OriginalArg(1) int arg0) {
		if (!this.method8400()) {
			return null;
		} else if (this.aClass345_2.anIntArray591.length == 1) {
			return this.method8404(0, arg0);
		} else if (!this.method8424(arg0)) {
			return null;
		} else if (this.aClass345_2.anIntArray591[arg0] == 1) {
			return this.method8404(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(IB)V")
	public void method8421(@OriginalArg(0) int arg0) {
		if (this.method8424(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "(II)I")
	public int method8422(@OriginalArg(0) int arg0) {
		return this.method8424(arg0) ? this.aClass345_2.anIntArray591[arg0] : 0;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)Z")
	private boolean method8423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method8400()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass345_2.anIntArray591.length > arg1 && arg0 < this.aClass345_2.anIntArray591[arg1]) {
			return true;
		} else if (Static78.aBoolean116) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "(II)Z")
	private boolean method8424(@OriginalArg(1) int arg0) {
		if (!this.method8400()) {
			return false;
		} else if (arg0 >= 0 && this.aClass345_2.anIntArray591.length > arg0 && this.aClass345_2.anIntArray591[arg0] != 0) {
			return true;
		} else if (Static78.aBoolean116) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(B)V")
	public void method8425() {
		if (this.anObjectArray32 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anObjectArray32.length; local16++) {
				this.anObjectArray32[local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method8426(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method8400()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass345_2.aClass119_1.method3369(Static278.method4873(local12));
		if (this.method8424(local24)) {
			@Pc(47) int local47 = this.aClass345_2.aClass119Array1[local24].method3369(Static278.method4873(local15));
			return this.method8404(local24, local47);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method8427(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = this.method8410("");
		return local8 == -1 ? this.method8403(arg0, "") : this.method8403("", arg0);
	}
}
