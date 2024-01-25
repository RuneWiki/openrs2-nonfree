import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class210 {

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "[I")
	public int[] anIntArray356;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "[I")
	public int[] anIntArray357;

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "[I")
	public int[] anIntArray358;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
	public int anInt5037 = -1;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	public int anInt5043 = -1;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!nca;)V")
	public Class210(@OriginalArg(0) Class254 arg0) {
		@Pc(12) byte[] local12 = arg0.method6079(6);
		this.method4573(new Class2_Sub20(local12));
		if (this.anIntArray356 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	private Class210() {
		this.anIntArray356 = new int[0];
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!et;)V")
	private void method4573(@OriginalArg(1) Class2_Sub20 arg0) {
		label49: while (true) {
			@Pc(20) int local20 = arg0.method8581(-17416);
			if (local20 != 0) {
				@Pc(57) int local57;
				if (local20 != 1) {
					if (local20 != 3) {
						if (local20 != 4) {
							if (local20 == 5) {
								this.anIntArray357 = new int[arg0.method8581(-17416)];
								local57 = 0;
								while (true) {
									if (this.anIntArray357.length <= local57) {
										continue label49;
									}
									this.anIntArray357[local57] = arg0.method8581(-17416);
									local57++;
								}
							}
							if (local20 != 6) {
								continue;
							}
							this.anIntArray358 = new int[arg0.method8581(-17416)];
							local57 = 0;
							while (true) {
								if (local57 >= this.anIntArray358.length) {
									continue label49;
								}
								this.anIntArray358[local57] = arg0.method8581(-17416);
								local57++;
							}
						}
						this.anInt5037 = arg0.method8581(-17416);
						continue;
					}
					this.anInt5043 = arg0.method8581(-17416);
					continue;
				}
				local57 = arg0.method8581(-17416);
				this.anIntArray356 = new int[local57];
				@Pc(148) int local148 = 0;
				while (true) {
					if (this.anIntArray356.length <= local148) {
						continue label49;
					}
					this.anIntArray356[local148] = arg0.method8581(-17416);
					local148++;
				}
			}
			return;
		}
	}
}
