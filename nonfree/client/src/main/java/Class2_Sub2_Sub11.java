import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class2_Sub2_Sub11 extends Class2_Sub2 {

	@OriginalMember(owner = "client!kh", name = "L", descriptor = "[I")
	public int[] anIntArray248;

	@OriginalMember(owner = "client!kh", name = "O", descriptor = "[I")
	public int[] anIntArray249;

	@OriginalMember(owner = "client!kh", name = "Q", descriptor = "[I")
	public int[] anIntArray250;

	@OriginalMember(owner = "client!kh", name = "Y", descriptor = "Lclient!i;")
	public Class41 aClass41_748;

	@OriginalMember(owner = "client!kh", name = "ab", descriptor = "[I")
	public int[] anIntArray251;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)I")
	public int method1768(@OriginalArg(1) int arg0) {
		if (this.anIntArray250 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray250.length; local10++) {
			if (this.anIntArray251[local10] == arg0) {
				return this.anIntArray250[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!ea;B)V")
	private void method1769(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3 arg1) {
		if (arg0 == 1) {
			this.aClass41_748 = arg1.method160();
			return;
		}
		@Pc(22) int local22;
		@Pc(32) int local32;
		@Pc(45) int local45;
		if (arg0 == 2) {
			local22 = arg1.method209();
			this.anIntArray249 = new int[local22];
			this.anIntArray248 = new int[local22];
			for (local32 = 0; local32 < local22; local32++) {
				this.anIntArray248[local32] = arg1.method163();
				local45 = arg1.method209();
				if (local45 == 0) {
					this.anIntArray249[local32] = -1;
				} else {
					this.anIntArray249[local32] = local45;
				}
			}
		} else if (arg0 == 3) {
			local22 = arg1.method209();
			this.anIntArray251 = new int[local22];
			this.anIntArray250 = new int[local22];
			for (local32 = 0; local32 < local22; local32++) {
				this.anIntArray250[local32] = arg1.method163();
				local45 = arg1.method209();
				if (local45 == 0) {
					this.anIntArray251[local32] = -1;
				} else {
					this.anIntArray251[local32] = local45;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLclient!ea;)V")
	public void method1770(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method209();
			if (local14 == 0) {
				return;
			}
			this.method1769(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(II)I")
	public int method1772(@OriginalArg(0) int arg0) {
		if (this.anIntArray248 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray248.length; local12++) {
			if (this.anIntArray249[local12] == arg0) {
				return this.anIntArray248[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(Z)V")
	public void method1773() {
		@Pc(10) int local10;
		if (this.anIntArray250 != null) {
			for (local10 = 0; local10 < this.anIntArray250.length; local10++) {
				this.anIntArray250[local10] |= 0x8000;
			}
		}
		if (this.anIntArray248 != null) {
			for (local10 = 0; local10 < this.anIntArray248.length; local10++) {
				this.anIntArray248[local10] |= 0x8000;
			}
		}
	}
}
