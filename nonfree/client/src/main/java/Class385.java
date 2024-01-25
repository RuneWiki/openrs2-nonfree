import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class385 {

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "[S")
	private short[] aShortArray179;

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "[S")
	private short[] aShortArray180;

	@OriginalMember(owner = "client!wca", name = "k", descriptor = "[S")
	private short[] aShortArray181;

	@OriginalMember(owner = "client!wca", name = "n", descriptor = "[S")
	private short[] aShortArray182;

	@OriginalMember(owner = "client!wca", name = "p", descriptor = "[I")
	private int[] anIntArray648;

	@OriginalMember(owner = "client!wca", name = "t", descriptor = "Lclient!bn;")
	public Class43 aClass43_2;

	@OriginalMember(owner = "client!wca", name = "l", descriptor = "[I")
	private final int[] anIntArray647 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(ZLclient!fca;)V")
	public void method8564(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4888();
			if (local11 == 0) {
				return;
			}
			this.method8567(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)Lclient!dc;")
	public Class73 method8565() {
		@Pc(8) Class73[] local8 = new Class73[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class143 local14 = this.aClass43_2.aClass143_12;
		@Pc(18) int local18;
		synchronized (this.aClass43_2.aClass143_12) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray647[local18] != -1) {
					local8[local10++] = Static573.method7744(this.anIntArray647[local18], this.aClass43_2.aClass143_12);
				}
				local18++;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < 5; local53++) {
			if (local8[local53] != null && local8[local53].anInt2049 < 13) {
				local8[local53].method1895();
			}
		}
		@Pc(86) Class73 local86 = new Class73(local8, local10);
		if (this.aShortArray182 != null) {
			for (local18 = 0; local18 < this.aShortArray182.length; local18++) {
				local86.method1890(this.aShortArray181[local18], this.aShortArray182[local18]);
			}
		}
		if (this.aShortArray179 != null) {
			for (local18 = 0; local18 < this.aShortArray179.length; local18++) {
				local86.method1886(this.aShortArray180[local18], this.aShortArray179[local18]);
			}
		}
		return local86;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!fca;II)V")
	private void method8567(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method4888();
			return;
		}
		@Pc(23) int local23;
		@Pc(33) int local33;
		if (arg1 == 2) {
			local23 = arg0.method4888();
			this.anIntArray648 = new int[local23];
			for (local33 = 0; local33 < local23; local33++) {
				this.anIntArray648[local33] = arg0.method4858();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local23 = arg0.method4888();
				this.aShortArray181 = new short[local23];
				this.aShortArray182 = new short[local23];
				for (local33 = 0; local33 < local23; local33++) {
					this.aShortArray182[local33] = (short) arg0.method4858();
					this.aShortArray181[local33] = (short) arg0.method4858();
				}
			} else if (arg1 == 41) {
				local23 = arg0.method4888();
				this.aShortArray179 = new short[local23];
				this.aShortArray180 = new short[local23];
				for (local33 = 0; local33 < local23; local33++) {
					this.aShortArray179[local33] = (short) arg0.method4858();
					this.aShortArray180[local33] = (short) arg0.method4858();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray647[arg1 - 60] = arg0.method4858();
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)Z")
	public boolean method8568() {
		@Pc(12) boolean local12 = true;
		@Pc(16) Class143 local16 = this.aClass43_2.aClass143_12;
		synchronized (this.aClass43_2.aClass143_12) {
			for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
				if (this.anIntArray647[local20] != -1 && !this.aClass43_2.aClass143_12.method3113(this.anIntArray647[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)Z")
	public boolean method8570() {
		if (this.anIntArray648 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class143 local16 = this.aClass43_2.aClass143_12;
		synchronized (this.aClass43_2.aClass143_12) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray648.length; local20++) {
				if (!this.aClass43_2.aClass143_12.method3113(this.anIntArray648[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "(I)Lclient!dc;")
	public Class73 method8571() {
		if (this.anIntArray648 == null) {
			return null;
		}
		@Pc(23) Class73[] local23 = new Class73[this.anIntArray648.length];
		@Pc(27) Class143 local27 = this.aClass43_2.aClass143_12;
		@Pc(31) int local31;
		synchronized (this.aClass43_2.aClass143_12) {
			local31 = 0;
			while (true) {
				if (local31 >= this.anIntArray648.length) {
					break;
				}
				local23[local31] = Static573.method7744(this.anIntArray648[local31], this.aClass43_2.aClass143_12);
				local31++;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < this.anIntArray648.length; local64++) {
			if (local23[local64].anInt2049 < 13) {
				local23[local64].method1895();
			}
		}
		@Pc(97) Class73 local97;
		if (local23.length == 1) {
			local97 = local23[0];
		} else {
			local97 = new Class73(local23, local23.length);
		}
		if (local97 == null) {
			return null;
		}
		if (this.aShortArray182 != null) {
			for (local31 = 0; local31 < this.aShortArray182.length; local31++) {
				local97.method1890(this.aShortArray181[local31], this.aShortArray182[local31]);
			}
		}
		if (this.aShortArray179 != null) {
			for (local31 = 0; local31 < this.aShortArray179.length; local31++) {
				local97.method1886(this.aShortArray180[local31], this.aShortArray179[local31]);
			}
		}
		return local97;
	}
}
