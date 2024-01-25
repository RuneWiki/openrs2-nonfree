import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class159 {

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	public int anInt5220;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public int anInt5222;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	public int anInt5223;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "B")
	private byte aByte57;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
	public int anInt5227;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
	public int anInt5228;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class159() {
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class159(@OriginalArg(0) Class2_Sub12 arg0) {
		this.aByte57 = arg0.method3122();
		this.anInt5220 = arg0.method3104();
		this.anInt5227 = arg0.method3135();
		this.anInt5222 = arg0.method3135();
		this.anInt5228 = arg0.method3135();
		this.anInt5223 = arg0.method3135();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)I")
	public int method4415() {
		return (this.aByte57 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I")
	public int method4417() {
		return this.aByte57 & 0x7;
	}
}
