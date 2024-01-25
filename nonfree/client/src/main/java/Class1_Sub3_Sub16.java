import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public class Class1_Sub3_Sub16 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
	protected int anInt6269;

	@OriginalMember(owner = "client!hk", name = "S", descriptor = "[I")
	protected int[] anIntArray516;

	@OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
	protected int anInt6271;

	@OriginalMember(owner = "client!hk", name = "V", descriptor = "I")
	private int anInt6272 = -1;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub16() {
		super(0, false);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public final void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6272 = arg0.method4093();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14 && this.method5066()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(59) int local59 = this.anInt6269 * (this.anInt6271 == Static241.anInt4307 ? arg0 : this.anInt6271 * arg0 / Static241.anInt4307);
			@Pc(65) int local65;
			@Pc(74) int local74;
			if (this.anInt6269 == Static347.anInt5974) {
				for (local65 = 0; local65 < Static347.anInt5974; local65++) {
					local74 = this.anIntArray516[local59++];
					local39[local65] = (local74 & 0xFF) << 4;
					local35[local65] = local74 >> 4 & 0xFF0;
					local31[local65] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static347.anInt5974; local65++) {
					local74 = local65 * this.anInt6269 / Static347.anInt5974;
					@Pc(82) int local82 = this.anIntArray516[local59 + local74];
					local39[local65] = (local82 & 0xFF) << 4;
					local35[local65] = local82 >> 4 & 0xFF0;
					local31[local65] = local82 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
	@Override
	public final void method6080() {
		super.method6080();
		this.anIntArray516 = null;
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)I")
	@Override
	public final int method6077() {
		return this.anInt6272;
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)Z")
	protected final boolean method5066() {
		if (this.anIntArray516 != null) {
			return true;
		} else if (this.anInt6272 >= 0) {
			@Pc(30) Class159 local30 = Static187.anInt4910 < 0 ? Static459.method3747(Static97.aClass250_21, this.anInt6272) : Static459.method3755(Static97.aClass250_21, Static187.anInt4910, this.anInt6272);
			local30.method3748();
			this.anIntArray516 = local30.method3752();
			this.anInt6271 = local30.anInt4569;
			this.anInt6269 = local30.anInt4573;
			return true;
		} else {
			return false;
		}
	}
}
