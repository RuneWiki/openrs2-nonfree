import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class101 {

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "[I")
	private int[] anIntArray199;

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "[I")
	private int[] anIntArray201;

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "Lclient!ib;")
	private Class102 aClass102_15;

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12;

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "Ljava/lang/String;")
	private String aString33;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "[I")
	private int[] anIntArray203;

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "Ljava/lang/String;")
	private String aString34;

	@OriginalMember(owner = "client!hv", name = "r", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!hv", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!hv", name = "t", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!hv", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!hv", name = "w", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13;

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
	public int anInt3153 = -1;

	static {
		new Class83("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
	public void method2676() {
		if (this.aString34 == null) {
			this.aString34 = this.aString33;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLclient!iv;)V")
	public void method2679(@OriginalArg(1) Class4_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2490();
			if (local5 == 0) {
				return;
			}
			this.method2681(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!iv;II)V")
	private void method2681(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString33 = arg0.method2497();
		} else if (arg1 == 2) {
			this.aString34 = arg0.method2497();
		} else {
			@Pc(82) int local82;
			@Pc(88) int local88;
			if (arg1 == 3) {
				local82 = arg0.method2490();
				this.anIntArrayArray27 = new int[local82][3];
				for (local88 = 0; local88 < local82; local88++) {
					this.anIntArrayArray27[local88][0] = arg0.method2536();
					this.anIntArrayArray27[local88][1] = arg0.method2529();
					this.anIntArrayArray27[local88][2] = arg0.method2529();
				}
			} else if (arg1 == 4) {
				local82 = arg0.method2490();
				this.anIntArrayArray28 = new int[local82][3];
				for (local88 = 0; local88 < local82; local88++) {
					this.anIntArrayArray28[local88][0] = arg0.method2536();
					this.anIntArrayArray28[local88][1] = arg0.method2529();
					this.anIntArrayArray28[local88][2] = arg0.method2529();
				}
			} else if (arg1 == 5) {
				arg0.method2536();
			} else if (arg1 == 6) {
				arg0.method2490();
			} else if (arg1 == 7) {
				arg0.method2490();
				return;
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method2490();
					return;
				}
				if (arg1 == 10) {
					local82 = arg0.method2490();
					this.anIntArray206 = new int[local82];
					for (local88 = 0; local88 < local82; local88++) {
						this.anIntArray206[local88] = arg0.method2529();
					}
					return;
				}
				if (arg1 == 12) {
					arg0.method2529();
					return;
				}
				if (arg1 != 13) {
					if (arg1 == 14) {
						local82 = arg0.method2490();
						this.anIntArrayArray29 = new int[local82][2];
						for (local88 = 0; local88 < local82; local88++) {
							this.anIntArrayArray29[local88][0] = arg0.method2490();
							this.anIntArrayArray29[local88][1] = arg0.method2490();
						}
						return;
					}
					if (arg1 == 15) {
						arg0.method2536();
						return;
					}
					if (arg1 == 17) {
						this.anInt3153 = arg0.method2536();
						return;
					}
					if (arg1 != 18) {
						if (arg1 == 19) {
							local82 = arg0.method2490();
							this.anIntArray202 = new int[local82];
							this.aStringArray13 = new String[local82];
							this.anIntArray203 = new int[local82];
							this.anIntArray199 = new int[local82];
							for (local88 = 0; local88 < local82; local88++) {
								this.anIntArray203[local88] = arg0.method2529();
								this.anIntArray202[local88] = arg0.method2529();
								this.anIntArray199[local88] = arg0.method2529();
								this.aStringArray13[local88] = arg0.method2537();
							}
						} else if (arg1 == 249) {
							local82 = arg0.method2490();
							if (this.aClass102_15 == null) {
								local88 = Static370.method4949(local82);
								this.aClass102_15 = new Class102(local88);
							}
							for (local88 = 0; local88 < local82; local88++) {
								@Pc(222) boolean local222 = arg0.method2490() == 1;
								@Pc(226) int local226 = arg0.method2493();
								@Pc(235) Class4 local235;
								if (local222) {
									local235 = new Class4_Sub7(arg0.method2537());
								} else {
									local235 = new Class4_Sub37(arg0.method2529());
								}
								this.aClass102_15.method2703((long) local226, local235);
							}
							return;
						}
						return;
					}
					local82 = arg0.method2490();
					this.anIntArray201 = new int[local82];
					this.aStringArray12 = new String[local82];
					this.anIntArray200 = new int[local82];
					this.anIntArray204 = new int[local82];
					for (local88 = 0; local88 < local82; local88++) {
						this.anIntArray204[local88] = arg0.method2529();
						this.anIntArray201[local88] = arg0.method2529();
						this.anIntArray200[local88] = arg0.method2529();
						this.aStringArray12[local88] = arg0.method2537();
					}
					return;
				}
				local82 = arg0.method2490();
				this.anIntArray205 = new int[local82];
				for (local88 = 0; local88 < local82; local88++) {
					this.anIntArray205[local88] = arg0.method2536();
				}
				return;
			}
		}
	}
}
