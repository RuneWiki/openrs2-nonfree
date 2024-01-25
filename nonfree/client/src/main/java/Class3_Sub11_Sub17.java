import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class3_Sub11_Sub17 extends Class3_Sub11 {

	@OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
	public int anInt9295;

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
	public int anInt9297;

	@OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
	public int anInt9298;

	@OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
	public int anInt9299;

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "I")
	public int anInt9301;

	@OriginalMember(owner = "client!ti", name = "G", descriptor = "Lclient!kw;")
	public final Class197 aClass197_2;

	@OriginalMember(owner = "client!ti", name = "H", descriptor = "Lclient!cha;")
	public final Class59 aClass59_1;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!kw;Lclient!sp;)V")
	public Class3_Sub11_Sub17(@OriginalArg(0) Class197 arg0, @OriginalArg(1) Class28_Sub7 arg1) {
		this.aClass197_2 = arg0;
		this.aClass59_1 = this.aClass197_2.method4971();
		this.method8132();
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(B)V")
	public void method8132() {
		this.anInt9298 = this.aClass197_2.anInt5428;
		this.anInt9295 = this.aClass197_2.anInt5431;
		this.anInt9301 = this.aClass197_2.anInt5427;
		if (this.aClass197_2.aClass239_5 != null) {
			this.aClass197_2.aClass239_5.method9239(this.aClass59_1.anInt1352, this.aClass59_1.anInt1343, this.aClass59_1.anInt1342, Static109.anIntArray168);
		}
		this.anInt9299 = Static109.anIntArray168[2];
		this.anInt9297 = Static109.anIntArray168[0];
	}
}
