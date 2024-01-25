import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class96 {

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "[Lclient!dg;")
	private Interface6[] anInterface6Array1 = null;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "Lclient!rj;")
	public Interface20 anInterface20_1 = null;

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "[Lclient!dg;")
	public Interface6[] anInterface6Array2 = null;

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "Lclient!rj;")
	public Interface20 anInterface20_2 = null;

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "Lclient!rl;")
	private final Class82_Sub3 aClass82_Sub3_6;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "Z")
	public boolean aBoolean215;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class96(@OriginalArg(0) Class82_Sub3 arg0) {
		this.aClass82_Sub3_6 = arg0;
		this.aBoolean215 = this.aClass82_Sub3_6.aBoolean406;
		if (this.aBoolean215 && !this.aClass82_Sub3_6.method4994(Static168.aClass168_3, Static280.aClass182_8)) {
			this.aBoolean215 = false;
		}
		if (this.aBoolean215 || this.aClass82_Sub3_6.method5005(Static280.aClass182_8, Static168.aClass168_3)) {
			Static607.method8329();
			if (this.aBoolean215) {
				@Pc(136) byte[] local136 = Static184.method3030(Static52.anObject3, false);
				this.anInterface20_1 = this.aClass82_Sub3_6.method4970(local136, Static168.aClass168_3);
				@Pc(152) byte[] local152 = Static184.method3030(Static125.anObject10, false);
				this.aClass82_Sub3_6.method4970(local152, Static168.aClass168_3);
			} else {
				this.anInterface6Array2 = new Interface6[16];
				for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
					@Pc(72) byte[] local72 = Static43.method758(Static52.anObject3, local58 * 128 * 128 * 2);
					this.anInterface6Array2[local58] = this.aClass82_Sub3_6.method4934(Static168.aClass168_3, 128, true, local72, 128);
				}
				this.anInterface6Array1 = new Interface6[16];
				for (@Pc(97) int local97 = 0; local97 < 16; local97++) {
					@Pc(111) byte[] local111 = Static43.method758(Static125.anObject10, 2 * 128 * local97 * 128);
					this.anInterface6Array1[local97] = this.aClass82_Sub3_6.method4934(Static168.aClass168_3, 128, true, local111, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)Z")
	public boolean method2362() {
		if (this.aBoolean215) {
			return this.anInterface20_1 != null;
		} else {
			return this.anInterface6Array2 != null;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)Z")
	public boolean method2364() {
		if (this.anInterface20_2 == null) {
			@Pc(26) byte[] local26;
			if (Static413.anObject18 == null) {
				local26 = Static455.method6749(4.0F, 0.5F, 16.0F, 4.0F, new Class80_Sub1(419684), 0.6F);
				Static413.anObject18 = Static176.method2904(local26);
			}
			local26 = Static184.method3030(Static413.anObject18, false);
			@Pc(42) byte[] local42 = new byte[local26.length * 4];
			@Pc(44) int local44 = 0;
			for (@Pc(46) int local46 = 0; local46 < 16; local46++) {
				@Pc(54) int local54 = 128 * 128 * local46;
				@Pc(56) int local56 = local54;
				for (@Pc(58) int local58 = 0; local58 < 128; local58++) {
					@Pc(66) int local66 = local58 * 128 + local56;
					@Pc(76) int local76 = local56 + (local58 - 1 & 0x7F) * 128;
					@Pc(86) int local86 = (local58 + 1 & 0x7F) * 128 + local56;
					for (@Pc(88) int local88 = 0; local88 < 128; local88++) {
						@Pc(109) float local109 = (float) ((local26[local88 + local76] & 0xFF) - (local26[local86 + local88] & 0xFF));
						@Pc(135) float local135 = (float) ((local26[(local88 - 1 & 0x7F) + local66] & 0xFF) - (local26[(local88 + 1 & 0x7F) + local66] & 0xFF));
						@Pc(150) float local150 = (float) (128.0D / Math.sqrt((double) (local135 * local135 + local109 * local109 + 16384.0F)));
						local42[local44++] = (byte) (int) (local150 * local135 + 127.0F);
						local42[local44++] = (byte) (int) (local150 * 128.0F + 127.0F);
						local42[local44++] = (byte) (int) (local150 * local109 + 127.0F);
						local42[local44++] = local26[local54++];
					}
				}
			}
			this.anInterface20_2 = this.aClass82_Sub3_6.method4970(local42, Static95.aClass168_2);
		}
		return this.anInterface20_2 != null;
	}
}
