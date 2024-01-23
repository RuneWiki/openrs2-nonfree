import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class169 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "[Lclient!vb;")
	private Class167[] aClass167Array1 = new Class167[10];

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
	private int anInt5370;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	private int anInt5369;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class169(@OriginalArg(0) Class1_Sub11 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(14) int local14 = arg0.method2690();
			if (local14 != 0) {
				arg0.anInt3264--;
				this.aClass167Array1[local7] = new Class167();
				this.aClass167Array1[local7].method4183(arg0);
			}
		}
		this.anInt5370 = arg0.method2691();
		this.anInt5369 = arg0.method2691();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "()Lclient!cc;")
	public Class1_Sub10_Sub1 method4229() {
		@Pc(2) byte[] local2 = this.method4230();
		return new Class1_Sub10_Sub1(22050, local2, this.anInt5370 * 22050 / 1000, this.anInt5369 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "()[B")
	private byte[] method4230() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass167Array1[local3] != null && this.aClass167Array1[local3].anInt5347 + this.aClass167Array1[local3].anInt5348 > local1) {
				local1 = this.aClass167Array1[local3].anInt5347 + this.aClass167Array1[local3].anInt5348;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		local3 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local3];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass167Array1[local54] != null) {
				@Pc(72) int local72 = this.aClass167Array1[local54].anInt5347 * 22050 / 1000;
				@Pc(82) int local82 = this.aClass167Array1[local54].anInt5348 * 22050 / 1000;
				@Pc(94) int[] local94 = this.aClass167Array1[local54].method4182(local72, this.aClass167Array1[local54].anInt5347);
				for (@Pc(96) int local96 = 0; local96 < local72; local96++) {
					@Pc(111) int local111 = local52[local96 + local82] + (local94[local96] >> 8);
					if ((local111 + 128 & 0xFFFFFF00) != 0) {
						local111 = local111 >> 31 ^ 0x7F;
					}
					local52[local96 + local82] = (byte) local111;
				}
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "()I")
	public int method4231() {
		@Pc(1) int local1 = 9999999;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass167Array1[local3] != null && this.aClass167Array1[local3].anInt5348 / 20 < local1) {
				local1 = this.aClass167Array1[local3].anInt5348 / 20;
			}
		}
		if (this.anInt5370 < this.anInt5369 && this.anInt5370 / 20 < local1) {
			local1 = this.anInt5370 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass167Array1[local3] != null) {
				this.aClass167Array1[local3].anInt5348 -= local1 * 20;
			}
		}
		if (this.anInt5370 < this.anInt5369) {
			this.anInt5370 -= local1 * 20;
			this.anInt5369 -= local1 * 20;
		}
		return local1;
	}
}
