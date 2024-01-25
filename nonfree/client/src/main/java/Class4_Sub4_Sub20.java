import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class4_Sub4_Sub20 extends Class4_Sub4 {

	@OriginalMember(owner = "client!lr", name = "N", descriptor = "[I")
	private int[] anIntArray341;

	@OriginalMember(owner = "client!lr", name = "P", descriptor = "[I")
	private int[] anIntArray342;

	@OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
	private int anInt3972 = 10;

	@OriginalMember(owner = "client!lr", name = "Q", descriptor = "I")
	private int anInt3975 = 2048;

	@OriginalMember(owner = "client!lr", name = "X", descriptor = "I")
	private int anInt3981 = 0;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V")
	private void method3369() {
		@Pc(7) int local7 = 0;
		this.anIntArray342 = new int[this.anInt3972 + 1];
		this.anIntArray341 = new int[this.anInt3972 + 1];
		@Pc(32) int local32 = 4096 / this.anInt3972;
		@Pc(39) int local39 = local32 * this.anInt3975 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt3972; local41++) {
			this.anIntArray341[local41] = local7;
			this.anIntArray342[local41] = local7 + local39;
			local7 += local32;
		}
		this.anIntArray341[this.anInt3972] = 4096;
		this.anIntArray342[this.anInt3972] = this.anIntArray342[0] + 4096;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)V")
	@Override
	public void method5392() {
		this.method3369();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(27) int local27 = Static64.anIntArray148[arg0];
			@Pc(37) int local37;
			if (this.anInt3981 == 0) {
				@Pc(35) short local35 = 0;
				for (local37 = 0; local37 < this.anInt3972; local37++) {
					if (local27 >= this.anIntArray341[local37] && local27 < this.anIntArray341[local37 + 1]) {
						if (local27 < this.anIntArray342[local37]) {
							local35 = 4096;
						}
						break;
					}
				}
				Static363.method4758(local19, 0, Static124.anInt3576, local35);
			} else {
				for (@Pc(81) int local81 = 0; local81 < Static124.anInt3576; local81++) {
					local37 = 0;
					@Pc(87) short local87 = 0;
					@Pc(91) int local91 = Static149.anIntArray298[local81];
					@Pc(94) int local94 = this.anInt3981;
					if (local94 == 1) {
						local37 = local91;
					} else if (local94 == 2) {
						local37 = (local91 + local27 - 4096 >> 1) + 2048;
					} else if (local94 == 3) {
						local37 = (local91 - local27 >> 1) + 2048;
					}
					for (local94 = 0; local94 < this.anInt3972; local94++) {
						if (local37 >= this.anIntArray341[local94] && local37 < this.anIntArray341[local94 + 1]) {
							if (this.anIntArray342[local94] > local37) {
								local87 = 4096;
							}
							break;
						}
					}
					local19[local81] = local87;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3972 = arg1.method2380();
		} else if (arg0 == 1) {
			this.anInt3975 = arg1.method2404();
		} else if (arg0 == 2) {
			this.anInt3981 = arg1.method2380();
		}
	}
}
