import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class1_Sub3_Sub11 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ja", name = "M", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!ja", name = "O", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!ja", name = "W", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!ja", name = "fb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!ja", name = "ib", descriptor = "I")
	private int anInt1917;

	@OriginalMember(owner = "client!ja", name = "nb", descriptor = "I")
	public int anInt1919;

	@OriginalMember(owner = "client!ja", name = "R", descriptor = "Z")
	public boolean aBoolean113 = false;

	@OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
	private int anInt1910 = 0;

	@OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
	private int anInt1913 = 128;

	@OriginalMember(owner = "client!ja", name = "N", descriptor = "I")
	private int anInt1906 = 0;

	@OriginalMember(owner = "client!ja", name = "gb", descriptor = "I")
	private int anInt1916 = 0;

	@OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
	public int anInt1908 = -1;

	@OriginalMember(owner = "client!ja", name = "eb", descriptor = "I")
	private int anInt1915 = 128;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)Lclient!ee;")
	public Class8_Sub5 method1317(@OriginalArg(0) int arg0) {
		@Pc(18) Class8_Sub5 local18 = (Class8_Sub5) Static106.aClass77_5.method2259((long) this.anInt1919);
		if (local18 == null) {
			@Pc(26) Class8_Sub7 local26 = Static135.method1997(Static102.aClass3_18, this.anInt1917);
			if (local26 == null) {
				return null;
			}
			@Pc(35) int local35;
			if (this.aShortArray8 != null) {
				for (local35 = 0; local35 < this.aShortArray8.length; local35++) {
					local26.method2006(this.aShortArray8[local35], this.aShortArray10[local35]);
				}
			}
			if (this.aShortArray11 != null) {
				for (local35 = 0; local35 < this.aShortArray11.length; local35++) {
					local26.method2010(this.aShortArray11[local35], this.aShortArray9[local35]);
				}
			}
			local18 = local26.method2007(this.anInt1916 + 64, this.anInt1906 + 850, -30, -50, -30);
			Static106.aClass77_5.method2257(local18, (long) this.anInt1919);
		}
		@Pc(117) Class8_Sub5 local117;
		if (this.anInt1908 == -1 || arg0 == -1) {
			local117 = local18.method2043(true);
		} else {
			local117 = Static84.method1279(this.anInt1908).method2551(local18, arg0);
		}
		if (this.anInt1915 != 128 || this.anInt1913 != 128) {
			local117.method2038(this.anInt1915, this.anInt1913, this.anInt1915);
		}
		if (this.anInt1910 != 0) {
			if (this.anInt1910 == 90) {
				local117.method2047();
			}
			if (this.anInt1910 == 180) {
				local117.method2053();
			}
			if (this.anInt1910 == 270) {
				local117.method2051();
			}
		}
		return local117;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!ka;)V")
	public void method1321(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3010();
			if (local5 == 0) {
				return;
			}
			this.method1322(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ka;II)V")
	private void method1322(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1917 = arg0.method3023();
		} else if (arg1 == 2) {
			this.anInt1908 = arg0.method3023();
		} else if (arg1 == 4) {
			this.anInt1915 = arg0.method3023();
		} else if (arg1 == 5) {
			this.anInt1913 = arg0.method3023();
		} else if (arg1 == 6) {
			this.anInt1910 = arg0.method3023();
		} else if (arg1 == 7) {
			this.anInt1916 = arg0.method3010();
		} else if (arg1 == 8) {
			this.anInt1906 = arg0.method3010();
		} else if (arg1 == 9) {
			this.aBoolean113 = true;
		} else {
			@Pc(58) int local58;
			@Pc(68) int local68;
			if (arg1 == 40) {
				local58 = arg0.method3010();
				this.aShortArray10 = new short[local58];
				this.aShortArray8 = new short[local58];
				for (local68 = 0; local68 < local58; local68++) {
					this.aShortArray8[local68] = (short) arg0.method3023();
					this.aShortArray10[local68] = (short) arg0.method3023();
				}
			} else if (arg1 == 41) {
				local58 = arg0.method3010();
				this.aShortArray9 = new short[local58];
				this.aShortArray11 = new short[local58];
				for (local68 = 0; local68 < local58; local68++) {
					this.aShortArray11[local68] = (short) arg0.method3023();
					this.aShortArray9[local68] = (short) arg0.method3023();
				}
			}
		}
	}
}
