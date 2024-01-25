import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class223 {

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "[I")
	private int[] anIntArray538;

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "[I")
	private final int[] anIntArray539 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)Z")
	public boolean method5801() {
		if (this.anIntArray538 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(14) Class104 local14 = Static36.aClass104_27;
		synchronized (Static36.aClass104_27) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray538.length; local18++) {
				if (!Static36.aClass104_27.method2772(this.anIntArray538[local18], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ef;I)V")
	public void method5802(@OriginalArg(0) Class2_Sub12 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3124();
			if (local13 == 0) {
				return;
			}
			this.method5808(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)Z")
	public boolean method5803() {
		@Pc(12) boolean local12 = true;
		@Pc(14) Class104 local14 = Static36.aClass104_27;
		synchronized (Static36.aClass104_27) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				if (this.anIntArray539[local18] != -1 && !Static36.aClass104_27.method2772(this.anIntArray539[local18], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Lclient!jp;")
	public Class111 method5804() {
		if (this.anIntArray538 == null) {
			return null;
		}
		@Pc(15) Class111[] local15 = new Class111[this.anIntArray538.length];
		@Pc(17) Class104 local17 = Static36.aClass104_27;
		synchronized (Static36.aClass104_27) {
			@Pc(21) int local21 = 0;
			while (true) {
				if (local21 >= this.anIntArray538.length) {
					break;
				}
				local15[local21] = Static309.method5155(this.anIntArray538[local21], Static36.aClass104_27);
				local21++;
			}
		}
		@Pc(54) Class111 local54;
		if (local15.length == 1) {
			local54 = local15[0];
		} else {
			local54 = new Class111(local15, local15.length);
		}
		if (local54 == null) {
			return null;
		}
		@Pc(71) int local71;
		if (this.aShortArray103 != null) {
			for (local71 = 0; local71 < this.aShortArray103.length; local71++) {
				local54.method3255(this.aShortArray106[local71], this.aShortArray103[local71]);
			}
		}
		if (this.aShortArray105 != null) {
			for (local71 = 0; local71 < this.aShortArray105.length; local71++) {
				local54.method3251(this.aShortArray104[local71], this.aShortArray105[local71]);
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(Z)Lclient!jp;")
	public Class111 method5807() {
		@Pc(8) Class111[] local8 = new Class111[5];
		@Pc(10) int local10 = 0;
		@Pc(12) Class104 local12 = Static36.aClass104_27;
		synchronized (Static36.aClass104_27) {
			for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
				if (this.anIntArray539[local16] != -1) {
					local8[local10++] = Static309.method5155(this.anIntArray539[local16], Static36.aClass104_27);
				}
			}
		}
		@Pc(52) Class111 local52 = new Class111(local8, local10);
		@Pc(57) int local57;
		if (this.aShortArray103 != null) {
			for (local57 = 0; local57 < this.aShortArray103.length; local57++) {
				local52.method3255(this.aShortArray106[local57], this.aShortArray103[local57]);
			}
		}
		if (this.aShortArray105 != null) {
			for (local57 = 0; local57 < this.aShortArray105.length; local57++) {
				local52.method3251(this.aShortArray104[local57], this.aShortArray105[local57]);
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!ef;I)V")
	private void method5808(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12 arg1) {
		if (arg0 == 1) {
			arg1.method3124();
			return;
		}
		@Pc(21) int local21;
		@Pc(27) int local27;
		if (arg0 == 2) {
			local21 = arg1.method3124();
			this.anIntArray538 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray538[local27] = arg1.method3104();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local21 = arg1.method3124();
				this.aShortArray106 = new short[local21];
				this.aShortArray103 = new short[local21];
				for (local27 = 0; local27 < local21; local27++) {
					this.aShortArray103[local27] = (short) arg1.method3104();
					this.aShortArray106[local27] = (short) arg1.method3104();
				}
			} else if (arg0 == 41) {
				local21 = arg1.method3124();
				this.aShortArray104 = new short[local21];
				this.aShortArray105 = new short[local21];
				for (local27 = 0; local27 < local21; local27++) {
					this.aShortArray105[local27] = (short) arg1.method3104();
					this.aShortArray104[local27] = (short) arg1.method3104();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray539[arg0 - 60] = arg1.method3104();
			}
		}
	}
}
