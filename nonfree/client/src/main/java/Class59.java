import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class59 {

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "Lclient!gn;")
	private Class136 aClass136_8;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
	private int anInt1582;

	@OriginalMember(owner = "client!cu", name = "t", descriptor = "Ljava/lang/Object;")
	private Object anObject8;

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
	private int anInt1586;

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "Ljava/lang/String;")
	private String aString29 = "null";

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IB)Z")
	public boolean method1287(@OriginalArg(0) int arg0) {
		if (this.anObject8 == null) {
			return false;
		}
		if (this.aClass136_8 == null) {
			this.method1299();
		}
		@Pc(34) Class3_Sub42 local34 = (Class3_Sub42) this.aClass136_8.method3503((long) arg0);
		return local34 != null;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLclient!rba;)V")
	public void method1291(@OriginalArg(1) Class3_Sub28 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method5322(-125);
			if (local12 == 0) {
				return;
			}
			this.method1293(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IILclient!rba;)V")
	private void method1293(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub28 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static265.method4094(arg1.method5288());
		} else if (arg0 == 2) {
			this.aChar3 = Static265.method4094(arg1.method5288());
		} else if (arg0 == 3) {
			this.aString29 = arg1.method5295();
		} else if (arg0 == 4) {
			this.anInt1582 = arg1.method5312();
		} else {
			@Pc(95) int local95;
			if (arg0 == 5 || arg0 == 6) {
				this.anInt1586 = arg1.method5272();
				@Pc(87) Class136 local87 = new Class136(Static60.method735(this.anInt1586));
				for (@Pc(89) int local89 = 0; local89 < this.anInt1586; local89++) {
					local95 = arg1.method5312();
					@Pc(109) Class3 local109;
					if (arg0 == 5) {
						local109 = new Class3_Sub30(arg1.method5295());
					} else {
						local109 = new Class3_Sub42(arg1.method5312());
					}
					local87.method3508((long) local95, local109);
				}
				this.anObject8 = local87;
			} else {
				@Pc(149) int local149;
				@Pc(165) int local165;
				if (arg0 == 7) {
					local149 = arg1.method5272();
					this.anInt1586 = arg1.method5272();
					@Pc(157) String[] local157 = new String[local149];
					for (local95 = 0; local95 < this.anInt1586; local95++) {
						local165 = arg1.method5272();
						local157[local165] = arg1.method5295();
					}
					this.anObject8 = local157;
				} else if (arg0 == 8) {
					local149 = arg1.method5272();
					this.anInt1586 = arg1.method5272();
					@Pc(204) Integer[] local204 = new Integer[local149];
					for (local95 = 0; local95 < this.anInt1586; local95++) {
						local165 = arg1.method5272();
						local204[local165] = Integer.valueOf(arg1.method5312());
					}
					this.anObject8 = local204;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)I")
	public int method1294(@OriginalArg(1) int arg0) {
		if (this.anObject8 == null) {
			return this.anInt1582;
		} else if (this.anObject8 instanceof Class136) {
			@Pc(31) Class3_Sub42 local31 = (Class3_Sub42) ((Class136) this.anObject8).method3503((long) arg0);
			return local31 == null ? this.anInt1582 : local31.anInt8429;
		} else {
			@Pc(44) Integer[] local44 = (Integer[]) this.anObject8;
			if (arg0 >= 0 && local44.length > arg0) {
				@Pc(64) Integer local64 = local44[arg0];
				return local64 == null ? this.anInt1582 : local64;
			} else {
				return this.anInt1582;
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(II)Ljava/lang/String;")
	public String method1295(@OriginalArg(1) int arg0) {
		if (this.anObject8 == null) {
			return this.aString29;
		} else if (this.anObject8 instanceof Class136) {
			@Pc(57) Class3_Sub30 local57 = (Class3_Sub30) ((Class136) this.anObject8).method3503((long) arg0);
			return local57 == null ? this.aString29 : local57.aString89;
		} else {
			@Pc(24) String[] local24 = (String[]) this.anObject8;
			if (arg0 >= 0 && arg0 < local24.length) {
				@Pc(40) String local40 = local24[arg0];
				return local40 == null ? this.aString29 : local40;
			} else {
				return this.aString29;
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method1298(@OriginalArg(1) String arg0) {
		if (this.anObject8 == null) {
			return false;
		}
		if (this.aClass136_8 == null) {
			this.method1300();
		}
		for (@Pc(36) Class3_Sub23 local36 = (Class3_Sub23) this.aClass136_8.method3503(Static142.method2360(arg0)); local36 != null; local36 = (Class3_Sub23) this.aClass136_8.method3510()) {
			if (local36.aString62.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
	private void method1299() {
		@Pc(39) Class3_Sub42 local39;
		if (this.anObject8 instanceof Class136) {
			@Pc(68) Class136 local68 = (Class136) this.anObject8;
			this.aClass136_8 = new Class136(local68.method3507());
			for (@Pc(81) Class3_Sub42 local81 = (Class3_Sub42) local68.method3509(); local81 != null; local81 = (Class3_Sub42) local68.method3506()) {
				local39 = new Class3_Sub42((int) local81.aLong382);
				this.aClass136_8.method3508((long) local81.anInt8429, local39);
			}
			return;
		}
		@Pc(13) Integer[] local13 = (Integer[]) this.anObject8;
		this.aClass136_8 = new Class136(Static60.method735(local13.length));
		for (@Pc(26) int local26 = 0; local26 < local13.length; local26++) {
			if (local13[local26] != null) {
				local39 = new Class3_Sub42(local26);
				this.aClass136_8.method3508((long) local13[local26], local39);
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)V")
	private void method1300() {
		@Pc(33) Class3_Sub23 local33;
		if (this.anObject8 instanceof Class136) {
			@Pc(9) Class136 local9 = (Class136) this.anObject8;
			this.aClass136_8 = new Class136(local9.method3507());
			for (@Pc(22) Class3_Sub30 local22 = (Class3_Sub30) local9.method3509(); local22 != null; local22 = (Class3_Sub30) local9.method3506()) {
				local33 = new Class3_Sub23(local22.aString89, (int) local22.aLong382);
				this.aClass136_8.method3508(Static142.method2360(local22.aString89), local33);
			}
			return;
		}
		@Pc(57) String[] local57 = (String[]) this.anObject8;
		this.aClass136_8 = new Class136(Static60.method735(local57.length));
		for (@Pc(68) int local68 = 0; local68 < local57.length; local68++) {
			if (local57[local68] != null) {
				local33 = new Class3_Sub23(local57[local68], local68);
				this.aClass136_8.method3508(Static142.method2360(local57[local68]), local33);
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)I")
	public int method1301() {
		return this.anInt1586;
	}
}
