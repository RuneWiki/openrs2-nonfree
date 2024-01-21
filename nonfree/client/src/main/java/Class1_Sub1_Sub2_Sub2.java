import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!y")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!y", name = "Cb", descriptor = "Lclient!r;")
	public static Class30 aClass30_7 = new Class30(-947, 200);

	@OriginalMember(owner = "client!y", name = "ib", descriptor = "Ljava/lang/String;")
	public String aString27;

	@OriginalMember(owner = "client!y", name = "kb", descriptor = "I")
	private int anInt750;

	@OriginalMember(owner = "client!y", name = "lb", descriptor = "I")
	public int anInt751;

	@OriginalMember(owner = "client!y", name = "ob", descriptor = "I")
	public int anInt752;

	@OriginalMember(owner = "client!y", name = "pb", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!y", name = "qb", descriptor = "I")
	public int anInt753;

	@OriginalMember(owner = "client!y", name = "rb", descriptor = "I")
	public int anInt754;

	@OriginalMember(owner = "client!y", name = "sb", descriptor = "I")
	public int anInt755;

	@OriginalMember(owner = "client!y", name = "tb", descriptor = "I")
	public int anInt756;

	@OriginalMember(owner = "client!y", name = "ub", descriptor = "I")
	public int anInt757;

	@OriginalMember(owner = "client!y", name = "vb", descriptor = "I")
	public int anInt758;

	@OriginalMember(owner = "client!y", name = "wb", descriptor = "Lclient!db;")
	public Class1_Sub3_Sub1 aClass1_Sub3_Sub1_9;

	@OriginalMember(owner = "client!y", name = "xb", descriptor = "I")
	public int anInt759;

	@OriginalMember(owner = "client!y", name = "yb", descriptor = "I")
	public int anInt760;

	@OriginalMember(owner = "client!y", name = "zb", descriptor = "I")
	public int anInt761;

	@OriginalMember(owner = "client!y", name = "Ab", descriptor = "I")
	public int anInt762;

	@OriginalMember(owner = "client!y", name = "eb", descriptor = "I")
	private int anInt747 = 1;

	@OriginalMember(owner = "client!y", name = "fb", descriptor = "I")
	private int anInt748 = -612;

	@OriginalMember(owner = "client!y", name = "gb", descriptor = "I")
	private int anInt749 = 8;

	@OriginalMember(owner = "client!y", name = "hb", descriptor = "B")
	private byte aByte35 = 2;

	@OriginalMember(owner = "client!y", name = "jb", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!y", name = "mb", descriptor = "[I")
	private int[] anIntArray209 = new int[13];

	@OriginalMember(owner = "client!y", name = "nb", descriptor = "[I")
	private int[] anIntArray210 = new int[5];

	@OriginalMember(owner = "client!y", name = "Bb", descriptor = "Z")
	public boolean aBoolean130 = false;

	@OriginalMember(owner = "client!y", name = "a", descriptor = "(Lclient!jb;I)V")
	public void method465(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		arg0.anInt394 = 0;
		this.anInt750 = arg0.method331();
		this.anInt751 = arg0.method331();
		@Pc(24) int local24;
		@Pc(36) int local36;
		for (@Pc(19) int local19 = 0; local19 < 13; local19++) {
			local24 = arg0.method331();
			if (local24 == 0) {
				this.anIntArray209[local19] = 0;
			} else {
				local36 = arg0.method331();
				this.anIntArray209[local19] = (local24 << 8) + local36;
			}
		}
		for (local24 = 0; local24 < 5; local24++) {
			local36 = arg0.method331();
			if (local36 < 0 || local36 >= client.anIntArrayArray5[local24].length) {
				local36 = 0;
			}
			this.anIntArray210[local24] = local36;
		}
		super.anInt710 = arg0.method333();
		super.anInt711 = arg0.method333();
		super.anInt706 = arg0.method333();
		super.anInt707 = arg0.method333();
		super.anInt708 = arg0.method333();
		super.anInt709 = arg0.method333();
		this.aString27 = Class35.method434(Class35.method431(arg0.method337()));
		this.anInt752 = arg0.method331();
		this.aBoolean129 = true;
		this.aLong22 = 0L;
		for (local36 = 0; local36 < 12; local36++) {
			this.aLong22 <<= 0x4;
			if (this.anIntArray209[local36] >= 256) {
				this.aLong22 += this.anIntArray209[local36] - 256;
			}
		}
		for (@Pc(152) int local152 = 0; local152 < 5; local152++) {
			this.aLong22 <<= 0x3;
			this.aLong22 += this.anIntArray210[local152];
		}
		this.aLong22 <<= 0x1;
		this.aLong22 += this.anInt750;
	}

	@OriginalMember(owner = "client!y", name = "a", descriptor = "(I)Lclient!db;")
	@Override
	public Class1_Sub3_Sub1 method479() {
		if (!this.aBoolean129) {
			return null;
		}
		@Pc(16) Class1_Sub3_Sub1 local16 = this.method466();
		super.anInt743 = local16.anInt220;
		if (this.aBoolean130) {
			return local16;
		}
		if (super.anInt731 != -1 && super.anInt732 != -1) {
			@Pc(38) Class13 local38 = Class13.aClass13Array1[super.anInt731];
			@Pc(54) Class1_Sub3_Sub1 local54 = new Class1_Sub3_Sub1(true, !local38.aBoolean83, local38.method245(), 440, true, false);
			local54.method165(this.anInt749, 0, 0, -super.anInt735);
			local54.method159();
			local54.method160(local38.aClass11_1.anIntArray124[super.anInt732]);
			local54.anIntArrayArray8 = null;
			local54.anIntArrayArray7 = null;
			local54.method169(64, 850, -30, -50, -30, true);
			@Pc(100) Class1_Sub3_Sub1[] local100 = new Class1_Sub3_Sub1[] { local16, local54 };
			local16 = new Class1_Sub3_Sub1(true, local100, 20525, 2);
		}
		if (this.aClass1_Sub3_Sub1_9 != null) {
			if (client.anInt85 >= this.anInt755) {
				this.aClass1_Sub3_Sub1_9 = null;
			}
			if (client.anInt85 >= this.anInt754 && client.anInt85 < this.anInt755) {
				@Pc(129) Class1_Sub3_Sub1 local129 = this.aClass1_Sub3_Sub1_9;
				local129.method165(this.anInt749, this.anInt758 - super.anInt702, this.anInt756 - super.anInt701, this.anInt757 - this.anInt753);
				if (super.anInt744 == 512) {
					local129.method163();
					local129.method163();
					local129.method163();
				} else if (super.anInt744 == 1024) {
					local129.method163();
					local129.method163();
				} else if (super.anInt744 == 1536) {
					local129.method163();
				}
				@Pc(193) Class1_Sub3_Sub1[] local193 = new Class1_Sub3_Sub1[] { local16, local129 };
				local16 = new Class1_Sub3_Sub1(true, local193, 20525, 2);
				if (super.anInt744 == 512) {
					local129.method163();
				} else if (super.anInt744 == 1024) {
					local129.method163();
					local129.method163();
				} else if (super.anInt744 == 1536) {
					local129.method163();
					local129.method163();
					local129.method163();
				}
				local129.method165(this.anInt749, super.anInt702 - this.anInt758, super.anInt701 - this.anInt756, this.anInt753 - this.anInt757);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!y", name = "b", descriptor = "(I)Lclient!db;")
	private Class1_Sub3_Sub1 method466() {
		@Pc(4) long local4 = this.aLong22;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = -1;
		@Pc(12) int local12 = -1;
		if (super.anInt726 >= 0 && super.anInt729 == 0) {
			@Pc(23) Class11 local23 = Class11.aClass11Array1[super.anInt726];
			local6 = local23.anIntArray124[super.anInt727];
			if (super.anInt723 >= 0 && super.anInt723 != super.anInt710) {
				local8 = Class11.aClass11Array1[super.anInt723].anIntArray124[super.anInt724];
			}
			if (local23.anInt298 >= 0) {
				local10 = local23.anInt298;
				local4 += local10 - this.anIntArray209[5] << 8;
			}
			if (local23.anInt299 >= 0) {
				local12 = local23.anInt299;
				local4 += local10 - this.anIntArray209[3] << 16;
			}
		} else if (super.anInt723 >= 0) {
			local6 = Class11.aClass11Array1[super.anInt723].anIntArray124[super.anInt724];
		}
		@Pc(101) Class1_Sub3_Sub1 local101 = (Class1_Sub3_Sub1) aClass30_7.method419(local4);
		if (local101 == null) {
			@Pc(106) Class1_Sub3_Sub1[] local106 = new Class1_Sub3_Sub1[13];
			@Pc(108) int local108 = 0;
			@Pc(117) int local117;
			for (@Pc(110) int local110 = 0; local110 < 13; local110++) {
				local117 = this.anIntArray209[local110];
				if (local12 >= 0 && local110 == 3) {
					local117 = local12;
				}
				if (local10 >= 0 && local110 == 5) {
					local117 = local10;
				}
				if (local117 >= 256 && local117 < 512) {
					local106[local108++] = Class5.aClass5Array1[local117 - 256].method54();
				}
				if (local117 >= 512) {
					@Pc(155) Class39 local155 = Class39.method471(local117 - 512);
					@Pc(161) Class1_Sub3_Sub1 local161 = local155.method476(this.anInt750);
					if (local161 != null) {
						local106[local108++] = local161;
					}
				}
			}
			local101 = new Class1_Sub3_Sub1(local108, false, local106);
			for (local117 = 0; local117 < 5; local117++) {
				if (this.anIntArray210[local117] != 0) {
					local101.method166(client.anIntArrayArray5[local117][0], client.anIntArrayArray5[local117][this.anIntArray210[local117]]);
					if (local117 == 1) {
						local101.method166(client.anIntArray23[0], client.anIntArray23[this.anIntArray210[local117]]);
					}
				}
			}
			local101.method159();
			local101.method169(64, 850, -30, -50, -30, true);
			aClass30_7.method420(local101, local4, this.aByte35);
		}
		if (this.aBoolean130) {
			return local101;
		}
		@Pc(250) Class1_Sub3_Sub1 local250 = new Class1_Sub3_Sub1(true, false, local101);
		if (local6 != -1 && local8 != -1) {
			local250.method161(local6, local8, Class11.aClass11Array1[super.anInt726].anIntArray127, this.anInt748);
		} else if (local6 != -1) {
			local250.method160(local6);
		}
		local250.method157();
		local250.anIntArrayArray8 = null;
		local250.anIntArrayArray7 = null;
		return local250;
	}

	@OriginalMember(owner = "client!y", name = "c", descriptor = "(I)Lclient!db;")
	public Class1_Sub3_Sub1 method467() {
		if (!this.aBoolean129) {
			return null;
		}
		@Pc(9) Class1_Sub3_Sub1[] local9 = new Class1_Sub3_Sub1[13];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 13; local13++) {
			@Pc(20) int local20 = this.anIntArray209[local13];
			if (local20 >= 256 && local20 < 512) {
				local9[local11++] = Class5.aClass5Array1[local20 - 256].method55();
			}
			if (local20 >= 512) {
				@Pc(49) Class1_Sub3_Sub1 local49 = Class39.method471(local20 - 512).method477(this.anInt750);
				if (local49 != null) {
					local9[local11++] = local49;
				}
			}
		}
		if (this.anInt747 != 1) {
			throw new NullPointerException();
		}
		@Pc(75) Class1_Sub3_Sub1 local75 = new Class1_Sub3_Sub1(local11, false, local9);
		for (@Pc(77) int local77 = 0; local77 < 5; local77++) {
			if (this.anIntArray210[local77] != 0) {
				local75.method166(client.anIntArrayArray5[local77][0], client.anIntArrayArray5[local77][this.anIntArray210[local77]]);
				if (local77 == 1) {
					local75.method166(client.anIntArray23[0], client.anIntArray23[this.anIntArray210[local77]]);
				}
			}
		}
		return local75;
	}

	@OriginalMember(owner = "client!y", name = "d", descriptor = "(I)Z")
	public boolean method468() {
		return this.aBoolean129;
	}
}
