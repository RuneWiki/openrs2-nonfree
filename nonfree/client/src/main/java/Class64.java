import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class64 {

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	public int anInt3383;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public int anInt3384;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
	public int anInt3386;

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
	public int anInt3388;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "B")
	private byte aByte7;

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
	public int anInt3390;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class64() {
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!jg;)V")
	public Class64(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aByte7 = arg0.method900();
		this.anInt3386 = arg0.method878();
		this.anInt3388 = arg0.method868();
		this.anInt3384 = arg0.method868();
		this.anInt3390 = arg0.method868();
		this.anInt3383 = arg0.method868();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)I")
	public int method2293() {
		return (this.aByte7 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)I")
	public int method2294() {
		return this.aByte7 & 0x7;
	}
}
