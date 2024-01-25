import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public final class Class4_Sub5_Sub1 extends Class4_Sub5 {

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "Z")
	public boolean aBoolean595;

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
	public int anInt6833;

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
	public int anInt6832;

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
	public int anInt6831;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6833 = arg0;
		this.aByteArray94 = arg1;
		this.anInt6832 = arg2;
		this.anInt6831 = arg3;
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6833 = arg0;
		this.aByteArray94 = arg1;
		this.anInt6832 = arg2;
		this.anInt6831 = arg3;
		this.aBoolean595 = arg4;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ld;)Lclient!wo;")
	public Class4_Sub5_Sub1 method5671(@OriginalArg(0) Class118 arg0) {
		this.aByteArray94 = arg0.method3199(this.aByteArray94);
		this.anInt6833 = arg0.method3203(this.anInt6833);
		if (this.anInt6832 == this.anInt6831) {
			this.anInt6832 = this.anInt6831 = arg0.method3196(this.anInt6832);
		} else {
			this.anInt6832 = arg0.method3196(this.anInt6832);
			this.anInt6831 = arg0.method3196(this.anInt6831);
			if (this.anInt6832 == this.anInt6831) {
				this.anInt6832--;
			}
		}
		return this;
	}
}
