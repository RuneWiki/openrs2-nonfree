import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class1_Sub2_Sub37 extends Class1_Sub2 {

	@OriginalMember(owner = "client!u", name = "P", descriptor = "I")
	private int anInt5732 = 2000;

	@OriginalMember(owner = "client!u", name = "I", descriptor = "I")
	private int anInt5726 = 0;

	@OriginalMember(owner = "client!u", name = "L", descriptor = "I")
	private int anInt5728 = 0;

	@OriginalMember(owner = "client!u", name = "R", descriptor = "I")
	private int anInt5734 = 16;

	@OriginalMember(owner = "client!u", name = "S", descriptor = "I")
	private int anInt5735 = 4096;

	static {
		new Class169(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt5728 = arg1.method5174();
		} else if (arg0 == 1) {
			this.anInt5732 = arg1.method5177();
		} else if (arg0 == 2) {
			this.anInt5734 = arg1.method5174();
		} else if (arg0 == 3) {
			this.anInt5726 = arg1.method5177();
		} else if (arg0 == 4) {
			this.anInt5735 = arg1.method5177();
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(28) int local28 = this.anInt5735 >> 1;
			@Pc(35) int[][] local35 = super.aClass74_41.method1352();
			@Pc(42) Random local42 = new Random((long) this.anInt5728);
			for (@Pc(44) int local44 = 0; local44 < this.anInt5732; local44++) {
				@Pc(64) int local64 = this.anInt5735 <= 0 ? this.anInt5726 : this.anInt5726 + Static351.method4927(this.anInt5735, local42) - local28;
				@Pc(70) int local70 = local64 >> 4 & 0xFF;
				@Pc(75) int local75 = Static351.method4927(Static158.anInt2658, local42);
				@Pc(80) int local80 = Static351.method4927(Static91.anInt1665, local42);
				@Pc(91) int local91 = (this.anInt5734 * Static392.anIntArray748[local70] >> 12) + local75;
				@Pc(102) int local102 = (this.anInt5734 * Static355.anIntArray531[local70] >> 12) + local80;
				@Pc(107) int local107 = local102 - local80;
				@Pc(111) int local111 = local91 - local75;
				if (local111 != 0 || local107 != 0) {
					if (local111 < 0) {
						local111 = -local111;
					}
					if (local107 < 0) {
						local107 = -local107;
					}
					@Pc(138) boolean local138 = local107 > local111;
					@Pc(142) int local142;
					@Pc(146) int local146;
					if (local138) {
						local142 = local75;
						local75 = local80;
						local146 = local91;
						local91 = local102;
						local80 = local142;
						local102 = local146;
					}
					if (local75 > local91) {
						local142 = local75;
						local75 = local91;
						local146 = local80;
						local80 = local102;
						local91 = local142;
						local102 = local146;
					}
					local142 = local80;
					local146 = local91 - local75;
					@Pc(179) int local179 = local102 - local80;
					@Pc(184) int local184 = -local146 / 2;
					@Pc(188) int local188 = 2048 / local146;
					@Pc(198) int local198 = 1024 - (Static351.method4927(4096, local42) >> 2);
					if (local179 < 0) {
						local179 = -local179;
					}
					@Pc(213) int local213 = local102 <= local80 ? -1 : 1;
					for (@Pc(215) int local215 = local75; local215 < local91; local215++) {
						@Pc(229) int local229 = local198 + local188 * (local215 - local75) + 1024;
						@Pc(233) int local233 = Static271.anInt4721 & local215;
						@Pc(237) int local237 = Static13.anInt189 & local142;
						if (local138) {
							local35[local237][local233] = local229;
						} else {
							local35[local233][local237] = local229;
						}
						local184 += local179;
						if (local184 > 0) {
							local142 -= -local213;
							local184 += -local146;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	@Override
	public void method5505() {
		Static73.method1169();
	}
}
