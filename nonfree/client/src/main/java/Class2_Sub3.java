import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!be", name = "H", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!be", name = "J", descriptor = "I")
	public final int anInt218;

	@OriginalMember(owner = "client!be", name = "K", descriptor = "Z")
	public final boolean aBoolean25;

	@OriginalMember(owner = "client!be", name = "E", descriptor = "[I")
	private final int[] anIntArray44;

	@OriginalMember(owner = "client!be", name = "A", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!be", name = "I", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!be", name = "F", descriptor = "[I")
	private final int[] anIntArray45;

	@OriginalMember(owner = "client!be", name = "L", descriptor = "I")
	public final int anInt219;

	@OriginalMember(owner = "client!be", name = "D", descriptor = "I")
	private final int anInt217;

	@OriginalMember(owner = "client!be", name = "G", descriptor = "[I")
	public int[] anIntArray46;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!na;)V")
	public Class2_Sub3(@OriginalArg(0) Class2_Sub9 arg0) {
		this.anInt218 = arg0.method632();
		this.aBoolean25 = arg0.method640() == 1;
		@Pc(23) int local23 = arg0.method640();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray44 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray44[local39] = arg0.method632();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray42 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray42[local62] = arg0.method640();
			}
		}
		if (local23 > 1) {
			this.anIntArray47 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray47[local62] = arg0.method640();
			}
		}
		this.anIntArray45 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray45[local62] = arg0.method622();
		}
		this.anInt219 = arg0.method640();
		this.anInt217 = arg0.method640();
		this.anIntArray46 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(DILclient!fd;)Z")
	public boolean method193(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class24 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray44.length; local1++) {
			if (arg2.method1928(this.anIntArray44[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray46 = new int[local22];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArray44.length; local28++) {
			@Pc(37) Class2_Sub1_Sub2_Sub1 local37 = Static19.method376(this.anIntArray44[local28], arg2);
			local37.method1083();
			@Pc(42) byte[] local42 = local37.aByteArray19;
			@Pc(45) int[] local45 = local37.anIntArray164;
			@Pc(50) int local50 = this.anIntArray45[local28];
			@Pc(59) int local59;
			@Pc(65) int local65;
			@Pc(67) int local67;
			@Pc(72) int local72;
			if ((local50 & 0xFF000000) == 50331648) {
				local59 = local50 & 0xFF00FF;
				local65 = local50 >> 8 & 0xFF;
				for (local67 = 0; local67 < local45.length; local67++) {
					local72 = local45[local67];
					if ((local72 & 0xFFFF) == local72 >> 8) {
						local72 &= 0xFF;
						local45[local67] = local59 * local72 >> 8 & 0xFF00FF | local65 * local72 & 0xFF00;
					}
				}
			}
			for (local59 = 0; local59 < local45.length; local59++) {
				local45[local59] = Static78.method1377(local45[local59], arg0);
			}
			if (local28 == 0) {
				local65 = 0;
			} else {
				local65 = this.anIntArray42[local28 - 1];
			}
			if (local65 == 0) {
				if (local37.anInt1632 == arg1) {
					for (local67 = 0; local67 < local22; local67++) {
						this.anIntArray46[local67] = local45[local42[local67] & 0xFF];
					}
				} else {
					@Pc(171) int local171;
					if (local37.anInt1632 == 64 && arg1 == 128) {
						local67 = 0;
						for (local72 = 0; local72 < arg1; local72++) {
							for (local171 = 0; local171 < arg1; local171++) {
								this.anIntArray46[local67++] = local45[local42[(local171 >> 1) + (local72 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local37.anInt1632 == 128 && arg1 == 64) {
						local67 = 0;
						for (local72 = 0; local72 < arg1; local72++) {
							for (local171 = 0; local171 < arg1; local171++) {
								this.anIntArray46[local67++] = local45[local42[(local171 << 1) + (local72 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	public void method194(@OriginalArg(0) int arg0) {
		if (this.anIntArray46 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(79) int[] local79;
		if (this.anInt219 == 1 || this.anInt219 == 3) {
			if (Static9.anIntArray43 == null || Static9.anIntArray43.length < this.anIntArray46.length) {
				Static9.anIntArray43 = new int[this.anIntArray46.length];
			}
			if (this.anIntArray46.length == 4096) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local38 = this.anIntArray46.length;
			local45 = local31 * arg0 * this.anInt217;
			local49 = local38 - 1;
			if (this.anInt219 == 1) {
				local45 = -local45;
			}
			for (local58 = 0; local58 < local38; local58++) {
				local65 = local58 + local45 & local49;
				Static9.anIntArray43[local58] = this.anIntArray46[local65];
			}
			local79 = this.anIntArray46;
			this.anIntArray46 = Static9.anIntArray43;
			Static9.anIntArray43 = local79;
		}
		if (this.anInt219 != 2 && this.anInt219 != 4) {
			return;
		}
		if (Static9.anIntArray43 == null || Static9.anIntArray43.length < this.anIntArray46.length) {
			Static9.anIntArray43 = new int[this.anIntArray46.length];
		}
		if (this.anIntArray46.length == 4096) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local38 = this.anIntArray46.length;
		local45 = arg0 * this.anInt217;
		local49 = local31 - 1;
		if (this.anInt219 == 2) {
			local45 = -local45;
		}
		for (local58 = 0; local58 < local38; local58 += local31) {
			for (local65 = 0; local65 < local31; local65++) {
				@Pc(145) int local145 = local58 + local65;
				@Pc(153) int local153 = local58 + (local65 + local45 & local49);
				Static9.anIntArray43[local145] = this.anIntArray46[local153];
			}
		}
		local79 = this.anIntArray46;
		this.anIntArray46 = Static9.anIntArray43;
		Static9.anIntArray43 = local79;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "()V")
	public void method196() {
		this.anIntArray46 = null;
	}
}
