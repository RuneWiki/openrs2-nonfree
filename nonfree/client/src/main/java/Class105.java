import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public class Class105 {

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "[I")
	public int[] anIntArray367;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "Lclient!ph;")
	private Class3_Sub15 aClass3_Sub15_6;

	@OriginalMember(owner = "client!tn", name = "z", descriptor = "I")
	private int anInt3143;

	@OriginalMember(owner = "client!tn", name = "D", descriptor = "I")
	public int anInt3145;

	@OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
	public int anInt3146;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
	private int anInt3137 = 32;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "J")
	private long aLong139 = Static128.method2196();

	@OriginalMember(owner = "client!tn", name = "x", descriptor = "I")
	private int anInt3141 = 0;

	@OriginalMember(owner = "client!tn", name = "B", descriptor = "I")
	private int anInt3144 = 0;

	@OriginalMember(owner = "client!tn", name = "A", descriptor = "J")
	private long aLong140 = 0L;

	@OriginalMember(owner = "client!tn", name = "C", descriptor = "[Lclient!ph;")
	private Class3_Sub15[] aClass3_Sub15Array5 = new Class3_Sub15[8];

	@OriginalMember(owner = "client!tn", name = "G", descriptor = "Z")
	private boolean aBoolean225 = true;

	@OriginalMember(owner = "client!tn", name = "H", descriptor = "J")
	private long aLong141 = 0L;

	@OriginalMember(owner = "client!tn", name = "I", descriptor = "I")
	private int anInt3148 = 0;

	@OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
	private int anInt3147 = 0;

	@OriginalMember(owner = "client!tn", name = "J", descriptor = "[Lclient!ph;")
	private Class3_Sub15[] aClass3_Sub15Array6 = new Class3_Sub15[8];

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "([II)V")
	private void method2766(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static105.aBoolean156) {
			local1 = 512;
		}
		Static326.method4266(arg0, 0, local1);
		this.anInt3144 -= 256;
		if (this.aClass3_Sub15_6 != null && this.anInt3144 <= 0) {
			this.anInt3144 += Static155.anInt2915 >> 4;
			Static286.method4484(this.aClass3_Sub15_6);
			this.method2770(this.aClass3_Sub15_6, this.aClass3_Sub15_6.method4558());
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 255;
			@Pc(49) int local49 = 7;
			label106: while (local47 != 0) {
				@Pc(57) int local57;
				@Pc(62) int local62;
				if (local49 < 0) {
					local57 = local49 & 0x3;
					local62 = -(local49 >> 2);
				} else {
					local57 = local49;
					local62 = 0;
				}
				for (@Pc(73) int local73 = local47 >>> local57 & 0x11111111; local73 != 0; local73 >>>= 0x4) {
					if ((local73 & 0x1) != 0) {
						local47 &= ~(0x1 << local57);
						@Pc(91) Class3_Sub15 local91 = null;
						@Pc(96) Class3_Sub15 local96 = this.aClass3_Sub15Array6[local57];
						label100: while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Class3_Sub11 local101 = local96.aClass3_Sub11_5;
								if (local101 == null || local101.anInt4382 <= local62) {
									local96.aBoolean386 = true;
									@Pc(125) int local125 = local96.method4564();
									local45 += local125;
									if (local101 != null) {
										local101.anInt4382 += local125;
									}
									if (local45 >= this.anInt3137) {
										break label106;
									}
									@Pc(145) Class3_Sub15 local145 = local96.method4559();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt5600;
										while (local145 != null) {
											this.method2770(local145, local150 * local145.method4558() >> 8);
											local145 = local96.method4563();
										}
									}
									@Pc(169) Class3_Sub15 local169 = local96.aClass3_Sub15_8;
									local96.aClass3_Sub15_8 = null;
									if (local91 == null) {
										this.aClass3_Sub15Array6[local57] = local169;
									} else {
										local91.aClass3_Sub15_8 = local169;
									}
									if (local169 == null) {
										this.aClass3_Sub15Array5[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass3_Sub15_8;
								}
							}
						}
					}
					local57 += 4;
					local62++;
				}
				local49--;
			}
			for (local49 = 0; local49 < 8; local49++) {
				@Pc(212) Class3_Sub15 local212 = this.aClass3_Sub15Array6[local49];
				this.aClass3_Sub15Array6[local49] = this.aClass3_Sub15Array5[local49] = null;
				while (local212 != null) {
					@Pc(227) Class3_Sub15 local227 = local212.aClass3_Sub15_8;
					local212.aClass3_Sub15_8 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt3144 < 0) {
			this.anInt3144 = 0;
		}
		if (this.aClass3_Sub15_6 != null) {
			this.aClass3_Sub15_6.method4560(arg0, 0, 256);
		}
		this.aLong139 = Static128.method2196();
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)V")
	private void method2768() {
		this.anInt3144 -= 256;
		if (this.anInt3144 < 0) {
			this.anInt3144 = 0;
		}
		if (this.aClass3_Sub15_6 != null) {
			this.aClass3_Sub15_6.method4561(256);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "()I")
	protected int method2769() throws Exception {
		return this.anInt3146;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLclient!ph;I)V")
	private void method2770(@OriginalArg(1) Class3_Sub15 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 >> 5;
		@Pc(14) Class3_Sub15 local14 = this.aClass3_Sub15Array5[local9];
		if (local14 == null) {
			this.aClass3_Sub15Array6[local9] = arg0;
		} else {
			local14.aClass3_Sub15_8 = arg0;
		}
		this.aClass3_Sub15Array5[local9] = arg0;
		arg0.anInt5600 = arg1;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
	public void method2772(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "()V")
	protected void method2773() {
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V")
	public final void method2774() {
		this.aBoolean225 = true;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "()V")
	protected void method2775() throws Exception {
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!ph;)V")
	public final synchronized void method2777(@OriginalArg(1) Class3_Sub15 arg0) {
		this.aClass3_Sub15_6 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2778(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)V")
	public final synchronized void method2779() {
		this.aBoolean225 = true;
		try {
			this.method2775();
		} catch (@Pc(18) Exception local18) {
			this.method2773();
			this.aLong141 = Static128.method2196() + 2000L;
		}
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "()V")
	protected void method2780() throws Exception {
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
	public final synchronized void method2781() {
		if (this.aBoolean224) {
			return;
		}
		@Pc(21) long local21 = Static128.method2196();
		try {
			if (local21 > this.aLong139 + 500000L) {
				this.aLong139 = local21 - 500000L;
			}
			while (local21 > this.aLong139 + 5000L) {
				this.method2768();
				this.aLong139 += 256000 / Static155.anInt2915;
			}
		} catch (@Pc(61) Exception local61) {
			this.aLong139 = local21;
		}
		if (this.anIntArray367 == null) {
			return;
		}
		try {
			if (this.aLong141 != 0L) {
				if (local21 < this.aLong141) {
					return;
				}
				this.method2772(this.anInt3146);
				this.aBoolean225 = true;
				this.aLong141 = 0L;
			}
			@Pc(97) int local97 = this.method2769();
			if (this.anInt3147 < this.anInt3148 - local97) {
				this.anInt3147 = this.anInt3148 - local97;
			}
			@Pc(121) int local121 = this.anInt3143 + this.anInt3145;
			if (local121 + 256 > 16384) {
				local121 = 16128;
			}
			if (local121 + 256 > this.anInt3146) {
				this.anInt3146 += 1024;
				local97 = 0;
				if (this.anInt3146 > 16384) {
					this.anInt3146 = 16384;
				}
				this.method2773();
				this.method2772(this.anInt3146);
				if (local121 + 256 > this.anInt3146) {
					local121 = this.anInt3146 - 256;
					this.anInt3143 = local121 - this.anInt3145;
				}
				this.aBoolean225 = true;
			}
			while (local97 < local121) {
				this.method2766(this.anIntArray367);
				this.method2780();
				local97 += 256;
			}
			if (local21 > this.aLong140) {
				if (this.aBoolean225) {
					this.aBoolean225 = false;
				} else if (this.anInt3147 == 0 && this.anInt3141 == 0) {
					this.method2773();
					this.aLong141 = local21 + 2000L;
					return;
				} else {
					this.anInt3143 = Math.min(this.anInt3141, this.anInt3147);
					this.anInt3141 = this.anInt3147;
				}
				this.anInt3147 = 0;
				this.aLong140 = local21 + 2000L;
			}
			this.anInt3148 = local97;
		} catch (@Pc(259) Exception local259) {
			this.method2773();
			this.aLong141 = local21 + 2000L;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)V")
	public final synchronized void method2782() {
		if (Static266.aClass143_1 != null) {
			@Pc(6) boolean local6 = true;
			for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
				if (Static266.aClass143_1.aClass105Array1[local8] == this) {
					Static266.aClass143_1.aClass105Array1[local8] = null;
				}
				if (Static266.aClass143_1.aClass105Array1[local8] != null) {
					local6 = false;
				}
			}
			if (local6) {
				Static266.aClass143_1.aBoolean309 = true;
				while (Static266.aClass143_1.aBoolean310) {
					Static150.method2552(50L);
				}
				Static266.aClass143_1 = null;
			}
		}
		this.method2773();
		this.anIntArray367 = null;
		this.aBoolean224 = true;
	}
}
