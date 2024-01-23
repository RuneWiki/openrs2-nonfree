import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public class Class15 implements Interface4 {

	@OriginalMember(owner = "client!c", name = "l", descriptor = "Lclient!ic;")
	private Class58 aClass58_3 = new Class58(256);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Lclient!hc;")
	private Class51 aClass51_5;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "Lclient!hc;")
	private Class51 aClass51_6;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[Lclient!qf;")
	private Class112[] aClass112Array2;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lclient!hc;Lclient!hc;Lclient!hc;)V")
	protected Class15(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) Class51 arg2) {
		this.aClass51_5 = arg2;
		this.aClass51_6 = arg1;
		@Pc(24) Class1_Sub13 local24 = new Class1_Sub13(arg0.method1874(0, 0));
		@Pc(28) int local28 = local24.method1764();
		this.aClass112Array2 = new Class112[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method1772() == 1) {
				this.aClass112Array2[local34] = new Class112();
			}
		}
		for (@Pc(56) int local56 = 0; local56 < local28; local56++) {
			if (this.aClass112Array2[local56] != null) {
				this.aClass112Array2[local56].aBoolean214 = local24.method1772() == 0;
			}
		}
		for (@Pc(81) int local81 = 0; local81 < local28; local81++) {
			if (this.aClass112Array2[local81] != null) {
				this.aClass112Array2[local81].aBoolean210 = local24.method1772() == 1;
			}
		}
		for (@Pc(113) int local113 = 0; local113 < local28; local113++) {
			if (this.aClass112Array2[local113] != null) {
				this.aClass112Array2[local113].aBoolean211 = local24.method1772() == 1;
			}
		}
		for (@Pc(139) int local139 = 0; local139 < local28; local139++) {
			if (this.aClass112Array2[local139] != null) {
				local24.method1772();
			}
		}
		for (@Pc(156) int local156 = 0; local156 < local28; local156++) {
			if (this.aClass112Array2[local156] != null) {
				local24.method1756();
			}
		}
		for (@Pc(177) int local177 = 0; local177 < local28; local177++) {
			if (this.aClass112Array2[local177] != null) {
				local24.method1756();
			}
		}
		for (@Pc(194) int local194 = 0; local194 < local28; local194++) {
			if (this.aClass112Array2[local194] != null) {
				local24.method1756();
			}
		}
		for (@Pc(211) int local211 = 0; local211 < local28; local211++) {
			if (this.aClass112Array2[local211] != null) {
				local24.method1756();
			}
		}
		for (@Pc(228) int local228 = 0; local228 < local28; local228++) {
			if (this.aClass112Array2[local228] != null) {
				this.aClass112Array2[local228].aShort19 = (short) local24.method1764();
			}
		}
		if (local24.aByteArray29.length > local24.anInt2395) {
			for (@Pc(260) int local260 = 0; local260 < local28; local260++) {
				if (this.aClass112Array2[local260] != null) {
					local24.method1756();
				}
			}
			for (@Pc(281) int local281 = 0; local281 < local28; local281++) {
				if (this.aClass112Array2[local281] != null) {
					local24.method1756();
				}
			}
			for (@Pc(302) int local302 = 0; local302 < local28; local302++) {
				if (this.aClass112Array2[local302] != null) {
					local24.method1772();
				}
			}
			for (@Pc(319) int local319 = 0; local319 < local28; local319++) {
				if (this.aClass112Array2[local319] != null) {
					this.aClass112Array2[local319].aBoolean212 = local24.method1772() == 1;
				}
			}
			for (@Pc(349) int local349 = 0; local349 < local28; local349++) {
				if (this.aClass112Array2[local349] != null) {
					local24.method1756();
				}
			}
			for (@Pc(370) int local370 = 0; local370 < local28; local370++) {
				if (this.aClass112Array2[local370] != null) {
					local24.method1772();
				}
			}
			for (@Pc(387) int local387 = 0; local387 < local28; local387++) {
				if (this.aClass112Array2[local387] != null) {
					local24.method1772();
				}
			}
			for (@Pc(404) int local404 = 0; local404 < local28; local404++) {
				if (this.aClass112Array2[local404] != null) {
					local24.method1772();
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(IB)Z")
	@Override
	public final boolean method377(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub2_Sub3 local13 = this.method379(arg0);
		return local13 != null && local13.method501(this.aClass51_5, this);
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)Lclient!bl;")
	protected Class1_Sub2_Sub3 method379(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2 local10 = this.aClass58_3.method2093((long) arg0);
		if (local10 != null) {
			return (Class1_Sub2_Sub3) local10;
		}
		@Pc(21) byte[] local21 = this.aClass51_6.method1863(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(39) Class1_Sub2_Sub3 local39 = new Class1_Sub2_Sub3(new Class1_Sub13(local21));
			this.aClass58_3.method2089((long) arg0, local39);
			return local39;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(FZIIII)[I")
	@Override
	public final int[] method378(@OriginalArg(0) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method379(arg1).method503(this.aClass51_5, this.aClass112Array2[arg1].aBoolean212, this, arg3, arg2, false, (double) arg0);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)Lclient!qf;")
	@Override
	public final Class112 method376(@OriginalArg(0) int arg0) {
		return this.aClass112Array2[arg0];
	}
}
