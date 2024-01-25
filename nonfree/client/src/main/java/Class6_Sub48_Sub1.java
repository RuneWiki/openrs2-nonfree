import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class6_Sub48_Sub1 extends Class6_Sub48 {

	@OriginalMember(owner = "client!ur", name = "yb", descriptor = "I")
	public int anInt9029;

	@OriginalMember(owner = "client!ur", name = "nb", descriptor = "Z")
	public boolean aBoolean694 = false;

	@OriginalMember(owner = "client!ur", name = "mb", descriptor = "Z")
	public boolean aBoolean693 = false;

	@OriginalMember(owner = "client!ur", name = "wb", descriptor = "Z")
	public boolean aBoolean696 = false;

	@OriginalMember(owner = "client!ur", name = "xb", descriptor = "Z")
	public boolean aBoolean697 = false;

	@OriginalMember(owner = "client!ur", name = "vb", descriptor = "Z")
	public boolean aBoolean695 = false;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!qj;)V")
	public Class6_Sub48_Sub1(@OriginalArg(0) Class272 arg0) {
		super.anInt8995 = 3;
		super.anInt9009 = 3;
		this.method7380(true);
		super.anInt8993 = 127;
		super.aBoolean680 = true;
		super.anInt9010 = 1;
		super.anInt8998 = 0;
		super.aBoolean681 = true;
		super.anInt9006 = 0;
		super.anInt8989 = 0;
		super.anInt8997 = 127;
		super.aBoolean679 = true;
		super.aBoolean685 = true;
		super.anInt9007 = 2;
		super.anInt8991 = 127;
		super.aBoolean689 = true;
		super.aBoolean674 = true;
		super.anInt8994 = 0;
		super.aBoolean675 = true;
		super.anInt9005 = 127;
		super.aBoolean691 = true;
		super.anInt9013 = 0;
		super.aBoolean683 = false;
		super.anInt9004 = 127;
		super.aBoolean687 = true;
		super.aBoolean684 = true;
		if (Static11.anInt321 < 96) {
			Static474.method7123(0);
		} else {
			Static474.method7123(2);
		}
		super.aBoolean678 = false;
		super.aBoolean677 = true;
		super.aBoolean690 = true;
		super.aBoolean686 = false;
		super.anInt9003 = 2;
		super.aBoolean682 = false;
		super.anInt8992 = 0;
		super.anInt9002 = 0;
		super.anInt8988 = Static380.anInt6689 == 1 ? 2 : 4;
		super.anInt9008 = 0;
		super.anInt8996 = 2;
		@Pc(150) Class31 local150 = null;
		try {
			@Pc(156) Class331 local156 = arg0.method6125(true, "");
			while (local156.anInt8818 == 0) {
				Static318.method4952(1L);
			}
			if (local156.anInt8818 == 1) {
				local150 = (Class31) local156.anObject18;
				@Pc(180) byte[] local180 = new byte[(int) local150.method1003()];
				@Pc(195) int local195;
				for (@Pc(182) int local182 = 0; local182 < local180.length; local182 += local195) {
					local195 = local150.method1004(local182, local180, local180.length - local182);
					if (local195 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method7376(new Class6_Sub21(local180));
			}
		} catch (@Pc(224) Exception local224) {
		}
		try {
			if (local150 != null) {
				local150.method1007();
			}
		} catch (@Pc(231) Exception local231) {
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(Lclient!ji;B)V")
	private void method7376(@OriginalArg(0) Class6_Sub21 arg0) {
		if (arg0.aByteArray93.length - arg0.anInt7338 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method6069();
		if (local20 < 0 || local20 > 22) {
			return;
		}
		@Pc(47) byte local47;
		if (local20 == 22) {
			local47 = 45;
		} else if (local20 == 21) {
			local47 = 44;
		} else if (local20 == 20) {
			local47 = 43;
		} else if (local20 == 19) {
			local47 = 42;
		} else if (local20 == 18) {
			local47 = 41;
		} else if (local20 == 17) {
			local47 = 40;
		} else if (local20 == 16) {
			local47 = 38;
		} else if (local20 == 15) {
			local47 = 37;
		} else if (local20 == 14) {
			local47 = 36;
		} else if (local20 == 13) {
			local47 = 35;
		} else if (local20 == 12) {
			local47 = 34;
		} else if (local20 == 11) {
			local47 = 33;
		} else if (local20 == 10) {
			local47 = 32;
		} else if (local20 == 9) {
			local47 = 31;
		} else if (local20 == 8) {
			local47 = 30;
		} else if (local20 == 7) {
			local47 = 29;
		} else if (local20 == 6) {
			local47 = 28;
		} else if (local20 == 5) {
			local47 = 28;
		} else if (local20 == 4) {
			local47 = 24;
		} else if (local20 == 3) {
			local47 = 23;
		} else if (local20 == 2) {
			local47 = 22;
		} else if (local20 == 1) {
			local47 = 23;
		} else {
			local47 = 19;
		}
		if (arg0.aByteArray93.length - arg0.anInt7338 < local47) {
			return;
		}
		super.anInt9009 = arg0.method6069();
		if (super.anInt9009 < 1) {
			super.anInt9009 = 1;
		} else if (super.anInt9009 > 4) {
			super.anInt9009 = 4;
		}
		this.method7380(arg0.method6069() == 1);
		super.aBoolean689 = arg0.method6069() == 1;
		super.aBoolean674 = arg0.method6069() == 1;
		super.aBoolean691 = arg0.method6069() == 1;
		super.anInt9010 = arg0.method6069() == 1 ? 1 : 0;
		super.aBoolean680 = arg0.method6069() == 1;
		super.aBoolean684 = arg0.method6069() == 1;
		super.aBoolean685 = arg0.method6069() == 1;
		super.anInt9007 = arg0.method6069();
		if (super.anInt9007 > 2) {
			super.anInt9007 = 2;
		}
		if (local20 >= 17) {
			super.anInt8994 = arg0.method6069();
		}
		if (local20 >= 2) {
			super.aBoolean675 = arg0.method6069() == 1;
			if (local20 >= 17) {
				super.aBoolean683 = arg0.method6069() == 1;
			}
		} else {
			super.aBoolean675 = arg0.method6069() == 1;
			arg0.method6069();
		}
		super.aBoolean679 = arg0.method6069() == 1;
		super.aBoolean681 = arg0.method6069() == 1;
		super.anInt8989 = arg0.method6069();
		if (super.anInt8989 > 2) {
			super.anInt8989 = 2;
		}
		super.anInt9013 = super.anInt8989;
		super.aBoolean687 = arg0.method6069() == 1;
		super.anInt8997 = arg0.method6069();
		if (super.anInt8997 > 127) {
			super.anInt8997 = 127;
		}
		if (local20 >= 20) {
			super.anInt8991 = arg0.method6069();
			if (super.anInt8991 > 127) {
				super.anInt8991 = 127;
			}
		} else {
			super.anInt8991 = super.anInt8997;
		}
		super.anInt8993 = arg0.method6069();
		super.anInt9004 = arg0.method6069();
		if (super.anInt9004 > 127) {
			super.anInt9004 = 127;
		}
		if (local20 < 21) {
			super.anInt9005 = super.anInt8993;
		} else {
			super.anInt9005 = arg0.method6069();
			if (super.anInt9005 > 127) {
				super.anInt9005 = 127;
			}
		}
		if (local20 >= 1) {
			super.anInt9006 = arg0.method6003();
			super.anInt8998 = arg0.method6003();
		}
		if (local20 >= 3 && local20 < 6) {
			arg0.method6069();
		}
		@Pc(570) int local570;
		if (local20 >= 4) {
			local570 = arg0.method6069();
			if (local570 < 0 || local570 > 2) {
				local570 = 0;
			}
			if (Static11.anInt321 < 96) {
				local570 = 0;
			}
			Static474.method7123(local570);
		}
		if (local20 >= 5) {
			super.anInt9008 = arg0.method6036();
		}
		local570 = 0;
		if (local20 >= 6) {
			super.anInt9003 = local570 = arg0.method6069();
		}
		if (super.anInt9003 != 1 && super.anInt9003 != 2) {
			super.anInt9003 = 2;
		}
		if (local20 >= 7) {
			super.aBoolean686 = arg0.method6069() == 1;
		}
		if (local20 >= 8) {
			super.aBoolean678 = arg0.method6069() == 1;
		}
		if (local20 >= 9) {
			super.anInt9002 = arg0.method6069();
		}
		if (super.anInt9002 < 0 || super.anInt9002 > Static245.method4243(Static11.anInt321)) {
			super.anInt9002 = 0;
		}
		if (local20 >= 10) {
			super.aBoolean682 = arg0.method6069() != 0;
		}
		if (local20 >= 11) {
			super.aBoolean677 = arg0.method6069() != 0;
		}
		if (local20 >= 12) {
			super.anInt9010 = arg0.method6069();
		}
		if (super.anInt9010 < 0 || super.anInt9010 > 2) {
			super.anInt9010 = 1;
		}
		if (local20 >= 13) {
			super.aBoolean690 = arg0.method6069() == 1;
		}
		if (local20 >= 14) {
			super.anInt8996 = arg0.method6069();
		} else if (local570 == 0) {
			super.anInt8996 = 2;
		} else {
			super.anInt8996 = 1;
		}
		if (super.anInt8996 < 0 || super.anInt8996 > 5) {
			super.anInt8996 = 2;
		}
		if (local20 >= 15) {
			super.anInt8988 = arg0.method6069();
			if (super.anInt8988 < 0 || super.anInt8988 > 4) {
				super.anInt8988 = Static380.anInt6689 == 1 ? 2 : 4;
			}
		}
		if (local20 >= 16) {
			super.aBoolean676 = arg0.method6069() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean676 = false;
				}
			} catch (@Pc(830) Throwable local830) {
			}
		}
		if (local20 < 17 && super.anInt8996 == 0) {
			super.anInt8996 = 2;
		}
		if (local20 >= 18) {
			super.anInt8995 = arg0.method6069();
			if (super.anInt8995 < 0 || super.anInt8995 > 4) {
				super.anInt8995 = 0;
			}
		}
		if (local20 >= 19) {
			super.anInt8992 = arg0.method6069();
		} else if (super.anInt8995 == 1 || super.anInt8995 == 2) {
			super.anInt8992 = 2;
		} else if (super.anInt8995 == 3) {
			super.anInt8992 = 1;
		} else {
			super.anInt8992 = 0;
		}
		if (local20 >= 22) {
			super.anInt9001 = arg0.method6069();
		}
		if (super.anInt8996 == 0 && Static11.anInt321 < 96 && super.anInt8995 != 1 && super.anInt8995 != 0) {
			this.method7382();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)Z")
	public boolean method7377(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean692 : true;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)I")
	public int method7378() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static352.aClass272_2.aBoolean511 && !Static352.aClass272_2.aBoolean512) {
			if (Static426.aString72.startsWith("win")) {
				local9 = true;
				if (!Static426.aString69.startsWith("amd64") && !Static426.aString69.startsWith("x86_64")) {
					local7 = true;
				}
				local11 = true;
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean697) {
			local9 = false;
		}
		if (this.aBoolean693) {
			local11 = false;
		}
		if (this.aBoolean696) {
			local7 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method7384();
		}
		@Pc(71) int local71 = -1;
		@Pc(73) int local73 = -1;
		if (local7) {
			try {
				local71 = Static262.method4396(1000, 2);
			} catch (@Pc(82) Exception local82) {
			}
		}
		@Pc(85) int local85 = -1;
		if (local11) {
			try {
				local85 = Static262.method4396(1000, 3);
				if (Static560.anInt9242 == 3) {
					@Pc(100) Class312 local100 = Static240.aClass14_7.method6871();
					@Pc(105) long local105 = local100.aLong227 & 0xFFFFFFFFFFFFL;
					@Pc(108) int local108 = local100.anInt8309;
					if (local108 == 4318) {
						local9 &= local105 >= 64425238954L;
					} else if (local108 == 4098) {
						local9 &= local105 >= 60129613779L;
					}
				}
			} catch (@Pc(142) Exception local142) {
			}
		}
		if (local9) {
			try {
				local73 = Static262.method4396(1000, 1);
			} catch (@Pc(152) Exception local152) {
			}
		}
		if (local71 == -1 && local73 == -1 && local85 == -1) {
			return this.method7384();
		}
		local85 = (int) ((float) local85 * 1.1F);
		local73 = (int) ((float) local73 * 1.1F);
		if (local85 < local71 && local73 < local71) {
			return this.method7379(local71);
		} else if (local85 > local73) {
			return this.method7387(3, local85);
		} else {
			return this.method7387(1, local73);
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)I")
	private int method7379(@OriginalArg(0) int arg0) {
		@Pc(23) byte local23;
		if (arg0 > 12000) {
			local23 = 4;
			this.method7383();
		} else if (arg0 > 5000) {
			local23 = 3;
			this.method7392();
		} else if (arg0 > 2000) {
			this.method7386();
			local23 = 2;
		} else {
			local23 = 1;
			this.method7382();
		}
		if (Static560.anInt9242 != 2) {
			super.anInt8996 = 2;
			Static293.method4707(2);
		}
		this.method7394(Static352.aClass272_2);
		return local23;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZI)V")
	public void method7380(@OriginalArg(0) boolean arg0) {
		super.aBoolean692 = arg0;
		if (Static412.aClass307_4 != null) {
			Static412.aClass307_4.method6631(!this.method7389(Static560.anInt9242));
		}
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)I")
	public int method7381(@OriginalArg(1) int arg0) {
		if (Static411.method7687(arg0) && !Static309.method4877(Static557.anInt9206)) {
			return Static11.anInt321 < 96 && Static225.method4015(arg0) && super.anInt8992 == 0 ? 1 : super.anInt8992;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(B)V")
	public void method7382() {
		this.method7380(false);
		super.aBoolean679 = false;
		super.aBoolean676 = false;
		super.anInt9007 = super.anInt8994 = 0;
		super.anInt8989 = super.anInt9013 = 0;
		super.aBoolean683 = false;
		super.aBoolean691 = false;
		super.aBoolean681 = false;
		super.aBoolean685 = false;
		super.aBoolean674 = false;
		super.anInt9010 = 0;
		super.aBoolean684 = false;
		super.aBoolean680 = false;
		super.aBoolean689 = false;
		super.aBoolean675 = false;
		Static474.method7123(0);
		super.aBoolean682 = false;
		super.anInt9002 = 0;
		super.aBoolean690 = false;
		this.method7385();
		this.method7390(2);
		super.anInt8995 = 1;
		Static468.method6538();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	public void method7383() {
		this.method7380(true);
		super.aBoolean691 = true;
		super.aBoolean683 = true;
		super.anInt8989 = super.anInt9013 = 0;
		super.aBoolean675 = true;
		super.aBoolean674 = true;
		super.aBoolean681 = true;
		super.aBoolean685 = true;
		super.aBoolean689 = true;
		super.aBoolean679 = true;
		super.aBoolean680 = true;
		super.anInt9010 = 1;
		super.anInt9007 = super.anInt8994 = 2;
		super.aBoolean676 = true;
		super.aBoolean684 = true;
		if (Static11.anInt321 > 95) {
			Static474.method7123(2);
		} else {
			Static474.method7123(0);
		}
		super.aBoolean682 = false;
		super.aBoolean690 = true;
		super.anInt9002 = 0;
		this.method7385();
		this.method7390(0);
		super.anInt8995 = 4;
		Static468.method6538();
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(B)I")
	private int method7384() {
		@Pc(21) byte local21;
		if (Static11.anInt321 >= 96) {
			@Pc(11) int local11 = Static559.method7550();
			if (local11 <= 100) {
				this.method7383();
				local21 = 4;
			} else if (local11 <= 500) {
				local21 = 3;
				this.method7392();
			} else if (local11 <= 1000) {
				local21 = 2;
				this.method7386();
			} else {
				local21 = 1;
				this.method7382();
			}
		} else {
			this.method7382();
			local21 = 1;
		}
		if (Static560.anInt9242 != 0) {
			super.anInt8996 = 0;
			Static293.method4707(0);
		}
		this.method7394(Static352.aClass272_2);
		return local21;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V")
	private void method7385() {
		if (Static380.anInt6689 > 1) {
			super.anInt8988 = 4;
		} else {
			super.anInt8988 = 2;
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V")
	public void method7386() {
		this.method7380(true);
		super.aBoolean684 = false;
		super.aBoolean675 = false;
		super.aBoolean681 = false;
		super.aBoolean691 = false;
		super.aBoolean689 = false;
		super.anInt8989 = super.anInt9013 = 0;
		super.aBoolean674 = true;
		super.aBoolean676 = false;
		super.aBoolean685 = false;
		super.anInt9010 = 0;
		super.aBoolean679 = false;
		super.anInt9007 = super.anInt8994 = 0;
		super.aBoolean683 = false;
		super.aBoolean680 = false;
		Static474.method7123(0);
		super.anInt9002 = 0;
		super.aBoolean690 = true;
		super.aBoolean682 = false;
		this.method7385();
		this.method7390(2);
		super.anInt8995 = 2;
		Static468.method6538();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZI)I")
	private int method7387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(28) byte local28;
		if (arg1 > 20000) {
			this.method7383();
			local28 = 4;
		} else if (arg1 > 10000) {
			this.method7392();
			local28 = 3;
		} else if (arg1 > 5000) {
			this.method7386();
			local28 = 2;
		} else {
			this.method7382();
			local28 = 1;
		}
		if (Static560.anInt9242 != arg0) {
			super.anInt8996 = arg0;
			Static293.method4707(arg0);
		}
		this.method7394(Static352.aClass272_2);
		return local28;
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(II)Z")
	public boolean method7389(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean695 ? super.aBoolean692 : true;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(IB)V")
	public void method7390(@OriginalArg(0) int arg0) {
		Static489.aClass71Array1 = null;
		Static555.aBoolean712 = true;
		super.anInt8992 = arg0;
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(II)I")
	public int method7391(@OriginalArg(1) int arg0) {
		if (this.aBoolean694) {
			return 0;
		} else if (this.method7389(arg0)) {
			return super.aBoolean689 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)V")
	public void method7392() {
		this.method7380(true);
		super.aBoolean684 = true;
		super.aBoolean689 = true;
		super.aBoolean676 = true;
		super.anInt8989 = super.anInt9013 = 0;
		super.aBoolean681 = true;
		super.anInt9007 = super.anInt8994 = 1;
		super.aBoolean679 = false;
		super.aBoolean685 = true;
		super.aBoolean675 = true;
		super.aBoolean683 = false;
		super.aBoolean680 = true;
		super.anInt9010 = 1;
		super.aBoolean691 = true;
		super.aBoolean674 = true;
		if (Static11.anInt321 <= 95) {
			Static474.method7123(0);
		} else {
			Static474.method7123(1);
		}
		super.aBoolean682 = false;
		super.aBoolean690 = true;
		super.anInt9002 = 0;
		this.method7385();
		this.method7390(1);
		super.anInt8995 = 3;
		Static468.method6538();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!qj;I)V")
	public void method7394(@OriginalArg(0) Class272 arg0) {
		@Pc(7) Class31 local7 = null;
		try {
			@Pc(19) Class331 local19 = arg0.method6125(true, "");
			while (local19.anInt8818 == 0) {
				Static318.method4952(1L);
			}
			if (local19.anInt8818 == 1) {
				local7 = (Class31) local19.anObject18;
				@Pc(46) Class6_Sub21 local46 = new Class6_Sub21(Static333.method5194());
				this.method7372(local46);
				local7.method1005(local46.aByteArray93, local46.anInt7338, 0);
			}
		} catch (@Pc(60) Exception local60) {
		}
		try {
			if (local7 != null) {
				local7.method1007();
			}
		} catch (@Pc(67) Exception local67) {
		}
	}
}
