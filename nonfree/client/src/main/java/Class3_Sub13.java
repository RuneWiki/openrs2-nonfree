import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public abstract class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!cda", name = "K", descriptor = "Z")
	protected boolean aBoolean406;

	@OriginalMember(owner = "client!cda", name = "fb", descriptor = "Z")
	protected boolean aBoolean414;

	@OriginalMember(owner = "client!cda", name = "lb", descriptor = "Z")
	public boolean lb;

	@OriginalMember(owner = "client!cda", name = "m", descriptor = "I")
	public int anInt5133 = 1;

	@OriginalMember(owner = "client!cda", name = "q", descriptor = "Z")
	public boolean aBoolean400 = true;

	@OriginalMember(owner = "client!cda", name = "k", descriptor = "I")
	public int anInt5131 = 127;

	@OriginalMember(owner = "client!cda", name = "n", descriptor = "Z")
	public boolean aBoolean398 = true;

	@OriginalMember(owner = "client!cda", name = "s", descriptor = "I")
	public int anInt5135 = 127;

	@OriginalMember(owner = "client!cda", name = "F", descriptor = "Z")
	public boolean aBoolean404 = true;

	@OriginalMember(owner = "client!cda", name = "A", descriptor = "Z")
	public boolean aBoolean403 = true;

	@OriginalMember(owner = "client!cda", name = "o", descriptor = "Z")
	public boolean aBoolean399 = true;

	@OriginalMember(owner = "client!cda", name = "u", descriptor = "I")
	protected int anInt5137 = 0;

	@OriginalMember(owner = "client!cda", name = "L", descriptor = "I")
	public int anInt5149 = 3;

	@OriginalMember(owner = "client!cda", name = "v", descriptor = "Z")
	public boolean aBoolean402 = true;

	@OriginalMember(owner = "client!cda", name = "P", descriptor = "I")
	public int anInt5151 = 2;

	@OriginalMember(owner = "client!cda", name = "r", descriptor = "Z")
	protected boolean aBoolean401 = true;

	@OriginalMember(owner = "client!cda", name = "S", descriptor = "Z")
	public boolean aBoolean410 = false;

	@OriginalMember(owner = "client!cda", name = "J", descriptor = "I")
	public int anInt5148 = 3;

	@OriginalMember(owner = "client!cda", name = "M", descriptor = "Z")
	public boolean aBoolean407 = false;

	@OriginalMember(owner = "client!cda", name = "X", descriptor = "I")
	public int anInt5155 = 0;

	@OriginalMember(owner = "client!cda", name = "Y", descriptor = "Z")
	public boolean aBoolean412 = true;

	@OriginalMember(owner = "client!cda", name = "V", descriptor = "I")
	public int anInt5154 = 127;

	@OriginalMember(owner = "client!cda", name = "O", descriptor = "Z")
	public boolean aBoolean408 = false;

	@OriginalMember(owner = "client!cda", name = "E", descriptor = "I")
	public int anInt5145 = 0;

	@OriginalMember(owner = "client!cda", name = "N", descriptor = "I")
	public int anInt5150 = 0;

	@OriginalMember(owner = "client!cda", name = "W", descriptor = "Z")
	public boolean aBoolean411 = true;

	@OriginalMember(owner = "client!cda", name = "G", descriptor = "Z")
	public boolean aBoolean405 = true;

	@OriginalMember(owner = "client!cda", name = "p", descriptor = "I")
	public int anInt5134 = 0;

	@OriginalMember(owner = "client!cda", name = "Q", descriptor = "Z")
	public boolean aBoolean409 = true;

	@OriginalMember(owner = "client!cda", name = "ab", descriptor = "I")
	protected int anInt5156 = 2;

	@OriginalMember(owner = "client!cda", name = "U", descriptor = "I")
	public int anInt5153 = 127;

	@OriginalMember(owner = "client!cda", name = "j", descriptor = "I")
	public int anInt5130 = 2;

	@OriginalMember(owner = "client!cda", name = "T", descriptor = "I")
	protected int anInt5152 = 0;

	@OriginalMember(owner = "client!cda", name = "jb", descriptor = "I")
	public int anInt5161 = 0;

	@OriginalMember(owner = "client!cda", name = "x", descriptor = "I")
	public int anInt5139 = 127;

	@OriginalMember(owner = "client!cda", name = "bb", descriptor = "Z")
	public boolean aBoolean413 = true;

	@OriginalMember(owner = "client!cda", name = "gb", descriptor = "I")
	public int anInt5158 = 0;

	@OriginalMember(owner = "client!cda", name = "kb", descriptor = "I")
	public int anInt5162 = 2;

	@OriginalMember(owner = "client!cda", name = "hb", descriptor = "I")
	public int anInt5159 = 0;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "()V")
	protected Class3_Sub13() {
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZII)V")
	public final void method4456(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static316.method7582(arg1)) {
			this.anInt5156 = arg0;
		} else {
			this.anInt5152 = arg0;
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(BI)Z")
	public final boolean method4457(@OriginalArg(1) int arg0) {
		return Static316.method7582(arg0) ? this.aBoolean406 : this.aBoolean414;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!qh;I)V")
	public final void method4462(@OriginalArg(0) Class3_Sub11 arg0) {
		arg0.method3079(22);
		arg0.method3079(this.anInt5148);
		arg0.method3079(this.aBoolean401 ? 1 : 0);
		arg0.method3079(this.aBoolean403 ? 1 : 0);
		arg0.method3079(this.aBoolean413 ? 1 : 0);
		arg0.method3079(this.aBoolean409 ? 1 : 0);
		arg0.method3079(0);
		arg0.method3079(this.aBoolean402 ? 1 : 0);
		arg0.method3079(this.aBoolean398 ? 1 : 0);
		arg0.method3079(this.aBoolean400 ? 1 : 0);
		arg0.method3079(this.anInt5156);
		arg0.method3079(this.anInt5152);
		arg0.method3079(this.aBoolean406 ? 1 : 0);
		arg0.method3079(this.aBoolean414 ? 1 : 0);
		arg0.method3079(this.aBoolean404 ? 1 : 0);
		arg0.method3079(this.aBoolean399 ? 1 : 0);
		arg0.method3079(this.anInt5145);
		arg0.method3079(this.aBoolean411 ? 1 : 0);
		arg0.method3079(this.anInt5153);
		arg0.method3079(this.anInt5135);
		arg0.method3079(this.anInt5154);
		arg0.method3079(this.anInt5139);
		arg0.method3079(this.anInt5131);
		arg0.method3131(this.anInt5155);
		arg0.method3131(this.anInt5158);
		arg0.method3079(Static564.method7499());
		arg0.method3101(this.anInt5150);
		arg0.method3079(this.anInt5151);
		arg0.method3079(this.aBoolean407 ? 1 : 0);
		arg0.method3079(this.lb ? 1 : 0);
		arg0.method3079(this.anInt5161);
		arg0.method3079(this.aBoolean408 ? 1 : 0);
		arg0.method3079(this.aBoolean405 ? 1 : 0);
		arg0.method3079(this.anInt5133);
		arg0.method3079(this.aBoolean412 ? 1 : 0);
		arg0.method3079(this.anInt5130);
		arg0.method3079(this.anInt5162);
		arg0.method3079(this.aBoolean410 ? 1 : 0);
		arg0.method3079(this.anInt5149);
		arg0.method3079(this.anInt5137);
		arg0.method3079(this.anInt5134);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZIZ)V")
	public final void method4463(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (Static316.method7582(arg0)) {
			this.aBoolean406 = arg1;
		} else {
			this.aBoolean414 = arg1;
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IB)I")
	public final int method4464(@OriginalArg(0) int arg0) {
		return Static316.method7582(arg0) ? this.anInt5156 : this.anInt5152;
	}
}
