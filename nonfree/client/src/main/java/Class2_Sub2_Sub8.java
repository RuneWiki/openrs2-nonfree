import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
	public int anInt1238;

	@OriginalMember(owner = "client!ej", name = "E", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!ej", name = "N", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!ej", name = "Q", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
	private int anInt1245;

	@OriginalMember(owner = "client!ej", name = "W", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
	private int anInt1236 = 128;

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
	private int anInt1233 = 0;

	@OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
	private int anInt1239 = 0;

	@OriginalMember(owner = "client!ej", name = "F", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
	public int anInt1240 = -1;

	@OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
	private int anInt1242 = 128;

	@OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
	private int anInt1244 = 0;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!ra;)V")
	public void method954(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method260();
			if (local13 == 0) {
				return;
			}
			this.method956(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)Lclient!gj;")
	public Class24_Sub3 method955(@OriginalArg(0) int arg0) {
		@Pc(17) Class24_Sub3 local17 = (Class24_Sub3) Static108.aClass91_9.method2702((long) this.anInt1238);
		if (local17 == null) {
			@Pc(29) Class24_Sub7 local29 = Static198.method2988(Static190.aClass28_176, this.anInt1245);
			if (local29 == null) {
				return null;
			}
			@Pc(38) int local38;
			if (this.aShortArray16 != null) {
				for (local38 = 0; local38 < this.aShortArray16.length; local38++) {
					local29.method2986(this.aShortArray16[local38], this.aShortArray17[local38]);
				}
			}
			if (this.aShortArray18 != null) {
				for (local38 = 0; local38 < this.aShortArray18.length; local38++) {
					local29.method2998(this.aShortArray18[local38], this.aShortArray19[local38]);
				}
			}
			local17 = local29.method2991(this.anInt1239 + 64, 850 - -this.anInt1233, -30, -50, -30);
			Static108.aClass91_9.method2710((long) this.anInt1238, local17);
		}
		@Pc(114) Class24_Sub3 local114;
		if (this.anInt1240 == -1 || arg0 == -1) {
			local114 = local17.method2725(true);
		} else {
			local114 = Static213.method3229(this.anInt1240).method1770(local17, arg0);
		}
		if (this.anInt1242 != 128 || this.anInt1236 != 128) {
			local114.method2738(this.anInt1242, this.anInt1236, this.anInt1242);
		}
		if (this.anInt1244 != 0) {
			if (this.anInt1244 == 90) {
				local114.method2724();
			}
			if (this.anInt1244 == 180) {
				local114.method2740();
			}
			if (this.anInt1244 == 270) {
				local114.method2729();
			}
		}
		return local114;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ra;IB)V")
	private void method956(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1245 = arg0.method269();
		} else if (arg1 == 2) {
			this.anInt1240 = arg0.method269();
		} else if (arg1 == 4) {
			this.anInt1242 = arg0.method269();
		} else if (arg1 == 5) {
			this.anInt1236 = arg0.method269();
		} else if (arg1 == 6) {
			this.anInt1244 = arg0.method269();
		} else if (arg1 == 7) {
			this.anInt1239 = arg0.method260();
		} else if (arg1 == 8) {
			this.anInt1233 = arg0.method260();
		} else if (arg1 == 9) {
			this.aBoolean71 = true;
		} else {
			@Pc(66) int local66;
			@Pc(76) int local76;
			if (arg1 == 40) {
				local66 = arg0.method260();
				this.aShortArray16 = new short[local66];
				this.aShortArray17 = new short[local66];
				for (local76 = 0; local76 < local66; local76++) {
					this.aShortArray16[local76] = (short) arg0.method269();
					this.aShortArray17[local76] = (short) arg0.method269();
				}
			} else if (arg1 == 41) {
				local66 = arg0.method260();
				this.aShortArray18 = new short[local66];
				this.aShortArray19 = new short[local66];
				for (local76 = 0; local76 < local66; local76++) {
					this.aShortArray18[local76] = (short) arg0.method269();
					this.aShortArray19[local76] = (short) arg0.method269();
				}
			}
		}
	}
}
