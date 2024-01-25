import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class281 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "Lclient!he;")
	public Class128 aClass128_37;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
	private int anInt8309;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "Lclient!he;")
	private Class128 aClass128_38;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Ljava/lang/String;")
	private String aString96 = "null";

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	private void method7159() {
		this.aClass128_38 = new Class128(this.aClass128_37.method3558());
		for (@Pc(28) Class6_Sub18 local28 = (Class6_Sub18) this.aClass128_37.method3556(); local28 != null; local28 = (Class6_Sub18) this.aClass128_37.method3555()) {
			@Pc(39) Class6_Sub34 local39 = new Class6_Sub34(local28.aString33, (int) local28.aLong278);
			this.aClass128_38.method3551(Static432.method6739(local28.aString33), local39);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILclient!rg;)V")
	private void method7162(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static494.method7395(arg1.method8602());
		} else if (arg0 == 2) {
			this.aChar5 = Static494.method7395(arg1.method8602());
		} else if (arg0 == 3) {
			this.aString96 = arg1.method8611();
		} else if (arg0 == 4) {
			this.anInt8309 = arg1.method8579();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(55) int local55 = arg1.method8571();
			this.aClass128_37 = new Class128(Static567.method8129(local55));
			for (@Pc(65) int local65 = 0; local65 < local55; local65++) {
				@Pc(71) int local71 = arg1.method8579();
				@Pc(81) Class6 local81;
				if (arg0 == 5) {
					local81 = new Class6_Sub18(arg1.method8611());
				} else {
					local81 = new Class6_Sub48(arg1.method8579());
				}
				this.aClass128_37.method3551((long) local71, local81);
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method7164(@OriginalArg(1) int arg0) {
		if (this.aClass128_37 == null) {
			return this.aString96;
		} else {
			@Pc(17) Class6_Sub18 local17 = (Class6_Sub18) this.aClass128_37.method3560((long) arg0);
			return local17 == null ? this.aString96 : local17.aString33;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	private void method7166() {
		this.aClass128_38 = new Class128(this.aClass128_37.method3558());
		for (@Pc(28) Class6_Sub48 local28 = (Class6_Sub48) this.aClass128_37.method3556(); local28 != null; local28 = (Class6_Sub48) this.aClass128_37.method3555()) {
			@Pc(37) Class6_Sub48 local37 = new Class6_Sub48((int) local28.aLong278);
			this.aClass128_38.method3551((long) local28.anInt9611, local37);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method7167(@OriginalArg(0) String arg0) {
		if (this.aClass128_37 == null) {
			return false;
		}
		if (this.aClass128_38 == null) {
			this.method7159();
		}
		for (@Pc(25) Class6_Sub34 local25 = (Class6_Sub34) this.aClass128_38.method3560(Static432.method6739(arg0)); local25 != null; local25 = (Class6_Sub34) this.aClass128_38.method3553()) {
			if (local25.aString90.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method7168(@OriginalArg(0) Class6_Sub40 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8604();
			if (local9 == 0) {
				return;
			}
			this.method7162(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)Z")
	public boolean method7169(@OriginalArg(0) int arg0) {
		if (this.aClass128_37 == null) {
			return false;
		}
		if (this.aClass128_38 == null) {
			this.method7166();
		}
		@Pc(28) Class6_Sub48 local28 = (Class6_Sub48) this.aClass128_38.method3560((long) arg0);
		return local28 != null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)I")
	public int method7172(@OriginalArg(1) int arg0) {
		if (this.aClass128_37 == null) {
			return this.anInt8309;
		} else {
			@Pc(22) Class6_Sub48 local22 = (Class6_Sub48) this.aClass128_37.method3560((long) arg0);
			return local22 == null ? this.anInt8309 : local22.anInt9611;
		}
	}
}
