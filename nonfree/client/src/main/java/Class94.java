import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class94 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!km", name = "g", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!km", name = "j", descriptor = "I")
	public int anInt3362;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!km", name = "r", descriptor = "I")
	private int anInt3366;

	@OriginalMember(owner = "client!km", name = "v", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "I")
	private int anInt3358 = 0;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "I")
	private int anInt3359 = 0;

	@OriginalMember(owner = "client!km", name = "o", descriptor = "I")
	private int anInt3364 = 128;

	@OriginalMember(owner = "client!km", name = "n", descriptor = "Z")
	public boolean aBoolean219 = false;

	@OriginalMember(owner = "client!km", name = "q", descriptor = "I")
	private int anInt3365 = 0;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "Z")
	public boolean aBoolean220 = false;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "I")
	private int anInt3361 = 128;

	@OriginalMember(owner = "client!km", name = "w", descriptor = "I")
	public int anInt3368 = -1;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IBII)Lclient!o;")
	public Class2_Sub1 method2423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class2_Sub1 local9 = (Class2_Sub1) Static135.aClass89_17.method2268((long) this.anInt3362);
		if (local9 == null) {
			@Pc(28) Class2_Sub3 local28 = Static30.method658(Static35.aClass168_28, this.anInt3366);
			if (local28 == null) {
				return null;
			}
			@Pc(38) int local38;
			if (this.aShortArray75 != null) {
				for (local38 = 0; local38 < this.aShortArray75.length; local38++) {
					local28.method656(this.aShortArray75[local38], this.aShortArray74[local38]);
				}
			}
			if (this.aShortArray76 != null) {
				for (local38 = 0; local38 < this.aShortArray76.length; local38++) {
					local28.method636(this.aShortArray76[local38], this.aShortArray77[local38]);
				}
			}
			local9 = local28.method651(this.anInt3358 + 64, this.anInt3365 + 850, -30, -50, -30);
			Static135.aClass89_17.method2272((long) this.anInt3362, local9);
		}
		@Pc(133) Class2_Sub1 local133;
		if (this.anInt3368 == -1 || arg1 == -1) {
			local133 = local9.method564(true, true, true);
		} else {
			local133 = Static202.method3231(this.anInt3368).method802(local9, arg2, arg0, arg1);
		}
		if (this.anInt3364 != 128 || this.anInt3361 != 128) {
			local133.method571(this.anInt3364, this.anInt3361, this.anInt3364);
		}
		if (this.anInt3359 != 0) {
			if (this.anInt3359 == 90) {
				local133.method565();
			}
			if (this.anInt3359 == 180) {
				local133.method567();
			}
			if (this.anInt3359 == 270) {
				local133.method562();
			}
		}
		return local133;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!qm;)V")
	public void method2424(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2199();
			if (local15 == 0) {
				return;
			}
			this.method2427(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!qm;II)V")
	private void method2427(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3366 = arg0.method2244();
		} else if (arg1 == 2) {
			this.anInt3368 = arg0.method2244();
		} else if (arg1 == 4) {
			this.anInt3364 = arg0.method2244();
		} else if (arg1 == 5) {
			this.anInt3361 = arg0.method2244();
		} else if (arg1 == 6) {
			this.anInt3359 = arg0.method2244();
		} else if (arg1 == 7) {
			this.anInt3358 = arg0.method2199();
		} else if (arg1 == 8) {
			this.anInt3365 = arg0.method2199();
		} else if (arg1 == 9) {
			this.aBoolean219 = true;
		} else if (arg1 == 10) {
			this.aBoolean220 = true;
		} else {
			@Pc(92) int local92;
			@Pc(102) int local102;
			if (arg1 == 40) {
				local92 = arg0.method2199();
				this.aShortArray74 = new short[local92];
				this.aShortArray75 = new short[local92];
				for (local102 = 0; local102 < local92; local102++) {
					this.aShortArray75[local102] = (short) arg0.method2244();
					this.aShortArray74[local102] = (short) arg0.method2244();
				}
			} else if (arg1 == 41) {
				local92 = arg0.method2199();
				this.aShortArray77 = new short[local92];
				this.aShortArray76 = new short[local92];
				for (local102 = 0; local102 < local92; local102++) {
					this.aShortArray76[local102] = (short) arg0.method2244();
					this.aShortArray77[local102] = (short) arg0.method2244();
				}
			}
		}
	}
}
