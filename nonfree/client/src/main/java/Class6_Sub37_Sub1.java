import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public final class Class6_Sub37_Sub1 extends Class6_Sub37 {

	@OriginalMember(owner = "client!ut", name = "n", descriptor = "Z")
	public boolean aBoolean673;

	@OriginalMember(owner = "client!ut", name = "r", descriptor = "I")
	public int anInt9842;

	@OriginalMember(owner = "client!ut", name = "q", descriptor = "[B")
	public byte[] aByteArray111;

	@OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
	public int anInt9841;

	@OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
	public int anInt9840;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(I[BII)V")
	public Class6_Sub37_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9842 = arg0;
		this.aByteArray111 = arg1;
		this.anInt9841 = arg2;
		this.anInt9840 = arg3;
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class6_Sub37_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9842 = arg0;
		this.aByteArray111 = arg1;
		this.anInt9841 = arg2;
		this.anInt9840 = arg3;
		this.aBoolean673 = arg4;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!lk;)Lclient!ut;")
	public Class6_Sub37_Sub1 method8306(@OriginalArg(0) Class194 arg0) {
		this.aByteArray111 = arg0.method5330(this.aByteArray111);
		this.anInt9842 = arg0.method5328(this.anInt9842);
		if (this.anInt9841 == this.anInt9840) {
			this.anInt9841 = this.anInt9840 = arg0.method5326(this.anInt9841);
		} else {
			this.anInt9841 = arg0.method5326(this.anInt9841);
			this.anInt9840 = arg0.method5326(this.anInt9840);
			if (this.anInt9841 == this.anInt9840) {
				this.anInt9841--;
			}
		}
		return this;
	}
}
