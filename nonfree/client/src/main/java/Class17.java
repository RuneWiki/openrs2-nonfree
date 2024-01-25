import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class17 {

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
	public int anInt309;

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "Lclient!p;")
	public Class182 aClass182_3;

	@OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
	public int anInt314;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "Z")
	public boolean aBoolean18 = false;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)Z")
	public boolean method335() {
		return this.aClass182_3.aClass250_75.method5813(this.anInt309);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILclient!qa;ZI)Lclient!aa;")
	public Class2 method336(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(30) long local30 = (long) (arg1.anInt7365 << 19 | (arg2 ? 262144 : 0) | arg0 << 16 | this.anInt309);
		@Pc(38) Class2 local38 = (Class2) this.aClass182_3.aClass268_43.method6166(local30);
		if (local38 != null) {
			return local38;
		} else if (this.aClass182_3.aClass250_75.method5813(this.anInt309)) {
			@Pc(60) Class154 local60 = Static467.method3619(this.aClass182_3.aClass250_75, this.anInt309, 0);
			if (local60 != null) {
				local60.anInt4355 = local60.anInt4356 = local60.anInt4357 = local60.anInt4354 = 0;
				if (arg2) {
					local60.method3628();
				}
				for (@Pc(80) int local80 = 0; local80 < arg0; local80++) {
					local60.method3624();
				}
			}
			local38 = arg1.method5993(local60);
			if (local38 != null) {
				this.aClass182_3.aClass268_43.method6164(local38, local30);
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IILclient!nj;)V")
	private void method337(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub25 arg1) {
		if (arg0 == 1) {
			this.anInt309 = arg1.method4083();
		} else if (arg0 == 2) {
			this.anInt314 = arg1.method4099();
		} else if (arg0 == 3) {
			this.aBoolean18 = true;
		} else if (arg0 == 4) {
			this.anInt309 = -1;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method338(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method4096();
			if (local18 == 0) {
				return;
			}
			this.method337(local18, arg0);
		}
	}
}
