import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class153 {

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "[I")
	private int[] anIntArray621;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
	public int anInt4614 = -1;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "Z")
	public boolean aBoolean342 = false;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "[I")
	private final int[] anIntArray620 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)Lclient!mr;")
	public Class140 method4060() {
		if (this.anIntArray621 == null) {
			return null;
		}
		@Pc(13) Class140[] local13 = new Class140[this.anIntArray621.length];
		@Pc(15) Class180 local15 = Static149.aClass180_39;
		@Pc(19) int local19;
		synchronized (Static149.aClass180_39) {
			local19 = 0;
			while (true) {
				if (this.anIntArray621.length <= local19) {
					break;
				}
				local13[local19] = Static233.method4073(this.anIntArray621[local19], Static149.aClass180_39);
				local19++;
			}
		}
		@Pc(66) Class140 local66;
		if (local13.length == 1) {
			local66 = local13[0];
		} else {
			local66 = new Class140(local13, local13.length);
		}
		if (local66 == null) {
			return null;
		}
		if (this.aShortArray91 != null) {
			for (local19 = 0; local19 < this.aShortArray91.length; local19++) {
				local66.method3672(this.aShortArray91[local19], this.aShortArray92[local19]);
			}
		}
		if (this.aShortArray93 != null) {
			for (local19 = 0; local19 < this.aShortArray93.length; local19++) {
				local66.method3685(this.aShortArray93[local19], this.aShortArray94[local19]);
			}
		}
		return local66;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)Z")
	public boolean method4061() {
		@Pc(5) boolean local5 = true;
		@Pc(12) Class180 local12 = Static149.aClass180_39;
		synchronized (Static149.aClass180_39) {
			for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
				if (this.anIntArray620[local16] != -1 && !Static149.aClass180_39.method4555(this.anIntArray620[local16], 0)) {
					local5 = false;
				}
			}
			return local5;
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)Z")
	public boolean method4062() {
		if (this.anIntArray621 == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		@Pc(12) Class180 local12 = Static149.aClass180_39;
		synchronized (Static149.aClass180_39) {
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray621.length; local24++) {
				if (!Static149.aClass180_39.method4555(this.anIntArray621[local24], 0)) {
					local10 = false;
				}
			}
			return local10;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)Lclient!mr;")
	public Class140 method4063() {
		@Pc(6) Class140[] local6 = new Class140[5];
		@Pc(8) int local8 = 0;
		@Pc(10) Class180 local10 = Static149.aClass180_39;
		synchronized (Static149.aClass180_39) {
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray620[local14] != -1) {
					local6[local8++] = Static233.method4073(this.anIntArray620[local14], Static149.aClass180_39);
				}
			}
		}
		@Pc(55) Class140 local55 = new Class140(local6, local8);
		@Pc(60) int local60;
		if (this.aShortArray91 != null) {
			for (local60 = 0; local60 < this.aShortArray91.length; local60++) {
				local55.method3672(this.aShortArray91[local60], this.aShortArray92[local60]);
			}
		}
		if (this.aShortArray93 != null) {
			for (local60 = 0; local60 < this.aShortArray93.length; local60++) {
				local55.method3685(this.aShortArray93[local60], this.aShortArray94[local60]);
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!ap;BI)V")
	private void method4064(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4614 = arg0.method2772();
			return;
		}
		@Pc(43) int local43;
		@Pc(53) int local53;
		if (arg1 == 2) {
			local43 = arg0.method2772();
			this.anIntArray621 = new int[local43];
			for (local53 = 0; local53 < local43; local53++) {
				this.anIntArray621[local53] = arg0.method2764();
			}
		} else if (arg1 == 3) {
			this.aBoolean342 = true;
			return;
		} else if (arg1 == 40) {
			local43 = arg0.method2772();
			this.aShortArray92 = new short[local43];
			this.aShortArray91 = new short[local43];
			for (local53 = 0; local53 < local43; local53++) {
				this.aShortArray91[local53] = (short) arg0.method2764();
				this.aShortArray92[local53] = (short) arg0.method2764();
			}
			return;
		} else if (arg1 == 41) {
			local43 = arg0.method2772();
			this.aShortArray94 = new short[local43];
			this.aShortArray93 = new short[local43];
			for (local53 = 0; local53 < local43; local53++) {
				this.aShortArray93[local53] = (short) arg0.method2764();
				this.aShortArray94[local53] = (short) arg0.method2764();
			}
			return;
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray620[arg1 - 60] = arg0.method2764();
			return;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!ap;I)V")
	public void method4065(@OriginalArg(0) Class7_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2772();
			if (local9 == 0) {
				return;
			}
			this.method4064(arg0, local9);
		}
	}
}
