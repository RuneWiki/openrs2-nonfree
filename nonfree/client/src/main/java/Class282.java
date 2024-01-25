import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class282 {

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "[I")
	private int[] anIntArray615;

	@OriginalMember(owner = "client!qea", name = "d", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!qea", name = "g", descriptor = "[S")
	private short[] aShortArray119;

	@OriginalMember(owner = "client!qea", name = "j", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!qea", name = "k", descriptor = "Lclient!ki;")
	public Class190 aClass190_1;

	@OriginalMember(owner = "client!qea", name = "i", descriptor = "[I")
	private final int[] anIntArray616 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)Z")
	public boolean method6818() {
		if (this.anIntArray615 == null) {
			return true;
		}
		@Pc(20) boolean local20 = true;
		@Pc(24) Class384 local24 = this.aClass190_1.aClass384_73;
		synchronized (this.aClass190_1.aClass384_73) {
			for (@Pc(28) int local28 = 0; local28 < this.anIntArray615.length; local28++) {
				if (!this.aClass190_1.aClass384_73.method8878(0, this.anIntArray615[local28])) {
					local20 = false;
				}
			}
			return local20;
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)Lclient!ur;")
	public Class349 method6819() {
		@Pc(8) Class349[] local8 = new Class349[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class384 local14 = this.aClass190_1.aClass384_73;
		@Pc(18) int local18;
		synchronized (this.aClass190_1.aClass384_73) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray616[local18] != -1) {
					local8[local10++] = Static277.method4157(this.aClass190_1.aClass384_73, this.anIntArray616[local18]);
				}
				local18++;
			}
		}
		for (@Pc(52) int local52 = 0; local52 < 5; local52++) {
			if (local8[local52] != null && local8[local52].anInt9580 < 13) {
				local8[local52].method8212();
			}
		}
		@Pc(82) Class349 local82 = new Class349(local8, local10);
		if (this.aShortArray117 != null) {
			for (local18 = 0; local18 < this.aShortArray117.length; local18++) {
				local82.method8224(this.aShortArray120[local18], this.aShortArray117[local18]);
			}
		}
		if (this.aShortArray118 != null) {
			for (local18 = 0; local18 < this.aShortArray118.length; local18++) {
				local82.method8226(this.aShortArray118[local18], this.aShortArray119[local18]);
			}
		}
		return local82;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!ee;I)V")
	public void method6820(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method8645();
			if (local16 == 0) {
				return;
			}
			this.method6824(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)Lclient!ur;")
	public Class349 method6822() {
		if (this.anIntArray615 == null) {
			return null;
		}
		@Pc(15) Class349[] local15 = new Class349[this.anIntArray615.length];
		@Pc(19) Class384 local19 = this.aClass190_1.aClass384_73;
		synchronized (this.aClass190_1.aClass384_73) {
			@Pc(31) int local31 = 0;
			while (true) {
				if (this.anIntArray615.length <= local31) {
					break;
				}
				local15[local31] = Static277.method4157(this.aClass190_1.aClass384_73, this.anIntArray615[local31]);
				local31++;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < this.anIntArray615.length; local64++) {
			if (local15[local64].anInt9580 < 13) {
				local15[local64].method8212();
			}
		}
		@Pc(97) Class349 local97;
		if (local15.length == 1) {
			local97 = local15[0];
		} else {
			local97 = new Class349(local15, local15.length);
		}
		if (local97 == null) {
			return null;
		}
		@Pc(112) int local112;
		if (this.aShortArray117 != null) {
			for (local112 = 0; local112 < this.aShortArray117.length; local112++) {
				local97.method8224(this.aShortArray120[local112], this.aShortArray117[local112]);
			}
		}
		if (this.aShortArray118 != null) {
			for (local112 = 0; local112 < this.aShortArray118.length; local112++) {
				local97.method8226(this.aShortArray118[local112], this.aShortArray119[local112]);
			}
		}
		return local97;
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(B)Z")
	public boolean method6823() {
		@Pc(15) boolean local15 = true;
		@Pc(19) Class384 local19 = this.aClass190_1.aClass384_73;
		synchronized (this.aClass190_1.aClass384_73) {
			for (@Pc(23) int local23 = 0; local23 < 5; local23++) {
				if (this.anIntArray616[local23] != -1 && !this.aClass190_1.aClass384_73.method8878(0, this.anIntArray616[local23])) {
					local15 = false;
				}
			}
			return local15;
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!ee;II)V")
	private void method6824(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method8645();
			return;
		}
		@Pc(25) int local25;
		@Pc(31) int local31;
		if (arg1 == 2) {
			local25 = arg0.method8645();
			this.anIntArray615 = new int[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.anIntArray615[local31] = arg0.method8631();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local25 = arg0.method8645();
				this.aShortArray117 = new short[local25];
				this.aShortArray120 = new short[local25];
				for (local31 = 0; local31 < local25; local31++) {
					this.aShortArray117[local31] = (short) arg0.method8631();
					this.aShortArray120[local31] = (short) arg0.method8631();
				}
			} else if (arg1 == 41) {
				local25 = arg0.method8645();
				this.aShortArray119 = new short[local25];
				this.aShortArray118 = new short[local25];
				for (local31 = 0; local31 < local25; local31++) {
					this.aShortArray118[local31] = (short) arg0.method8631();
					this.aShortArray119[local31] = (short) arg0.method8631();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray616[arg1 - 60] = arg0.method8631();
			}
		}
	}
}
