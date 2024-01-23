import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class143 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "[I")
	private int[] anIntArray449;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Z")
	public boolean aBoolean299 = false;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "[I")
	private int[] anIntArray450 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
	public int anInt4232 = -1;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Lclient!ml;")
	public Class53_Sub3 method3526() {
		@Pc(8) Class53_Sub3[] local8 = new Class53_Sub3[5];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray450[local17] != -1) {
				local8[local10++] = Static176.method2765(Static105.aClass58_48, this.anIntArray450[local17]);
			}
		}
		@Pc(51) Class53_Sub3 local51 = new Class53_Sub3(local8, local10);
		@Pc(58) int local58;
		if (this.aShortArray75 != null) {
			for (local58 = 0; local58 < this.aShortArray75.length; local58++) {
				local51.method2781(this.aShortArray75[local58], this.aShortArray76[local58]);
			}
		}
		if (this.aShortArray77 != null) {
			for (local58 = 0; local58 < this.aShortArray77.length; local58++) {
				local51.method2766(this.aShortArray77[local58], this.aShortArray78[local58]);
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Lclient!ml;")
	public Class53_Sub3 method3527() {
		if (this.anIntArray449 == null) {
			return null;
		}
		@Pc(16) Class53_Sub3[] local16 = new Class53_Sub3[this.anIntArray449.length];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArray449.length; local27++) {
			local16[local27] = Static176.method2765(Static105.aClass58_48, this.anIntArray449[local27]);
		}
		@Pc(60) Class53_Sub3 local60;
		if (local16.length == 1) {
			local60 = local16[0];
		} else {
			local60 = new Class53_Sub3(local16, local16.length);
		}
		@Pc(72) int local72;
		if (this.aShortArray75 != null) {
			for (local72 = 0; local72 < this.aShortArray75.length; local72++) {
				local60.method2781(this.aShortArray75[local72], this.aShortArray76[local72]);
			}
		}
		if (this.aShortArray77 != null) {
			for (local72 = 0; local72 < this.aShortArray77.length; local72++) {
				local60.method2766(this.aShortArray77[local72], this.aShortArray78[local72]);
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!fd;Z)V")
	private void method3528(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt4232 = arg1.method4666();
			return;
		}
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (arg0 == 2) {
			local22 = arg1.method4666();
			this.anIntArray449 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray449[local28] = arg1.method4653();
			}
		} else if (arg0 == 3) {
			this.aBoolean299 = true;
		} else if (arg0 == 40) {
			local22 = arg1.method4666();
			this.aShortArray76 = new short[local22];
			this.aShortArray75 = new short[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.aShortArray75[local28] = (short) arg1.method4653();
				this.aShortArray76[local28] = (short) arg1.method4653();
			}
		} else if (arg0 == 41) {
			local22 = arg1.method4666();
			this.aShortArray78 = new short[local22];
			this.aShortArray77 = new short[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.aShortArray77[local28] = (short) arg1.method4653();
				this.aShortArray78[local28] = (short) arg1.method4653();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray450[arg0 - 60] = arg1.method4653();
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)Z")
	public boolean method3531() {
		if (this.anIntArray449 == null) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray449.length; local22++) {
			if (!Static105.aClass58_48.method1370(this.anIntArray449[local22], 0)) {
				local13 = false;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLclient!fd;)V")
	public void method3533(@OriginalArg(1) Class4_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4666();
			if (local5 == 0) {
				return;
			}
			this.method3528(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)Z")
	public boolean method3534() {
		@Pc(16) boolean local16 = true;
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			if (this.anIntArray450[local18] != -1 && !Static105.aClass58_48.method1370(this.anIntArray450[local18], 0)) {
				local16 = false;
			}
		}
		return local16;
	}
}
