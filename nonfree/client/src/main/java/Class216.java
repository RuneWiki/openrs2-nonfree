import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class216 {

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray35;

	@OriginalMember(owner = "client!wo", name = "F", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!wo", name = "S", descriptor = "Lclient!op;")
	private Class156 aClass156_2 = null;

	@OriginalMember(owner = "client!wo", name = "Q", descriptor = "I")
	public int anInt6797;

	@OriginalMember(owner = "client!wo", name = "G", descriptor = "Z")
	private final boolean aBoolean664;

	@OriginalMember(owner = "client!wo", name = "M", descriptor = "Lclient!ec;")
	private final Class51 aClass51_1;

	static {
		new Class34("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!ec;ZI)V")
	public Class216(@OriginalArg(0) Class51 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt6797 = arg2;
		this.aBoolean664 = arg1;
		this.aClass51_1 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method5644(@OriginalArg(0) String arg0) {
		if (this.method5674()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass156_2.aClass76_1.method2067(Static41.method968(local18));
			return this.method5665(local27);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	public void method5645() {
		if (this.anObjectArray35 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArray35.length; local10++) {
				this.anObjectArray35[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "([IIII)[B")
	public byte[] method5646(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method5663(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(32) boolean local32 = this.method5673(arg0, arg1, arg2);
			if (!local32) {
				this.method5649(arg2);
				local32 = this.method5673(arg0, arg1, arg2);
				if (!local32) {
					return null;
				}
			}
		}
		@Pc(67) byte[] local67 = Static328.method5330(false, this.anObjectArrayArray1[arg2][arg1]);
		if (this.anInt6797 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass156_2.anIntArray426[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt6797 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local67;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)I")
	public int method5647() {
		return this.method5674() ? this.aClass156_2.anIntArray426.length : -1;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)[B")
	public byte[] method5648(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method5646(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)V")
	private void method5649(@OriginalArg(0) int arg0) {
		if (this.aBoolean664) {
			this.anObjectArray35[arg0] = this.aClass51_1.method4866(arg0);
		} else {
			this.anObjectArray35[arg0] = Static303.method2037(this.aClass51_1.method4866(arg0));
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method5650(@OriginalArg(1) String arg0) {
		if (this.method5674()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass156_2.aClass76_1.method2067(Static41.method968(local11));
			this.method5676(local20);
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(II)Z")
	public boolean method5651(@OriginalArg(1) int arg0) {
		if (!this.method5674()) {
			return false;
		} else if (this.aClass156_2.anIntArray426.length == 1) {
			return this.method5657(arg0, 0);
		} else if (!this.method5666(arg0)) {
			return false;
		} else if (this.aClass156_2.anIntArray426[arg0] == 1) {
			return this.method5657(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public boolean method5652(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5674()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass156_2.aClass76_1.method2067(Static41.method968(local12));
		if (this.method5666(local24)) {
			@Pc(42) int local42 = this.aClass156_2.aClass76Array1[local24].method2067(Static41.method968(local15));
			return this.method5657(local42, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZZB)V")
	public void method5653(@OriginalArg(1) boolean arg0) {
		if (!this.method5674()) {
			return;
		}
		this.aClass156_2.anIntArrayArray53 = null;
		this.aClass156_2.aClass76Array1 = null;
		if (arg0) {
			this.aClass156_2.anIntArray422 = null;
			this.aClass156_2.aClass76_1 = null;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)[B")
	public byte[] method5654(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5674()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass156_2.aClass76_1.method2067(Static41.method968(local12));
		if (this.method5666(local24)) {
			@Pc(42) int local42 = this.aClass156_2.aClass76Array1[local24].method2067(Static41.method968(local15));
			return this.method5648(local24, local42);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5655(@OriginalArg(1) String arg0) {
		if (this.method5674()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass156_2.aClass76_1.method2067(Static41.method968(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V")
	public void method5656() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZII)Z")
	public boolean method5657(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5663(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray35[arg1] == null) {
			this.method5649(arg1);
			return this.anObjectArray35[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)Z")
	public boolean method5658() {
		if (!this.method5674()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(23) int local23 = 0; local23 < this.aClass156_2.anIntArray425.length; local23++) {
			@Pc(31) int local31 = this.aClass156_2.anIntArray425[local23];
			if (this.anObjectArray35[local31] == null) {
				this.method5649(local31);
				if (this.anObjectArray35[local31] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZ)[B")
	public byte[] method5659(@OriginalArg(0) int arg0) {
		if (!this.method5674()) {
			return null;
		} else if (this.aClass156_2.anIntArray426.length == 1) {
			return this.method5648(0, arg0);
		} else if (!this.method5666(arg0)) {
			return null;
		} else if (this.aClass156_2.anIntArray426[arg0] == 1) {
			return this.method5648(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(BLjava/lang/String;)I")
	public int method5660(@OriginalArg(1) String arg0) {
		if (this.method5674()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass156_2.aClass76_1.method2067(Static41.method968(local17));
			return this.method5666(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(III)Z")
	private boolean method5663(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5674()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass156_2.anIntArray426.length > arg0 && this.aClass156_2.anIntArray426[arg0] > arg1) {
			return true;
		} else if (Static199.aBoolean389) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(II)[I")
	public int[] method5664(@OriginalArg(1) int arg0) {
		if (!this.method5666(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass156_2.anIntArrayArray52[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass156_2.anIntArray424[arg0]];
			@Pc(34) int local34 = 0;
			while (local34 < local23.length) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(IZ)I")
	private int method5665(@OriginalArg(0) int arg0) {
		if (this.method5666(arg0)) {
			return this.anObjectArray35[arg0] == null ? this.aClass51_1.method4858(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)Z")
	private boolean method5666(@OriginalArg(1) int arg0) {
		if (!this.method5674()) {
			return false;
		} else if (arg0 >= 0 && this.aClass156_2.anIntArray426.length > arg0 && this.aClass156_2.anIntArray426[arg0] != 0) {
			return true;
		} else if (Static199.aBoolean389) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(II)Z")
	public boolean method5667(@OriginalArg(1) int arg0) {
		if (!this.method5666(arg0)) {
			return false;
		} else if (this.anObjectArray35[arg0] == null) {
			this.method5649(arg0);
			return this.anObjectArray35[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BI)V")
	public void method5669(@OriginalArg(1) int arg0) {
		if (this.method5666(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(Z)I")
	public int method5670() {
		if (!this.method5674()) {
			throw new IllegalStateException("");
		}
		return this.aClass156_2.anInt4724;
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(II)I")
	public int method5671(@OriginalArg(1) int arg0) {
		if (this.method5674()) {
			@Pc(24) int local24 = this.aClass156_2.aClass76_1.method2067(arg0);
			return this.method5666(local24) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(BLjava/lang/String;)Z")
	public boolean method5672(@OriginalArg(1) String arg0) {
		if (this.method5674()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass156_2.aClass76_1.method2067(Static41.method968(local21));
			return this.method5667(local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "([IIII)Z")
	private boolean method5673(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method5666(arg2)) {
			return false;
		} else if (this.anObjectArray35[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass156_2.anIntArray424[arg2];
			@Pc(31) int[] local31 = this.aClass156_2.anIntArrayArray52[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass156_2.anIntArray426[arg2]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg2];
			@Pc(58) boolean local58 = true;
			for (@Pc(60) int local60 = 0; local60 < local25; local60++) {
				@Pc(66) int local66;
				if (local31 == null) {
					local66 = local60;
				} else {
					local66 = local31[local60];
				}
				if (local51[local66] == null) {
					local58 = false;
					break;
				}
			}
			if (local58) {
				return true;
			}
			@Pc(117) byte[] local117;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local117 = Static328.method5330(false, this.anObjectArray35[arg2]);
			} else {
				local117 = Static328.method5330(true, this.anObjectArray35[arg2]);
				@Pc(132) Class1_Sub8 local132 = new Class1_Sub8(local117);
				local132.method4521(arg0, local132.aByteArray81.length);
			}
			@Pc(148) byte[] local148;
			try {
				local148 = Static188.method3684(local117);
			} catch (@Pc(150) RuntimeException local150) {
				throw Static76.method1727(local150, "T3 - " + (arg0 != null) + "," + arg2 + "," + local117.length + "," + Static5.method192(local117, local117.length) + "," + Static5.method192(local117, local117.length - 2) + "," + this.aClass156_2.anIntArray423[arg2] + "," + this.aClass156_2.anInt4724);
			}
			if (this.aBoolean664) {
				this.anObjectArray35[arg2] = null;
			}
			@Pc(224) int local224;
			if (local25 <= 1) {
				if (local31 == null) {
					local224 = 0;
				} else {
					local224 = local31[0];
				}
				if (this.anInt6797 == 0) {
					local51[local224] = Static303.method2037(local148);
				} else {
					local51[local224] = local148;
				}
			} else {
				@Pc(265) int local265;
				@Pc(278) Class1_Sub8 local278;
				@Pc(286) int local286;
				@Pc(290) int local290;
				@Pc(292) int local292;
				@Pc(342) int local342;
				@Pc(344) int local344;
				@Pc(348) int local348;
				@Pc(350) int local350;
				if (this.anInt6797 == 2) {
					local224 = local148.length;
					local224--;
					local265 = local148[local224] & 0xFF;
					local224 -= local25 * local265 * 4;
					local278 = new Class1_Sub8(local148);
					@Pc(460) int local460 = 0;
					local286 = 0;
					local278.anInt5182 = local224;
					for (local290 = 0; local290 < local265; local290++) {
						local292 = 0;
						for (local342 = 0; local342 < local25; local342++) {
							local292 += local278.method4545();
							if (local31 == null) {
								local344 = local342;
							} else {
								local344 = local31[local342];
							}
							if (local344 == arg1) {
								local286 = local344;
								local460 += local292;
							}
						}
					}
					if (local460 == 0) {
						return true;
					}
					@Pc(515) byte[] local515 = new byte[local460];
					local460 = 0;
					local278.anInt5182 = local224;
					local342 = 0;
					for (local344 = 0; local344 < local265; local344++) {
						local348 = 0;
						for (local350 = 0; local350 < local25; local350++) {
							local348 += local278.method4545();
							@Pc(542) int local542;
							if (local31 == null) {
								local542 = local350;
							} else {
								local542 = local31[local350];
							}
							if (arg1 == local542) {
								Static361.method1335(local148, local342, local515, local460, local348);
								local460 += local348;
							}
							local342 += local348;
						}
					}
					local51[local286] = local515;
				} else {
					local224 = local148.length;
					local224--;
					local265 = local148[local224] & 0xFF;
					local224 -= local265 * local25 * 4;
					local278 = new Class1_Sub8(local148);
					local278.anInt5182 = local224;
					@Pc(284) int[] local284 = new int[local25];
					for (local286 = 0; local286 < local265; local286++) {
						local290 = 0;
						for (local292 = 0; local292 < local25; local292++) {
							local290 += local278.method4545();
							local284[local292] += local290;
						}
					}
					@Pc(318) byte[][] local318 = new byte[local25][];
					for (local292 = 0; local292 < local25; local292++) {
						local318[local292] = new byte[local284[local292]];
						local284[local292] = 0;
					}
					local278.anInt5182 = local224;
					local342 = 0;
					for (local344 = 0; local344 < local265; local344++) {
						local348 = 0;
						for (local350 = 0; local350 < local25; local350++) {
							local348 += local278.method4545();
							Static361.method1335(local148, local342, local318[local350], local284[local350], local348);
							local284[local350] += local348;
							local342 += local348;
						}
					}
					for (local348 = 0; local348 < local25; local348++) {
						if (local31 == null) {
							local350 = local348;
						} else {
							local350 = local31[local348];
						}
						if (this.anInt6797 == 0) {
							local51[local350] = Static303.method2037(local318[local348]);
						} else {
							local51[local350] = local318[local348];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)Z")
	private boolean method5674() {
		if (this.aClass156_2 == null) {
			this.aClass156_2 = this.aClass51_1.method4857();
			if (this.aClass156_2 == null) {
				return false;
			}
			this.anObjectArray35 = new Object[this.aClass156_2.anInt4725];
			this.anObjectArrayArray1 = new Object[this.aClass156_2.anInt4725][];
		}
		return true;
	}

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(II)I")
	public int method5675(@OriginalArg(1) int arg0) {
		return this.method5666(arg0) ? this.aClass156_2.anIntArray426[arg0] : 0;
	}

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "(II)V")
	private void method5676(@OriginalArg(0) int arg0) {
		this.aClass51_1.method4859(arg0);
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)I")
	public int method5677() {
		if (!this.method5674()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray35.length; local17++) {
			if (this.aClass156_2.anIntArray424[local17] > 0) {
				local13 += 100;
				local15 += this.method5665(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}
}
