import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class6_Sub39 extends Class6 {

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
	public int anInt5869;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "[I")
	public int[] anIntArray667;

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
	public int anInt5873;

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "Lclient!fb;")
	public Class66 aClass66_1;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "Lclient!ri;")
	public Class44_Sub4_Sub4_Sub2 aClass44_Sub4_Sub4_Sub2_1;

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
	public int anInt5876;

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "Lclient!qo;")
	public Class44_Sub4_Sub4_Sub1 aClass44_Sub4_Sub4_Sub1_2;

	@OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
	public int anInt5877;

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "Lclient!we;")
	public Class6_Sub12_Sub4 aClass6_Sub12_Sub4_2;

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
	public int anInt5879;

	@OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
	public int anInt5880;

	@OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
	public int anInt5881;

	@OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
	public int anInt5883;

	@OriginalMember(owner = "client!ug", name = "F", descriptor = "Z")
	public boolean aBoolean396;

	@OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
	public int anInt5885;

	@OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
	public int anInt5886;

	@OriginalMember(owner = "client!ug", name = "J", descriptor = "Lclient!we;")
	public Class6_Sub12_Sub4 aClass6_Sub12_Sub4_3;

	@OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
	public int anInt5888;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
	public int anInt5868 = 0;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
	public void method5319() {
		@Pc(13) int local13 = this.anInt5873;
		if (this.aClass66_1 != null) {
			@Pc(95) Class66 local95 = this.aClass66_1.method1373();
			if (local95 == null) {
				this.anInt5883 = 0;
				this.anInt5880 = 0;
				this.anIntArray667 = null;
				this.anInt5869 = 0;
				this.anInt5873 = -1;
				this.anInt5885 = 0;
			} else {
				this.anInt5873 = local95.anInt1500;
				this.anInt5885 = local95.anInt1472;
				this.anInt5880 = local95.anInt1471;
				this.anIntArray667 = local95.anIntArray165;
				this.anInt5869 = local95.anInt1469 * 128;
				this.anInt5883 = local95.anInt1465;
			}
		} else if (this.aClass44_Sub4_Sub4_Sub2_1 != null) {
			@Pc(47) int local47 = Static178.method3319(this.aClass44_Sub4_Sub4_Sub2_1);
			if (local47 != local13) {
				this.anInt5873 = local47;
				@Pc(61) Class18 local61 = this.aClass44_Sub4_Sub4_Sub2_1.aClass18_1;
				if (local61.anIntArray37 != null) {
					local61 = local61.method369();
				}
				if (local61 == null) {
					this.anInt5883 = this.anInt5869 = 0;
				} else {
					this.anInt5883 = local61.anInt417;
					this.anInt5869 = local61.anInt402 * 128;
				}
			}
		} else if (this.aClass44_Sub4_Sub4_Sub1_2 != null) {
			this.anInt5873 = Static241.method5339(this.aClass44_Sub4_Sub4_Sub1_2);
			this.anInt5883 = this.aClass44_Sub4_Sub4_Sub1_2.anInt4916;
			this.anInt5869 = this.aClass44_Sub4_Sub4_Sub1_2.anInt4904 * 128;
		}
		if (this.anInt5873 != local13 && this.aClass6_Sub12_Sub4_3 != null) {
			Static241.aClass6_Sub12_Sub3_6.method4902(this.aClass6_Sub12_Sub4_3);
			this.aClass6_Sub12_Sub4_3 = null;
		}
	}
}
