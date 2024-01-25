import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class250 {

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray36;

	@OriginalMember(owner = "client!vh", name = "B", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "Lclient!jn;")
	private Class132 aClass132_2 = null;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "Z")
	private final boolean aBoolean473;

	@OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
	public int anInt7316;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "Lclient!kl;")
	private final Class16 aClass16_1;

	static {
		new Class84("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!kl;ZI)V")
	public Class250(@OriginalArg(0) Class16 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean473 = arg1;
		this.anInt7316 = arg2;
		this.aClass16_1 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)[B")
	public byte[] method5644(@OriginalArg(0) int arg0) {
		if (!this.method5650()) {
			return null;
		} else if (this.aClass132_2.anIntArray297.length == 1) {
			return this.method5667(arg0, 0);
		} else if (!this.method5674(arg0)) {
			return null;
		} else if (this.aClass132_2.anIntArray297[arg0] == 1) {
			return this.method5667(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)V")
	public void method5646(@OriginalArg(0) int arg0) {
		if (this.method5674(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
	private void method5647(@OriginalArg(0) int arg0) {
		if (this.aBoolean473) {
			this.anObjectArray36[arg0] = this.aClass16_1.method395(arg0);
		} else {
			this.anObjectArray36[arg0] = Static268.method4067(this.aClass16_1.method395(arg0));
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method5648(@OriginalArg(0) String arg0) {
		if (this.method5650()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass132_2.aClass194_1.method4649(Static411.method5564(local11));
			this.method5661(local20);
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)Z")
	public boolean method5649(@OriginalArg(1) int arg0) {
		if (!this.method5674(arg0)) {
			return false;
		} else if (this.anObjectArray36[arg0] == null) {
			this.method5647(arg0);
			return this.anObjectArray36[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)Z")
	private boolean method5650() {
		if (this.aClass132_2 == null) {
			this.aClass132_2 = this.aClass16_1.method397();
			if (this.aClass132_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass132_2.anInt3614][];
			this.anObjectArray36 = new Object[this.aClass132_2.anInt3614];
		}
		return true;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method5652(@OriginalArg(0) String arg0) {
		if (this.method5650()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass132_2.aClass194_1.method4649(Static411.method5564(local18));
			return this.method5674(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)I")
	public int method5653(@OriginalArg(1) int arg0) {
		return this.method5674(arg0) ? this.aClass132_2.anIntArray297[arg0] : 0;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)I")
	public int method5654() {
		if (!this.method5650()) {
			throw new IllegalStateException("");
		}
		return this.aClass132_2.anInt3618;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[III)[B")
	public byte[] method5655(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method5657(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(36) boolean local36 = this.method5659(arg2, arg0, arg1);
			if (!local36) {
				this.method5647(arg0);
				local36 = this.method5659(arg2, arg0, arg1);
				if (!local36) {
					return null;
				}
			}
		}
		@Pc(63) byte[] local63 = Static420.method5638(false, this.anObjectArrayArray1[arg0][arg2]);
		if (this.anInt7316 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass132_2.anIntArray297[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt7316 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local63;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5656(@OriginalArg(1) String arg0) {
		if (this.method5650()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass132_2.aClass194_1.method4649(Static411.method5564(local20));
			return this.method5649(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIB)Z")
	private boolean method5657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method5650()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass132_2.anIntArray297.length > arg0 && arg1 < this.aClass132_2.anIntArray297[arg0]) {
			return true;
		} else if (Static407.aBoolean454) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)Z")
	public boolean method5658() {
		if (!this.method5650()) {
			return false;
		}
		@Pc(23) boolean local23 = true;
		for (@Pc(25) int local25 = 0; local25 < this.aClass132_2.anIntArray295.length; local25++) {
			@Pc(33) int local33 = this.aClass132_2.anIntArray295[local25];
			if (this.anObjectArray36[local33] == null) {
				this.method5647(local33);
				if (this.anObjectArray36[local33] == null) {
					local23 = false;
				}
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZI[I)Z")
	private boolean method5659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method5674(arg1)) {
			return false;
		} else if (this.anObjectArray36[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass132_2.anIntArray296[arg1];
			@Pc(31) int[] local31 = this.aClass132_2.anIntArrayArray100[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass132_2.anIntArray297[arg1]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg1];
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
			@Pc(118) byte[] local118;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local118 = Static420.method5638(false, this.anObjectArray36[arg1]);
			} else {
				local118 = Static420.method5638(true, this.anObjectArray36[arg1]);
				@Pc(123) Class1_Sub1 local123 = new Class1_Sub1(local118);
				local123.method4123(local123.aByteArray66.length, arg2);
			}
			@Pc(145) byte[] local145;
			try {
				local145 = Static220.method3316(local118);
			} catch (@Pc(147) RuntimeException local147) {
				throw Static181.method2784(local147, "T3 - " + (arg2 != null) + "," + arg1 + "," + local118.length + "," + Static246.method3618(local118.length, local118) + "," + Static246.method3618(local118.length - 2, local118) + "," + this.aClass132_2.anIntArray294[arg1] + "," + this.aClass132_2.anInt3618);
			}
			if (this.aBoolean473) {
				this.anObjectArray36[arg1] = null;
			}
			@Pc(220) int local220;
			if (local25 > 1) {
				@Pc(227) int local227;
				@Pc(240) Class1_Sub1 local240;
				@Pc(244) int local244;
				@Pc(249) int local249;
				@Pc(253) int local253;
				@Pc(255) int local255;
				@Pc(267) int local267;
				@Pc(321) int local321;
				@Pc(323) int local323;
				if (this.anInt7316 == 2) {
					local220 = local145.length;
					@Pc(222) int local222 = local220 - 1;
					local227 = local145[local222] & 0xFF;
					@Pc(235) int local235 = local222 - local227 * 4 * local25;
					local240 = new Class1_Sub1(local145);
					@Pc(242) int local242 = 0;
					local244 = 0;
					local240.anInt5056 = local235;
					for (local249 = 0; local249 < local227; local249++) {
						local253 = 0;
						for (local255 = 0; local255 < local25; local255++) {
							local253 += local240.method4087();
							if (local31 == null) {
								local267 = local255;
							} else {
								local267 = local31[local255];
							}
							if (arg0 == local267) {
								local244 = local267;
								local242 += local253;
							}
						}
					}
					if (local242 == 0) {
						return true;
					}
					@Pc(308) byte[] local308 = new byte[local242];
					local240.anInt5056 = local235;
					local242 = 0;
					local255 = 0;
					for (local267 = 0; local267 < local227; local267++) {
						local321 = 0;
						for (local323 = 0; local323 < local25; local323++) {
							local321 += local240.method4087();
							@Pc(337) int local337;
							if (local31 == null) {
								local337 = local323;
							} else {
								local337 = local31[local323];
							}
							if (arg0 == local337) {
								Static460.method4220(local145, local255, local308, local242, local321);
								local242 += local321;
							}
							local255 += local321;
						}
					}
					local51[local244] = local308;
				} else {
					local220 = local145.length;
					local220--;
					local227 = local145[local220] & 0xFF;
					local220 -= local25 * 4 * local227;
					local240 = new Class1_Sub1(local145);
					local240.anInt5056 = local220;
					@Pc(409) int[] local409 = new int[local25];
					for (local244 = 0; local244 < local227; local244++) {
						local249 = 0;
						for (local253 = 0; local253 < local25; local253++) {
							local249 += local240.method4087();
							local409[local253] += local249;
						}
					}
					@Pc(447) byte[][] local447 = new byte[local25][];
					for (local253 = 0; local253 < local25; local253++) {
						local447[local253] = new byte[local409[local253]];
						local409[local253] = 0;
					}
					local240.anInt5056 = local220;
					local255 = 0;
					for (local267 = 0; local267 < local227; local267++) {
						local321 = 0;
						for (local323 = 0; local323 < local25; local323++) {
							local321 += local240.method4087();
							Static460.method4220(local145, local255, local447[local323], local409[local323], local321);
							local255 += local321;
							local409[local323] += local321;
						}
					}
					for (local321 = 0; local321 < local25; local321++) {
						if (local31 == null) {
							local323 = local321;
						} else {
							local323 = local31[local321];
						}
						if (this.anInt7316 == 0) {
							local51[local323] = Static268.method4067(local447[local321]);
						} else {
							local51[local323] = local447[local321];
						}
					}
				}
			} else {
				if (local31 == null) {
					local220 = 0;
				} else {
					local220 = local31[0];
				}
				if (this.anInt7316 == 0) {
					local51[local220] = Static268.method4067(local145);
				} else {
					local51[local220] = local145;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)Z")
	public boolean method5660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method5657(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray36[arg0] == null) {
			this.method5647(arg0);
			return this.anObjectArray36[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(IB)V")
	private void method5661(@OriginalArg(0) int arg0) {
		this.aClass16_1.method398(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5662(@OriginalArg(0) String arg0) {
		if (this.method5650()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass132_2.aClass194_1.method4649(Static411.method5564(local12));
			return local30 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
	public byte[] method5663(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5650()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(34) int local34 = this.aClass132_2.aClass194_1.method4649(Static411.method5564(local12));
		if (this.method5674(local34)) {
			@Pc(52) int local52 = this.aClass132_2.aClass194Array1[local34].method4649(Static411.method5564(local15));
			return this.method5667(local52, local34);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method5664(@OriginalArg(1) String arg0) {
		if (this.method5650()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(31) int local31 = this.aClass132_2.aClass194_1.method4649(Static411.method5564(local20));
			return this.method5673(local31);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)I")
	public int method5665() {
		if (!this.method5650()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anObjectArray36.length; local22++) {
			if (this.aClass132_2.anIntArray296[local22] > 0) {
				local13 += 100;
				local15 += this.method5673(local22);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)I")
	public int method5666() {
		return this.method5650() ? this.aClass132_2.anIntArray297.length : -1;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZII)[B")
	public byte[] method5667(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method5655(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)Z")
	public boolean method5668(@OriginalArg(0) int arg0) {
		if (!this.method5650()) {
			return false;
		} else if (this.aClass132_2.anIntArray297.length == 1) {
			return this.method5660(0, arg0);
		} else if (!this.method5674(arg0)) {
			return false;
		} else if (this.aClass132_2.anIntArray297[arg0] == 1) {
			return this.method5660(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method5669(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5650()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(31) int local31 = this.aClass132_2.aClass194_1.method4649(Static411.method5564(local12));
		if (this.method5674(local31)) {
			@Pc(49) int local49 = this.aClass132_2.aClass194Array1[local31].method4649(Static411.method5564(local15));
			return this.method5660(local31, local49);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
	public void method5670() {
		if (this.anObjectArray36 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anObjectArray36.length; local16++) {
				this.anObjectArray36[local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(II)[I")
	public int[] method5671(@OriginalArg(1) int arg0) {
		if (!this.method5674(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass132_2.anIntArrayArray100[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass132_2.anIntArray296[arg0]];
			@Pc(34) int local34 = 0;
			while (local34 < local23.length) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(II)I")
	public int method5672(@OriginalArg(0) int arg0) {
		if (this.method5650()) {
			@Pc(16) int local16 = this.aClass132_2.aClass194_1.method4649(arg0);
			return this.method5674(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "(II)I")
	private int method5673(@OriginalArg(0) int arg0) {
		if (this.method5674(arg0)) {
			return this.anObjectArray36[arg0] == null ? this.aClass16_1.method394(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(IZ)Z")
	private boolean method5674(@OriginalArg(0) int arg0) {
		if (!this.method5650()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass132_2.anIntArray297.length && this.aClass132_2.anIntArray297[arg0] != 0) {
			return true;
		} else if (Static407.aBoolean454) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZZ)V")
	public void method5675(@OriginalArg(1) boolean arg0) {
		if (!this.method5650()) {
			return;
		}
		this.aClass132_2.anIntArrayArray99 = null;
		this.aClass132_2.aClass194Array1 = null;
		if (arg0) {
			this.aClass132_2.aClass194_1 = null;
			this.aClass132_2.anIntArray299 = null;
		}
	}

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V")
	public void method5676() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anObjectArrayArray1.length; local18++) {
				this.anObjectArrayArray1[local18] = null;
			}
		}
	}
}
