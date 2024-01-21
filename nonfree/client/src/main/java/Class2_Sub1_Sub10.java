import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!od", name = "R", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!od", name = "X", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!od", name = "ab", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!od", name = "eb", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!od", name = "lb", descriptor = "I")
	public int anInt1799 = -1;

	@OriginalMember(owner = "client!od", name = "fb", descriptor = "Z")
	public boolean aBoolean69 = false;

	@OriginalMember(owner = "client!od", name = "V", descriptor = "[I")
	private final int[] anIntArray238 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)Lclient!ed;")
	public Class2_Sub1_Sub1_Sub2 method1348() {
		@Pc(12) Class2_Sub1_Sub1_Sub2[] local12 = new Class2_Sub1_Sub1_Sub2[5];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
			if (this.anIntArray238[local20] != -1) {
				local12[local18++] = Static27.method559(Static12.aClass56_4, this.anIntArray238[local20]);
			}
		}
		@Pc(50) Class2_Sub1_Sub1_Sub2 local50 = new Class2_Sub1_Sub1_Sub2(local12, local18);
		@Pc(55) int local55;
		if (this.aShortArray22 != null) {
			for (local55 = 0; local55 < this.aShortArray22.length; local55++) {
				local50.method544(this.aShortArray22[local55], this.aShortArray21[local55]);
			}
		}
		if (this.aShortArray23 != null) {
			for (local55 = 0; local55 < this.aShortArray23.length; local55++) {
				local50.method555(this.aShortArray23[local55], this.aShortArray20[local55]);
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(B)Z")
	public boolean method1350() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray238[local9] != -1 && !Static12.aClass56_4.method1670(this.anIntArray238[local9], 0)) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(B)Z")
	public boolean method1351() {
		if (this.anIntArray239 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray239.length; local19++) {
			if (!Static12.aClass56_4.method1670(this.anIntArray239[local19], 0)) {
				local17 = false;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Lclient!ed;")
	public Class2_Sub1_Sub1_Sub2 method1352() {
		if (this.anIntArray239 == null) {
			return null;
		}
		@Pc(15) Class2_Sub1_Sub1_Sub2[] local15 = new Class2_Sub1_Sub1_Sub2[this.anIntArray239.length];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray239.length; local22++) {
			local15[local22] = Static27.method559(Static12.aClass56_4, this.anIntArray239[local22]);
		}
		@Pc(57) Class2_Sub1_Sub1_Sub2 local57;
		if (local15.length == 1) {
			local57 = local15[0];
		} else {
			local57 = new Class2_Sub1_Sub1_Sub2(local15, local15.length);
		}
		@Pc(68) int local68;
		if (this.aShortArray22 != null) {
			for (local68 = 0; local68 < this.aShortArray22.length; local68++) {
				local57.method544(this.aShortArray22[local68], this.aShortArray21[local68]);
			}
		}
		if (this.aShortArray23 != null) {
			for (local68 = 0; local68 < this.aShortArray23.length; local68++) {
				local57.method555(this.aShortArray23[local68], this.aShortArray20[local68]);
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!be;II)V")
	private void method1353(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1799 = arg0.method933();
			return;
		}
		@Pc(25) int local25;
		@Pc(31) int local31;
		if (arg1 == 2) {
			local25 = arg0.method933();
			this.anIntArray239 = new int[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.anIntArray239[local31] = arg0.method896();
			}
		} else if (arg1 == 3) {
			this.aBoolean69 = true;
		} else if (arg1 == 40) {
			local25 = arg0.method933();
			this.aShortArray21 = new short[local25];
			this.aShortArray22 = new short[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.aShortArray22[local31] = (short) arg0.method896();
				this.aShortArray21[local31] = (short) arg0.method896();
			}
		} else if (arg1 == 41) {
			local25 = arg0.method933();
			this.aShortArray20 = new short[local25];
			this.aShortArray23 = new short[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.aShortArray23[local31] = (short) arg0.method896();
				this.aShortArray20[local31] = (short) arg0.method896();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray238[arg1 - 60] = arg0.method896();
			return;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!be;B)V")
	public void method1355(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method933();
			if (local10 == 0) {
				return;
			}
			this.method1353(arg0, local10);
		}
	}
}
