import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public final class Class163 {

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	public int anInt4977;

	@OriginalMember(owner = "client!t", name = "h", descriptor = "B")
	private byte aByte17;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "I")
	public int anInt4981;

	@OriginalMember(owner = "client!t", name = "j", descriptor = "I")
	public int anInt4982;

	@OriginalMember(owner = "client!t", name = "k", descriptor = "I")
	public int anInt4983;

	@OriginalMember(owner = "client!t", name = "l", descriptor = "I")
	public int anInt4984;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	public Class163() {
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class163(@OriginalArg(0) Class4_Sub10 arg0) {
		this.aByte17 = arg0.method4674();
		this.anInt4984 = arg0.method4653();
		this.anInt4983 = arg0.method4632();
		this.anInt4977 = arg0.method4632();
		this.anInt4981 = arg0.method4632();
		this.anInt4982 = arg0.method4632();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)I")
	public int method4115() {
		return (this.aByte17 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)I")
	public int method4118() {
		return this.aByte17 & 0x7;
	}
}
