import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class206 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	public int anInt5347;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!po;")
	public Class184 aClass184_4;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "I")
	public int anInt5351;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Z")
	public boolean aBoolean505 = false;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)Z")
	public boolean method4642() {
		return this.aClass184_4.aClass230_65.method4966(this.anInt5347);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!re;B)V")
	public void method4643(@OriginalArg(0) Class1_Sub33 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5174();
			if (local11 == 0) {
				return;
			}
			this.method4649(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!tq;ZI)Lclient!dp;")
	public Class51 method4645(@OriginalArg(1) Class164 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(24) long local24 = (long) (arg0.anInt6163 << 19 | this.anInt5347 | arg2 << 16 | (arg1 ? 262144 : 0));
		@Pc(32) Class51 local32 = (Class51) this.aClass184_4.aClass227_36.method4863(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass184_4.aClass230_65.method4966(this.anInt5347)) {
			@Pc(54) Class80 local54 = Static397.method1423(this.aClass184_4.aClass230_65, this.anInt5347, 0);
			if (local54 != null) {
				local54.anInt1750 = local54.anInt1752 = local54.anInt1749 = local54.anInt1748 = 0;
				if (arg1) {
					local54.method1426();
				}
				for (@Pc(74) int local74 = 0; local74 < arg2; local74++) {
					local54.method1427();
				}
			}
			local32 = arg0.method5360(local54);
			if (local32 != null) {
				this.aClass184_4.aClass227_36.method4865(local32, local24);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!re;I)V")
	private void method4649(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub33 arg1) {
		if (arg0 == 1) {
			this.anInt5347 = arg1.method5177();
		} else if (arg0 == 2) {
			this.anInt5351 = arg1.method5159();
		} else if (arg0 == 3) {
			this.aBoolean505 = true;
		} else if (arg0 == 4) {
			this.anInt5347 = -1;
		}
	}
}
