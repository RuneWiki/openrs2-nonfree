import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class190 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	public int anInt5996;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public int anInt5997;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!dda;")
	public Class67 aClass67_3;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Z")
	public boolean aBoolean430 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ig;Z)V")
	public void method4916(@OriginalArg(0) Class8_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8525();
			if (local5 == 0) {
				return;
			}
			this.method4920(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ha;ZIZ)Lclient!hu;")
	public Class21 method4918(@OriginalArg(0) Class16 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(24) long local24 = (long) (arg2 << 16 | this.anInt5996 | (arg1 ? 262144 : 0) | arg0.anInt7420 << 19);
		@Pc(32) Class21 local32 = (Class21) this.aClass67_3.aClass236_16.method6242(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass67_3.aClass237_26.method6296(this.anInt5996)) {
			@Pc(54) Class111 local54 = Static647.method3292(this.aClass67_3.aClass237_26, this.anInt5996, 0);
			if (local54 != null) {
				local54.anInt4052 = local54.anInt4055 = local54.anInt4051 = local54.anInt4050 = 0;
				if (arg1) {
					local54.method3294();
				}
				for (@Pc(74) int local74 = 0; local74 < arg2; local74++) {
					local54.method3288();
				}
			}
			local32 = arg0.method6135(local54, true);
			if (local32 != null) {
				this.aClass67_3.aClass236_16.method6241(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
	public boolean method4919() {
		return this.aClass67_3.aClass237_26.method6296(this.anInt5996);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILclient!ig;)V")
	private void method4920(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt5996 = arg1.method8578();
		} else if (arg0 == 2) {
			this.anInt5997 = arg1.method8560();
		} else if (arg0 == 3) {
			this.aBoolean430 = true;
		} else if (arg0 == 4) {
			this.anInt5996 = -1;
		}
	}
}
