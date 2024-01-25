import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!saa")
public final class Class312 {

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "F")
	public float aFloat188 = 0.25F;

	@OriginalMember(owner = "client!saa", name = "h", descriptor = "F")
	public float aFloat190 = 1.0F;

	@OriginalMember(owner = "client!saa", name = "m", descriptor = "F")
	public float aFloat193 = 1.0F;

	@OriginalMember(owner = "client!saa", name = "g", descriptor = "F")
	public final float aFloat189;

	@OriginalMember(owner = "client!saa", name = "j", descriptor = "F")
	public final float aFloat192;

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "I")
	public final int anInt8862;

	@OriginalMember(owner = "client!saa", name = "i", descriptor = "F")
	public final float aFloat191;

	@OriginalMember(owner = "client!saa", name = "p", descriptor = "I")
	public final int anInt8869;

	@OriginalMember(owner = "client!saa", name = "k", descriptor = "Lclient!dn;")
	public final Class35 aClass35_3;

	@OriginalMember(owner = "client!saa", name = "l", descriptor = "I")
	public final int anInt8866;

	@OriginalMember(owner = "client!saa", name = "o", descriptor = "I")
	public final int anInt8868;

	@OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
	public final int anInt8864;

	@OriginalMember(owner = "client!saa", name = "f", descriptor = "I")
	public final int anInt8865;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "()V")
	public Class312() {
		this.aFloat189 = 1.1523438F;
		this.aFloat192 = 1.2F;
		this.anInt8862 = 0;
		this.aFloat191 = 0.69921875F;
		this.anInt8869 = -60;
		this.aClass35_3 = Static194.aClass35_1;
		this.anInt8866 = -50;
		this.anInt8868 = Static131.anInt2695;
		this.anInt8864 = Static247.anInt4490;
		this.anInt8865 = -50;
	}

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!jp;)V")
	public Class312(@OriginalArg(0) Class3_Sub25 arg0) {
		@Pc(16) int local16 = arg0.method8632();
		if (Static24.aClass3_Sub22_4.aClass6_Sub12_1.method4157() == 1 && Static90.aClass13_18.method8448() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt8868 = Static131.anInt2695;
			} else {
				this.anInt8868 = arg0.method8618();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat189 = 1.1523438F;
			} else {
				this.aFloat189 = (float) arg0.method8593() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat191 = 0.69921875F;
			} else {
				this.aFloat191 = (float) arg0.method8593() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat192 = 1.2F;
			} else {
				this.aFloat192 = (float) arg0.method8593() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method8618();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method8593();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method8593();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method8593();
			}
			this.aFloat191 = 0.69921875F;
			this.anInt8868 = Static131.anInt2695;
			this.aFloat189 = 1.1523438F;
			this.aFloat192 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt8865 = -50;
			this.anInt8866 = -50;
			this.anInt8869 = -60;
		} else {
			this.anInt8866 = arg0.method8589();
			this.anInt8869 = arg0.method8589();
			this.anInt8865 = arg0.method8589();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt8864 = Static247.anInt4490;
		} else {
			this.anInt8864 = arg0.method8618();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt8862 = 0;
		} else {
			this.anInt8862 = arg0.method8593();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass35_3 = Static194.aClass35_1;
		} else {
			@Pc(223) int local223 = arg0.method8593();
			@Pc(227) int local227 = arg0.method8593();
			@Pc(231) int local231 = arg0.method8593();
			@Pc(235) int local235 = arg0.method8593();
			@Pc(239) int local239 = arg0.method8593();
			@Pc(243) int local243 = arg0.method8593();
			this.aClass35_3 = Static256.method3787(local223, local227, local235, local231, local243, local239);
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(BLclient!jp;)V")
	public void method7737(@OriginalArg(1) Class3_Sub25 arg0) {
		this.aFloat190 = (float) (arg0.method8632() * 8) / 255.0F;
		this.aFloat188 = (float) (arg0.method8632() * 8) / 255.0F;
		this.aFloat193 = (float) (arg0.method8632() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lclient!saa;B)Z")
	public boolean method7738(@OriginalArg(0) Class312 arg0) {
		return this.anInt8868 == arg0.anInt8868 && arg0.aFloat189 == this.aFloat189 && arg0.aFloat191 == this.aFloat191 && this.aFloat192 == arg0.aFloat192 && this.aFloat188 == arg0.aFloat188 && arg0.aFloat190 == this.aFloat190 && this.aFloat193 == arg0.aFloat193 && arg0.anInt8864 == this.anInt8864 && arg0.anInt8862 == this.anInt8862 && arg0.aClass35_3 == this.aClass35_3;
	}
}
