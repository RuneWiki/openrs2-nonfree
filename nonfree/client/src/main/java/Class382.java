import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class382 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "F")
	public float aFloat207 = 0.25F;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "F")
	public float aFloat211 = 1.0F;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "F")
	public float aFloat210 = 1.0F;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	public final int anInt10682;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
	public final int anInt10674;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
	public final int anInt10675;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "F")
	public final float aFloat208;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
	public final int anInt10679;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "F")
	public final float aFloat209;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Lclient!cj;")
	public final Class57 aClass57_4;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
	public final int anInt10673;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
	public final int anInt10672;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "F")
	public final float aFloat212;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class382() {
		this.anInt10682 = Static358.anInt6108;
		this.anInt10674 = -50;
		this.anInt10675 = -60;
		this.aFloat208 = 1.1523438F;
		this.anInt10679 = 0;
		this.aFloat209 = 1.2F;
		this.aClass57_4 = Static43.aClass57_1;
		this.anInt10673 = -50;
		this.anInt10672 = Static627.anInt10389;
		this.aFloat212 = 0.69921875F;
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!dt;)V")
	public Class382(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(16) int local16 = arg0.method7954();
		if (Static336.aClass3_Sub41_18.aClass14_Sub17_1.method5487() == 1 && Static491.aClass95_11.method8026() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt10682 = Static358.anInt6108;
			} else {
				this.anInt10682 = arg0.method7895();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat208 = 1.1523438F;
			} else {
				this.aFloat208 = (float) arg0.method7951() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat212 = 0.69921875F;
			} else {
				this.aFloat212 = (float) arg0.method7951() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat209 = 1.2F;
			} else {
				this.aFloat209 = (float) arg0.method7951() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method7895();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method7951();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method7951();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method7951();
			}
			this.anInt10682 = Static358.anInt6108;
			this.aFloat209 = 1.2F;
			this.aFloat208 = 1.1523438F;
			this.aFloat212 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt10674 = -50;
			this.anInt10675 = -60;
			this.anInt10673 = -50;
		} else {
			this.anInt10674 = arg0.method7918();
			this.anInt10675 = arg0.method7918();
			this.anInt10673 = arg0.method7918();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt10672 = Static627.anInt10389;
		} else {
			this.anInt10672 = arg0.method7895();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt10679 = 0;
		} else {
			this.anInt10679 = arg0.method7951();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass57_4 = Static43.aClass57_1;
		} else {
			@Pc(229) int local229 = arg0.method7951();
			@Pc(233) int local233 = arg0.method7951();
			@Pc(237) int local237 = arg0.method7951();
			@Pc(241) int local241 = arg0.method7951();
			@Pc(245) int local245 = arg0.method7951();
			@Pc(249) int local249 = arg0.method7951();
			this.aClass57_4 = Static458.method6167(local229, local241, local237, local233, local245, local249);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!wc;B)Z")
	public boolean method8762(@OriginalArg(0) Class382 arg0) {
		return this.anInt10682 == arg0.anInt10682 && arg0.aFloat208 == this.aFloat208 && this.aFloat212 == arg0.aFloat212 && arg0.aFloat209 == this.aFloat209 && this.aFloat207 == arg0.aFloat207 && arg0.aFloat210 == this.aFloat210 && this.aFloat211 == arg0.aFloat211 && arg0.anInt10672 == this.anInt10672 && arg0.anInt10679 == this.anInt10679 && this.aClass57_4 == arg0.aClass57_4;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!dt;)V")
	public void method8763(@OriginalArg(1) Class3_Sub4 arg0) {
		this.aFloat210 = (float) (arg0.method7954() * 8) / 255.0F;
		this.aFloat207 = (float) (arg0.method7954() * 8) / 255.0F;
		this.aFloat211 = (float) (arg0.method7954() * 8) / 255.0F;
	}
}
