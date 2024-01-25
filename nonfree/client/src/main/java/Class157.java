import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class157 {

	@OriginalMember(owner = "client!j", name = "b", descriptor = "Lclient!gv;")
	public Interface9 anInterface9_1 = null;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "[Lclient!hi;")
	public Interface10[] anInterface10Array1 = null;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Lclient!gv;")
	public Interface9 anInterface9_2 = null;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "[Lclient!hi;")
	private Interface10[] anInterface10Array2 = null;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "Lclient!cf;")
	private final Class43_Sub1 aClass43_Sub1_10;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "Z")
	public boolean aBoolean343;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!cf;)V")
	public Class157(@OriginalArg(0) Class43_Sub1 arg0) {
		this.aClass43_Sub1_10 = arg0;
		this.aBoolean343 = this.aClass43_Sub1_10.aBoolean366;
		if (this.aBoolean343 && !this.aClass43_Sub1_10.method4286(Static461.aClass292_14, Static58.aClass93_4)) {
			this.aBoolean343 = false;
		}
		if (this.aBoolean343 || this.aClass43_Sub1_10.method4180(Static461.aClass292_14, Static58.aClass93_4)) {
			Static121.method2512();
			if (this.aBoolean343) {
				@Pc(132) byte[] local132 = Static403.method5862(false, Static77.anObject10);
				this.anInterface9_2 = this.aClass43_Sub1_10.method4192(Static58.aClass93_4, local132);
				@Pc(148) byte[] local148 = Static403.method5862(false, Static585.anObject59);
				this.aClass43_Sub1_10.method4192(Static58.aClass93_4, local148);
			} else {
				this.anInterface10Array1 = new Interface10[16];
				for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
					@Pc(70) byte[] local70 = Static1.method5(local58 * 16384 * 2, Static77.anObject10);
					this.anInterface10Array1[local58] = this.aClass43_Sub1_10.method4285(128, local70, 128, true, Static58.aClass93_4);
				}
				this.anInterface10Array2 = new Interface10[16];
				for (@Pc(95) int local95 = 0; local95 < 16; local95++) {
					@Pc(107) byte[] local107 = Static1.method5(local95 * 128 * 256, Static585.anObject59);
					this.anInterface10Array2[local95] = this.aClass43_Sub1_10.method4285(128, local107, 128, true, Static58.aClass93_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)Z")
	public boolean method3970() {
		if (this.aBoolean343) {
			return this.anInterface9_2 != null;
		} else {
			return this.anInterface10Array1 != null;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)Z")
	public boolean method3972() {
		if (this.anInterface9_1 == null) {
			@Pc(28) byte[] local28;
			if (Static323.anObject60 == null) {
				local28 = Static341.method5185(new Class214_Sub1(419684), 4.0F, 16.0F, 0.6F, 4.0F, 0.5F);
				Static323.anObject60 = Static223.method3868(local28);
			}
			local28 = Static403.method5862(false, Static323.anObject60);
			@Pc(44) byte[] local44 = new byte[local28.length * 4];
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 16; local48++) {
				@Pc(56) int local56 = 128 * 128 * local48;
				@Pc(58) int local58 = local56;
				for (@Pc(60) int local60 = 0; local60 < 128; local60++) {
					@Pc(68) int local68 = local60 * 128 + local58;
					@Pc(79) int local79 = local58 + (local60 - 1 & 0x7F) * 128;
					@Pc(89) int local89 = (local60 + 1 & 0x7F) * 128 + local58;
					for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
						@Pc(111) float local111 = (float) ((local28[local91 + local79] & 0xFF) - (local28[local91 + local89] & 0xFF));
						@Pc(138) float local138 = (float) ((local28[(local91 - 1 & 0x7F) + local68] & 0xFF) - (local28[local68 + (local91 + 1 & 0x7F)] & 0xFF));
						@Pc(153) float local153 = (float) (128.0D / Math.sqrt((double) (local138 * local138 + local111 * local111 + 16384.0F)));
						local44[local46++] = (byte) (local153 * local138 + 127.0F);
						local44[local46++] = (byte) (local153 * 128.0F + 127.0F);
						local44[local46++] = (byte) (local153 * local111 + 127.0F);
						local44[local46++] = local28[local56++];
					}
				}
			}
			this.anInterface9_1 = this.aClass43_Sub1_10.method4192(Static581.aClass93_14, local44);
		}
		return this.anInterface9_1 != null;
	}
}
