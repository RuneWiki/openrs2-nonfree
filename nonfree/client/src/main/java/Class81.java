import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class81 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	private int anInt2188;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "I")
	public int anInt2191;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "I")
	private int anInt2193;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "I")
	public int anInt2197;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "I")
	private int anInt2198;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Ljava/lang/String;")
	public String aString84;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "I")
	public int anInt2199;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "I")
	public int anInt2203;

	@OriginalMember(owner = "client!id", name = "y", descriptor = "Ljava/lang/String;")
	public String aString85;

	@OriginalMember(owner = "client!id", name = "A", descriptor = "I")
	public int anInt2208;

	@OriginalMember(owner = "client!id", name = "B", descriptor = "[I")
	public int[] anIntArray186;

	@OriginalMember(owner = "client!id", name = "C", descriptor = "I")
	private int anInt2209;

	@OriginalMember(owner = "client!id", name = "D", descriptor = "I")
	public int anInt2210;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "I")
	public int anInt2200 = 0;

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Z")
	public boolean aBoolean166 = false;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	public int anInt2195 = -1;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "I")
	private int anInt2205 = -1;

	@OriginalMember(owner = "client!id", name = "E", descriptor = "Z")
	public boolean aBoolean167 = true;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray21 = new String[5];

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	public int anInt2196 = -1;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Z")
	public boolean aBoolean165 = true;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "I")
	private int anInt2207 = -1;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	public int anInt2190 = -1;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Z")
	public boolean aBoolean164 = true;

	@OriginalMember(owner = "client!id", name = "G", descriptor = "I")
	public int anInt2211 = -1;

	@OriginalMember(owner = "client!id", name = "s", descriptor = "I")
	private int anInt2201 = -1;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "I")
	private int anInt2206 = -1;

	@OriginalMember(owner = "client!id", name = "I", descriptor = "I")
	private int anInt2213 = -1;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Lclient!wi;")
	public Class103_Sub2 method1798() {
		@Pc(19) Class103_Sub2 local19 = (Class103_Sub2) Static249.aClass169_133.method4017((long) (this.anInt2201 | 0x20000));
		if (local19 != null) {
			return local19;
		}
		Static274.aClass138_76.method3340(this.anInt2201);
		local19 = Static206.method3274(Static274.aClass138_76, this.anInt2201);
		if (local19 != null) {
			local19.anInt5851 = 0;
			local19.anInt5856 = local19.anInt5858;
			local19.anInt5860 = local19.anInt5857;
			local19.anInt5854 = 0;
			Static249.aClass169_133.method4016(local19, (long) (this.anInt2201 | 0x20000));
		}
		return local19;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)Z")
	public boolean method1800() {
		if (this.anInt2207 == -1 && this.anInt2213 == -1) {
			return true;
		}
		@Pc(32) int local32;
		if (this.anInt2207 == -1) {
			local32 = Static298.method4459(this.anInt2213);
		} else {
			local32 = Static46.anIntArray78[this.anInt2207];
		}
		if (this.anInt2198 > local32 || this.anInt2188 < local32) {
			return false;
		} else if (this.anInt2206 == -1 && this.anInt2205 == -1) {
			return true;
		} else {
			if (this.anInt2206 == -1) {
				local32 = Static298.method4459(this.anInt2205);
			} else {
				local32 = Static46.anIntArray78[this.anInt2206];
			}
			return local32 >= this.anInt2209 && this.anInt2193 >= local32;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!sb;I)V")
	public void method1802(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method2595();
			if (local18 == 0) {
				return;
			}
			this.method1803(arg0, local18);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!sb;II)V")
	private void method1803(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2196 = arg0.method2593();
		} else if (arg1 == 2) {
			this.anInt2211 = arg0.method2593();
		} else if (arg1 == 3) {
			this.aString84 = arg0.method2605();
		} else if (arg1 == 4) {
			this.anInt2208 = arg0.method2588();
		} else if (arg1 == 5) {
			this.anInt2190 = arg0.method2588();
		} else if (arg1 == 6) {
			this.anInt2200 = arg0.method2595();
		} else {
			@Pc(54) int local54;
			if (arg1 == 7) {
				local54 = arg0.method2595();
				if ((local54 & 0x2) == 2) {
					this.aBoolean166 = true;
				}
				if ((local54 & 0x1) == 0) {
					this.aBoolean164 = false;
				}
			} else if (arg1 == 8) {
				this.aBoolean165 = arg0.method2595() == 1;
			} else if (arg1 == 9) {
				this.anInt2213 = arg0.method2593();
				if (this.anInt2213 == 65535) {
					this.anInt2213 = -1;
				}
				this.anInt2207 = arg0.method2593();
				if (this.anInt2207 == 65535) {
					this.anInt2207 = -1;
				}
				this.anInt2198 = arg0.method2647();
				this.anInt2188 = arg0.method2647();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray21[arg1 - 10] = arg0.method2605();
			} else if (arg1 == 15) {
				local54 = arg0.method2595();
				this.anIntArray186 = new int[local54 * 2];
				for (@Pc(122) int local122 = 0; local122 < local54 * 2; local122++) {
					this.anIntArray186[local122] = arg0.method2623();
				}
				this.anInt2203 = arg0.method2647();
				this.anInt2191 = arg0.method2647();
			} else if (arg1 == 16) {
				this.aBoolean167 = false;
			} else if (arg1 == 17) {
				this.aString85 = arg0.method2605();
			} else if (arg1 == 18) {
				this.anInt2201 = arg0.method2593();
			} else if (arg1 == 19) {
				this.anInt2195 = arg0.method2593();
			} else if (arg1 == 20) {
				this.anInt2205 = arg0.method2593();
				if (this.anInt2205 == 65535) {
					this.anInt2205 = -1;
				}
				this.anInt2206 = arg0.method2593();
				if (this.anInt2206 == 65535) {
					this.anInt2206 = -1;
				}
				this.anInt2209 = arg0.method2647();
				this.anInt2193 = arg0.method2647();
			} else if (arg1 == 21) {
				this.anInt2197 = arg0.method2647();
			} else if (arg1 == 22) {
				this.anInt2210 = arg0.method2647();
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZBZ)Lclient!mo;")
	public Class103 method1805(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt2211 : this.anInt2196;
		@Pc(24) Class103 local24 = (Class103) Static249.aClass169_133.method4017((long) ((arg0 ? 65536 : 0) | local11));
		if (local24 != null) {
			return local24;
		} else if (Static274.aClass138_76.method3340(local11)) {
			@Pc(51) Class103_Sub2 local51 = Static206.method3274(Static274.aClass138_76, local11);
			if (Static291.aBoolean404 && !arg1) {
				local24 = new Class103_Sub1(local51);
			} else {
				local24 = local51;
			}
			if (local24 != null) {
				local24.anInt5860 = local24.anInt5857;
				local24.anInt5854 = 0;
				local24.anInt5856 = local24.anInt5858;
				local24.anInt5851 = 0;
				Static249.aClass169_133.method4016(local24, (long) ((arg0 ? 65536 : 0) | local11));
			}
			return local24;
		} else {
			return null;
		}
	}
}
