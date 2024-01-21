import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class1_Sub1_Sub2_Sub1_Sub2 extends Class1_Sub1_Sub2_Sub1 {

	@OriginalMember(owner = "client!r", name = "Vc", descriptor = "I")
	public int anInt2537;

	@OriginalMember(owner = "client!r", name = "Wc", descriptor = "I")
	public int anInt2538;

	@OriginalMember(owner = "client!r", name = "Zc", descriptor = "I")
	public int anInt2541;

	@OriginalMember(owner = "client!r", name = "cd", descriptor = "Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 aClass1_Sub1_Sub2_Sub7_3;

	@OriginalMember(owner = "client!r", name = "dd", descriptor = "I")
	public int anInt2544;

	@OriginalMember(owner = "client!r", name = "hd", descriptor = "I")
	public int anInt2547;

	@OriginalMember(owner = "client!r", name = "id", descriptor = "I")
	public int anInt2548;

	@OriginalMember(owner = "client!r", name = "qd", descriptor = "I")
	public int anInt2553;

	@OriginalMember(owner = "client!r", name = "sd", descriptor = "Lclient!he;")
	public Class28 aClass28_1;

	@OriginalMember(owner = "client!r", name = "ud", descriptor = "I")
	public int anInt2555;

	@OriginalMember(owner = "client!r", name = "Dd", descriptor = "Lclient!kd;")
	public Class39 aClass39_1234;

	@OriginalMember(owner = "client!r", name = "Uc", descriptor = "I")
	public int anInt2536 = -1;

	@OriginalMember(owner = "client!r", name = "Yc", descriptor = "I")
	public int anInt2540 = 0;

	@OriginalMember(owner = "client!r", name = "ad", descriptor = "I")
	public int anInt2542 = -1;

	@OriginalMember(owner = "client!r", name = "gd", descriptor = "I")
	public int anInt2546 = 0;

	@OriginalMember(owner = "client!r", name = "Ad", descriptor = "I")
	public int anInt2558 = 0;

	@OriginalMember(owner = "client!r", name = "Bd", descriptor = "I")
	public int anInt2559 = 0;

	@OriginalMember(owner = "client!r", name = "pd", descriptor = "I")
	public int anInt2552 = 0;

	@OriginalMember(owner = "client!r", name = "md", descriptor = "Z")
	public boolean aBoolean204 = false;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!qc;)V")
	public void method1804(@OriginalArg(1) Class1_Sub18 arg0) {
		arg0.anInt3078 = 0;
		@Pc(12) int local12 = arg0.method2169();
		this.anInt2542 = arg0.method2178();
		@Pc(20) int[] local20 = new int[12];
		@Pc(22) int local22 = -1;
		this.anInt2536 = arg0.method2178();
		this.anInt2552 = 0;
		@Pc(50) int local50;
		@Pc(90) int local90;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method2169();
			if (local38 == 0) {
				local20[local32] = 0;
			} else {
				local50 = arg0.method2169();
				local20[local32] = local50 + (local38 << 8);
				if (local32 == 0 && local20[0] == 65535) {
					local22 = arg0.method2156();
					break;
				}
				if (local20[local32] >= 512) {
					local90 = Static8.method224(local20[local32] - 512).anInt2732;
					if (local90 != 0) {
						this.anInt2552 = local90;
					}
				}
			}
		}
		@Pc(107) int[] local107 = new int[5];
		for (local50 = 0; local50 < 5; local50++) {
			local90 = arg0.method2169();
			if (local90 < 0 || Static76.aShortArrayArray1[local50].length <= local90) {
				local90 = 0;
			}
			local107[local50] = local90;
		}
		super.anInt2503 = arg0.method2156();
		if (super.anInt2503 == 65535) {
			super.anInt2503 = -1;
		}
		super.anInt2491 = arg0.method2156();
		if (super.anInt2491 == 65535) {
			super.anInt2491 = -1;
		}
		super.anInt2487 = super.anInt2491;
		super.anInt2520 = arg0.method2156();
		if (super.anInt2520 == 65535) {
			super.anInt2520 = -1;
		}
		super.anInt2504 = arg0.method2156();
		if (super.anInt2504 == 65535) {
			super.anInt2504 = -1;
		}
		super.anInt2496 = arg0.method2156();
		if (super.anInt2496 == 65535) {
			super.anInt2496 = -1;
		}
		super.anInt2505 = arg0.method2156();
		if (super.anInt2505 == 65535) {
			super.anInt2505 = -1;
		}
		super.anInt2517 = arg0.method2156();
		if (super.anInt2517 == 65535) {
			super.anInt2517 = -1;
		}
		this.aClass39_1234 = Static75.method1290(arg0.method2182()).method1153();
		this.anInt2546 = arg0.method2169();
		this.anInt2540 = arg0.method2156();
		if (this.aClass28_1 == null) {
			this.aClass28_1 = new Class28();
		}
		this.aClass28_1.method868(local12 == 1, local20, local22, local107);
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)Lclient!na;")
	@Override
	public Class1_Sub1_Sub2_Sub7 method1790() {
		if (this.aClass28_1 == null) {
			return null;
		}
		@Pc(31) Class1_Sub1_Sub7 local31 = super.anInt2526 != -1 && super.anInt2492 == 0 ? Static82.method1398(super.anInt2526) : null;
		@Pc(52) Class1_Sub1_Sub7 local52 = super.anInt2495 == -1 || this.aBoolean204 || super.anInt2503 == super.anInt2495 && local31 != null ? null : Static82.method1398(super.anInt2495);
		@Pc(63) Class1_Sub1_Sub2_Sub7 local63 = this.aClass28_1.method866(super.anInt2485, super.anInt2524, local52, local31);
		if (local63 == null) {
			return null;
		}
		local63.method1371();
		super.anInt2488 = local63.anInt2467;
		@Pc(94) Class1_Sub1_Sub2_Sub7 local94;
		@Pc(114) Class1_Sub1_Sub2_Sub7[] local114;
		if (!this.aBoolean204 && super.anInt2535 != -1 && super.anInt2506 != -1) {
			local94 = Static64.method1146(super.anInt2535).method1840(super.anInt2506);
			if (local94 != null) {
				local94.method1376(0, -super.anInt2497, 0);
				local114 = new Class1_Sub1_Sub2_Sub7[] { local63, local94 };
				local63 = new Class1_Sub1_Sub2_Sub7(local114, 2);
			}
		}
		if (!this.aBoolean204 && this.aClass1_Sub1_Sub2_Sub7_3 != null) {
			if (this.anInt2558 <= Static45.anInt1256) {
				this.aClass1_Sub1_Sub2_Sub7_3 = null;
			}
			if (Static45.anInt1256 >= this.anInt2559 && Static45.anInt1256 < this.anInt2558) {
				local94 = this.aClass1_Sub1_Sub2_Sub7_3;
				local114 = new Class1_Sub1_Sub2_Sub7[] { local63, local94 };
				local94.method1376(this.anInt2538 - super.anInt2521, this.anInt2555 + -this.anInt2537, this.anInt2547 - super.anInt2508);
				if (super.anInt2533 == 512) {
					local94.method1374();
					local94.method1374();
					local94.method1374();
				} else if (super.anInt2533 == 1024) {
					local94.method1374();
					local94.method1374();
				} else if (super.anInt2533 == 1536) {
					local94.method1374();
				}
				local63 = new Class1_Sub1_Sub2_Sub7(local114, 2);
				if (super.anInt2533 == 512) {
					local94.method1374();
				} else if (super.anInt2533 == 1024) {
					local94.method1374();
					local94.method1374();
				} else if (super.anInt2533 == 1536) {
					local94.method1374();
					local94.method1374();
					local94.method1374();
				}
				local94.method1376(super.anInt2521 - this.anInt2538, this.anInt2537 - this.anInt2555, super.anInt2508 - this.anInt2547);
			}
		}
		local63.aBoolean162 = true;
		return local63;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method1797() {
		return this.aClass28_1 != null;
	}
}
