import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public final class Class14_Sub14_Sub1 extends Class14_Sub14 {

	@OriginalMember(owner = "client!dga", name = "o", descriptor = "Z")
	public boolean aBoolean178;

	@OriginalMember(owner = "client!dga", name = "n", descriptor = "I")
	public int anInt2150;

	@OriginalMember(owner = "client!dga", name = "q", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!dga", name = "p", descriptor = "I")
	public int anInt2151;

	@OriginalMember(owner = "client!dga", name = "m", descriptor = "I")
	public int anInt2149;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(I[BII)V")
	public Class14_Sub14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2150 = arg0;
		this.aByteArray35 = arg1;
		this.anInt2151 = arg2;
		this.anInt2149 = arg3;
	}

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class14_Sub14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2150 = arg0;
		this.aByteArray35 = arg1;
		this.anInt2151 = arg2;
		this.anInt2149 = arg3;
		this.aBoolean178 = arg4;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!hn;)Lclient!dga;")
	public Class14_Sub14_Sub1 method1814(@OriginalArg(0) Class147 arg0) {
		this.aByteArray35 = arg0.method3467(this.aByteArray35);
		this.anInt2150 = arg0.method3465(this.anInt2150);
		if (this.anInt2151 == this.anInt2149) {
			this.anInt2151 = this.anInt2149 = arg0.method3459(this.anInt2151);
		} else {
			this.anInt2151 = arg0.method3459(this.anInt2151);
			this.anInt2149 = arg0.method3459(this.anInt2149);
			if (this.anInt2151 == this.anInt2149) {
				this.anInt2151--;
			}
		}
		return this;
	}
}
