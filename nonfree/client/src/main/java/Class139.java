import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class139 {

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
	public int anInt5098;

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
	private int anInt5104;

	@OriginalMember(owner = "client!rj", name = "v", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
	private int anInt5095 = 128;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
	private int anInt5094 = 0;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
	private int anInt5090 = 0;

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
	private int anInt5103 = 0;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "Z")
	public boolean aBoolean276 = false;

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "Z")
	public boolean aBoolean277 = false;

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
	public int anInt5107 = -1;

	@OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
	private int anInt5108 = 128;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!im;B)V")
	private void method4026(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16 arg1) {
		if (arg0 == 1) {
			this.anInt5104 = arg1.method2652();
		} else if (arg0 == 2) {
			this.anInt5107 = arg1.method2652();
		} else if (arg0 == 4) {
			this.anInt5108 = arg1.method2652();
		} else if (arg0 == 5) {
			this.anInt5095 = arg1.method2652();
		} else if (arg0 == 6) {
			this.anInt5094 = arg1.method2652();
		} else if (arg0 == 7) {
			this.anInt5090 = arg1.method2655();
		} else if (arg0 == 8) {
			this.anInt5103 = arg1.method2655();
		} else if (arg0 == 9) {
			this.aBoolean276 = true;
		} else if (arg0 == 10) {
			this.aBoolean277 = true;
		} else {
			@Pc(75) int local75;
			@Pc(85) int local85;
			if (arg0 == 40) {
				local75 = arg1.method2655();
				this.aShortArray76 = new short[local75];
				this.aShortArray78 = new short[local75];
				for (local85 = 0; local85 < local75; local85++) {
					this.aShortArray76[local85] = (short) arg1.method2652();
					this.aShortArray78[local85] = (short) arg1.method2652();
				}
			} else if (arg0 == 41) {
				local75 = arg1.method2655();
				this.aShortArray77 = new short[local75];
				this.aShortArray79 = new short[local75];
				for (local85 = 0; local85 < local75; local85++) {
					this.aShortArray79[local85] = (short) arg1.method2652();
					this.aShortArray77[local85] = (short) arg1.method2652();
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!im;Z)V")
	public void method4028(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2655();
			if (local9 == 0) {
				return;
			}
			this.method4026(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBII)Lclient!lf;")
	public Class25_Sub2 method4030(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class25_Sub2 local18 = (Class25_Sub2) Static200.aClass155_32.method4358((long) this.anInt5098);
		if (local18 == null) {
			@Pc(28) Class25_Sub3 local28 = Static149.method2801(Static146.aClass83_108, this.anInt5104);
			if (local28 == null) {
				return null;
			}
			@Pc(38) int local38;
			if (this.aShortArray76 != null) {
				for (local38 = 0; local38 < this.aShortArray76.length; local38++) {
					local28.method2826(this.aShortArray76[local38], this.aShortArray78[local38]);
				}
			}
			if (this.aShortArray79 != null) {
				for (local38 = 0; local38 < this.aShortArray79.length; local38++) {
					local28.method2798(this.aShortArray79[local38], this.aShortArray77[local38]);
				}
			}
			local18 = local28.method2821(this.anInt5090 + 64, this.anInt5103 + 850, -30, -50, -30);
			Static200.aClass155_32.method4360((long) this.anInt5098, local18);
		}
		@Pc(122) Class25_Sub2 local122;
		if (this.anInt5107 == -1 || arg2 == -1) {
			local122 = local18.method3463(true, true, true);
		} else {
			local122 = Static115.method1895(this.anInt5107).method4579(arg1, arg2, arg0, local18);
		}
		if (this.anInt5108 != 128 || this.anInt5095 != 128) {
			local122.method3486(this.anInt5108, this.anInt5095, this.anInt5108);
		}
		if (this.anInt5094 != 0) {
			if (this.anInt5094 == 90) {
				local122.method3467();
			}
			if (this.anInt5094 == 180) {
				local122.method3490();
			}
			if (this.anInt5094 == 270) {
				local122.method3483();
			}
		}
		return local122;
	}
}
