import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public final class Class5_Sub15_Sub1 extends Class5_Sub15 {

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "Z")
	public boolean aBoolean137;

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
	public int anInt2152;

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
	public int anInt2151;

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
	public int anInt2150;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I[BII)V")
	public Class5_Sub15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2152 = arg0;
		this.aByteArray19 = arg1;
		this.anInt2151 = arg2;
		this.anInt2150 = arg3;
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class5_Sub15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2152 = arg0;
		this.aByteArray19 = arg1;
		this.anInt2151 = arg2;
		this.anInt2150 = arg3;
		this.aBoolean137 = arg4;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!sm;)Lclient!fp;")
	public Class5_Sub15_Sub1 method1982(@OriginalArg(0) Class186 arg0) {
		this.aByteArray19 = arg0.method4982(this.aByteArray19);
		this.anInt2152 = arg0.method4981(this.anInt2152);
		if (this.anInt2151 == this.anInt2150) {
			this.anInt2151 = this.anInt2150 = arg0.method4980(this.anInt2151);
		} else {
			this.anInt2151 = arg0.method4980(this.anInt2151);
			this.anInt2150 = arg0.method4980(this.anInt2150);
			if (this.anInt2151 == this.anInt2150) {
				this.anInt2151--;
			}
		}
		return this;
	}
}
