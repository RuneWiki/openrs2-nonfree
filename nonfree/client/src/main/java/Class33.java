import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class33 {

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Lclient!ag;")
	public Class8 aClass8_1;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
	public int anInt974;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
	public int anInt975;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Z")
	public boolean aBoolean68 = false;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Z")
	public boolean method910() {
		return this.aClass8_1.aClass38_1.method1037(this.anInt974);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZILclient!wn;)V")
	private void method911(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt974 = arg1.method4560();
		} else if (arg0 == 2) {
			this.anInt975 = arg1.method4582();
		} else if (arg0 == 3) {
			this.aBoolean68 = true;
		} else if (arg0 == 4) {
			this.anInt974 = -1;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!wn;)V")
	public void method912(@OriginalArg(1) Class4_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4614();
			if (local9 == 0) {
				return;
			}
			this.method911(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!qa;IZ)Lclient!aa;")
	public Class2 method915(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(24) long local24 = (long) (arg1.anInt2271 << 19 | (arg2 ? 262144 : 0) | arg0 << 16 | this.anInt974);
		@Pc(32) Class2 local32 = (Class2) this.aClass8_1.aClass83_2.method2338(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass8_1.aClass38_1.method1037(this.anInt974)) {
			@Pc(59) Class98 local59 = Static472.method2850(this.aClass8_1.aClass38_1, this.anInt974, 0);
			if (local59 != null) {
				local59.anInt3172 = local59.anInt3173 = local59.anInt3174 = local59.anInt3176 = 0;
				if (arg2) {
					local59.method2839();
				}
				for (@Pc(79) int local79 = 0; local79 < arg0; local79++) {
					local59.method2842();
				}
			}
			local32 = arg1.method2031(local59);
			if (local32 != null) {
				this.aClass8_1.aClass83_2.method2337(local32, local24);
			}
			return local32;
		} else {
			return null;
		}
	}
}
