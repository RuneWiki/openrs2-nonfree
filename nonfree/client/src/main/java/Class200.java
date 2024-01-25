import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class200 {

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
	private int anInt5496;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	private int anInt5497;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "Lclient!qha;")
	public Class291 aClass291_20;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "Lclient!qha;")
	private Class291 aClass291_21;

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "Ljava/lang/String;")
	private String aString71 = "null";

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!ib;)V")
	public void method4716(@OriginalArg(1) Class5_Sub23 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8529();
			if (local17 == 0) {
				return;
			}
			this.method4718(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!ib;Z)V")
	private void method4718(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub23 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static101.method1448(arg1.method8488());
		} else if (arg0 == 2) {
			this.aChar4 = Static101.method1448(arg1.method8488());
		} else if (arg0 == 3) {
			this.aString71 = arg1.method8497();
		} else if (arg0 == 4) {
			this.anInt5497 = arg1.method8527();
		} else if (arg0 == 5 || arg0 == 6) {
			this.anInt5496 = arg1.method8519();
			this.aClass291_20 = new Class291(Static94.method1393(this.anInt5496));
			for (@Pc(91) int local91 = 0; local91 < this.anInt5496; local91++) {
				@Pc(97) int local97 = arg1.method8527();
				@Pc(109) Class5 local109;
				if (arg0 == 5) {
					local109 = new Class5_Sub42(arg1.method8497());
				} else {
					local109 = new Class5_Sub29(arg1.method8527());
				}
				this.aClass291_20.method6984((long) local97, local109);
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method4720(@OriginalArg(1) int arg0) {
		if (this.aClass291_20 == null) {
			return this.aString71;
		} else {
			@Pc(28) Class5_Sub42 local28 = (Class5_Sub42) this.aClass291_20.method6993((long) arg0, 1);
			return local28 == null ? this.aString71 : local28.aString105;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	private void method4721() {
		this.aClass291_21 = new Class291(this.aClass291_20.method6992());
		for (@Pc(20) Class5_Sub29 local20 = (Class5_Sub29) this.aClass291_20.method6987(); local20 != null; local20 = (Class5_Sub29) this.aClass291_20.method6989()) {
			@Pc(37) Class5_Sub29 local37 = new Class5_Sub29((int) local20.aLong314);
			this.aClass291_21.method6984((long) local20.anInt5492, local37);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4722(@OriginalArg(1) String arg0) {
		if (this.aClass291_20 == null) {
			return false;
		}
		if (this.aClass291_21 == null) {
			this.method4725();
		}
		for (@Pc(36) Class5_Sub36 local36 = (Class5_Sub36) this.aClass291_21.method6993(Static45.method8834(arg0), 1); local36 != null; local36 = (Class5_Sub36) this.aClass291_21.method6985(-54)) {
			if (local36.aString90.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Z")
	public boolean method4723(@OriginalArg(0) int arg0) {
		if (this.aClass291_20 == null) {
			return false;
		}
		if (this.aClass291_21 == null) {
			this.method4721();
		}
		@Pc(32) Class5_Sub29 local32 = (Class5_Sub29) this.aClass291_21.method6993((long) arg0, 1);
		return local32 != null;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)I")
	public int method4724(@OriginalArg(1) int arg0) {
		if (this.aClass291_20 == null) {
			return this.anInt5497;
		} else {
			@Pc(18) Class5_Sub29 local18 = (Class5_Sub29) this.aClass291_20.method6993((long) arg0, 1);
			return local18 == null ? this.anInt5497 : local18.anInt5492;
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
	private void method4725() {
		this.aClass291_21 = new Class291(this.aClass291_20.method6992());
		for (@Pc(30) Class5_Sub42 local30 = (Class5_Sub42) this.aClass291_20.method6987(); local30 != null; local30 = (Class5_Sub42) this.aClass291_20.method6989()) {
			@Pc(41) Class5_Sub36 local41 = new Class5_Sub36(local30.aString105, (int) local30.aLong314);
			this.aClass291_21.method6984(Static45.method8834(local30.aString105), local41);
		}
	}
}
