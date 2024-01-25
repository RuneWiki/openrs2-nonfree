import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class209 implements Interface3 {

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "Lclient!lm;")
	private final Class124 aClass124_9 = new Class124(256);

	@OriginalMember(owner = "client!vk", name = "o", descriptor = "Lclient!tj;")
	private final Class193 aClass193_106;

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "Lclient!tj;")
	private final Class193 aClass193_105;

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "[Lclient!jb;")
	private final Class102[] aClass102Array1;

	static {
		new Class159("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!tj;Lclient!tj;Lclient!tj;)V")
	public Class209(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) Class193 arg2) {
		this.aClass193_106 = arg1;
		this.aClass193_105 = arg2;
		@Pc(24) Class4_Sub11 local24 = new Class4_Sub11(arg0.method5047(0, 0));
		@Pc(28) int local28 = local24.method3401();
		this.aClass102Array1 = new Class102[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method3440() == 1) {
				this.aClass102Array1[local34] = new Class102();
			}
		}
		for (@Pc(54) int local54 = 0; local54 < local28; local54++) {
			if (this.aClass102Array1[local54] != null) {
				this.aClass102Array1[local54].aBoolean263 = local24.method3440() == 0;
			}
		}
		for (@Pc(79) int local79 = 0; local79 < local28; local79++) {
			if (this.aClass102Array1[local79] != null) {
				this.aClass102Array1[local79].aBoolean257 = local24.method3440() == 1;
			}
		}
		for (@Pc(107) int local107 = 0; local107 < local28; local107++) {
			if (this.aClass102Array1[local107] != null) {
				this.aClass102Array1[local107].aBoolean256 = local24.method3440() == 1;
			}
		}
		for (@Pc(137) int local137 = 0; local137 < local28; local137++) {
			if (this.aClass102Array1[local137] != null) {
				this.aClass102Array1[local137].aBoolean264 = local24.method3440() == 1;
			}
		}
		for (@Pc(165) int local165 = 0; local165 < local28; local165++) {
			if (this.aClass102Array1[local165] != null) {
				this.aClass102Array1[local165].aByte38 = local24.method3426();
			}
		}
		for (@Pc(186) int local186 = 0; local186 < local28; local186++) {
			if (this.aClass102Array1[local186] != null) {
				this.aClass102Array1[local186].aByte41 = local24.method3426();
			}
		}
		for (@Pc(207) int local207 = 0; local207 < local28; local207++) {
			if (this.aClass102Array1[local207] != null) {
				this.aClass102Array1[local207].aByte36 = local24.method3426();
			}
		}
		for (@Pc(228) int local228 = 0; local228 < local28; local228++) {
			if (this.aClass102Array1[local228] != null) {
				this.aClass102Array1[local228].aByte40 = local24.method3426();
			}
		}
		for (@Pc(253) int local253 = 0; local253 < local28; local253++) {
			if (this.aClass102Array1[local253] != null) {
				this.aClass102Array1[local253].aShort52 = (short) local24.method3401();
			}
		}
		for (@Pc(275) int local275 = 0; local275 < local28; local275++) {
			if (this.aClass102Array1[local275] != null) {
				this.aClass102Array1[local275].aByte39 = local24.method3426();
			}
		}
		for (@Pc(300) int local300 = 0; local300 < local28; local300++) {
			if (this.aClass102Array1[local300] != null) {
				this.aClass102Array1[local300].aByte37 = local24.method3426();
			}
		}
		for (@Pc(325) int local325 = 0; local325 < local28; local325++) {
			if (this.aClass102Array1[local325] != null) {
				this.aClass102Array1[local325].aBoolean260 = local24.method3440() == 1;
			}
		}
		for (@Pc(351) int local351 = 0; local351 < local28; local351++) {
			if (this.aClass102Array1[local351] != null) {
				this.aClass102Array1[local351].aBoolean258 = local24.method3440() == 1;
			}
		}
		for (@Pc(377) int local377 = 0; local377 < local28; local377++) {
			if (this.aClass102Array1[local377] != null) {
				this.aClass102Array1[local377].aByte42 = local24.method3426();
			}
		}
		for (@Pc(398) int local398 = 0; local398 < local28; local398++) {
			if (this.aClass102Array1[local398] != null) {
				this.aClass102Array1[local398].aBoolean262 = local24.method3440() == 1;
			}
		}
		for (@Pc(430) int local430 = 0; local430 < local28; local430++) {
			if (this.aClass102Array1[local430] != null) {
				this.aClass102Array1[local430].aBoolean259 = local24.method3440() == 1;
			}
		}
		for (@Pc(460) int local460 = 0; local460 < local28; local460++) {
			if (this.aClass102Array1[local460] != null) {
				this.aClass102Array1[local460].aBoolean261 = local24.method3440() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(FIIIIZ)[I")
	@Override
	public int[] method5440(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return this.method5443(arg1).method3207(this.aClass102Array1[arg1].aBoolean258, (double) arg0, this.aClass193_105, arg2, this, arg3);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5439(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub4_Sub8 local13 = this.method5443(arg0);
		return local13 != null && local13.method3202(this, this.aClass193_105);
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(II)Lclient!kj;")
	private Class4_Sub4_Sub8 method5443(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub4 local10 = this.aClass124_9.method3525((long) arg0);
		if (local10 != null) {
			return (Class4_Sub4_Sub8) local10;
		}
		@Pc(21) byte[] local21 = this.aClass193_106.method5049(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class4_Sub4_Sub8 local33 = new Class4_Sub4_Sub8(new Class4_Sub11(local21));
			this.aClass124_9.method3528(local33, (long) arg0);
			return local33;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZFIBI)[I")
	@Override
	public int[] method5442(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		return this.method5443(arg4).method3204(arg3, arg1, this.aClass102Array1[arg4].aBoolean258, (double) arg2, arg0, this.aClass193_105, this);
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)Lclient!jb;")
	@Override
	public Class102 method5441(@OriginalArg(0) int arg0) {
		return this.aClass102Array1[arg0];
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IFIBZI)[F")
	@Override
	public float[] method5438(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		return this.method5443(arg0).method3203(arg2, arg3, this.aClass102Array1[arg0].aBoolean258, this.aClass193_105, this);
	}
}
