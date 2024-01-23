import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class69 {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
	public int anInt2559;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
	private int anInt2568;

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "Z")
	public boolean aBoolean217 = false;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
	private int anInt2557 = 0;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
	private int anInt2564 = 128;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
	public int anInt2562 = -1;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
	private int anInt2563 = 128;

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
	private int anInt2567 = 0;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
	private int anInt2570 = 0;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)Lclient!nb;")
	public Class5_Sub3 method2008(@OriginalArg(1) int arg0) {
		@Pc(15) Class5_Sub3 local15 = (Class5_Sub3) Static185.aClass61_92.method1693((long) this.anInt2559);
		if (local15 == null) {
			@Pc(23) Class5_Sub1 local23 = Static9.method277(Static31.aClass28_51, this.anInt2568);
			if (local23 == null) {
				return null;
			}
			@Pc(32) int local32;
			if (this.aShortArray33 != null) {
				for (local32 = 0; local32 < this.aShortArray33.length; local32++) {
					local23.method271(this.aShortArray33[local32], this.aShortArray32[local32]);
				}
			}
			if (this.aShortArray34 != null) {
				for (local32 = 0; local32 < this.aShortArray34.length; local32++) {
					local23.method278(this.aShortArray34[local32], this.aShortArray35[local32]);
				}
			}
			local15 = local23.method274(this.anInt2570 + 64, this.anInt2557 + 850, -30, -50, -30);
			Static185.aClass61_92.method1694((long) this.anInt2559, local15);
		}
		@Pc(112) Class5_Sub3 local112;
		if (this.anInt2562 == -1 || arg0 == -1) {
			local112 = local15.method546(true, true);
		} else {
			local112 = Static2.method88(this.anInt2562).method2696(local15, arg0);
		}
		if (this.anInt2564 != 128 || this.anInt2563 != 128) {
			local112.method538(this.anInt2564, this.anInt2563, this.anInt2564);
		}
		if (this.anInt2567 != 0) {
			if (this.anInt2567 == 90) {
				local112.method547();
			}
			if (this.anInt2567 == 180) {
				local112.method534();
			}
			if (this.anInt2567 == 270) {
				local112.method541();
			}
		}
		return local112;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!vf;I)V")
	public void method2009(@OriginalArg(0) Class1_Sub26 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2945();
			if (local17 == 0) {
				return;
			}
			this.method2011(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILclient!vf;)V")
	private void method2011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt2568 = arg1.method2964();
		} else if (arg0 == 2) {
			this.anInt2562 = arg1.method2964();
		} else if (arg0 == 4) {
			this.anInt2564 = arg1.method2964();
		} else if (arg0 == 5) {
			this.anInt2563 = arg1.method2964();
		} else if (arg0 == 6) {
			this.anInt2567 = arg1.method2964();
		} else if (arg0 == 7) {
			this.anInt2570 = arg1.method2945();
		} else if (arg0 == 8) {
			this.anInt2557 = arg1.method2945();
		} else if (arg0 == 9) {
			this.aBoolean217 = true;
		} else {
			@Pc(74) int local74;
			@Pc(84) int local84;
			if (arg0 == 40) {
				local74 = arg1.method2945();
				this.aShortArray33 = new short[local74];
				this.aShortArray32 = new short[local74];
				for (local84 = 0; local84 < local74; local84++) {
					this.aShortArray33[local84] = (short) arg1.method2964();
					this.aShortArray32[local84] = (short) arg1.method2964();
				}
			} else if (arg0 == 41) {
				local74 = arg1.method2945();
				this.aShortArray35 = new short[local74];
				this.aShortArray34 = new short[local74];
				for (local84 = 0; local84 < local74; local84++) {
					this.aShortArray34[local84] = (short) arg1.method2964();
					this.aShortArray35[local84] = (short) arg1.method2964();
				}
			}
		}
	}
}
