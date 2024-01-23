import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class179 {

	@OriginalMember(owner = "client!w", name = "e", descriptor = "[I")
	private int[] anIntArray508;

	@OriginalMember(owner = "client!w", name = "i", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!w", name = "j", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Z")
	public boolean aBoolean476 = false;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "[I")
	private int[] anIntArray509 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!w", name = "p", descriptor = "I")
	public int anInt5892 = -1;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)Lclient!tf;")
	public Class36_Sub6 method4720() {
		@Pc(8) Class36_Sub6[] local8 = new Class36_Sub6[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray509[local12] != -1) {
				local8[local10++] = Static252.method4038(Static144.aClass84_58, this.anIntArray509[local12]);
			}
		}
		@Pc(45) Class36_Sub6 local45 = new Class36_Sub6(local8, local10);
		@Pc(50) int local50;
		if (this.aShortArray89 != null) {
			for (local50 = 0; local50 < this.aShortArray89.length; local50++) {
				local45.method4060(this.aShortArray89[local50], this.aShortArray90[local50]);
			}
		}
		if (this.aShortArray91 != null) {
			for (local50 = 0; local50 < this.aShortArray91.length; local50++) {
				local45.method4052(this.aShortArray91[local50], this.aShortArray92[local50]);
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Lclient!tf;")
	public Class36_Sub6 method4721() {
		if (this.anIntArray508 == null) {
			return null;
		}
		@Pc(23) Class36_Sub6[] local23 = new Class36_Sub6[this.anIntArray508.length];
		for (@Pc(25) int local25 = 0; local25 < this.anIntArray508.length; local25++) {
			local23[local25] = Static252.method4038(Static144.aClass84_58, this.anIntArray508[local25]);
		}
		@Pc(55) Class36_Sub6 local55;
		if (local23.length == 1) {
			local55 = local23[0];
		} else {
			local55 = new Class36_Sub6(local23, local23.length);
		}
		@Pc(69) int local69;
		if (this.aShortArray89 != null) {
			for (local69 = 0; local69 < this.aShortArray89.length; local69++) {
				local55.method4060(this.aShortArray89[local69], this.aShortArray90[local69]);
			}
		}
		if (this.aShortArray91 != null) {
			for (local69 = 0; local69 < this.aShortArray91.length; local69++) {
				local55.method4052(this.aShortArray91[local69], this.aShortArray92[local69]);
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!wm;I)V")
	public void method4725(@OriginalArg(0) Class2_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4261();
			if (local5 == 0) {
				return;
			}
			this.method4726(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BILclient!wm;)V")
	private void method4726(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt5892 = arg1.method4261();
			return;
		}
		@Pc(13) int local13;
		@Pc(19) int local19;
		if (arg0 == 2) {
			local13 = arg1.method4261();
			this.anIntArray508 = new int[local13];
			for (local19 = 0; local19 < local13; local19++) {
				this.anIntArray508[local19] = arg1.method4242();
			}
		} else if (arg0 == 3) {
			this.aBoolean476 = true;
		} else if (arg0 == 40) {
			local13 = arg1.method4261();
			this.aShortArray90 = new short[local13];
			this.aShortArray89 = new short[local13];
			for (local19 = 0; local19 < local13; local19++) {
				this.aShortArray89[local19] = (short) arg1.method4242();
				this.aShortArray90[local19] = (short) arg1.method4242();
			}
		} else if (arg0 == 41) {
			local13 = arg1.method4261();
			this.aShortArray91 = new short[local13];
			this.aShortArray92 = new short[local13];
			for (local19 = 0; local19 < local13; local19++) {
				this.aShortArray91[local19] = (short) arg1.method4242();
				this.aShortArray92[local19] = (short) arg1.method4242();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray509[arg0 - 60] = arg1.method4242();
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Z")
	public boolean method4729() {
		if (this.anIntArray508 == null) {
			return true;
		}
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray508.length; local22++) {
			if (!Static144.aClass84_58.method2147(0, this.anIntArray508[local22])) {
				local20 = false;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(B)Z")
	public boolean method4730() {
		@Pc(3) boolean local3 = true;
		for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
			if (this.anIntArray509[local13] != -1 && !Static144.aClass84_58.method2147(0, this.anIntArray509[local13])) {
				local3 = false;
			}
		}
		return local3;
	}
}
