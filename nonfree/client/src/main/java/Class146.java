import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class146 {

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "Lclient!oha;")
	public Class245 aClass245_1;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "[I")
	private final int[] anIntArray258 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)Lclient!bh;")
	public Class32 method4408() {
		if (this.anIntArray259 == null) {
			return null;
		}
		@Pc(15) Class32[] local15 = new Class32[this.anIntArray259.length];
		@Pc(19) Class157 local19 = this.aClass245_1.aClass157_203;
		@Pc(23) int local23;
		synchronized (this.aClass245_1.aClass157_203) {
			local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray259.length) {
					break;
				}
				local15[local23] = Static630.method9136(this.aClass245_1.aClass157_203, this.anIntArray259[local23]);
				local23++;
			}
		}
		for (@Pc(52) int local52 = 0; local52 < this.anIntArray259.length; local52++) {
			if (local15[local52].anInt1677 < 13) {
				local15[local52].method1592();
			}
		}
		@Pc(91) Class32 local91;
		if (local15.length == 1) {
			local91 = local15[0];
		} else {
			local91 = new Class32(local15, local15.length);
		}
		if (local91 == null) {
			return null;
		}
		if (this.aShortArray58 != null) {
			for (local23 = 0; local23 < this.aShortArray58.length; local23++) {
				local91.method1598(this.aShortArray58[local23], this.aShortArray60[local23]);
			}
		}
		if (this.aShortArray57 != null) {
			for (local23 = 0; local23 < this.aShortArray57.length; local23++) {
				local91.method1595(this.aShortArray57[local23], this.aShortArray59[local23]);
			}
		}
		return local91;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Z")
	public boolean method4409() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class157 local11 = this.aClass245_1.aClass157_203;
		synchronized (this.aClass245_1.aClass157_203) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray258[local15] != -1 && !this.aClass245_1.aClass157_203.method4574(this.anIntArray258[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)Lclient!bh;")
	public Class32 method4410() {
		@Pc(8) Class32[] local8 = new Class32[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class157 local14 = this.aClass245_1.aClass157_203;
		@Pc(18) int local18;
		synchronized (this.aClass245_1.aClass157_203) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray258[local18] != -1) {
					local8[local10++] = Static630.method9136(this.aClass245_1.aClass157_203, this.anIntArray258[local18]);
				}
				local18++;
			}
		}
		for (@Pc(55) int local55 = 0; local55 < 5; local55++) {
			if (local8[local55] != null && local8[local55].anInt1677 < 13) {
				local8[local55].method1592();
			}
		}
		@Pc(90) Class32 local90 = new Class32(local8, local10);
		if (this.aShortArray58 != null) {
			for (local18 = 0; local18 < this.aShortArray58.length; local18++) {
				local90.method1598(this.aShortArray58[local18], this.aShortArray60[local18]);
			}
		}
		if (this.aShortArray57 != null) {
			for (local18 = 0; local18 < this.aShortArray57.length; local18++) {
				local90.method1595(this.aShortArray57[local18], this.aShortArray59[local18]);
			}
		}
		return local90;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!cea;B)V")
	private void method4411(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11 arg1) {
		if (arg0 == 1) {
			arg1.method8383();
			return;
		}
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0 == 2) {
			local15 = arg1.method8383();
			this.anIntArray259 = new int[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.anIntArray259[local21] = arg1.method8326();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local15 = arg1.method8383();
				this.aShortArray60 = new short[local15];
				this.aShortArray58 = new short[local15];
				for (local21 = 0; local21 < local15; local21++) {
					this.aShortArray58[local21] = (short) arg1.method8326();
					this.aShortArray60[local21] = (short) arg1.method8326();
				}
			} else if (arg0 == 41) {
				local15 = arg1.method8383();
				this.aShortArray57 = new short[local15];
				this.aShortArray59 = new short[local15];
				for (local21 = 0; local21 < local15; local21++) {
					this.aShortArray57[local21] = (short) arg1.method8326();
					this.aShortArray59[local21] = (short) arg1.method8326();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray258[arg0 - 60] = arg1.method8326();
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!cea;)V")
	public void method4413(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8383();
			if (local9 == 0) {
				return;
			}
			this.method4411(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)Z")
	public boolean method4415() {
		if (this.anIntArray259 == null) {
			return true;
		}
		@Pc(19) boolean local19 = true;
		@Pc(23) Class157 local23 = this.aClass245_1.aClass157_203;
		synchronized (this.aClass245_1.aClass157_203) {
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray259.length; local27++) {
				if (!this.aClass245_1.aClass157_203.method4574(this.anIntArray259[local27], 0)) {
					local19 = false;
				}
			}
			return local19;
		}
	}
}
