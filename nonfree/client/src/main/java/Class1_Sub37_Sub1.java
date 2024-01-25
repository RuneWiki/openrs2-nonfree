import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class1_Sub37_Sub1 extends Class1_Sub37 {

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "Z")
	public boolean aBoolean560;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
	public int anInt7861;

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "[B")
	public byte[] aByteArray111;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
	public int anInt7862;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
	public int anInt7860;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub37_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7861 = arg0;
		this.aByteArray111 = arg1;
		this.anInt7862 = arg2;
		this.anInt7860 = arg3;
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub37_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7861 = arg0;
		this.aByteArray111 = arg1;
		this.anInt7862 = arg2;
		this.anInt7860 = arg3;
		this.aBoolean560 = arg4;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!bj;)Lclient!ti;")
	public Class1_Sub37_Sub1 method6539(@OriginalArg(0) Class28 arg0) {
		this.aByteArray111 = arg0.method903(this.aByteArray111);
		this.anInt7861 = arg0.method901(this.anInt7861);
		if (this.anInt7862 == this.anInt7860) {
			this.anInt7862 = this.anInt7860 = arg0.method900(this.anInt7862);
		} else {
			this.anInt7862 = arg0.method900(this.anInt7862);
			this.anInt7860 = arg0.method900(this.anInt7860);
			if (this.anInt7862 == this.anInt7860) {
				this.anInt7862--;
			}
		}
		return this;
	}
}
