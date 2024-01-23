import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class19 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "[I")
	private int[] anIntArray32;

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "[I")
	private int[] anIntArray31 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
	public int anInt467 = -1;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!im;Z)V")
	private void method381(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16 arg1) {
		if (arg0 == 1) {
			this.anInt467 = arg1.method2655();
			return;
		}
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg0 == 2) {
			local18 = arg1.method2655();
			this.anIntArray32 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray32[local24] = arg1.method2652();
			}
		} else if (arg0 == 3) {
			this.aBoolean24 = true;
		} else if (arg0 == 40) {
			local18 = arg1.method2655();
			this.aShortArray7 = new short[local18];
			this.aShortArray10 = new short[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.aShortArray7[local24] = (short) arg1.method2652();
				this.aShortArray10[local24] = (short) arg1.method2652();
			}
		} else if (arg0 == 41) {
			local18 = arg1.method2655();
			this.aShortArray8 = new short[local18];
			this.aShortArray9 = new short[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.aShortArray8[local24] = (short) arg1.method2652();
				this.aShortArray9[local24] = (short) arg1.method2652();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray31[arg0 - 60] = arg1.method2652();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Lclient!le;")
	public Class25_Sub3 method382() {
		@Pc(15) Class25_Sub3[] local15 = new Class25_Sub3[5];
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
			if (this.anIntArray31[local19] != -1) {
				local15[local17++] = Static149.method2801(Static266.aClass83_189, this.anIntArray31[local19]);
			}
		}
		@Pc(49) Class25_Sub3 local49 = new Class25_Sub3(local15, local17);
		@Pc(54) int local54;
		if (this.aShortArray7 != null) {
			for (local54 = 0; local54 < this.aShortArray7.length; local54++) {
				local49.method2826(this.aShortArray7[local54], this.aShortArray10[local54]);
			}
		}
		if (this.aShortArray8 != null) {
			for (local54 = 0; local54 < this.aShortArray8.length; local54++) {
				local49.method2798(this.aShortArray8[local54], this.aShortArray9[local54]);
			}
		}
		return local49;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)Lclient!le;")
	public Class25_Sub3 method384() {
		if (this.anIntArray32 == null) {
			return null;
		}
		@Pc(17) Class25_Sub3[] local17 = new Class25_Sub3[this.anIntArray32.length];
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray32.length; local19++) {
			local17[local19] = Static149.method2801(Static266.aClass83_189, this.anIntArray32[local19]);
		}
		@Pc(47) Class25_Sub3 local47;
		if (local17.length == 1) {
			local47 = local17[0];
		} else {
			local47 = new Class25_Sub3(local17, local17.length);
		}
		@Pc(62) int local62;
		if (this.aShortArray7 != null) {
			for (local62 = 0; local62 < this.aShortArray7.length; local62++) {
				local47.method2826(this.aShortArray7[local62], this.aShortArray10[local62]);
			}
		}
		if (this.aShortArray8 != null) {
			for (local62 = 0; local62 < this.aShortArray8.length; local62++) {
				local47.method2798(this.aShortArray8[local62], this.aShortArray9[local62]);
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!im;)V")
	public void method386(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2655();
			if (local5 == 0) {
				return;
			}
			this.method381(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)Z")
	public boolean method388() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray31[local9] != -1 && !Static266.aClass83_189.method2299(0, this.anIntArray31[local9])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)Z")
	public boolean method389() {
		if (this.anIntArray32 == null) {
			return true;
		}
		@Pc(23) boolean local23 = true;
		for (@Pc(25) int local25 = 0; local25 < this.anIntArray32.length; local25++) {
			if (!Static266.aClass83_189.method2299(0, this.anIntArray32[local25])) {
				local23 = false;
			}
		}
		return local23;
	}
}
