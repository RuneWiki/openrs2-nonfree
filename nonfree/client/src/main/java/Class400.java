import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class400 {

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "Lclient!pga;")
	public Class255 aClass255_2;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "Lclient!ke;")
	public Class201 aClass201_9;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "Lclient!wea;")
	public Class399 aClass399_2;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
	public int anInt11056;

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "Lclient!jia;")
	public Class186 aClass186_194;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
	public int anInt11057;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Lclient!jia;")
	public Class186 aClass186_195;

	@OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
	private int anInt11058;

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "Lclient!jia;")
	public Class186 aClass186_197;

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
	public int anInt11059;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "Lclient!tj;")
	private final Class357 aClass357_66 = new Class357();

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
	private int anInt11051 = 0;

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "Lclient!rba;")
	private final Class3_Sub28 aClass3_Sub28_11 = new Class3_Sub28(1350);

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "Lclient!lk;")
	public final Class3_Sub28_Sub2 aClass3_Sub28_Sub2_2 = new Class3_Sub28_Sub2(15000);

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "Z")
	public boolean aBoolean796 = true;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "Lclient!jia;")
	public Class186 aClass186_196 = null;

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
	public int anInt11060 = 0;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "Z")
	public boolean aBoolean795 = false;

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
	public int anInt11055 = 0;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
	public int anInt11061 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!ss;)V")
	public void method9223(@OriginalArg(1) Class3_Sub48 arg0) {
		this.aClass357_66.method8401(arg0);
		arg0.anInt9728 = arg0.aClass3_Sub28_Sub2_1.anInt6241;
		this.anInt11051 += arg0.anInt9728;
		arg0.aClass3_Sub28_Sub2_1.anInt6241 = 0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
	public void method9225() {
		if (Static269.anInt4883 % 50 == 0) {
			this.anInt11059 = this.anInt11058;
			this.anInt11058 = 0;
			this.anInt11057 = this.anInt11056;
			this.anInt11056 = 0;
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
	public void method9227() throws IOException {
		if (this.aClass255_2 == null || this.anInt11051 <= 0) {
			return;
		}
		this.aClass3_Sub28_11.anInt6241 = 0;
		while (true) {
			@Pc(32) Class3_Sub48 local32 = (Class3_Sub48) this.aClass357_66.method8391();
			if (local32 == null || local32.anInt9728 > this.aClass3_Sub28_11.aByteArray50.length - this.aClass3_Sub28_11.anInt6241) {
				this.aClass255_2.method6259(this.aClass3_Sub28_11.anInt6241, this.aClass3_Sub28_11.aByteArray50);
				this.anInt11058 += this.aClass3_Sub28_11.anInt6241;
				this.anInt11060 = 0;
				break;
			}
			this.aClass3_Sub28_11.method5274(local32.anInt9728, local32.aClass3_Sub28_Sub2_1.aByteArray50, 0);
			this.anInt11051 -= local32.anInt9728;
			local32.method9446();
			local32.aClass3_Sub28_Sub2_1.method5304();
			local32.method8210();
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(Z)V")
	public void method9229() {
		if (this.aClass255_2 != null) {
			this.aClass255_2.method6265();
			this.aClass255_2 = null;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public void method9230() {
		this.aClass357_66.method8403();
		this.anInt11051 = 0;
	}
}
