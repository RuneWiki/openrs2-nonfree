import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public final class Class2_Sub2_Sub18 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sda", name = "u", descriptor = "Ljava/lang/String;")
	public String aString118;

	@OriginalMember(owner = "client!sda", name = "x", descriptor = "I")
	public int anInt7693;

	@OriginalMember(owner = "client!sda", name = "A", descriptor = "I")
	public int anInt7695;

	@OriginalMember(owner = "client!sda", name = "I", descriptor = "I")
	public int anInt7701;

	static {
		new Class222("", 76);
	}

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(II)V")
	public Class2_Sub2_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong268 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)J")
	public long method6221() {
		return Long.MAX_VALUE & super.aLong269;
	}

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "(B)I")
	public int method6222() {
		return (int) super.aLong268;
	}

	@OriginalMember(owner = "client!sda", name = "e", descriptor = "(B)I")
	public int method6223() {
		return (int) (super.aLong268 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!sda", name = "f", descriptor = "(I)V")
	public void method6227() {
		super.aLong269 |= Long.MIN_VALUE;
		if (this.method6221() == 0L) {
			Static544.aClass253_11.method5329(this);
		}
	}

	@OriginalMember(owner = "client!sda", name = "g", descriptor = "(I)V")
	public void method6229() {
		super.aLong269 = super.aLong269 & Long.MIN_VALUE | Static362.method5133() + 500L;
		Static11.aClass253_1.method5329(this);
	}
}
