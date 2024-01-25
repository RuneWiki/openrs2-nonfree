import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class3_Sub51_Sub1 extends Class3_Sub51 {

	@OriginalMember(owner = "client!wb", name = "Nb", descriptor = "I")
	public int anInt9988;

	@OriginalMember(owner = "client!wb", name = "wb", descriptor = "Z")
	public boolean aBoolean691 = false;

	@OriginalMember(owner = "client!wb", name = "Hb", descriptor = "Z")
	public boolean aBoolean693 = false;

	@OriginalMember(owner = "client!wb", name = "vb", descriptor = "Z")
	public boolean aBoolean690 = false;

	@OriginalMember(owner = "client!wb", name = "Db", descriptor = "Z")
	public boolean aBoolean692 = false;

	@OriginalMember(owner = "client!wb", name = "qb", descriptor = "Z")
	public boolean aBoolean688 = false;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!k;)V")
	public Class3_Sub51_Sub1(@OriginalArg(0) Class168 arg0) {
		super.anInt9950 = 3;
		super.anInt9956 = 3;
		this.method7849(true);
		super.aBoolean671 = true;
		super.aBoolean674 = true;
		super.aBoolean682 = true;
		super.anInt9966 = 2;
		super.anInt9970 = 0;
		super.anInt9948 = 0;
		super.anInt9952 = 127;
		super.aBoolean675 = false;
		super.aBoolean677 = true;
		super.anInt9941 = 0;
		super.anInt9947 = 0;
		super.aBoolean676 = true;
		super.aBoolean673 = true;
		super.aBoolean680 = true;
		super.aBoolean684 = true;
		super.anInt9958 = 127;
		super.anInt9943 = 1;
		super.aBoolean679 = true;
		super.anInt9961 = 0;
		super.aBoolean670 = true;
		super.anInt9949 = 127;
		super.anInt9942 = 127;
		super.anInt9951 = 127;
		if (Static372.anInt6489 >= 96) {
			Static476.method6516(2);
		} else {
			Static476.method6516(0);
		}
		super.aBoolean687 = false;
		super.aBoolean686 = false;
		super.anInt9946 = 0;
		super.anInt9955 = 2;
		super.aBoolean681 = false;
		super.aBoolean672 = true;
		super.anInt9963 = 0;
		super.anInt9953 = 2;
		super.anInt9944 = Static248.anInt4912 == 1 ? 2 : 4;
		super.aBoolean685 = true;
		super.anInt9968 = 0;
		@Pc(150) Class272 local150 = null;
		try {
			@Pc(156) Class309 local156 = arg0.method4080("", true);
			while (local156.anInt8650 == 0) {
				Static373.method5240(1L);
			}
			if (local156.anInt8650 == 1) {
				local150 = (Class272) local156.anObject15;
				@Pc(178) byte[] local178 = new byte[(int) local150.method6176()];
				@Pc(193) int local193;
				for (@Pc(180) int local180 = 0; local180 < local178.length; local180 += local193) {
					local193 = local150.method6177(local180, local178.length - local180, local178);
					if (local193 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method7831(new Class3_Sub26(local178));
			}
		} catch (@Pc(219) Exception local219) {
		}
		try {
			if (local150 != null) {
				local150.method6172();
			}
		} catch (@Pc(226) Exception local226) {
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ie;I)V")
	private void method7831(@OriginalArg(0) Class3_Sub26 arg0) {
		if (arg0.aByteArray213.length - arg0.anInt8703 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method6814();
		if (local21 < 0 || local21 > 22) {
			return;
		}
		@Pc(45) byte local45;
		if (local21 == 22) {
			local45 = 45;
		} else if (local21 == 21) {
			local45 = 44;
		} else if (local21 == 20) {
			local45 = 43;
		} else if (local21 == 19) {
			local45 = 42;
		} else if (local21 == 18) {
			local45 = 41;
		} else if (local21 == 17) {
			local45 = 40;
		} else if (local21 == 16) {
			local45 = 38;
		} else if (local21 == 15) {
			local45 = 37;
		} else if (local21 == 14) {
			local45 = 36;
		} else if (local21 == 13) {
			local45 = 35;
		} else if (local21 == 12) {
			local45 = 34;
		} else if (local21 == 11) {
			local45 = 33;
		} else if (local21 == 10) {
			local45 = 32;
		} else if (local21 == 9) {
			local45 = 31;
		} else if (local21 == 8) {
			local45 = 30;
		} else if (local21 == 7) {
			local45 = 29;
		} else if (local21 == 6) {
			local45 = 28;
		} else if (local21 == 5) {
			local45 = 28;
		} else if (local21 == 4) {
			local45 = 24;
		} else if (local21 == 3) {
			local45 = 23;
		} else if (local21 == 2) {
			local45 = 22;
		} else if (local21 == 1) {
			local45 = 23;
		} else {
			local45 = 19;
		}
		if (arg0.aByteArray213.length - arg0.anInt8703 < local45) {
			return;
		}
		super.anInt9950 = arg0.method6814();
		if (super.anInt9950 < 1) {
			super.anInt9950 = 1;
		} else if (super.anInt9950 > 4) {
			super.anInt9950 = 4;
		}
		this.method7849(arg0.method6814() == 1);
		super.aBoolean671 = arg0.method6814() == 1;
		super.aBoolean682 = arg0.method6814() == 1;
		super.aBoolean679 = arg0.method6814() == 1;
		super.anInt9943 = arg0.method6814() == 1 ? 1 : 0;
		super.aBoolean673 = arg0.method6814() == 1;
		super.aBoolean680 = arg0.method6814() == 1;
		super.aBoolean684 = arg0.method6814() == 1;
		super.anInt9966 = arg0.method6814();
		if (super.anInt9966 > 2) {
			super.anInt9966 = 2;
		}
		if (local21 >= 17) {
			super.anInt9948 = arg0.method6814();
		}
		if (local21 >= 2) {
			super.aBoolean677 = arg0.method6814() == 1;
			if (local21 >= 17) {
				super.aBoolean675 = arg0.method6814() == 1;
			}
		} else {
			super.aBoolean677 = arg0.method6814() == 1;
			arg0.method6814();
		}
		super.aBoolean674 = arg0.method6814() == 1;
		super.aBoolean670 = arg0.method6814() == 1;
		super.anInt9961 = arg0.method6814();
		if (super.anInt9961 > 2) {
			super.anInt9961 = 2;
		}
		super.anInt9941 = super.anInt9961;
		super.aBoolean676 = arg0.method6814() == 1;
		super.anInt9949 = arg0.method6814();
		if (super.anInt9949 > 127) {
			super.anInt9949 = 127;
		}
		if (local21 < 20) {
			super.anInt9958 = super.anInt9949;
		} else {
			super.anInt9958 = arg0.method6814();
			if (super.anInt9958 > 127) {
				super.anInt9958 = 127;
			}
		}
		super.anInt9952 = arg0.method6814();
		super.anInt9942 = arg0.method6814();
		if (super.anInt9942 > 127) {
			super.anInt9942 = 127;
		}
		if (local21 >= 21) {
			super.anInt9951 = arg0.method6814();
			if (super.anInt9951 > 127) {
				super.anInt9951 = 127;
			}
		} else {
			super.anInt9951 = super.anInt9952;
		}
		if (local21 >= 1) {
			super.anInt9970 = arg0.method6811();
			super.anInt9947 = arg0.method6811();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method6814();
		}
		@Pc(570) int local570;
		if (local21 >= 4) {
			local570 = arg0.method6814();
			if (local570 < 0 || local570 > 2) {
				local570 = 0;
			}
			if (Static372.anInt6489 < 96) {
				local570 = 0;
			}
			Static476.method6516(local570);
		}
		if (local21 >= 5) {
			super.anInt9968 = arg0.method6816();
		}
		local570 = 0;
		if (local21 >= 6) {
			super.anInt9953 = local570 = arg0.method6814();
		}
		if (super.anInt9953 != 1 && super.anInt9953 != 2) {
			super.anInt9953 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean687 = arg0.method6814() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean681 = arg0.method6814() == 1;
		}
		if (local21 >= 9) {
			super.anInt9946 = arg0.method6814();
		}
		if (super.anInt9946 < 0 || super.anInt9946 > Static275.method4163(Static372.anInt6489)) {
			super.anInt9946 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean686 = arg0.method6814() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean672 = arg0.method6814() != 0;
		}
		if (local21 >= 12) {
			super.anInt9943 = arg0.method6814();
		}
		if (super.anInt9943 < 0 || super.anInt9943 > 2) {
			super.anInt9943 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean685 = arg0.method6814() == 1;
		}
		if (local21 >= 14) {
			super.anInt9955 = arg0.method6814();
		} else if (local570 == 0) {
			super.anInt9955 = 2;
		} else {
			super.anInt9955 = 1;
		}
		if (super.anInt9955 < 0 || super.anInt9955 > 5) {
			super.anInt9955 = 2;
		}
		if (local21 >= 15) {
			super.anInt9944 = arg0.method6814();
			if (super.anInt9944 < 0 || super.anInt9944 > 4) {
				super.anInt9944 = Static248.anInt4912 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean678 = arg0.method6814() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean678 = false;
				}
			} catch (@Pc(845) Throwable local845) {
			}
		}
		if (local21 < 17 && super.anInt9955 == 0) {
			super.anInt9955 = 2;
		}
		if (local21 >= 18) {
			super.anInt9956 = arg0.method6814();
			if (super.anInt9956 < 0 || super.anInt9956 > 4) {
				super.anInt9956 = 0;
			}
		}
		if (local21 >= 19) {
			super.anInt9963 = arg0.method6814();
		} else if (super.anInt9956 == 1 || super.anInt9956 == 2) {
			super.anInt9963 = 2;
		} else if (super.anInt9956 == 3) {
			super.anInt9963 = 1;
		} else {
			super.anInt9963 = 0;
		}
		if (local21 >= 22) {
			super.anInt9964 = arg0.method6814();
		}
		if (super.anInt9955 == 0 && Static372.anInt6489 < 96 && super.anInt9956 != 1 && super.anInt9956 != 0) {
			this.method7844(false);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)I")
	public int method7833() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static467.aClass168_12.aBoolean334 && !Static467.aClass168_12.aBoolean335) {
			if (Static268.aString130.startsWith("win")) {
				local11 = true;
				if (!Static268.aString129.startsWith("amd64") && !Static268.aString129.startsWith("x86_64")) {
					local7 = true;
				}
				local9 = true;
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean692) {
			local9 = false;
		}
		if (this.aBoolean690) {
			local11 = false;
		}
		if (this.aBoolean693) {
			local7 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method7840();
		}
		@Pc(66) int local66 = -1;
		@Pc(73) int local73 = -1;
		@Pc(75) int local75 = -1;
		if (local7) {
			try {
				local66 = Static188.method3311(2, 1000);
			} catch (@Pc(84) Exception local84) {
			}
		}
		if (local11) {
			try {
				local75 = Static188.method3311(3, 1000);
				if (Static37.anInt1122 == 3) {
					@Pc(98) Class102 local98 = Static319.aClass31_11.method8041();
					@Pc(103) long local103 = local98.aLong68 & 0xFFFFFFFFFFFFL;
					@Pc(106) int local106 = local98.anInt3366;
					if (local106 == 4318) {
						local9 &= local103 >= 64425238954L;
					} else if (local106 == 4098) {
						local9 &= local103 >= 60129613779L;
					}
				}
			} catch (@Pc(142) Exception local142) {
			}
		}
		if (local9) {
			try {
				local73 = Static188.method3311(1, 1000);
			} catch (@Pc(152) Exception local152) {
			}
		}
		if (local66 == -1 && local73 == -1 && local75 == -1) {
			return this.method7840();
		}
		local75 = (int) ((float) local75 * 1.1F);
		local73 = (int) ((float) local73 * 1.1F);
		if (local75 < local66 && local73 < local66) {
			return this.method7839(local66);
		} else if (local75 > local73) {
			return this.method7846(3, local75);
		} else {
			return this.method7846(1, local73);
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)I")
	public int method7834(@OriginalArg(1) int arg0) {
		if (Static489.method7309(arg0) && !Static39.method1075(Static409.anInt1461)) {
			return Static372.anInt6489 < 96 && Static461.method6346(arg0) && super.anInt9963 == 0 ? 1 : super.anInt9963;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public void method7835() {
		this.method7849(true);
		super.aBoolean678 = true;
		super.aBoolean677 = true;
		super.anInt9966 = super.anInt9948 = 2;
		super.aBoolean684 = true;
		super.aBoolean673 = true;
		super.aBoolean679 = true;
		super.anInt9943 = 1;
		super.anInt9961 = super.anInt9941 = 0;
		super.aBoolean674 = true;
		super.aBoolean680 = true;
		super.aBoolean682 = true;
		super.aBoolean675 = true;
		super.aBoolean670 = true;
		super.aBoolean671 = true;
		if (Static372.anInt6489 <= 95) {
			Static476.method6516(0);
		} else {
			Static476.method6516(2);
		}
		super.aBoolean686 = false;
		super.aBoolean685 = true;
		super.anInt9946 = 0;
		this.method7838();
		this.method7845(0);
		super.anInt9956 = 4;
		Static564.method7698();
		Static38.method1056();
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	public void method7836() {
		this.method7849(true);
		super.aBoolean671 = true;
		super.anInt9943 = 1;
		super.anInt9966 = super.anInt9948 = 1;
		super.aBoolean684 = true;
		super.anInt9961 = super.anInt9941 = 0;
		super.aBoolean674 = false;
		super.aBoolean673 = true;
		super.aBoolean682 = true;
		super.aBoolean675 = false;
		super.aBoolean677 = true;
		super.aBoolean670 = true;
		super.aBoolean680 = true;
		super.aBoolean678 = true;
		super.aBoolean679 = true;
		if (Static372.anInt6489 > 95) {
			Static476.method6516(1);
		} else {
			Static476.method6516(0);
		}
		super.aBoolean685 = true;
		super.aBoolean686 = false;
		super.anInt9946 = 0;
		this.method7838();
		this.method7845(1);
		super.anInt9956 = 3;
		Static564.method7698();
		Static38.method1056();
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)Z")
	public boolean method7837(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean691 ? super.aBoolean683 : true;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(B)V")
	private void method7838() {
		if (Static248.anInt4912 > 1) {
			super.anInt9944 = 4;
		} else {
			super.anInt9944 = 2;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)I")
	private int method7839(@OriginalArg(0) int arg0) {
		@Pc(15) byte local15;
		if (arg0 > 12000) {
			this.method7835();
			local15 = 4;
		} else if (arg0 > 5000) {
			local15 = 3;
			this.method7836();
		} else if (arg0 > 2000) {
			local15 = 2;
			this.method7847();
		} else {
			local15 = 1;
			this.method7844(true);
		}
		if (Static37.anInt1122 != 2) {
			super.anInt9955 = 2;
			Static47.method1180(2);
		}
		this.method7842(Static467.aClass168_12);
		return local15;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)I")
	private int method7840() {
		@Pc(16) byte local16;
		if (Static372.anInt6489 < 96) {
			this.method7844(true);
			local16 = 1;
		} else {
			@Pc(21) int local21 = Static489.method7303();
			if (local21 <= 100) {
				local16 = 4;
				this.method7835();
			} else if (local21 <= 500) {
				local16 = 3;
				this.method7836();
			} else if (local21 <= 1000) {
				this.method7847();
				local16 = 2;
			} else {
				local16 = 1;
				this.method7844(true);
			}
		}
		if (Static37.anInt1122 != 0) {
			super.anInt9955 = 0;
			Static47.method1180(0);
		}
		this.method7842(Static467.aClass168_12);
		return local16;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLclient!k;)V")
	public void method7842(@OriginalArg(1) Class168 arg0) {
		@Pc(7) Class272 local7 = null;
		try {
			@Pc(17) Class309 local17 = arg0.method4080("", true);
			while (local17.anInt8650 == 0) {
				Static373.method5240(1L);
			}
			if (local17.anInt8650 == 1) {
				local7 = (Class272) local17.anObject15;
				@Pc(44) Class3_Sub26 local44 = new Class3_Sub26(Static271.method4112());
				this.method7827(local44);
				local7.method6170(local44.aByteArray213, 0, local44.anInt8703);
			}
		} catch (@Pc(58) Exception local58) {
		}
		try {
			if (local7 != null) {
				local7.method6172();
			}
		} catch (@Pc(65) Exception local65) {
		}
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)I")
	public int method7843(@OriginalArg(0) int arg0) {
		if (this.aBoolean688) {
			return 0;
		} else if (this.method7837(arg0)) {
			return super.aBoolean671 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(ZI)V")
	public void method7844(@OriginalArg(0) boolean arg0) {
		this.method7849(false);
		super.aBoolean671 = false;
		super.aBoolean682 = !Static31.aClass89_1.equals(Static70.aClass89_3);
		super.anInt9961 = super.anInt9941 = 0;
		super.aBoolean674 = false;
		super.aBoolean673 = false;
		super.aBoolean675 = false;
		super.anInt9943 = 0;
		super.aBoolean684 = false;
		super.aBoolean677 = false;
		super.aBoolean680 = false;
		super.aBoolean678 = false;
		super.aBoolean670 = false;
		super.anInt9966 = super.anInt9948 = 0;
		super.aBoolean679 = false;
		Static476.method6516(0);
		super.aBoolean685 = false;
		super.aBoolean686 = false;
		super.anInt9946 = 0;
		this.method7838();
		this.method7845(2);
		super.anInt9956 = 1;
		if (arg0) {
			Static564.method7698();
		}
		Static38.method1056();
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(II)V")
	public void method7845(@OriginalArg(1) int arg0) {
		Static384.aClass136Array1 = null;
		Static251.aBoolean447 = true;
		super.anInt9963 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)I")
	private int method7846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) byte local20;
		if (arg1 > 20000) {
			local20 = 4;
			this.method7835();
		} else if (arg1 > 10000) {
			this.method7836();
			local20 = 3;
		} else if (arg1 > 5000) {
			this.method7847();
			local20 = 2;
		} else {
			local20 = 1;
			this.method7844(true);
		}
		if (Static37.anInt1122 != arg0) {
			super.anInt9955 = arg0;
			Static47.method1180(arg0);
		}
		this.method7842(Static467.aClass168_12);
		return local20;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
	public void method7847() {
		this.method7849(true);
		super.aBoolean670 = false;
		super.aBoolean671 = false;
		super.anInt9966 = super.anInt9948 = 0;
		super.aBoolean677 = false;
		super.aBoolean674 = false;
		super.aBoolean680 = false;
		super.aBoolean684 = false;
		super.aBoolean679 = false;
		super.aBoolean675 = false;
		super.anInt9961 = super.anInt9941 = 0;
		super.anInt9943 = 0;
		super.aBoolean678 = false;
		super.aBoolean682 = true;
		super.aBoolean673 = false;
		Static476.method6516(0);
		super.aBoolean685 = true;
		super.anInt9946 = 0;
		super.aBoolean686 = false;
		this.method7838();
		this.method7845(2);
		super.anInt9956 = 2;
		Static564.method7698();
		Static38.method1056();
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(II)Z")
	public boolean method7848(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean683 : true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BZ)V")
	public void method7849(@OriginalArg(1) boolean arg0) {
		super.aBoolean683 = arg0;
		if (Static536.aClass146_4 != null) {
			Static536.aClass146_4.method3722(!this.method7837(Static37.anInt1122));
		}
	}
}
