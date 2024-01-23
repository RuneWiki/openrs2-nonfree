import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class157 {

	@OriginalMember(owner = "client!te", name = "b", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!te", name = "m", descriptor = "I")
	private int anInt4956;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "I")
	public int anInt4960;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!te", name = "u", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "I")
	private int anInt4953 = 0;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "I")
	public int anInt4951 = -1;

	@OriginalMember(owner = "client!te", name = "k", descriptor = "I")
	private int anInt4954 = 128;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "Z")
	public boolean aBoolean375 = false;

	@OriginalMember(owner = "client!te", name = "t", descriptor = "Z")
	public boolean aBoolean376 = false;

	@OriginalMember(owner = "client!te", name = "v", descriptor = "I")
	private int anInt4962 = 0;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "I")
	private int anInt4958 = 0;

	@OriginalMember(owner = "client!te", name = "w", descriptor = "I")
	private int anInt4963 = 128;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZLclient!cg;)V")
	public void method3869(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2690();
			if (local9 == 0) {
				return;
			}
			this.method3876(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)Lclient!q;")
	public Class14_Sub6 method3873(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class14_Sub6 local13 = (Class14_Sub6) Static281.aClass135_39.method3316((long) this.anInt4960);
		if (local13 == null) {
			@Pc(22) Class14_Sub3 local22 = Static51.method976(Static123.aClass91_97, this.anInt4956);
			if (local22 == null) {
				return null;
			}
			@Pc(31) int local31;
			if (this.aShortArray78 != null) {
				for (local31 = 0; local31 < this.aShortArray78.length; local31++) {
					local22.method982(this.aShortArray78[local31], this.aShortArray77[local31]);
				}
			}
			if (this.aShortArray79 != null) {
				for (local31 = 0; local31 < this.aShortArray79.length; local31++) {
					local22.method979(this.aShortArray79[local31], this.aShortArray80[local31]);
				}
			}
			local13 = local22.method984(this.anInt4958 + 64, 850 - -this.anInt4953, -30, -50, -30);
			Static281.aClass135_39.method3321((long) this.anInt4960, local13);
		}
		@Pc(117) Class14_Sub6 local117;
		if (this.anInt4951 == -1 || arg0 == -1) {
			local117 = local13.method4118(true, true, true);
		} else {
			local117 = Static90.method1591(this.anInt4951).method3168(arg1, local13, arg0, arg2);
		}
		if (this.anInt4954 != 128 || this.anInt4963 != 128) {
			local117.method4121(this.anInt4954, this.anInt4963, this.anInt4954);
		}
		if (this.anInt4962 != 0) {
			if (this.anInt4962 == 90) {
				local117.method4111();
			}
			if (this.anInt4962 == 180) {
				local117.method4116();
			}
			if (this.anInt4962 == 270) {
				local117.method4106();
			}
		}
		return local117;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!cg;I)V")
	private void method3876(@OriginalArg(1) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4956 = arg0.method2691();
		} else if (arg1 == 2) {
			this.anInt4951 = arg0.method2691();
		} else if (arg1 == 4) {
			this.anInt4954 = arg0.method2691();
		} else if (arg1 == 5) {
			this.anInt4963 = arg0.method2691();
		} else if (arg1 == 6) {
			this.anInt4962 = arg0.method2691();
		} else if (arg1 == 7) {
			this.anInt4958 = arg0.method2690();
		} else if (arg1 == 8) {
			this.anInt4953 = arg0.method2690();
		} else if (arg1 == 9) {
			this.aBoolean376 = true;
		} else if (arg1 == 10) {
			this.aBoolean375 = true;
		} else {
			@Pc(103) int local103;
			@Pc(113) int local113;
			if (arg1 == 40) {
				local103 = arg0.method2690();
				this.aShortArray78 = new short[local103];
				this.aShortArray77 = new short[local103];
				for (local113 = 0; local113 < local103; local113++) {
					this.aShortArray78[local113] = (short) arg0.method2691();
					this.aShortArray77[local113] = (short) arg0.method2691();
				}
			} else if (arg1 == 41) {
				local103 = arg0.method2690();
				this.aShortArray79 = new short[local103];
				this.aShortArray80 = new short[local103];
				for (local113 = 0; local113 < local103; local113++) {
					this.aShortArray79[local113] = (short) arg0.method2691();
					this.aShortArray80[local113] = (short) arg0.method2691();
				}
			}
		}
	}
}
