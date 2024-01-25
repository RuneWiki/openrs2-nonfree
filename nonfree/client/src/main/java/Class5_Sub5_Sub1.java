import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public final class Class5_Sub5_Sub1 extends Class5_Sub5 {

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "Z")
	public boolean aBoolean396;

	@OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
	public int anInt5864;

	@OriginalMember(owner = "client!rm", name = "p", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
	public int anInt5863;

	@OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
	public int anInt5862;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(I[BII)V")
	public Class5_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5864 = arg0;
		this.aByteArray74 = arg1;
		this.anInt5863 = arg2;
		this.anInt5862 = arg3;
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class5_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5864 = arg0;
		this.aByteArray74 = arg1;
		this.anInt5863 = arg2;
		this.anInt5862 = arg3;
		this.aBoolean396 = arg4;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!vf;)Lclient!rm;")
	public Class5_Sub5_Sub1 method4649(@OriginalArg(0) Class251 arg0) {
		this.aByteArray74 = arg0.method5655(this.aByteArray74);
		this.anInt5864 = arg0.method5654(this.anInt5864);
		if (this.anInt5863 == this.anInt5862) {
			this.anInt5863 = this.anInt5862 = arg0.method5657(this.anInt5863);
		} else {
			this.anInt5863 = arg0.method5657(this.anInt5863);
			this.anInt5862 = arg0.method5657(this.anInt5862);
			if (this.anInt5863 == this.anInt5862) {
				this.anInt5863--;
			}
		}
		return this;
	}
}
