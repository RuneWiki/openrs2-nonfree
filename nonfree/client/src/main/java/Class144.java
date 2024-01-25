import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class144 {

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!nq", name = "v", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray34;

	@OriginalMember(owner = "client!nq", name = "G", descriptor = "Lclient!vk;")
	private Class206 aClass206_2 = null;

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
	public int anInt4430;

	@OriginalMember(owner = "client!nq", name = "K", descriptor = "Z")
	private final boolean aBoolean295;

	@OriginalMember(owner = "client!nq", name = "y", descriptor = "Lclient!pa;")
	private final Class138 aClass138_1;

	static {
		new Class117(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!pa;ZI)V")
	public Class144(@OriginalArg(0) Class138 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt4430 = arg2;
		this.aBoolean295 = arg1;
		this.aClass138_1 = arg0;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)Z")
	private boolean method3886(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3894()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass206_2.anIntArray531.length > arg1 && arg0 < this.aClass206_2.anIntArray531[arg1]) {
			return true;
		} else if (Static7.aBoolean6) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I")
	public int method3887() {
		if (!this.method3894()) {
			throw new IllegalStateException("");
		}
		return this.aClass206_2.anInt6420;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method3888(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3894()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass206_2.aClass62_1.method1112(Static150.method2275(local12));
		if (this.method3903(local24)) {
			@Pc(47) int local47 = this.aClass206_2.aClass62Array1[local24].method1112(Static150.method2275(local15));
			return this.method3896(local47, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method3889(@OriginalArg(0) String arg0) {
		if (this.method3894()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass206_2.aClass62_1.method1112(Static150.method2275(local17));
			return this.method3919(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)I")
	public int method3890(@OriginalArg(1) int arg0) {
		return this.method3903(arg0) ? this.aClass206_2.anIntArray531[arg0] : 0;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)V")
	private void method3891(@OriginalArg(1) int arg0) {
		this.aClass138_1.method3682(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method3892(@OriginalArg(0) String arg0) {
		if (this.method3894()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass206_2.aClass62_1.method1112(Static150.method2275(local12));
			return local30 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)I")
	public int method3893() {
		return this.method3894() ? this.aClass206_2.anIntArray531.length : -1;
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)Z")
	private boolean method3894() {
		if (this.aClass206_2 == null) {
			this.aClass206_2 = this.aClass138_1.method3685();
			if (this.aClass206_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass206_2.anInt6422][];
			this.anObjectArray34 = new Object[this.aClass206_2.anInt6422];
		}
		return true;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IBI)[B")
	public byte[] method3896(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method3899(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BZZ)V")
	public void method3897(@OriginalArg(1) boolean arg0) {
		if (!this.method3894()) {
			return;
		}
		this.aClass206_2.aClass62Array1 = null;
		this.aClass206_2.anIntArrayArray76 = null;
		if (arg0) {
			this.aClass206_2.anIntArray530 = null;
			this.aClass206_2.aClass62_1 = null;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I[IZI)Z")
	private boolean method3898(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method3903(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass206_2.anIntArray532[arg0];
			@Pc(31) int[] local31 = this.aClass206_2.anIntArrayArray77[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass206_2.anIntArray531[arg0]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg0];
			@Pc(53) boolean local53 = true;
			for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
				@Pc(61) int local61;
				if (local31 == null) {
					local61 = local55;
				} else {
					local61 = local31[local55];
				}
				if (local51[local61] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(115) byte[] local115;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local115 = Static66.method1710(false, this.anObjectArray34[arg0]);
			} else {
				local115 = Static66.method1710(true, this.anObjectArray34[arg0]);
				@Pc(130) Class11_Sub25 local130 = new Class11_Sub25(local115);
				local130.method5199(local130.aByteArray93.length, arg1);
			}
			@Pc(142) byte[] local142;
			try {
				local142 = Static92.method1343(local115);
			} catch (@Pc(144) RuntimeException local144) {
				throw Static103.method1566(local144, "T3 - " + (arg1 != null) + "," + arg0 + "," + local115.length + "," + Static32.method459(local115.length, local115) + "," + Static32.method459(local115.length - 2, local115) + "," + this.aClass206_2.anIntArray533[arg0] + "," + this.aClass206_2.anInt6420);
			}
			if (this.aBoolean295) {
				this.anObjectArray34[arg0] = null;
			}
			@Pc(214) int local214;
			if (local25 <= 1) {
				if (local31 == null) {
					local214 = 0;
				} else {
					local214 = local31[0];
				}
				if (this.anInt4430 == 0) {
					local51[local214] = Static356.method5717(local142);
				} else {
					local51[local214] = local142;
				}
			} else {
				@Pc(257) int local257;
				@Pc(270) Class11_Sub25 local270;
				@Pc(278) int local278;
				@Pc(282) int local282;
				@Pc(284) int local284;
				@Pc(342) int local342;
				@Pc(344) int local344;
				@Pc(348) int local348;
				@Pc(350) int local350;
				if (this.anInt4430 == 2) {
					local214 = local142.length;
					local214--;
					local257 = local142[local214] & 0xFF;
					local214 -= local257 * 4 * local25;
					local270 = new Class11_Sub25(local142);
					@Pc(456) int local456 = 0;
					local278 = 0;
					local270.anInt6076 = local214;
					for (local282 = 0; local282 < local257; local282++) {
						local284 = 0;
						for (local342 = 0; local342 < local25; local342++) {
							local284 += local270.method5198();
							if (local31 == null) {
								local344 = local342;
							} else {
								local344 = local31[local342];
							}
							if (local344 == arg2) {
								local456 += local284;
								local278 = local344;
							}
						}
					}
					if (local456 == 0) {
						return true;
					}
					@Pc(522) byte[] local522 = new byte[local456];
					local456 = 0;
					local270.anInt6076 = local214;
					local342 = 0;
					for (local344 = 0; local344 < local257; local344++) {
						local348 = 0;
						for (local350 = 0; local350 < local25; local350++) {
							local348 += local270.method5198();
							@Pc(549) int local549;
							if (local31 == null) {
								local549 = local350;
							} else {
								local549 = local31[local350];
							}
							if (local549 == arg2) {
								Static363.method1668(local142, local342, local522, local456, local348);
								local456 += local348;
							}
							local342 += local348;
						}
					}
					local51[local278] = local522;
				} else {
					local214 = local142.length;
					local214--;
					local257 = local142[local214] & 0xFF;
					local214 -= local257 * 4 * local25;
					local270 = new Class11_Sub25(local142);
					local270.anInt6076 = local214;
					@Pc(276) int[] local276 = new int[local25];
					for (local278 = 0; local278 < local257; local278++) {
						local282 = 0;
						for (local284 = 0; local284 < local25; local284++) {
							local282 += local270.method5198();
							local276[local284] += local282;
						}
					}
					@Pc(318) byte[][] local318 = new byte[local25][];
					for (local284 = 0; local284 < local25; local284++) {
						local318[local284] = new byte[local276[local284]];
						local276[local284] = 0;
					}
					local270.anInt6076 = local214;
					local342 = 0;
					for (local344 = 0; local344 < local257; local344++) {
						local348 = 0;
						for (local350 = 0; local350 < local25; local350++) {
							local348 += local270.method5198();
							Static363.method1668(local142, local342, local318[local350], local276[local350], local348);
							local276[local350] += local348;
							local342 += local348;
						}
					}
					for (local348 = 0; local348 < local25; local348++) {
						if (local31 == null) {
							local350 = local348;
						} else {
							local350 = local31[local348];
						}
						if (this.anInt4430 == 0) {
							local51[local350] = Static356.method5717(local318[local348]);
						} else {
							local51[local350] = local318[local348];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(III[I)[B")
	public byte[] method3899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method3886(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(32) boolean local32 = this.method3898(arg1, arg2, arg0);
			if (!local32) {
				this.method3913(arg1);
				local32 = this.method3898(arg1, arg2, arg0);
				if (!local32) {
					return null;
				}
			}
		}
		@Pc(59) byte[] local59 = Static66.method1710(false, this.anObjectArrayArray1[arg1][arg0]);
		if (this.anInt4430 == 1) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass206_2.anIntArray531[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt4430 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local59;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3900(@OriginalArg(1) String arg0) {
		if (this.method3894()) {
			@Pc(16) String local16 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass206_2.aClass62_1.method1112(Static150.method2275(local16));
			return this.method3915(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)[I")
	public int[] method3901(@OriginalArg(1) int arg0) {
		if (!this.method3903(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass206_2.anIntArrayArray77[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass206_2.anIntArray532[arg0]];
			@Pc(29) int local29 = 0;
			while (local18.length > local29) {
				local18[local29] = local29++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method3902(@OriginalArg(1) String arg0) {
		if (this.method3894()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass206_2.aClass62_1.method1112(Static150.method2275(local17));
			return this.method3903(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(BI)Z")
	private boolean method3903(@OriginalArg(1) int arg0) {
		if (!this.method3894()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass206_2.anIntArray531.length && this.aClass206_2.anIntArray531[arg0] != 0) {
			return true;
		} else if (Static7.aBoolean6) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
	public void method3904() {
		if (this.anObjectArray34 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArray34.length; local14++) {
				this.anObjectArray34[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)I")
	public int method3905() {
		if (!this.method3894()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray34.length; local17++) {
			if (this.aClass206_2.anIntArray532[local17] > 0) {
				local13 += 100;
				local15 += this.method3919(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method3906(@OriginalArg(0) String arg0) {
		if (this.method3894()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass206_2.aClass62_1.method1112(Static150.method2275(local17));
			this.method3891(local26);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)I")
	public int method3907(@OriginalArg(0) int arg0) {
		if (this.method3894()) {
			@Pc(16) int local16 = this.aClass206_2.aClass62_1.method1112(arg0);
			return this.method3903(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(II)[B")
	public byte[] method3908(@OriginalArg(1) int arg0) {
		if (!this.method3894()) {
			return null;
		} else if (this.aClass206_2.anIntArray531.length == 1) {
			return this.method3896(arg0, 0);
		} else if (!this.method3903(arg0)) {
			return null;
		} else if (this.aClass206_2.anIntArray531[arg0] == 1) {
			return this.method3896(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public boolean method3909(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3894()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass206_2.aClass62_1.method1112(Static150.method2275(local12));
		if (this.method3903(local24)) {
			@Pc(42) int local42 = this.aClass206_2.aClass62Array1[local24].method1112(Static150.method2275(local15));
			return this.method3916(local24, local42);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(II)Z")
	public boolean method3910(@OriginalArg(1) int arg0) {
		if (!this.method3894()) {
			return false;
		} else if (this.aClass206_2.anIntArray531.length == 1) {
			return this.method3916(0, arg0);
		} else if (!this.method3903(arg0)) {
			return false;
		} else if (this.aClass206_2.anIntArray531[arg0] == 1) {
			return this.method3916(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "(II)V")
	public void method3912(@OriginalArg(0) int arg0) {
		if (this.method3903(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(IB)V")
	private void method3913(@OriginalArg(0) int arg0) {
		if (this.aBoolean295) {
			this.anObjectArray34[arg0] = this.aClass138_1.method3686(arg0);
		} else {
			this.anObjectArray34[arg0] = Static356.method5717(this.aClass138_1.method3686(arg0));
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)Z")
	public boolean method3915(@OriginalArg(0) int arg0) {
		if (!this.method3903(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method3913(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZII)Z")
	public boolean method3916(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3886(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method3913(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)Z")
	public boolean method3917() {
		if (!this.method3894()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(23) int local23 = 0; local23 < this.aClass206_2.anIntArray528.length; local23++) {
			@Pc(31) int local31 = this.aClass206_2.anIntArray528[local23];
			if (this.anObjectArray34[local31] == null) {
				this.method3913(local31);
				if (this.anObjectArray34[local31] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(B)V")
	public void method3918() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "(II)I")
	private int method3919(@OriginalArg(0) int arg0) {
		if (this.method3903(arg0)) {
			return this.anObjectArray34[arg0] == null ? this.aClass138_1.method3688(arg0) : 100;
		} else {
			return 0;
		}
	}
}
