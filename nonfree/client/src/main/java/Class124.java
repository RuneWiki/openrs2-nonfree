import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class124 {

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "[I")
	public int[] anIntArray213;

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "[I")
	public int[] anIntArray214;

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
	public int anInt3242 = -1;

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
	public int anInt3240 = -1;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!ik;)V")
	public Class124(@OriginalArg(0) Class182 arg0) {
		@Pc(12) byte[] local12 = arg0.method3961(6);
		this.method2946(new Class3_Sub2(local12));
		if (this.anIntArray213 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
	private Class124() {
		this.anIntArray213 = new int[0];
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ika;B)V")
	private void method2946(@OriginalArg(0) Class3_Sub2 arg0) {
		label49: while (true) {
			@Pc(17) int local17 = arg0.method2048(255);
			if (local17 != 0) {
				@Pc(55) int local55;
				if (local17 != 1) {
					if (local17 != 3) {
						if (local17 != 4) {
							if (local17 == 5) {
								this.anIntArray214 = new int[arg0.method2048(255)];
								local55 = 0;
								while (true) {
									if (this.anIntArray214.length <= local55) {
										continue label49;
									}
									this.anIntArray214[local55] = arg0.method2048(255);
									local55++;
								}
							}
							if (local17 != 6) {
								continue;
							}
							this.anIntArray215 = new int[arg0.method2048(255)];
							local55 = 0;
							while (true) {
								if (this.anIntArray215.length <= local55) {
									continue label49;
								}
								this.anIntArray215[local55] = arg0.method2048(255);
								local55++;
							}
						}
						this.anInt3240 = arg0.method2048(255);
						continue;
					}
					this.anInt3242 = arg0.method2048(255);
					continue;
				}
				local55 = arg0.method2048(255);
				this.anIntArray213 = new int[local55];
				@Pc(144) int local144 = 0;
				while (true) {
					if (local144 >= this.anIntArray213.length) {
						continue label49;
					}
					this.anIntArray213[local144] = arg0.method2048(255);
					local144++;
				}
			}
			return;
		}
	}
}
