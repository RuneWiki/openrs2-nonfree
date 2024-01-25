import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class270 {

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "[Lclient!de;")
	private Interface4[] anInterface4Array1 = null;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "[Lclient!de;")
	public Interface4[] anInterface4Array2 = null;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!fi;")
	public Interface7 anInterface7_2 = null;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Lclient!fi;")
	public Interface7 anInterface7_1 = null;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!lb;")
	private final Class145_Sub1 aClass145_Sub1_16;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "Z")
	public boolean aBoolean614;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!lb;)V")
	public Class270(@OriginalArg(0) Class145_Sub1 arg0) {
		this.aClass145_Sub1_16 = arg0;
		this.aBoolean614 = this.aClass145_Sub1_16.aBoolean949;
		if (this.aBoolean614 && !this.aClass145_Sub1_16.method9764(Static243.aClass158_10, Static307.aClass295_8)) {
			this.aBoolean614 = false;
		}
		if (this.aBoolean614 || this.aClass145_Sub1_16.method9843(Static307.aClass295_8, Static243.aClass158_10)) {
			Static710.method9459();
			if (this.aBoolean614) {
				@Pc(62) byte[] local62 = Static524.method7384(false, Static558.anObject13);
				this.anInterface7_1 = this.aClass145_Sub1_16.method9732(local62, Static307.aClass295_8);
				@Pc(78) byte[] local78 = Static524.method7384(false, Static161.anObject3);
				this.aClass145_Sub1_16.method9732(local78, Static307.aClass295_8);
			} else {
				this.anInterface4Array2 = new Interface4[16];
				for (@Pc(95) int local95 = 0; local95 < 16; local95++) {
					@Pc(109) byte[] local109 = Static226.method3244(Static558.anObject13, local95 * 128 * 256);
					this.anInterface4Array2[local95] = this.aClass145_Sub1_16.method9841(local109, true, 128, 128, Static307.aClass295_8);
				}
				this.anInterface4Array1 = new Interface4[16];
				for (@Pc(138) int local138 = 0; local138 < 16; local138++) {
					@Pc(150) byte[] local150 = Static226.method3244(Static161.anObject3, local138 * 128 * 256);
					this.anInterface4Array1[local138] = this.aClass145_Sub1_16.method9841(local150, true, 128, 128, Static307.aClass295_8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Z")
	public boolean method6535() {
		if (this.aBoolean614) {
			return this.anInterface7_1 != null;
		} else {
			return this.anInterface4Array2 != null;
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)Z")
	public boolean method6536() {
		if (this.anInterface7_2 == null) {
			@Pc(24) byte[] local24;
			if (Static605.anObject14 == null) {
				local24 = Static94.method1461(0.5F, 4.0F, new Class111_Sub1(419684), 16.0F, 4.0F, 0.6F);
				Static605.anObject14 = Static195.method2764(local24);
			}
			local24 = Static524.method7384(false, Static605.anObject14);
			@Pc(40) byte[] local40 = new byte[local24.length * 4];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 16; local44++) {
				@Pc(52) int local52 = local44 * 128 * 128;
				@Pc(54) int local54 = local52;
				for (@Pc(56) int local56 = 0; local56 < 128; local56++) {
					@Pc(65) int local65 = local54 + local56 * 128;
					@Pc(75) int local75 = (local56 - 1 & 0x7F) * 128 + local54;
					@Pc(86) int local86 = local54 + (local56 + 1 & 0x7F) * 128;
					for (@Pc(88) int local88 = 0; local88 < 128; local88++) {
						@Pc(108) float local108 = (float) ((local24[local75 + local88] & 0xFF) - (local24[local88 + local86] & 0xFF));
						@Pc(134) float local134 = (float) ((local24[local65 + (local88 - 1 & 0x7F)] & 0xFF) - (local24[(local88 + 1 & 0x7F) + local65] & 0xFF));
						@Pc(149) float local149 = (float) (128.0D / Math.sqrt((double) (local134 * local134 + local108 * local108 + 16384.0F)));
						local40[local42++] = (byte) (int) (local134 * local149 + 127.0F);
						local40[local42++] = (byte) (int) (local149 * 128.0F + 127.0F);
						local40[local42++] = (byte) (int) (local149 * local108 + 127.0F);
						local40[local42++] = local24[local52++];
					}
				}
			}
			this.anInterface7_2 = this.aClass145_Sub1_16.method9732(local40, Static165.aClass295_6);
		}
		return this.anInterface7_2 != null;
	}
}
