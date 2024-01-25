import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class240 {

	@OriginalMember(owner = "client!m", name = "h", descriptor = "I")
	public int anInt6111;

	@OriginalMember(owner = "client!m", name = "i", descriptor = "I")
	public int anInt6115;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	public int anInt6116;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "B")
	private byte aByte97;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "I")
	public int anInt6117;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "I")
	public int anInt6118;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class240() {
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class240(@OriginalArg(0) Class3_Sub2 arg0) {
		this.aByte97 = arg0.method2022();
		this.anInt6111 = arg0.method2028(-14795);
		this.anInt6116 = arg0.method2036();
		this.anInt6117 = arg0.method2036();
		this.anInt6118 = arg0.method2036();
		this.anInt6115 = arg0.method2036();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)I")
	public int method5324() {
		return (this.aByte97 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)I")
	public int method5325() {
		return this.aByte97 & 0x7;
	}
}
