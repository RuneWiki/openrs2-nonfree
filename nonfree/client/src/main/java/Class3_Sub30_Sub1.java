import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public final class Class3_Sub30_Sub1 extends Class3_Sub30 {

	@OriginalMember(owner = "client!jda", name = "k", descriptor = "Z")
	public boolean aBoolean313;

	@OriginalMember(owner = "client!jda", name = "l", descriptor = "I")
	public int anInt4763;

	@OriginalMember(owner = "client!jda", name = "i", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!jda", name = "j", descriptor = "I")
	public int anInt4762;

	@OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
	public int anInt4761;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub30_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4763 = arg0;
		this.aByteArray55 = arg1;
		this.anInt4762 = arg2;
		this.anInt4761 = arg3;
	}

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub30_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4763 = arg0;
		this.aByteArray55 = arg1;
		this.anInt4762 = arg2;
		this.anInt4761 = arg3;
		this.aBoolean313 = arg4;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!et;)Lclient!jda;")
	public Class3_Sub30_Sub1 method4292(@OriginalArg(0) Class97 arg0) {
		this.aByteArray55 = arg0.method2570(this.aByteArray55);
		this.anInt4763 = arg0.method2573(this.anInt4763);
		if (this.anInt4762 == this.anInt4761) {
			this.anInt4762 = this.anInt4761 = arg0.method2569(this.anInt4762);
		} else {
			this.anInt4762 = arg0.method2569(this.anInt4762);
			this.anInt4761 = arg0.method2569(this.anInt4761);
			if (this.anInt4762 == this.anInt4761) {
				this.anInt4762--;
			}
		}
		return this;
	}
}
