import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class25 {

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
	public int anInt840;

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!ch", name = "y", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
	private int anInt833 = 128;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
	private int anInt835 = 0;

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "Z")
	public boolean aBoolean78 = false;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "Z")
	public boolean aBoolean79 = false;

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
	private int anInt844 = 0;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
	public int anInt838 = -1;

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
	private int anInt843 = 0;

	@OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
	private int anInt845 = 128;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)Lclient!ei;")
	public Class6_Sub2 method711(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class6_Sub2 local9 = (Class6_Sub2) Static18.aClass31_4.method852((long) this.anInt840);
		if (local9 == null) {
			@Pc(30) Class6_Sub3 local30 = Static85.method1434(Static242.aClass7_199, this.anInt841);
			if (local30 == null) {
				return null;
			}
			@Pc(41) int local41;
			if (this.aShortArray19 != null) {
				for (local41 = 0; local41 < this.aShortArray19.length; local41++) {
					local30.method1424(this.aShortArray19[local41], this.aShortArray18[local41]);
				}
			}
			if (this.aShortArray20 != null) {
				for (local41 = 0; local41 < this.aShortArray20.length; local41++) {
					local30.method1421(this.aShortArray20[local41], this.aShortArray17[local41]);
				}
			}
			local9 = local30.method1425(this.anInt835 + 64, 850 - -this.anInt843, -30, -50, -30);
			Static18.aClass31_4.method851(local9, (long) this.anInt840);
		}
		@Pc(124) Class6_Sub2 local124;
		if (this.anInt838 == -1 || arg2 == -1) {
			local124 = local9.method2094(true, true, true);
		} else {
			local124 = Static262.method4031(this.anInt838).method3163(arg0, local9, arg2, arg1);
		}
		if (this.anInt833 != 128 || this.anInt845 != 128) {
			local124.method2076(this.anInt833, this.anInt845, this.anInt833);
		}
		if (this.anInt844 != 0) {
			if (this.anInt844 == 90) {
				local124.method2071();
			}
			if (this.anInt844 == 180) {
				local124.method2089();
			}
			if (this.anInt844 == 270) {
				local124.method2069();
			}
		}
		return local124;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILclient!jj;)V")
	private void method712(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub18 arg1) {
		if (arg0 == 1) {
			this.anInt841 = arg1.method3107();
		} else if (arg0 == 2) {
			this.anInt838 = arg1.method3107();
		} else if (arg0 == 4) {
			this.anInt833 = arg1.method3107();
		} else if (arg0 == 5) {
			this.anInt845 = arg1.method3107();
		} else if (arg0 == 6) {
			this.anInt844 = arg1.method3107();
		} else if (arg0 == 7) {
			this.anInt835 = arg1.method3122();
		} else if (arg0 == 8) {
			this.anInt843 = arg1.method3122();
		} else if (arg0 == 9) {
			this.aBoolean79 = true;
		} else if (arg0 == 10) {
			this.aBoolean78 = true;
		} else {
			@Pc(77) int local77;
			@Pc(87) int local87;
			if (arg0 == 40) {
				local77 = arg1.method3122();
				this.aShortArray18 = new short[local77];
				this.aShortArray19 = new short[local77];
				for (local87 = 0; local87 < local77; local87++) {
					this.aShortArray19[local87] = (short) arg1.method3107();
					this.aShortArray18[local87] = (short) arg1.method3107();
				}
			} else if (arg0 == 41) {
				local77 = arg1.method3122();
				this.aShortArray20 = new short[local77];
				this.aShortArray17 = new short[local77];
				for (local87 = 0; local87 < local77; local87++) {
					this.aShortArray20[local87] = (short) arg1.method3107();
					this.aShortArray17[local87] = (short) arg1.method3107();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!jj;Z)V")
	public void method713(@OriginalArg(0) Class1_Sub18 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3122();
			if (local14 == 0) {
				return;
			}
			this.method712(local14, arg0);
		}
	}
}
