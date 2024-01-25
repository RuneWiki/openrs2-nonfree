import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public final class Class203 {

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
	public int anInt5093;

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "B")
	private byte aByte80;

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
	public int anInt5095;

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
	public int anInt5096;

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
	public int anInt5097;

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "I")
	public int anInt5098;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "()V")
	public Class203() {
	}

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class203(@OriginalArg(0) Class4_Sub11 arg0) {
		this.aByte80 = arg0.method8861();
		this.anInt5098 = arg0.method8859();
		this.anInt5093 = arg0.method8850();
		this.anInt5097 = arg0.method8850();
		this.anInt5095 = arg0.method8850();
		this.anInt5096 = arg0.method8850();
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)I")
	public int method4493() {
		return (this.aByte80 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(B)I")
	public int method4494() {
		return this.aByte80 & 0x7;
	}
}
