import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
	public int anInt1069;

	@OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
	private int anInt1071;

	@OriginalMember(owner = "client!ej", name = "L", descriptor = "Lclient!lc;")
	private Class58 aClass58_8;

	@OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
	public int anInt1074;

	@OriginalMember(owner = "client!ej", name = "K", descriptor = "Lclient!mb;")
	private Class62 aClass62_339 = Static189.aClass62_1375;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)Lclient!mb;")
	public Class62 method746(@OriginalArg(1) int arg0) {
		if (this.aClass58_8 == null) {
			return this.aClass62_339;
		} else {
			@Pc(17) Class2_Sub5 local17 = (Class2_Sub5) this.aClass58_8.method1704((long) arg0);
			return local17 == null ? this.aClass62_339 : local17.aClass62_229;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZLclient!kd;)V")
	private void method748(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt1069 = arg1.method1534();
		} else if (arg0 == 2) {
			this.anInt1074 = arg1.method1534();
		} else if (arg0 == 3) {
			this.aClass62_339 = arg1.method1538();
		} else if (arg0 == 4) {
			this.anInt1071 = arg1.method1577();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(51) int local51 = arg1.method1557();
			this.aClass58_8 = new Class58(Static131.method1032(local51));
			for (@Pc(61) int local61 = 0; local61 < local51; local61++) {
				@Pc(67) int local67 = arg1.method1577();
				@Pc(79) Class2 local79;
				if (arg0 == 5) {
					local79 = new Class2_Sub5(arg1.method1538());
				} else {
					local79 = new Class2_Sub19(arg1.method1577());
				}
				this.aClass58_8.method1708(local79, (long) local67);
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)I")
	public int method750(@OriginalArg(0) int arg0) {
		if (this.aClass58_8 == null) {
			return this.anInt1071;
		} else {
			@Pc(17) Class2_Sub19 local17 = (Class2_Sub19) this.aClass58_8.method1704((long) arg0);
			return local17 == null ? this.anInt1071 : local17.anInt3328;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!kd;Z)V")
	public void method751(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method1534();
			if (local16 == 0) {
				return;
			}
			this.method748(local16, arg0);
		}
	}
}
