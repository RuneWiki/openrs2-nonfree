import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class1_Sub2_Sub1_Sub2 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
	private final int anInt271;

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
	private final int anInt265;

	@OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
	private final int anInt270;

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
	private final int anInt272;

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
	private final int anInt269;

	@OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
	private final int anInt273;

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "Lclient!ub;")
	private Class1_Sub2_Sub18 aClass1_Sub2_Sub18_1;

	@OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIIIZLclient!fb;)V")
	public Class1_Sub2_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class1_Sub2_Sub1 arg8) {
		this.anInt271 = arg4;
		this.anInt265 = arg3;
		this.anInt270 = arg2;
		this.anInt272 = arg1;
		this.anInt269 = arg0;
		this.anInt273 = arg5;
		if (arg6 != -1) {
			this.aClass1_Sub2_Sub18_1 = Static73.method1277(arg6);
			this.anInt275 = Static142.anInt3104 - 1;
			this.anInt266 = 0;
			if (this.aClass1_Sub2_Sub18_1.anInt3800 == 0 && arg8 != null && arg8 instanceof Class1_Sub2_Sub1_Sub2) {
				@Pc(50) Class1_Sub2_Sub1_Sub2 local50 = (Class1_Sub2_Sub1_Sub2) arg8;
				if (local50.aClass1_Sub2_Sub18_1 == this.aClass1_Sub2_Sub18_1) {
					this.anInt266 = local50.anInt266;
					this.anInt275 = local50.anInt275;
					return;
				}
			}
			if (arg7 && this.aClass1_Sub2_Sub18_1.anInt3793 != -1) {
				this.anInt266 = (int) (Math.random() * (double) this.aClass1_Sub2_Sub18_1.anIntArray396.length);
				this.anInt275 -= (int) ((double) this.aClass1_Sub2_Sub18_1.anIntArray394[this.anInt266] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Lclient!oh;")
	@Override
	protected Class1_Sub2_Sub1_Sub4 method2785() {
		if (this.aClass1_Sub2_Sub18_1 != null) {
			@Pc(10) int local10 = Static142.anInt3104 - this.anInt275;
			if (local10 > 100 && this.aClass1_Sub2_Sub18_1.anInt3793 > 0) {
				local10 = 100;
			}
			label46: {
				do {
					do {
						if (local10 <= this.aClass1_Sub2_Sub18_1.anIntArray394[this.anInt266]) {
							break label46;
						}
						local10 -= this.aClass1_Sub2_Sub18_1.anIntArray394[this.anInt266];
						this.anInt266++;
					} while (this.anInt266 < this.aClass1_Sub2_Sub18_1.anIntArray396.length);
					this.anInt266 -= this.aClass1_Sub2_Sub18_1.anInt3793;
				} while (this.anInt266 >= 0 && this.anInt266 < this.aClass1_Sub2_Sub18_1.anIntArray396.length);
				this.aClass1_Sub2_Sub18_1 = null;
			}
			this.anInt275 = Static142.anInt3104 - local10;
		}
		@Pc(102) Class1_Sub2_Sub8 local102 = Static14.method220(this.anInt269);
		if (local102.anIntArray108 != null) {
			local102 = local102.method936();
		}
		if (local102 == null) {
			return null;
		}
		@Pc(126) int local126;
		@Pc(129) int local129;
		if (this.anInt270 == 1 || this.anInt270 == 3) {
			local129 = local102.anInt1237;
			local126 = local102.anInt1277;
		} else {
			local126 = local102.anInt1237;
			local129 = local102.anInt1277;
		}
		@Pc(144) int local144 = this.anInt271 + (local126 >> 1);
		@Pc(159) int local159 = this.anInt271 + (local126 + 1 >> 1);
		@Pc(169) int local169 = this.anInt273 + (local129 + 1 >> 1);
		@Pc(177) int local177 = this.anInt273 + (local129 >> 1);
		@Pc(182) int[][] local182 = Static157.anIntArrayArrayArray7[this.anInt265];
		@Pc(208) int local208 = local182[local159][local169] + local182[local144][local169] + local182[local159][local177] + local182[local144][local177] >> 2;
		@Pc(218) int local218 = (this.anInt271 << 7) + (local126 << 6);
		@Pc(227) int local227 = (local129 << 6) + (this.anInt273 << 7);
		return local102.method937(this.anInt266, this.aClass1_Sub2_Sub18_1, local218, this.anInt272, local208, this.anInt270, local227, local182);
	}
}
