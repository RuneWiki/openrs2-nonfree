import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public class Class190 {

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Lclient!ca;")
	private Class6_Sub3 aClass6_Sub3_8;

	@OriginalMember(owner = "client!vn", name = "r", descriptor = "[I")
	public int[] anIntArray540;

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
	public int anInt8716;

	@OriginalMember(owner = "client!vn", name = "H", descriptor = "I")
	private int anInt8725;

	@OriginalMember(owner = "client!vn", name = "K", descriptor = "I")
	public int anInt8726;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
	private final int anInt8705 = 32;

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "Z")
	private boolean aBoolean581 = false;

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "J")
	private long aLong225 = Static32.method595();

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
	private int anInt8717 = 0;

	@OriginalMember(owner = "client!vn", name = "F", descriptor = "I")
	private int anInt8723 = 0;

	@OriginalMember(owner = "client!vn", name = "C", descriptor = "[Lclient!ca;")
	private final Class6_Sub3[] aClass6_Sub3Array6 = new Class6_Sub3[8];

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "Z")
	private boolean aBoolean582 = true;

	@OriginalMember(owner = "client!vn", name = "E", descriptor = "I")
	private int anInt8722 = 0;

	@OriginalMember(owner = "client!vn", name = "J", descriptor = "J")
	private long aLong227 = 0L;

	@OriginalMember(owner = "client!vn", name = "A", descriptor = "[Lclient!ca;")
	private final Class6_Sub3[] aClass6_Sub3Array5 = new Class6_Sub3[8];

	@OriginalMember(owner = "client!vn", name = "I", descriptor = "J")
	private long aLong226 = 0L;

	@OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
	private int anInt8719 = 0;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "()V")
	protected void method7489() {
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BLclient!ca;)V")
	public final synchronized void method7490(@OriginalArg(1) Class6_Sub3 arg0) {
		this.aClass6_Sub3_8 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public final synchronized void method7491() {
		this.aBoolean582 = true;
		try {
			this.method7495();
		} catch (@Pc(10) Exception local10) {
			this.method7489();
			this.aLong227 = Static32.method595() + 2000L;
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public void method7492(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "()V")
	protected void method7495() throws Exception {
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method7497(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V")
	private void method7498() {
		this.anInt8719 -= 256;
		if (this.anInt8719 < 0) {
			this.anInt8719 = 0;
		}
		if (this.aClass6_Sub3_8 != null) {
			this.aClass6_Sub3_8.method7801(256);
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
	public final synchronized void method7499() {
		if (this.aBoolean581) {
			return;
		}
		@Pc(12) long local12 = Static32.method595();
		try {
			if (local12 > this.aLong225 + 6000L) {
				this.aLong225 = local12 - 6000L;
			}
			while (this.aLong225 + 5000L < local12) {
				this.method7498();
				this.aLong225 += (long) (256000 / Static78.anInt1661);
				local12 = Static32.method595();
			}
		} catch (@Pc(55) Exception local55) {
			this.aLong225 = local12;
		}
		if (this.anIntArray540 == null) {
			return;
		}
		try {
			if (this.aLong227 != 0L) {
				if (local12 < this.aLong227) {
					return;
				}
				this.method7492(this.anInt8726);
				this.aBoolean582 = true;
				this.aLong227 = 0L;
			}
			@Pc(90) int local90 = this.method7500();
			if (this.anInt8722 < this.anInt8717 - local90) {
				this.anInt8722 = this.anInt8717 - local90;
			}
			@Pc(120) int local120 = this.anInt8716 + this.anInt8725;
			if (local120 + 256 > 16384) {
				local120 = 16128;
			}
			if (this.anInt8726 < local120 + 256) {
				this.anInt8726 += 1024;
				if (this.anInt8726 > 16384) {
					this.anInt8726 = 16384;
				}
				this.method7489();
				local90 = 0;
				this.method7492(this.anInt8726);
				this.aBoolean582 = true;
				if (this.anInt8726 < local120 + 256) {
					local120 = this.anInt8726 - 256;
					this.anInt8725 = local120 - this.anInt8716;
				}
			}
			while (local90 < local120) {
				this.method7501(this.anIntArray540);
				this.method7503();
				local90 += 256;
			}
			if (this.aLong226 < local12) {
				if (this.aBoolean582) {
					this.aBoolean582 = false;
				} else if (this.anInt8722 == 0 && this.anInt8723 == 0) {
					this.method7489();
					this.aLong227 = local12 + 2000L;
					return;
				} else {
					this.anInt8725 = Math.min(this.anInt8723, this.anInt8722);
					this.anInt8723 = this.anInt8722;
				}
				this.anInt8722 = 0;
				this.aLong226 = local12 + 2000L;
			}
			this.anInt8717 = local90;
		} catch (@Pc(245) Exception local245) {
			this.method7489();
			this.aLong227 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "()I")
	protected int method7500() throws Exception {
		return this.anInt8726;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([II)V")
	private void method7501(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static339.aBoolean677) {
			local1 = 512;
		}
		Static655.method5833(arg0, 0, local1);
		this.anInt8719 -= 256;
		if (this.aClass6_Sub3_8 != null && this.anInt8719 <= 0) {
			this.anInt8719 += Static78.anInt1661 >> 4;
			Static558.method8053(this.aClass6_Sub3_8);
			this.method7505(this.aClass6_Sub3_8.method7802(), this.aClass6_Sub3_8);
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 255;
			@Pc(49) int local49 = 7;
			@Pc(56) int local56;
			label103: while (local47 != 0) {
				@Pc(61) int local61;
				if (local49 < 0) {
					local56 = local49 & 0x3;
					local61 = -(local49 >> 2);
				} else {
					local56 = local49;
					local61 = 0;
				}
				for (@Pc(72) int local72 = local47 >>> local56 & 0x11111111; local72 != 0; local72 >>>= 0x4) {
					if ((local72 & 0x1) != 0) {
						local47 &= ~(0x1 << local56);
						@Pc(88) Class6_Sub3 local88 = null;
						@Pc(93) Class6_Sub3 local93 = this.aClass6_Sub3Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class6_Sub37 local97 = local93.aClass6_Sub37_6;
								if (local97 == null || local97.anInt9839 <= local61) {
									local93.aBoolean614 = true;
									@Pc(121) int local121 = local93.method7804();
									local45 += local121;
									if (local97 != null) {
										local97.anInt9839 += local121;
									}
									if (local45 >= this.anInt8705) {
										break label103;
									}
									@Pc(140) Class6_Sub3 local140 = local93.method7800();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt9133;
										while (local140 != null) {
											this.method7505(local145 * local140.method7802() >> 8, local140);
											local140 = local93.method7803();
										}
									}
									@Pc(164) Class6_Sub3 local164 = local93.aClass6_Sub3_9;
									local93.aClass6_Sub3_9 = null;
									if (local88 == null) {
										this.aClass6_Sub3Array5[local56] = local164;
									} else {
										local88.aClass6_Sub3_9 = local164;
									}
									if (local164 == null) {
										this.aClass6_Sub3Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass6_Sub3_9;
								}
							}
						}
					}
					local56 += 4;
					local61++;
				}
				local49--;
			}
			for (local56 = 0; local56 < 8; local56++) {
				@Pc(207) Class6_Sub3 local207 = this.aClass6_Sub3Array5[local56];
				this.aClass6_Sub3Array5[local56] = this.aClass6_Sub3Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class6_Sub3 local221 = local207.aClass6_Sub3_9;
					local207.aClass6_Sub3_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt8719 < 0) {
			this.anInt8719 = 0;
		}
		if (this.aClass6_Sub3_8 != null) {
			this.aClass6_Sub3_8.method7805(arg0, 0, 256);
		}
		this.aLong225 = Static32.method595();
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "()V")
	protected void method7503() throws Exception {
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IILclient!ca;)V")
	private void method7505(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub3 arg1) {
		@Pc(16) int local16 = arg0 >> 5;
		@Pc(21) Class6_Sub3 local21 = this.aClass6_Sub3Array6[local16];
		if (local21 == null) {
			this.aClass6_Sub3Array5[local16] = arg1;
		} else {
			local21.aClass6_Sub3_9 = arg1;
		}
		this.aClass6_Sub3Array6[local16] = arg1;
		arg1.anInt9133 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)V")
	public final synchronized void method7507() {
		if (Static394.aClass176_1 != null) {
			@Pc(18) boolean local18 = true;
			for (@Pc(20) int local20 = 0; local20 < 2; local20++) {
				if (Static394.aClass176_1.aClass190Array1[local20] == this) {
					Static394.aClass176_1.aClass190Array1[local20] = null;
				}
				if (Static394.aClass176_1.aClass190Array1[local20] != null) {
					local18 = false;
				}
			}
			if (local18) {
				Static394.aClass176_1.aBoolean391 = true;
				while (Static394.aClass176_1.aBoolean390) {
					Static179.method3254(50L);
				}
				Static394.aClass176_1 = null;
			}
		}
		this.method7489();
		this.anIntArray540 = null;
		this.aBoolean581 = true;
	}
}
