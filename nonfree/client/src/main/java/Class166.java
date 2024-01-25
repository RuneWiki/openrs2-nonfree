import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class166 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "Z")
	public boolean aBoolean444 = false;

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "[I")
	private final int[] anIntArray434 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	public int anInt5261 = -1;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Z")
	public boolean method4365() {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class11 local9 = Static1.aClass11_1;
		synchronized (Static1.aClass11_1) {
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray434[local13] != -1 && !Static1.aClass11_1.method276(0, this.anIntArray434[local13])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!tq;BI)V")
	private void method4367(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5261 = arg0.method2380();
			return;
		}
		@Pc(31) int local31;
		@Pc(37) int local37;
		if (arg1 == 2) {
			local31 = arg0.method2380();
			this.anIntArray435 = new int[local31];
			for (local37 = 0; local37 < local31; local37++) {
				this.anIntArray435[local37] = arg0.method2404();
			}
		} else if (arg1 == 3) {
			this.aBoolean444 = true;
		} else if (arg1 == 40) {
			local31 = arg0.method2380();
			this.aShortArray102 = new short[local31];
			this.aShortArray105 = new short[local31];
			for (local37 = 0; local37 < local31; local37++) {
				this.aShortArray102[local37] = (short) arg0.method2404();
				this.aShortArray105[local37] = (short) arg0.method2404();
			}
		} else if (arg1 == 41) {
			local31 = arg0.method2380();
			this.aShortArray104 = new short[local31];
			this.aShortArray103 = new short[local31];
			for (local37 = 0; local37 < local31; local37++) {
				this.aShortArray104[local37] = (short) arg0.method2404();
				this.aShortArray103[local37] = (short) arg0.method2404();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray434[arg1 - 60] = arg0.method2404();
		}
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)Lclient!pe;")
	public Class153 method4369() {
		if (this.anIntArray435 == null) {
			return null;
		}
		@Pc(20) Class153[] local20 = new Class153[this.anIntArray435.length];
		@Pc(22) Class11 local22 = Static1.aClass11_1;
		synchronized (Static1.aClass11_1) {
			@Pc(26) int local26 = 0;
			while (true) {
				if (this.anIntArray435.length <= local26) {
					break;
				}
				local20[local26] = Static169.method3173(Static1.aClass11_1, this.anIntArray435[local26]);
				local26++;
			}
		}
		@Pc(64) Class153 local64;
		if (local20.length == 1) {
			local64 = local20[0];
		} else {
			local64 = new Class153(local20, local20.length);
		}
		if (local64 == null) {
			return null;
		}
		@Pc(78) int local78;
		if (this.aShortArray102 != null) {
			for (local78 = 0; local78 < this.aShortArray102.length; local78++) {
				local64.method4172(this.aShortArray102[local78], this.aShortArray105[local78]);
			}
		}
		if (this.aShortArray104 != null) {
			for (local78 = 0; local78 < this.aShortArray104.length; local78++) {
				local64.method4167(this.aShortArray104[local78], this.aShortArray103[local78]);
			}
		}
		return local64;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!tq;B)V")
	public void method4370(@OriginalArg(0) Class4_Sub7 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method2380();
			if (local11 == 0) {
				return;
			}
			this.method4367(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)Lclient!pe;")
	public Class153 method4371() {
		@Pc(8) Class153[] local8 = new Class153[5];
		@Pc(10) int local10 = 0;
		@Pc(12) Class11 local12 = Static1.aClass11_1;
		synchronized (Static1.aClass11_1) {
			for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
				if (this.anIntArray434[local16] != -1) {
					local8[local10++] = Static169.method3173(Static1.aClass11_1, this.anIntArray434[local16]);
				}
			}
		}
		@Pc(54) Class153 local54 = new Class153(local8, local10);
		@Pc(59) int local59;
		if (this.aShortArray102 != null) {
			for (local59 = 0; local59 < this.aShortArray102.length; local59++) {
				local54.method4172(this.aShortArray102[local59], this.aShortArray105[local59]);
			}
		}
		if (this.aShortArray104 != null) {
			for (local59 = 0; local59 < this.aShortArray104.length; local59++) {
				local54.method4167(this.aShortArray104[local59], this.aShortArray103[local59]);
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)Z")
	public boolean method4372() {
		if (this.anIntArray435 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(14) Class11 local14 = Static1.aClass11_1;
		synchronized (Static1.aClass11_1) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray435.length; local18++) {
				if (!Static1.aClass11_1.method276(0, this.anIntArray435[local18])) {
					local12 = false;
				}
			}
			return local12;
		}
	}
}
