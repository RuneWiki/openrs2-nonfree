import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class74 {

	@OriginalMember(owner = "client!er", name = "d", descriptor = "Lclient!cv;")
	private Class51 aClass51_7;

	@OriginalMember(owner = "client!er", name = "f", descriptor = "I")
	private int anInt1811;

	@OriginalMember(owner = "client!er", name = "g", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!er", name = "i", descriptor = "Lclient!cv;")
	public Class51 aClass51_8;

	@OriginalMember(owner = "client!er", name = "t", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!er", name = "b", descriptor = "Ljava/lang/String;")
	private String aString33 = "null";

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	private void method1459() {
		this.aClass51_7 = new Class51(this.aClass51_8.method924());
		for (@Pc(28) Class1_Sub18 local28 = (Class1_Sub18) this.aClass51_8.method928(); local28 != null; local28 = (Class1_Sub18) this.aClass51_8.method926()) {
			@Pc(39) Class1_Sub43 local39 = new Class1_Sub43(local28.aString47, (int) local28.aLong237);
			this.aClass51_7.method931(local39, Static82.method1180(local28.aString47));
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method1460(@OriginalArg(1) String arg0) {
		if (this.aClass51_8 == null) {
			return false;
		}
		if (this.aClass51_7 == null) {
			this.method1459();
		}
		for (@Pc(34) Class1_Sub43 local34 = (Class1_Sub43) this.aClass51_7.method930(Static82.method1180(arg0)); local34 != null; local34 = (Class1_Sub43) this.aClass51_7.method925()) {
			if (local34.aString87.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
	private void method1461() {
		this.aClass51_7 = new Class51(this.aClass51_8.method924());
		for (@Pc(24) Class1_Sub37 local24 = (Class1_Sub37) this.aClass51_8.method928(); local24 != null; local24 = (Class1_Sub37) this.aClass51_8.method926()) {
			@Pc(33) Class1_Sub37 local33 = new Class1_Sub37((int) local24.aLong237);
			this.aClass51_7.method931(local33, (long) local24.anInt6451);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method1462(@OriginalArg(1) int arg0) {
		if (this.aClass51_8 == null) {
			return this.aString33;
		} else {
			@Pc(22) Class1_Sub18 local22 = (Class1_Sub18) this.aClass51_8.method930((long) arg0);
			return local22 == null ? this.aString33 : local22.aString47;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!ti;)V")
	public void method1463(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4548();
			if (local13 == 0) {
				return;
			}
			this.method1467(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)I")
	public int method1465(@OriginalArg(0) int arg0) {
		if (this.aClass51_8 == null) {
			return this.anInt1811;
		} else {
			@Pc(22) Class1_Sub37 local22 = (Class1_Sub37) this.aClass51_8.method930((long) arg0);
			return local22 == null ? this.anInt1811 : local22.anInt6451;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!ti;I)V")
	private void method1467(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static375.method5900(arg1.method4529());
		} else if (arg0 == 2) {
			this.aChar2 = Static375.method5900(arg1.method4529());
		} else if (arg0 == 3) {
			this.aString33 = arg1.method4509();
		} else if (arg0 == 4) {
			this.anInt1811 = arg1.method4500();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(63) int local63 = arg1.method4498();
			this.aClass51_8 = new Class51(Static30.method427(local63));
			for (@Pc(73) int local73 = 0; local73 < local63; local73++) {
				@Pc(81) int local81 = arg1.method4500();
				@Pc(93) Class1 local93;
				if (arg0 == 5) {
					local93 = new Class1_Sub18(arg1.method4509());
				} else {
					local93 = new Class1_Sub37(arg1.method4500());
				}
				this.aClass51_8.method931(local93, (long) local81);
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(II)Z")
	public boolean method1469(@OriginalArg(0) int arg0) {
		if (this.aClass51_8 == null) {
			return false;
		}
		if (this.aClass51_7 == null) {
			this.method1461();
		}
		@Pc(27) Class1_Sub37 local27 = (Class1_Sub37) this.aClass51_7.method930((long) arg0);
		return local27 != null;
	}
}
