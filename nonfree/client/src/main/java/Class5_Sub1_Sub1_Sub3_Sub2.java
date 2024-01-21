import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class5_Sub1_Sub1_Sub3_Sub2 extends Class5_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!tc", name = "Oc", descriptor = "Lclient!bf;")
	public Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!tc", name = "Pc", descriptor = "I")
	public int anInt2499;

	@OriginalMember(owner = "client!tc", name = "Rc", descriptor = "I")
	public int anInt2501;

	@OriginalMember(owner = "client!tc", name = "Sc", descriptor = "I")
	public int anInt2502;

	@OriginalMember(owner = "client!tc", name = "Yc", descriptor = "Lclient!ib;")
	public Class32 aClass32_2;

	@OriginalMember(owner = "client!tc", name = "gd", descriptor = "I")
	public int anInt2509;

	@OriginalMember(owner = "client!tc", name = "id", descriptor = "I")
	public int anInt2511;

	@OriginalMember(owner = "client!tc", name = "jd", descriptor = "I")
	public int anInt2512;

	@OriginalMember(owner = "client!tc", name = "md", descriptor = "I")
	public int anInt2515;

	@OriginalMember(owner = "client!tc", name = "qd", descriptor = "Lclient!vc;")
	public Class71 aClass71_1236;

	@OriginalMember(owner = "client!tc", name = "sd", descriptor = "I")
	public int anInt2519;

	@OriginalMember(owner = "client!tc", name = "Mc", descriptor = "I")
	public int anInt2498 = 0;

	@OriginalMember(owner = "client!tc", name = "Wc", descriptor = "I")
	public int anInt2504 = 0;

	@OriginalMember(owner = "client!tc", name = "ad", descriptor = "I")
	public int anInt2505 = -1;

	@OriginalMember(owner = "client!tc", name = "Lc", descriptor = "I")
	public int anInt2497 = 0;

	@OriginalMember(owner = "client!tc", name = "bd", descriptor = "I")
	public int anInt2506 = -1;

	@OriginalMember(owner = "client!tc", name = "Kc", descriptor = "I")
	public int anInt2496 = 0;

	@OriginalMember(owner = "client!tc", name = "Xc", descriptor = "Z")
	public boolean aBoolean106 = false;

	@OriginalMember(owner = "client!tc", name = "nd", descriptor = "I")
	public int anInt2516 = 0;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)Lclient!bf;")
	@Override
	public Class5_Sub1_Sub1_Sub2 method1976() {
		if (this.aClass32_2 == null) {
			return null;
		}
		@Pc(27) Class5_Sub1_Sub18 local27 = super.anInt2458 != -1 && super.anInt2471 == 0 ? Static57.method1017(super.anInt2458) : null;
		@Pc(52) Class5_Sub1_Sub18 local52 = super.anInt2470 == -1 || this.aBoolean106 || super.anInt2470 == super.anInt2487 && local27 != null ? null : Static57.method1017(super.anInt2470);
		@Pc(63) Class5_Sub1_Sub1_Sub2 local63 = this.aClass32_2.method927(super.anInt2482, local27, local52, super.anInt2446);
		if (local63 == null) {
			return null;
		}
		local63.method232();
		super.anInt2451 = local63.anInt2987;
		@Pc(94) Class5_Sub1_Sub1_Sub2 local94;
		@Pc(114) Class5_Sub1_Sub1_Sub2[] local114;
		if (!this.aBoolean106 && super.anInt2459 != -1 && super.anInt2464 != -1) {
			local94 = Static109.method1740(super.anInt2459).method1435(super.anInt2464);
			if (local94 != null) {
				local94.method249(0, -super.anInt2432, 0);
				local114 = new Class5_Sub1_Sub1_Sub2[] { local63, local94 };
				local63 = new Class5_Sub1_Sub1_Sub2(local114, 2);
			}
		}
		if (!this.aBoolean106 && this.aClass5_Sub1_Sub1_Sub2_3 != null) {
			if (this.anInt2516 <= Static95.anInt2285) {
				this.aClass5_Sub1_Sub1_Sub2_3 = null;
			}
			if (this.anInt2497 <= Static95.anInt2285 && this.anInt2516 > Static95.anInt2285) {
				local94 = this.aClass5_Sub1_Sub1_Sub2_3;
				local94.method249(this.anInt2515 - super.anInt2474, this.anInt2511 + -this.anInt2509, this.anInt2502 - super.anInt2452);
				local114 = new Class5_Sub1_Sub1_Sub2[] { local63, local94 };
				if (super.anInt2441 == 512) {
					local94.method240();
					local94.method240();
					local94.method240();
				} else if (super.anInt2441 == 1024) {
					local94.method240();
					local94.method240();
				} else if (super.anInt2441 == 1536) {
					local94.method240();
				}
				local63 = new Class5_Sub1_Sub1_Sub2(local114, 2);
				if (super.anInt2441 == 512) {
					local94.method240();
				} else if (super.anInt2441 == 1024) {
					local94.method240();
					local94.method240();
				} else if (super.anInt2441 == 1536) {
					local94.method240();
					local94.method240();
					local94.method240();
				}
				local94.method249(super.anInt2474 - this.anInt2515, -this.anInt2511 + this.anInt2509, super.anInt2452 - this.anInt2502);
			}
		}
		local63.aBoolean8 = true;
		return local63;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!qe;B)V")
	public void method1691(@OriginalArg(0) Class5_Sub11 arg0) {
		arg0.anInt2233 = 0;
		@Pc(8) int local8 = arg0.method1546();
		@Pc(11) int[] local11 = new int[12];
		@Pc(13) int local13 = -1;
		this.anInt2506 = arg0.method1524();
		this.anInt2505 = arg0.method1524();
		this.anInt2498 = 0;
		@Pc(52) int local52;
		@Pc(93) int local93;
		for (@Pc(34) int local34 = 0; local34 < 12; local34++) {
			@Pc(40) int local40 = arg0.method1546();
			if (local40 == 0) {
				local11[local34] = 0;
			} else {
				local52 = arg0.method1546();
				local11[local34] = (local40 << 8) + local52;
				if (local34 == 0 && local11[0] == 65535) {
					local13 = arg0.method1543();
					break;
				}
				if (local11[local34] >= 512) {
					local93 = Static33.method691(local11[local34] - 512).anInt2908;
					if (local93 != 0) {
						this.anInt2498 = local93;
					}
				}
			}
		}
		@Pc(110) int[] local110 = new int[5];
		for (local52 = 0; local52 < 5; local52++) {
			local93 = arg0.method1546();
			if (local93 < 0 || local93 >= Static19.aShortArrayArray1[local52].length) {
				local93 = 0;
			}
			local110[local52] = local93;
		}
		super.anInt2487 = arg0.method1543();
		if (super.anInt2487 == 65535) {
			super.anInt2487 = -1;
		}
		super.anInt2478 = arg0.method1543();
		if (super.anInt2478 == 65535) {
			super.anInt2478 = -1;
		}
		super.anInt2448 = super.anInt2478;
		super.anInt2453 = arg0.method1543();
		if (super.anInt2453 == 65535) {
			super.anInt2453 = -1;
		}
		super.anInt2485 = arg0.method1543();
		if (super.anInt2485 == 65535) {
			super.anInt2485 = -1;
		}
		super.anInt2479 = arg0.method1543();
		if (super.anInt2479 == 65535) {
			super.anInt2479 = -1;
		}
		super.anInt2439 = arg0.method1543();
		if (super.anInt2439 == 65535) {
			super.anInt2439 = -1;
		}
		super.anInt2434 = arg0.method1543();
		if (super.anInt2434 == 65535) {
			super.anInt2434 = -1;
		}
		this.aClass71_1236 = Static88.method1396(arg0.method1537()).method1803();
		this.anInt2496 = arg0.method1546();
		this.anInt2504 = arg0.method1543();
		if (this.aClass32_2 == null) {
			this.aClass32_2 = new Class32();
		}
		this.aClass32_2.method938(local110, local13, local8 == 1, local11);
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method1680() {
		return this.aClass32_2 != null;
	}
}
