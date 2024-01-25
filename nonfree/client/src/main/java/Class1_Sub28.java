import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public abstract class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!tv", name = "v", descriptor = "Z")
	protected boolean aBoolean321;

	@OriginalMember(owner = "client!tv", name = "D", descriptor = "Z")
	public boolean aBoolean324;

	@OriginalMember(owner = "client!tv", name = "M", descriptor = "Z")
	protected boolean aBoolean327;

	@OriginalMember(owner = "client!tv", name = "j", descriptor = "Z")
	public boolean aBoolean315 = true;

	@OriginalMember(owner = "client!tv", name = "o", descriptor = "Z")
	public boolean aBoolean319 = true;

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
	public int anInt4893 = 0;

	@OriginalMember(owner = "client!tv", name = "l", descriptor = "Z")
	public boolean aBoolean316 = true;

	@OriginalMember(owner = "client!tv", name = "i", descriptor = "I")
	public int anInt4890 = 0;

	@OriginalMember(owner = "client!tv", name = "w", descriptor = "Z")
	public boolean aBoolean322 = true;

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
	public int anInt4892 = 1;

	@OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
	public int anInt4894 = 127;

	@OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
	protected int anInt4895 = 0;

	@OriginalMember(owner = "client!tv", name = "F", descriptor = "Z")
	public boolean aBoolean326 = false;

	@OriginalMember(owner = "client!tv", name = "m", descriptor = "Z")
	public boolean aBoolean317 = true;

	@OriginalMember(owner = "client!tv", name = "n", descriptor = "Z")
	public boolean aBoolean318 = true;

	@OriginalMember(owner = "client!tv", name = "E", descriptor = "Z")
	public boolean aBoolean325 = true;

	@OriginalMember(owner = "client!tv", name = "B", descriptor = "I")
	public int anInt4899 = 127;

	@OriginalMember(owner = "client!tv", name = "I", descriptor = "I")
	public int anInt4903 = 3;

	@OriginalMember(owner = "client!tv", name = "N", descriptor = "I")
	public int anInt4907 = 0;

	@OriginalMember(owner = "client!tv", name = "P", descriptor = "Z")
	public boolean aBoolean328 = true;

	@OriginalMember(owner = "client!tv", name = "V", descriptor = "I")
	public int anInt4911 = 0;

	@OriginalMember(owner = "client!tv", name = "Q", descriptor = "I")
	public int anInt4909 = 0;

	@OriginalMember(owner = "client!tv", name = "J", descriptor = "I")
	public int anInt4904 = 2;

	@OriginalMember(owner = "client!tv", name = "t", descriptor = "Z")
	public boolean aBoolean320 = true;

	@OriginalMember(owner = "client!tv", name = "S", descriptor = "Z")
	public boolean aBoolean330 = false;

	@OriginalMember(owner = "client!tv", name = "X", descriptor = "I")
	public int anInt4912 = 2;

	@OriginalMember(owner = "client!tv", name = "G", descriptor = "I")
	public int anInt4901 = 2;

	@OriginalMember(owner = "client!tv", name = "R", descriptor = "Z")
	protected boolean aBoolean329 = true;

	@OriginalMember(owner = "client!tv", name = "Y", descriptor = "I")
	public int anInt4913 = 127;

	@OriginalMember(owner = "client!tv", name = "O", descriptor = "I")
	public int anInt4908 = 3;

	@OriginalMember(owner = "client!tv", name = "W", descriptor = "Z")
	public boolean aBoolean332 = true;

	@OriginalMember(owner = "client!tv", name = "y", descriptor = "Z")
	public boolean aBoolean323 = false;

	@OriginalMember(owner = "client!tv", name = "U", descriptor = "I")
	protected int anInt4910 = 2;

	@OriginalMember(owner = "client!tv", name = "T", descriptor = "Z")
	public boolean aBoolean331 = true;

	@OriginalMember(owner = "client!tv", name = "K", descriptor = "I")
	public int anInt4905 = 0;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "()V")
	protected Class1_Sub28() {
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIZ)V")
	public final void method4258(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (Static322.method2839(arg0)) {
			this.aBoolean321 = arg1;
		} else {
			this.aBoolean327 = arg1;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)V")
	public final void method4259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static322.method2839(arg1)) {
			this.anInt4910 = arg0;
		} else {
			this.anInt4895 = arg0;
		}
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(II)Z")
	public final boolean method4260(@OriginalArg(0) int arg0) {
		return Static322.method2839(arg0) ? this.aBoolean321 : this.aBoolean327;
	}

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "(II)I")
	public final int method4262(@OriginalArg(0) int arg0) {
		return Static322.method2839(arg0) ? this.anInt4910 : this.anInt4895;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BLclient!gw;)V")
	public final void method4263(@OriginalArg(1) Class1_Sub13 arg0) {
		arg0.method3060(18);
		arg0.method3060(this.anInt4908);
		arg0.method3060(this.aBoolean329 ? 1 : 0);
		arg0.method3060(this.aBoolean328 ? 1 : 0);
		arg0.method3060(this.aBoolean319 ? 1 : 0);
		arg0.method3060(this.aBoolean317 ? 1 : 0);
		arg0.method3060(0);
		arg0.method3060(this.aBoolean318 ? 1 : 0);
		arg0.method3060(this.aBoolean322 ? 1 : 0);
		arg0.method3060(this.aBoolean331 ? 1 : 0);
		arg0.method3060(this.anInt4910);
		arg0.method3060(this.anInt4895);
		arg0.method3060(this.aBoolean321 ? 1 : 0);
		arg0.method3060(this.aBoolean327 ? 1 : 0);
		arg0.method3060(this.aBoolean315 ? 1 : 0);
		arg0.method3060(this.aBoolean320 ? 1 : 0);
		arg0.method3060(this.anInt4907);
		arg0.method3060(this.aBoolean332 ? 1 : 0);
		arg0.method3060(this.anInt4894);
		arg0.method3060(this.anInt4899);
		arg0.method3060(this.anInt4913);
		arg0.method3038(this.anInt4893);
		arg0.method3038(this.anInt4909);
		arg0.method3060(Static182.method3492());
		arg0.method3069(this.anInt4911);
		arg0.method3060(this.anInt4904);
		arg0.method3060(this.aBoolean326 ? 1 : 0);
		arg0.method3060(this.aBoolean324 ? 1 : 0);
		arg0.method3060(this.anInt4905);
		arg0.method3060(this.aBoolean330 ? 1 : 0);
		arg0.method3060(this.aBoolean316 ? 1 : 0);
		arg0.method3060(this.anInt4892);
		arg0.method3060(this.aBoolean325 ? 1 : 0);
		arg0.method3060(this.anInt4912);
		arg0.method3060(this.anInt4901);
		arg0.method3060(this.aBoolean323 ? 1 : 0);
		arg0.method3060(this.anInt4903);
	}
}
