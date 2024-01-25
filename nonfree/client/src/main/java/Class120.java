import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class120 {

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "Lclient!el;")
	public Class87 aClass87_2;

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
	public int anInt3557;

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
	public int anInt3558;

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "Z")
	public boolean aBoolean272 = false;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!np;I)V")
	public void method3172(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5175();
			if (local14 == 0) {
				return;
			}
			this.method3175(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZLclient!r;IB)Lclient!f;")
	public Class14 method3174(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) int arg2) {
		@Pc(24) long local24 = (long) (arg1.anInt8843 << 19 | (arg0 ? 262144 : 0) | this.anInt3558 | arg2 << 16);
		@Pc(37) Class14 local37 = (Class14) this.aClass87_2.aClass6_12.method92(local24);
		if (local37 != null) {
			return local37;
		} else if (this.aClass87_2.aClass322_49.method6797(this.anInt3558)) {
			@Pc(59) Class279 local59 = Static604.method6161(this.aClass87_2.aClass322_49, this.anInt3558, 0);
			if (local59 != null) {
				local59.anInt7342 = local59.anInt7339 = local59.anInt7343 = local59.anInt7338 = 0;
				if (arg0) {
					local59.method6153();
				}
				for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
					local59.method6163();
				}
			}
			local37 = arg1.method7398(local59, true);
			if (local37 != null) {
				this.aClass87_2.aClass6_12.method106(local24, local37);
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!np;BI)V")
	private void method3175(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3558 = arg0.method5198();
		} else if (arg1 == 2) {
			this.anInt3557 = arg0.method5230();
		} else if (arg1 == 3) {
			this.aBoolean272 = true;
		} else if (arg1 == 4) {
			this.anInt3558 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)Z")
	public boolean method3176() {
		return this.aClass87_2.aClass322_49.method6797(this.anInt3558);
	}
}
