import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class174 {

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "[Lclient!oia;")
	public Interface19[] anInterface19Array2 = null;

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "Lclient!co;")
	public Interface5 anInterface5_2 = null;

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "[Lclient!oia;")
	private Interface19[] anInterface19Array1 = null;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "Lclient!co;")
	public Interface5 anInterface5_1 = null;

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "Lclient!pga;")
	private final Class95_Sub3 aClass95_Sub3_10;

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "Z")
	public boolean aBoolean302;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!pga;)V")
	public Class174(@OriginalArg(0) Class95_Sub3 arg0) {
		this.aClass95_Sub3_10 = arg0;
		this.aBoolean302 = this.aClass95_Sub3_10.aBoolean623;
		if (this.aBoolean302 && !this.aClass95_Sub3_10.method7135(Static290.aClass189_11, Static389.aClass188_11)) {
			this.aBoolean302 = false;
		}
		if (this.aBoolean302 || this.aClass95_Sub3_10.method7103(Static389.aClass188_11, Static290.aClass189_11)) {
			Static260.method3555();
			if (this.aBoolean302) {
				@Pc(57) byte[] local57 = Static452.method6139(false, Static288.anObject8);
				this.anInterface5_2 = this.aClass95_Sub3_10.method7068(local57, Static389.aClass188_11);
				@Pc(73) byte[] local73 = Static452.method6139(false, Static372.anObject14);
				this.aClass95_Sub3_10.method7068(local73, Static389.aClass188_11);
			} else {
				this.anInterface19Array2 = new Interface19[16];
				for (@Pc(90) int local90 = 0; local90 < 16; local90++) {
					@Pc(102) byte[] local102 = Static313.method4243(Static288.anObject8, local90 * 128 * 256);
					this.anInterface19Array2[local90] = this.aClass95_Sub3_10.method7031(true, 128, 128, local102, Static389.aClass188_11);
				}
				this.anInterface19Array1 = new Interface19[16];
				for (@Pc(125) int local125 = 0; local125 < 16; local125++) {
					@Pc(139) byte[] local139 = Static313.method4243(Static372.anObject14, local125 * 2 * 128 * 128);
					this.anInterface19Array1[local125] = this.aClass95_Sub3_10.method7031(true, 128, 128, local139, Static389.aClass188_11);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Z")
	public boolean method3797() {
		if (this.aBoolean302) {
			return this.anInterface5_2 != null;
		} else {
			return this.anInterface19Array2 != null;
		}
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)Z")
	public boolean method3799() {
		if (this.anInterface5_1 == null) {
			@Pc(30) byte[] local30;
			if (Static240.anObject2 == null) {
				local30 = Static555.method7625(16.0F, 4.0F, 0.6F, 0.5F, 4.0F, new Class115_Sub1(419684));
				Static240.anObject2 = Static253.method3515(local30);
			}
			local30 = Static452.method6139(false, Static240.anObject2);
			@Pc(46) byte[] local46 = new byte[local30.length * 4];
			@Pc(48) int local48 = 0;
			for (@Pc(50) int local50 = 0; local50 < 16; local50++) {
				@Pc(58) int local58 = local50 * 128 * 128;
				@Pc(60) int local60 = local58;
				for (@Pc(62) int local62 = 0; local62 < 128; local62++) {
					@Pc(70) int local70 = local60 + local62 * 128;
					@Pc(81) int local81 = local60 + (local62 - 1 & 0x7F) * 128;
					@Pc(91) int local91 = local60 + (local62 + 1 & 0x7F) * 128;
					for (@Pc(93) int local93 = 0; local93 < 128; local93++) {
						@Pc(113) float local113 = (float) ((local30[local81 + local93] & 0xFF) - (local30[local93 + local91] & 0xFF));
						@Pc(139) float local139 = (float) ((local30[local70 + (local93 - 1 & 0x7F)] & 0xFF) - (local30[(local93 + 1 & 0x7F) + local70] & 0xFF));
						@Pc(154) float local154 = (float) (128.0D / Math.sqrt((double) (local113 * local113 + local139 * local139 + 16384.0F)));
						local46[local48++] = (byte) (local139 * local154 + 127.0F);
						local46[local48++] = (byte) (local154 * 128.0F + 127.0F);
						local46[local48++] = (byte) (local154 * local113 + 127.0F);
						local46[local48++] = local30[local58++];
					}
				}
			}
			this.anInterface5_1 = this.aClass95_Sub3_10.method7068(local46, Static393.aClass188_12);
		}
		return this.anInterface5_1 != null;
	}
}
