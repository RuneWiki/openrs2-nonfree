import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class176 {

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "[B")
	public static final byte[] aByteArray159;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Lclient!tf;")
	private Class14 aClass14_180;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
	private int anInt5166 = 0;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Lclient!bn;")
	private final Class25 aClass25_27;

	static {
		@Pc(7) int local7 = 0;
		aByteArray159 = new byte[32896];
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			for (@Pc(15) int local15 = 0; local15 <= local12; local15++) {
				aByteArray159[local7++] = (byte) (255.0D / Math.sqrt((double) ((float) (local12 * local12 + local15 * local15 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!bn;)V")
	public Class176(@OriginalArg(0) Class25 arg0) {
		this.aClass25_27 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)Lclient!tf;")
	public Class14 method4614() {
		@Pc(23) Class14 local23;
		if (this.anInt5166 > 0 && this.aClass25_27.aClass14Array1[this.anInt5166 - 1] != this.aClass14_180) {
			local23 = this.aClass14_180;
			this.aClass14_180 = local23.aClass14_248;
			return local23;
		}
		while (this.aClass25_27.anInt622 > this.anInt5166) {
			local23 = this.aClass25_27.aClass14Array1[this.anInt5166++].aClass14_248;
			if (local23 != this.aClass25_27.aClass14Array1[this.anInt5166 - 1]) {
				this.aClass14_180 = local23.aClass14_248;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)Lclient!tf;")
	public Class14 method4615() {
		this.anInt5166 = 0;
		return this.method4614();
	}
}
