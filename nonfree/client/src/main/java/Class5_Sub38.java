import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class5_Sub38 extends Class5 {

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Lclient!ct;")
	public Class5_Sub14_Sub1 aClass5_Sub14_Sub1_2;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	public int anInt6677;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!dja;")
	public Class81 aClass81_1;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	public int anInt6679;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
	public int anInt6680;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "[I")
	public int[] anIntArray377;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "Lclient!kia;")
	public Class41_Sub1_Sub1_Sub3_Sub1 aClass41_Sub1_Sub1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Z")
	public boolean aBoolean476;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
	public int anInt6681;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!ct;")
	public Class5_Sub14_Sub1 aClass5_Sub14_Sub1_3;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
	public int anInt6682;

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "Z")
	public boolean aBoolean477;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
	public int anInt6684;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "Lclient!ts;")
	public Class41_Sub1_Sub1_Sub3_Sub2 aClass41_Sub1_Sub1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
	public int anInt6685;

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "Lclient!vp;")
	public Class5_Sub54 aClass5_Sub54_2;

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
	public int anInt6687;

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
	public int anInt6688;

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "Lclient!vp;")
	public Class5_Sub54 aClass5_Sub54_3;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
	public int anInt6689;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
	public int anInt6690;

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "Z")
	public boolean aBoolean478;

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "Lclient!bc;")
	public Class5_Sub9_Sub1 aClass5_Sub9_Sub1_2;

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
	public int anInt6691;

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "Lclient!bc;")
	public Class5_Sub9_Sub1 aClass5_Sub9_Sub1_3;

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
	public int anInt6695;

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
	public int anInt6696;

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
	public int anInt6693 = 0;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	public void method5633() {
		@Pc(10) int local10 = this.anInt6677;
		@Pc(13) boolean local13 = this.aBoolean478;
		if (this.aClass81_1 != null) {
			@Pc(141) Class81 local141 = this.aClass81_1.method1760(Static413.aClass63_1);
			if (local141 == null) {
				this.anInt6682 = 256;
				this.anInt6679 = 0;
				this.anInt6696 = 0;
				this.anInt6690 = 0;
				this.aBoolean478 = false;
				this.anInt6677 = -1;
				this.anInt6687 = 0;
				this.anInt6684 = 0;
				this.aBoolean477 = false;
				this.anInt6681 = 256;
				this.anIntArray377 = null;
			} else {
				this.anInt6696 = local141.anInt1882;
				this.anInt6677 = local141.anInt1923;
				this.anIntArray377 = local141.anIntArray97;
				this.anInt6682 = local141.anInt1893;
				this.anInt6690 = local141.anInt1889 << 9;
				this.anInt6684 = local141.anInt1920;
				this.aBoolean477 = local141.aBoolean129;
				this.anInt6681 = local141.anInt1917;
				this.aBoolean478 = local141.aBoolean136;
				this.anInt6687 = local141.anInt1872;
			}
		} else if (this.aClass41_Sub1_Sub1_Sub3_Sub1_2 != null) {
			@Pc(24) int local24 = Static594.method8045(this.aClass41_Sub1_Sub1_Sub3_Sub1_2);
			if (local24 != local10) {
				this.anInt6677 = local24;
				@Pc(38) Class311 local38 = this.aClass41_Sub1_Sub1_Sub3_Sub1_2.aClass311_1;
				if (local38.anIntArray476 != null) {
					local38 = local38.method7325(Static413.aClass63_1);
				}
				if (local38 == null) {
					this.anInt6684 = this.anInt6690 = this.anInt6679 = 0;
					this.aBoolean478 = this.aClass41_Sub1_Sub1_Sub3_Sub1_2.aClass311_1.aBoolean622;
					this.anInt6682 = 256;
					this.anInt6681 = 256;
				} else {
					this.anInt6682 = local38.anInt8667;
					this.anInt6679 = local38.anInt8666 << 9;
					this.aBoolean478 = local38.aBoolean622;
					this.anInt6681 = local38.anInt8642;
					this.anInt6684 = local38.anInt8663;
					this.anInt6690 = local38.anInt8640 << 9;
				}
			}
		} else if (this.aClass41_Sub1_Sub1_Sub3_Sub2_2 != null) {
			this.anInt6677 = Static166.method2457(this.aClass41_Sub1_Sub1_Sub3_Sub2_2);
			this.anInt6681 = 256;
			this.anInt6679 = 0;
			this.anInt6682 = 256;
			this.anInt6690 = this.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt9560 << 9;
			this.anInt6684 = this.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt9533;
			this.aBoolean478 = this.aClass41_Sub1_Sub1_Sub3_Sub2_2.aBoolean699;
		}
		if (local10 == this.anInt6677 && this.aBoolean478 == local13) {
			return;
		}
		if (this.aClass5_Sub14_Sub1_3 == null) {
			return;
		}
		Static229.aClass5_Sub14_Sub3_1.method2294(this.aClass5_Sub14_Sub1_3);
		this.aClass5_Sub54_2 = null;
		this.aClass5_Sub14_Sub1_3 = null;
		this.aClass5_Sub9_Sub1_3 = null;
	}
}
