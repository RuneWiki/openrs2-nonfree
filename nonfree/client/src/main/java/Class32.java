import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class32 {

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
	public int anInt957;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "Lclient!n;")
	public Class198 aClass198_3;

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
	public int anInt962;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)Z")
	public boolean method893() {
		return this.aClass198_3.aClass161_63.method4268(this.anInt957);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZLclient!rt;)V")
	private void method894(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 1) {
			this.anInt957 = arg1.method7591();
		} else if (arg0 == 2) {
			this.anInt962 = arg1.method7551();
		} else if (arg0 == 3) {
			this.aBoolean71 = true;
			return;
		} else if (arg0 == 4) {
			this.anInt957 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLclient!oa;II)Lclient!xa;")
	public Class119 method895(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2) {
		@Pc(24) long local24 = (long) (arg1.anInt9037 << 19 | (arg0 ? 262144 : 0) | arg2 << 16 | this.anInt957);
		@Pc(32) Class119 local32 = (Class119) this.aClass198_3.aClass125_42.method3512(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass198_3.aClass161_63.method4268(this.anInt957)) {
			@Pc(54) Class9 local54 = Static551.method531(this.aClass198_3.aClass161_63, this.anInt957, 0);
			if (local54 != null) {
				local54.anInt479 = local54.anInt476 = local54.anInt480 = local54.anInt477 = 0;
				if (arg0) {
					local54.method525();
				}
				for (@Pc(74) int local74 = 0; local74 < arg2; local74++) {
					local54.method537();
				}
			}
			local32 = arg1.method7425(local54);
			if (local32 != null) {
				this.aClass198_3.aClass125_42.method3519(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!rt;I)V")
	public void method896(@OriginalArg(0) Class3_Sub27 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7548();
			if (local9 == 0) {
				return;
			}
			this.method894(local9, arg0);
		}
	}
}
