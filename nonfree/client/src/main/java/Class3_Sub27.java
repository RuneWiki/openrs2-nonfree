import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class Class3_Sub27 extends Class3 {

	@OriginalMember(owner = "client!r", name = "H", descriptor = "Z")
	protected boolean aBoolean388;

	@OriginalMember(owner = "client!r", name = "J", descriptor = "Z")
	public boolean aBoolean390;

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "Z")
	protected boolean aBoolean392;

	@OriginalMember(owner = "client!r", name = "o", descriptor = "I")
	public int anInt4784 = 0;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Z")
	public boolean aBoolean380 = false;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "I")
	public int anInt4787 = 0;

	@OriginalMember(owner = "client!r", name = "r", descriptor = "Z")
	public boolean aBoolean381 = false;

	@OriginalMember(owner = "client!r", name = "E", descriptor = "Z")
	public boolean aBoolean386 = true;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "I")
	public int anInt4793 = 127;

	@OriginalMember(owner = "client!r", name = "G", descriptor = "I")
	public int anInt4795 = 127;

	@OriginalMember(owner = "client!r", name = "v", descriptor = "Z")
	public boolean aBoolean384 = true;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "I")
	protected int anInt4785 = 2;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Z")
	public boolean aBoolean382 = true;

	@OriginalMember(owner = "client!r", name = "M", descriptor = "Z")
	public boolean aBoolean391 = false;

	@OriginalMember(owner = "client!r", name = "L", descriptor = "I")
	public int anInt4797 = 127;

	@OriginalMember(owner = "client!r", name = "T", descriptor = "Z")
	public boolean aBoolean393 = true;

	@OriginalMember(owner = "client!r", name = "z", descriptor = "I")
	public int anInt4791 = 0;

	@OriginalMember(owner = "client!r", name = "A", descriptor = "Z")
	protected boolean aBoolean385 = true;

	@OriginalMember(owner = "client!r", name = "P", descriptor = "I")
	public int anInt4799 = 127;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "I")
	protected int anInt4790 = 0;

	@OriginalMember(owner = "client!r", name = "U", descriptor = "I")
	public int anInt4801 = 2;

	@OriginalMember(owner = "client!r", name = "N", descriptor = "I")
	public int anInt4798 = 0;

	@OriginalMember(owner = "client!r", name = "X", descriptor = "I")
	public int anInt4802 = 0;

	@OriginalMember(owner = "client!r", name = "F", descriptor = "Z")
	public boolean aBoolean387 = true;

	@OriginalMember(owner = "client!r", name = "Y", descriptor = "Z")
	public boolean aBoolean396 = true;

	@OriginalMember(owner = "client!r", name = "V", descriptor = "Z")
	public boolean aBoolean394 = true;

	@OriginalMember(owner = "client!r", name = "u", descriptor = "Z")
	public boolean aBoolean383 = true;

	@OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
	public int anInt4803 = 3;

	@OriginalMember(owner = "client!r", name = "D", descriptor = "I")
	public int anInt4794 = 0;

	@OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
	public int anInt4805 = 3;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "I")
	public int anInt4786 = 0;

	@OriginalMember(owner = "client!r", name = "W", descriptor = "Z")
	public boolean aBoolean395 = true;

	@OriginalMember(owner = "client!r", name = "B", descriptor = "I")
	public int anInt4792 = 2;

	@OriginalMember(owner = "client!r", name = "eb", descriptor = "I")
	protected int anInt4807 = 0;

	@OriginalMember(owner = "client!r", name = "I", descriptor = "Z")
	public boolean aBoolean389 = true;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "I")
	public int anInt4789 = 1;

	@OriginalMember(owner = "client!r", name = "fb", descriptor = "Z")
	public boolean aBoolean397 = true;

	@OriginalMember(owner = "client!r", name = "db", descriptor = "I")
	public int anInt4806 = 127;

	@OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
	public int anInt4809 = 2;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	protected Class3_Sub27() {
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)I")
	public final int method4035(@OriginalArg(0) int arg0) {
		return Static347.method5854(arg0) ? this.anInt4785 : this.anInt4790;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)Z")
	public final boolean method4036(@OriginalArg(1) int arg0) {
		return Static347.method5854(arg0) ? this.aBoolean388 : this.aBoolean392;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
	public final void method4037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static347.method5854(arg1)) {
			this.anInt4785 = arg0;
		} else {
			this.anInt4790 = arg0;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLclient!fd;)V")
	public final void method4038(@OriginalArg(1) Class3_Sub7 arg0) {
		arg0.method6494(22);
		arg0.method6494(this.anInt4805);
		arg0.method6494(this.aBoolean385 ? 1 : 0);
		arg0.method6494(this.aBoolean395 ? 1 : 0);
		arg0.method6494(this.aBoolean382 ? 1 : 0);
		arg0.method6494(this.aBoolean396 ? 1 : 0);
		arg0.method6494(0);
		arg0.method6494(this.aBoolean389 ? 1 : 0);
		arg0.method6494(this.aBoolean397 ? 1 : 0);
		arg0.method6494(this.aBoolean384 ? 1 : 0);
		arg0.method6494(this.anInt4785);
		arg0.method6494(this.anInt4790);
		arg0.method6494(this.aBoolean388 ? 1 : 0);
		arg0.method6494(this.aBoolean392 ? 1 : 0);
		arg0.method6494(this.aBoolean387 ? 1 : 0);
		arg0.method6494(this.aBoolean386 ? 1 : 0);
		arg0.method6494(this.anInt4794);
		arg0.method6494(this.aBoolean394 ? 1 : 0);
		arg0.method6494(this.anInt4799);
		arg0.method6494(this.anInt4795);
		arg0.method6494(this.anInt4793);
		arg0.method6494(this.anInt4797);
		arg0.method6494(this.anInt4806);
		arg0.method6528(this.anInt4786);
		arg0.method6528(this.anInt4787);
		arg0.method6494(Static390.method6232());
		arg0.method6495(this.anInt4791);
		arg0.method6494(this.anInt4801);
		arg0.method6494(this.aBoolean381 ? 1 : 0);
		arg0.method6494(this.aBoolean390 ? 1 : 0);
		arg0.method6494(this.anInt4802);
		arg0.method6494(this.aBoolean380 ? 1 : 0);
		arg0.method6494(this.aBoolean393 ? 1 : 0);
		arg0.method6494(this.anInt4789);
		arg0.method6494(this.aBoolean383 ? 1 : 0);
		arg0.method6494(this.anInt4792);
		arg0.method6494(this.anInt4809);
		arg0.method6494(this.aBoolean391 ? 1 : 0);
		arg0.method6494(this.anInt4803);
		arg0.method6494(this.anInt4807);
		arg0.method6494(this.anInt4784);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)V")
	public final void method4039(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (Static347.method5854(arg0)) {
			this.aBoolean388 = arg1;
		} else {
			this.aBoolean392 = arg1;
		}
	}
}
