import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public abstract class Class5_Sub28 extends Class5 {

	@OriginalMember(owner = "client!oda", name = "y", descriptor = "Z")
	protected boolean aBoolean329;

	@OriginalMember(owner = "client!oda", name = "B", descriptor = "Z")
	protected boolean aBoolean331;

	@OriginalMember(owner = "client!oda", name = "E", descriptor = "Z")
	public boolean aBoolean334;

	@OriginalMember(owner = "client!oda", name = "q", descriptor = "I")
	public int anInt4872 = 0;

	@OriginalMember(owner = "client!oda", name = "k", descriptor = "I")
	public int anInt4868 = 2;

	@OriginalMember(owner = "client!oda", name = "u", descriptor = "Z")
	public boolean aBoolean327 = false;

	@OriginalMember(owner = "client!oda", name = "n", descriptor = "I")
	public int anInt4870 = 127;

	@OriginalMember(owner = "client!oda", name = "r", descriptor = "I")
	public int anInt4873 = 0;

	@OriginalMember(owner = "client!oda", name = "l", descriptor = "Z")
	public boolean aBoolean324 = true;

	@OriginalMember(owner = "client!oda", name = "o", descriptor = "Z")
	protected boolean aBoolean325 = true;

	@OriginalMember(owner = "client!oda", name = "v", descriptor = "I")
	public int anInt4875 = 0;

	@OriginalMember(owner = "client!oda", name = "s", descriptor = "Z")
	public boolean aBoolean326 = true;

	@OriginalMember(owner = "client!oda", name = "L", descriptor = "I")
	protected int anInt4882 = 0;

	@OriginalMember(owner = "client!oda", name = "C", descriptor = "Z")
	public boolean aBoolean332 = true;

	@OriginalMember(owner = "client!oda", name = "R", descriptor = "Z")
	public boolean aBoolean338 = true;

	@OriginalMember(owner = "client!oda", name = "G", descriptor = "Z")
	public boolean aBoolean335 = false;

	@OriginalMember(owner = "client!oda", name = "w", descriptor = "Z")
	public boolean aBoolean328 = true;

	@OriginalMember(owner = "client!oda", name = "U", descriptor = "Z")
	public boolean aBoolean339 = true;

	@OriginalMember(owner = "client!oda", name = "z", descriptor = "Z")
	public boolean aBoolean330 = true;

	@OriginalMember(owner = "client!oda", name = "J", descriptor = "Z")
	public boolean aBoolean336 = true;

	@OriginalMember(owner = "client!oda", name = "T", descriptor = "I")
	public int anInt4887 = 2;

	@OriginalMember(owner = "client!oda", name = "A", descriptor = "I")
	public int anInt4877 = 1;

	@OriginalMember(owner = "client!oda", name = "t", descriptor = "I")
	public int anInt4874 = 3;

	@OriginalMember(owner = "client!oda", name = "F", descriptor = "I")
	public int anInt4878 = 3;

	@OriginalMember(owner = "client!oda", name = "m", descriptor = "I")
	public int anInt4869 = 0;

	@OriginalMember(owner = "client!oda", name = "V", descriptor = "I")
	public int anInt4888 = 0;

	@OriginalMember(owner = "client!oda", name = "X", descriptor = "Z")
	public boolean aBoolean340 = true;

	@OriginalMember(owner = "client!oda", name = "x", descriptor = "I")
	protected int anInt4876 = 2;

	@OriginalMember(owner = "client!oda", name = "Y", descriptor = "Z")
	public boolean aBoolean341 = false;

	@OriginalMember(owner = "client!oda", name = "D", descriptor = "Z")
	public boolean aBoolean333 = true;

	@OriginalMember(owner = "client!oda", name = "p", descriptor = "I")
	public int anInt4871 = 127;

	@OriginalMember(owner = "client!oda", name = "Z", descriptor = "I")
	public int anInt4890 = 0;

	@OriginalMember(owner = "client!oda", name = "ab", descriptor = "I")
	public int anInt4891 = 2;

	@OriginalMember(owner = "client!oda", name = "W", descriptor = "I")
	public int anInt4889 = 127;

	@OriginalMember(owner = "client!oda", name = "N", descriptor = "Z")
	public boolean aBoolean337 = true;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V")
	protected Class5_Sub28() {
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZBI)V")
	public final void method4111(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (Static106.method2147(arg1)) {
			this.aBoolean329 = arg0;
		} else {
			this.aBoolean331 = arg0;
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(III)V")
	public final void method4112(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static106.method2147(arg0)) {
			this.anInt4876 = arg1;
		} else {
			this.anInt4882 = arg1;
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(II)Z")
	public final boolean method4113(@OriginalArg(0) int arg0) {
		return Static106.method2147(arg0) ? this.aBoolean329 : this.aBoolean331;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lclient!co;I)V")
	public final void method4114(@OriginalArg(0) Class5_Sub3 arg0) {
		arg0.method4192(18);
		arg0.method4192(this.anInt4878);
		arg0.method4192(this.aBoolean325 ? 1 : 0);
		arg0.method4192(this.aBoolean336 ? 1 : 0);
		arg0.method4192(this.aBoolean333 ? 1 : 0);
		arg0.method4192(this.aBoolean337 ? 1 : 0);
		arg0.method4192(0);
		arg0.method4192(this.aBoolean324 ? 1 : 0);
		arg0.method4192(this.aBoolean326 ? 1 : 0);
		arg0.method4192(this.aBoolean340 ? 1 : 0);
		arg0.method4192(this.anInt4876);
		arg0.method4192(this.anInt4882);
		arg0.method4192(this.aBoolean329 ? 1 : 0);
		arg0.method4192(this.aBoolean331 ? 1 : 0);
		arg0.method4192(this.aBoolean330 ? 1 : 0);
		arg0.method4192(this.aBoolean339 ? 1 : 0);
		arg0.method4192(this.anInt4873);
		arg0.method4192(this.aBoolean338 ? 1 : 0);
		arg0.method4192(this.anInt4871);
		arg0.method4192(this.anInt4889);
		arg0.method4192(this.anInt4870);
		arg0.method4181(this.anInt4888);
		arg0.method4181(this.anInt4890);
		arg0.method4192(Static337.method5257());
		arg0.method4184(this.anInt4875);
		arg0.method4192(this.anInt4891);
		arg0.method4192(this.aBoolean341 ? 1 : 0);
		arg0.method4192(this.aBoolean334 ? 1 : 0);
		arg0.method4192(this.anInt4869);
		arg0.method4192(this.aBoolean335 ? 1 : 0);
		arg0.method4192(this.aBoolean332 ? 1 : 0);
		arg0.method4192(this.anInt4877);
		arg0.method4192(this.aBoolean328 ? 1 : 0);
		arg0.method4192(this.anInt4887);
		arg0.method4192(this.anInt4868);
		arg0.method4192(this.aBoolean327 ? 1 : 0);
		arg0.method4192(this.anInt4874);
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(II)I")
	public final int method4116(@OriginalArg(0) int arg0) {
		return Static106.method2147(arg0) ? this.anInt4876 : this.anInt4882;
	}
}
