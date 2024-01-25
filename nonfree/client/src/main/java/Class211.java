import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class211 {

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!qs", name = "J", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray34;

	@OriginalMember(owner = "client!qs", name = "O", descriptor = "Lclient!ma;")
	private Class165 aClass165_2 = null;

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "Lclient!vg;")
	private final Class111 aClass111_1;

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "Z")
	private final boolean aBoolean395;

	@OriginalMember(owner = "client!qs", name = "N", descriptor = "I")
	public int anInt6207;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!vg;ZI)V")
	public Class211(@OriginalArg(0) Class111 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass111_1 = arg0;
		this.aBoolean395 = arg1;
		this.anInt6207 = arg2;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)Z")
	public boolean method4745() {
		if (!this.method4746()) {
			return false;
		}
		@Pc(16) boolean local16 = true;
		for (@Pc(18) int local18 = 0; local18 < this.aClass165_2.anIntArray449.length; local18++) {
			@Pc(25) int local25 = this.aClass165_2.anIntArray449[local18];
			if (this.anObjectArray34[local25] == null) {
				this.method4771(local25);
				if (this.anObjectArray34[local25] == null) {
					local16 = false;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)Z")
	private boolean method4746() {
		if (this.aClass165_2 == null) {
			this.aClass165_2 = this.aClass111_1.method2675();
			if (this.aClass165_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass165_2.anInt4738][];
			this.anObjectArray34 = new Object[this.aClass165_2.anInt4738];
		}
		return true;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4747(@OriginalArg(0) String arg0) {
		if (this.method4746()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass165_2.aClass142_1.method3293(Static179.method3012(local20));
			return this.method4757(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)Z")
	private boolean method4748(@OriginalArg(1) int arg0) {
		if (!this.method4746()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass165_2.anIntArray445.length && this.aClass165_2.anIntArray445[arg0] != 0) {
			return true;
		} else if (Static107.aBoolean157) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method4749(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4746()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass165_2.aClass142_1.method3293(Static179.method3012(local12));
		if (this.method4748(local24)) {
			@Pc(49) int local49 = this.aClass165_2.aClass142Array1[local24].method3293(Static179.method3012(local15));
			return this.method4758(local49, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)I")
	public int method4750() {
		if (!this.method4746()) {
			throw new IllegalStateException("");
		}
		return this.aClass165_2.anInt4735;
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)I")
	public int method4751() {
		return this.method4746() ? this.aClass165_2.anIntArray445.length : -1;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)I")
	private int method4752(@OriginalArg(1) int arg0) {
		if (this.method4748(arg0)) {
			return this.anObjectArray34[arg0] == null ? this.aClass111_1.method2674(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(II)V")
	public void method4753(@OriginalArg(0) int arg0) {
		if (this.method4748(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZIZ)V")
	public void method4754(@OriginalArg(2) boolean arg0) {
		if (!this.method4746()) {
			return;
		}
		this.aClass165_2.anIntArrayArray37 = null;
		this.aClass165_2.aClass142Array1 = null;
		if (arg0) {
			this.aClass165_2.anIntArray448 = null;
			this.aClass165_2.aClass142_1 = null;
		}
	}

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "(II)[I")
	public int[] method4755(@OriginalArg(0) int arg0) {
		if (!this.method4748(arg0)) {
			return null;
		}
		@Pc(21) int[] local21 = this.aClass165_2.anIntArrayArray38[arg0];
		if (local21 == null) {
			local21 = new int[this.aClass165_2.anIntArray447[arg0]];
			@Pc(32) int local32 = 0;
			while (local32 < local21.length) {
				local21[local32] = local32++;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "(B)I")
	public int method4756() {
		if (!this.method4746()) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anObjectArray34.length; local15++) {
			if (this.aClass165_2.anIntArray447[local15] > 0) {
				local11 += 100;
				local13 += this.method4752(local15);
			}
		}
		if (local11 == 0) {
			return 100;
		} else {
			return local13 * 100 / local11;
		}
	}

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "(II)Z")
	public boolean method4757(@OriginalArg(1) int arg0) {
		if (!this.method4748(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method4771(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)[B")
	public byte[] method4758(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method4770(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method4759(@OriginalArg(0) String arg0) {
		if (this.method4746()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass165_2.aClass142_1.method3293(Static179.method3012(local12));
			return this.method4748(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZI)Z")
	public boolean method4760(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4768(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method4771(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "(II)Z")
	public boolean method4761(@OriginalArg(0) int arg0) {
		if (!this.method4746()) {
			return false;
		} else if (this.aClass165_2.anIntArray445.length == 1) {
			return this.method4760(0, arg0);
		} else if (!this.method4748(arg0)) {
			return false;
		} else if (this.aClass165_2.anIntArray445[arg0] == 1) {
			return this.method4760(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III[I)Z")
	private boolean method4762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method4748(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			return false;
		} else {
			@Pc(23) int local23 = this.aClass165_2.anIntArray447[arg0];
			@Pc(29) int[] local29 = this.aClass165_2.anIntArrayArray38[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass165_2.anIntArray445[arg0]];
			}
			@Pc(49) Object[] local49 = this.anObjectArrayArray1[arg0];
			@Pc(58) boolean local58 = true;
			for (@Pc(60) int local60 = 0; local60 < local23; local60++) {
				@Pc(65) int local65;
				if (local29 == null) {
					local65 = local60;
				} else {
					local65 = local29[local60];
				}
				if (local49[local65] == null) {
					local58 = false;
					break;
				}
			}
			if (local58) {
				return true;
			}
			@Pc(117) byte[] local117;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local117 = Static408.method5555(this.anObjectArray34[arg0], false);
			} else {
				local117 = Static408.method5555(this.anObjectArray34[arg0], true);
				@Pc(122) Class1_Sub3 local122 = new Class1_Sub3(local117);
				local122.method1195(arg2, local122.aByteArray14.length);
			}
			@Pc(143) byte[] local143;
			try {
				local143 = Static270.method4028(local117);
			} catch (@Pc(145) RuntimeException local145) {
				throw Static341.method4803(local145, "T3 - " + (arg2 != null) + "," + arg0 + "," + local117.length + "," + Static136.method2224(local117, local117.length) + "," + Static136.method2224(local117, local117.length - 2) + "," + this.aClass165_2.anIntArray446[arg0] + "," + this.aClass165_2.anInt4735);
			}
			if (this.aBoolean395) {
				this.anObjectArray34[arg0] = null;
			}
			@Pc(215) int local215;
			if (local23 <= 1) {
				if (local29 == null) {
					local215 = 0;
				} else {
					local215 = local29[0];
				}
				if (this.anInt6207 == 0) {
					local49[local215] = Static320.method4547(local143);
				} else {
					local49[local215] = local143;
				}
			} else {
				@Pc(253) int local253;
				@Pc(266) Class1_Sub3 local266;
				@Pc(270) int local270;
				@Pc(275) int local275;
				@Pc(278) int local278;
				@Pc(280) int local280;
				@Pc(293) int local293;
				@Pc(343) int local343;
				@Pc(345) int local345;
				if (this.anInt6207 == 2) {
					local215 = local143.length;
					local215--;
					local253 = local143[local215] & 0xFF;
					local215 -= local253 * 4 * local23;
					local266 = new Class1_Sub3(local143);
					@Pc(268) int local268 = 0;
					local270 = 0;
					local266.anInt1710 = local215;
					for (local275 = 0; local275 < local253; local275++) {
						local278 = 0;
						for (local280 = 0; local280 < local23; local280++) {
							local278 += local266.method1188();
							if (local29 == null) {
								local293 = local280;
							} else {
								local293 = local29[local280];
							}
							if (local293 == arg1) {
								local268 += local278;
								local270 = local293;
							}
						}
					}
					if (local268 == 0) {
						return true;
					}
					@Pc(331) byte[] local331 = new byte[local268];
					local268 = 0;
					local266.anInt1710 = local215;
					local280 = 0;
					for (local293 = 0; local293 < local253; local293++) {
						local343 = 0;
						for (local345 = 0; local345 < local23; local345++) {
							local343 += local266.method1188();
							@Pc(358) int local358;
							if (local29 == null) {
								local358 = local345;
							} else {
								local358 = local29[local345];
							}
							if (local358 == arg1) {
								Static469.method6021(local143, local280, local331, local268, local343);
								local268 += local343;
							}
							local280 += local343;
						}
					}
					local49[local270] = local331;
				} else {
					local215 = local143.length;
					local215--;
					local253 = local143[local215] & 0xFF;
					local215 -= local23 * 4 * local253;
					local266 = new Class1_Sub3(local143);
					@Pc(421) int[] local421 = new int[local23];
					local266.anInt1710 = local215;
					for (local270 = 0; local270 < local253; local270++) {
						local275 = 0;
						for (local278 = 0; local278 < local23; local278++) {
							local275 += local266.method1188();
							local421[local278] += local275;
						}
					}
					@Pc(456) byte[][] local456 = new byte[local23][];
					for (local278 = 0; local278 < local23; local278++) {
						local456[local278] = new byte[local421[local278]];
						local421[local278] = 0;
					}
					local266.anInt1710 = local215;
					local280 = 0;
					for (local293 = 0; local293 < local253; local293++) {
						local343 = 0;
						for (local345 = 0; local345 < local23; local345++) {
							local343 += local266.method1188();
							Static469.method6021(local143, local280, local456[local345], local421[local345], local343);
							local280 += local343;
							local421[local345] += local343;
						}
					}
					for (local343 = 0; local343 < local23; local343++) {
						if (local29 == null) {
							local345 = local343;
						} else {
							local345 = local29[local343];
						}
						if (this.anInt6207 == 0) {
							local49[local345] = Static320.method4547(local456[local343]);
						} else {
							local49[local345] = local456[local343];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public void method4763(@OriginalArg(1) String arg0) {
		if (this.method4746()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass165_2.aClass142_1.method3293(Static179.method3012(local20));
			this.method4773(local29);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public void method4764() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.anObjectArrayArray1.length; local8++) {
				this.anObjectArrayArray1[local8] = null;
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method4765(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method4746()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(26) int local26 = this.aClass165_2.aClass142_1.method3293(Static179.method3012(local12));
		if (this.method4748(local26)) {
			@Pc(51) int local51 = this.aClass165_2.aClass142Array1[local26].method3293(Static179.method3012(local15));
			return this.method4760(local26, local51);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
	public void method4766() {
		if (this.anObjectArray34 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anObjectArray34.length; local18++) {
				this.anObjectArray34[local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(III)Z")
	private boolean method4768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4746()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass165_2.anIntArray445.length > arg1 && arg0 < this.aClass165_2.anIntArray445[arg1]) {
			return true;
		} else if (Static107.aBoolean157) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)I")
	public int method4769(@OriginalArg(0) int arg0) {
		if (this.method4746()) {
			@Pc(16) int local16 = this.aClass165_2.aClass142_1.method3293(arg0);
			return this.method4748(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I[III)[B")
	public byte[] method4770(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method4768(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(38) boolean local38 = this.method4762(arg2, arg1, arg0);
			if (!local38) {
				this.method4771(arg2);
				local38 = this.method4762(arg2, arg1, arg0);
				if (!local38) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static408.method5555(this.anObjectArrayArray1[arg2][arg1], false);
		if (this.anInt6207 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass165_2.anIntArray445[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt6207 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local65;
	}

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "(II)V")
	private void method4771(@OriginalArg(0) int arg0) {
		if (this.aBoolean395) {
			this.anObjectArray34[arg0] = this.aClass111_1.method2676(arg0);
		} else {
			this.anObjectArray34[arg0] = Static320.method4547(this.aClass111_1.method2676(arg0));
		}
	}

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "(II)I")
	public int method4772(@OriginalArg(0) int arg0) {
		return this.method4748(arg0) ? this.aClass165_2.anIntArray445[arg0] : 0;
	}

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "(II)V")
	private void method4773(@OriginalArg(1) int arg0) {
		this.aClass111_1.method2673(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "(II)[B")
	public byte[] method4774(@OriginalArg(0) int arg0) {
		if (!this.method4746()) {
			return null;
		} else if (this.aClass165_2.anIntArray445.length == 1) {
			return this.method4758(arg0, 0);
		} else if (!this.method4748(arg0)) {
			return null;
		} else if (this.aClass165_2.anIntArray445[arg0] == 1) {
			return this.method4758(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method4775(@OriginalArg(1) String arg0) {
		if (this.method4746()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass165_2.aClass142_1.method3293(Static179.method3012(local12));
			return this.method4752(local21);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4776(@OriginalArg(1) String arg0) {
		if (this.method4746()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass165_2.aClass142_1.method3293(Static179.method3012(local12));
			return local26 >= 0;
		} else {
			return false;
		}
	}
}
