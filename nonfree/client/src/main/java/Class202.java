import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class202 {

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public int anInt5885;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "I")
	public int anInt5889;

	@OriginalMember(owner = "client!u", name = "o", descriptor = "[I")
	public int[] anIntArray744;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "I")
	private int anInt5894;

	@OriginalMember(owner = "client!u", name = "t", descriptor = "Ljava/lang/String;")
	public String aString233;

	@OriginalMember(owner = "client!u", name = "u", descriptor = "I")
	public int anInt5896;

	@OriginalMember(owner = "client!u", name = "v", descriptor = "I")
	private int anInt5897;

	@OriginalMember(owner = "client!u", name = "B", descriptor = "Ljava/lang/String;")
	public String aString234;

	@OriginalMember(owner = "client!u", name = "C", descriptor = "I")
	private int anInt5903;

	@OriginalMember(owner = "client!u", name = "G", descriptor = "I")
	public int anInt5906;

	@OriginalMember(owner = "client!u", name = "N", descriptor = "I")
	public int anInt5911;

	@OriginalMember(owner = "client!u", name = "R", descriptor = "I")
	public int anInt5915;

	@OriginalMember(owner = "client!u", name = "T", descriptor = "I")
	private int anInt5916;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "I")
	public int anInt5883 = -1;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	private int anInt5882 = -1;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray42 = new String[5];

	@OriginalMember(owner = "client!u", name = "h", descriptor = "I")
	private int anInt5887 = -1;

	@OriginalMember(owner = "client!u", name = "m", descriptor = "Z")
	public boolean aBoolean517 = true;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "I")
	public int anInt5884 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!u", name = "A", descriptor = "I")
	public int anInt5902 = -1;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "I")
	public int anInt5895 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Z")
	public boolean aBoolean516 = false;

	@OriginalMember(owner = "client!u", name = "n", descriptor = "I")
	public int anInt5891 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!u", name = "J", descriptor = "I")
	public int anInt5909 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!u", name = "K", descriptor = "Z")
	public boolean aBoolean519 = true;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "I")
	public int anInt5886 = -1;

	@OriginalMember(owner = "client!u", name = "M", descriptor = "I")
	private int anInt5910 = -1;

	@OriginalMember(owner = "client!u", name = "w", descriptor = "I")
	public int anInt5898 = -1;

	@OriginalMember(owner = "client!u", name = "x", descriptor = "I")
	private int anInt5899 = -1;

	@OriginalMember(owner = "client!u", name = "L", descriptor = "Z")
	public boolean aBoolean520 = true;

	@OriginalMember(owner = "client!u", name = "P", descriptor = "I")
	private int anInt5913 = -1;

	@OriginalMember(owner = "client!u", name = "y", descriptor = "I")
	public int anInt5900 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IILclient!eb;)V")
	private void method5166(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt5886 = arg1.method3115();
		} else if (arg0 == 2) {
			this.anInt5883 = arg1.method3115();
		} else if (arg0 == 3) {
			this.aString234 = arg1.method3134();
		} else if (arg0 == 4) {
			this.anInt5906 = arg1.method3137();
		} else if (arg0 == 5) {
			this.anInt5898 = arg1.method3137();
		} else if (arg0 == 6) {
			this.anInt5900 = arg1.method3141();
		} else {
			@Pc(50) int local50;
			if (arg0 == 7) {
				local50 = arg1.method3141();
				if ((local50 & 0x1) == 0) {
					this.aBoolean520 = false;
				}
				if ((local50 & 0x2) == 2) {
					this.aBoolean516 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean517 = arg1.method3141() == 1;
			} else if (arg0 == 9) {
				this.anInt5910 = arg1.method3115();
				if (this.anInt5910 == 65535) {
					this.anInt5910 = -1;
				}
				this.anInt5887 = arg1.method3115();
				if (this.anInt5887 == 65535) {
					this.anInt5887 = -1;
				}
				this.anInt5903 = arg1.method3125();
				this.anInt5916 = arg1.method3125();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray42[arg0 - 10] = arg1.method3134();
			} else if (arg0 == 15) {
				local50 = arg1.method3141();
				this.anIntArray744 = new int[local50 * 2];
				for (@Pc(130) int local130 = 0; local130 < local50 * 2; local130++) {
					this.anIntArray744[local130] = arg1.method3090();
				}
				this.anInt5885 = arg1.method3125();
				this.anInt5889 = arg1.method3125();
			} else if (arg0 == 16) {
				this.aBoolean519 = false;
			} else if (arg0 == 17) {
				this.aString233 = arg1.method3134();
			} else if (arg0 == 18) {
				this.anInt5882 = arg1.method3115();
			} else if (arg0 == 19) {
				this.anInt5902 = arg1.method3115();
			} else if (arg0 == 20) {
				this.anInt5913 = arg1.method3115();
				if (this.anInt5913 == 65535) {
					this.anInt5913 = -1;
				}
				this.anInt5899 = arg1.method3115();
				if (this.anInt5899 == 65535) {
					this.anInt5899 = -1;
				}
				this.anInt5897 = arg1.method3125();
				this.anInt5894 = arg1.method3125();
			} else if (arg0 == 21) {
				this.anInt5896 = arg1.method3125();
			} else if (arg0 == 22) {
				this.anInt5911 = arg1.method3125();
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZILclient!aa;)Lclient!lf;")
	public Class90 method5169(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt5883 : this.anInt5886;
		@Pc(18) int local18 = arg1.anInt3495 << 29 | local11;
		@Pc(25) Class90 local25 = (Class90) Static175.aClass140_94.method3816((long) local18);
		if (local25 != null) {
			return local25;
		} else if (Static306.aClass165_93.method4486(local11)) {
			@Pc(41) Class138 local41 = Static363.method3785(Static306.aClass165_93, local11, 0);
			if (local41 != null) {
				local25 = arg1.method3322(local41);
				Static175.aClass140_94.method3817((long) local18, local25);
			}
			return local25;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!aa;)Lclient!lf;")
	public Class90 method5170(@OriginalArg(1) Class2 arg0) {
		@Pc(18) Class90 local18 = (Class90) Static175.aClass140_94.method3816((long) (arg0.anInt3495 << 29 | 0x20000 | this.anInt5882));
		if (local18 != null) {
			return local18;
		}
		Static306.aClass165_93.method4486(this.anInt5882);
		@Pc(40) Class138 local40 = Static363.method3785(Static306.aClass165_93, this.anInt5882, 0);
		if (local40 != null) {
			local18 = arg0.method3322(local40);
			Static175.aClass140_94.method3817((long) (arg0.anInt3495 << 29 | this.anInt5882 | 0x20000), local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public void method5172() {
		if (this.anIntArray744 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray744.length; local6 += 2) {
			if (this.anIntArray744[local6] < this.anInt5909) {
				this.anInt5909 = this.anIntArray744[local6];
			} else if (this.anInt5891 < this.anIntArray744[local6]) {
				this.anInt5891 = this.anIntArray744[local6];
			}
			if (this.anInt5895 > this.anIntArray744[local6 + 1]) {
				this.anInt5895 = this.anIntArray744[local6 + 1];
			} else if (this.anIntArray744[local6 + 1] > this.anInt5884) {
				this.anInt5884 = this.anIntArray744[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!eb;I)V")
	public void method5173(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3141();
			if (local9 == 0) {
				return;
			}
			this.method5166(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)Z")
	public boolean method5175() {
		if (this.anInt5887 == -1 && this.anInt5910 == -1) {
			return true;
		}
		@Pc(31) int local31;
		if (this.anInt5887 == -1) {
			local31 = Static323.method5414(this.anInt5910);
		} else {
			local31 = Static197.anIntArray793[this.anInt5887];
		}
		if (local31 < this.anInt5903 || this.anInt5916 < local31) {
			return false;
		} else if (this.anInt5899 == -1 && this.anInt5913 == -1) {
			return true;
		} else {
			if (this.anInt5899 == -1) {
				local31 = Static323.method5414(this.anInt5913);
			} else {
				local31 = Static197.anIntArray793[this.anInt5899];
			}
			return local31 >= this.anInt5897 && local31 <= this.anInt5894;
		}
	}
}
