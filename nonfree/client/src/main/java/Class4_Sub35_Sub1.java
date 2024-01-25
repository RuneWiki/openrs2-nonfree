import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class4_Sub35_Sub1 extends Class4_Sub35 {

	@OriginalMember(owner = "client!ut", name = "wb", descriptor = "I")
	public int anInt9948;

	@OriginalMember(owner = "client!ut", name = "rb", descriptor = "Z")
	public boolean aBoolean685 = false;

	@OriginalMember(owner = "client!ut", name = "tb", descriptor = "Z")
	public boolean aBoolean686 = false;

	@OriginalMember(owner = "client!ut", name = "Eb", descriptor = "Z")
	public boolean aBoolean688 = false;

	@OriginalMember(owner = "client!ut", name = "xb", descriptor = "Z")
	public boolean aBoolean687 = false;

	@OriginalMember(owner = "client!ut", name = "Ib", descriptor = "Z")
	public boolean aBoolean689 = false;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!wv;)V")
	public Class4_Sub35_Sub1(@OriginalArg(0) Class366 arg0) {
		super.anInt9913 = 3;
		super.anInt9934 = 3;
		this.method7624(true);
		super.anInt9919 = 0;
		super.anInt9928 = 0;
		super.anInt9920 = 2;
		super.anInt9926 = 127;
		super.anInt9927 = 127;
		super.aBoolean676 = true;
		super.aBoolean667 = true;
		super.aBoolean677 = true;
		super.aBoolean678 = false;
		super.aBoolean680 = true;
		super.anInt9914 = 0;
		super.anInt9930 = 127;
		super.anInt9916 = 127;
		super.aBoolean673 = true;
		super.aBoolean683 = true;
		super.anInt9912 = 0;
		super.anInt9929 = 127;
		super.aBoolean671 = true;
		super.anInt9932 = 0;
		super.anInt9931 = 1;
		super.aBoolean668 = true;
		super.aBoolean681 = true;
		super.aBoolean684 = true;
		if (Static503.anInt9410 < 96) {
			Static446.method6580(0);
		} else {
			Static446.method6580(2);
		}
		super.anInt9923 = 0;
		super.anInt9935 = 0;
		super.anInt9938 = Static22.anInt9830 == 1 ? 2 : 4;
		super.aBoolean670 = true;
		super.aBoolean679 = true;
		super.anInt9917 = 2;
		super.aBoolean674 = false;
		super.anInt9933 = 2;
		super.aBoolean669 = false;
		super.aBoolean672 = false;
		super.anInt9915 = 0;
		@Pc(150) Class354 local150 = null;
		try {
			@Pc(156) Class316 local156 = arg0.method8266("", true);
			while (local156.anInt9478 == 0) {
				Static214.method3478(1L);
			}
			if (local156.anInt9478 == 1) {
				local150 = (Class354) local156.anObject136;
				@Pc(183) byte[] local183 = new byte[(int) local150.method8081()];
				@Pc(197) int local197;
				for (@Pc(185) int local185 = 0; local185 < local183.length; local185 += local197) {
					local197 = local150.method8083(local183.length - local185, local183, local185);
					if (local197 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method7627(new Class4_Sub13(local183));
			}
		} catch (@Pc(226) Exception local226) {
		}
		try {
			if (local150 != null) {
				local150.method8089();
			}
		} catch (@Pc(233) Exception local233) {
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
	public void method7620() {
		this.method7624(true);
		super.anInt9931 = 1;
		super.aBoolean675 = true;
		super.anInt9920 = super.anInt9932 = 2;
		super.aBoolean684 = true;
		super.aBoolean680 = true;
		super.aBoolean677 = true;
		super.anInt9928 = super.anInt9914 = 0;
		super.aBoolean676 = true;
		super.aBoolean683 = true;
		super.aBoolean673 = true;
		super.aBoolean678 = true;
		super.aBoolean671 = true;
		super.aBoolean681 = true;
		super.aBoolean667 = true;
		if (Static503.anInt9410 <= 95) {
			Static446.method6580(0);
		} else {
			Static446.method6580(2);
		}
		super.anInt9923 = 0;
		super.aBoolean669 = false;
		super.aBoolean670 = true;
		this.method7622();
		this.method7630(0);
		super.anInt9934 = 4;
		Static303.method4804();
		Static41.method1090();
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(IZ)Z")
	public boolean method7621(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean688 ? super.aBoolean682 : true;
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V")
	private void method7622() {
		if (Static22.anInt9830 <= 1) {
			super.anInt9938 = 2;
		} else {
			super.anInt9938 = 4;
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(II)I")
	public int method7623(@OriginalArg(0) int arg0) {
		if (this.aBoolean685) {
			return 0;
		} else if (this.method7621(arg0)) {
			return super.aBoolean671 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZI)V")
	public void method7624(@OriginalArg(0) boolean arg0) {
		super.aBoolean682 = arg0;
		if (Static103.aClass298_1 != null) {
			Static103.aClass298_1.method6817(!this.method7621(Static453.anInt8614));
		}
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)I")
	private int method7625() {
		@Pc(36) byte local36;
		if (Static503.anInt9410 >= 96) {
			@Pc(21) int local21 = Static500.method7214();
			if (local21 <= 100) {
				this.method7620();
				local36 = 4;
			} else if (local21 <= 500) {
				local36 = 3;
				this.method7637();
			} else if (local21 <= 1000) {
				local36 = 2;
				this.method7633();
			} else {
				this.method7636(true);
				local36 = 1;
			}
		} else {
			local36 = 1;
			this.method7636(true);
		}
		if (Static453.anInt8614 != 0) {
			super.anInt9933 = 0;
			Static146.method2531(0);
		}
		this.method7631(Static372.aClass366_5);
		return local36;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!ek;)V")
	private void method7627(@OriginalArg(1) Class4_Sub13 arg0) {
		if (arg0.aByteArray88.length - arg0.anInt9170 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method7004();
		if (local19 < 0 || local19 > 22) {
			return;
		}
		@Pc(35) byte local35;
		if (local19 == 22) {
			local35 = 45;
		} else if (local19 == 21) {
			local35 = 44;
		} else if (local19 == 20) {
			local35 = 43;
		} else if (local19 == 19) {
			local35 = 42;
		} else if (local19 == 18) {
			local35 = 41;
		} else if (local19 == 17) {
			local35 = 40;
		} else if (local19 == 16) {
			local35 = 38;
		} else if (local19 == 15) {
			local35 = 37;
		} else if (local19 == 14) {
			local35 = 36;
		} else if (local19 == 13) {
			local35 = 35;
		} else if (local19 == 12) {
			local35 = 34;
		} else if (local19 == 11) {
			local35 = 33;
		} else if (local19 == 10) {
			local35 = 32;
		} else if (local19 == 9) {
			local35 = 31;
		} else if (local19 == 8) {
			local35 = 30;
		} else if (local19 == 7) {
			local35 = 29;
		} else if (local19 == 6) {
			local35 = 28;
		} else if (local19 == 5) {
			local35 = 28;
		} else if (local19 == 4) {
			local35 = 24;
		} else if (local19 == 3) {
			local35 = 23;
		} else if (local19 == 2) {
			local35 = 22;
		} else if (local19 == 1) {
			local35 = 23;
		} else {
			local35 = 19;
		}
		if (arg0.aByteArray88.length - arg0.anInt9170 < local35) {
			return;
		}
		super.anInt9913 = arg0.method7004();
		if (super.anInt9913 < 1) {
			super.anInt9913 = 1;
		} else if (super.anInt9913 > 4) {
			super.anInt9913 = 4;
		}
		this.method7624(arg0.method7004() == 1);
		super.aBoolean671 = arg0.method7004() == 1;
		super.aBoolean667 = arg0.method7004() == 1;
		super.aBoolean676 = arg0.method7004() == 1;
		super.anInt9931 = arg0.method7004() == 1 ? 1 : 0;
		super.aBoolean683 = arg0.method7004() == 1;
		super.aBoolean680 = arg0.method7004() == 1;
		super.aBoolean684 = arg0.method7004() == 1;
		super.anInt9920 = arg0.method7004();
		if (super.anInt9920 > 2) {
			super.anInt9920 = 2;
		}
		if (local19 >= 17) {
			super.anInt9932 = arg0.method7004();
		}
		if (local19 >= 2) {
			super.aBoolean681 = arg0.method7004() == 1;
			if (local19 >= 17) {
				super.aBoolean678 = arg0.method7004() == 1;
			}
		} else {
			super.aBoolean681 = arg0.method7004() == 1;
			arg0.method7004();
		}
		super.aBoolean677 = arg0.method7004() == 1;
		super.aBoolean673 = arg0.method7004() == 1;
		super.anInt9928 = arg0.method7004();
		if (super.anInt9928 > 2) {
			super.anInt9928 = 2;
		}
		super.anInt9914 = super.anInt9928;
		super.aBoolean668 = arg0.method7004() == 1;
		super.anInt9916 = arg0.method7004();
		if (super.anInt9916 > 127) {
			super.anInt9916 = 127;
		}
		if (local19 < 20) {
			super.anInt9930 = super.anInt9916;
		} else {
			super.anInt9930 = arg0.method7004();
			if (super.anInt9930 > 127) {
				super.anInt9930 = 127;
			}
		}
		super.anInt9926 = arg0.method7004();
		super.anInt9929 = arg0.method7004();
		if (super.anInt9929 > 127) {
			super.anInt9929 = 127;
		}
		if (local19 >= 21) {
			super.anInt9927 = arg0.method7004();
			if (super.anInt9927 > 127) {
				super.anInt9927 = 127;
			}
		} else {
			super.anInt9927 = super.anInt9926;
		}
		if (local19 >= 1) {
			super.anInt9919 = arg0.method7054();
			super.anInt9912 = arg0.method7054();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method7004();
		}
		@Pc(563) int local563;
		if (local19 >= 4) {
			local563 = arg0.method7004();
			if (local563 < 0 || local563 > 2) {
				local563 = 0;
			}
			if (Static503.anInt9410 < 96) {
				local563 = 0;
			}
			Static446.method6580(local563);
		}
		if (local19 >= 5) {
			super.anInt9915 = arg0.method6990();
		}
		local563 = 0;
		if (local19 >= 6) {
			super.anInt9917 = local563 = arg0.method7004();
		}
		if (super.anInt9917 != 1 && super.anInt9917 != 2) {
			super.anInt9917 = 2;
		}
		if (local19 >= 7) {
			super.aBoolean672 = arg0.method7004() == 1;
		}
		if (local19 >= 8) {
			super.aBoolean674 = arg0.method7004() == 1;
		}
		if (local19 >= 9) {
			super.anInt9923 = arg0.method7004();
		}
		if (super.anInt9923 < 0 || super.anInt9923 > Static488.method7097(Static503.anInt9410)) {
			super.anInt9923 = 0;
		}
		if (local19 >= 10) {
			super.aBoolean669 = arg0.method7004() != 0;
		}
		if (local19 >= 11) {
			super.aBoolean679 = arg0.method7004() != 0;
		}
		if (local19 >= 12) {
			super.anInt9931 = arg0.method7004();
		}
		if (super.anInt9931 < 0 || super.anInt9931 > 2) {
			super.anInt9931 = 1;
		}
		if (local19 >= 13) {
			super.aBoolean670 = arg0.method7004() == 1;
		}
		if (local19 >= 14) {
			super.anInt9933 = arg0.method7004();
		} else if (local563 == 0) {
			super.anInt9933 = 2;
		} else {
			super.anInt9933 = 1;
		}
		if (super.anInt9933 < 0 || super.anInt9933 > 5) {
			super.anInt9933 = 2;
		}
		if (local19 >= 15) {
			super.anInt9938 = arg0.method7004();
			if (super.anInt9938 < 0 || super.anInt9938 > 4) {
				super.anInt9938 = Static22.anInt9830 == 1 ? 2 : 4;
			}
		}
		if (local19 >= 16) {
			super.aBoolean675 = arg0.method7004() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean675 = false;
				}
			} catch (@Pc(837) Throwable local837) {
			}
		}
		if (local19 < 17 && super.anInt9933 == 0) {
			super.anInt9933 = 2;
		}
		if (local19 >= 18) {
			super.anInt9934 = arg0.method7004();
			if (super.anInt9934 < 0 || super.anInt9934 > 4) {
				super.anInt9934 = 0;
			}
		}
		if (local19 >= 19) {
			super.anInt9935 = arg0.method7004();
		} else if (super.anInt9934 == 1 || super.anInt9934 == 2) {
			super.anInt9935 = 2;
		} else if (super.anInt9934 == 3) {
			super.anInt9935 = 1;
		} else {
			super.anInt9935 = 0;
		}
		if (local19 >= 22) {
			super.anInt9918 = arg0.method7004();
		}
		if (super.anInt9933 == 0 && Static503.anInt9410 < 96 && super.anInt9934 != 1 && super.anInt9934 != 0) {
			this.method7636(false);
		}
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(II)I")
	private int method7628(@OriginalArg(1) int arg0) {
		@Pc(15) byte local15;
		if (arg0 > 12000) {
			this.method7620();
			local15 = 4;
		} else if (arg0 > 5000) {
			this.method7637();
			local15 = 3;
		} else if (arg0 <= 2000) {
			this.method7636(true);
			local15 = 1;
		} else {
			local15 = 2;
			this.method7633();
		}
		if (Static453.anInt8614 != 2) {
			super.anInt9933 = 2;
			Static146.method2531(2);
		}
		this.method7631(Static372.aClass366_5);
		return local15;
	}

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "(II)Z")
	public boolean method7629(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean682 : true;
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(BI)V")
	public void method7630(@OriginalArg(1) int arg0) {
		Static555.aBoolean697 = true;
		super.anInt9935 = arg0;
		Static271.aClass77Array1 = null;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZLclient!wv;)V")
	public void method7631(@OriginalArg(1) Class366 arg0) {
		@Pc(7) Class354 local7 = null;
		try {
			@Pc(13) Class316 local13 = arg0.method8266("", true);
			while (local13.anInt9478 == 0) {
				Static214.method3478(1L);
			}
			if (local13.anInt9478 == 1) {
				local7 = (Class354) local13.anObject136;
				@Pc(40) Class4_Sub13 local40 = new Class4_Sub13(Static239.method3894());
				this.method7612(local40);
				local7.method8086(local40.aByteArray88, local40.anInt9170, 0);
			}
		} catch (@Pc(54) Exception local54) {
		}
		try {
			if (local7 != null) {
				local7.method8089();
			}
		} catch (@Pc(65) Exception local65) {
		}
	}

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "(II)I")
	public int method7632(@OriginalArg(1) int arg0) {
		if (Static106.method1997(arg0) && !Static330.method5076(Static9.anInt758)) {
			return Static503.anInt9410 < 96 && Static445.method6557(arg0) && super.anInt9935 == 0 ? 1 : super.anInt9935;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)V")
	public void method7633() {
		this.method7624(true);
		super.anInt9931 = 0;
		super.aBoolean684 = false;
		super.aBoolean673 = false;
		super.aBoolean676 = false;
		super.aBoolean675 = false;
		super.anInt9920 = super.anInt9932 = 0;
		super.aBoolean677 = false;
		super.aBoolean667 = true;
		super.anInt9928 = super.anInt9914 = 0;
		super.aBoolean683 = false;
		super.aBoolean680 = false;
		super.aBoolean681 = false;
		super.aBoolean671 = false;
		super.aBoolean678 = false;
		Static446.method6580(0);
		super.anInt9923 = 0;
		super.aBoolean670 = true;
		super.aBoolean669 = false;
		this.method7622();
		this.method7630(2);
		super.anInt9934 = 2;
		Static303.method4804();
		Static41.method1090();
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(III)I")
	private int method7634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(26) byte local26;
		if (arg0 > 20000) {
			this.method7620();
			local26 = 4;
		} else if (arg0 > 10000) {
			local26 = 3;
			this.method7637();
		} else if (arg0 > 5000) {
			this.method7633();
			local26 = 2;
		} else {
			this.method7636(true);
			local26 = 1;
		}
		if (Static453.anInt8614 != arg1) {
			super.anInt9933 = arg1;
			Static146.method2531(arg1);
		}
		this.method7631(Static372.aClass366_5);
		return local26;
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(IZ)V")
	public void method7636(@OriginalArg(1) boolean arg0) {
		this.method7624(false);
		super.aBoolean671 = false;
		super.aBoolean667 = !Static162.aClass128_1.equals(Static592.aClass128_4);
		super.aBoolean681 = false;
		super.anInt9928 = super.anInt9914 = 0;
		super.aBoolean675 = false;
		super.aBoolean684 = false;
		super.anInt9920 = super.anInt9932 = 0;
		super.aBoolean678 = false;
		super.aBoolean676 = false;
		super.aBoolean673 = false;
		super.aBoolean677 = false;
		super.aBoolean680 = false;
		super.aBoolean683 = false;
		super.anInt9931 = 0;
		Static446.method6580(0);
		super.anInt9923 = 0;
		super.aBoolean670 = false;
		super.aBoolean669 = false;
		this.method7622();
		this.method7630(2);
		super.anInt9934 = 1;
		if (arg0) {
			Static303.method4804();
		}
		Static41.method1090();
	}

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)V")
	public void method7637() {
		this.method7624(true);
		super.anInt9931 = 1;
		super.aBoolean681 = true;
		super.aBoolean677 = false;
		super.aBoolean671 = true;
		super.aBoolean667 = true;
		super.aBoolean676 = true;
		super.anInt9928 = super.anInt9914 = 0;
		super.aBoolean675 = true;
		super.aBoolean678 = false;
		super.aBoolean673 = true;
		super.aBoolean684 = true;
		super.aBoolean680 = true;
		super.aBoolean683 = true;
		super.anInt9920 = super.anInt9932 = 1;
		if (Static503.anInt9410 <= 95) {
			Static446.method6580(0);
		} else {
			Static446.method6580(1);
		}
		super.aBoolean669 = false;
		super.aBoolean670 = true;
		super.anInt9923 = 0;
		this.method7622();
		this.method7630(1);
		super.anInt9934 = 3;
		Static303.method4804();
		Static41.method1090();
	}

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "(B)I")
	public int method7638() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static372.aClass366_5.aBoolean719 && !Static372.aClass366_5.aBoolean720) {
			if (Static594.aString238.startsWith("win")) {
				if (!Static594.aString241.startsWith("amd64") && !Static594.aString241.startsWith("x86_64")) {
					local7 = true;
				}
				local9 = true;
				local11 = true;
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean687) {
			local9 = false;
		}
		if (this.aBoolean689) {
			local11 = false;
		}
		if (this.aBoolean686) {
			local7 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method7625();
		}
		@Pc(66) int local66 = -1;
		@Pc(68) int local68 = -1;
		if (local7) {
			try {
				local66 = Static371.method5562(1000, 2);
			} catch (@Pc(77) Exception local77) {
			}
		}
		@Pc(80) int local80 = -1;
		if (local11) {
			try {
				local80 = Static371.method5562(1000, 3);
				if (Static453.anInt8614 == 3) {
					@Pc(95) Class308 local95 = Static39.aClass7_2.method7815();
					@Pc(100) long local100 = local95.aLong257 & 0xFFFFFFFFFFFFL;
					@Pc(103) int local103 = local95.anInt9288;
					if (local103 == 4318) {
						local9 &= local100 >= 64425238954L;
					} else if (local103 == 4098) {
						local9 &= local100 >= 60129613779L;
					}
				}
			} catch (@Pc(139) Exception local139) {
			}
		}
		if (local9) {
			try {
				local68 = Static371.method5562(1000, 1);
			} catch (@Pc(149) Exception local149) {
			}
		}
		if (local66 == -1 && local68 == -1 && local80 == -1) {
			return this.method7625();
		}
		local68 = (int) ((float) local68 * 1.1F);
		local80 = (int) ((float) local80 * 1.1F);
		if (local80 < local66 && local66 > local68) {
			return this.method7628(local66);
		} else if (local80 > local68) {
			return this.method7634(local80, 3);
		} else {
			return this.method7634(local68, 1);
		}
	}
}
