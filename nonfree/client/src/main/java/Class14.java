import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class14 {

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
	public int anInt635;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
	private int anInt636;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
	private int anInt632 = 0;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Z")
	public boolean aBoolean33 = false;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "Z")
	public boolean aBoolean34 = false;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
	private int anInt639 = 0;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
	public int anInt634 = -1;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
	private int anInt628 = 0;

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
	private int anInt638 = 128;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
	private int anInt633 = 128;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!ql;I)V")
	private void method330(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt636 = arg0.method1764();
		} else if (arg1 == 2) {
			this.anInt634 = arg0.method1764();
		} else if (arg1 == 4) {
			this.anInt638 = arg0.method1764();
		} else if (arg1 == 5) {
			this.anInt633 = arg0.method1764();
		} else if (arg1 == 6) {
			this.anInt628 = arg0.method1764();
		} else if (arg1 == 7) {
			this.anInt632 = arg0.method1772();
		} else if (arg1 == 8) {
			this.anInt639 = arg0.method1772();
		} else if (arg1 == 9) {
			this.aBoolean34 = true;
		} else if (arg1 == 10) {
			this.aBoolean33 = true;
		} else {
			@Pc(91) int local91;
			@Pc(101) int local101;
			if (arg1 == 40) {
				local91 = arg0.method1772();
				this.aShortArray1 = new short[local91];
				this.aShortArray2 = new short[local91];
				for (local101 = 0; local101 < local91; local101++) {
					this.aShortArray1[local101] = (short) arg0.method1764();
					this.aShortArray2[local101] = (short) arg0.method1764();
				}
				return;
			}
			if (arg1 == 41) {
				local91 = arg0.method1772();
				this.aShortArray3 = new short[local91];
				this.aShortArray4 = new short[local91];
				for (local101 = 0; local101 < local91; local101++) {
					this.aShortArray4[local101] = (short) arg0.method1764();
					this.aShortArray3[local101] = (short) arg0.method1764();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLclient!ql;)V")
	public void method331(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1772();
			if (local5 == 0) {
				return;
			}
			this.method330(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIZ)Lclient!gh;")
	public Class9_Sub5 method332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class9_Sub5 local13 = (Class9_Sub5) Static222.aClass79_34.method2483((long) this.anInt635);
		if (local13 == null) {
			@Pc(21) Class9_Sub3 local21 = Static27.method545(Static42.aClass51_15, this.anInt636);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray1 != null) {
				for (local30 = 0; local30 < this.aShortArray1.length; local30++) {
					local21.method528(this.aShortArray1[local30], this.aShortArray2[local30]);
				}
			}
			if (this.aShortArray4 != null) {
				for (local30 = 0; local30 < this.aShortArray4.length; local30++) {
					local21.method529(this.aShortArray4[local30], this.aShortArray3[local30]);
				}
			}
			local13 = local21.method526(this.anInt632 + 64, 850 - -this.anInt639, -30, -50, -30);
			Static222.aClass79_34.method2486(local13, (long) this.anInt635);
		}
		@Pc(125) Class9_Sub5 local125;
		if (this.anInt634 == -1 || arg1 == -1) {
			local125 = local13.method3625(true, true, true);
		} else {
			local125 = Static131.method697(this.anInt634).method1634(arg2, local13, arg0, arg1);
		}
		if (this.anInt638 != 128 || this.anInt633 != 128) {
			local125.method3606(this.anInt638, this.anInt633, this.anInt638);
		}
		if (this.anInt628 != 0) {
			if (this.anInt628 == 90) {
				local125.method3626();
			}
			if (this.anInt628 == 180) {
				local125.method3618();
			}
			if (this.anInt628 == 270) {
				local125.method3612();
			}
		}
		return local125;
	}
}
