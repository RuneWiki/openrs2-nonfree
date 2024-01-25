import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class80 {

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
	public int anInt1736;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public int anInt1743;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Z")
	public boolean aBoolean128 = false;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBLclient!ec;)V")
	public void method1715(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub10 arg1) {
		while (true) {
			@Pc(17) int local17 = arg1.method3972();
			if (local17 == 0) {
				return;
			}
			this.method1722(arg1, arg0, local17);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZILclient!ja;I)Lclient!of;")
	public Class40 method1721(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2) {
		@Pc(24) long local24 = (long) (arg2.anInt2815 << 19 | arg1 << 16 | this.anInt1736 | (arg0 ? 262144 : 0));
		@Pc(30) Class40 local30 = (Class40) Static113.aClass70_37.method1396(local24);
		if (local30 != null) {
			return local30;
		} else if (Static116.aClass53_64.method1026(this.anInt1736)) {
			@Pc(48) Class88 local48 = Static363.method2255(Static116.aClass53_64, this.anInt1736, 0);
			if (local48 != null) {
				local48.anInt2082 = local48.anInt2084 = local48.anInt2080 = local48.anInt2083 = 0;
				if (arg0) {
					local48.method2254();
				}
				for (@Pc(68) int local68 = 0; local68 < arg1; local68++) {
					local48.method2256();
				}
			}
			local30 = arg2.method3015(local48);
			if (local30 != null) {
				Static113.aClass70_37.method1406(local30, local24);
			}
			return local30;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!ec;II)V")
	private void method1722(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt1736 = arg0.method4021();
		} else if (arg2 == 2) {
			this.anInt1743 = arg0.method3996();
		} else if (arg2 == 3) {
			this.aBoolean128 = true;
		} else if (arg2 == 4) {
			this.anInt1736 = -1;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Z")
	public boolean method1723() {
		return Static116.aClass53_64.method1026(this.anInt1736);
	}
}
