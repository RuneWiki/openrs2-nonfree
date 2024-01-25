import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class83 {

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
	public int anInt2442;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
	public int anInt2446;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "Z")
	public boolean aBoolean169 = false;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!ap;III)V")
	private void method2034(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt2442 = arg0.method2764();
		} else if (arg1 == 2) {
			this.anInt2446 = arg0.method2791();
		} else if (arg1 == 3) {
			this.aBoolean169 = true;
		} else if (arg1 == 4) {
			this.anInt2442 = -1;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZBILclient!pe;)Lclient!kb;")
	public Class52 method2035(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class89 arg2) {
		@Pc(22) long local22 = (long) ((arg0 ? 262144 : 0) | arg1 << 16 | this.anInt2442 | arg2.anInt6390 << 19);
		@Pc(28) Class52 local28 = (Class52) Static177.aClass103_29.method2682(local22);
		if (local28 != null) {
			return local28;
		} else if (Static153.aClass180_41.method4562(this.anInt2442)) {
			@Pc(51) Class56 local51 = Static358.method1307(Static153.aClass180_41, this.anInt2442, 0);
			if (local51 != null) {
				local51.anInt1619 = local51.anInt1618 = local51.anInt1617 = local51.anInt1620 = 0;
				if (arg0) {
					local51.method1310();
				}
				for (@Pc(71) int local71 = 0; local71 < arg1; local71++) {
					local51.method1309();
				}
			}
			local28 = arg2.method5411(local51);
			if (local28 != null) {
				Static177.aClass103_29.method2687(local28, local22);
			}
			return local28;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!ap;B)V")
	public void method2036(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub3 arg1) {
		while (true) {
			@Pc(3) int local3 = arg1.method2772();
			if (local3 == 0) {
				return;
			}
			this.method2034(arg1, local3, arg0);
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)Z")
	public boolean method2037() {
		return Static153.aClass180_41.method4562(this.anInt2442);
	}
}
