import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
	private int anInt2521;

	@OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
	public int anInt2529;

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
	private int anInt2517 = 0;

	@OriginalMember(owner = "client!tb", name = "db", descriptor = "[I")
	private final int[] anIntArray275 = new int[6];

	@OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
	public int anInt2528 = -1;

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
	private int anInt2524 = 128;

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
	private int anInt2531 = 0;

	@OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
	private int anInt2522 = 0;

	@OriginalMember(owner = "client!tb", name = "pb", descriptor = "[I")
	private final int[] anIntArray276 = new int[6];

	@OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
	private int anInt2523 = 128;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method1608(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub1_Sub3_Sub3 local14 = (Class3_Sub1_Sub3_Sub3) Static22.aClass34_10.method764((long) this.anInt2529);
		if (local14 == null) {
			local14 = Static57.method949(Static4.aClass42_6, this.anInt2521);
			if (local14 == null) {
				return null;
			}
			for (@Pc(32) int local32 = 0; local32 < 6; local32++) {
				if (this.anIntArray276[0] != 0) {
					local14.method965(this.anIntArray276[local32], this.anIntArray275[local32]);
				}
			}
			local14.method945();
			local14.method953(this.anInt2531 + 64, 850 - -this.anInt2522, -30, -50, -30, true);
			Static22.aClass34_10.method765((long) this.anInt2529, local14);
		}
		@Pc(89) Class3_Sub1_Sub3_Sub3 local89;
		if (this.anInt2528 == -1 || arg0 == -1) {
			local89 = local14.method951(true);
		} else {
			local89 = Static41.method705(this.anInt2528).method1219(local14, arg0);
		}
		if (this.anInt2524 != 128 || this.anInt2523 != 128) {
			local89.method957(this.anInt2524, this.anInt2523, this.anInt2524);
		}
		if (this.anInt2517 != 0) {
			if (this.anInt2517 == 90) {
				local89.method960();
			}
			if (this.anInt2517 == 180) {
				local89.method960();
				local89.method960();
			}
			if (this.anInt2517 == 270) {
				local89.method960();
				local89.method960();
				local89.method960();
			}
		}
		return local89;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!kd;)V")
	private void method1612(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt2521 = arg1.method1789();
		} else if (arg0 == 2) {
			this.anInt2528 = arg1.method1789();
		} else if (arg0 == 4) {
			this.anInt2524 = arg1.method1789();
		} else if (arg0 == 5) {
			this.anInt2523 = arg1.method1789();
		} else if (arg0 == 6) {
			this.anInt2517 = arg1.method1789();
		} else if (arg0 == 7) {
			this.anInt2531 = arg1.method1803();
		} else if (arg0 == 8) {
			this.anInt2522 = arg1.method1803();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.anIntArray276[arg0 - 40] = arg1.method1789();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.anIntArray275[arg0 - 50] = arg1.method1789();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!kd;I)V")
	public void method1618(@OriginalArg(0) Class3_Sub8 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1803();
			if (local15 == 0) {
				return;
			}
			this.method1612(local15, arg0);
		}
	}
}
