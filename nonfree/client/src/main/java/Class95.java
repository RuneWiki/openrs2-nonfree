import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public final class Class95 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
	public int anInt3089;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "B")
	private byte aByte30;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
	public int anInt3091;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
	public int anInt3093;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
	public int anInt3094;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
	public int anInt3095;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	public Class95() {
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!dg;)V")
	public Class95(@OriginalArg(0) Class2_Sub10 arg0) {
		this.aByte30 = arg0.method4436();
		this.anInt3094 = arg0.method4464();
		this.anInt3091 = arg0.method4444();
		this.anInt3089 = arg0.method4444();
		this.anInt3095 = arg0.method4444();
		this.anInt3093 = arg0.method4444();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)I")
	public int method2927() {
		return this.aByte30 & 0x7;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)I")
	public int method2928() {
		return (this.aByte30 & 0x8) == 8 ? 1 : 0;
	}
}
