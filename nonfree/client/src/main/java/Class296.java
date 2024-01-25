import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class296 {

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "Lclient!le;")
	public Class202 aClass202_4;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
	public int anInt8603;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
	public int anInt8604;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "Z")
	public boolean aBoolean597 = false;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Z")
	public boolean method7387() {
		return this.aClass202_4.aClass196_62.method5111(this.anInt8604);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILclient!sl;)V")
	private void method7389(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt8604 = arg1.method4221();
		} else if (arg0 == 2) {
			this.anInt8603 = arg1.method4204();
		} else if (arg0 == 3) {
			this.aBoolean597 = true;
		} else if (arg0 == 4) {
			this.anInt8604 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!sl;Z)V")
	public void method7391(@OriginalArg(0) Class3_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4225();
			if (local5 == 0) {
				return;
			}
			this.method7389(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZIILclient!ha;)Lclient!td;")
	public Class24 method7392(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(29) long local29 = (long) (arg1 << 16 | this.anInt8604 | (arg0 ? 262144 : 0) | arg2.anInt8747 << 19);
		@Pc(37) Class24 local37 = (Class24) this.aClass202_4.aClass102_37.method2677(local29);
		if (local37 != null) {
			return local37;
		} else if (this.aClass202_4.aClass196_62.method5111(this.anInt8604)) {
			@Pc(59) Class107 local59 = Static645.method2771(this.aClass202_4.aClass196_62, this.anInt8604, 0);
			if (local59 != null) {
				local59.anInt3004 = local59.anInt3005 = local59.anInt3007 = local59.anInt3003 = 0;
				if (arg0) {
					local59.method2759();
				}
				for (@Pc(79) int local79 = 0; local79 < arg1; local79++) {
					local59.method2765();
				}
			}
			local37 = arg2.method7525(local59, true);
			if (local37 != null) {
				this.aClass202_4.aClass102_37.method2674(local29, local37);
			}
			return local37;
		} else {
			return null;
		}
	}
}
