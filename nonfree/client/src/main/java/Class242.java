import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public final class Class242 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
	public int anInt6367;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
	public int anInt6368;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	public int anInt6369;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "B")
	private byte aByte80;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
	public int anInt6371;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
	public int anInt6373;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class242() {
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class242(@OriginalArg(0) Class7_Sub14 arg0) {
		this.aByte80 = arg0.method3930();
		this.anInt6371 = arg0.method3943();
		this.anInt6368 = arg0.method3938();
		this.anInt6369 = arg0.method3938();
		this.anInt6373 = arg0.method3938();
		this.anInt6367 = arg0.method3938();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)I")
	public int method5061() {
		return (this.aByte80 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)I")
	public int method5063() {
		return this.aByte80 & 0x7;
	}
}
