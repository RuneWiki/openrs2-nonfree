import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class358 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
	public int anInt9511;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
	public int anInt9514;

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "Lclient!sj;")
	public Class306 aClass306_4;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "Z")
	public boolean aBoolean728 = false;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)Z")
	public boolean method7911() {
		return this.aClass306_4.aClass259_152.method5988(this.anInt9511);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!es;I)V")
	public void method7912(@OriginalArg(0) Class2_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4325();
			if (local5 == 0) {
				return;
			}
			this.method7913(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILclient!es;)V")
	private void method7913(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt9511 = arg1.method4294();
		} else if (arg0 == 2) {
			this.anInt9514 = arg1.method4341();
		} else if (arg0 == 3) {
			this.aBoolean728 = true;
		} else if (arg0 == 4) {
			this.anInt9511 = -1;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLclient!r;II)Lclient!f;")
	public Class39 method7915(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) int arg2) {
		@Pc(32) long local32 = (long) (arg1.anInt7465 << 19 | (arg0 ? 262144 : 0) | arg2 << 16 | this.anInt9511);
		@Pc(40) Class39 local40 = (Class39) this.aClass306_4.aClass313_51.method6989(local32);
		if (local40 != null) {
			return local40;
		} else if (this.aClass306_4.aClass259_152.method5988(this.anInt9511)) {
			@Pc(62) Class13 local62 = Static596.method247(this.aClass306_4.aClass259_152, this.anInt9511, 0);
			if (local62 != null) {
				local62.anInt431 = local62.anInt429 = local62.anInt426 = local62.anInt430 = 0;
				if (arg0) {
					local62.method258();
				}
				for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
					local62.method256();
				}
			}
			local40 = arg1.method6256(local62, true);
			if (local40 != null) {
				this.aClass306_4.aClass313_51.method6980(local32, local40);
			}
			return local40;
		} else {
			return null;
		}
	}
}
