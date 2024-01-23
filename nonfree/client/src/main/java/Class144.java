import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class144 {

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
	private int anInt4676;

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
	public int anInt4679;

	@OriginalMember(owner = "client!ri", name = "w", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!ri", name = "B", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
	private int anInt4672 = 0;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
	private int anInt4667 = 0;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
	private int anInt4675 = 128;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
	private int anInt4673 = 128;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "Z")
	public boolean aBoolean375 = false;

	@OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
	public int anInt4680 = -1;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "Z")
	public boolean aBoolean374 = false;

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
	private int anInt4678 = 0;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIBI)Lclient!ie;")
	public Class36_Sub2 method3527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class36_Sub2 local9 = (Class36_Sub2) Static114.aClass61_19.method1384((long) this.anInt4679);
		if (local9 == null) {
			@Pc(22) Class36_Sub7 local22 = Static281.method4202(Static22.aClass132_7, this.anInt4676);
			if (local22 == null) {
				return null;
			}
			@Pc(33) int local33;
			if (this.aShortArray50 != null) {
				for (local33 = 0; local33 < this.aShortArray50.length; local33++) {
					local22.method4200(this.aShortArray50[local33], this.aShortArray51[local33]);
				}
			}
			if (this.aShortArray49 != null) {
				for (local33 = 0; local33 < this.aShortArray49.length; local33++) {
					local22.method4183(this.aShortArray49[local33], this.aShortArray48[local33]);
				}
			}
			local9 = local22.method4193(this.anInt4667 + 64, this.anInt4678 + 850, -30, -50, -30);
			Static114.aClass61_19.method1377((long) this.anInt4679, local9);
		}
		@Pc(114) Class36_Sub2 local114;
		if (this.anInt4680 == -1 || arg0 == -1) {
			local114 = local9.method3957(true, true, true);
		} else {
			local114 = Static115.method1855(this.anInt4680).method1721(arg2, arg0, arg1, local9);
		}
		if (this.anInt4673 != 128 || this.anInt4675 != 128) {
			local114.method3954(this.anInt4673, this.anInt4675, this.anInt4673);
		}
		if (this.anInt4672 != 0) {
			if (this.anInt4672 == 90) {
				local114.method3941();
			}
			if (this.anInt4672 == 180) {
				local114.method3942();
			}
			if (this.anInt4672 == 270) {
				local114.method3940();
			}
		}
		return local114;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!aj;B)V")
	private void method3528(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt4676 = arg1.method2375();
		} else if (arg0 == 2) {
			this.anInt4680 = arg1.method2375();
		} else if (arg0 == 4) {
			this.anInt4673 = arg1.method2375();
		} else if (arg0 == 5) {
			this.anInt4675 = arg1.method2375();
		} else if (arg0 == 6) {
			this.anInt4672 = arg1.method2375();
		} else if (arg0 == 7) {
			this.anInt4667 = arg1.method2334();
		} else if (arg0 == 8) {
			this.anInt4678 = arg1.method2334();
		} else if (arg0 == 9) {
			this.aBoolean375 = true;
		} else if (arg0 == 10) {
			this.aBoolean374 = true;
		} else {
			@Pc(95) int local95;
			@Pc(105) int local105;
			if (arg0 == 40) {
				local95 = arg1.method2334();
				this.aShortArray50 = new short[local95];
				this.aShortArray51 = new short[local95];
				for (local105 = 0; local105 < local95; local105++) {
					this.aShortArray50[local105] = (short) arg1.method2375();
					this.aShortArray51[local105] = (short) arg1.method2375();
				}
			} else if (arg0 == 41) {
				local95 = arg1.method2334();
				this.aShortArray49 = new short[local95];
				this.aShortArray48 = new short[local95];
				for (local105 = 0; local105 < local95; local105++) {
					this.aShortArray49[local105] = (short) arg1.method2375();
					this.aShortArray48[local105] = (short) arg1.method2375();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!aj;)V")
	public void method3530(@OriginalArg(1) Class8_Sub2 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2334();
			if (local17 == 0) {
				return;
			}
			this.method3528(local17, arg0);
		}
	}
}
