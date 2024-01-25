import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bga")
public final class Class6_Sub6_Sub1 extends Class6_Sub6 {

	@OriginalMember(owner = "client!bga", name = "zb", descriptor = "I")
	public int anInt1197;

	@OriginalMember(owner = "client!bga", name = "kb", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!bga", name = "ob", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!bga", name = "Cb", descriptor = "Z")
	public boolean aBoolean142 = false;

	@OriginalMember(owner = "client!bga", name = "Db", descriptor = "Z")
	public boolean aBoolean143 = false;

	@OriginalMember(owner = "client!bga", name = "Bb", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lclient!pe;)V")
	public Class6_Sub6_Sub1(@OriginalArg(0) Class246 arg0) {
		super.anInt1172 = 3;
		super.anInt1157 = 3;
		this.method1082(true);
		super.anInt1167 = 2;
		super.aBoolean136 = true;
		super.aBoolean128 = true;
		super.anInt1177 = 127;
		super.anInt1155 = 127;
		super.anInt1178 = 127;
		super.anInt1161 = 0;
		super.anInt1181 = 0;
		super.anInt1156 = 1;
		super.anInt1166 = 0;
		super.aBoolean129 = true;
		super.aBoolean124 = true;
		super.aBoolean131 = true;
		super.anInt1160 = 0;
		super.aBoolean122 = true;
		super.aBoolean121 = true;
		super.anInt1176 = 127;
		super.aBoolean132 = true;
		super.aBoolean133 = true;
		super.aBoolean134 = false;
		super.anInt1169 = 0;
		super.aBoolean138 = true;
		super.anInt1170 = 127;
		if (Static205.anInt4372 < 96) {
			Static318.method5130(0);
		} else {
			Static318.method5130(2);
		}
		super.anInt1168 = 0;
		super.aBoolean130 = true;
		super.anInt1175 = 0;
		super.anInt1165 = Static293.anInt5603 == 1 ? 2 : 4;
		super.aBoolean126 = false;
		super.aBoolean123 = true;
		super.aBoolean137 = false;
		super.anInt1173 = 2;
		super.anInt1182 = 2;
		super.aBoolean125 = false;
		super.anInt1162 = 0;
		@Pc(150) Class155 local150 = null;
		try {
			@Pc(156) Class280 local156 = arg0.method6136("", true);
			while (local156.anInt8467 == 0) {
				Static566.method8004(1L);
			}
			if (local156.anInt8467 == 1) {
				local150 = (Class155) local156.anObject16;
				@Pc(181) byte[] local181 = new byte[(int) local150.method4076()];
				@Pc(195) int local195;
				for (@Pc(183) int local183 = 0; local183 < local181.length; local183 += local195) {
					local195 = local150.method4074(local181, local181.length - local183, local183);
					if (local195 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method1074(new Class6_Sub26(local181));
			}
		} catch (@Pc(225) Exception local225) {
		}
		try {
			if (local150 != null) {
				local150.method4077();
			}
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IB)Z")
	public boolean method1066(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean127 : true;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)I")
	public int method1067() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static414.aClass246_5.aBoolean534 && !Static414.aClass246_5.aBoolean535) {
			if (Static389.aString89.startsWith("win")) {
				if (!Static389.aString88.startsWith("amd64") && !Static389.aString88.startsWith("x86_64")) {
					local7 = true;
				}
				local11 = true;
				local9 = true;
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean142) {
			local7 = false;
		}
		if (this.aBoolean143) {
			local11 = false;
		}
		if (this.aBoolean139) {
			local9 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method1071();
		}
		@Pc(73) int local73 = -1;
		@Pc(75) int local75 = -1;
		if (local7) {
			try {
				local73 = Static239.method4221(2, 1000);
			} catch (@Pc(84) Exception local84) {
			}
		}
		@Pc(87) int local87 = -1;
		if (local11) {
			try {
				local87 = Static239.method4221(3, 1000);
				if (Static5.anInt145 == 3) {
					@Pc(100) Class138 local100 = Static323.aClass9_8.method5435();
					@Pc(105) long local105 = local100.aLong85 & 0xFFFFFFFFFFFFL;
					@Pc(108) int local108 = local100.anInt4341;
					if (local108 == 4318) {
						local9 &= local105 >= 64425238954L;
					} else if (local108 == 4098) {
						local9 &= local105 >= 60129613779L;
					}
				}
			} catch (@Pc(144) Exception local144) {
			}
		}
		if (local9) {
			try {
				local75 = Static239.method4221(1, 1000);
			} catch (@Pc(154) Exception local154) {
			}
		}
		if (local73 == -1 && local75 == -1 && local87 == -1) {
			return this.method1071();
		}
		local87 = (int) ((float) local87 * 1.1F);
		local75 = (int) ((float) local75 * 1.1F);
		if (local87 < local73 && local73 > local75) {
			return this.method1077(local73);
		} else if (local87 > local75) {
			return this.method1078(3, local87);
		} else {
			return this.method1078(1, local75);
		}
	}

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "(B)V")
	public void method1068() {
		this.method1082(true);
		super.anInt1167 = super.anInt1181 = 0;
		super.aBoolean134 = false;
		super.aBoolean124 = false;
		super.aBoolean135 = false;
		super.anInt1156 = 0;
		super.aBoolean133 = false;
		super.aBoolean132 = false;
		super.aBoolean128 = false;
		super.aBoolean129 = false;
		super.anInt1161 = super.anInt1166 = 0;
		super.aBoolean136 = false;
		super.aBoolean138 = false;
		super.aBoolean121 = true;
		super.aBoolean131 = false;
		Static318.method5130(0);
		super.aBoolean130 = true;
		super.anInt1162 = 0;
		super.aBoolean126 = false;
		this.method1076();
		this.method1072(2);
		super.anInt1157 = 2;
		Static397.method6265();
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(I)V")
	public void method1069() {
		this.method1082(true);
		super.aBoolean136 = true;
		super.aBoolean121 = true;
		super.aBoolean135 = true;
		super.aBoolean134 = true;
		super.aBoolean133 = true;
		super.aBoolean129 = true;
		super.anInt1161 = super.anInt1166 = 0;
		super.anInt1156 = 1;
		super.aBoolean131 = true;
		super.aBoolean124 = true;
		super.anInt1167 = super.anInt1181 = 2;
		super.aBoolean132 = true;
		super.aBoolean128 = true;
		super.aBoolean138 = true;
		if (Static205.anInt4372 > 95) {
			Static318.method5130(2);
		} else {
			Static318.method5130(0);
		}
		super.anInt1162 = 0;
		super.aBoolean130 = true;
		super.aBoolean126 = false;
		this.method1076();
		this.method1072(0);
		super.anInt1157 = 4;
		Static397.method6265();
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(II)I")
	public int method1070(@OriginalArg(0) int arg0) {
		if (this.aBoolean140) {
			return 0;
		} else if (this.method1075(arg0)) {
			return super.aBoolean133 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "(I)I")
	private int method1071() {
		@Pc(21) byte local21;
		if (Static205.anInt4372 < 96) {
			this.method1073();
			local21 = 1;
		} else {
			@Pc(26) int local26 = Static323.method5222();
			if (local26 <= 100) {
				this.method1069();
				local21 = 4;
			} else if (local26 <= 500) {
				local21 = 3;
				this.method1080();
			} else if (local26 > 1000) {
				local21 = 1;
				this.method1073();
			} else {
				this.method1068();
				local21 = 2;
			}
		}
		if (Static5.anInt145 != 0) {
			super.anInt1182 = 0;
			Static419.method6517(0);
		}
		this.method1081(Static414.aClass246_5);
		return local21;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZI)V")
	public void method1072(@OriginalArg(1) int arg0) {
		super.anInt1168 = arg0;
		Static116.aClass34Array1 = null;
		Static452.aBoolean606 = true;
	}

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "(I)V")
	public void method1073() {
		this.method1082(false);
		super.anInt1161 = super.anInt1166 = 0;
		super.aBoolean138 = false;
		super.aBoolean124 = false;
		super.aBoolean121 = false;
		super.anInt1156 = 0;
		super.anInt1167 = super.anInt1181 = 0;
		super.aBoolean136 = false;
		super.aBoolean134 = false;
		super.aBoolean129 = false;
		super.aBoolean135 = false;
		super.aBoolean132 = false;
		super.aBoolean128 = false;
		super.aBoolean131 = false;
		super.aBoolean133 = false;
		Static318.method5130(0);
		super.aBoolean130 = false;
		super.aBoolean126 = false;
		super.anInt1162 = 0;
		this.method1076();
		this.method1072(2);
		super.anInt1157 = 1;
		Static397.method6265();
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZLclient!iaa;)V")
	private void method1074(@OriginalArg(1) Class6_Sub26 arg0) {
		if (arg0.aByteArray65.length - arg0.anInt5769 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method4966();
		if (local21 < 0 || local21 > 22) {
			return;
		}
		@Pc(40) byte local40;
		if (local21 == 22) {
			local40 = 45;
		} else if (local21 == 21) {
			local40 = 44;
		} else if (local21 == 20) {
			local40 = 43;
		} else if (local21 == 19) {
			local40 = 42;
		} else if (local21 == 18) {
			local40 = 41;
		} else if (local21 == 17) {
			local40 = 40;
		} else if (local21 == 16) {
			local40 = 38;
		} else if (local21 == 15) {
			local40 = 37;
		} else if (local21 == 14) {
			local40 = 36;
		} else if (local21 == 13) {
			local40 = 35;
		} else if (local21 == 12) {
			local40 = 34;
		} else if (local21 == 11) {
			local40 = 33;
		} else if (local21 == 10) {
			local40 = 32;
		} else if (local21 == 9) {
			local40 = 31;
		} else if (local21 == 8) {
			local40 = 30;
		} else if (local21 == 7) {
			local40 = 29;
		} else if (local21 == 6) {
			local40 = 28;
		} else if (local21 == 5) {
			local40 = 28;
		} else if (local21 == 4) {
			local40 = 24;
		} else if (local21 == 3) {
			local40 = 23;
		} else if (local21 == 2) {
			local40 = 22;
		} else if (local21 == 1) {
			local40 = 23;
		} else {
			local40 = 19;
		}
		if (local40 > arg0.aByteArray65.length - arg0.anInt5769) {
			return;
		}
		super.anInt1172 = arg0.method4966();
		if (super.anInt1172 < 1) {
			super.anInt1172 = 1;
		} else if (super.anInt1172 > 4) {
			super.anInt1172 = 4;
		}
		this.method1082(arg0.method4966() == 1);
		super.aBoolean133 = arg0.method4966() == 1;
		super.aBoolean121 = arg0.method4966() == 1;
		super.aBoolean136 = arg0.method4966() == 1;
		super.anInt1156 = arg0.method4966() == 1 ? 1 : 0;
		super.aBoolean131 = arg0.method4966() == 1;
		super.aBoolean124 = arg0.method4966() == 1;
		super.aBoolean138 = arg0.method4966() == 1;
		super.anInt1167 = arg0.method4966();
		if (super.anInt1167 > 2) {
			super.anInt1167 = 2;
		}
		if (local21 >= 17) {
			super.anInt1181 = arg0.method4966();
		}
		if (local21 < 2) {
			super.aBoolean132 = arg0.method4966() == 1;
			arg0.method4966();
		} else {
			super.aBoolean132 = arg0.method4966() == 1;
			if (local21 >= 17) {
				super.aBoolean134 = arg0.method4966() == 1;
			}
		}
		super.aBoolean129 = arg0.method4966() == 1;
		super.aBoolean128 = arg0.method4966() == 1;
		super.anInt1161 = arg0.method4966();
		if (super.anInt1161 > 2) {
			super.anInt1161 = 2;
		}
		super.anInt1166 = super.anInt1161;
		super.aBoolean122 = arg0.method4966() == 1;
		super.anInt1155 = arg0.method4966();
		if (super.anInt1155 > 127) {
			super.anInt1155 = 127;
		}
		if (local21 >= 20) {
			super.anInt1177 = arg0.method4966();
			if (super.anInt1177 > 127) {
				super.anInt1177 = 127;
			}
		} else {
			super.anInt1177 = super.anInt1155;
		}
		super.anInt1170 = arg0.method4966();
		super.anInt1178 = arg0.method4966();
		if (super.anInt1178 > 127) {
			super.anInt1178 = 127;
		}
		if (local21 < 21) {
			super.anInt1176 = super.anInt1170;
		} else {
			super.anInt1176 = arg0.method4966();
			if (super.anInt1176 > 127) {
				super.anInt1176 = 127;
			}
		}
		if (local21 >= 1) {
			super.anInt1160 = arg0.method4999();
			super.anInt1169 = arg0.method4999();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method4966();
		}
		@Pc(580) int local580;
		if (local21 >= 4) {
			local580 = arg0.method4966();
			if (local580 < 0 || local580 > 2) {
				local580 = 0;
			}
			if (Static205.anInt4372 < 96) {
				local580 = 0;
			}
			Static318.method5130(local580);
		}
		if (local21 >= 5) {
			super.anInt1175 = arg0.method5000();
		}
		local580 = 0;
		if (local21 >= 6) {
			super.anInt1173 = local580 = arg0.method4966();
		}
		if (super.anInt1173 != 1 && super.anInt1173 != 2) {
			super.anInt1173 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean125 = arg0.method4966() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean137 = arg0.method4966() == 1;
		}
		if (local21 >= 9) {
			super.anInt1162 = arg0.method4966();
		}
		if (super.anInt1162 < 0 || super.anInt1162 > Static104.method6578(Static205.anInt4372)) {
			super.anInt1162 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean126 = arg0.method4966() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean123 = arg0.method4966() != 0;
		}
		if (local21 >= 12) {
			super.anInt1156 = arg0.method4966();
		}
		if (super.anInt1156 < 0 || super.anInt1156 > 2) {
			super.anInt1156 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean130 = arg0.method4966() == 1;
		}
		if (local21 >= 14) {
			super.anInt1182 = arg0.method4966();
		} else if (local580 == 0) {
			super.anInt1182 = 2;
		} else {
			super.anInt1182 = 1;
		}
		if (super.anInt1182 < 0 || super.anInt1182 > 5) {
			super.anInt1182 = 2;
		}
		if (local21 >= 15) {
			super.anInt1165 = arg0.method4966();
			if (super.anInt1165 < 0 || super.anInt1165 > 4) {
				super.anInt1165 = Static293.anInt5603 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean135 = arg0.method4966() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean135 = false;
				}
			} catch (@Pc(830) Throwable local830) {
			}
		}
		if (local21 < 17 && super.anInt1182 == 0) {
			super.anInt1182 = 2;
		}
		if (local21 >= 18) {
			super.anInt1157 = arg0.method4966();
			if (super.anInt1157 < 0 || super.anInt1157 > 4) {
				super.anInt1157 = 0;
			}
		}
		if (local21 >= 19) {
			super.anInt1168 = arg0.method4966();
		} else if (super.anInt1157 == 1 || super.anInt1157 == 2) {
			super.anInt1168 = 2;
		} else if (super.anInt1157 == 3) {
			super.anInt1168 = 1;
		} else {
			super.anInt1168 = 0;
		}
		if (local21 >= 22) {
			super.anInt1164 = arg0.method4966();
		}
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(IB)Z")
	public boolean method1075(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean141 ? super.aBoolean127 : true;
	}

	@OriginalMember(owner = "client!bga", name = "h", descriptor = "(I)V")
	private void method1076() {
		if (Static293.anInt5603 > 1) {
			super.anInt1165 = 4;
		} else {
			super.anInt1165 = 2;
		}
	}

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "(II)I")
	private int method1077(@OriginalArg(1) int arg0) {
		@Pc(27) byte local27;
		if (arg0 > 12000) {
			local27 = 4;
			this.method1069();
		} else if (arg0 > 5000) {
			this.method1080();
			local27 = 3;
		} else if (arg0 <= 2000) {
			this.method1073();
			local27 = 1;
		} else {
			local27 = 2;
			this.method1068();
		}
		if (Static5.anInt145 != 2) {
			super.anInt1182 = 2;
			Static419.method6517(2);
		}
		this.method1081(Static414.aClass246_5);
		return local27;
	}

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "(III)I")
	private int method1078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte local13;
		if (arg1 > 20000) {
			this.method1069();
			local13 = 4;
		} else if (arg1 > 10000) {
			local13 = 3;
			this.method1080();
		} else if (arg1 > 5000) {
			local13 = 2;
			this.method1068();
		} else {
			this.method1073();
			local13 = 1;
		}
		if (Static5.anInt145 != arg0) {
			super.anInt1182 = arg0;
			Static419.method6517(arg0);
		}
		this.method1081(Static414.aClass246_5);
		return local13;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Z)V")
	public void method1080() {
		this.method1082(true);
		super.aBoolean135 = true;
		super.aBoolean121 = true;
		super.aBoolean134 = false;
		super.aBoolean131 = true;
		super.aBoolean129 = false;
		super.aBoolean136 = true;
		super.aBoolean133 = true;
		super.anInt1167 = super.anInt1181 = 1;
		super.aBoolean138 = true;
		super.aBoolean124 = true;
		super.aBoolean128 = true;
		super.anInt1156 = 1;
		super.aBoolean132 = true;
		super.anInt1161 = super.anInt1166 = 0;
		if (Static205.anInt4372 <= 95) {
			Static318.method5130(0);
		} else {
			Static318.method5130(1);
		}
		super.aBoolean126 = false;
		super.anInt1162 = 0;
		super.aBoolean130 = true;
		this.method1076();
		this.method1072(1);
		super.anInt1157 = 3;
		Static397.method6265();
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ILclient!pe;)V")
	public void method1081(@OriginalArg(1) Class246 arg0) {
		@Pc(7) Class155 local7 = null;
		try {
			@Pc(13) Class280 local13 = arg0.method6136("", true);
			while (local13.anInt8467 == 0) {
				Static566.method8004(1L);
			}
			if (local13.anInt8467 == 1) {
				local7 = (Class155) local13.anObject16;
				@Pc(42) Class6_Sub26 local42 = new Class6_Sub26(Static553.method7876());
				this.method1060(local42);
				local7.method4079(local42.anInt5769, local42.aByteArray65, 0);
			}
		} catch (@Pc(56) Exception local56) {
		}
		try {
			if (local7 != null) {
				local7.method4077();
			}
		} catch (@Pc(63) Exception local63) {
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IZ)V")
	public void method1082(@OriginalArg(1) boolean arg0) {
		super.aBoolean127 = arg0;
		if (Static480.aClass57_11 != null) {
			Static480.aClass57_11.method1474(!this.method1075(Static5.anInt145));
		}
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(IZ)I")
	public int method1084(@OriginalArg(0) int arg0) {
		if (Static390.method6166(arg0) && !Static298.method4857(Static325.anInt6149)) {
			return Static205.anInt4372 < 96 && Static553.method7874(arg0) && super.anInt1168 == 0 ? 1 : super.anInt1168;
		} else {
			return 0;
		}
	}
}
