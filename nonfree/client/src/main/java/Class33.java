import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class33 {

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "Lclient!fw;")
	private Class125 aClass125_4;

	@OriginalMember(owner = "client!bea", name = "s", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "Ljava/lang/Object;")
	private Object anObject2;

	@OriginalMember(owner = "client!bea", name = "m", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!bea", name = "g", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!bea", name = "h", descriptor = "I")
	private int anInt643;

	@OriginalMember(owner = "client!bea", name = "j", descriptor = "Ljava/lang/String;")
	private String aString15 = "null";

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method654(@OriginalArg(1) String arg0) {
		if (this.anObject2 == null) {
			return false;
		}
		if (this.aClass125_4 == null) {
			this.method655();
		}
		for (@Pc(34) Class14_Sub50 local34 = (Class14_Sub50) this.aClass125_4.method2630(Static51.method947(arg0)); local34 != null; local34 = (Class14_Sub50) this.aClass125_4.method2635()) {
			if (local34.aString121.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "(I)V")
	private void method655() {
		@Pc(35) Class14_Sub50 local35;
		if (this.anObject2 instanceof Class125) {
			@Pc(60) Class125 local60 = (Class125) this.anObject2;
			this.aClass125_4 = new Class125(local60.method2634());
			for (@Pc(73) Class14_Sub45 local73 = (Class14_Sub45) local60.method2633(); local73 != null; local73 = (Class14_Sub45) local60.method2627()) {
				local35 = new Class14_Sub50(local73.aString109, (int) local73.aLong324);
				this.aClass125_4.method2626(local35, Static51.method947(local73.aString109));
			}
			return;
		}
		@Pc(11) String[] local11 = (String[]) this.anObject2;
		this.aClass125_4 = new Class125(Static255.method4294(local11.length));
		for (@Pc(22) int local22 = 0; local22 < local11.length; local22++) {
			if (local11[local22] != null) {
				local35 = new Class14_Sub50(local11[local22], local22);
				this.aClass125_4.method2626(local35, Static51.method947(local11[local22]));
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method656(@OriginalArg(1) int arg0) {
		if (this.anObject2 == null) {
			return this.aString15;
		} else if (this.anObject2 instanceof Class125) {
			@Pc(31) Class14_Sub45 local31 = (Class14_Sub45) ((Class125) this.anObject2).method2630((long) arg0);
			return local31 == null ? this.aString15 : local31.aString109;
		} else {
			@Pc(44) String[] local44 = (String[]) this.anObject2;
			if (arg0 >= 0 && local44.length > arg0) {
				@Pc(67) String local67 = local44[arg0];
				return local67 == null ? this.aString15 : local67;
			} else {
				return this.aString15;
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZ)Z")
	public boolean method657(@OriginalArg(0) int arg0) {
		if (this.anObject2 == null) {
			return false;
		}
		if (this.aClass125_4 == null) {
			this.method664();
		}
		@Pc(31) Class14_Sub30 local31 = (Class14_Sub30) this.aClass125_4.method2630((long) arg0);
		return local31 != null;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!jc;I)V")
	public void method658(@OriginalArg(0) Class14_Sub21 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7695(98);
			if (local3 == 0) {
				return;
			}
			this.method659(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!jc;II)V")
	private void method659(@OriginalArg(0) Class14_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static223.method3822(arg0.method7720());
		} else if (arg1 == 2) {
			this.aChar4 = Static223.method3822(arg0.method7720());
		} else if (arg1 == 3) {
			this.aString15 = arg0.method7703(0);
		} else if (arg1 == 4) {
			this.anInt643 = arg0.method7748();
		} else {
			@Pc(87) int local87;
			if (arg1 == 5 || arg1 == 6) {
				this.anInt639 = arg0.method7717(-1978450544);
				@Pc(165) Class125 local165 = new Class125(Static255.method4294(this.anInt639));
				for (@Pc(167) int local167 = 0; local167 < this.anInt639; local167++) {
					local87 = arg0.method7748();
					@Pc(184) Class14 local184;
					if (arg1 == 5) {
						local184 = new Class14_Sub45(arg0.method7703(0));
					} else {
						local184 = new Class14_Sub30(arg0.method7748());
					}
					local165.method2626(local184, (long) local87);
				}
				this.anObject2 = local165;
			} else {
				@Pc(75) int local75;
				@Pc(92) int local92;
				if (arg1 == 7) {
					local75 = arg0.method7717(-1978450544);
					this.anInt639 = arg0.method7717(-1978450544);
					@Pc(127) String[] local127 = new String[local75];
					for (local87 = 0; local87 < this.anInt639; local87++) {
						local92 = arg0.method7717(-1978450544);
						local127[local92] = arg0.method7703(0);
					}
					this.anObject2 = local127;
				} else if (arg1 == 8) {
					local75 = arg0.method7717(-1978450544);
					this.anInt639 = arg0.method7717(-1978450544);
					@Pc(85) Integer[] local85 = new Integer[local75];
					for (local87 = 0; local87 < this.anInt639; local87++) {
						local92 = arg0.method7717(-1978450544);
						local85[local92] = Integer.valueOf(arg0.method7748());
					}
					this.anObject2 = local85;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)I")
	public int method660() {
		return this.anInt639;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IB)I")
	public int method662(@OriginalArg(0) int arg0) {
		if (this.anObject2 == null) {
			return this.anInt643;
		} else if (this.anObject2 instanceof Class125) {
			@Pc(30) Class14_Sub30 local30 = (Class14_Sub30) ((Class125) this.anObject2).method2630((long) arg0);
			return local30 == null ? this.anInt643 : local30.anInt6793;
		} else {
			@Pc(43) Integer[] local43 = (Integer[]) this.anObject2;
			if (arg0 >= 0 && local43.length > arg0) {
				@Pc(59) Integer local59 = local43[arg0];
				return local59 == null ? this.anInt643 : local59;
			} else {
				return this.anInt643;
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "(I)V")
	private void method664() {
		@Pc(28) Class14_Sub30 local28;
		if (this.anObject2 instanceof Class125) {
			@Pc(53) Class125 local53 = (Class125) this.anObject2;
			this.aClass125_4 = new Class125(local53.method2634());
			for (@Pc(66) Class14_Sub30 local66 = (Class14_Sub30) local53.method2633(); local66 != null; local66 = (Class14_Sub30) local53.method2627()) {
				local28 = new Class14_Sub30((int) local66.aLong324);
				this.aClass125_4.method2626(local28, (long) local66.anInt6793);
			}
			return;
		}
		@Pc(7) Integer[] local7 = (Integer[]) this.anObject2;
		this.aClass125_4 = new Class125(Static255.method4294(local7.length));
		for (@Pc(18) int local18 = 0; local18 < local7.length; local18++) {
			if (local7[local18] != null) {
				local28 = new Class14_Sub30(local18);
				this.aClass125_4.method2626(local28, (long) local7[local18]);
			}
		}
	}
}
