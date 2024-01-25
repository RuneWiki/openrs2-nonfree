import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class119 {

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
	public int anInt3796;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
	public int anInt3798;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "Z")
	public boolean aBoolean314 = false;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Z")
	public boolean method3210() {
		return Static93.aClass11_45.method274(this.anInt3798);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILclient!tq;)V")
	public void method3211(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		while (true) {
			@Pc(17) int local17 = arg1.method2380();
			if (local17 == 0) {
				return;
			}
			this.method3214(local17, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZLclient!vm;B)Lclient!lg;")
	public Class60 method3213(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class92 arg2) {
		@Pc(32) long local32 = (long) (this.anInt3798 | arg0 << 16 | (arg1 ? 262144 : 0) | arg2.anInt5370 << 19);
		@Pc(38) Class60 local38 = (Class60) Static35.aClass154_7.method4222(local32);
		if (local38 != null) {
			return local38;
		} else if (Static93.aClass11_45.method274(this.anInt3798)) {
			@Pc(58) Class206 local58 = Static367.method5452(Static93.aClass11_45, this.anInt3798, 0);
			if (local58 != null) {
				local58.anInt6573 = local58.anInt6574 = local58.anInt6575 = local58.anInt6578 = 0;
				if (arg1) {
					local58.method5459();
				}
				for (@Pc(78) int local78 = 0; local78 < arg0; local78++) {
					local58.method5453();
				}
			}
			local38 = arg2.method4506(local58);
			if (local38 != null) {
				Static35.aClass154_7.method4221(local32, local38);
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!tq;II)V")
	private void method3214(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt3798 = arg1.method2404();
		} else if (arg0 == 2) {
			this.anInt3796 = arg1.method2402();
		} else if (arg0 == 3) {
			this.aBoolean314 = true;
		} else if (arg0 == 4) {
			this.anInt3798 = -1;
		}
	}
}
