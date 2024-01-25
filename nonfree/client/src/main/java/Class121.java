import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class121 {

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	public int anInt3434;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
	public int anInt3437;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "Z")
	public boolean aBoolean218 = false;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Z")
	public boolean method2816() {
		return Static126.aClass144_61.method3910(this.anInt3437);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!uo;IIZ)Lclient!sg;")
	public Class97 method2817(@OriginalArg(0) Class129 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(24) long local24 = (long) (arg0.anInt5876 << 19 | (arg2 ? 262144 : 0) | arg1 << 16 | this.anInt3437);
		@Pc(30) Class97 local30 = (Class97) Static313.aClass26_56.method332(local24);
		if (local30 != null) {
			return local30;
		} else if (Static126.aClass144_61.method3910(this.anInt3437)) {
			@Pc(48) Class125 local48 = Static368.method2857(Static126.aClass144_61, this.anInt3437, 0);
			if (local48 != null) {
				local48.anInt3497 = local48.anInt3496 = local48.anInt3500 = local48.anInt3498 = 0;
				if (arg2) {
					local48.method2863();
				}
				for (@Pc(68) int local68 = 0; local68 < arg1; local68++) {
					local48.method2861();
				}
			}
			local30 = arg0.method5018(local48);
			if (local30 != null) {
				Static313.aClass26_56.method330(local24, local30);
			}
			return local30;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLclient!kh;II)V")
	private void method2820(@OriginalArg(1) Class11_Sub25 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt3437 = arg0.method5187();
		} else if (arg2 == 2) {
			this.anInt3434 = arg0.method5221();
		} else if (arg2 == 3) {
			this.aBoolean218 = true;
		} else if (arg2 == 4) {
			this.anInt3437 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!kh;B)V")
	public void method2821(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub25 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method5185();
			if (local9 == 0) {
				return;
			}
			this.method2820(arg1, arg0, local9);
		}
	}
}
