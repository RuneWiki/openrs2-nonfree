import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public final class Class212 {

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
	public int anInt6303;

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "B")
	private byte aByte99;

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "I")
	public int anInt6304;

	@OriginalMember(owner = "client!maa", name = "h", descriptor = "I")
	public int anInt6305;

	@OriginalMember(owner = "client!maa", name = "i", descriptor = "I")
	public int anInt6306;

	@OriginalMember(owner = "client!maa", name = "n", descriptor = "I")
	public int anInt6311;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V")
	public Class212() {
	}

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lclient!sl;)V")
	public Class212(@OriginalArg(0) Class3_Sub3 arg0) {
		this.aByte99 = arg0.method4254();
		this.anInt6303 = arg0.method4221();
		this.anInt6306 = arg0.method4207();
		this.anInt6305 = arg0.method4207();
		this.anInt6311 = arg0.method4207();
		this.anInt6304 = arg0.method4207();
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(Z)I")
	public int method5472() {
		return this.aByte99 & 0x7;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)I")
	public int method5473() {
		return (this.aByte99 & 0x8) == 8 ? 1 : 0;
	}
}
