import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class132 {

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "Lclient!me;")
	private Class5 aClass5_83;

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "Lclient!qha;")
	private Class291 aClass291_16;

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
	private int anInt2986 = 0;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	private Class132() {
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!qha;)V")
	public Class132(@OriginalArg(0) Class291 arg0) {
		this.aClass291_16 = arg0;
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)Lclient!me;")
	public Class5 method2586() {
		@Pc(27) Class5 local27;
		if (this.anInt2986 > 0 && this.aClass291_16.aClass5Array1[this.anInt2986 - 1] != this.aClass5_83) {
			local27 = this.aClass5_83;
			this.aClass5_83 = local27.aClass5_338;
			return local27;
		}
		while (this.aClass291_16.anInt8120 > this.anInt2986) {
			local27 = this.aClass291_16.aClass5Array1[this.anInt2986++].aClass5_338;
			if (local27 != this.aClass291_16.aClass5Array1[this.anInt2986 - 1]) {
				this.aClass5_83 = local27.aClass5_338;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)Lclient!me;")
	public Class5 method2588() {
		this.anInt2986 = 0;
		return this.method2586();
	}
}
