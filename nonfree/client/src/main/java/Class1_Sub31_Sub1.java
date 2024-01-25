import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public final class Class1_Sub31_Sub1 extends Class1_Sub31 {

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "Z")
	public boolean aBoolean533;

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
	public int anInt5825;

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "[B")
	public byte[] aByteArray84;

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
	public int anInt5827;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
	public int anInt5826;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub31_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5825 = arg0;
		this.aByteArray84 = arg1;
		this.anInt5827 = arg2;
		this.anInt5826 = arg3;
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub31_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5825 = arg0;
		this.aByteArray84 = arg1;
		this.anInt5827 = arg2;
		this.anInt5826 = arg3;
		this.aBoolean533 = arg4;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!qq;)Lclient!uk;")
	public Class1_Sub31_Sub1 method5003(@OriginalArg(0) Class195 arg0) {
		this.aByteArray84 = arg0.method4436(this.aByteArray84);
		this.anInt5825 = arg0.method4434(this.anInt5825);
		if (this.anInt5827 == this.anInt5826) {
			this.anInt5827 = this.anInt5826 = arg0.method4435(this.anInt5827);
		} else {
			this.anInt5827 = arg0.method4435(this.anInt5827);
			this.anInt5826 = arg0.method4435(this.anInt5826);
			if (this.anInt5827 == this.anInt5826) {
				this.anInt5827--;
			}
		}
		return this;
	}
}
