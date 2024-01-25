import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class2_Sub12_Sub1 extends Class2_Sub12 {

	@OriginalMember(owner = "client!dg", name = "jb", descriptor = "I")
	public int anInt1935;

	@OriginalMember(owner = "client!dg", name = "nb", descriptor = "Z")
	public boolean aBoolean169 = false;

	@OriginalMember(owner = "client!dg", name = "qb", descriptor = "Z")
	public boolean aBoolean170 = false;

	@OriginalMember(owner = "client!dg", name = "xb", descriptor = "Z")
	public boolean aBoolean171 = false;

	@OriginalMember(owner = "client!dg", name = "Db", descriptor = "Z")
	public boolean aBoolean172 = false;

	@OriginalMember(owner = "client!dg", name = "Hb", descriptor = "Z")
	public boolean aBoolean173 = false;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!rj;)V")
	public Class2_Sub12_Sub1(@OriginalArg(0) Class287 arg0) {
		super.anInt1925 = 3;
		super.anInt1929 = 3;
		this.method1429(true);
		super.aBoolean165 = true;
		super.aBoolean155 = true;
		super.anInt1924 = 0;
		super.anInt1921 = 0;
		super.aBoolean167 = true;
		super.aBoolean163 = true;
		super.aBoolean153 = true;
		super.anInt1905 = 1;
		super.anInt1920 = 127;
		super.anInt1918 = 127;
		super.aBoolean156 = false;
		super.anInt1927 = 0;
		super.anInt1926 = 127;
		super.anInt1913 = 0;
		super.aBoolean162 = true;
		super.aBoolean159 = true;
		super.anInt1923 = 127;
		super.aBoolean154 = true;
		super.anInt1916 = 127;
		super.anInt1919 = 2;
		super.aBoolean166 = true;
		super.aBoolean157 = true;
		super.anInt1914 = 0;
		if (Static440.anInt7756 >= 96) {
			Static402.method5873(2);
		} else {
			Static402.method5873(0);
		}
		super.anInt1904 = 0;
		super.anInt1909 = Static534.anInt8751 == 1 ? 2 : 4;
		super.aBoolean164 = true;
		super.aBoolean168 = false;
		super.aBoolean158 = false;
		super.aBoolean161 = true;
		super.anInt1908 = 2;
		super.anInt1903 = 0;
		super.aBoolean151 = false;
		super.anInt1917 = 2;
		super.anInt1915 = 0;
		@Pc(148) Class63 local148 = null;
		try {
			@Pc(154) Class347 local154 = arg0.method6548("", true);
			while (local154.anInt9172 == 0) {
				Static459.method6498(1L);
			}
			if (local154.anInt9172 == 1) {
				local148 = (Class63) local154.anObject49;
				@Pc(181) byte[] local181 = new byte[(int) local148.method1175()];
				@Pc(196) int local196;
				for (@Pc(183) int local183 = 0; local183 < local181.length; local183 += local196) {
					local196 = local148.method1178(local183, local181, local181.length - local183);
					if (local196 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method1421(new Class2_Sub15(local181));
			}
		} catch (@Pc(225) Exception local225) {
		}
		try {
			if (local148 != null) {
				local148.method1174();
			}
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)I")
	private int method1413(@OriginalArg(1) int arg0) {
		@Pc(16) byte local16;
		if (arg0 > 12000) {
			local16 = 4;
			this.method1428();
		} else if (arg0 > 5000) {
			this.method1417();
			local16 = 3;
		} else if (arg0 <= 2000) {
			local16 = 1;
			this.method1432(true);
		} else {
			this.method1426();
			local16 = 2;
		}
		if (Static391.anInt6846 != 2) {
			super.anInt1917 = 2;
			Static547.method5859(2);
		}
		this.method1425(Static356.aClass287_5);
		return local16;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	private void method1414() {
		if (Static534.anInt8751 <= 1) {
			super.anInt1909 = 2;
		} else {
			super.anInt1909 = 4;
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(ZII)I")
	private int method1415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) byte local21;
		if (arg0 > 20000) {
			this.method1428();
			local21 = 4;
		} else if (arg0 > 10000) {
			local21 = 3;
			this.method1417();
		} else if (arg0 <= 5000) {
			local21 = 1;
			this.method1432(true);
		} else {
			local21 = 2;
			this.method1426();
		}
		if (Static391.anInt6846 != arg1) {
			super.anInt1917 = arg1;
			Static547.method5859(arg1);
		}
		this.method1425(Static356.aClass287_5);
		return local21;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public void method1417() {
		this.method1429(true);
		super.aBoolean150 = true;
		super.aBoolean156 = false;
		super.anInt1919 = super.anInt1914 = 1;
		super.aBoolean153 = true;
		super.aBoolean157 = true;
		super.aBoolean166 = true;
		super.aBoolean165 = true;
		super.aBoolean159 = true;
		super.aBoolean162 = true;
		super.anInt1905 = 1;
		super.aBoolean155 = true;
		super.anInt1921 = super.anInt1927 = 0;
		super.aBoolean163 = false;
		super.aBoolean167 = true;
		if (Static440.anInt7756 > 95) {
			Static402.method5873(1);
		} else {
			Static402.method5873(0);
		}
		super.aBoolean164 = true;
		super.anInt1904 = 0;
		super.aBoolean168 = false;
		this.method1414();
		this.method1427(1);
		super.anInt1925 = 3;
		Static29.method539();
		Static6.method168();
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(II)Z")
	public boolean method1418(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean160 : true;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!es;Z)V")
	private void method1421(@OriginalArg(0) Class2_Sub15 arg0) {
		if (arg0.aByteArray62.length - arg0.anInt5241 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method4325();
		if (local21 < 0 || local21 > 22) {
			return;
		}
		@Pc(32) byte local32;
		if (local21 == 22) {
			local32 = 45;
		} else if (local21 == 21) {
			local32 = 44;
		} else if (local21 == 20) {
			local32 = 43;
		} else if (local21 == 19) {
			local32 = 42;
		} else if (local21 == 18) {
			local32 = 41;
		} else if (local21 == 17) {
			local32 = 40;
		} else if (local21 == 16) {
			local32 = 38;
		} else if (local21 == 15) {
			local32 = 37;
		} else if (local21 == 14) {
			local32 = 36;
		} else if (local21 == 13) {
			local32 = 35;
		} else if (local21 == 12) {
			local32 = 34;
		} else if (local21 == 11) {
			local32 = 33;
		} else if (local21 == 10) {
			local32 = 32;
		} else if (local21 == 9) {
			local32 = 31;
		} else if (local21 == 8) {
			local32 = 30;
		} else if (local21 == 7) {
			local32 = 29;
		} else if (local21 == 6) {
			local32 = 28;
		} else if (local21 == 5) {
			local32 = 28;
		} else if (local21 == 4) {
			local32 = 24;
		} else if (local21 == 3) {
			local32 = 23;
		} else if (local21 == 2) {
			local32 = 22;
		} else if (local21 == 1) {
			local32 = 23;
		} else {
			local32 = 19;
		}
		if (local32 > arg0.aByteArray62.length - arg0.anInt5241) {
			return;
		}
		super.anInt1929 = arg0.method4325();
		if (super.anInt1929 < 1) {
			super.anInt1929 = 1;
		} else if (super.anInt1929 > 4) {
			super.anInt1929 = 4;
		}
		this.method1429(arg0.method4325() == 1);
		super.aBoolean165 = arg0.method4325() == 1;
		super.aBoolean167 = arg0.method4325() == 1;
		super.aBoolean162 = arg0.method4325() == 1;
		super.anInt1905 = arg0.method4325() == 1 ? 1 : 0;
		super.aBoolean157 = arg0.method4325() == 1;
		super.aBoolean159 = arg0.method4325() == 1;
		super.aBoolean155 = arg0.method4325() == 1;
		super.anInt1919 = arg0.method4325();
		if (super.anInt1919 > 2) {
			super.anInt1919 = 2;
		}
		if (local21 >= 17) {
			super.anInt1914 = arg0.method4325();
		}
		if (local21 < 2) {
			super.aBoolean166 = arg0.method4325() == 1;
			arg0.method4325();
		} else {
			super.aBoolean166 = arg0.method4325() == 1;
			if (local21 >= 17) {
				super.aBoolean156 = arg0.method4325() == 1;
			}
		}
		super.aBoolean163 = arg0.method4325() == 1;
		super.aBoolean153 = arg0.method4325() == 1;
		super.anInt1921 = arg0.method4325();
		if (super.anInt1921 > 2) {
			super.anInt1921 = 2;
		}
		super.anInt1927 = super.anInt1921;
		super.aBoolean154 = arg0.method4325() == 1;
		super.anInt1916 = arg0.method4325();
		if (super.anInt1916 > 127) {
			super.anInt1916 = 127;
		}
		if (local21 < 20) {
			super.anInt1920 = super.anInt1916;
		} else {
			super.anInt1920 = arg0.method4325();
			if (super.anInt1920 > 127) {
				super.anInt1920 = 127;
			}
		}
		super.anInt1918 = arg0.method4325();
		super.anInt1926 = arg0.method4325();
		if (super.anInt1926 > 127) {
			super.anInt1926 = 127;
		}
		if (local21 >= 21) {
			super.anInt1923 = arg0.method4325();
			if (super.anInt1923 > 127) {
				super.anInt1923 = 127;
			}
		} else {
			super.anInt1923 = super.anInt1918;
		}
		if (local21 >= 1) {
			super.anInt1924 = arg0.method4294();
			super.anInt1913 = arg0.method4294();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method4325();
		}
		@Pc(553) int local553;
		if (local21 >= 4) {
			local553 = arg0.method4325();
			if (local553 < 0 || local553 > 2) {
				local553 = 0;
			}
			if (Static440.anInt7756 < 96) {
				local553 = 0;
			}
			Static402.method5873(local553);
		}
		if (local21 >= 5) {
			super.anInt1903 = arg0.method4307();
		}
		local553 = 0;
		if (local21 >= 6) {
			super.anInt1908 = local553 = arg0.method4325();
		}
		if (super.anInt1908 != 1 && super.anInt1908 != 2) {
			super.anInt1908 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean158 = arg0.method4325() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean151 = arg0.method4325() == 1;
		}
		if (local21 >= 9) {
			super.anInt1904 = arg0.method4325();
		}
		if (super.anInt1904 < 0 || super.anInt1904 > Static158.method2595(Static440.anInt7756)) {
			super.anInt1904 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean168 = arg0.method4325() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean161 = arg0.method4325() != 0;
		}
		if (local21 >= 12) {
			super.anInt1905 = arg0.method4325();
		}
		if (super.anInt1905 < 0 || super.anInt1905 > 2) {
			super.anInt1905 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean164 = arg0.method4325() == 1;
		}
		if (local21 >= 14) {
			super.anInt1917 = arg0.method4325();
		} else if (local553 == 0) {
			super.anInt1917 = 2;
		} else {
			super.anInt1917 = 1;
		}
		if (super.anInt1917 < 0 || super.anInt1917 > 5) {
			super.anInt1917 = 2;
		}
		if (local21 >= 15) {
			super.anInt1909 = arg0.method4325();
			if (super.anInt1909 < 0 || super.anInt1909 > 4) {
				super.anInt1909 = Static534.anInt8751 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean150 = arg0.method4325() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean150 = false;
				}
			} catch (@Pc(814) Throwable local814) {
			}
		}
		if (local21 < 17 && super.anInt1917 == 0) {
			super.anInt1917 = 2;
		}
		if (local21 >= 18) {
			super.anInt1925 = arg0.method4325();
			if (super.anInt1925 < 0 || super.anInt1925 > 4) {
				super.anInt1925 = 0;
			}
		}
		if (local21 >= 19) {
			super.anInt1915 = arg0.method4325();
		} else if (super.anInt1925 == 1 || super.anInt1925 == 2) {
			super.anInt1915 = 2;
		} else if (super.anInt1925 == 3) {
			super.anInt1915 = 1;
		} else {
			super.anInt1915 = 0;
		}
		if (local21 >= 22) {
			super.anInt1910 = arg0.method4325();
		}
		if (super.anInt1917 == 0 && Static440.anInt7756 < 96 && super.anInt1925 != 1 && super.anInt1925 != 0) {
			this.method1432(false);
		}
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(II)Z")
	public boolean method1422(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean173 ? super.aBoolean160 : true;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)I")
	public int method1423(@OriginalArg(0) int arg0) {
		if (Static235.method3646(arg0) && !Static98.method1487(Static201.anInt3963)) {
			return Static440.anInt7756 < 96 && Static332.method5090(arg0) && super.anInt1915 == 0 ? 1 : super.anInt1915;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)I")
	public int method1424() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static356.aClass287_5.aBoolean630 && !Static356.aClass287_5.aBoolean628) {
			if (Static464.aString79.startsWith("win")) {
				if (!Static464.aString75.startsWith("amd64") && !Static464.aString75.startsWith("x86_64")) {
					local7 = true;
				}
				local11 = true;
				local9 = true;
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean172) {
			local7 = false;
		}
		if (this.aBoolean169) {
			local11 = false;
		}
		if (this.aBoolean171) {
			local9 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method1431();
		}
		@Pc(66) int local66 = -1;
		@Pc(68) int local68 = -1;
		@Pc(70) int local70 = -1;
		if (local7) {
			try {
				local66 = Static551.method7486(2, 1000);
			} catch (@Pc(79) Exception local79) {
			}
		}
		if (local11) {
			try {
				local70 = Static551.method7486(3, 1000);
				if (Static391.anInt6846 == 3) {
					@Pc(95) Class237 local95 = Static307.aClass100_6.method6247();
					@Pc(100) long local100 = local95.aLong182 & 0xFFFFFFFFFFFFL;
					@Pc(103) int local103 = local95.anInt6600;
					if (local103 == 4318) {
						local9 &= local100 >= 64425238954L;
					} else if (local103 == 4098) {
						local9 &= local100 >= 60129613779L;
					}
				}
			} catch (@Pc(137) Exception local137) {
			}
		}
		if (local9) {
			try {
				local68 = Static551.method7486(1, 1000);
			} catch (@Pc(147) Exception local147) {
			}
		}
		if (local66 == -1 && local68 == -1 && local70 == -1) {
			return this.method1431();
		}
		local68 = (int) ((float) local68 * 1.1F);
		local70 = (int) ((float) local70 * 1.1F);
		if (local70 < local66 && local68 < local66) {
			return this.method1413(local66);
		} else if (local70 <= local68) {
			return this.method1415(local68, 1);
		} else {
			return this.method1415(local70, 3);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!rj;B)V")
	public void method1425(@OriginalArg(0) Class287 arg0) {
		@Pc(7) Class63 local7 = null;
		try {
			@Pc(19) Class347 local19 = arg0.method6548("", true);
			while (local19.anInt9172 == 0) {
				Static459.method6498(1L);
			}
			if (local19.anInt9172 == 1) {
				local7 = (Class63) local19.anObject49;
				@Pc(44) Class2_Sub15 local44 = new Class2_Sub15(Static514.method237());
				this.method1406(local44);
				local7.method1176(0, local44.anInt5241, local44.aByteArray62);
			}
		} catch (@Pc(58) Exception local58) {
		}
		try {
			if (local7 != null) {
				local7.method1174();
			}
		} catch (@Pc(65) Exception local65) {
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
	public void method1426() {
		this.method1429(true);
		super.aBoolean155 = false;
		super.aBoolean166 = false;
		super.aBoolean150 = false;
		super.aBoolean162 = false;
		super.aBoolean157 = false;
		super.aBoolean159 = false;
		super.anInt1905 = 0;
		super.aBoolean167 = true;
		super.aBoolean156 = false;
		super.aBoolean163 = false;
		super.anInt1921 = super.anInt1927 = 0;
		super.aBoolean153 = false;
		super.aBoolean165 = false;
		super.anInt1919 = super.anInt1914 = 0;
		Static402.method5873(0);
		super.anInt1904 = 0;
		super.aBoolean164 = true;
		super.aBoolean168 = false;
		this.method1414();
		this.method1427(2);
		super.anInt1925 = 2;
		Static29.method539();
		Static6.method168();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)V")
	public void method1427(@OriginalArg(1) int arg0) {
		Static402.aClass289Array1 = null;
		Static545.aBoolean684 = true;
		super.anInt1915 = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
	public void method1428() {
		this.method1429(true);
		super.aBoolean155 = true;
		super.aBoolean153 = true;
		super.anInt1905 = 1;
		super.anInt1919 = super.anInt1914 = 2;
		super.aBoolean157 = true;
		super.aBoolean159 = true;
		super.aBoolean166 = true;
		super.aBoolean150 = true;
		super.aBoolean163 = true;
		super.aBoolean165 = true;
		super.aBoolean156 = true;
		super.aBoolean167 = true;
		super.anInt1921 = super.anInt1927 = 0;
		super.aBoolean162 = true;
		if (Static440.anInt7756 > 95) {
			Static402.method5873(2);
		} else {
			Static402.method5873(0);
		}
		super.aBoolean164 = true;
		super.anInt1904 = 0;
		super.aBoolean168 = false;
		this.method1414();
		this.method1427(0);
		super.anInt1925 = 4;
		Static29.method539();
		Static6.method168();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)V")
	public void method1429(@OriginalArg(0) boolean arg0) {
		super.aBoolean160 = arg0;
		if (Static541.aClass97_4 != null) {
			Static541.aClass97_4.method1800(!this.method1422(Static391.anInt6846));
		}
	}

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "(II)I")
	public int method1430(@OriginalArg(1) int arg0) {
		if (this.aBoolean170) {
			return 0;
		} else if (this.method1422(arg0)) {
			return super.aBoolean165 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "(I)I")
	private int method1431() {
		@Pc(20) byte local20;
		if (Static440.anInt7756 < 96) {
			this.method1432(true);
			local20 = 1;
		} else {
			@Pc(27) int local27 = Static547.method5857();
			if (local27 <= 100) {
				local20 = 4;
				this.method1428();
			} else if (local27 <= 500) {
				this.method1417();
				local20 = 3;
			} else if (local27 > 1000) {
				local20 = 1;
				this.method1432(true);
			} else {
				local20 = 2;
				this.method1426();
			}
		}
		if (Static391.anInt6846 != 0) {
			super.anInt1917 = 0;
			Static547.method5859(0);
		}
		this.method1425(Static356.aClass287_5);
		return local20;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZB)V")
	public void method1432(@OriginalArg(0) boolean arg0) {
		this.method1429(false);
		super.anInt1905 = 0;
		super.aBoolean153 = false;
		super.aBoolean150 = false;
		super.aBoolean159 = false;
		super.aBoolean166 = false;
		super.aBoolean157 = false;
		super.anInt1921 = super.anInt1927 = 0;
		super.aBoolean155 = false;
		super.aBoolean156 = false;
		super.aBoolean163 = false;
		super.aBoolean165 = false;
		super.aBoolean167 = false;
		super.aBoolean162 = false;
		super.anInt1919 = super.anInt1914 = 0;
		Static402.method5873(0);
		super.aBoolean168 = false;
		super.anInt1904 = 0;
		super.aBoolean164 = false;
		this.method1414();
		this.method1427(2);
		super.anInt1925 = 1;
		if (arg0) {
			Static29.method539();
		}
		Static6.method168();
	}
}
