import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RDFTSKWD")
public final class Class3_Sub1_Sub1_Sub3 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!RDFTSKWD", name = "k", descriptor = "I")
	private int anInt462;

	@OriginalMember(owner = "client!RDFTSKWD", name = "l", descriptor = "I")
	private int anInt463;

	@OriginalMember(owner = "client!RDFTSKWD", name = "n", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!RDFTSKWD", name = "o", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!RDFTSKWD", name = "q", descriptor = "I")
	private int anInt465 = 45895;

	@OriginalMember(owner = "client!RDFTSKWD", name = "p", descriptor = "Lclient!TYXORIIC;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!RDFTSKWD", name = "r", descriptor = "I")
	public int anInt466;

	@OriginalMember(owner = "client!RDFTSKWD", name = "s", descriptor = "I")
	public int anInt467;

	@OriginalMember(owner = "client!RDFTSKWD", name = "t", descriptor = "I")
	public int anInt468;

	@OriginalMember(owner = "client!RDFTSKWD", name = "u", descriptor = "I")
	public int anInt469;

	@OriginalMember(owner = "client!RDFTSKWD", name = "m", descriptor = "I")
	public int anInt464;

	@OriginalMember(owner = "client!RDFTSKWD", name = "<init>", descriptor = "(IIIIIIIB)V")
	public Class3_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7) {
		try {
			this.aClass39_1 = Class39.aClass39Array1[arg3];
			this.anInt466 = arg0;
			this.anInt467 = arg6;
			@Pc(26) boolean local26 = false;
			this.anInt468 = arg1;
			this.anInt469 = arg5;
			this.anInt464 = arg4 + arg2;
			this.aBoolean110 = false;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("43969, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RDFTSKWD", name = "a", descriptor = "(II)V")
	public void method330(@OriginalArg(1) int arg0) {
		try {
			this.anInt463 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt463 <= this.aClass39_1.aClass30_2.method308(this.anInt462)) {
							return;
						}
						this.anInt463 -= this.aClass39_1.aClass30_2.method308(this.anInt462);
						this.anInt462++;
					} while (this.anInt462 < this.aClass39_1.aClass30_2.anInt386);
				} while (this.anInt462 >= 0 && this.anInt462 < this.aClass39_1.aClass30_2.anInt386);
				this.anInt462 = 0;
				this.aBoolean110 = true;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("16544, " + -24812 + ", " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RDFTSKWD", name = "a", descriptor = "(B)Lclient!UNLYQRUD;")
	@Override
	protected Class3_Sub1_Sub1_Sub5 method505() {
		try {
			@Pc(14) Class3_Sub1_Sub1_Sub5 local14 = this.aClass39_1.method377();
			if (local14 == null) {
				return null;
			}
			@Pc(26) int local26 = this.aClass39_1.aClass30_2.anIntArray90[this.anInt462];
			@Pc(37) Class3_Sub1_Sub1_Sub5 local37 = new Class3_Sub1_Sub1_Sub5(true, local14, false, 8, Class5.method64(local26));
			if (!this.aBoolean110) {
				local37.method403(956);
				local37.method404(936, local26);
				local37.anIntArrayArray15 = null;
				local37.anIntArrayArray14 = null;
			}
			if (this.aClass39_1.anInt559 != 128 || this.aClass39_1.anInt560 != 128) {
				local37.method412(this.aClass39_1.anInt559, this.aClass39_1.anInt560, this.aClass39_1.anInt559);
			}
			if (this.aClass39_1.anInt561 != 0) {
				if (this.aClass39_1.anInt561 == 90) {
					local37.method407();
				}
				if (this.aClass39_1.anInt561 == 180) {
					local37.method407();
					local37.method407();
				}
				if (this.aClass39_1.anInt561 == 270) {
					local37.method407();
					local37.method407();
					local37.method407();
				}
			}
			local37.method413(this.aClass39_1.anInt562 + 64, this.aClass39_1.anInt563 + 850, -30, -50, -30, true);
			return local37;
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("43096, " + 93 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}
}
