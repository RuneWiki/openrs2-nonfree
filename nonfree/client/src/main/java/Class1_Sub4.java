import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!vp;")
	public Class1_Sub49 aClass1_Sub49_1;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "Z")
	public boolean aBoolean5;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Lclient!qh;")
	public Class11_Sub1_Sub1_Sub3_Sub2 aClass11_Sub1_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	public int anInt224;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!bu;")
	public Class1_Sub13_Sub1 aClass1_Sub13_Sub1_1;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
	public int anInt225;

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "Lclient!vp;")
	public Class1_Sub49 aClass1_Sub49_2;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
	public int anInt228;

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "Z")
	public boolean aBoolean6;

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
	public int anInt229;

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
	public int anInt230;

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "Lclient!bu;")
	public Class1_Sub13_Sub1 aClass1_Sub13_Sub1_2;

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "Lclient!sf;")
	public Class1_Sub6_Sub4 aClass1_Sub6_Sub4_1;

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
	public int anInt232;

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "Lclient!sf;")
	public Class1_Sub6_Sub4 aClass1_Sub6_Sub4_2;

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "Lclient!js;")
	public Class178 aClass178_1;

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
	public int anInt233;

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "[I")
	public int[] anIntArray9;

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "Z")
	public boolean aBoolean7;

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
	public int anInt234;

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
	public int anInt236;

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
	public int anInt238;

	@OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
	public int anInt239;

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
	public int anInt240;

	@OriginalMember(owner = "client!ad", name = "R", descriptor = "Lclient!hb;")
	public Class11_Sub1_Sub1_Sub3_Sub1 aClass11_Sub1_Sub1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
	public int anInt241;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
	public int anInt226 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public void method210() {
		@Pc(13) int local13 = this.anInt230;
		@Pc(16) boolean local16 = this.aBoolean5;
		if (this.aClass178_1 != null) {
			@Pc(131) Class178 local131 = this.aClass178_1.method3713(Static390.aClass353_29);
			if (local131 == null) {
				this.anInt234 = 0;
				this.anInt240 = 256;
				this.anInt228 = 0;
				this.anInt233 = 0;
				this.anInt230 = -1;
				this.aBoolean6 = false;
				this.aBoolean5 = false;
				this.anInt241 = 0;
				this.anIntArray9 = null;
				this.anInt239 = 256;
			} else {
				this.anInt241 = local131.anInt4659;
				this.anInt233 = local131.anInt4625 << 9;
				this.anInt230 = local131.anInt4650;
				this.anInt234 = local131.anInt4632;
				this.anIntArray9 = local131.anIntArray254;
				this.anInt239 = local131.anInt4676;
				this.anInt228 = local131.anInt4629;
				this.anInt240 = local131.anInt4670;
				this.aBoolean6 = local131.aBoolean355;
				this.aBoolean5 = local131.aBoolean352;
			}
		} else if (this.aClass11_Sub1_Sub1_Sub3_Sub2_1 != null) {
			@Pc(27) int local27 = Static227.method3387(this.aClass11_Sub1_Sub1_Sub3_Sub2_1);
			if (local27 != local13) {
				this.anInt230 = local27;
				@Pc(37) Class354 local37 = this.aClass11_Sub1_Sub1_Sub3_Sub2_1.aClass354_1;
				if (local37.anIntArray597 != null) {
					local37 = local37.method7683(Static390.aClass353_29);
				}
				if (local37 == null) {
					this.aBoolean5 = this.aClass11_Sub1_Sub1_Sub3_Sub2_1.aClass354_1.aBoolean699;
					this.anInt239 = 256;
					this.anInt228 = this.anInt233 = 0;
					this.anInt240 = 256;
				} else {
					this.anInt228 = local37.anInt9426;
					this.anInt233 = local37.anInt9415 << 9;
					this.aBoolean5 = local37.aBoolean699;
					this.anInt240 = local37.anInt9397;
					this.anInt239 = local37.anInt9408;
				}
			}
		} else if (this.aClass11_Sub1_Sub1_Sub3_Sub1_1 != null) {
			this.anInt230 = Static126.method2238(this.aClass11_Sub1_Sub1_Sub3_Sub1_1);
			this.aBoolean5 = this.aClass11_Sub1_Sub1_Sub3_Sub1_1.aBoolean260;
			this.anInt228 = this.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt3588;
			this.anInt233 = this.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt3593 << 9;
			this.anInt240 = 256;
			this.anInt239 = 256;
		}
		if (this.anInt230 == local13 && local16 == this.aBoolean5) {
			return;
		}
		if (this.aClass1_Sub6_Sub4_1 == null) {
			return;
		}
		Static425.aClass1_Sub6_Sub3_2.method6532(this.aClass1_Sub6_Sub4_1);
		this.aClass1_Sub6_Sub4_1 = null;
		this.aClass1_Sub49_2 = null;
		this.aClass1_Sub13_Sub1_2 = null;
	}
}
