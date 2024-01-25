import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class14_Sub25 extends Class14 {

	@OriginalMember(owner = "client!hs", name = "n", descriptor = "Z")
	private boolean aBoolean298;

	@OriginalMember(owner = "client!hs", name = "o", descriptor = "[I")
	private int[] anIntArray332;

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "B")
	public byte aByte80;

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "[Lclient!tf;")
	public Class336[] aClass336Array1;

	@OriginalMember(owner = "client!hs", name = "x", descriptor = "J")
	public long aLong120;

	@OriginalMember(owner = "client!hs", name = "A", descriptor = "B")
	public byte aByte81;

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "Z")
	private boolean aBoolean297 = true;

	@OriginalMember(owner = "client!hs", name = "w", descriptor = "Ljava/lang/String;")
	public String aString48 = null;

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
	public int anInt4216 = 0;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!so;)V")
	public Class14_Sub25(@OriginalArg(0) Class14_Sub29 arg0) {
		this.method3487(arg0);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)V")
	public void method3486(@OriginalArg(1) int arg0) {
		this.anInt4216--;
		if (this.anInt4216 == 0) {
			this.aClass336Array1 = null;
		} else {
			Static681.method2481(this.aClass336Array1, arg0 + 1, this.aClass336Array1, arg0, this.anInt4216 - arg0);
		}
		this.anIntArray332 = null;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!so;)V")
	private void method3487(@OriginalArg(1) Class14_Sub29 arg0) {
		@Pc(9) int local9 = arg0.method5866();
		if ((local9 & 0x2) != 0) {
			this.aBoolean297 = true;
		}
		if ((local9 & 0x1) != 0) {
			this.aBoolean298 = true;
		}
		super.aLong305 = arg0.method5907();
		this.aLong120 = arg0.method5907();
		this.aString48 = arg0.method5898();
		arg0.method5866();
		this.aByte80 = arg0.method5845();
		this.aByte81 = arg0.method5845();
		this.anInt4216 = arg0.method5900();
		if (this.anInt4216 <= 0) {
			return;
		}
		this.aClass336Array1 = new Class336[this.anInt4216];
		for (@Pc(82) int local82 = 0; local82 < this.anInt4216; local82++) {
			@Pc(88) Class336 local88 = new Class336();
			if (this.aBoolean298) {
				arg0.method5907();
			}
			if (this.aBoolean297) {
				local88.aString102 = arg0.method5898();
			}
			local88.aByte135 = arg0.method5845();
			local88.anInt9809 = arg0.method5900();
			this.aClass336Array1[local82] = local88;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!tf;I)V")
	public void method3488(@OriginalArg(0) Class336 arg0) {
		if (this.aClass336Array1 == null || this.anInt4216 >= this.aClass336Array1.length) {
			this.method3490(this.anInt4216 + 5);
		}
		this.aClass336Array1[this.anInt4216++] = arg0;
		this.anIntArray332 = null;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method3489(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4216; local7++) {
			if (this.aClass336Array1[local7].aString102.equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(II)V")
	private void method3490(@OriginalArg(0) int arg0) {
		if (this.aClass336Array1 == null) {
			this.aClass336Array1 = new Class336[arg0];
		} else {
			Static681.method2481(this.aClass336Array1, 0, this.aClass336Array1 = new Class336[arg0], 0, this.anInt4216);
		}
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(B)[I")
	public int[] method3492() {
		if (this.anIntArray332 == null) {
			@Pc(12) String[] local12 = new String[this.anInt4216];
			this.anIntArray332 = new int[this.anInt4216];
			@Pc(19) int local19 = 0;
			while (this.anInt4216 > local19) {
				local12[local19] = this.aClass336Array1[local19].aString102;
				this.anIntArray332[local19] = local19++;
			}
			Static69.method1358(local12, this.anIntArray332);
		}
		return this.anIntArray332;
	}
}
