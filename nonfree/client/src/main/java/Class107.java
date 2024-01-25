import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public class Class107 {

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
	public int[] anIntArray599;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "Lclient!eha;")
	private Class5_Sub14 aClass5_Sub14_8;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
	public int anInt10318;

	@OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
	public int anInt10325;

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
	private int anInt10326;

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "Z")
	private boolean aBoolean752 = false;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
	private final int anInt10317 = 32;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "J")
	private long aLong323 = Static124.method1947();

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
	private int anInt10319 = 0;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
	private int anInt10320 = 0;

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "[Lclient!eha;")
	private final Class5_Sub14[] aClass5_Sub14Array5 = new Class5_Sub14[8];

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "Z")
	private boolean aBoolean753 = true;

	@OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
	private int anInt10323 = 0;

	@OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
	private int anInt10324 = 0;

	@OriginalMember(owner = "client!fa", name = "D", descriptor = "[Lclient!eha;")
	private final Class5_Sub14[] aClass5_Sub14Array6 = new Class5_Sub14[8];

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "J")
	private long aLong325 = 0L;

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "J")
	private long aLong324 = 0L;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public final synchronized void method8597() {
		this.aBoolean753 = true;
		try {
			this.method8608();
		} catch (@Pc(10) Exception local10) {
			this.method8607();
			this.aLong325 = Static124.method1947() + 2000L;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILclient!eha;)V")
	private void method8598(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub14 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class5_Sub14 local12 = this.aClass5_Sub14Array6[local7];
		if (local12 == null) {
			this.aClass5_Sub14Array5[local7] = arg1;
		} else {
			local12.aClass5_Sub14_9 = arg1;
		}
		this.aClass5_Sub14Array6[local7] = arg1;
		arg1.anInt10589 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([II)V")
	private void method8599(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static135.aBoolean154) {
			local1 = 512;
		}
		Static685.method8330(arg0, 0, local1);
		this.anInt10323 -= 256;
		if (this.aClass5_Sub14_8 != null && this.anInt10323 <= 0) {
			this.anInt10323 += Static227.anInt3654 >> 4;
			Static287.method3968(this.aClass5_Sub14_8);
			this.method8598(this.aClass5_Sub14_8.method8782(), this.aClass5_Sub14_8);
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
						@Pc(88) Class5_Sub14 local88 = null;
						@Pc(93) Class5_Sub14 local93 = this.aClass5_Sub14Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class5_Sub9 local97 = local93.aClass5_Sub9_6;
								if (local97 == null || local97.anInt487 <= local61) {
									local93.aBoolean787 = true;
									@Pc(121) int local121 = local93.method8783();
									local45 += local121;
									if (local97 != null) {
										local97.anInt487 += local121;
									}
									if (local45 >= this.anInt10317) {
										break label103;
									}
									@Pc(140) Class5_Sub14 local140 = local93.method8779();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt10589;
										while (local140 != null) {
											this.method8598(local145 * local140.method8782() >> 8, local140);
											local140 = local93.method8780();
										}
									}
									@Pc(164) Class5_Sub14 local164 = local93.aClass5_Sub14_9;
									local93.aClass5_Sub14_9 = null;
									if (local88 == null) {
										this.aClass5_Sub14Array5[local56] = local164;
									} else {
										local88.aClass5_Sub14_9 = local164;
									}
									if (local164 == null) {
										this.aClass5_Sub14Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass5_Sub14_9;
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
				@Pc(207) Class5_Sub14 local207 = this.aClass5_Sub14Array5[local56];
				this.aClass5_Sub14Array5[local56] = this.aClass5_Sub14Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class5_Sub14 local221 = local207.aClass5_Sub14_9;
					local207.aClass5_Sub14_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt10323 < 0) {
			this.anInt10323 = 0;
		}
		if (this.aClass5_Sub14_8 != null) {
			this.aClass5_Sub14_8.method8781(arg0, 0, 256);
		}
		this.aLong323 = Static124.method1947();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "()I")
	protected int method8600() throws Exception {
		return this.anInt10325;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	public final synchronized void method8602() {
		if (this.aBoolean752) {
			return;
		}
		@Pc(10) long local10 = Static124.method1947();
		try {
			if (this.aLong323 + 6000L < local10) {
				this.aLong323 = local10 - 6000L;
			}
			while (local10 > this.aLong323 + 5000L) {
				this.method8606();
				this.aLong323 += (long) (256000 / Static227.anInt3654);
				local10 = Static124.method1947();
			}
		} catch (@Pc(56) Exception local56) {
			this.aLong323 = local10;
		}
		if (this.anIntArray599 == null) {
			return;
		}
		try {
			if (this.aLong325 != 0L) {
				if (local10 < this.aLong325) {
					return;
				}
				this.method8603(this.anInt10325);
				this.aBoolean753 = true;
				this.aLong325 = 0L;
			}
			@Pc(91) int local91 = this.method8600();
			if (this.anInt10320 < this.anInt10324 - local91) {
				this.anInt10320 = this.anInt10324 - local91;
			}
			@Pc(111) int local111 = this.anInt10326 + this.anInt10318;
			if (local111 + 256 > 16384) {
				local111 = 16128;
			}
			if (local111 + 256 > this.anInt10325) {
				this.anInt10325 += 1024;
				if (this.anInt10325 > 16384) {
					this.anInt10325 = 16384;
				}
				this.method8607();
				this.method8603(this.anInt10325);
				local91 = 0;
				if (local111 + 256 > this.anInt10325) {
					local111 = this.anInt10325 - 256;
					this.anInt10326 = local111 - this.anInt10318;
				}
				this.aBoolean753 = true;
			}
			while (local91 < local111) {
				this.method8599(this.anIntArray599);
				this.method8612();
				local91 += 256;
			}
			if (local10 > this.aLong324) {
				if (this.aBoolean753) {
					this.aBoolean753 = false;
				} else if (this.anInt10320 == 0 && this.anInt10319 == 0) {
					this.method8607();
					this.aLong325 = local10 + 2000L;
					return;
				} else {
					this.anInt10326 = Math.min(this.anInt10319, this.anInt10320);
					this.anInt10319 = this.anInt10320;
				}
				this.aLong324 = local10 + 2000L;
				this.anInt10320 = 0;
			}
			this.anInt10324 = local91;
		} catch (@Pc(234) Exception local234) {
			this.method8607();
			this.aLong325 = local10 + 2000L;
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	public void method8603(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!eha;)V")
	public final synchronized void method8604(@OriginalArg(1) Class5_Sub14 arg0) {
		this.aClass5_Sub14_8 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
	private void method8606() {
		this.anInt10323 -= 256;
		if (this.anInt10323 < 0) {
			this.anInt10323 = 0;
		}
		if (this.aClass5_Sub14_8 != null) {
			this.aClass5_Sub14_8.method8778(256);
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "()V")
	protected void method8607() {
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "()V")
	protected void method8608() throws Exception {
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method8609(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V")
	public final synchronized void method8610() {
		if (Static569.aClass70_1 != null) {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < 2; local5++) {
				if (Static569.aClass70_1.aClass107Array1[local5] == this) {
					Static569.aClass70_1.aClass107Array1[local5] = null;
				}
				if (Static569.aClass70_1.aClass107Array1[local5] != null) {
					local3 = false;
				}
			}
			if (local3) {
				Static569.aClass70_1.aBoolean113 = true;
				while (Static569.aClass70_1.aBoolean112) {
					Static127.method1985(50L);
				}
				Static569.aClass70_1 = null;
			}
		}
		this.method8607();
		this.aBoolean752 = true;
		this.anIntArray599 = null;
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "()V")
	protected void method8612() throws Exception {
	}
}
